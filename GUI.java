package com.service1;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.service1.service1Grpc.service1BlockingStub;
import com.service1.service1Grpc.service1Stub;
import com.service3.service3Grpc;

import io.grpc.Channel;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

public class GUI implements ActionListener {

	private static service1BlockingStub blockingStub;

	// instance variables lets us use them in more than one method
	private JFrame frame;
	private JTextField textNumber1;
	private JTextField textNumber2;
	private JTextField checkB;
	private JTextField alarm;
	private JTextField breachResponse;
	private JTextField SendAlarmSystemStatus;
	private JTextField statusResponse;
	private JTextArea textResponse;
	private JTextField entry1, reply1;
	private JTextField entry2, reply2;
	private JTextField entry3, reply3;
	private JTextField entry4, reply4;

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

		blockingStub = service1Grpc.newBlockingStub(channel);

		initialize();
	}

	private void initialize() {
		frame = new JFrame();

		// JFrame is a window with title bar
		frame.setTitle("Service 1: Disarm Alarm");

		// setting the bounds
		frame.setBounds(100, 100, 500, 300);

		// when the user closes the GUI, the whole channel is terminated
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// box layout- determines how components are laid out
		BoxLayout bl = new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS);

		frame.getContentPane().setLayout(bl);

		// create panel for service 1 login method
		// if combining more than one service you would have multiple panels(use grid
		// layout)
		JPanel panel_service_1 = new JPanel();
		frame.getContentPane().add(panel_service_1);

		// flow layout for panel- items retain their size
		panel_service_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5)); // control the gaps between components

		// create new label and add it to the panel
		JLabel lblNewLabel_1 = new JLabel("Username");
		panel_service_1.add(lblNewLabel_1);

		// input textbox
		textNumber1 = new JTextField();

		// add it to the panel
		panel_service_1.add(textNumber1);

		// how wide the input box should be
		textNumber1.setColumns(10);

		// creating second label
		JLabel lblNewLabel_2 = new JLabel("Password");
		panel_service_1.add(lblNewLabel_2);

		textNumber2 = new JTextField();
		panel_service_1.add(textNumber2);
		textNumber2.setColumns(10);

		// set up button
		JButton loginBtn = new JButton("Login");

		// end of panel 1

		// start of panel 2 for check breaches service
		JPanel panel_service_2 = new JPanel();
		frame.getContentPane().add(panel_service_2);
		panel_service_2.setLayout(new FlowLayout(FlowLayout.CENTER, 2, 5));
		JLabel lblNewLabel_21 = new JLabel("Check Breaches");
		panel_service_2.add(lblNewLabel_21);
		checkB = new JTextField();
		panel_service_2.add(checkB);
		checkB.setColumns(10);

		// check breach response
		frame.getContentPane().add(panel_service_2);
		panel_service_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		JLabel lblNewLabel_12 = new JLabel("List of breaches");
		panel_service_2.add(lblNewLabel_12);
		breachResponse = new JTextField();
		panel_service_2.add(breachResponse);
		breachResponse.setColumns(10);
		
		// set up button
		JButton breachBtn = new JButton("Get Breaches");

		// start of panel 3 for SendAlarmSystemStatus service
		JPanel panel_service_3 = new JPanel();
		frame.getContentPane().add(panel_service_3);
		panel_service_3.setLayout(new FlowLayout(FlowLayout.CENTER));
		//JLabel lblNewLabel_3 = new JLabel("Get Alarm System Status");
		//panel_service_3.add(lblNewLabel_3);
//		alarm = new JTextField();
//		panel_service_2.add(alarm);
//		alarm.setColumns(10);
		
		frame.getContentPane().add(panel_service_2);
		panel_service_2.setLayout(new FlowLayout(FlowLayout.CENTER));
		JLabel lblNewLabel_4 = new JLabel("Alarm Status");
		panel_service_2.add(lblNewLabel_4);
		statusResponse = new JTextField();
		panel_service_2.add(statusResponse);
		statusResponse.setColumns(10);
		
		// add button here to send the status
		JButton btnStatus = new JButton("Get alarm status");

	
		// for the login button
		// add action listener to the button
		loginBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				containsString loginMsg = containsString.newBuilder()
						.setFirstString("Client enters username and password").build();

				containsString cString = containsString.newBuilder().setFirstString("Test").build();

				newResponse nResp = newResponse.newBuilder().setFirstInt(5).build();

				Channel newChannel = null;
				// blocking stub is used for binary. The client is blocked until the server
				// comes back.
				service1BlockingStub bstub = service1Grpc.newBlockingStub(newChannel); // the channel is the connection
																						// between the client and server

				// async stub (this stub is not blocked, so we can do streaming here) - used for
				// client streaming and bi directional
				service1Stub asyncStub = service1Grpc.newStub(newChannel); // the channel is the connection between the
																			// client and server

				// calling unary rpc - login method
				containsString response = bstub.login(loginMsg);

				// calling unary rpc- tempature method
				newResponse newResponse = bstub.getFirstInt(cString);

				// streaming- since it is streaming using bstub we are using iterator
				Iterator<containsString> responses = bstub.getAlarmBreaches(cString);

				while (responses.hasNext()) { // using while loop to iterate through the stream of responses
					containsString individualResponse = responses.next();
					System.out.println(individualResponse.getFirstString());
				}

				// test if working
				System.out.println(response.getFirstString());

				System.out.println(newResponse.getFirstInt());

				// client streaming

				// for incoming messages a stream observer is needed
				StreamObserver<containsString> responseObserver = new StreamObserver<containsString>() {

					@Override
					public void onNext(com.service1.containsString value) {
						System.out.println("Check alarm system status for kitchen " + value.getFirstString());
					}

					@Override // error handling
					public void onError(Throwable t) {

					}

					@Override
					public void onCompleted() {

					}
				};

				// sending more outgoing messages from client
				StreamObserver<containsString> requestObserver = asyncStub.sendAlarmSystemStatus(responseObserver);

				// build up the client messages with request observer
				requestObserver
						.onNext(containsString.newBuilder().setFirstString("Send alarm status for kitchen").build());
				requestObserver
						.onNext(containsString.newBuilder().setFirstString("Send alarm status for shed").build());

			}
		});
		
		
		//add buttons
	
		//login
		panel_service_1.add(loginBtn);
		
		
		//check breaches
		panel_service_1.add(breachBtn );
		
		//send alarm status
		panel_service_1.add(btnStatus);
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton)e.getSource();
		String label = button.getActionCommand();  

		
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();
		service1Grpc.service1BlockingStub blockingStub = service1Grpc.newBlockingStub(channel);
		
		//preparing to send message
		com.service1.containsString req = com.service1.containsString.newBuilder().setFirstString(entry1.getText()).build();
		
		//retrieving reply from service
		com.service1.newResponse resp = blockingStub.getFirstInt(req);
		
	} 
}
