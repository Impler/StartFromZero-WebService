package com.study.webservice.jaxws.client;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.study.webservice.jaxws.server.impl.HelloWorld;

public class Client {

    public static void main(String[] args) throws MalformedURLException {
        
        String namespace = "http://impl.server.jaxws.webservice.study.com/";
        String localPart = "HelloWorld";
        QName serviceName = new QName(namespace, localPart);
        URL wsdl = new URL("http://172.30.18.109:8080/services/hello?wsdl");
        Service service = Service.create(wsdl , serviceName);
        HelloWorld helloWorld = service.getPort(HelloWorld.class);
        String msg = helloWorld.sayHello("Jack");
        System.out.println(msg);
    }

}
