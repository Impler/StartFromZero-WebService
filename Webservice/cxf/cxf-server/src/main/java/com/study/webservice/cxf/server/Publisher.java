package com.study.webservice.cxf.server;

import javax.xml.ws.Endpoint;

import com.study.webservice.cxf.server.impl.HelloWorldImpl;
import com.study.webservice.cxf.server.intf.HelloWorld;

public class Publisher {

    public static void main(String[] args) {
        HelloWorld implementor = new HelloWorldImpl();
        Endpoint.publish("http://localhost:8090/services/hello", implementor);
        System.out.println("start successfully");
    }
}
