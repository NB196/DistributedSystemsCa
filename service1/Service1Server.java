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

		server = ServerBuilder.forPort(port).addService(new Service1ServerImpl()).build().start(); 
	
		System.out.println("The server is running on port " + port);


		server.awaitTermination();
		
	}
	
	static class Service1ServerImpl extends service1ImplBase{
		
		//unary 
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
		
		
	}

}

