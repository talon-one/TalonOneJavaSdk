

# Attribute


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Internal ID of this entity. | 
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The time this entity was created. | 
**accountId** | **Integer** | The ID of the account that owns this entity. | 
**entity** | [**EntityEnum**](#EntityEnum) | The name of the entity that can have this attribute. When creating or updating the entities of a given type, you can include an &#x60;attributes&#x60; object with keys corresponding to the &#x60;name&#x60; of the custom attributes for that type. | 
**eventType** | **String** |  |  [optional]
**name** | **String** | The attribute name that will be used in API requests and Talang. E.g. if &#x60;name &#x3D;&#x3D; \&quot;region\&quot;&#x60; then you would set the region attribute by including an &#x60;attributes.region&#x60; property in your request payload. | 
**title** | **String** | The human-readable name for the attribute that will be shown in the Campaign Manager. Like &#x60;name&#x60;, the combination of entity and title must also be unique. | 
**type** | [**TypeEnum**](#TypeEnum) | The data type of the attribute, a &#x60;time&#x60; attribute must be sent as a string that conforms to the [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) timestamp format. | 
**description** | **String** | A description of this attribute. | 
**suggestions** | **List&lt;String&gt;** | A list of suggestions for the attribute. | 
**hasAllowedList** | **Boolean** | Whether or not this attribute has an allowed list of values associated with it. |  [optional]
**restrictedBySuggestions** | **Boolean** | Whether or not this attribute&#39;s value is restricted by suggestions (&#x60;suggestions&#x60; property) or by an allowed list of value (&#x60;hasAllowedList&#x60; property).  |  [optional]
**editable** | **Boolean** | Whether or not this attribute can be edited. | 
**subscribedApplicationsIds** | **List&lt;Integer&gt;** | A list of the IDs of the applications where this attribute is available. |  [optional]
**subscribedCatalogsIds** | **List&lt;Integer&gt;** | A list of the IDs of the catalogs where this attribute is available. |  [optional]
**allowedSubscriptions** | [**List&lt;AllowedSubscriptionsEnum&gt;**](#List&lt;AllowedSubscriptionsEnum&gt;) | A list of allowed subscription types for this attribute.  **Note:** This only applies to attributes associated with the &#x60;CartItem&#x60; entity.  |  [optional]
**eventTypeId** | **Integer** |  |  [optional]



## Enum: EntityEnum

Name | Value
---- | -----
APPLICATION | &quot;Application&quot;
CAMPAIGN | &quot;Campaign&quot;
CUSTOMERPROFILE | &quot;CustomerProfile&quot;
CUSTOMERSESSION | &quot;CustomerSession&quot;
CARTITEM | &quot;CartItem&quot;
COUPON | &quot;Coupon&quot;
EVENT | &quot;Event&quot;
GIVEAWAY | &quot;Giveaway&quot;
REFERRAL | &quot;Referral&quot;
STORE | &quot;Store&quot;



## Enum: TypeEnum

Name | Value
---- | -----
STRING | &quot;string&quot;
NUMBER | &quot;number&quot;
BOOLEAN | &quot;boolean&quot;
TIME | &quot;time&quot;
_LIST_STRING_ | &quot;(list string)&quot;
_LIST_NUMBER_ | &quot;(list number)&quot;
_LIST_TIME_ | &quot;(list time)&quot;
LOCATION | &quot;location&quot;
_LIST_LOCATION_ | &quot;(list location)&quot;



## Enum: List&lt;AllowedSubscriptionsEnum&gt;

Name | Value
---- | -----
APPLICATION | &quot;application&quot;
CATALOG | &quot;catalog&quot;



