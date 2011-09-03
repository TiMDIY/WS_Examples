
package com.ebay.marketplace.search.v1.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * 
 * 						Defines the image URL returned in galleryInfoContainer.
 * 					
 * 
 * <p>Java class for GalleryURL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GalleryURL">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>anyURI">
 *       &lt;attribute name="gallerySize" use="required" type="{http://www.ebay.com/marketplace/search/v1/services}GallerySizeEnum" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GalleryURL", propOrder = {
    "value"
})
public class GalleryURL {

    @XmlValue
    @XmlSchemaType(name = "anyURI")
    protected String value;
    @XmlAttribute(required = true)
    protected GallerySizeEnum gallerySize;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the gallerySize property.
     * 
     * @return
     *     possible object is
     *     {@link GallerySizeEnum }
     *     
     */
    public GallerySizeEnum getGallerySize() {
        return gallerySize;
    }

    /**
     * Sets the value of the gallerySize property.
     * 
     * @param value
     *     allowed object is
     *     {@link GallerySizeEnum }
     *     
     */
    public void setGallerySize(GallerySizeEnum value) {
        this.gallerySize = value;
    }

}
