/*
 * vpc
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 0.1.0
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
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * RouterTableListForDescribeRouteTableListOutput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-03-23T20:44:32.144706+08:00[Asia/Shanghai]")
public class RouterTableListForDescribeRouteTableListOutput {
  @SerializedName("AccountId")
  private String accountId = null;

  @SerializedName("CreationTime")
  private String creationTime = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("RouteTableId")
  private String routeTableId = null;

  @SerializedName("RouteTableName")
  private String routeTableName = null;

  @SerializedName("RouteTableType")
  private String routeTableType = null;

  @SerializedName("SubnetIds")
  private List<String> subnetIds = null;

  @SerializedName("UpdateTime")
  private String updateTime = null;

  @SerializedName("VpcId")
  private String vpcId = null;

  @SerializedName("VpcName")
  private String vpcName = null;

  public RouterTableListForDescribeRouteTableListOutput accountId(String accountId) {
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

  public RouterTableListForDescribeRouteTableListOutput creationTime(String creationTime) {
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

  public RouterTableListForDescribeRouteTableListOutput description(String description) {
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

  public RouterTableListForDescribeRouteTableListOutput routeTableId(String routeTableId) {
    this.routeTableId = routeTableId;
    return this;
  }

   /**
   * Get routeTableId
   * @return routeTableId
  **/
  @Schema(description = "")
  public String getRouteTableId() {
    return routeTableId;
  }

  public void setRouteTableId(String routeTableId) {
    this.routeTableId = routeTableId;
  }

  public RouterTableListForDescribeRouteTableListOutput routeTableName(String routeTableName) {
    this.routeTableName = routeTableName;
    return this;
  }

   /**
   * Get routeTableName
   * @return routeTableName
  **/
  @Schema(description = "")
  public String getRouteTableName() {
    return routeTableName;
  }

  public void setRouteTableName(String routeTableName) {
    this.routeTableName = routeTableName;
  }

  public RouterTableListForDescribeRouteTableListOutput routeTableType(String routeTableType) {
    this.routeTableType = routeTableType;
    return this;
  }

   /**
   * Get routeTableType
   * @return routeTableType
  **/
  @Schema(description = "")
  public String getRouteTableType() {
    return routeTableType;
  }

  public void setRouteTableType(String routeTableType) {
    this.routeTableType = routeTableType;
  }

  public RouterTableListForDescribeRouteTableListOutput subnetIds(List<String> subnetIds) {
    this.subnetIds = subnetIds;
    return this;
  }

  public RouterTableListForDescribeRouteTableListOutput addSubnetIdsItem(String subnetIdsItem) {
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

  public RouterTableListForDescribeRouteTableListOutput updateTime(String updateTime) {
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

  public RouterTableListForDescribeRouteTableListOutput vpcId(String vpcId) {
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

  public RouterTableListForDescribeRouteTableListOutput vpcName(String vpcName) {
    this.vpcName = vpcName;
    return this;
  }

   /**
   * Get vpcName
   * @return vpcName
  **/
  @Schema(description = "")
  public String getVpcName() {
    return vpcName;
  }

  public void setVpcName(String vpcName) {
    this.vpcName = vpcName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RouterTableListForDescribeRouteTableListOutput routerTableListForDescribeRouteTableListOutput = (RouterTableListForDescribeRouteTableListOutput) o;
    return Objects.equals(this.accountId, routerTableListForDescribeRouteTableListOutput.accountId) &&
        Objects.equals(this.creationTime, routerTableListForDescribeRouteTableListOutput.creationTime) &&
        Objects.equals(this.description, routerTableListForDescribeRouteTableListOutput.description) &&
        Objects.equals(this.routeTableId, routerTableListForDescribeRouteTableListOutput.routeTableId) &&
        Objects.equals(this.routeTableName, routerTableListForDescribeRouteTableListOutput.routeTableName) &&
        Objects.equals(this.routeTableType, routerTableListForDescribeRouteTableListOutput.routeTableType) &&
        Objects.equals(this.subnetIds, routerTableListForDescribeRouteTableListOutput.subnetIds) &&
        Objects.equals(this.updateTime, routerTableListForDescribeRouteTableListOutput.updateTime) &&
        Objects.equals(this.vpcId, routerTableListForDescribeRouteTableListOutput.vpcId) &&
        Objects.equals(this.vpcName, routerTableListForDescribeRouteTableListOutput.vpcName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, creationTime, description, routeTableId, routeTableName, routeTableType, subnetIds, updateTime, vpcId, vpcName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RouterTableListForDescribeRouteTableListOutput {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    routeTableId: ").append(toIndentedString(routeTableId)).append("\n");
    sb.append("    routeTableName: ").append(toIndentedString(routeTableName)).append("\n");
    sb.append("    routeTableType: ").append(toIndentedString(routeTableType)).append("\n");
    sb.append("    subnetIds: ").append(toIndentedString(subnetIds)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
    sb.append("    vpcName: ").append(toIndentedString(vpcName)).append("\n");
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