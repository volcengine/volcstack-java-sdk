/*
 * ecs
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.volcstack.ecs.model;

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
 * ModifyKeyPairAttributeRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-24T15:52:32.918937+08:00[Asia/Shanghai]")
public class ModifyKeyPairAttributeRequest {
  @SerializedName("AccountId")
  private String accountId = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("KeyPairId")
  private String keyPairId = null;

  @SerializedName("KeyPairName")
  private String keyPairName = null;

  public ModifyKeyPairAttributeRequest accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @Schema(description = "")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public ModifyKeyPairAttributeRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ModifyKeyPairAttributeRequest keyPairId(String keyPairId) {
    this.keyPairId = keyPairId;
    return this;
  }

   /**
   * Get keyPairId
   * @return keyPairId
  **/
  @Schema(description = "")
  public String getKeyPairId() {
    return keyPairId;
  }

  public void setKeyPairId(String keyPairId) {
    this.keyPairId = keyPairId;
  }

  public ModifyKeyPairAttributeRequest keyPairName(String keyPairName) {
    this.keyPairName = keyPairName;
    return this;
  }

   /**
   * Get keyPairName
   * @return keyPairName
  **/
  @Schema(description = "")
  public String getKeyPairName() {
    return keyPairName;
  }

  public void setKeyPairName(String keyPairName) {
    this.keyPairName = keyPairName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifyKeyPairAttributeRequest modifyKeyPairAttributeRequest = (ModifyKeyPairAttributeRequest) o;
    return Objects.equals(this.accountId, modifyKeyPairAttributeRequest.accountId) &&
        Objects.equals(this.description, modifyKeyPairAttributeRequest.description) &&
        Objects.equals(this.keyPairId, modifyKeyPairAttributeRequest.keyPairId) &&
        Objects.equals(this.keyPairName, modifyKeyPairAttributeRequest.keyPairName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, description, keyPairId, keyPairName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyKeyPairAttributeRequest {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    keyPairId: ").append(toIndentedString(keyPairId)).append("\n");
    sb.append("    keyPairName: ").append(toIndentedString(keyPairName)).append("\n");
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
