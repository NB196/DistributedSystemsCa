package com.service2;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceInfo;
import javax.jmdns.ServiceListener;

public class Service2Discovery {
	private int port;
	private String host;

	private static class Service2Listener implements ServiceListener {

		private int port;
		private String host;
		private ServiceInfo serviceInfo;

		@Override
		public void serviceAdded(ServiceEvent event) {
			System.out.println("\nService 1 Added: Enable Alarm  " + event.getInfo());

		}

		@Override
		public void serviceRemoved(ServiceEvent event) {
			System.out.println("Service 1 Removed: Enable Alarm  " + event.getInfo());

		}

		@Override
		public void serviceResolved(ServiceEvent event) {

			System.out.println("Service Resolved " + event.getInfo());

			ServiceInfo serviceInfo = event.getInfo();
			this.setServiceInfo(serviceInfo);
			System.out.println("host " + serviceInfo.getHostAddress());
			System.out.println("port " + serviceInfo.getPort());
			this.setPort(serviceInfo.getPort());
			System.out.println("type " + serviceInfo.getType());
			System.out.println("name " + serviceInfo.getName());
			System.out.println("Computername " + serviceInfo.getServer());
			System.out.println("desc/properties " + serviceInfo.getNiceTextString());

		}

		public int getPort() {
			return port;
		}

		public void setPort(int port) {
			this.port = port;
		}

		public ServiceInfo getServiceInfo() {
			return serviceInfo;
		}

		public void setServiceInfo(ServiceInfo serviceInfo) {
			this.serviceInfo = serviceInfo;
		}

	}

	public static ServiceInfo run(String service_type) {
		int port = 0;
		ServiceInfo serviceInfo = null;
		// get an instance of jmDNS

		try {
			JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());

			// will discover the service based on service type
			// String service_type = "_grpc._tcp.local";

			// need to listen for services added/removed etc.

			// specified type
			Service2Listener msl = new Service2Listener();
			jmdns.addServiceListener(service_type, msl);

			// sleep for 10 seconds
			Thread.sleep(10000);

			serviceInfo = msl.getServiceInfo();
			port = msl.getPort();
			System.out.println("This is the port retreived from jmDNS: " + port);

			jmdns.close();

		} catch (UnknownHostException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();

		} catch (InterruptedException e) {
			e.printStackTrace();

		}
		return serviceInfo;

	}

}
