

# RemoveFromAudienceEffectProps

This effect is triggered when a rule containing an [Update audience](https://docs.talon.one/docs/product/rules/effects/use-effects#update-an-audience) effect with **Remove customer from an audience** selected is validated. It indicates that a customer was removed from an audience and is returned when a customer session is opened, updated, or closed.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**audienceId** | **Long** | The internal ID of the audience. |  [optional]
**audienceName** | **String** | The name of the audience. |  [optional]
**profileIntegrationId** | **String** | The ID of the customer profile in the third-party integration platform. |  [optional]
**profileId** | **Long** | The internal ID of the customer profile. |  [optional]



