
package com.ebay.marketplace.search.v1.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OutputSelectorType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OutputSelectorType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SellerInfo"/>
 *     &lt;enumeration value="StoreInfo"/>
 *     &lt;enumeration value="CategoryHistogram"/>
 *     &lt;enumeration value="AspectHistogram"/>
 *     &lt;enumeration value="ConditionHistogram"/>
 *     &lt;enumeration value="GalleryInfo"/>
 *     &lt;enumeration value="PictureURLSuperSize"/>
 *     &lt;enumeration value="PictureURLLarge"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OutputSelectorType")
@XmlEnum
public enum OutputSelectorType {


    /**
     * 
     * 								Include information about the seller in the response.
     * 							
     * 
     */
    @XmlEnumValue("SellerInfo")
    SELLER_INFO("SellerInfo"),

    /**
     * 
     * 								Include information about the seller's eBay store in the response.
     * 							
     * 
     */
    @XmlEnumValue("StoreInfo")
    STORE_INFO("StoreInfo"),

    /**
     * 
     * 								Include a CategoryHistogram container with information about categories
     * 								that match your search.
     * 							
     * 
     */
    @XmlEnumValue("CategoryHistogram")
    CATEGORY_HISTOGRAM("CategoryHistogram"),

    /**
     * 
     * 								Include an AspectHistogram container with information about aspects from
     * 								the domain that is most relevant to your search.
     * 							
     * 
     */
    @XmlEnumValue("AspectHistogram")
    ASPECT_HISTOGRAM("AspectHistogram"),

    /**
     * 
     * 								Include a ConditionHistogram container with the number of
     * 								items found per condition (e.g., how many items are new).
     * 								This value has no effect when Condition is specified as
     * 								an item filter. Supported for all eBay sites except US eBay Motors,
     * 								India (IN), Malaysia (MY) and Philippines (PH).
     * 							
     * 
     */
    @XmlEnumValue("ConditionHistogram")
    CONDITION_HISTOGRAM("ConditionHistogram"),

    /**
     * 
     * 								Include the GalleryInfoContainer, which contains URLs for three thumbnail
     * 								images of the item in different sizes: large, medium, and small.
     * 							
     * 
     */
    @XmlEnumValue("GalleryInfo")
    GALLERY_INFO("GalleryInfo"),

    /**
     * 
     * 								Include a URL to a picture of the item that is 800x800 pixels in size.
     * 							
     * 
     */
    @XmlEnumValue("PictureURLSuperSize")
    PICTURE_URL_SUPER_SIZE("PictureURLSuperSize"),

    /**
     * 
     * 								Include a URL to a picture of the item that is 400x400 pixels in size.
     * 							
     * 
     */
    @XmlEnumValue("PictureURLLarge")
    PICTURE_URL_LARGE("PictureURLLarge");
    private final String value;

    OutputSelectorType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OutputSelectorType fromValue(String v) {
        for (OutputSelectorType c: OutputSelectorType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
