
package com.ebay.marketplace.search.v1.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 						This is the base class container for all service operation requests.
 * 					
 * 
 * <p>Java class for BaseServiceRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseServiceRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseServiceRequest")
@XmlSeeAlso({
    GetVersionRequest.class,
    GetHistogramsRequest.class,
    FindItemsForFavoriteSearchRequest.class,
    GetSearchKeywordsRecommendationRequest.class,
    BestMatchFindingServiceRequest.class
})
public abstract class BaseServiceRequest {


}
