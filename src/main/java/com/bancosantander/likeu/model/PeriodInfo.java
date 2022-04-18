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
import java.util.List;
/**
 * PeriodInfo
 */


public class PeriodInfo {

  private Integer currentPeriod = null;

  /**
   * Indicates the status of the period.   * &#x60;ACTIVE&#x60; -  Indicates that status for period is active in this moment.   * &#x60;INACTIVE&#x60; - Indicates that the period is inactive. 
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

  private List<PeriodDetail> periodDetail = null;

   /**
   * Indicates the current period number 
   * @return currentPeriod
  **/
  public Integer getCurrentPeriod() {
    return currentPeriod;
  }

  public void setCurrentPeriod(Integer currentPeriod) {
    this.currentPeriod = currentPeriod;
  }

   /**
   * Indicates the status of the period.   * &#x60;ACTIVE&#x60; -  Indicates that status for period is active in this moment.   * &#x60;INACTIVE&#x60; - Indicates that the period is inactive. 
   * @return status
  **/
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

   /**
   * Card associated with the credit line.
   * @return periodDetail
  **/
  public List<PeriodDetail> getPeriodDetail() {
    return periodDetail;
  }

  public void setPeriodDetail(List<PeriodDetail> periodDetail) {
    this.periodDetail = periodDetail;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PeriodInfo periodInfo = (PeriodInfo) o;
    return Objects.equals(this.currentPeriod, periodInfo.currentPeriod) &&
        Objects.equals(this.status, periodInfo.status) &&
        Objects.equals(this.periodDetail, periodInfo.periodDetail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentPeriod, status, periodDetail);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PeriodInfo {\n");
    
    sb.append("    currentPeriod: ").append(toIndentedString(currentPeriod)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    periodDetail: ").append(toIndentedString(periodDetail)).append("\n");
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
