
package com.ebay.marketplace.search.v1.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 						This is the base request container for all Finding Service operations.
 * 					
 * 
 * <p>Java class for BaseFindingServiceRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseFindingServiceRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ebay.com/marketplace/search/v1/services}BestMatchFindingServiceRequest">
 *       &lt;sequence>
 *         &lt;element name="sortOrder" type="{http://www.ebay.com/marketplace/search/v1/services}SortOrderType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseFindingServiceRequest", propOrder = {
    "sortOrder"
})
@XmlSeeAlso({
    FindItemsByKeywordsRequest.class,
    FindCompletedItemsRequest.class,
    FindItemsAdvancedRequest.class,
    FindItemsIneBayStoresRequest.class,
    FindItemsByCategoryRequest.class,
    FindItemsByProductRequest.class
})
public abstract class BaseFindingServiceRequest
    extends BestMatchFindingServiceRequest
{

    protected SortOrderType sortOrder;

    /**
     * Gets the value of the sortOrder property.
     * 
     * @return
     *     possible object is
     *     {@link SortOrderType }
     *     
     */
    public SortOrderType getSortOrder() {
        return sortOrder;
    }

    /**
     * Sets the value of the sortOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link SortOrderType }
     *     
     */
    public void setSortOrder(SortOrderType value) {
        this.sortOrder = value;
    }

}
