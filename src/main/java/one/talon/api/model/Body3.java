/*
 * Talon.One API
 * The Talon.One API is used to manage applications and campaigns, as well as to integrate with your application. The operations in the _Integration API_ section are used to integrate with our platform, while the other operations are used to manage applications and campaigns.  ### Where is the API?  The API is available at the same hostname as these docs. For example, if you are reading this page at `https://mycompany.talon.one/docs/api/`, the URL for the [updateCustomerProfile][] operation is `https://mycompany.talon.one/v1/customer_profiles/id`  [updateCustomerProfile]: #operation--v1-customer_profiles--integrationId--put
 *
 * OpenAPI spec version: 1.0.0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package one.talon.api.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 *
 */
@ApiModel(description = "")

public class Body3 {
    @SerializedName("profileId")
    private String profileId = null;

    @SerializedName("sessionId")
    private String sessionId = null;

    @SerializedName("type")
    private String type = null;

    @SerializedName("attributes")
    private Object attributes = null;

    public Body3 profileId(String profileId) {
        this.profileId = profileId;
        return this;
    }

    /**
     * ID of the customers profile as used within this Talon.One account. May be omitted or set to the empty string if the customer does not yet have a known profile ID.
     * @return profileId
     **/
    @ApiModelProperty(value = "ID of the customers profile as used within this Talon.One account. May be omitted or set to the empty string if the customer does not yet have a known profile ID.")
    public String getProfileId() {
        return profileId;
    }

    public void setProfileId(String profileId) {
        this.profileId = profileId;
    }

    public Body3 sessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    /**
     * The ID of the session that this event occurred in.
     * @return sessionId
     **/
    @ApiModelProperty(required = true, value = "The ID of the session that this event occurred in.")
    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public Body3 type(String type) {
        this.type = type;
        return this;
    }

    /**
     * A string representing the event. Must not be a reserved event name.
     * @return type
     **/
    @ApiModelProperty(required = true, value = "A string representing the event. Must not be a reserved event name.")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Body3 attributes(Object attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * Arbitrary additional JSON data associated with the event.
     * @return attributes
     **/
    @ApiModelProperty(required = true, value = "Arbitrary additional JSON data associated with the event.")
    public Object getAttributes() {
        return attributes;
    }

    public void setAttributes(Object attributes) {
        this.attributes = attributes;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Body3 body3 = (Body3) o;
        return Objects.equals(this.profileId, body3.profileId) &&
                Objects.equals(this.sessionId, body3.sessionId) &&
                Objects.equals(this.type, body3.type) &&
                Objects.equals(this.attributes, body3.attributes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(profileId, sessionId, type, attributes);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Body3 {\n");

        sb.append("    profileId: ").append(toIndentedString(profileId)).append("\n");
        sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

