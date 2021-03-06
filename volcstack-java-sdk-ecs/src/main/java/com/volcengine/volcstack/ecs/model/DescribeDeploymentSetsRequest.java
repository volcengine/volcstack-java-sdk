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
 * DescribeDeploymentSetsRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-24T15:52:32.918937+08:00[Asia/Shanghai]")
public class DescribeDeploymentSetsRequest {
  @SerializedName("AccountId")
  private String accountId = null;

  @SerializedName("DeploymentSetIds")
  private List<String> deploymentSetIds = null;

  @SerializedName("DeploymentSetName")
  private String deploymentSetName = null;

  @SerializedName("Granularity")
  private String granularity = null;

  @SerializedName("MaxResults")
  private Integer maxResults = null;

  @SerializedName("NextToken")
  private String nextToken = null;

  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("Strategy")
  private String strategy = null;

  public DescribeDeploymentSetsRequest accountId(String accountId) {
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

  public DescribeDeploymentSetsRequest deploymentSetIds(List<String> deploymentSetIds) {
    this.deploymentSetIds = deploymentSetIds;
    return this;
  }

  public DescribeDeploymentSetsRequest addDeploymentSetIdsItem(String deploymentSetIdsItem) {
    if (this.deploymentSetIds == null) {
      this.deploymentSetIds = new ArrayList<String>();
    }
    this.deploymentSetIds.add(deploymentSetIdsItem);
    return this;
  }

   /**
   * Get deploymentSetIds
   * @return deploymentSetIds
  **/
  @Schema(description = "")
  public List<String> getDeploymentSetIds() {
    return deploymentSetIds;
  }

  public void setDeploymentSetIds(List<String> deploymentSetIds) {
    this.deploymentSetIds = deploymentSetIds;
  }

  public DescribeDeploymentSetsRequest deploymentSetName(String deploymentSetName) {
    this.deploymentSetName = deploymentSetName;
    return this;
  }

   /**
   * Get deploymentSetName
   * @return deploymentSetName
  **/
  @Schema(description = "")
  public String getDeploymentSetName() {
    return deploymentSetName;
  }

  public void setDeploymentSetName(String deploymentSetName) {
    this.deploymentSetName = deploymentSetName;
  }

  public DescribeDeploymentSetsRequest granularity(String granularity) {
    this.granularity = granularity;
    return this;
  }

   /**
   * Get granularity
   * @return granularity
  **/
  @Schema(description = "")
  public String getGranularity() {
    return granularity;
  }

  public void setGranularity(String granularity) {
    this.granularity = granularity;
  }

  public DescribeDeploymentSetsRequest maxResults(Integer maxResults) {
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

  public DescribeDeploymentSetsRequest nextToken(String nextToken) {
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

  public DescribeDeploymentSetsRequest pageNumber(Integer pageNumber) {
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

  public DescribeDeploymentSetsRequest pageSize(Integer pageSize) {
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

  public DescribeDeploymentSetsRequest strategy(String strategy) {
    this.strategy = strategy;
    return this;
  }

   /**
   * Get strategy
   * @return strategy
  **/
  @Schema(description = "")
  public String getStrategy() {
    return strategy;
  }

  public void setStrategy(String strategy) {
    this.strategy = strategy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeDeploymentSetsRequest describeDeploymentSetsRequest = (DescribeDeploymentSetsRequest) o;
    return Objects.equals(this.accountId, describeDeploymentSetsRequest.accountId) &&
        Objects.equals(this.deploymentSetIds, describeDeploymentSetsRequest.deploymentSetIds) &&
        Objects.equals(this.deploymentSetName, describeDeploymentSetsRequest.deploymentSetName) &&
        Objects.equals(this.granularity, describeDeploymentSetsRequest.granularity) &&
        Objects.equals(this.maxResults, describeDeploymentSetsRequest.maxResults) &&
        Objects.equals(this.nextToken, describeDeploymentSetsRequest.nextToken) &&
        Objects.equals(this.pageNumber, describeDeploymentSetsRequest.pageNumber) &&
        Objects.equals(this.pageSize, describeDeploymentSetsRequest.pageSize) &&
        Objects.equals(this.strategy, describeDeploymentSetsRequest.strategy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, deploymentSetIds, deploymentSetName, granularity, maxResults, nextToken, pageNumber, pageSize, strategy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeDeploymentSetsRequest {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    deploymentSetIds: ").append(toIndentedString(deploymentSetIds)).append("\n");
    sb.append("    deploymentSetName: ").append(toIndentedString(deploymentSetName)).append("\n");
    sb.append("    granularity: ").append(toIndentedString(granularity)).append("\n");
    sb.append("    maxResults: ").append(toIndentedString(maxResults)).append("\n");
    sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    strategy: ").append(toIndentedString(strategy)).append("\n");
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
