package com.study.ws.cxf._01helloworld;

import javax.xml.ws.Endpoint;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldTest {

	private static final String ADDRESS = "http://localhost:8080/WS-CXF/services/helloWorld?wsdl";

	@Test
	public void testByJettyWithoutWebContainer() {
		Endpoint.publish(ADDRESS, new HelloWorldImpl());
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(HelloWorld.class);
		factory.setAddress(ADDRESS);
		HelloWorld client = (HelloWorld) factory.create();
		System.out.println(client.sayHi("jack"));
	}

	@Test
	public void testByWebContainer() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"config/client-helloworld.xml");
		HelloWorld client = (HelloWorld) context.getBean("helloClient");
		String response = client.sayHi("Joe");
		System.out.println("Response: " + response);
		context.close();
	}

}
