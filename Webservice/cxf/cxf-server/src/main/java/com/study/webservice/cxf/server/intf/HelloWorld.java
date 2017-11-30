package com.study.webservice.cxf.server.intf;

import javax.jws.WebService;

@WebService
public interface HelloWorld {

    String sayHello(String name);
}
