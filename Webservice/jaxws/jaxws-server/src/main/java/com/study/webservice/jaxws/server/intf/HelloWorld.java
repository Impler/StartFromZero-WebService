package com.study.webservice.jaxws.server.intf;

import javax.jws.WebService;

@WebService
public interface HelloWorld {

    String sayHello(String name);
}
