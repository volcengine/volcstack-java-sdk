/*
 * storage_ebs
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.volcstack.storageebs.model;

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
 * AttachVolumeRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-24T15:52:45.652685+08:00[Asia/Shanghai]")
public class AttachVolumeRequest {
  @SerializedName("DeleteWithInstance")
  private Boolean deleteWithInstance = null;

  @SerializedName("InstanceId")
  private String instanceId = null;

  @SerializedName("VolumeId")
  private String volumeId = null;

  public AttachVolumeRequest deleteWithInstance(Boolean deleteWithInstance) {
    this.deleteWithInstance = deleteWithInstance;
    return this;
  }

   /**
   * Get deleteWithInstance
   * @return deleteWithInstance
  **/
  @Schema(description = "")
  public Boolean isDeleteWithInstance() {
    return deleteWithInstance;
  }

  public void setDeleteWithInstance(Boolean deleteWithInstance) {
    this.deleteWithInstance = deleteWithInstance;
  }

  public AttachVolumeRequest instanceId(String instanceId) {
    this.instanceId = instanceId;
    return this;
  }

   /**
   * Get instanceId
   * @return instanceId
  **/
  @Schema(description = "")
  public String getInstanceId() {
    return instanceId;
  }

  public void setInstanceId(String instanceId) {
    this.instanceId = instanceId;
  }

  public AttachVolumeRequest volumeId(String volumeId) {
    this.volumeId = volumeId;
    return this;
  }

   /**
   * Get volumeId
   * @return volumeId
  **/
  @Schema(description = "")
  public String getVolumeId() {
    return volumeId;
  }

  public void setVolumeId(String volumeId) {
    this.volumeId = volumeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttachVolumeRequest attachVolumeRequest = (AttachVolumeRequest) o;
    return Objects.equals(this.deleteWithInstance, attachVolumeRequest.deleteWithInstance) &&
        Objects.equals(this.instanceId, attachVolumeRequest.instanceId) &&
        Objects.equals(this.volumeId, attachVolumeRequest.volumeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deleteWithInstance, instanceId, volumeId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttachVolumeRequest {\n");
    
    sb.append("    deleteWithInstance: ").append(toIndentedString(deleteWithInstance)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    volumeId: ").append(toIndentedString(volumeId)).append("\n");
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
