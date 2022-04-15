package com.service1;


import com.service1.service1Grpc.service1BlockingStub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class Service1Client {
	public static void main(String[] args) throws InterruptedException {
		
		int port = 50051;
		String host = "localhost";
		
		ManagedChannel newChannel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
		
		
		containsString loginMsg  = containsString.newBuilder().setFirstString("Client enters username and password").build();
		
		newResponse nResp  = newResponse.newBuilder().setFirstInt(5).build();
		
		//blocking stub is used for binary. The client is blocked until the server comes back.
		service1BlockingStub bstub = service1Grpc.newBlockingStub(newChannel); //the channel is the connection between the client and server
		
		containsString response = bstub.login(loginMsg); 
		
		//test if working
		System.out.println(response.getFirstString());
	}

}
