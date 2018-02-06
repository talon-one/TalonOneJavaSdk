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


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * LibraryAttribute
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-02-06T13:17:26.027+01:00")
public class LibraryAttribute {
  /**
   * The name of the entity that can have this attribute. When creating or updating the entities of a given type, you can include an &#x60;attributes&#x60; object with keys corresponding to the &#x60;name&#x60; of the custom attributes for that type.
   */
  @JsonAdapter(EntityEnum.Adapter.class)
  public enum EntityEnum {
    APPLICATION("Application"),
    
    CAMPAIGN("Campaign"),
    
    CUSTOMERPROFILE("CustomerProfile"),
    
    CUSTOMERSESSION("CustomerSession"),
    
    CARTITEM("CartItem"),
    
    COUPON("Coupon"),
    
    EVENT("Event");

    private String value;

    EntityEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EntityEnum fromValue(String text) {
      for (EntityEnum b : EntityEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<EntityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EntityEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EntityEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return EntityEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("entity")
  private EntityEnum entity = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("title")
  private String title = null;

  /**
   * The data type of the attribute, a &#x60;time&#x60; attribute must be sent as a string that conforms to the [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) timestamp format.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    STRING("string"),
    
    NUMBER("number"),
    
    BOOLEAN("boolean"),
    
    TIME("time");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("presets")
  private List<String> presets = new ArrayList<String>();

  @SerializedName("tags")
  private List<String> tags = new ArrayList<String>();

  public LibraryAttribute entity(EntityEnum entity) {
    this.entity = entity;
    return this;
  }

   /**
   * The name of the entity that can have this attribute. When creating or updating the entities of a given type, you can include an &#x60;attributes&#x60; object with keys corresponding to the &#x60;name&#x60; of the custom attributes for that type.
   * @return entity
  **/
  @ApiModelProperty(required = true, value = "The name of the entity that can have this attribute. When creating or updating the entities of a given type, you can include an `attributes` object with keys corresponding to the `name` of the custom attributes for that type.")
  public EntityEnum getEntity() {
    return entity;
  }

  public void setEntity(EntityEnum entity) {
    this.entity = entity;
  }

  public LibraryAttribute name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The attribute name that will be used in API requests and Talang. E.g. if &#x60;name &#x3D;&#x3D; \&quot;region\&quot;&#x60; then you would set the region attribute by including an &#x60;attributes.region&#x60; property in your request payload. 
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The attribute name that will be used in API requests and Talang. E.g. if `name == \"region\"` then you would set the region attribute by including an `attributes.region` property in your request payload. ")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LibraryAttribute title(String title) {
    this.title = title;
    return this;
  }

   /**
   * The human-readable name for the attribute that will be shown in the Campaign Manager. Like &#x60;name&#x60;, the combination of entity and title must also be unique.
   * @return title
  **/
  @ApiModelProperty(required = true, value = "The human-readable name for the attribute that will be shown in the Campaign Manager. Like `name`, the combination of entity and title must also be unique.")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public LibraryAttribute type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The data type of the attribute, a &#x60;time&#x60; attribute must be sent as a string that conforms to the [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) timestamp format.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The data type of the attribute, a `time` attribute must be sent as a string that conforms to the [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) timestamp format.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public LibraryAttribute description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A description of the attribute.
   * @return description
  **/
  @ApiModelProperty(required = true, value = "A description of the attribute.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public LibraryAttribute presets(List<String> presets) {
    this.presets = presets;
    return this;
  }

  public LibraryAttribute addPresetsItem(String presetsItem) {
    this.presets.add(presetsItem);
    return this;
  }

   /**
   * The presets that indicate to which industry the attribute applies to.
   * @return presets
  **/
  @ApiModelProperty(required = true, value = "The presets that indicate to which industry the attribute applies to.")
  public List<String> getPresets() {
    return presets;
  }

  public void setPresets(List<String> presets) {
    this.presets = presets;
  }

  public LibraryAttribute tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public LibraryAttribute addTagsItem(String tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Short tags that are used to group attributes.
   * @return tags
  **/
  @ApiModelProperty(required = true, value = "Short tags that are used to group attributes.")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LibraryAttribute libraryAttribute = (LibraryAttribute) o;
    return Objects.equals(this.entity, libraryAttribute.entity) &&
        Objects.equals(this.name, libraryAttribute.name) &&
        Objects.equals(this.title, libraryAttribute.title) &&
        Objects.equals(this.type, libraryAttribute.type) &&
        Objects.equals(this.description, libraryAttribute.description) &&
        Objects.equals(this.presets, libraryAttribute.presets) &&
        Objects.equals(this.tags, libraryAttribute.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entity, name, title, type, description, presets, tags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LibraryAttribute {\n");
    
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    presets: ").append(toIndentedString(presets)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

