/*
 * AthenaX REST API
 * AthenaX REST API
 *
 * OpenAPI spec version: 0.1
 * Contact: haohui@uber.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.uber.athenax.backend.api;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.uber.athenax.backend.api.JobDefinitionResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;

/**
 * JobDefinitionDesiredstate
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-03-06T14:54:29.251+05:30")
public class JobDefinitionDesiredstate   {
  @JsonProperty("clusterId")
  private String clusterId = null;

  @JsonProperty("resource")
  private JobDefinitionResource resource = null;

  public JobDefinitionDesiredstate clusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

  /**
   * The cluster to be submitted to
   * @return clusterId
   **/
  @JsonProperty("clusterId")
  @ApiModelProperty(value = "The cluster to be submitted to")
  public String getClusterId() {
    return clusterId;
  }

  public void setClusterId(String clusterId) {
    this.clusterId = clusterId;
  }

  public JobDefinitionDesiredstate resource(JobDefinitionResource resource) {
    this.resource = resource;
    return this;
  }

  /**
   * Get resource
   * @return resource
   **/
  @JsonProperty("resource")
  @ApiModelProperty(value = "")
  public JobDefinitionResource getResource() {
    return resource;
  }

  public void setResource(JobDefinitionResource resource) {
    this.resource = resource;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobDefinitionDesiredstate jobDefinitionDesiredstate = (JobDefinitionDesiredstate) o;
    return Objects.equals(this.clusterId, jobDefinitionDesiredstate.clusterId) &&
        Objects.equals(this.resource, jobDefinitionDesiredstate.resource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterId, resource);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobDefinitionDesiredstate {\n");
    
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
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

