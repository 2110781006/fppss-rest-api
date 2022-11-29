package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.Table;
import org.jooq.impl.DSL;
import org.keycloak.KeycloakPrincipal;
import org.keycloak.KeycloakSecurityContext;
import org.keycloak.adapters.springsecurity.token.KeycloakAuthenticationToken;
import org.keycloak.representations.IDToken;
import org.openapitools.DbConnector;
import org.springframework.security.core.context.SecurityContextHolder;

import javax.validation.Valid;
import java.math.BigDecimal;
import java.security.Principal;
import java.sql.Connection;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static org.jooq.impl.DSL.*;

/**
 * TimeValueObject
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-09-23T20:53:57.896210+02:00[Europe/Vienna]")
public class TimeValueObject   {
  @JsonProperty("timestamp")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime timestamp;

  @JsonProperty("meterId")
  private String meterId;

  @JsonProperty("datapointname")
  private String datapointname;

  @JsonProperty("providerAccountId")
  private Integer providerAccountId;

  @JsonProperty("value")
  private BigDecimal value;

  @JsonProperty("counterValue")
  private BigDecimal counterValue;

  @JsonProperty("type")
  private Integer type;

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

  public TimeValueObject meterId(String meterId) {
    this.meterId = meterId;
    return this;
  }

  /**
   * id of the meter
   * @return meterId
  */
  @ApiModelProperty(example = "xyz", value = "id of the meter")


  public String getMeterId() {
    return meterId;
  }

  public void setMeterId(String meterId) {
    this.meterId = meterId;
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
   * counter value of the smart meter
   * @return counterValue
  */
  @ApiModelProperty(example = "1.13", value = "counter value of the smart meter")

  @Valid

  public BigDecimal getCounterValue() {
    return counterValue;
  }

  public void setCounterValue(BigDecimal counterValue) {
    this.counterValue = counterValue;
  }

  public TimeValueObject type(Integer type) {
    this.type = type;
    return this;
  }

  /**
   * feedin value,  consumption value or pruduction value
   * @return type
  */
  @ApiModelProperty(value = "feedin value,  consumption value or pruduction value")


  public Integer getType() {
    return type;
  }

  public void setType(Integer type) {
    this.type = type;
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
        Objects.equals(this.meterId, timeValueObject.meterId) &&
        Objects.equals(this.datapointname, timeValueObject.datapointname) &&
        Objects.equals(this.providerAccountId, timeValueObject.providerAccountId) &&
        Objects.equals(this.value, timeValueObject.value) &&
        Objects.equals(this.counterValue, timeValueObject.counterValue) &&
        Objects.equals(this.type, timeValueObject.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestamp, meterId, datapointname, providerAccountId, value, counterValue, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeValueObject {\n");
    
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    meterId: ").append(toIndentedString(meterId)).append("\n");
    sb.append("    datapointname: ").append(toIndentedString(datapointname)).append("\n");
    sb.append("    providerAccountId: ").append(toIndentedString(providerAccountId)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    counterValue: ").append(toIndentedString(counterValue)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

  /**
   * Get timestamp of last timevalueobject
   * @param resolution resolution
   * @param providerAccountId provider account id
   * @param datapointname datapointname
   * @return last timestamp
   */
  public static OffsetDateTime getLastTimestamp(Resolution resolution, int providerAccountId, String meterId, String datapointname) throws Exception
  {
    DbConnector connector = new DbConnector(System.getenv("FPPSS_DB_URL"), System.getenv("FPPSS_DB_USER"), System.getenv("FPPSS_DB_PASSWORD"));

    connector.open();//open databaseconnection

    Connection conn = connector.getConnection();

    DSLContext query = DSL.using(conn);

    Table t = null;

    switch (resolution)
    {
      case spontan: t = table("values_spontan"); break;
      case hour: t = table("values_hour"); break;
      case day: t = table("values_day"); break;
      case month: t = table("values_month"); break;
      case year: t = table("values_year"); break;
    }

    Result result = query
            .select(field("stime"))
            .from(t)
            .where(field("datapoint_name").equal(datapointname))
            .and(field("meter_id").equal(meterId))
            .and(field("provider_account_id").equal(providerAccountId))
            .orderBy(field("stime").desc())
            .limit(1)
            .fetch();

    ArrayList<ProviderAccountObject> accounts = new ArrayList();

    if ( result.isEmpty() )
    {
      conn.close();
      return null;
    }

    Record record = (Record) result.get(0);

    Timestamp tt = record.get(0, Timestamp.class);

    OffsetDateTime ret = OffsetDateTime.ofInstant(tt.toInstant(), ZoneId.of("UTC"));

    conn.close();//close databaseconnection
    return ret;
  }

  public static void saveInDatabase(Resolution resolution, List<TimeValueObject> timeValueObjects) throws Exception
  {
      DbConnector connector = new DbConnector(System.getenv("FPPSS_DB_URL"), System.getenv("FPPSS_DB_USER"), System.getenv("FPPSS_DB_PASSWORD"));

      connector.open();//open databaseconnection

      Connection conn = connector.getConnection();

      DSLContext query = DSL.using(conn);

      Table t = null;
      String primaryKey = "";

      switch (resolution)
      {
        case spontan: t = table("values_spontan"); break;
        case hour: t = table("values_hour"); break;
        case day: t = table("values_day"); break;
        case month: t = table("values_month"); break;
        case year: t = table("values_year"); break;
      }

      switch (resolution)
      {
        case spontan: primaryKey = "values_spontan_pk"; break;
        case hour: primaryKey = "values_hour_pk"; break;
        case day: primaryKey = "values_day_pk"; break;
        case month: primaryKey = "values_month_pk"; break;
        case year: primaryKey = "values_year_pk"; break;
      }

      for ( var timeValueObject : timeValueObjects )
      {
        try
        {
          query.insertInto(t)
                  .columns(field("stime"), field("meter_id"), field("datapoint_name"), field("provider_account_id"), field("value"), field("counter_value"), field("type"))
                  .values(Timestamp.valueOf(LocalDateTime.ofInstant(timeValueObject.getTimestamp().toInstant(), ZoneOffset.UTC)),
                          timeValueObject.getMeterId(),
                          timeValueObject.getDatapointname(),
                          timeValueObject.getProviderAccountId(),
                          timeValueObject.getValue(),
                          timeValueObject.getCounterValue(),
                          timeValueObject.getType())
                  .onConflictOnConstraint(constraint(primaryKey))
                  .doUpdate()
                  //.onDuplicateKeyUpdate()
                  .set(field("value"),timeValueObject.getValue())
                  .set(field("counter_value"), timeValueObject.getCounterValue())
                  .execute();
        }
        catch (Exception e)
        {
          if (e.getMessage().toUpperCase().contains("DUPLICATE"))
          {
            System.out.println("Entry already exist:"+ timeValueObjects.toString());
          }
          else
            e.printStackTrace();
        }
      }

      conn.close();//close databaseconnection
  }

  public static List<TimeValueObject> readValuesFromDatabase(Resolution resolution, Type type, Integer userId, LocalDateTime startdate, LocalDateTime enddate) throws Exception
  {
    KeycloakAuthenticationToken authentication =
            (KeycloakAuthenticationToken) SecurityContextHolder.getContext().getAuthentication();

    Principal principal = (Principal) authentication.getPrincipal();

    if (principal instanceof KeycloakPrincipal) {
      KeycloakPrincipal<KeycloakSecurityContext> kPrincipal = (KeycloakPrincipal<KeycloakSecurityContext>) principal;
      IDToken token = kPrincipal.getKeycloakSecurityContext().getIdToken();
;
      System.out.println("name: "+principal.getName());
      System.out.println("name: "+kPrincipal.getName());
      System.out.println("name: "+kPrincipal.getKeycloakSecurityContext().getToken().getName());
      System.out.println("name: "+kPrincipal.getKeycloakSecurityContext().getToken().getPreferredUsername());
      System.out.println("name: "+kPrincipal.getKeycloakSecurityContext().getToken().getEmail());
    }

    DbConnector connector = new DbConnector(System.getenv("FPPSS_DB_URL"), System.getenv("FPPSS_DB_USER"), System.getenv("FPPSS_DB_PASSWORD"));

    connector.open();//open databaseconnection

    Connection conn = connector.getConnection();

    DSLContext query = DSL.using(conn);

    Table t = null;

    switch (resolution)
    {
      case spontan: t = table("values_spontan"); break;
      case hour: t = table("values_hour"); break;
      case day: t = table("values_day"); break;
      case month: t = table("values_month"); break;
      case year: t = table("values_year"); break;
    }

    Result result = query
            .select(field("v.counter_value"),field("v.datapoint_name"),field("v.meter_id"),
                    field("v.provider_account_id"), field("v.stime"),field("v.type"), field("v.value"))
            .from(t.as("v"))
            .join(table("provider_accounts").as("pa")).on(field("v.provider_account_id").equal(field("pa.id")))
            .join(table("provider").as("p")).on(field("pa.provider_id").equal(field("p.id")))
            .join(table("users").as("u")).on(field("pa.user_id").equal(field("u.id")))
            .where(field("u.id").equal(userId))
            .and(field("v.type").equal(type.ordinal()))
            .and(field("stime").greaterOrEqual(startdate))
            .and(field("stime").lessThan(enddate))
            .orderBy(field("v.stime").asc())
            .fetch();

    List<TimeValueObject> values = new ArrayList<>();

    if ( result.isEmpty() )
    {
      conn.close();
      return null;
    }

    for ( int i = 0; i < result.size(); i++ )
    {
      Record record = (Record) result.get(i);

      var tvo = new TimeValueObject();
      tvo.setCounterValue(record.get(field("v.counter_value"), BigDecimal.class));
      tvo.setDatapointname(record.get(field("v.datapoint_name"), String.class));
      tvo.setMeterId(record.get(field("v.meter_id"), String.class));
      tvo.setProviderAccountId(record.get(field("v.provider_account_id"), Integer.class));

      tvo.setType(record.get(field("v.type"), Integer.class));
      tvo.setValue(record.get(field("v.value"), BigDecimal.class));

      Timestamp tt = record.get(field("v.stime"), Timestamp.class);

      OffsetDateTime ret = OffsetDateTime.ofInstant(tt.toInstant(), ZoneId.of("UTC"));

      tvo.setTimestamp(ret);

      values.add(tvo);
    }

    conn.close();//close databaseconnection
    return values;
  }

  //resolution of timerange
  public enum Resolution
  {
    spontan,
    hour,
    day,
    month,
    year
  }

  public enum Type
  {
    Consumption,
    Feedin,
    Production
  }
}

