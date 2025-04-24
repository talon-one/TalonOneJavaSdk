

# Environment

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Internal ID of this entity. | 
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The time this entity was created. | 
**applicationId** | **Integer** | The ID of the Application that owns this entity. | 
**slots** | [**List&lt;SlotDef&gt;**](SlotDef.md) | The slots defined for this application. | 
**functions** | [**List&lt;FunctionDef&gt;**](FunctionDef.md) | The functions defined for this application. | 
**templates** | [**List&lt;TemplateDef&gt;**](TemplateDef.md) | The templates defined for this application. | 
**variables** | **String** | A stringified version of the environment&#39;s Talang variables scope. | 
**giveawaysPools** | [**List&lt;GiveawaysPool&gt;**](GiveawaysPool.md) | The giveaways pools that the application is subscribed to. |  [optional]
**loyaltyPrograms** | [**List&lt;LoyaltyProgram&gt;**](LoyaltyProgram.md) | The loyalty programs that the application is subscribed to. |  [optional]
**achievements** | [**List&lt;Achievement&gt;**](Achievement.md) | The achievements, linked to the campaigns, belonging to the application. |  [optional]
**attributes** | [**List&lt;Attribute&gt;**](Attribute.md) | The attributes that the application is subscribed to. |  [optional]
**additionalCosts** | [**List&lt;AccountAdditionalCost&gt;**](AccountAdditionalCost.md) | The additional costs that the application is subscribed to. |  [optional]
**audiences** | [**List&lt;Audience&gt;**](Audience.md) | The audiences contained in the account which the application belongs to. |  [optional]
**collections** | [**List&lt;Collection&gt;**](Collection.md) | The account-level collections that the application is subscribed to. |  [optional]
**applicationCartItemFilters** | [**List&lt;ApplicationCIF&gt;**](ApplicationCIF.md) | The cart item filters belonging to the Application. |  [optional]



