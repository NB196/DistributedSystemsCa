package JMDNS;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

public class Service3Registration {
	public static void main(String[] args) {

		// get a jMDNS instance
		try {
			JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());

			/*
			 * service information
			 */

			// the assumption is that we are registering a grpc server
			String service_type = "_grpc._tcp.local."; // service-type.domain
			// service_name + service_type => simple_http._tcp.local
			String service_name = "GrpcServer";
			int service_port = 50051;
			String service_desc = "Service 3 (Manage Security Footage) Registration";

			// Create ServiceInfo -
			// use the factory method to create the object
			ServiceInfo serviceInfo = ServiceInfo.create(service_type, service_name, service_port, service_desc);

			/*
			 * register the service
			 */

			jmdns.registerService(serviceInfo);

			System.out.printf("registering service with type: %s and name: %s on port %d ", service_type, service_name,
					service_port);

			// sleep for 10 seconds
			Thread.sleep(10000);

		} catch (UnknownHostException e) {
		
			e.printStackTrace();
		} catch (IOException e) {
	
			e.printStackTrace();
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}

	}

}

