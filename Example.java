package com.example.consumer;

import com.google.gson.Gson;

import one.talon.ApiClient;
import one.talon.api.IntegrationApi;
import one.talon.api.ManagementApi;
import one.talon.model.*;

import java.util.*;

public class Example {
    public static void main(String[] args) throws Exception {
        Gson gson = new Gson();
        IntegrationApi iApi = new IntegrationApi(new ApiClient("api_key_v1"));

        // Setup: basePath
        iApi.getApiClient().setBasePath("http://localhost:9000");
        // Setup: when using 'api_key_v1', set apiKey & apiKeyPrefix must be provided
        iApi.getApiClient().setApiKeyPrefix("ApiKey-v1");
        iApi.getApiClient().setApiKey(System.getenv("TALON_API_KEY"));

        // Creating a cart item object
        CartItem cartItem = new CartItem();
        cartItem.setName("Hawaiian Pizza");
        cartItem.setSku("pizza-x");
        cartItem.setQuantity(1L);
        cartItem.setPrice(new java.math.BigDecimal("5.5"));

        // Creating a customer session of V2
        NewCustomerSessionV2 customerSession = new NewCustomerSessionV2();
        customerSession.setProfileId("Cool_Dude");
        customerSession.addCouponCodesItem("Cool-Summer!");
        customerSession.addCartItemsItem(cartItem);

        // Initiating integration request wrapping the customer session update
        IntegrationRequest request = new IntegrationRequest()
                .customerSession(customerSession)
                // Optional parameter of requested information to be present on the response
                // related to the customer session update
                .responseContent(Arrays.asList(
                        IntegrationRequest.ResponseContentEnum.CUSTOMERSESSION,
                        IntegrationRequest.ResponseContentEnum.CUSTOMERPROFILE));

        // Flag to communicate whether the request is a "dry run"
        Boolean dryRun = false;

        // Create/update a customer session using `updateCustomerSessionV2` function
        IntegrationStateV2 is = iApi.updateCustomerSessionV2("deetdoot", request, dryRun, null);
        System.out.println(is.toString());

        // Parsing the returned effects list, please consult
        // https://developers.talon.one/Integration-API/handling-effects-v2 for the full
        // list of effects and their corresponding properties
        for (Effect eff : is.getEffects()) {
            if (eff.getEffectType().equals("addLoyaltyPoints")) {
                // Typecasting according to the specific effect type
                AddLoyaltyPointsEffectProps props = gson.fromJson(
                        gson.toJson(eff.getProps()),
                        AddLoyaltyPointsEffectProps.class);
                // Access the specific effect's properties
                System.out.println(props.getName());
                System.out.println(props.getProgramId());
                System.out.println(props.getValue());
            }
            if (eff.getEffectType().equals("acceptCoupon")) {
                // Typecasting according to the specific effect type
                AcceptCouponEffectProps props = gson.fromJson(
                        gson.toJson(eff.getProps()),
                        AcceptCouponEffectProps.class);
                // work with AcceptCouponEffectProps' properties
                // ...
            }
        }
    }
}