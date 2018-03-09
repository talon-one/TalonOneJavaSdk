# Java SDK Change log

Latest version: 1.1.1

Version 1.1.1

Fix effects response from the integration API. Parse CampaignID, RulesetId and RulesetIndex as Integers.

Version 1.1.0

1. Split api client
    - IntegrationApiClient
    - ManagementApiClient
2. Error handling on the Management API

## ApiClient split into 2 clients

Both API’s require different authentication strategies. Now the SDK provides one client for each API. The way you’d work with them is the same as in version `1.0.0`:

```java
import one.talon.api.IntegrationApi;
import one.talon.api.ManagementApi;

[…]

IntegrationApi integrationApi = new IntegrationApi();
IntegrationApiClient integrationClient = integrationApi.getApiClient();

[…]
ManagementApi managementApi = new ManagementApi();
ManagementApiClient managementClient = managementApi.getApiClient();
```

For more usage examples see `TalonApiTest.java`

## Notes

This changes are not backwards compatible with the version `1.0.0`.
