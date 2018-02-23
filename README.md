# Talon.One Integration API JAVA SDK

```java

import one.talon.api.IntegrationApiClient;
import one.talon.api.ApiException;
import one.talon.api.DefaultApi;
import one.talon.api.model.IntegrationState;
import one.talon.api.model.NewCustomerProfile;
import one.talon.api.model.NewCustomerSession;

public class TalonApiTest {
    private static void updateCustomer(DefaultApi api, NewCustomerProfile profile) {
        try {
            IntegrationState response = api.updateCustomerProfile("John Mcaffee", profile);
            System.out.println(response.toString());
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
            e.printStackTrace();
        }
    }

    private static void updateSession(DefaultApi api, NewCustomerSession session, final String sessionName) {
        try {
            IntegrationState response = api.updateCustomerSession(sessionName, session);
            System.out.println(response.toString());
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
            e.printStackTrace();
        }
    }

    private static void closeSession(DefaultApi api, NewCustomerSession session, final String sessionName) {
        session.setState(NewCustomerSession.StateEnum.CLOSED);
        updateSession(api, session, sessionName);
    }

    public static void main(String[] args) {
        DefaultApi api = new DefaultApi();
        ApiClient client = api.getApiClient();
        client.setApplicationId("1");
        client.setApplicationKey("3ea66176ec001969");
        client.setBasePath("http://localhost:9000");

        NewCustomerProfile profile = new NewCustomerProfile();
        NewCustomerSession session = new NewCustomerSession();

        updateCustomer(api, profile);
        session.setCoupon("btcusd");
        updateSession(api, session, "someSessionIdentifier");
    }
}
}

```

## Documentation for API Endpoints

All URIs are relative to *https://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**updateCustomerProfile**](docs/DefaultApi.md#updateCustomerProfile) | **PUT** /v1/customer_profiles/{integrationId} | Update a Customer Profile
*DefaultApi* | [**updateCustomerSession**](docs/DefaultApi.md#updateCustomerSession) | **PUT** /v1/customer_sessions/{customerSessionId} | Update a Customer Session


## Documentation for Models

 - [CartItem](docs/CartItem.md)
 - [CartItemAdjustment](docs/CartItemAdjustment.md)
 - [CustomerProfile](docs/CustomerProfile.md)
 - [CustomerSession](docs/CustomerSession.md)
 - [Event](docs/Event.md)
 - [IntegrationState](docs/IntegrationState.md)
 - [LedgerEntry](docs/LedgerEntry.md)
 - [LoyaltyMembership](docs/LoyaltyMembership.md)
 - [NewCustomerProfile](docs/NewCustomerProfile.md)
 - [NewCustomerSession](docs/NewCustomerSession.md)

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

Talon.One