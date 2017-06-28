package com.study.ws.cxf._01helloworld;

import javax.jws.WebService;

@WebService
public interface HelloWorld {
	public String sayHi(String name);
}
