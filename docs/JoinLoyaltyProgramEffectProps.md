

# JoinLoyaltyProgramEffectProps

This effect indicates that a customer profile was joined to a profile-based loyalty program with the specified join date.  > [!note] **Note** > - This effect requires a customer profile. It does not work for anonymous sessions. > - The effect fails if the customer profile has already joined the loyalty program. 
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**programId** | **Long** | The ID of the loyalty program the customer profile is joined to. | 
**joinDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time when the customer profile joined the loyalty program. | 



