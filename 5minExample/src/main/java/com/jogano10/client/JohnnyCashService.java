
package com.jogano10.client;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "JohnnyCashService", targetNamespace = "http://server.jogano10.com/", wsdlLocation = "http://localhost:8080/WS/Singer?wsdl")
public class JohnnyCashService
    extends Service
{

    private final static URL JOHNNYCASHSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(com.jogano10.client.JohnnyCashService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = com.jogano10.client.JohnnyCashService.class.getResource(".");
            url = new URL(baseUrl, "http://localhost:8080/WS/Singer?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://localhost:8080/WS/Singer?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        JOHNNYCASHSERVICE_WSDL_LOCATION = url;
    }

    public JohnnyCashService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public JohnnyCashService() {
        super(JOHNNYCASHSERVICE_WSDL_LOCATION, new QName("http://server.jogano10.com/", "JohnnyCashService"));
    }

    /**
     * 
     * @return
     *     returns Singer
     */
    @WebEndpoint(name = "JohnnyCashPort")
    public Singer getJohnnyCashPort() {
        return super.getPort(new QName("http://server.jogano10.com/", "JohnnyCashPort"), Singer.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Singer
     */
    @WebEndpoint(name = "JohnnyCashPort")
    public Singer getJohnnyCashPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://server.jogano10.com/", "JohnnyCashPort"), Singer.class, features);
    }

}