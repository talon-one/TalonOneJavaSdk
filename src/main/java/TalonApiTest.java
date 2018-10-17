import one.talon.api.*;
import one.talon.api.model.*;

public class TalonApiTest {

    public static void main(String[] args) {

        ManagementApi managementApi = new ManagementApi(new ManagementApiClient());
        ManagementApiClient client = managementApi.getApiClient();
        client.setApplicationId("1");
        client.setApplicationKey("75fd2691a0f14d30");
        client.setBasePath("http://localhost:9000");

        managementApi.createManagementSession(client, "some@email.pwn", "p4$$w0rD");
        try {
            CustomerByAttributes cba = new CustomerByAttributes();
            cba.addProfileIDsItem(1);
            cba.addProfileIDsItem(4);
            ApplicationCustomersByAttributesResponse result = managementApi.getApplicationCustomersByAttributes(cba);
            System.out.println(result.getData());
        } catch (ApiException ex) {
            System.out.print(ex);
        }
    }
}