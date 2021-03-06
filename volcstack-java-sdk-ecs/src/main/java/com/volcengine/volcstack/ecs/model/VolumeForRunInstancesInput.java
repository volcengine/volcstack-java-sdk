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
 * VolumeForRunInstancesInput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-24T15:52:32.918937+08:00[Asia/Shanghai]")
public class VolumeForRunInstancesInput {
  @SerializedName("DeleteWithInstance")
  private String deleteWithInstance = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("Size")
  private Integer size = null;

  @SerializedName("SnapshotId")
  private String snapshotId = null;

  @SerializedName("VolumeName")
  private String volumeName = null;

  @SerializedName("VolumeType")
  private String volumeType = null;

  public VolumeForRunInstancesInput deleteWithInstance(String deleteWithInstance) {
    this.deleteWithInstance = deleteWithInstance;
    return this;
  }

   /**
   * Get deleteWithInstance
   * @return deleteWithInstance
  **/
  @Schema(description = "")
  public String getDeleteWithInstance() {
    return deleteWithInstance;
  }

  public void setDeleteWithInstance(String deleteWithInstance) {
    this.deleteWithInstance = deleteWithInstance;
  }

  public VolumeForRunInstancesInput description(String description) {
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

  public VolumeForRunInstancesInput size(Integer size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @Schema(description = "")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public VolumeForRunInstancesInput snapshotId(String snapshotId) {
    this.snapshotId = snapshotId;
    return this;
  }

   /**
   * Get snapshotId
   * @return snapshotId
  **/
  @Schema(description = "")
  public String getSnapshotId() {
    return snapshotId;
  }

  public void setSnapshotId(String snapshotId) {
    this.snapshotId = snapshotId;
  }

  public VolumeForRunInstancesInput volumeName(String volumeName) {
    this.volumeName = volumeName;
    return this;
  }

   /**
   * Get volumeName
   * @return volumeName
  **/
  @Schema(description = "")
  public String getVolumeName() {
    return volumeName;
  }

  public void setVolumeName(String volumeName) {
    this.volumeName = volumeName;
  }

  public VolumeForRunInstancesInput volumeType(String volumeType) {
    this.volumeType = volumeType;
    return this;
  }

   /**
   * Get volumeType
   * @return volumeType
  **/
  @Schema(description = "")
  public String getVolumeType() {
    return volumeType;
  }

  public void setVolumeType(String volumeType) {
    this.volumeType = volumeType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VolumeForRunInstancesInput volumeForRunInstancesInput = (VolumeForRunInstancesInput) o;
    return Objects.equals(this.deleteWithInstance, volumeForRunInstancesInput.deleteWithInstance) &&
        Objects.equals(this.description, volumeForRunInstancesInput.description) &&
        Objects.equals(this.size, volumeForRunInstancesInput.size) &&
        Objects.equals(this.snapshotId, volumeForRunInstancesInput.snapshotId) &&
        Objects.equals(this.volumeName, volumeForRunInstancesInput.volumeName) &&
        Objects.equals(this.volumeType, volumeForRunInstancesInput.volumeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deleteWithInstance, description, size, snapshotId, volumeName, volumeType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VolumeForRunInstancesInput {\n");
    
    sb.append("    deleteWithInstance: ").append(toIndentedString(deleteWithInstance)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    snapshotId: ").append(toIndentedString(snapshotId)).append("\n");
    sb.append("    volumeName: ").append(toIndentedString(volumeName)).append("\n");
    sb.append("    volumeType: ").append(toIndentedString(volumeType)).append("\n");
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
