package com.service2;

import java.io.IOException;

import com.service2.service2Grpc.service2ImplBase;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class Service2Server extends service2ImplBase {

	public static void main(String[] args) {
		// create instance of server
		Service2Server service2 = new Service2Server();

		// specify port
		int port = 50051;

		try {
			Server server = ServerBuilder.forPort(port).addService(service2).build().start();

			System.out.println("Server (Enable Alarm service) started, listening on " + port);

			server.awaitTermination();
		} catch (IOException e) {
			e.printStackTrace();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	// bi-directional- enableAlarmOnSmartApp
	public StreamObserver<Msg> enableAlarmOnApp(StreamObserver<Response> responseObserver) {
		return new StreamObserver<Msg>() {

			@Override // the messages being sent from client to server
			public void onNext(Msg value) {
				System.out.println("Enable alarm for attic window");

				// build up message
				//if server enables alarm via the app successfully, it will send back 1 for true
				String alarmEnabledSuccessfully = Integer.toString(Integer.parseInt(value.getMsg(), value.getTrue()));
				
				//if server cannot enable alarm via the app, it will send back 2 to the client for false
				String alarmNotEnabled= Integer.toString(Integer.parseInt(value.getMsg(), value.getFalse()));

				//in this case, the server can enable alarm successfully and server will build this message up
				Response reply = Response.newBuilder().setMsg(alarmEnabledSuccessfully).build();
				
				responseObserver.onNext(reply);

			}

			@Override
			public void onError(Throwable t) {
				System.out.println("Error while reading message stream");
				t.printStackTrace();

			}

			@Override
			public void onCompleted() {
				System.out.println("Server is finished enabling alarm");


			// completed too
			responseObserver.onCompleted();
			}
		
		};
	}

}
