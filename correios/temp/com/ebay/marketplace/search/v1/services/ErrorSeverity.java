
package com.ebay.marketplace.search.v1.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ErrorSeverity.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ErrorSeverity">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Error"/>
 *     &lt;enumeration value="Warning"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ErrorSeverity")
@XmlEnum
public enum ErrorSeverity {


    /**
     * 
     * 								eBay encountered a fatal error during the processing of the request,
     * 								causing the request to fail. When eBay encounters an error, it returns
     * 								error data instead of the requested business data. Inspect the error
     * 								details and resolve the problem before resubmitting the request.
     * 							
     * 
     */
    @XmlEnumValue("Error")
    ERROR("Error"),

    /**
     * 
     * 								The request was successfully processed, but eBay encountered a non-fatal
     * 								error during the processing that could affect the data returned. For
     * 								example, eBay might have changed the value of an input field. In this
     * 								case, eBay returns a successful response, but it also returns a warning.
     * 								For best results, requests should return without warnings. Inspect the
     * 								warning details and resolve the problem before resubmitting the request.
     * 							
     * 
     */
    @XmlEnumValue("Warning")
    WARNING("Warning");
    private final String value;

    ErrorSeverity(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ErrorSeverity fromValue(String v) {
        for (ErrorSeverity c: ErrorSeverity.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
