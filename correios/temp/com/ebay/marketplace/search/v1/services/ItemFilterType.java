
package com.ebay.marketplace.search.v1.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemFilterType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ItemFilterType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Condition"/>
 *     &lt;enumeration value="Currency"/>
 *     &lt;enumeration value="EndTimeFrom"/>
 *     &lt;enumeration value="ModTimeFrom"/>
 *     &lt;enumeration value="EndTimeTo"/>
 *     &lt;enumeration value="ExcludeAutoPay"/>
 *     &lt;enumeration value="BestOfferOnly"/>
 *     &lt;enumeration value="FeaturedOnly"/>
 *     &lt;enumeration value="FeedbackScoreMax"/>
 *     &lt;enumeration value="FeedbackScoreMin"/>
 *     &lt;enumeration value="FreeShippingOnly"/>
 *     &lt;enumeration value="GetItFastOnly"/>
 *     &lt;enumeration value="HideDuplicateItems"/>
 *     &lt;enumeration value="AvailableTo"/>
 *     &lt;enumeration value="LocatedIn"/>
 *     &lt;enumeration value="LocalPickupOnly"/>
 *     &lt;enumeration value="LocalSearchOnly"/>
 *     &lt;enumeration value="ListingType"/>
 *     &lt;enumeration value="LotsOnly"/>
 *     &lt;enumeration value="MaxBids"/>
 *     &lt;enumeration value="MinBids"/>
 *     &lt;enumeration value="MaxPrice"/>
 *     &lt;enumeration value="MinPrice"/>
 *     &lt;enumeration value="PaymentMethod"/>
 *     &lt;enumeration value="MaxQuantity"/>
 *     &lt;enumeration value="MinQuantity"/>
 *     &lt;enumeration value="Seller"/>
 *     &lt;enumeration value="ExcludeSeller"/>
 *     &lt;enumeration value="ExcludeCategory"/>
 *     &lt;enumeration value="WorldOfGoodOnly"/>
 *     &lt;enumeration value="MaxDistance"/>
 *     &lt;enumeration value="SellerBusinessType"/>
 *     &lt;enumeration value="TopRatedSellerOnly"/>
 *     &lt;enumeration value="SoldItemsOnly"/>
 *     &lt;enumeration value="CharityOnly"/>
 *     &lt;enumeration value="ListedIn"/>
 *     &lt;enumeration value="ExpeditedShippingType"/>
 *     &lt;enumeration value="MaxHandlingTime"/>
 *     &lt;enumeration value="ReturnsAcceptedOnly"/>
 *     &lt;enumeration value="ValueBoxInventory"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ItemFilterType")
@XmlEnum
public enum ItemFilterType {


    /**
     * 
     * 								<a name="Condition"></a>
     * 								Limits items to those that have the matching item condition.
     * 								The order of the results depends on the sortOrder you specify
     * 								(not ordered by conditions).
     * 								<br><br>
     * 								Mostly useful to filter items where the seller used one of
     * 								eBay's structured item condition formats (conditionId or
     * 								item specifics) to specify the item condition. If the
     * 								seller used item specifics, the condition is only returned
     * 								in conditionDisplayName.
     * 								As of July 2010, many categories require items to use
     * 								the condition ID format. Older GTC listings may continue to
     * 								use item specifics to specify condition until spring 2011.<br>
     * 								<br>
     * 								If you repeat condition values, the values are processed using
     * 								OR logic. For example:<br>
     * 								To precisely find only brand new and
     * 								manufacturer-refurbished items, pass the filter with values of
     * 								1000 and 2000 in the same request.<br>
     * 								To find all flavors of new items plus refurbished items (but not used items), pass the filter with values of
     * 								New, 2000, and 2500.<br>
     * 								To find a much broader set of new items, plus items with no
     * 								condition specified, pass the filter with values of
     * 								New and Unspecified.<br>
     * 								(The order of the values does not affect the results.
     * 								That is, passing New, 2000, and then 2500 gives the same
     * 								results as passing 2000, New, and then 2500.)
     * 								<br>
     * 								<blockquote>
     * 								<p>
     * 								<b>Allowed text values (<a
     * 								class="defn_type" href="../types/simpleTypes.html#string">string</a>):</b>
     * 								<br>
     * 								These text values (except Unspecified) limit results to items
     * 								with the condition defined in conditionId or item specifics.
     * 								</p>
     * 								<dl>
     * 								<dt>
     * 									New
     * 								</dt>
     * 								<dd>
     * 									New (or the equivalent). Excludes items with used,
     * 									refurbished, for parts, or unspecified conditions.
     * 								</dd>
     * 								<dt>
     * 									Used
     * 								</dt>
     * 								<dd>
     * 									Used, refurbished, or for parts.
     * 									Excludes items with new or unspecified conditions.
     * 								</dd>
     * 								<dt>
     * 									Unspecified
     * 								</dt>
     * 								<dd>
     * 									The seller did not specify an item condition using one of
     * 									eBay's structured formats. That is, either the item has no
     * 									condition, or the seller only specified the condition in the
     * 									title or narrative description. (You can try including words
     * 									like "new" in your search keywords to reduce unspecified
     * 									results. In this case, if you're using findItemsAdvanced, you
     * 									can also try setting descriptionSearch to true to find items
     * 									with the condition value in the description.)
     * 									Excludes items that the seller listed as new, used, refurbished,
     * 									for parts, or the equivalent.
     * 								</dd>
     * 								</dl>
     * 								</p>
     * 								<p>
     * 								<b>Allowed ID values (<a
     * 								class="defn_type" href="../types/simpleTypes.html#string">string</a>):</b>
     * 								<br>
     * 								These IDs limit results to items with the condition defined in
     * 								conditionId.
     * 								<br><br>
     * 								For details about the meaning of each condition, see
     * 								<a href="../Enums/conditionIdList.html">Item Condition IDs and Names</a>.
     * 								More importantly, always see the seller's listing for full
     * 								details and description of any imperfections before purchasing
     * 								an item.
     * 								</p>
     * 								<dl>
     * 								<dt>
     * 									1000
     * 								</dt>
     * 								<dd>
     * 									New
     * 								</dd>
     * 								<dt>
     * 									1500
     * 								</dt>
     * 								<dd>
     * 									New other (see details)
     * 								</dd>
     * 								<dt>
     * 									1750
     * 								</dt>
     * 								<dd>
     * 									New with defects
     * 								</dd>
     * 								<dt>
     * 									2000
     * 								</dt>
     * 								<dd>
     * 									Manufacturer refurbished
     * 								</dd>
     * 								<dt>
     * 									2500
     * 								</dt>
     * 								<dd>
     * 									Seller refurbished
     * 								</dd>
     * 								<dt>
     * 									3000
     * 								</dt>
     * 								<dd>
     * 									Used
     * 								</dd>
     * 								<dt>
     * 									4000
     * 								</dt>
     * 								<dd>
     * 									Very Good
     * 								</dd>
     * 								<dt>
     * 									5000
     * 								</dt>
     * 								<dd>
     * 									Good
     * 								</dd>
     * 								<dt>
     * 									6000
     * 								</dt>
     * 								<dd>
     * 									Acceptable
     * 								</dd>
     * 								<dt>
     * 									7000
     * 								</dt>
     * 								<dd>
     * 									For parts or not working
     * 								</dd>
     * 								</dl>
     * 								</blockquote>
     * 								<b>Example:</b>
     * 								<br>
     * 								<pre>
     * 								...<br>
     * 								&itemFilter(0).name=Condition<br>
     * 								&itemFilter(0).value(0)=New<br>
     * 								&itemFilter(0).value(1)=2000<br>
     * 								&itemFilter(0).value(2)=2500<br>
     * 								...
     * 								</pre>
     * 							
     * 
     */
    @XmlEnumValue("Condition")
    CONDITION("Condition"),

    /**
     * 
     * 								<a name="Currency"></a>
     * 								Limits results to items listed with the specified currency only.
     * 								<br><br>
     * 								<b>Allowed values (<a
     * 								class="defn_type"
     * 								href="../types/simpleTypes.html#string">string</a>):</b>
     * 								<br>
     * 								For a list of allowed currency values, see <a
     * 								href="../Enums/currencyIdList.html">currencyId Values</a>.
     * 								<br><br>
     * 							
     * 
     */
    @XmlEnumValue("Currency")
    CURRENCY("Currency"),

    /**
     * 
     * 								<a name="EndTimeFrom"></a>
     * 								Limits the results to items ending on or after the specified time.
     * 								Specify a time in the future.
     * 								<br><br>
     * 								<b>Allowed values (<a class="defn_type"
     * 								href="../types/simpleTypes.html#dateTime">dateTime</a>):</b>
     * 								<br>
     * 								Specify the time in GMT.
     * 								<br><br>
     * 							
     * 
     */
    @XmlEnumValue("EndTimeFrom")
    END_TIME_FROM("EndTimeFrom"),

    /**
     * 
     * 								<a name="ModTimeFrom"></a>
     * 								Limits the results to active items whose status has changed since the
     * 								specified time. Specify a time in the past. Time must be in GMT.
     * 								<br><br>
     * 								<b>Allowed values (<a class="defn_type"
     * 								href="../types/simpleTypes.html#dateTime">dateTime</a>):</b>
     * 								<br>
     * 								Specify the time in GMT.
     * 								<br><br>
     * 							
     * 
     */
    @XmlEnumValue("ModTimeFrom")
    MOD_TIME_FROM("ModTimeFrom"),

    /**
     * 
     * 								<a name="EndTimeTo"></a>
     * 								Limits the results to items ending on or before the specified time.
     * 								Specify a time in the future.
     * 								<br><br>
     * 								<b>Allowed values (<a class="defn_type"
     * 								href="../types/simpleTypes.html#dateTime">dateTime</a>):</b>
     * 								<br>
     * 								Specify the time in GMT.
     * 								<br><br>
     * 							
     * 
     */
    @XmlEnumValue("EndTimeTo")
    END_TIME_TO("EndTimeTo"),

    /**
     * 
     * 								<a name="ExcludeAutoPay"></a>
     * 								If true, excludes all items requiring immediate payment. Default is
     * 								false.
     * 								<br><br>
     * 								<b>Allowed values (<a
     * 								class="defn_type"
     * 								href="../types/simpleTypes.html#boolean">boolean</a>):</b>
     * 								<br>
     * 								true, false
     * 								<br><br>
     * 							
     * 
     */
    @XmlEnumValue("ExcludeAutoPay")
    EXCLUDE_AUTO_PAY("ExcludeAutoPay"),

    /**
     * 
     * 								<a name="BestOfferOnly"></a>
     * 								If true, the search results are limited to only items that
     * 								have Best Offer enabled. Default is false.
     * 								<br><br>
     * 								<b>Allowed values (<a
     * 								class="defn_type"
     * 								href="../types/simpleTypes.html#boolean">boolean</a>):</b>
     * 								<br>
     * 								true, false
     * 								<br><br>
     * 							
     * 
     */
    @XmlEnumValue("BestOfferOnly")
    BEST_OFFER_ONLY("BestOfferOnly"),

    /**
     * 
     * 								<a name="FeaturedOnly"></a>
     * 								If true, the search results are limited to featured item listings only.
     * 								Default is false.
     * 								<br><br>
     * 								<b>Allowed values (<a
     * 								class="defn_type"
     * 								href="../types/simpleTypes.html#boolean">boolean</a>):</b>
     * 								<br>
     * 								true, false
     * 								<br><br>
     * 							
     * 
     */
    @XmlEnumValue("FeaturedOnly")
    FEATURED_ONLY("FeaturedOnly"),

    /**
     * 
     * 								<a name="FeedbackScoreMax"></a>
     * 								Specifies the maximum feedback score of a seller whose items can be
     * 								included in the response. If FeedbackScoreMin is also specified, the
     * 								FeedbackScoreMax value must be greater than or equal to the
     * 								FeedbackScoreMin value.
     * 								<br><br>
     * 								<b>Allowed values (<a class="defn_type"
     * 								href="../types/simpleTypes.html#int">int</a>):</b>
     * 								<br>
     * 								Integer greater than or equal to 0.
     * 								<br><br>
     * 							
     * 
     */
    @XmlEnumValue("FeedbackScoreMax")
    FEEDBACK_SCORE_MAX("FeedbackScoreMax"),

    /**
     * 
     * 								<a name="FeedbackScoreMin"></a>
     * 								Specifies the mininum feedback score of a seller whose items can be
     * 								included in the response. If FeedbackScoreMax is also specified, the
     * 								FeedbackScoreMax value must be greater than or equal to the
     * 								FeedbackScoreMin value.
     * 								<br><br>
     * 								<b>Allowed values (<a class="defn_type"
     * 								href="../types/simpleTypes.html#int">int</a>):</b>
     * 								<br>
     * 								Integer greater than or equal to 0.
     * 								<br><br>
     * 							
     * 
     */
    @XmlEnumValue("FeedbackScoreMin")
    FEEDBACK_SCORE_MIN("FeedbackScoreMin"),

    /**
     * 
     * 								<a name="FreeShippingOnly"></a>
     * 								If true, the search results are limited to only items with free shipping
     * 								to the site specified in the request (see <a
     * 								href="../Enums/GlobalIdList.html">Global ID Values</a>). Default is
     * 								false.
     * 								<br><br>
     * 								<b>Allowed values (<a
     * 								class="defn_type"
     * 								href="../types/simpleTypes.html#boolean">boolean</a>):</b>
     * 								<br>
     * 								true, false
     * 								<br><br>
     * 							
     * 
     */
    @XmlEnumValue("FreeShippingOnly")
    FREE_SHIPPING_ONLY("FreeShippingOnly"),

    /**
     * 
     * 								<a name="GetItFastOnly"></a>
     * 								If true, the search results are limited to only Get It Fast listings.
     * 								Default is false.
     * 								<br><br>
     * 								<b>Allowed values (<a
     * 								class="defn_type"
     * 								href="../types/simpleTypes.html#boolean">boolean</a>):</b>
     * 								<br>
     * 								true, false
     * 								<br><br>
     * 							
     * 
     */
    @XmlEnumValue("GetItFastOnly")
    GET_IT_FAST_ONLY("GetItFastOnly"),

    /**
     * 
     * 								<a name="HideDuplicateItems"></a>
     * 								If true, and there are duplicate items for an item in the search results,
     * 								the subsequent duplicates will not appear in the results. Default is
     * 								false.<br>
     * 								Item listings are considered duplicates when all of the ollowing
     * 								conditions are met:<br>
     * 								1. Items are listed by the same seller<br>
     * 								2. Items have exactly the same item title<br>
     * 								3. Items have similar listing formats: <br>
     * 								&nbsp;&nbsp;&nbsp;
     * 								- Auctions (Auction Items and Auction BIN items)<br>
     * 								&nbsp;&nbsp;&nbsp;
     * 								- Fixed Price (Fixed Price, Multi-quantity Fixed Price, Fixed
     * 								Price with Best Offer, and Store Inventory Format items)<br>
     * 								&nbsp;&nbsp;&nbsp;
     * 								- Classified Ads<br>
     * 								<br>
     * 								For Auctions, items must also have the same price and number of bids to
     * 								be considered duplicates.
     * 								<br><br>
     * 								<b>Allowed values (<a
     * 								class="defn_type"
     * 								href="../types/simpleTypes.html#boolean">boolean</a>):</b>
     * 								<br>
     * 								true, false
     * 								<br><br>
     * 							
     * 
     */
    @XmlEnumValue("HideDuplicateItems")
    HIDE_DUPLICATE_ITEMS("HideDuplicateItems"),

    /**
     * 
     * 								<a name="AvailableTo"></a>
     * 								Limits items to those available to the specified country only. Item
     * 								filter LocatedIn cannot be used together with item filter AvailableTo.
     * 								<br><br>
     * 								<b>Allowed values (<a
     * 								class="defn_type"
     * 								href="../types/simpleTypes.html#string">string</a>):</b>
     * 								<br>
     * 								Expects the two-letter ISO 3166 country code to indicate the country
     * 								where the item is located. For English names that correspond to each code
     * 								(e.g., KY="Cayman Islands"), see the ISO site:
     * 								<br>
     * 								<a
     * 								href="http://www.iso.org/iso/country_codes/iso_3166_code_lists/english_country_names_and_code_elements.htm">
     * 								http://www.iso.org/iso/country_codes/iso_3166_code_lists/english_country_names_and_code_elements.htm</a>.
     * 								<br><br>
     * 							
     * 
     */
    @XmlEnumValue("AvailableTo")
    AVAILABLE_TO("AvailableTo"),

    /**
     * 
     * 								<a name="LocatedIn"></a>
     * 								Limits the result set to just those items located in the specified
     * 								country. Item filter AvailableTo cannot be used together with item filter
     * 								LocatedIn.
     * 								<br><br>
     * 								<b>Allowed values (<a
     * 								class="defn_type"
     * 								href="../types/simpleTypes.html#string">string</a>):</b>
     * 								<br>
     * 								Expects the two-letter ISO 3166 country code to indicate the country
     * 								where the item is located. For English names that correspond to each code
     * 								(e.g., KY="Cayman Islands"), see the ISO site:
     * 								<br>
     * 								<a href="http://www.iso.org/iso/country_codes/iso_3166_code_lists/english_country_names_and_code_elements.htm">
     * 								http://www.iso.org/iso/country_codes/iso_3166_code_lists/english_country_names_and_code_elements.htm</a>.
     * 								<br><br>
     * 								<b>Note: </b>Multiple values are allowed. Up to 25 countries
     * 								can be specified.
     * 								<br><br>
     * 							
     * 
     */
    @XmlEnumValue("LocatedIn")
    LOCATED_IN("LocatedIn"),

    /**
     * 
     * 								<a name="LocalPickupOnly"></a>
     * 								If true, the search results are limited to only items which have local
     * 								pickup available. Default is false.
     * 								<br><br>
     * 								<b>Allowed values (<a
     * 								class="defn_type"
     * 								href="../types/simpleTypes.html#boolean">boolean</a>):</b>
     * 								<br>
     * 								true, false
     * 								<br><br>
     * 							
     * 
     */
    @XmlEnumValue("LocalPickupOnly")
    LOCAL_PICKUP_ONLY("LocalPickupOnly"),

    /**
     * 
     * 								<a name="LocalSearchOnly"></a>
     * 								If true, the search results are limited to only matching items with the
     * 								Local Inventory Listing Options (LILO). Must be used together with the
     * 								<b class="con"> MaxDistance</b> item filter, and the request
     * 								must also specify <b class="con">buyerPostalCode</b>.
     * 								Currently, this is only available for the Motors site (global ID EBAY-
     * 								MOTOR).
     * 								<br><br>
     * 								<b>Allowed values (<a
     * 								class="defn_type"
     * 								href="../types/simpleTypes.html#boolean">boolean</a>):</b>
     * 								<br>
     * 								true, false
     * 								<br><br>
     * 							
     * 
     */
    @XmlEnumValue("LocalSearchOnly")
    LOCAL_SEARCH_ONLY("LocalSearchOnly"),

    /**
     * 
     * 								<a name="ListingType"></a>
     * 								Filters items based listing type information. Default behavior is to
     * 								return all matching items, except Store Inventory format listings.
     * 								<br><br>
     * 								<b>Allowed values (<a
     * 								class="defn_type"
     * 								href="../types/simpleTypes.html#string">string</a>):</b>
     * 								<br>
     * 								<blockquote>
     * 								<dl>
     * 								<dt>Auction</dt>
     * 								<dd>Retrieve matching auction listings (i.e., listings eligible for
     * 								competitive bidding at auction) only. Excludes auction items with Buy It
     * 								Now.</dd>
     * 								<dt>AuctionWithBIN</dt>
     * 								<dd>Retrieve all matching auction listings with Buy It Now
     * 								available. Excludes auction listings without Buy It Now. An auction
     * 								listed with Buy It Now will not be returned if a valid bid has been
     * 								placed on the auction.
     * 								</dd>
     * 								<dt>Classified</dt>
     * 								<dd>Retrieves Classified Ad format (i.e., Classified and AdFormat
     * 								listing type) listings only.</dd>
     * 								<dt>FixedPrice</dt>
     * 								<dd>Retrieve matching fixed price items only. Excludes Store
     * 								Inventory format items. </dd>
     * 								<dt>StoreInventory</dt>
     * 								<dd>Retrieve Store Inventory format items only.</dd>
     * 								<dt>All</dt>
     * 								<dd>Retrieve matching items for any listing type.</dd>
     * 								</blockquote>
     * 								<br>
     * 								<b>Note: </b>Multiple listing type values can be specified
     * 								for this filter.
     * 								<br><br>
     * 								<b>Example:</b>
     * 								<br>
     * 								<pre>
     * 								...<br>
     * 								&itemFilter(0).name=ListingType<br>
     * 								&itemFilter(0).value(0)=AuctionWithBIN<br>
     * 								&itemFilter(0).value(1)=FixedPrice<br>
     * 								&itemFilter(0).value(2)=StoreInventory<br>
     * 								...
     * 								</pre>
     * 								<br>
     * 							
     * 
     */
    @XmlEnumValue("ListingType")
    LISTING_TYPE("ListingType"),

    /**
     * 
     * 								<a name="LotsOnly"></a>
     * 								If true, the search results are limited to only matching listings for
     * 								which the lot size is 2 or more. Default is false.
     * 								<br><br>
     * 								<b>Allowed values (<a
     * 								class="defn_type"
     * 								href="../types/simpleTypes.html#boolean">boolean</a>):</b>
     * 								<br>
     * 								true, false
     * 								<br><br>
     * 							
     * 
     */
    @XmlEnumValue("LotsOnly")
    LOTS_ONLY("LotsOnly"),

    /**
     * 
     * 								<a name="MaxBids"></a>
     * 								Limits the results to items with bid counts less than or equal to the
     * 								specified value. If MinBids is also specified, the MaxBids value must be
     * 								greater than or equal to the MinBids value.
     * 								<br><br>
     * 								<b>Allowed values (<a class="defn_type"
     * 								href="../types/simpleTypes.html#int">int</a>):</b>
     * 								<br>
     * 								Integer greater than or equal to 0.
     * 								<br><br>
     * 							
     * 
     */
    @XmlEnumValue("MaxBids")
    MAX_BIDS("MaxBids"),

    /**
     * 
     * 								<a name="MinBids"></a>
     * 								Limits the results to items with bid counts greater than or equal to the
     * 								specified value. If MaxBids is also specified, the MaxBids value must be
     * 								greater than or equal to the MinBids value.
     * 								<br><br>
     * 								<b>Allowed values (<a class="defn_type"
     * 								href="../types/simpleTypes.html#int">int</a>):</b>
     * 								<br>
     * 								Integer greater than or equal to 0.
     * 								<br><br>
     * 							
     * 
     */
    @XmlEnumValue("MinBids")
    MIN_BIDS("MinBids"),

    /**
     * 
     * 								<a name="MaxPrice"></a>
     * 								Specifies the maximum current price an item can have to be included in
     * 								the response. Optionally, you can also specify a currency ID, using the
     * 								<b class="con">paramName</b> and <b class="con">
     * 								paramValue</b> fields (e.g.,
     * 								<code>&paramName=Currency&paramValue=EUR</code>). If
     * 								using with MinPrice to specify a price range, the MaxPrice value must be
     * 								greater than or equal to MinPrice.
     * 								<br><br>
     * 								<b>Allowed values (<a class="defn_type"
     * 								href="../types/simpleTypes.html#decimal">decimal</a>):</b>
     * 								<br>
     * 								Decimal values greater than or equal to 0.0.
     * 								<br><br>
     * 							
     * 
     */
    @XmlEnumValue("MaxPrice")
    MAX_PRICE("MaxPrice"),

    /**
     * 
     * 								<a name="MinPrice"></a>
     * 								Specifies the minimum current price an item can have to be included in
     * 								the response. Optionally, you can also specify a currency ID, using the
     * 								<b class="con">paramName</b> and <b class="con">
     * 								paramValue</b> fields (e.g.,
     * 								<code>&paramName=Currency&paramValue=EUR</code>). If
     * 								using with MaxPrice to specify a price range, the MaxPrice value must be
     * 								greater than or equal to MinPrice.
     * 								<br><br>
     * 								<b>Allowed values (<a class="defn_type"
     * 								href="../types/simpleTypes.html#decimal">decimal</a>):</b>
     * 								<br>
     * 								Decimal values greater than or equal to 0.0.
     * 								<br><br>
     * 							
     * 
     */
    @XmlEnumValue("MinPrice")
    MIN_PRICE("MinPrice"),

    /**
     * 
     * 								<a name="PaymentMethod"></a>
     * 								Limits results to items that accept the specified payment method.
     * 								<br><br>
     * 								<b>Allowed values (<a
     * 								class="defn_type"
     * 								href="../types/simpleTypes.html#string">string</a>):
     * 								</b><br>
     * 								<blockquote>
     * 								<dl>
     * 								<dt>PayPal</dt>
     * 								<dd>PayPal payment method.</dd>
     * 								<dt>PaisaPay</dt>
     * 								<dd>PaisaPay payment method. The PaisaPay payment method is only
     * 								for the India site (global ID EBAY-IN).</dd>
     * 								<dt>PaisaPayEMI</dt>
     * 								<dd>PaisaPayEscrow EMI (Equal Monthly Installment) payment method.
     * 								The PaisaPayEscrowEMI payment method is only for the India site (global
     * 								ID EBAY-IN).</dd>
     * 								</blockquote>
     * 								<br>
     * 							
     * 
     */
    @XmlEnumValue("PaymentMethod")
    PAYMENT_METHOD("PaymentMethod"),

    /**
     * 
     * 								<a name="MaxQuantity"></a>
     * 								Limits the results to listings with a quantity less than or equal to the
     * 								specified value. If MinQuantity is also specified, the MaxQuantity value
     * 								must be greater than or equal to the MinQuantity value.
     * 								<br><br>
     * 								<b>Allowed values (<a class="defn_type"
     * 								href="../types/simpleTypes.html#int">int</a>):</b>
     * 								<br>
     * 								Integer greater than or equal to 1.
     * 								<br><br>
     * 							
     * 
     */
    @XmlEnumValue("MaxQuantity")
    MAX_QUANTITY("MaxQuantity"),

    /**
     * 
     * 								<a name="MinQuantity"></a>
     * 								Limits the results to listings with a quantity greater than or equal to
     * 								the specified value. If MaxQuantity is also specified, the MaxQuantity
     * 								value must be greater than or equal to the MinQuantity value.
     * 								<br><br>
     * 								<b>Allowed values (<a class="defn_type"
     * 								href="../types/simpleTypes.html#int">int</a>):</b>
     * 								<br>
     * 								Integer greater than or equal to 1.
     * 								<br><br>
     * 							
     * 
     */
    @XmlEnumValue("MinQuantity")
    MIN_QUANTITY("MinQuantity"),

    /**
     * 
     * 								<a name="Seller"></a>
     * 								Specify one or more seller names. Search results will include items from
     * 								the specified sellers only. The Seller item filter cannot be used
     * 								together with either the ExcludeSeller or TopRatedSellerOnly item
     * 								filters.
     * 								<br><br>
     * 								<b>Allowed values (<a
     * 								class="defn_type"
     * 								href="../types/simpleTypes.html#string">string</a>):</b>
     * 								<br>
     * 								Valid seller names.
     * 								<br><br>
     * 								<b>Note: </b>Multiple values are allowed. Up to 100 sellers
     * 								can be specified.
     * 								<br><br>
     * 								<b>Example:</b>
     * 								<br>
     * 								<pre>
     * 								...<br>
     * 								&itemFilter(0).name=Seller<br>
     * 								&itemFilter(0).value(0)=seller01<br>
     * 								&itemFilter(0).value(1)=seller02<br>
     * 								&itemFilter(0).value(2)=seller03<br>
     * 								...
     * 								</pre>
     * 							
     * 
     */
    @XmlEnumValue("Seller")
    SELLER("Seller"),

    /**
     * 
     * 								<a name="ExcludeSeller"></a>
     * 								Specify one or more seller names. Search results will not include items
     * 								from the specified sellers. The ExcludeSeller item filter cannot be used
     * 								together with either the Seller or TopRatedSellerOnly item filters.
     * 								<br><br>
     * 								<b>Allowed values (<a
     * 								class="defn_type"
     * 								href="../types/simpleTypes.html#string">string</a>):</b>
     * 								<br>
     * 								Valid seller names.
     * 								<br><br>
     * 								<b>Note: </b>Multiple values are allowed. Up to 100 sellers
     * 								can be specified.
     * 								<br><br>
     * 								<b>Example:</b>
     * 								<br>
     * 								<pre>
     * 								...<br>
     * 								&itemFilter(0).name=ExcludeSeller<br>
     * 								&itemFilter(0).value(0)=seller01<br>
     * 								&itemFilter(0).value(1)=seller02<br>
     * 								&itemFilter(0).value(2)=seller03<br>
     * 								...
     * 								</pre>
     * 							
     * 
     */
    @XmlEnumValue("ExcludeSeller")
    EXCLUDE_SELLER("ExcludeSeller"),

    /**
     * 
     * 								<a name="ExcludeCategory"></a>
     * 								Specify one or more category IDs. Search results will not include items
     * 								from the specified categories or their child categories.
     * 								<br><br>
     * 								<b>Allowed values (<a
     * 								class="defn_type"
     * 								href="../types/simpleTypes.html#string">string</a>):</b>
     * 								<br>
     * 								Valid category IDs.
     * 								<br><br>
     * 								<b>Note: </b>Multiple values are allowed. Up to 25 categories
     * 								can be specified.
     * 								<br><br>
     * 								<b>Example:</b>
     * 								<br>
     * 								<pre>
     * 								...<br>
     * 								&itemFilter(0).name=ExcludeCategory<br>
     * 								&itemFilter(0).value(0)=168093<br>
     * 								&itemFilter(0).value(1)=56170<br>
     * 								&itemFilter(0).value(2)=73834<br>
     * 								...
     * 								</pre>
     * 							
     * 
     */
    @XmlEnumValue("ExcludeCategory")
    EXCLUDE_CATEGORY("ExcludeCategory"),

    /**
     * 
     * 								<a name="WorldOfGoodOnly"></a>
     * 								If true, the search results are limited to only items listed in the World
     * 								of Good marketplace. Defaults to false.
     * 								<br><br>
     * 								<b>Allowed values (<a
     * 								class="defn_type"
     * 								href="../types/simpleTypes.html#boolean">boolean</a>):</b>
     * 								<br>
     * 								true, false
     * 								<br><br>
     * 							
     * 
     */
    @XmlEnumValue("WorldOfGoodOnly")
    WORLD_OF_GOOD_ONLY("WorldOfGoodOnly"),

    /**
     * 
     * 								<a name="MaxDistance"></a>
     * 								Specifies the maximum distance from the specified postal code (<b
     * 								class="con">buyerPostalCode</b>) to search for items. The
     * 								request must also specify <b class="con">buyerPostalCode</b>.
     * 								<br><br>
     * 								The minimum distance supported is 5 miles or 10 kilometers, depending
     * 								upon whether the distance unit supported for the site to which the
     * 								request is submitted is miles (mi) or kilometers (km). For example, the
     * 								smallest MaxDistance for searches submitted to the US eBay site (global
     * 								ID EBAY-US) is 5 (miles). The smallest MaxDistance for searches submitted
     * 								to the Germany eBay site (global ID EBAY-DE) is 10 (kilometers).
     * 								<br><br>
     * 								Values are rounded up to the nearest 5 (mi) or 10 (km) increment. For
     * 								example, a value of 21 will be rounded up to 25 (mi) on the eBay US site
     * 								and to 30 (km) on the eBay Germany site.
     * 								<br><br>
     * 								<b>Allowed values (<a class="defn_type"
     * 								href="../types/simpleTypes.html#int">int</a>):</b>
     * 								<br>
     * 								Integer greater than or equal to 5.
     * 								<br><br>
     * 							
     * 
     */
    @XmlEnumValue("MaxDistance")
    MAX_DISTANCE("MaxDistance"),

    /**
     * 
     * 								<a name="SellerBusinessType"></a>
     * 								Restricts the items to those that are from sellers whose business type is
     * 								the specified value. Only one value can be specified.
     * 								<br><br>
     * 								Not supported on all sites. Applies only to the following sites, which
     * 								support seller business features:
     * 								<ul>
     * 								<li>Austria (EBAY-AT)</li>
     * 								<li>Belgium - Dutch (EBAY-NLBE)</li>
     * 								<li>Belgium - French (EBAY-FRBE)</li>
     * 								<li>France (EBAY-FR)</li>
     * 								<li>Germany (EBAY-DE)</li>
     * 								<li>Ireland (EBAY-IE)</li>
     * 								<li>Italy  (EBAY-IT)</li>
     * 								<li>Poland (EBAY-PL)</li>
     * 								<li>Spain (EBAY-ES)</li>
     * 								<li>Switzerland (EBAY-CH)</li>
     * 								<li>UK (EBAY-GB)</li>
     * 								</ul>
     * 								<br>
     * 								<b>Allowed values (<a
     * 								class="defn_type"
     * 								href="../types/simpleTypes.html#string">string</a>):
     * 								</b><br>
     * 								<blockquote>
     * 								<dl>
     * 								<dt>
     * 									Business
     * 								</dt>
     * 								<dd>
     * 									The seller is registered as a business on eBay.
     * 								</dd>
     * 								<dt>
     * 									Private
     * 								</dt>
     * 								<dd>
     * 									The seller is registered as an individual on eBay.
     * 								</dd>
     * 								</dl>
     * 								</blockquote>
     * 								<br>
     * 							
     * 
     */
    @XmlEnumValue("SellerBusinessType")
    SELLER_BUSINESS_TYPE("SellerBusinessType"),

    /**
     * 
     * 								<a name="TopRatedSellerOnly"></a>
     * 								If true, the search results are limited to only matching items where the
     * 								seller qualifies as a top-rated seller on the specified site. Site is
     * 								specified with the <a
     * 								href="../../Concepts/MakingACall.html#StandardURLParameters">global ID
     * 								header or URL parameter</a>. The default <a
     * 								href="../Enums/GlobalIdList.html ">global ID value</a> is EBAY-
     * 								US (the eBay US site). Default for this filter is false.
     * 								<br><br>
     * 								The TopRatedSellerOnly item filter cannot be used together with either
     * 								the Seller or ExcludeSeller item filters.
     * 								<br><br>
     * 								The TopRatedSellerOnly item filter is supported for the following sites
     * 								only: US (EBAY-US), Motors (EBAY-MOTOR), UK (EBAY-GB), IE (EBAY-IE), DE
     * 								(EBAY-DE), AT (EBAY-AT), and CH (EBAY-CH).
     * 								<br><br>
     * 								<b>Allowed values (<a
     * 								class="defn_type"
     * 								href="../types/simpleTypes.html#boolean">boolean</a>):</b>
     * 								<br>
     * 								true, false
     * 								<br><br>
     * 							
     * 
     */
    @XmlEnumValue("TopRatedSellerOnly")
    TOP_RATED_SELLER_ONLY("TopRatedSellerOnly"),

    /**
     * 
     * 								<a name="SoldItemsOnly"></a>
     * 								Reserved for future use.
     * 								If true, excludes all completed items which are not ended by being sold.
     * 								<br><br>
     * 								<b>Allowed values (<a
     * 								class="defn_type"
     * 								href="../types/simpleTypes.html#boolean">boolean</a>):</b>
     * 								<br>
     * 								true, false
     * 								<br><br>
     * 							
     * 
     */
    @XmlEnumValue("SoldItemsOnly")
    SOLD_ITEMS_ONLY("SoldItemsOnly"),

    /**
     * 
     * 								<a name="CharityOnly"></a>
     * 								If true, the search results are limited to items for which all or part of
     * 								the proceeds are given to a charity. Each item in the search results will
     * 								include the ID of the given charity. Default is false.
     * 								<br><br>
     * 								<b>Allowed values (<a
     * 								class="defn_type"
     * 								href="../types/simpleTypes.html#boolean">boolean</a>):</b>
     * 								<br>
     * 								true, false
     * 								<br><br>
     * 							
     * 
     */
    @XmlEnumValue("CharityOnly")
    CHARITY_ONLY("CharityOnly"),

    /**
     * 
     * 								<a name="ListedIn"></a>
     * 								The site on which the items were originally listed. This can be useful
     * 								for buyers who wish to
     * 								see only items on their domestic site either for delivery cost reasons or
     * 								time reasons, such as for gifting
     * 								occasions like birthdays or holidays.
     * 								<br><br>
     * 								<b>Allowed values (<a
     * 								class="defn_type"
     * 								href="../Enums/GlobalIdList.html">Global ID
     * 								Values</a>):</b>
     * 								<br><br>
     * 								GlobalID Value
     * 								<br><br>
     * 							
     * 
     */
    @XmlEnumValue("ListedIn")
    LISTED_IN("ListedIn"),

    /**
     * 
     * 								<a name="ExpeditedShippingType"></a>
     * 								Specifies the type of expedited shipping. You can specify
     * 								either Expedited or OneDayShipping. Only items that can be shipped
     * 								by the specified type are returned.
     * 								<br><br>
     * 								ExpeditedShippingType is used together with the MaxHandlingTime and
     * 								ReturnsAcceptedOnly filters to filter items
     * 								for certain kinds of gifting events such as birthdays or holidays where
     * 								the items must be delivered by a certain date.
     * 								If you wish to mimic the behavior of the eBay holiday filters, you would
     * 								use ExpeditedShippingType set
     * 								to either Expedited or OneDayShipping, MaxHandlingTime to 1,
     * 								ReturnsAcceptedOnly set to true, and for the
     * 								Germany site, set PaymentMethod to PayPal. (The holiday filters may not
     * 								always be available in the
     * 								eBay UI, depending on the season; however, the equivalent filter behavior
     * 								continues to be available in the API.)
     * 								<br><br>
     * 								<b>Allowed values (<a
     * 								class="defn_type"
     * 								href="../types/simpleTypes.html#string">string</a>):</b>
     * 								<br>
     * 								Expedited, OneDayShipping
     * 								<br><br>
     * 							
     * 
     */
    @XmlEnumValue("ExpeditedShippingType")
    EXPEDITED_SHIPPING_TYPE("ExpeditedShippingType"),

    /**
     * 
     * 								<a name="MaxHandlingTime"></a>
     * 								Specifies the maximum number of handling days the seller requires to ship
     * 								the item. Only items with a handling time less than or equal to this
     * 								number will be returned. (The handling time is the amount of time, in
     * 								days, required by the seller to get the item ready to ship and handed off
     * 								to the actual carrier who does the delivery. It does not include the time
     * 								required by the carrier to deliver the item. <br><br>
     * 								ExpeditedShippingType is used together with the MaxHandlingTime and
     * 								ReturnsAcceptedOnly filters to filter items for certain kinds of gifting
     * 								events such as birthdays or holidays where the items must be delivered by
     * 								a certain date. If you wish to mimic the behavior of the eBay holiday
     * 								filters, you would use ExpeditedShippingType set to either Expedited or
     * 								OneDayShipping, MaxHandlingTime to 1, ReturnsAcceptedOnly set to true,
     * 								and for the Germany site, set PaymentMethod to PayPal. (The holiday
     * 								filters may not always be available in the eBay UI, depending on the
     * 								season; however, the equivalent filter behavior continues to be available
     * 								in the API.)
     * 								<br><br>
     * 								<b>Allowed values (<a class="defn_type"
     * 								href="../types/simpleTypes.html#int">int</a>):</b>
     * 								<br>
     * 								Integer greater than or equal to 1.
     * 								<br><br>
     * 							
     * 
     */
    @XmlEnumValue("MaxHandlingTime")
    MAX_HANDLING_TIME("MaxHandlingTime"),

    /**
     * 
     * 								<a name="ReturnsAcceptedOnly"></a>
     * 								If set to true, returns only items where the seller accepts returns.
     * 								<br><br>
     * 								ExpeditedShippingType is used together with the MaxHandlingTime and
     * 								ReturnsAcceptedOnly filters to filter items for certain kinds of gifting
     * 								events such as birthdays or holidays where the items must be delivered by
     * 								a certain date. If you wish to mimic the behavior of the eBay holiday
     * 								filters, you would use ExpeditedShippingType set to either Expedited or
     * 								OneDayShipping, MaxHandlingTime to 1, ReturnsAcceptedOnly set to true,
     * 								and for the Germany site, set PaymentMethod to PayPal. (The holiday
     * 								filters may not always be available in the eBay UI, depending on the
     * 								season; however, the equivalent filter behavior continues to be available
     * 								in the API.)
     * 								<br><br>
     * 								<b>Allowed values (<a
     * 								class="defn_type"
     * 								href="../types/simpleTypes.html#boolean">boolean</a>):</b>
     * 								<br>
     * 								true, false
     * 								<br><br>
     * 							
     * 
     */
    @XmlEnumValue("ReturnsAcceptedOnly")
    RETURNS_ACCEPTED_ONLY("ReturnsAcceptedOnly"),

    /**
     * 
     * 								<a name="ValueBoxInventory"></a>
     * 								This filter can be used in conjunction with the sortOrder
     * 								PricePlusShippingLowest to return competitively priced items from eBay
     * 								top-rated sellers that have a BuyItNow price, with the lowest priced item
     * 								at the top of the list. This filter returns items from categories that
     * 								are catalog-enabled; items from non catalog-enabled categories are not
     * 								returned. Sellers can use this item filter to determine competitive
     * 								pricing; buying applications can use it to obtain competitive items from
     * 								top rated sellers that are likely to sell quickly.
     * 								<br><br>
     * 								If set to true, the item filter constraints are applied and the items are
     * 								returned accordingly. If set to false the item filter is not applied.
     * 								<b>Allowed values (<a
     * 								class="defn_type"
     * 								<br><br>
     * 							
     * 
     */
    @XmlEnumValue("ValueBoxInventory")
    VALUE_BOX_INVENTORY("ValueBoxInventory");
    private final String value;

    ItemFilterType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemFilterType fromValue(String v) {
        for (ItemFilterType c: ItemFilterType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
