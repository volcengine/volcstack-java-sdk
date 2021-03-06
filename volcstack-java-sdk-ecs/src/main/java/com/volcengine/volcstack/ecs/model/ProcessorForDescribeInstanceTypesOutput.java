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
 * ProcessorForDescribeInstanceTypesOutput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-24T15:52:32.918937+08:00[Asia/Shanghai]")
public class ProcessorForDescribeInstanceTypesOutput {
  @SerializedName("Architecture")
  private String architecture = null;

  @SerializedName("Cpus")
  private Integer cpus = null;

  public ProcessorForDescribeInstanceTypesOutput architecture(String architecture) {
    this.architecture = architecture;
    return this;
  }

   /**
   * Get architecture
   * @return architecture
  **/
  @Schema(description = "")
  public String getArchitecture() {
    return architecture;
  }

  public void setArchitecture(String architecture) {
    this.architecture = architecture;
  }

  public ProcessorForDescribeInstanceTypesOutput cpus(Integer cpus) {
    this.cpus = cpus;
    return this;
  }

   /**
   * Get cpus
   * @return cpus
  **/
  @Schema(description = "")
  public Integer getCpus() {
    return cpus;
  }

  public void setCpus(Integer cpus) {
    this.cpus = cpus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessorForDescribeInstanceTypesOutput processorForDescribeInstanceTypesOutput = (ProcessorForDescribeInstanceTypesOutput) o;
    return Objects.equals(this.architecture, processorForDescribeInstanceTypesOutput.architecture) &&
        Objects.equals(this.cpus, processorForDescribeInstanceTypesOutput.cpus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(architecture, cpus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessorForDescribeInstanceTypesOutput {\n");
    
    sb.append("    architecture: ").append(toIndentedString(architecture)).append("\n");
    sb.append("    cpus: ").append(toIndentedString(cpus)).append("\n");
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
