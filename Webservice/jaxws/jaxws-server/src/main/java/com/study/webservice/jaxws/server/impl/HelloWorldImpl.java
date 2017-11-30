package com.study.webservice.jaxws.server.impl;

import javax.jws.WebService;

import com.study.webservice.jaxws.server.intf.HelloWorld;


@WebService(endpointInterface="com.study.webservice.jaxws.server.intf.HelloWorld", serviceName="HelloWorld")
public class HelloWorldImpl implements HelloWorld{

    @Override
    public String sayHello(String name) {
        System.out.println(">>receive:" + name);
        return "hello, " + name;
    }

}
