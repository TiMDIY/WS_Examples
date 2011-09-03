
package com.ebay.marketplace.search.v1.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GallerySizeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GallerySizeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Small"/>
 *     &lt;enumeration value="Medium"/>
 *     &lt;enumeration value="Large"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GallerySizeEnum")
@XmlEnum
public enum GallerySizeEnum {


    /**
     * 
     * 								Small sized thumbnail image. Small images are up to 80 pixels on the longest side.
     * 							
     * 
     */
    @XmlEnumValue("Small")
    SMALL("Small"),

    /**
     * 
     * 								Medium sized thumbnail image  Medium images are up to 96 pixels on the longest side.
     * 							
     * 
     */
    @XmlEnumValue("Medium")
    MEDIUM("Medium"),

    /**
     * 
     * 								Large sized thumbnail image. Large images are up to 140 pixels on the longest side.
     * 							
     * 
     */
    @XmlEnumValue("Large")
    LARGE("Large");
    private final String value;

    GallerySizeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GallerySizeEnum fromValue(String v) {
        for (GallerySizeEnum c: GallerySizeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
