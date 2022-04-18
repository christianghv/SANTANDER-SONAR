/*
 * Credits
 * The Credits API provides information about customer credit lines.
 *
 * OpenAPI spec version: 2.2.0
 * Contact: gipinacho@santander.com.mx
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.bancosantander.likeu.model;

import java.util.Objects;
/**
 * Retrieves the assistance detail information
 */
public class AssistanceDetail {
  private String id = null;

  /**
   * Indicates the status of the assistance.   * &#x60;ACTIVE&#x60; -  Indicates that status for recurrent payment is active in this moment.   * &#x60;INACTIVE&#x60; - Indicates that the recurrent payment status is deactivated. 
   */
  public enum StatusEnum {
    ACTIVE("ACTIVE"),
    INACTIVE("INACTIVE");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    /**
   * Indicates the status of the assistance.   * &#x60;ACTIVE&#x60; -  Indicates that status for recurrent payment is active in this moment.   * &#x60;INACTIVE&#x60; - Indicates that the recurrent payment status is deactivated. 
   * @param   input    dato de entrada
   * @return  datos de salida
   */
    public static StatusEnum fromValue(String input) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
  } 

  private StatusEnum status = null;

  private java.util.Date operationDate = null;

   /**
   * Indicates the assistance identifier.
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

   /**
   * Indicates the status of the assistance.   * &#x60;ACTIVE&#x60; -  Indicates that status for recurrent payment is active in this moment.   * &#x60;INACTIVE&#x60; - Indicates that the recurrent payment status is deactivated. 
   * @return status
  **/
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

   /**
   * Indicates the date on which the recurrent payment was made. [ISO 8601] (https://www.iso.org/iso-8601-date-and-time-format.html
   * @return operationDate
  **/
  public java.util.Date getOperationDate() {
    if (this.operationDate != null) {
      return new java.util.Date(this.operationDate.getTime());
    } else {
      return null;
    }
  }
/**
	 * @param Date
	 */
  public void setOperationDate(java.util.Date operationDate) {
    if (operationDate != null) {
      this.operationDate = new java.util.Date(operationDate.getTime());
  } else {
      this.operationDate = null;
  }
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssistanceDetail assistanceDetail = (AssistanceDetail) o;
    return Objects.equals(this.id, assistanceDetail.id) &&
        Objects.equals(this.status, assistanceDetail.status) &&
        Objects.equals(this.operationDate, assistanceDetail.operationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, operationDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssistanceDetail {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    operationDate: ").append(toIndentedString(operationDate)).append("\n");
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
