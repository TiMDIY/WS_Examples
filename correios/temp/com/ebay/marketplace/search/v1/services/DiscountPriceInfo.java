
package com.ebay.marketplace.search.v1.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 						This container supplies information for an item that has a Strike-Through Pricing
 * 						(STP) or Minimum Advertised Price (MAP) discount pricing treatment. STP and MAP
 * 						applies to only fixed price, BIN items. STP is available on the US, UK, and DE sites
 * 						while MAP is available only on the US site.
 * 						<br><br>
 * 						This feature is available to qualified sellers who participate in the Discount Pricing
 * 						program. A seller can provide a discount price treatment for Non-MSKU and MSKU items in
 * 						Clothing, Shoes and Accessories (CDA), Motors, and Electronics (Home and Garden is
 * 						expected to be supported in the future).
 * 						<br><br>
 * 						This feature will be available mid-Summer, 2011.
 * 					
 * 
 * <p>Java class for DiscountPriceInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiscountPriceInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="originalRetailPrice" type="{http://www.ebay.com/marketplace/search/v1/services}Amount"/>
 *         &lt;element name="minimumAdvertisedPriceExposure" type="{http://www.ebay.com/marketplace/search/v1/services}MapExposureEnum" minOccurs="0"/>
 *         &lt;element name="pricingTreatment" type="{http://www.ebay.com/marketplace/search/v1/services}PriceTreatmentEnum"/>
 *         &lt;element name="soldOnEbay" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="soldOffEbay" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiscountPriceInfo", propOrder = {
    "originalRetailPrice",
    "minimumAdvertisedPriceExposure",
    "pricingTreatment",
    "soldOnEbay",
    "soldOffEbay"
})
public class DiscountPriceInfo {

    @XmlElement(required = true)
    protected Amount originalRetailPrice;
    protected MapExposureEnum minimumAdvertisedPriceExposure;
    @XmlElement(required = true)
    protected PriceTreatmentEnum pricingTreatment;
    @XmlElement(defaultValue = "false")
    protected Boolean soldOnEbay;
    @XmlElement(defaultValue = "false")
    protected Boolean soldOffEbay;

    /**
     * Gets the value of the originalRetailPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getOriginalRetailPrice() {
        return originalRetailPrice;
    }

    /**
     * Sets the value of the originalRetailPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setOriginalRetailPrice(Amount value) {
        this.originalRetailPrice = value;
    }

    /**
     * Gets the value of the minimumAdvertisedPriceExposure property.
     * 
     * @return
     *     possible object is
     *     {@link MapExposureEnum }
     *     
     */
    public MapExposureEnum getMinimumAdvertisedPriceExposure() {
        return minimumAdvertisedPriceExposure;
    }

    /**
     * Sets the value of the minimumAdvertisedPriceExposure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MapExposureEnum }
     *     
     */
    public void setMinimumAdvertisedPriceExposure(MapExposureEnum value) {
        this.minimumAdvertisedPriceExposure = value;
    }

    /**
     * Gets the value of the pricingTreatment property.
     * 
     * @return
     *     possible object is
     *     {@link PriceTreatmentEnum }
     *     
     */
    public PriceTreatmentEnum getPricingTreatment() {
        return pricingTreatment;
    }

    /**
     * Sets the value of the pricingTreatment property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceTreatmentEnum }
     *     
     */
    public void setPricingTreatment(PriceTreatmentEnum value) {
        this.pricingTreatment = value;
    }

    /**
     * Gets the value of the soldOnEbay property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSoldOnEbay() {
        return soldOnEbay;
    }

    /**
     * Sets the value of the soldOnEbay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSoldOnEbay(Boolean value) {
        this.soldOnEbay = value;
    }

    /**
     * Gets the value of the soldOffEbay property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSoldOffEbay() {
        return soldOffEbay;
    }

    /**
     * Sets the value of the soldOffEbay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSoldOffEbay(Boolean value) {
        this.soldOffEbay = value;
    }

}
