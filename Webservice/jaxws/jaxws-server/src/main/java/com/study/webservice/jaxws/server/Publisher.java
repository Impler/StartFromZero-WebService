package com.study.webservice.jaxws.server;

import javax.xml.ws.Endpoint;

import com.study.webservice.jaxws.server.impl.HelloWorldImpl;
import com.study.webservice.jaxws.server.intf.HelloWorld;

public class Publisher {

    public static void main(String[] args) {
       
        HelloWorld implementor = new HelloWorldImpl();
        Endpoint.publish("http://localhost:8080/services/hello", implementor);
        System.out.println("start successfully");

    }

}
