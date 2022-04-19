package com.service3;

import java.io.IOException;
import java.util.logging.Logger;

import com.service3.service3Grpc.service3ImplBase;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class Service3Server extends service3ImplBase {
	private static final Logger logger = Logger.getLogger(Service3Server.class.getName());
	public static void main(String[] args) {
		Service3Server service3 = new Service3Server();

		int port = 50051;

		try {

			Server server = ServerBuilder.forPort(port)
					.addService(service3)
					.build()
					.start();

			System.out.println("Service 3 server Started, listening on " + port);

			server.awaitTermination();

		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		logger.info("Service 3 server Started, listening on " + port);
	}
	public void Login(authenticateRequest req, StreamObserver<authenticateReply> responseObserver) {
		System.out.println("Receving login request");
		authenticateReply reply = authenticateReply.newBuilder().setMessage("Checking user login details " +req.getLoginDetails()).build();
		responseObserver.onNext(reply);
		responseObserver.onCompleted();
		
	}
	
	
}



