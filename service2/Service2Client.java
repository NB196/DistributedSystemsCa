package com.service2;

import java.util.Random;

import com.service2.service2Grpc.service2BlockingStub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

public class Service2Client {

	// we need aysnc stub for bi directional
	private static service2BlockingStub asyncStub;

	public static void main(String[] args) {

		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();

		// stubs
		asyncStub = service2Grpc.newBlockingStub(channel);

		// calling enableAlarmOnApp method
		enableAlarmOnApp();

	}

	public static void enableAlarmOnApp() {
		StreamObserver<Response> responseObserver = new StreamObserver<Response>() {

			@Override
			public void onNext(Response value) {
				System.out.println("Recieving clarification from server " + value.getMsg());

			}

			@Override
			public void onError(Throwable t) {
				t.printStackTrace();

			}

			@Override
			public void onCompleted() {
				System.out.println("Stream is completed");

			}
		};

		StreamObserver<Msg> requestObserver = asyncStub.enableAlarmOnApp(responseObserver);
		try {

			requestObserver
					.onNext(Msg.newBuilder().setTrue(1).setMsg("Alarm enabled in living room successfully").build());

			// Mark the end of requests
			requestObserver.onCompleted();

			// Sleep for a bit before sending the next one.
			Thread.sleep(new Random().nextInt(1000) + 500);

			// error handling
		} catch (RuntimeException e) {
			e.printStackTrace();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		try {
			Thread.sleep(15000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
