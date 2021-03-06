/*
 * vpn
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.volcstack.vpn.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * IpsecConfigForCreateVpnConnectionInput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-24T15:52:56.495960+08:00[Asia/Shanghai]")
public class IpsecConfigForCreateVpnConnectionInput {
  /**
   * Gets or Sets authAlg
   */
  @JsonAdapter(AuthAlgEnum.Adapter.class)
  public enum AuthAlgEnum {
    SHA1("sha1"),
    MD5("md5"),
    SHA256("sha256"),
    SHA384("sha384"),
    SHA512("sha512");

    private String value;

    AuthAlgEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static AuthAlgEnum fromValue(String input) {
      for (AuthAlgEnum b : AuthAlgEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<AuthAlgEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AuthAlgEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public AuthAlgEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return AuthAlgEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("AuthAlg")
  private AuthAlgEnum authAlg = null;

  /**
   * Gets or Sets dhGroup
   */
  @JsonAdapter(DhGroupEnum.Adapter.class)
  public enum DhGroupEnum {
    GROUP1("group1"),
    GROUP2("group2"),
    GROUP5("group5"),
    GROUP14("group14");

    private String value;

    DhGroupEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static DhGroupEnum fromValue(String input) {
      for (DhGroupEnum b : DhGroupEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<DhGroupEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DhGroupEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public DhGroupEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return DhGroupEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("DhGroup")
  private DhGroupEnum dhGroup = null;

  /**
   * Gets or Sets encAlg
   */
  @JsonAdapter(EncAlgEnum.Adapter.class)
  public enum EncAlgEnum {
    AES("aes"),
    AES192("aes192"),
    AES256("aes256"),
    DES("des"),
    _3DES("3des");

    private String value;

    EncAlgEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static EncAlgEnum fromValue(String input) {
      for (EncAlgEnum b : EncAlgEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<EncAlgEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EncAlgEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public EncAlgEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return EncAlgEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("EncAlg")
  private EncAlgEnum encAlg = null;

  @SerializedName("Lifetime")
  private String lifetime = null;

  public IpsecConfigForCreateVpnConnectionInput authAlg(AuthAlgEnum authAlg) {
    this.authAlg = authAlg;
    return this;
  }

   /**
   * Get authAlg
   * @return authAlg
  **/
  @Schema(description = "")
  public AuthAlgEnum getAuthAlg() {
    return authAlg;
  }

  public void setAuthAlg(AuthAlgEnum authAlg) {
    this.authAlg = authAlg;
  }

  public IpsecConfigForCreateVpnConnectionInput dhGroup(DhGroupEnum dhGroup) {
    this.dhGroup = dhGroup;
    return this;
  }

   /**
   * Get dhGroup
   * @return dhGroup
  **/
  @Schema(description = "")
  public DhGroupEnum getDhGroup() {
    return dhGroup;
  }

  public void setDhGroup(DhGroupEnum dhGroup) {
    this.dhGroup = dhGroup;
  }

  public IpsecConfigForCreateVpnConnectionInput encAlg(EncAlgEnum encAlg) {
    this.encAlg = encAlg;
    return this;
  }

   /**
   * Get encAlg
   * @return encAlg
  **/
  @Schema(description = "")
  public EncAlgEnum getEncAlg() {
    return encAlg;
  }

  public void setEncAlg(EncAlgEnum encAlg) {
    this.encAlg = encAlg;
  }

  public IpsecConfigForCreateVpnConnectionInput lifetime(String lifetime) {
    this.lifetime = lifetime;
    return this;
  }

   /**
   * Get lifetime
   * @return lifetime
  **/
  @Schema(description = "")
  public String getLifetime() {
    return lifetime;
  }

  public void setLifetime(String lifetime) {
    this.lifetime = lifetime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IpsecConfigForCreateVpnConnectionInput ipsecConfigForCreateVpnConnectionInput = (IpsecConfigForCreateVpnConnectionInput) o;
    return Objects.equals(this.authAlg, ipsecConfigForCreateVpnConnectionInput.authAlg) &&
        Objects.equals(this.dhGroup, ipsecConfigForCreateVpnConnectionInput.dhGroup) &&
        Objects.equals(this.encAlg, ipsecConfigForCreateVpnConnectionInput.encAlg) &&
        Objects.equals(this.lifetime, ipsecConfigForCreateVpnConnectionInput.lifetime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authAlg, dhGroup, encAlg, lifetime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IpsecConfigForCreateVpnConnectionInput {\n");
    
    sb.append("    authAlg: ").append(toIndentedString(authAlg)).append("\n");
    sb.append("    dhGroup: ").append(toIndentedString(dhGroup)).append("\n");
    sb.append("    encAlg: ").append(toIndentedString(encAlg)).append("\n");
    sb.append("    lifetime: ").append(toIndentedString(lifetime)).append("\n");
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
