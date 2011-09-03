
package com.jogano10.web;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.jogano10.web package. 
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

    private final static QName _CelsiusToFarenheintResponse_QNAME = new QName("http://web.jogano10.com/", "celsiusToFarenheintResponse");
    private final static QName _CelsiusToFarenheint_QNAME = new QName("http://web.jogano10.com/", "celsiusToFarenheint");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.jogano10.web
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CelsiusToFarenheint }
     * 
     */
    public CelsiusToFarenheint createCelsiusToFarenheint() {
        return new CelsiusToFarenheint();
    }

    /**
     * Create an instance of {@link CelsiusToFarenheintResponse }
     * 
     */
    public CelsiusToFarenheintResponse createCelsiusToFarenheintResponse() {
        return new CelsiusToFarenheintResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CelsiusToFarenheintResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.jogano10.com/", name = "celsiusToFarenheintResponse")
    public JAXBElement<CelsiusToFarenheintResponse> createCelsiusToFarenheintResponse(CelsiusToFarenheintResponse value) {
        return new JAXBElement<CelsiusToFarenheintResponse>(_CelsiusToFarenheintResponse_QNAME, CelsiusToFarenheintResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CelsiusToFarenheint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.jogano10.com/", name = "celsiusToFarenheint")
    public JAXBElement<CelsiusToFarenheint> createCelsiusToFarenheint(CelsiusToFarenheint value) {
        return new JAXBElement<CelsiusToFarenheint>(_CelsiusToFarenheint_QNAME, CelsiusToFarenheint.class, null, value);
    }

}
