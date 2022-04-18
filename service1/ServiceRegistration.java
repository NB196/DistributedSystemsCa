package com.service1;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

//this is the server
public class ServiceRegistration {

	public void run(int port, String service_type, String service_name) {

		// create jMDNS instance

		// specify local host
		try {
			JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());

			// registering grpc server
			int service_port = port;
			String service_desc = "Disarm alarm service";

			// create service info and use factory method to create object
			ServiceInfo serviceInfo = ServiceInfo.create(service_type, service_name, service_port, service_desc);

			// now we need to register the service
			jmdns.registerService(serviceInfo);

			System.out.printf("jmDNS: registering service with type: %s and name: %s on port %d ", service_type,
					service_name, service_port);

			// sleep for 10 seconds
			Thread.sleep(10000);
			System.out.println("\njmDNS: Disarm Alarm Service Registered");


		} catch (UnknownHostException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
