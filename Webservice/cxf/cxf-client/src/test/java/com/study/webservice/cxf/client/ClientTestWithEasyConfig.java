package com.study.webservice.cxf.client;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.study.webservice.cxf.sei.HelloWorld;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:beans-ws-client-easy-config.xml")
public class ClientTestWithEasyConfig {

    @Autowired
    private HelloWorld helloWorld;
    
    @Test
    public void test() {
        String msg = helloWorld.sayHello("Tom");
        System.out.println("******** client receive>>" + msg);
    }

}
