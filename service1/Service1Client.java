package com.service1;


import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import com.service1.service1Grpc.service1BlockingStub;
import com.service1.service1Grpc.service1Stub;


import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

public class Service1Client {
	public static void main(String[] args) throws InterruptedException {
		
		int port = 50051;
		String host = "localhost";
		
		ManagedChannel newChannel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
		
	
		containsString loginMsg  = containsString.newBuilder().setFirstString("Client enters username and password").build();
		
		containsString cString  = containsString.newBuilder().setFirstString("Test").build();
		
		newResponse nResp  = newResponse.newBuilder().setFirstInt(5).build();
		
		//blocking stub is used for binary. The client is blocked until the server comes back.
		service1BlockingStub bstub = service1Grpc.newBlockingStub(newChannel); //the channel is the connection between the client and server
		
		//async stub (this stub is not blocked, so we can do streaming here) - used for client streaming and bi directional
		service1Stub asyncStub = service1Grpc.newStub(newChannel); //the channel is the connection between the client and server
		
		//calling unary rpc - login method
		containsString response = bstub.login(loginMsg); 
		
		//calling unary rpc- tempature method
		newResponse newResponse = bstub.getFirstInt(cString);
		
		//streaming- since it is streaming using bstub we are using iterator
		Iterator<containsString> responses = bstub.getAlarmBreaches(cString);
		
		while(responses.hasNext()) { //using while loop to iterate through the stream of responses
			containsString individualResponse = responses.next();
					System.out.println(individualResponse.getFirstString());
		}
		
		//test if working
		System.out.println(response.getFirstString());
		
		System.out.println(newResponse.getFirstInt());
		
		
		//client streaming
		
		//for incoming messages a stream observer is needed
		StreamObserver<containsString> responseObserver = new StreamObserver<containsString>() {

			@Override
			public void onNext(com.service1.containsString value) {
				System.out.println("Check alarm system status for kitchen " + value.getFirstString());	
			}

			@Override //error handling
			public void onError(Throwable t) {
				
			}

			@Override
			public void onCompleted() {
				
			}
		};
		
		//sending more outgoing messages from client
		StreamObserver<containsString> requestObserver = asyncStub.sendAlarmSystemStatus(responseObserver);
		
		//build up the client messages with request observer
		requestObserver.onNext( containsString.newBuilder().setFirstString("Send alarm status for kitchen").build());
		requestObserver.onNext( containsString.newBuilder().setFirstString("Send alarm status for shed").build());
		
		//letting us know client has finished sending its messages
		System.out.println("Client has now sent its messages");
		
		//when you do on next you need to do on completed
		requestObserver.onCompleted();
		
		//also send it to sleep
		Thread.sleep(5000);
	
		//error  handling- shutting down channel
		newChannel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
		
	}

}
