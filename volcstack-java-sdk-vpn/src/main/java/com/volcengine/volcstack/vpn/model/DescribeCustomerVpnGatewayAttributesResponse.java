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
 * DescribeCustomerVpnGatewayAttributesResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-03-24T18:21:18.622599+08:00[Asia/Shanghai]")
public class DescribeCustomerVpnGatewayAttributesResponse {
  @SerializedName("AccountId")
  private String accountId = null;

  @SerializedName("ConnectionCount")
  private Integer connectionCount = null;

  @SerializedName("CreationTime")
  private String creationTime = null;

  @SerializedName("CustomerVpnGatewayId")
  private String customerVpnGatewayId = null;

  @SerializedName("CustomerVpnGatewayName")
  private String customerVpnGatewayName = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("IpAddress")
  private String ipAddress = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("RequestId")
  private String requestId = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("UpdateTime")
  private String updateTime = null;

  public DescribeCustomerVpnGatewayAttributesResponse accountId(String accountId) {
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

  public DescribeCustomerVpnGatewayAttributesResponse connectionCount(Integer connectionCount) {
    this.connectionCount = connectionCount;
    return this;
  }

   /**
   * Get connectionCount
   * @return connectionCount
  **/
  @Schema(description = "")
  public Integer getConnectionCount() {
    return connectionCount;
  }

  public void setConnectionCount(Integer connectionCount) {
    this.connectionCount = connectionCount;
  }

  public DescribeCustomerVpnGatewayAttributesResponse creationTime(String creationTime) {
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

  public DescribeCustomerVpnGatewayAttributesResponse customerVpnGatewayId(String customerVpnGatewayId) {
    this.customerVpnGatewayId = customerVpnGatewayId;
    return this;
  }

   /**
   * Get customerVpnGatewayId
   * @return customerVpnGatewayId
  **/
  @Schema(description = "")
  public String getCustomerVpnGatewayId() {
    return customerVpnGatewayId;
  }

  public void setCustomerVpnGatewayId(String customerVpnGatewayId) {
    this.customerVpnGatewayId = customerVpnGatewayId;
  }

  public DescribeCustomerVpnGatewayAttributesResponse customerVpnGatewayName(String customerVpnGatewayName) {
    this.customerVpnGatewayName = customerVpnGatewayName;
    return this;
  }

   /**
   * Get customerVpnGatewayName
   * @return customerVpnGatewayName
  **/
  @Schema(description = "")
  public String getCustomerVpnGatewayName() {
    return customerVpnGatewayName;
  }

  public void setCustomerVpnGatewayName(String customerVpnGatewayName) {
    this.customerVpnGatewayName = customerVpnGatewayName;
  }

  public DescribeCustomerVpnGatewayAttributesResponse description(String description) {
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

  public DescribeCustomerVpnGatewayAttributesResponse ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * Get ipAddress
   * @return ipAddress
  **/
  @Schema(description = "")
  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  public DescribeCustomerVpnGatewayAttributesResponse projectName(String projectName) {
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

  public DescribeCustomerVpnGatewayAttributesResponse requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Get requestId
   * @return requestId
  **/
  @Schema(description = "")
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public DescribeCustomerVpnGatewayAttributesResponse status(String status) {
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

  public DescribeCustomerVpnGatewayAttributesResponse updateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

   /**
   * Get updateTime
   * @return updateTime
  **/
  @Schema(description = "")
  public String getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeCustomerVpnGatewayAttributesResponse describeCustomerVpnGatewayAttributesResponse = (DescribeCustomerVpnGatewayAttributesResponse) o;
    return Objects.equals(this.accountId, describeCustomerVpnGatewayAttributesResponse.accountId) &&
        Objects.equals(this.connectionCount, describeCustomerVpnGatewayAttributesResponse.connectionCount) &&
        Objects.equals(this.creationTime, describeCustomerVpnGatewayAttributesResponse.creationTime) &&
        Objects.equals(this.customerVpnGatewayId, describeCustomerVpnGatewayAttributesResponse.customerVpnGatewayId) &&
        Objects.equals(this.customerVpnGatewayName, describeCustomerVpnGatewayAttributesResponse.customerVpnGatewayName) &&
        Objects.equals(this.description, describeCustomerVpnGatewayAttributesResponse.description) &&
        Objects.equals(this.ipAddress, describeCustomerVpnGatewayAttributesResponse.ipAddress) &&
        Objects.equals(this.projectName, describeCustomerVpnGatewayAttributesResponse.projectName) &&
        Objects.equals(this.requestId, describeCustomerVpnGatewayAttributesResponse.requestId) &&
        Objects.equals(this.status, describeCustomerVpnGatewayAttributesResponse.status) &&
        Objects.equals(this.updateTime, describeCustomerVpnGatewayAttributesResponse.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, connectionCount, creationTime, customerVpnGatewayId, customerVpnGatewayName, description, ipAddress, projectName, requestId, status, updateTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeCustomerVpnGatewayAttributesResponse {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    connectionCount: ").append(toIndentedString(connectionCount)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    customerVpnGatewayId: ").append(toIndentedString(customerVpnGatewayId)).append("\n");
    sb.append("    customerVpnGatewayName: ").append(toIndentedString(customerVpnGatewayName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
