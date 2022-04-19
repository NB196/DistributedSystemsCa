package com.service3;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import com.service3.service3Grpc.service3BlockingStub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;


public class Service3Client {
	
	//client should pass message and login method
	private static final Logger logger = Logger.getLogger(Service3Client.class.getName());
	
	
	public static void main(String[] args) throws Exception {
		String host = "localhost";
		int port = 50051;
		ManagedChannel channel = ManagedChannelBuilder.forAddress(host,port).usePlaintext().build(); //build channel for the client
		service3BlockingStub blockingStub = service3Grpc.newBlockingStub(channel);
		Service3Client client = new Service3Client();
		
		//in server you are building the reply
				try {
					String loginDetails = "Username: John Doe, Password: 12345" ;//client expecting string and parameter called name
					authenticateRequest request = authenticateRequest.newBuilder().setLoginDetails(loginDetails).build(); //building request and passing name var you just created
					authenticateReply response = blockingStub.login(request); //passing to server. channel info. passing request in here
					logger.info("Authentication:" +response.getMessage()); 
				}
				catch(StatusRuntimeException e) {
					e.printStackTrace();
				}
				finally {
					channel.shutdown().awaitTermination(5, TimeUnit.SECONDS); //shutting down channel when everything is done
				}
			}

		}

