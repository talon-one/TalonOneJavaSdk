# Talon.One Integration API JAVA SDK

```java

import one.talon.api.*;
import one.talon.api.ManagementApiClient;
import one.talon.api.model.IntegrationState;
import one.talon.api.model.NewCustomerProfile;
import one.talon.api.model.NewCustomerSession;
import one.talon.api.model.Application;

public class TalonApiTest {
    private static void updateCustomer(IntegrationApi api, NewCustomerProfile profile) {
        try {
            IntegrationState response = api.updateCustomerProfile("John Mcaffee", profile);
            System.out.println(response.toString());
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
            e.printStackTrace();
        }
    }

    private static void updateSession(IntegrationApi api, NewCustomerSession session, final String sessionName) {
        try {
            IntegrationState response = api.updateCustomerSession(sessionName, session);
            System.out.println(response.toString());
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
            e.printStackTrace();
        }
    }

    private static void closeSession(IntegrationApi api, NewCustomerSession session, final String sessionName) {
        session.setState(NewCustomerSession.StateEnum.CLOSED);
        updateSession(api, session, sessionName);
    }

    public static void main(String[] args) {
        IntegrationApi integrationApi = new IntegrationApi();
        IntegrationApiClient integrationClient = integrationApi.getApiClient();
        integrationClient.setApplicationId("1");
        integrationClient.setApplicationKey("ff164d01c11d9571");
        integrationClient.setBasePath("http://company.talon.one");

        ManagementApi managementApi = new ManagementApi(new ManagementApiClient());
        ManagementApiClient client = managementApi.getApiClient();
        client.setApplicationId("1");
        client.setApplicationKey("ff164d01c11d9571");
        client.setBasePath("http://company.talon.one");

        String response = managementApi.createManagementSession(client, "email@domain.tld", "p4$$w0rD");
        System.out.println(client.getBearerToken());


        try {
            Application app = managementApi.getApplication(1);
            System.out.println(app.getCurrency());
        } catch (ApiException ex) {
            System.out.print(ex);
        }

        NewCustomerProfile profile = new NewCustomerProfile();
        NewCustomerSession session = new NewCustomerSession();

        updateCustomer(integrationApi, profile);
        session.setCoupon("btcusd");
        updateSession(integrationApi, session, "someSessionIdentifier");
    }
}

```

## Recommendation

It's recommended to create an instance either client per thread in a multithreaded environment to avoid any potential issues.

## Author

Talon.One