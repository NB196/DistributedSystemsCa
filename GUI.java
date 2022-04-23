package com.service2;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.service2.service2Grpc.service2BlockingStub;
import com.service3.service3Grpc;
import com.service3.service3Grpc.service3BlockingStub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

public class GUI {
	private static service2BlockingStub blockingStub;

	// instance variables lets us use them in more than one method
	private JFrame frame;
	private JTextField textNumber1;
	private JTextField textNumber2;

	/**
	 * Launch the application/ create window.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			// overriding the run method runnable
			public void run() { // creating seperate thread for our GUI window
				try {
					GUI window = new GUI(); // main method creates new GUI object window
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application
	 */

	public GUI() {

		int port = 50051;
		String host = "localhost";

		ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build(); // build channel
																										// for the
																										// client

		blockingStub = service2Grpc.newBlockingStub(channel);

		initialize();
	}

	private void initialize() {
		frame = new JFrame();

		// JFrame is a window with title bar
		frame.setTitle("Service 2: Enable Alarm");

		// setting the bounds
		frame.setBounds(100, 100, 500, 300);

		// when the user closes the GUI, the whole channel is terminated
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// box layout- determines how components are laid out
		BoxLayout bl = new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS);

		frame.getContentPane().setLayout(bl);

		// create panel for service 3
		// if combining more than one service you would have multiple panels(use grid
		// layout)
		JPanel panel_service_2 = new JPanel();
		frame.getContentPane().add(panel_service_2);

		// flow layout for panel- items retain their size
		panel_service_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5)); // control the gaps between components

		// create new label and add it to the panel
		JLabel lblNewLabel_1 = new JLabel("Enable Alarm on App");
		panel_service_2.add(lblNewLabel_1);

		// input textbox
		textNumber1 = new JTextField();

		// add it to the panel
		panel_service_2.add(textNumber1);

		// how wide the input box should be
		textNumber1.setColumns(10);

		// creating second label
		JLabel lblNewLabel_2 = new JLabel("Response from server");
		panel_service_2.add(lblNewLabel_2);

		textNumber2 = new JTextField();
		panel_service_2.add(textNumber2);
		textNumber2.setColumns(10);

		// set up button
		JButton btnLogin = new JButton("Login");

		// add action listener to the button
		btnLogin.addActionListener(new ActionListener() {

			//lifting the streaming code from the client
			@Override
			public void actionPerformed(ActionEvent e) {

				// retrieve data from GUI
				String enableAlarm = textNumber1.getText();
				String response = textNumber2.getText();

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
				service2BlockingStub asyncStub = new service2BlockingStub();
				StreamObserver<Msg> requestObserver = asyncStub.enableAlarmOnApp(responseObserver);

				requestObserver.onNext(
						Msg.newBuilder().setTrue(1).setMsg("Alarm enabled in living room successfully").build());

			}

		});
	}
}
