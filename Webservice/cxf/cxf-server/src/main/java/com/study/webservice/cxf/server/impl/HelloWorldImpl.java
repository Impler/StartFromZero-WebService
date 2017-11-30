package com.study.webservice.cxf.server.impl;

import javax.jws.WebService;

import com.study.webservice.cxf.server.intf.HelloWorld;

@WebService(endpointInterface="com.study.webservice.cxf.server.intf.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    @Override
    public String sayHello(String name) {
        System.out.println("receive>>" + name);
        return "hello, " + name;
    }

}
