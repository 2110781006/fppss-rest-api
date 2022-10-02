package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TimeValueObject
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-09-23T20:53:57.896210+02:00[Europe/Vienna]")
public class TimeValueObject   {
  @JsonProperty("timestamp")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime timestamp;

  @JsonProperty("datapointname")
  private String datapointname;

  @JsonProperty("providerAccountId")
  private Integer providerAccountId;

  @JsonProperty("value")
  private BigDecimal value;

  @JsonProperty("counterValue")
  private BigDecimal counterValue;

  public TimeValueObject timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * timestamp of the value
   * @return timestamp
  */
  @ApiModelProperty(example = "2021-01-30T08:30Z", value = "timestamp of the value")

  @Valid

  public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }

  public TimeValueObject datapointname(String datapointname) {
    this.datapointname = datapointname;
    return this;
  }

  /**
   * name of the datapoint
   * @return datapointname
  */
  @ApiModelProperty(example = "xyz", value = "name of the datapoint")


  public String getDatapointname() {
    return datapointname;
  }

  public void setDatapointname(String datapointname) {
    this.datapointname = datapointname;
  }

  public TimeValueObject providerAccountId(Integer providerAccountId) {
    this.providerAccountId = providerAccountId;
    return this;
  }

  /**
   * provider account id
   * @return providerAccountId
  */
  @ApiModelProperty(example = "1", value = "provider account id")


  public Integer getProviderAccountId() {
    return providerAccountId;
  }

  public void setProviderAccountId(Integer providerAccountId) {
    this.providerAccountId = providerAccountId;
  }

  public TimeValueObject value(BigDecimal value) {
    this.value = value;
    return this;
  }

  /**
   * diff value since last value
   * @return value
  */
  @ApiModelProperty(example = "1.13", value = "diff value since last value")

  @Valid

  public BigDecimal getValue() {
    return value;
  }

  public void setValue(BigDecimal value) {
    this.value = value;
  }

  public TimeValueObject counterValue(BigDecimal counterValue) {
    this.counterValue = counterValue;
    return this;
  }

  /**
   * counter value of the smart meeter
   * @return counterValue
  */
  @ApiModelProperty(example = "1.13", value = "counter value of the smart meeter")

  @Valid

  public BigDecimal getCounterValue() {
    return counterValue;
  }

  public void setCounterValue(BigDecimal counterValue) {
    this.counterValue = counterValue;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeValueObject timeValueObject = (TimeValueObject) o;
    return Objects.equals(this.timestamp, timeValueObject.timestamp) &&
        Objects.equals(this.datapointname, timeValueObject.datapointname) &&
        Objects.equals(this.providerAccountId, timeValueObject.providerAccountId) &&
        Objects.equals(this.value, timeValueObject.value) &&
        Objects.equals(this.counterValue, timeValueObject.counterValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestamp, datapointname, providerAccountId, value, counterValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeValueObject {\n");
    
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    datapointname: ").append(toIndentedString(datapointname)).append("\n");
    sb.append("    providerAccountId: ").append(toIndentedString(providerAccountId)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    counterValue: ").append(toIndentedString(counterValue)).append("\n");
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

  public static String getLastTimestamp()
  {
    return null;
  }
}

