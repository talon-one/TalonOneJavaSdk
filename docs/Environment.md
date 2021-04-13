

# Environment


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Unique ID for this entity. | 
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The exact moment this entity was created. | 
**applicationId** | **Integer** | The ID of the application that owns this entity. | 
**slots** | [**List&lt;SlotDef&gt;**](SlotDef.md) | The slots defined for this application. | 
**functions** | [**List&lt;FunctionDef&gt;**](FunctionDef.md) | The functions defined for this application. | 
**templates** | [**List&lt;TemplateDef&gt;**](TemplateDef.md) | The templates defined for this application. | 
**giveawaysPools** | [**List&lt;GiveawaysPool&gt;**](GiveawaysPool.md) | The giveaways pools that the application is subscribed to. |  [optional]
**loyaltyPrograms** | [**List&lt;LoyaltyProgram&gt;**](LoyaltyProgram.md) | The loyalty programs that the application is subscribed to. |  [optional]
**attributes** | [**List&lt;Attribute&gt;**](Attribute.md) | The attributes that the application is subscribed to. |  [optional]
**additionalCosts** | [**List&lt;AccountAdditionalCost&gt;**](AccountAdditionalCost.md) | The additional costs that the application is subscribed to. |  [optional]
**audiences** | [**List&lt;Audience&gt;**](Audience.md) | The audiences contained in the account which the application belongs to. |  [optional]
**variables** | **String** |  | 



