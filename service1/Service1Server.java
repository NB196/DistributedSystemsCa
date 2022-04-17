package com.service1;

import java.io.IOException;

import com.service1.service1Grpc.service1ImplBase;


import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class Service1Server {
	private Server server; 
	public static void main(String[] args) throws IOException, InterruptedException {

		Service1Server ourServer = new Service1Server();
		ourServer.start();
	}

	// start method
	private void start() throws IOException, InterruptedException { // throw exception from the method.
		// print out at any important method.
		System.out.println("gRPC server is now running");
		int port = 50051;
		
		//creating the server object using builder.
		server = ServerBuilder.forPort(port).addService(new Service1ServerImpl()).build().start(); 
	
		System.out.println("The server is running on port " + port);

		//telling server it should keep running until we tell it to terminate.
		server.awaitTermination();
		
	}
	//implement the code for our server in a new class.
	//the class extends the abstract base class of my own implementation. 
	static class Service1ServerImpl extends service1ImplBase{
		
		//unary- client wants to login, server responds whether they were authenticated correctly or not
		public void Login(containsString request, StreamObserver<containsString> responseObserver) {
			//finding out what message the client has sent the server
			String msg = request.getFirstString();
			System.out.println("Message from server: Logged in successfully : " + msg);
			
			//build the server response
			containsString.Builder responseBuilder = containsString.newBuilder();
			
			responseBuilder.setFirstString("Message from server: Logged in successfully : " + msg);
			
			//stream observer is an object that processes messages
			responseObserver.onNext(responseBuilder.build());
			
			//tell server stream that its finished
			responseObserver.onCompleted();
			
		}
		//set room temperature
		@Override 
		public void getFirstInt(containsString request, StreamObserver<newResponse> responseObserver ) {
			String firstString = request.getFirstString();
			
			//The server asks the client what temperature they would like to set the living room to
			System.out.println("Please select room temperature : " + firstString);
			
			newResponse.Builder responseBuilder = newResponse.newBuilder();
			
			//setting the room temperature to be 25 degrees
			responseBuilder.setFirstInt(25); 
			
			responseObserver.onNext(responseBuilder.build());
			
			//telling server we are finished sending messages
			responseObserver.onCompleted();
		
		}
		
		//streaming server method
		//check breaches- client wants to check for alarm breaches and server sends response back
		@Override
		public void getAlarmBreaches(containsString request, StreamObserver<containsString> responseObserver ) {
		
			//finding out what the client has sent to the server
			String firstString = request.getFirstString();
			System.out.println("Client has sent this message to the server: " + firstString);
			
			
			//build up server response
			containsString.Builder responseBuilder = containsString.newBuilder();
			
			//first message from server
			responseBuilder.setFirstString("Server Streaming: There is an alarm breach. Area: attic window: " +firstString); //setting first string method
			
			//for streaming we need more onNext- each onNext is a new message
			responseObserver.onNext(responseBuilder.build());
			
			
			//later message
			responseBuilder.setFirstString("Server Streaming: There is an alarm breach. Area: back door " +firstString); //setting first string method
			responseObserver.onNext(responseBuilder.build());//need to build up the message each time
			
			//now tell stream server we are finished
			responseObserver.onCompleted();
		
		}
		
		//client streaming
		
		//creating our own stream observers here
		//since we are the server, we are getting a stream of messages from the client
		//we need to implement a stream observer for the incoming messages
		
		public StreamObserver<containsString> SendAlarmSystemStatus(StreamObserver<containsString> responseObserver){
			System.out.println("On the server; inside the client streaming method"); //putting a print out here will tell us if our client got this far
			return new StreamObserver<containsString> () {

				@Override //onNext is the actual messages being sent from the client to the server
				public void onNext(containsString value) {
					System.out.println("Send alarm status for the kitchen");
					System.out.println("Send alarm status for the shed");
				}

				@Override //this is error handling- gracefully handles any errors
				public void onError(Throwable t) {
					
				}

				@Override //this tells the server, when the client is finished sending messages
				public void onCompleted() {
					
					//build up the message
					containsString.Builder responseBuilder = containsString.newBuilder();
					
					//server sending messages back to client
					responseBuilder.setFirstString("Alarm breach in kitchen on 3/4/2019 at 03.30am");
					responseBuilder.setFirstString("Alarm zone in shed is secure. There has been zero breaches.");
					
					//stream observer is an object that processes the stream of messages coming in and out
					responseObserver.onNext(responseBuilder.build());
					
					//now tell stream server we are finished
					responseObserver.onCompleted();
					
				}
				
			};
			
		}
		
	}
}





