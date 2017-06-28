package com.study.ws.cxf._01helloworld;

import javax.jws.WebService;

@WebService(endpointInterface="com.study.ws.cxf._01helloworld.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

	@Override
	public String sayHi(String name) {
        return "Hello " + name;
	}

}
