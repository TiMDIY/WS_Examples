
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tempuri package. 
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

    private final static QName _CResultado_QNAME = new QName("http://jogano10.com/", "cResultado");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.jogano10
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CalcPrecoPrazo }
     * 
     */
    public CalcPrecoPrazo createCalcPrecoPrazo() {
        return new CalcPrecoPrazo();
    }

    /**
     * Create an instance of {@link CServico }
     * 
     */
    public CServico createCServico() {
        return new CServico();
    }

    /**
     * Create an instance of {@link CResultado }
     * 
     */
    public CResultado createCResultado() {
        return new CResultado();
    }

    /**
     * Create an instance of {@link CalcPrecoPrazoResponse }
     * 
     */
    public CalcPrecoPrazoResponse createCalcPrecoPrazoResponse() {
        return new CalcPrecoPrazoResponse();
    }

    /**
     * Create an instance of {@link ArrayOfCServico }
     * 
     */
    public ArrayOfCServico createArrayOfCServico() {
        return new ArrayOfCServico();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CResultado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jogano10.com/", name = "cResultado")
    public JAXBElement<CResultado> createCResultado(CResultado value) {
        return new JAXBElement<CResultado>(_CResultado_QNAME, CResultado.class, null, value);
    }

}
