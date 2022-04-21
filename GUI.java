package com.service3;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.service3.service3Grpc.service3BlockingStub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GUI {

	private static service3BlockingStub blockingStub;

	// instance variables lets us use them in more than one method
	private JFrame frame;
	private JTextField textNumber1;
	private JTextField textNumber2;
	private JTextArea textResponse;

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

		blockingStub = service3Grpc.newBlockingStub(channel);

		initialize();
	}

	private void initialize() {
		frame = new JFrame();

		// JFrame is a window with title bar
		frame.setTitle("Service 3: Manage Security Footage");

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
		JPanel panel_service_3 = new JPanel();
		frame.getContentPane().add(panel_service_3);

		// flow layout for panel- items retain their size
		panel_service_3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5)); // control the gaps between components

		// create new label and add it to the panel
		JLabel lblNewLabel_1 = new JLabel("Username");
		panel_service_3.add(lblNewLabel_1);

		// input textbox
		textNumber1 = new JTextField();

		// add it to the panel
		panel_service_3.add(textNumber1);

		// how wide the input box should be
		textNumber1.setColumns(10);

		// creating second label
		JLabel lblNewLabel_2 = new JLabel("Password");
		panel_service_3.add(lblNewLabel_2);

		textNumber2 = new JTextField();
		panel_service_3.add(textNumber2);
		textNumber2.setColumns(10);

//		String[] ops = new String[] { "Login" };
//
//		// create combobox and add to panel
//		JComboBox comboOperation = new JComboBox();
//		comboOperation.setModel(new DefaultComboBoxModel(ops));
//		panel_service_3.add(comboOperation);

		// set up button
		JButton btnSend = new JButton("Login");

		// add action listener to the button
		btnSend.addActionListener(new ActionListener() {

			// This method will be called when the button is clicked
			@Override
			public void actionPerformed(ActionEvent e) {

				// retrieve data from GUI
				String username = textNumber1.getText();
				String password = textNumber2.getText();

				// do some logic with the index and send it over
				// int index = comboOperation.getSelectedIndex();

				// grpc - call the server from inside the button code

				String loginDetails = "Username: John Doe, Password: 12345";
				authenticateRequest request = authenticateRequest.newBuilder().setLoginDetails(loginDetails).build();
				authenticateReply response = blockingStub.login(request);

				System.out.println("Trying to authenticate: " + request.getLoginDetails());
				
				//populate JTextArea 
				textResponse.append("You are logged in");
			}
		}); 
		
		//add button
		panel_service_3.add(btnSend);
		
		textResponse = new JTextArea(3, 20);
		textResponse .setLineWrap(true);
		textResponse .setWrapStyleWord(true);
		
		//JScrollPane scrollPane = new JScrollPane(textResponse);
		
		//panel_service_3.add(scrollPane);
	}
}
