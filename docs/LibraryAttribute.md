
# LibraryAttribute

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entity** | [**EntityEnum**](#EntityEnum) | The name of the entity that can have this attribute. When creating or updating the entities of a given type, you can include an &#x60;attributes&#x60; object with keys corresponding to the &#x60;name&#x60; of the custom attributes for that type. | 
**name** | **String** | The attribute name that will be used in API requests and Talang. E.g. if &#x60;name &#x3D;&#x3D; \&quot;region\&quot;&#x60; then you would set the region attribute by including an &#x60;attributes.region&#x60; property in your request payload.  | 
**title** | **String** | The human-readable name for the attribute that will be shown in the Campaign Manager. Like &#x60;name&#x60;, the combination of entity and title must also be unique. | 
**type** | [**TypeEnum**](#TypeEnum) | The data type of the attribute, a &#x60;time&#x60; attribute must be sent as a string that conforms to the [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) timestamp format. | 
**description** | **String** | A description of the attribute. | 
**presets** | **List&lt;String&gt;** | The presets that indicate to which industry the attribute applies to. | 
**suggestions** | **List&lt;String&gt;** | Short suggestions that are used to group attributes. | 


<a name="EntityEnum"></a>
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


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
STRING | &quot;string&quot;
NUMBER | &quot;number&quot;
BOOLEAN | &quot;boolean&quot;
TIME | &quot;time&quot;



