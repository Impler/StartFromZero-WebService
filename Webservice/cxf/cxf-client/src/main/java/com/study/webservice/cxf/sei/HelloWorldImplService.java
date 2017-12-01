
package com.study.webservice.cxf.sei;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import com.study.webservice.cxf.sei.HelloWorld;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.0.10
 * Fri Dec 01 16:48:37 CST 2017
 * Generated source version: 2.0.10
 * 
 */

@WebServiceClient(name = "HelloWorldImplService", 
                  wsdlLocation = "http://localhost:8080/cxf-server/services/HelloWorld?wsdl",
                  targetNamespace = "http://impl.server.cxf.webservice.study.com/") 
public class HelloWorldImplService extends Service {

    public final static URL WSDL_LOCATION;
    public final static QName SERVICE = new QName("http://impl.server.cxf.webservice.study.com/", "HelloWorldImplService");
    public final static QName HelloWorldImplPort = new QName("http://impl.server.cxf.webservice.study.com/", "HelloWorldImplPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/cxf-server/services/HelloWorld?wsdl");
        } catch (MalformedURLException e) {
            System.err.println("Can not initialize the default wsdl from http://localhost:8080/cxf-server/services/HelloWorld?wsdl");
            // e.printStackTrace();
        }
        WSDL_LOCATION = url;
    }

    public HelloWorldImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public HelloWorldImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HelloWorldImplService() {
        super(WSDL_LOCATION, SERVICE);
    }

    /**
     * 
     * @return
     *     returns HelloWorldImplPort
     */
    @WebEndpoint(name = "HelloWorldImplPort")
    public HelloWorld getHelloWorldImplPort() {
        return super.getPort(HelloWorldImplPort, HelloWorld.class);
    }

}
