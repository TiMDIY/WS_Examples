
package com.jogano10.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.jogano10 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SingResponse_QNAME = new QName("http://server.jogano10.com/", "singResponse");
    private final static QName _Sing_QNAME = new QName("http://server.jogano10.com/", "sing");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.jogano10
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Sing }
     * 
     */
    public Sing createSing() {
        return new Sing();
    }

    /**
     * Create an instance of {@link SingResponse }
     * 
     */
    public SingResponse createSingResponse() {
        return new SingResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.jogano10.com/", name = "singResponse")
    public JAXBElement<SingResponse> createSingResponse(SingResponse value) {
        return new JAXBElement<SingResponse>(_SingResponse_QNAME, SingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Sing }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.jogano10.com/", name = "sing")
    public JAXBElement<Sing> createSing(Sing value) {
        return new JAXBElement<Sing>(_Sing_QNAME, Sing.class, null, value);
    }

}
