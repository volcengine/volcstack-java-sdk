/*
 * clb
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.volcstack.clb.model;

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
 * HealthCheckForModifyListenerAttributesInput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-03-24T18:20:52.429083+08:00[Asia/Shanghai]")
public class HealthCheckForModifyListenerAttributesInput {
  @SerializedName("Domain")
  private String domain = null;

  @SerializedName("Enabled")
  private String enabled = null;

  @SerializedName("HealthyThreshold")
  private Integer healthyThreshold = null;

  @SerializedName("HttpCode")
  private String httpCode = null;

  @SerializedName("Interval")
  private Integer interval = null;

  @SerializedName("Method")
  private String method = null;

  @SerializedName("Timeout")
  private Integer timeout = null;

  @SerializedName("URI")
  private String URI = null;

  public HealthCheckForModifyListenerAttributesInput domain(String domain) {
    this.domain = domain;
    return this;
  }

   /**
   * Get domain
   * @return domain
  **/
  @Schema(description = "")
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }

  public HealthCheckForModifyListenerAttributesInput enabled(String enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @Schema(description = "")
  public String getEnabled() {
    return enabled;
  }

  public void setEnabled(String enabled) {
    this.enabled = enabled;
  }

  public HealthCheckForModifyListenerAttributesInput healthyThreshold(Integer healthyThreshold) {
    this.healthyThreshold = healthyThreshold;
    return this;
  }

   /**
   * Get healthyThreshold
   * @return healthyThreshold
  **/
  @Schema(description = "")
  public Integer getHealthyThreshold() {
    return healthyThreshold;
  }

  public void setHealthyThreshold(Integer healthyThreshold) {
    this.healthyThreshold = healthyThreshold;
  }

  public HealthCheckForModifyListenerAttributesInput httpCode(String httpCode) {
    this.httpCode = httpCode;
    return this;
  }

   /**
   * Get httpCode
   * @return httpCode
  **/
  @Schema(description = "")
  public String getHttpCode() {
    return httpCode;
  }

  public void setHttpCode(String httpCode) {
    this.httpCode = httpCode;
  }

  public HealthCheckForModifyListenerAttributesInput interval(Integer interval) {
    this.interval = interval;
    return this;
  }

   /**
   * Get interval
   * @return interval
  **/
  @Schema(description = "")
  public Integer getInterval() {
    return interval;
  }

  public void setInterval(Integer interval) {
    this.interval = interval;
  }

  public HealthCheckForModifyListenerAttributesInput method(String method) {
    this.method = method;
    return this;
  }

   /**
   * Get method
   * @return method
  **/
  @Schema(description = "")
  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }

  public HealthCheckForModifyListenerAttributesInput timeout(Integer timeout) {
    this.timeout = timeout;
    return this;
  }

   /**
   * Get timeout
   * @return timeout
  **/
  @Schema(description = "")
  public Integer getTimeout() {
    return timeout;
  }

  public void setTimeout(Integer timeout) {
    this.timeout = timeout;
  }

  public HealthCheckForModifyListenerAttributesInput URI(String URI) {
    this.URI = URI;
    return this;
  }

   /**
   * Get URI
   * @return URI
  **/
  @Schema(description = "")
  public String getURI() {
    return URI;
  }

  public void setURI(String URI) {
    this.URI = URI;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HealthCheckForModifyListenerAttributesInput healthCheckForModifyListenerAttributesInput = (HealthCheckForModifyListenerAttributesInput) o;
    return Objects.equals(this.domain, healthCheckForModifyListenerAttributesInput.domain) &&
        Objects.equals(this.enabled, healthCheckForModifyListenerAttributesInput.enabled) &&
        Objects.equals(this.healthyThreshold, healthCheckForModifyListenerAttributesInput.healthyThreshold) &&
        Objects.equals(this.httpCode, healthCheckForModifyListenerAttributesInput.httpCode) &&
        Objects.equals(this.interval, healthCheckForModifyListenerAttributesInput.interval) &&
        Objects.equals(this.method, healthCheckForModifyListenerAttributesInput.method) &&
        Objects.equals(this.timeout, healthCheckForModifyListenerAttributesInput.timeout) &&
        Objects.equals(this.URI, healthCheckForModifyListenerAttributesInput.URI);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domain, enabled, healthyThreshold, httpCode, interval, method, timeout, URI);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HealthCheckForModifyListenerAttributesInput {\n");
    
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    healthyThreshold: ").append(toIndentedString(healthyThreshold)).append("\n");
    sb.append("    httpCode: ").append(toIndentedString(httpCode)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
    sb.append("    URI: ").append(toIndentedString(URI)).append("\n");
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