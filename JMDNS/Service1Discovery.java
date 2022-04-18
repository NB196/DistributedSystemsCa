package JMDNS;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceInfo;
import javax.jmdns.ServiceListener;

public class Service1Discovery {

	private static class Service1Listener implements ServiceListener {

		// the first event is that the server is added
		@Override
		public void serviceAdded(ServiceEvent event) {
			System.out.println("Service Added " + event.getInfo());

		}

		// service is removed
		@Override
		public void serviceRemoved(ServiceEvent event) {
			System.out.println("Service Removed " + event.getInfo());

		}

		// next event is resolved
		// this is required in order to populate the service info object
		@Override
		public void serviceResolved(ServiceEvent event) {
			System.out.println("Service Resolved " + event.getInfo());

			ServiceInfo serviceInfo = event.getInfo();
			System.out.println("host " + serviceInfo.getHostAddress());
			System.out.println("port " + serviceInfo.getPort());
			System.out.println("type " + serviceInfo.getType());
			System.out.println("name " + serviceInfo.getName());
			System.out.println("Computername " + serviceInfo.getServer());
			System.out.println("desc/properties " + serviceInfo.getNiceTextString());

		}
	}

	public static void main(String[] args) {
		// get instance of jmDNS

		// put in a try catch block
		try {
			JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());

			// will discover the service based on service type
			String service_type = "_grpc._tcp.local";

			// need to listen for services added/removed etc. the client needs to do this
			// jmdns.addServiceListener(service_type, new MyServiceListener()); //listen for
			// specified type
			jmdns.addServiceListener("_grpc._tcp.local.", new Service1Listener());

			// sleep for 10 seconds
			Thread.sleep(10000);

			jmdns.close();

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
