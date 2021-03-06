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
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeKeyPairsRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-24T15:52:32.918937+08:00[Asia/Shanghai]")
public class DescribeKeyPairsRequest {
  @SerializedName("AccountId")
  private String accountId = null;

  @SerializedName("FingerPrint")
  private String fingerPrint = null;

  @SerializedName("KeyPairId")
  private String keyPairId = null;

  @SerializedName("KeyPairIds")
  private List<String> keyPairIds = null;

  @SerializedName("KeyPairName")
  private String keyPairName = null;

  @SerializedName("KeyPairNames")
  private List<String> keyPairNames = null;

  @SerializedName("MaxResults")
  private Integer maxResults = null;

  @SerializedName("NextToken")
  private String nextToken = null;

  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  public DescribeKeyPairsRequest accountId(String accountId) {
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

  public DescribeKeyPairsRequest fingerPrint(String fingerPrint) {
    this.fingerPrint = fingerPrint;
    return this;
  }

   /**
   * Get fingerPrint
   * @return fingerPrint
  **/
  @Schema(description = "")
  public String getFingerPrint() {
    return fingerPrint;
  }

  public void setFingerPrint(String fingerPrint) {
    this.fingerPrint = fingerPrint;
  }

  public DescribeKeyPairsRequest keyPairId(String keyPairId) {
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

  public DescribeKeyPairsRequest keyPairIds(List<String> keyPairIds) {
    this.keyPairIds = keyPairIds;
    return this;
  }

  public DescribeKeyPairsRequest addKeyPairIdsItem(String keyPairIdsItem) {
    if (this.keyPairIds == null) {
      this.keyPairIds = new ArrayList<String>();
    }
    this.keyPairIds.add(keyPairIdsItem);
    return this;
  }

   /**
   * Get keyPairIds
   * @return keyPairIds
  **/
  @Schema(description = "")
  public List<String> getKeyPairIds() {
    return keyPairIds;
  }

  public void setKeyPairIds(List<String> keyPairIds) {
    this.keyPairIds = keyPairIds;
  }

  public DescribeKeyPairsRequest keyPairName(String keyPairName) {
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

  public DescribeKeyPairsRequest keyPairNames(List<String> keyPairNames) {
    this.keyPairNames = keyPairNames;
    return this;
  }

  public DescribeKeyPairsRequest addKeyPairNamesItem(String keyPairNamesItem) {
    if (this.keyPairNames == null) {
      this.keyPairNames = new ArrayList<String>();
    }
    this.keyPairNames.add(keyPairNamesItem);
    return this;
  }

   /**
   * Get keyPairNames
   * @return keyPairNames
  **/
  @Schema(description = "")
  public List<String> getKeyPairNames() {
    return keyPairNames;
  }

  public void setKeyPairNames(List<String> keyPairNames) {
    this.keyPairNames = keyPairNames;
  }

  public DescribeKeyPairsRequest maxResults(Integer maxResults) {
    this.maxResults = maxResults;
    return this;
  }

   /**
   * Get maxResults
   * @return maxResults
  **/
  @Schema(description = "")
  public Integer getMaxResults() {
    return maxResults;
  }

  public void setMaxResults(Integer maxResults) {
    this.maxResults = maxResults;
  }

  public DescribeKeyPairsRequest nextToken(String nextToken) {
    this.nextToken = nextToken;
    return this;
  }

   /**
   * Get nextToken
   * @return nextToken
  **/
  @Schema(description = "")
  public String getNextToken() {
    return nextToken;
  }

  public void setNextToken(String nextToken) {
    this.nextToken = nextToken;
  }

  public DescribeKeyPairsRequest pageNumber(Integer pageNumber) {
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

  public DescribeKeyPairsRequest pageSize(Integer pageSize) {
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

  public DescribeKeyPairsRequest projectName(String projectName) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeKeyPairsRequest describeKeyPairsRequest = (DescribeKeyPairsRequest) o;
    return Objects.equals(this.accountId, describeKeyPairsRequest.accountId) &&
        Objects.equals(this.fingerPrint, describeKeyPairsRequest.fingerPrint) &&
        Objects.equals(this.keyPairId, describeKeyPairsRequest.keyPairId) &&
        Objects.equals(this.keyPairIds, describeKeyPairsRequest.keyPairIds) &&
        Objects.equals(this.keyPairName, describeKeyPairsRequest.keyPairName) &&
        Objects.equals(this.keyPairNames, describeKeyPairsRequest.keyPairNames) &&
        Objects.equals(this.maxResults, describeKeyPairsRequest.maxResults) &&
        Objects.equals(this.nextToken, describeKeyPairsRequest.nextToken) &&
        Objects.equals(this.pageNumber, describeKeyPairsRequest.pageNumber) &&
        Objects.equals(this.pageSize, describeKeyPairsRequest.pageSize) &&
        Objects.equals(this.projectName, describeKeyPairsRequest.projectName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, fingerPrint, keyPairId, keyPairIds, keyPairName, keyPairNames, maxResults, nextToken, pageNumber, pageSize, projectName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeKeyPairsRequest {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    fingerPrint: ").append(toIndentedString(fingerPrint)).append("\n");
    sb.append("    keyPairId: ").append(toIndentedString(keyPairId)).append("\n");
    sb.append("    keyPairIds: ").append(toIndentedString(keyPairIds)).append("\n");
    sb.append("    keyPairName: ").append(toIndentedString(keyPairName)).append("\n");
    sb.append("    keyPairNames: ").append(toIndentedString(keyPairNames)).append("\n");
    sb.append("    maxResults: ").append(toIndentedString(maxResults)).append("\n");
    sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
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
