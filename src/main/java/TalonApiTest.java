import one.talon.api.*;
import one.talon.api.ManagementApiClient;
import one.talon.api.model.*;
import org.threeten.bp.OffsetDateTime;

public class TalonApiTest {
    private static void updateCustomer(IntegrationApi api, NewCustomerProfile profile) {
        try {
            IntegrationState response = api.updateCustomerProfile("John Mcaffee", profile);
            System.out.println(response.getEvent().getEffects());
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
        integrationClient.setBasePath("http://localhost:9000");

        ManagementApi managementApi = new ManagementApi();
        ManagementApiClient managementClient = managementApi.getApiClient();
        managementClient.setApplicationId("1");
        managementClient.setApplicationKey("ff164d01c11d9571");
        managementClient.setBasePath("http://localhost:9000");

        try {
            managementApi.createManagementSession(managementClient, "company@domain.tld", "P4$$W0RD");
            Application app = managementApi.getApplication(1);
            ListApplications applications = managementApi.getApplications(10, 0, "");
            System.out.println(applications.toString());
        } catch (ApiException ex) {
            System.out.print(ex);
        }

        NewCustomerProfile profile = new NewCustomerProfile();
        NewCustomerSession session = new NewCustomerSession();

        session.setCoupon("btcusd");
        updateSession(integrationApi, session, "someSessionIdentifier");

        OffsetDateTime now = OffsetDateTime.now();
        OffsetDateTime then = OffsetDateTime.now();

        // Example referral
        ReferralBody referralBody = new ReferralBody();
        // campaign MUST be a referral campaign
        referralBody.setCampaignId(1258);
        // advocateprofile and friendprofile MUST belong to your account
        referralBody.setAdvocateProfileIntegrationId("John Mcaffee");
        referralBody.setFriendProfileIntegrationId("Sigmund Freud");
        referralBody.setStartDate(now);
        referralBody.setExpiryDate(then);

        try {
            integrationApi.createReferral(referralBody);
        } catch (ApiException ex) {
            System.out.print(ex);
        }
    }
}