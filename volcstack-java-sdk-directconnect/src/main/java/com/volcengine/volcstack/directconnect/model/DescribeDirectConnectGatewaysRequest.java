/*
 * directconnect
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.volcstack.directconnect.model;

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
 * DescribeDirectConnectGatewaysRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-24T15:52:27.325524+08:00[Asia/Shanghai]")
public class DescribeDirectConnectGatewaysRequest {
  @SerializedName("CenId")
  private String cenId = null;

  @SerializedName("DirectConnectGatewayIds")
  private List<String> directConnectGatewayIds = null;

  @SerializedName("DirectConnectGatewayName")
  private String directConnectGatewayName = null;

  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  public DescribeDirectConnectGatewaysRequest cenId(String cenId) {
    this.cenId = cenId;
    return this;
  }

   /**
   * Get cenId
   * @return cenId
  **/
  @Schema(description = "")
  public String getCenId() {
    return cenId;
  }

  public void setCenId(String cenId) {
    this.cenId = cenId;
  }

  public DescribeDirectConnectGatewaysRequest directConnectGatewayIds(List<String> directConnectGatewayIds) {
    this.directConnectGatewayIds = directConnectGatewayIds;
    return this;
  }

  public DescribeDirectConnectGatewaysRequest addDirectConnectGatewayIdsItem(String directConnectGatewayIdsItem) {
    if (this.directConnectGatewayIds == null) {
      this.directConnectGatewayIds = new ArrayList<String>();
    }
    this.directConnectGatewayIds.add(directConnectGatewayIdsItem);
    return this;
  }

   /**
   * Get directConnectGatewayIds
   * @return directConnectGatewayIds
  **/
  @Schema(description = "")
  public List<String> getDirectConnectGatewayIds() {
    return directConnectGatewayIds;
  }

  public void setDirectConnectGatewayIds(List<String> directConnectGatewayIds) {
    this.directConnectGatewayIds = directConnectGatewayIds;
  }

  public DescribeDirectConnectGatewaysRequest directConnectGatewayName(String directConnectGatewayName) {
    this.directConnectGatewayName = directConnectGatewayName;
    return this;
  }

   /**
   * Get directConnectGatewayName
   * @return directConnectGatewayName
  **/
  @Schema(description = "")
  public String getDirectConnectGatewayName() {
    return directConnectGatewayName;
  }

  public void setDirectConnectGatewayName(String directConnectGatewayName) {
    this.directConnectGatewayName = directConnectGatewayName;
  }

  public DescribeDirectConnectGatewaysRequest pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * Get pageNumber
   * @return pageNumber
  **/
  @Schema(description = "")
  public Integer getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  public DescribeDirectConnectGatewaysRequest pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Get pageSize
   * @return pageSize
  **/
  @Schema(description = "")
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeDirectConnectGatewaysRequest describeDirectConnectGatewaysRequest = (DescribeDirectConnectGatewaysRequest) o;
    return Objects.equals(this.cenId, describeDirectConnectGatewaysRequest.cenId) &&
        Objects.equals(this.directConnectGatewayIds, describeDirectConnectGatewaysRequest.directConnectGatewayIds) &&
        Objects.equals(this.directConnectGatewayName, describeDirectConnectGatewaysRequest.directConnectGatewayName) &&
        Objects.equals(this.pageNumber, describeDirectConnectGatewaysRequest.pageNumber) &&
        Objects.equals(this.pageSize, describeDirectConnectGatewaysRequest.pageSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cenId, directConnectGatewayIds, directConnectGatewayName, pageNumber, pageSize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeDirectConnectGatewaysRequest {\n");
    
    sb.append("    cenId: ").append(toIndentedString(cenId)).append("\n");
    sb.append("    directConnectGatewayIds: ").append(toIndentedString(directConnectGatewayIds)).append("\n");
    sb.append("    directConnectGatewayName: ").append(toIndentedString(directConnectGatewayName)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
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
