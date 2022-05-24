/*
 * vpc
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.volcstack.vpc.model;

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
 * SecurityGroupForDescribeSecurityGroupsOutput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-24T15:52:48.516414+08:00[Asia/Shanghai]")
public class SecurityGroupForDescribeSecurityGroupsOutput {
  @SerializedName("CreationTime")
  private String creationTime = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("SecurityGroupId")
  private String securityGroupId = null;

  @SerializedName("SecurityGroupName")
  private String securityGroupName = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("Type")
  private String type = null;

  @SerializedName("VpcId")
  private String vpcId = null;

  public SecurityGroupForDescribeSecurityGroupsOutput creationTime(String creationTime) {
    this.creationTime = creationTime;
    return this;
  }

   /**
   * Get creationTime
   * @return creationTime
  **/
  @Schema(description = "")
  public String getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(String creationTime) {
    this.creationTime = creationTime;
  }

  public SecurityGroupForDescribeSecurityGroupsOutput description(String description) {
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

  public SecurityGroupForDescribeSecurityGroupsOutput projectName(String projectName) {
    this.projectName = projectName;
    return this;
  }

   /**
   * Get projectName
   * @return projectName
  **/
  @Schema(description = "")
  public String getProjectName() {
    return projectName;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }

  public SecurityGroupForDescribeSecurityGroupsOutput securityGroupId(String securityGroupId) {
    this.securityGroupId = securityGroupId;
    return this;
  }

   /**
   * Get securityGroupId
   * @return securityGroupId
  **/
  @Schema(description = "")
  public String getSecurityGroupId() {
    return securityGroupId;
  }

  public void setSecurityGroupId(String securityGroupId) {
    this.securityGroupId = securityGroupId;
  }

  public SecurityGroupForDescribeSecurityGroupsOutput securityGroupName(String securityGroupName) {
    this.securityGroupName = securityGroupName;
    return this;
  }

   /**
   * Get securityGroupName
   * @return securityGroupName
  **/
  @Schema(description = "")
  public String getSecurityGroupName() {
    return securityGroupName;
  }

  public void setSecurityGroupName(String securityGroupName) {
    this.securityGroupName = securityGroupName;
  }

  public SecurityGroupForDescribeSecurityGroupsOutput status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public SecurityGroupForDescribeSecurityGroupsOutput type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public SecurityGroupForDescribeSecurityGroupsOutput vpcId(String vpcId) {
    this.vpcId = vpcId;
    return this;
  }

   /**
   * Get vpcId
   * @return vpcId
  **/
  @Schema(description = "")
  public String getVpcId() {
    return vpcId;
  }

  public void setVpcId(String vpcId) {
    this.vpcId = vpcId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityGroupForDescribeSecurityGroupsOutput securityGroupForDescribeSecurityGroupsOutput = (SecurityGroupForDescribeSecurityGroupsOutput) o;
    return Objects.equals(this.creationTime, securityGroupForDescribeSecurityGroupsOutput.creationTime) &&
        Objects.equals(this.description, securityGroupForDescribeSecurityGroupsOutput.description) &&
        Objects.equals(this.projectName, securityGroupForDescribeSecurityGroupsOutput.projectName) &&
        Objects.equals(this.securityGroupId, securityGroupForDescribeSecurityGroupsOutput.securityGroupId) &&
        Objects.equals(this.securityGroupName, securityGroupForDescribeSecurityGroupsOutput.securityGroupName) &&
        Objects.equals(this.status, securityGroupForDescribeSecurityGroupsOutput.status) &&
        Objects.equals(this.type, securityGroupForDescribeSecurityGroupsOutput.type) &&
        Objects.equals(this.vpcId, securityGroupForDescribeSecurityGroupsOutput.vpcId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creationTime, description, projectName, securityGroupId, securityGroupName, status, type, vpcId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityGroupForDescribeSecurityGroupsOutput {\n");
    
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
    sb.append("    securityGroupName: ").append(toIndentedString(securityGroupName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
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
