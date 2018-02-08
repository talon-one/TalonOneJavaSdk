import one.talon.api.ApiClient;
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
        session.setCoupon("roman");
        updateSession(api, session, "asdagesgs");
    }
}