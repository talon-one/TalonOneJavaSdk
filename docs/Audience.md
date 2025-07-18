

# Audience

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountId** | **Long** | The ID of the account that owns this entity. | 
**id** | **Long** | The internal ID of this entity. | 
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The time this entity was created. | 
**name** | **String** | The human-friendly display name for this audience. | 
**sandbox** | **Boolean** | Indicates if this is a live or sandbox Application. |  [optional]
**description** | **String** | A description of the audience. |  [optional]
**integration** | **String** | The Talon.One-supported [3rd-party platform](https://docs.talon.one/docs/dev/technology-partners/overview) that this audience was created in.  For example, &#x60;mParticle&#x60;, &#x60;Segment&#x60;, &#x60;Shopify&#x60;, &#x60;Braze&#x60;, or &#x60;Iterable&#x60;.  **Note:** If you do not integrate with any of these platforms, do not use this property.  |  [optional]
**integrationId** | **String** | The ID of this audience in the third-party integration.  **Note:** To create an audience that doesn&#39;t come from a 3rd party platform, do not use this property.  |  [optional]
**createdIn3rdParty** | **Boolean** | Determines if this audience is a 3rd party audience or not. |  [optional]
**lastUpdate** | [**OffsetDateTime**](OffsetDateTime.md) | The last time that the audience memberships changed. |  [optional]



