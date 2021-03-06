/*
 * auto_scaling
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.volcstack.autoscaling.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.volcstack.autoscaling.model.ServerGroupAttributeForCreateScalingGroupInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CreateScalingGroupRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-24T15:52:12.731669+08:00[Asia/Shanghai]")
public class CreateScalingGroupRequest {
  @SerializedName("DBInstanceIds")
  private List<String> dbInstanceIds = null;

  @SerializedName("DefaultCooldown")
  private Integer defaultCooldown = null;

  @SerializedName("DesireInstanceNumber")
  private Integer desireInstanceNumber = null;

  @SerializedName("InstanceTerminatePolicy")
  private String instanceTerminatePolicy = null;

  @SerializedName("MaxInstanceNumber")
  private Integer maxInstanceNumber = null;

  @SerializedName("MinInstanceNumber")
  private Integer minInstanceNumber = null;

  @SerializedName("MultiAZPolicy")
  private String multiAZPolicy = null;

  @SerializedName("ScalingGroupName")
  private String scalingGroupName = null;

  @SerializedName("ServerGroupAttributes")
  private List<ServerGroupAttributeForCreateScalingGroupInput> serverGroupAttributes = null;

  @SerializedName("SubnetIds")
  private List<String> subnetIds = null;

  public CreateScalingGroupRequest dbInstanceIds(List<String> dbInstanceIds) {
    this.dbInstanceIds = dbInstanceIds;
    return this;
  }

  public CreateScalingGroupRequest addDbInstanceIdsItem(String dbInstanceIdsItem) {
    if (this.dbInstanceIds == null) {
      this.dbInstanceIds = new ArrayList<String>();
    }
    this.dbInstanceIds.add(dbInstanceIdsItem);
    return this;
  }

   /**
   * Get dbInstanceIds
   * @return dbInstanceIds
  **/
  @Schema(description = "")
  public List<String> getDbInstanceIds() {
    return dbInstanceIds;
  }

  public void setDbInstanceIds(List<String> dbInstanceIds) {
    this.dbInstanceIds = dbInstanceIds;
  }

  public CreateScalingGroupRequest defaultCooldown(Integer defaultCooldown) {
    this.defaultCooldown = defaultCooldown;
    return this;
  }

   /**
   * Get defaultCooldown
   * @return defaultCooldown
  **/
  @Schema(description = "")
  public Integer getDefaultCooldown() {
    return defaultCooldown;
  }

  public void setDefaultCooldown(Integer defaultCooldown) {
    this.defaultCooldown = defaultCooldown;
  }

  public CreateScalingGroupRequest desireInstanceNumber(Integer desireInstanceNumber) {
    this.desireInstanceNumber = desireInstanceNumber;
    return this;
  }

   /**
   * Get desireInstanceNumber
   * @return desireInstanceNumber
  **/
  @Schema(description = "")
  public Integer getDesireInstanceNumber() {
    return desireInstanceNumber;
  }

  public void setDesireInstanceNumber(Integer desireInstanceNumber) {
    this.desireInstanceNumber = desireInstanceNumber;
  }

  public CreateScalingGroupRequest instanceTerminatePolicy(String instanceTerminatePolicy) {
    this.instanceTerminatePolicy = instanceTerminatePolicy;
    return this;
  }

   /**
   * Get instanceTerminatePolicy
   * @return instanceTerminatePolicy
  **/
  @Schema(description = "")
  public String getInstanceTerminatePolicy() {
    return instanceTerminatePolicy;
  }

  public void setInstanceTerminatePolicy(String instanceTerminatePolicy) {
    this.instanceTerminatePolicy = instanceTerminatePolicy;
  }

  public CreateScalingGroupRequest maxInstanceNumber(Integer maxInstanceNumber) {
    this.maxInstanceNumber = maxInstanceNumber;
    return this;
  }

   /**
   * Get maxInstanceNumber
   * @return maxInstanceNumber
  **/
  @Schema(description = "")
  public Integer getMaxInstanceNumber() {
    return maxInstanceNumber;
  }

  public void setMaxInstanceNumber(Integer maxInstanceNumber) {
    this.maxInstanceNumber = maxInstanceNumber;
  }

  public CreateScalingGroupRequest minInstanceNumber(Integer minInstanceNumber) {
    this.minInstanceNumber = minInstanceNumber;
    return this;
  }

   /**
   * Get minInstanceNumber
   * @return minInstanceNumber
  **/
  @Schema(description = "")
  public Integer getMinInstanceNumber() {
    return minInstanceNumber;
  }

  public void setMinInstanceNumber(Integer minInstanceNumber) {
    this.minInstanceNumber = minInstanceNumber;
  }

  public CreateScalingGroupRequest multiAZPolicy(String multiAZPolicy) {
    this.multiAZPolicy = multiAZPolicy;
    return this;
  }

   /**
   * Get multiAZPolicy
   * @return multiAZPolicy
  **/
  @Schema(description = "")
  public String getMultiAZPolicy() {
    return multiAZPolicy;
  }

  public void setMultiAZPolicy(String multiAZPolicy) {
    this.multiAZPolicy = multiAZPolicy;
  }

  public CreateScalingGroupRequest scalingGroupName(String scalingGroupName) {
    this.scalingGroupName = scalingGroupName;
    return this;
  }

   /**
   * Get scalingGroupName
   * @return scalingGroupName
  **/
  @Schema(description = "")
  public String getScalingGroupName() {
    return scalingGroupName;
  }

  public void setScalingGroupName(String scalingGroupName) {
    this.scalingGroupName = scalingGroupName;
  }

  public CreateScalingGroupRequest serverGroupAttributes(List<ServerGroupAttributeForCreateScalingGroupInput> serverGroupAttributes) {
    this.serverGroupAttributes = serverGroupAttributes;
    return this;
  }

  public CreateScalingGroupRequest addServerGroupAttributesItem(ServerGroupAttributeForCreateScalingGroupInput serverGroupAttributesItem) {
    if (this.serverGroupAttributes == null) {
      this.serverGroupAttributes = new ArrayList<ServerGroupAttributeForCreateScalingGroupInput>();
    }
    this.serverGroupAttributes.add(serverGroupAttributesItem);
    return this;
  }

   /**
   * Get serverGroupAttributes
   * @return serverGroupAttributes
  **/
  @Valid
  @Schema(description = "")
  public List<ServerGroupAttributeForCreateScalingGroupInput> getServerGroupAttributes() {
    return serverGroupAttributes;
  }

  public void setServerGroupAttributes(List<ServerGroupAttributeForCreateScalingGroupInput> serverGroupAttributes) {
    this.serverGroupAttributes = serverGroupAttributes;
  }

  public CreateScalingGroupRequest subnetIds(List<String> subnetIds) {
    this.subnetIds = subnetIds;
    return this;
  }

  public CreateScalingGroupRequest addSubnetIdsItem(String subnetIdsItem) {
    if (this.subnetIds == null) {
      this.subnetIds = new ArrayList<String>();
    }
    this.subnetIds.add(subnetIdsItem);
    return this;
  }

   /**
   * Get subnetIds
   * @return subnetIds
  **/
  @Schema(description = "")
  public List<String> getSubnetIds() {
    return subnetIds;
  }

  public void setSubnetIds(List<String> subnetIds) {
    this.subnetIds = subnetIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateScalingGroupRequest createScalingGroupRequest = (CreateScalingGroupRequest) o;
    return Objects.equals(this.dbInstanceIds, createScalingGroupRequest.dbInstanceIds) &&
        Objects.equals(this.defaultCooldown, createScalingGroupRequest.defaultCooldown) &&
        Objects.equals(this.desireInstanceNumber, createScalingGroupRequest.desireInstanceNumber) &&
        Objects.equals(this.instanceTerminatePolicy, createScalingGroupRequest.instanceTerminatePolicy) &&
        Objects.equals(this.maxInstanceNumber, createScalingGroupRequest.maxInstanceNumber) &&
        Objects.equals(this.minInstanceNumber, createScalingGroupRequest.minInstanceNumber) &&
        Objects.equals(this.multiAZPolicy, createScalingGroupRequest.multiAZPolicy) &&
        Objects.equals(this.scalingGroupName, createScalingGroupRequest.scalingGroupName) &&
        Objects.equals(this.serverGroupAttributes, createScalingGroupRequest.serverGroupAttributes) &&
        Objects.equals(this.subnetIds, createScalingGroupRequest.subnetIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dbInstanceIds, defaultCooldown, desireInstanceNumber, instanceTerminatePolicy, maxInstanceNumber, minInstanceNumber, multiAZPolicy, scalingGroupName, serverGroupAttributes, subnetIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateScalingGroupRequest {\n");
    
    sb.append("    dbInstanceIds: ").append(toIndentedString(dbInstanceIds)).append("\n");
    sb.append("    defaultCooldown: ").append(toIndentedString(defaultCooldown)).append("\n");
    sb.append("    desireInstanceNumber: ").append(toIndentedString(desireInstanceNumber)).append("\n");
    sb.append("    instanceTerminatePolicy: ").append(toIndentedString(instanceTerminatePolicy)).append("\n");
    sb.append("    maxInstanceNumber: ").append(toIndentedString(maxInstanceNumber)).append("\n");
    sb.append("    minInstanceNumber: ").append(toIndentedString(minInstanceNumber)).append("\n");
    sb.append("    multiAZPolicy: ").append(toIndentedString(multiAZPolicy)).append("\n");
    sb.append("    scalingGroupName: ").append(toIndentedString(scalingGroupName)).append("\n");
    sb.append("    serverGroupAttributes: ").append(toIndentedString(serverGroupAttributes)).append("\n");
    sb.append("    subnetIds: ").append(toIndentedString(subnetIds)).append("\n");
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
