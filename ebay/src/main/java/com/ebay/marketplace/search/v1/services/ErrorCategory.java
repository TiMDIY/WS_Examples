
package com.ebay.marketplace.search.v1.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ErrorCategory.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ErrorCategory">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="System"/>
 *     &lt;enumeration value="Application"/>
 *     &lt;enumeration value="Request"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ErrorCategory")
@XmlEnum
public enum ErrorCategory {


    /**
     * 
     * 								Indicates that an error has occurred on the eBay system side. For
     * 								example, a database or server could be down. Inspect the error message to
     * 								find the cause of the problem. If the problem is on the eBay side, an
     * 								application can retry the request as-is a reasonable number of times
     * 								(eBay recommends twice). If the error persists, contact Developer
     * 								Technical Support. Once the problem has been resolved, the request may be
     * 								resent in its original form.
     * 							
     * 
     */
    @XmlEnumValue("System")
    SYSTEM("System"),

    /**
     * 
     * 								An error occurred due to a problem with the request, with the most likely
     * 								source being the application sending the request. For example, the
     * 								request is missing a required data element or it contains an invalid
     * 								field. The problem must be corrected before the request can be resent.
     * 								Inspect the error message to find the cause of the problem. If the
     * 								problem is due to an application error, modify the application and resend
     * 								the request. If the error is due to invalid data, the source of the data
     * 								must be corrected before you resend the resend request to eBay.
     * 							
     * 
     */
    @XmlEnumValue("Application")
    APPLICATION("Application"),

    /**
     * 
     * 								An error occurred due to a problem with the request, with the most likely
     * 								source being missing or invalid data in the request. The problem must be
     * 								corrected before the request can be retried. Inspect the error message to
     * 								find the cause of the problem. If the problem is a result of end-user
     * 								data, alert the end-user to the problem and provide the means for them to
     * 								correct the problem. Once the problem is resolved, resend the request to
     * 								eBay.
     * 							
     * 
     */
    @XmlEnumValue("Request")
    REQUEST("Request");
    private final String value;

    ErrorCategory(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ErrorCategory fromValue(String v) {
        for (ErrorCategory c: ErrorCategory.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
