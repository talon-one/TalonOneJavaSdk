

# RoleV2RolesGroup

A map of target entities to their permission sets.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**applications** | [**Map&lt;String, RoleV2ApplicationDetails&gt;**](RoleV2ApplicationDetails.md) | A map of the link between the Application, campaign, or draft campaign-related permission set and the Application ID the permissions apply to. |  [optional]
**loyaltyPrograms** | **Map&lt;String, String&gt;** | A map of the link between the loyalty program-related permission set and the loyalty program ID the permissions apply to. |  [optional]
**campaignAccessGroups** | **Map&lt;String, String&gt;** | A map of the link between the campaign access group-related permission set and the campaign access group ID the permissions apply to. |  [optional]
**account** | **String** | Name of the account-level permission set. |  [optional]



