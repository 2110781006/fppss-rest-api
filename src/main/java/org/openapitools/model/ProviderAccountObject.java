package org.openapitools.model;

import java.io.ByteArrayOutputStream;
import java.security.AlgorithmParameters;
import java.security.SecureRandom;
import java.security.spec.KeySpec;
import java.sql.Connection;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.impl.DSL;
import org.openapitools.DbConnector;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

import static org.jooq.impl.DSL.*;


/**
 * ProviderAccountObject
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-09-15T21:38:43.045400+02:00[Europe/Vienna]")
public class ProviderAccountObject   {
  @JsonProperty("providerName")
  private String providerName;

  @JsonProperty("providerFullName")
  private String providerFullName;

  @JsonProperty("providerType")
  private Integer providerType;

  @JsonProperty("providerId")
  private Integer providerId;

  @JsonProperty("providerAccountId")
  private Integer providerAccountId;

  @JsonProperty("providerAccountUsername")
  private String providerAccountUsername;

  @JsonProperty("providerAccountPassword")
  private String providerAccountPassword;

  public ProviderAccountObject providerName(String providerName) {
    this.providerName = providerName;
    return this;
  }

  /**
   * provider short name
   * @return providerName
  */
  @ApiModelProperty(example = "nb", value = "provider short name")


  public String getProviderName() {
    return providerName;
  }

  public void setProviderName(String providerName) {
    this.providerName = providerName;
  }

  public ProviderAccountObject providerFullName(String providerFullName) {
    this.providerFullName = providerFullName;
    return this;
  }

  /**
   * provider full name
   * @return providerFullName
  */
  @ApiModelProperty(example = "Netz Burgenland", value = "provider full name")


  public String getProviderFullName() {
    return providerFullName;
  }

  public void setProviderFullName(String providerFullName) {
    this.providerFullName = providerFullName;
  }

  public ProviderAccountObject providerType(Integer providerType) {
    this.providerType = providerType;
    return this;
  }

  /**
   * provider type 0=energy provider, 1=inverter
   * @return providerType
  */
  @ApiModelProperty(example = "0", value = "provider type 0=energy provider, 1=inverter")


  public Integer getProviderType() {
    return providerType;
  }

  public void setProviderType(Integer providerType) {
    this.providerType = providerType;
  }

  public ProviderAccountObject providerId(Integer providerId) {
    this.providerId = providerId;
    return this;
  }

  /**
   * provider id
   * @return providerId
  */
  @ApiModelProperty(example = "1", value = "provider id")


  public Integer getProviderId() {
    return providerId;
  }

  public void setProviderId(Integer providerId) {
    this.providerId = providerId;
  }

  public ProviderAccountObject providerAccountId(Integer providerAccountId) {
    this.providerAccountId = providerAccountId;
    return this;
  }

  /**
   * id of provider account
   * @return providerAccountId
  */
  @ApiModelProperty(value = "id of provider account")


  public Integer getProviderAccountId() {
    return providerAccountId;
  }

  public void setProviderAccountId(Integer providerAccountId) {
    this.providerAccountId = providerAccountId;
  }

  public ProviderAccountObject providerAccountUsername(String providerAccountUsername) {
    this.providerAccountUsername = providerAccountUsername;
    return this;
  }

  /**
   * provider account user name
   * @return providerAccountUsername
  */
  @ApiModelProperty(example = "user", value = "provider account user name")


  public String getProviderAccountUsername() {
    return providerAccountUsername;
  }

  public void setProviderAccountUsername(String providerAccountUsername) {
    this.providerAccountUsername = providerAccountUsername;
  }

  public ProviderAccountObject providerAccountPassword(String providerAccountPassword) {
    this.providerAccountPassword = providerAccountPassword;
    return this;
  }

  /**
   * provider account user password
   * @return providerAccountPassword
  */
  @ApiModelProperty(example = "pass", value = "provider account user password")


  public String getProviderAccountPassword() {
    return providerAccountPassword;
  }

  public void setProviderAccountPassword(String providerAccountPassword) {
    this.providerAccountPassword = providerAccountPassword;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProviderAccountObject providerAccountObject = (ProviderAccountObject) o;
    return Objects.equals(this.providerName, providerAccountObject.providerName) &&
        Objects.equals(this.providerFullName, providerAccountObject.providerFullName) &&
        Objects.equals(this.providerType, providerAccountObject.providerType) &&
        Objects.equals(this.providerId, providerAccountObject.providerId) &&
        Objects.equals(this.providerAccountId, providerAccountObject.providerAccountId) &&
        Objects.equals(this.providerAccountUsername, providerAccountObject.providerAccountUsername) &&
        Objects.equals(this.providerAccountPassword, providerAccountObject.providerAccountPassword);
  }

  @Override
  public int hashCode() {
    return Objects.hash(providerName, providerFullName, providerType, providerId, providerAccountId, providerAccountUsername, providerAccountPassword);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProviderAccountObject {\n");
    
    sb.append("    providerName: ").append(toIndentedString(providerName)).append("\n");
    sb.append("    providerFullName: ").append(toIndentedString(providerFullName)).append("\n");
    sb.append("    providerType: ").append(toIndentedString(providerType)).append("\n");
    sb.append("    providerId: ").append(toIndentedString(providerId)).append("\n");
    sb.append("    providerAccountId: ").append(toIndentedString(providerAccountId)).append("\n");
    sb.append("    providerAccountUsername: ").append(toIndentedString(providerAccountUsername)).append("\n");
    sb.append("    providerAccountPassword: ").append(toIndentedString(providerAccountPassword)).append("\n");
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
   * Get all provider accounts
   * @return
   * @throws Exception
   */
  public static ArrayList<ProviderAccountObject> getProviderAccounts() throws Exception
  {
    DbConnector connector = new DbConnector(System.getenv("DB_URL"), System.getenv("DB_USER"), System.getenv("DB_PASSWORD"));

    connector.open();//open databaseconnection

    Connection conn = connector.getConnection();

    DSLContext query = DSL.using(conn);

    Result result = query
            .select(field("p.id").as("providerId"))
            .select(field("p.name").as("providerName"))
            .select(field("p.fullname").as("providerFullname"))
            .select(field("p.type").as("providerType"))
            .select(field("pa.id").as("providerAccountId"))
            .select(field("pa.username").as("providerAccountUsername"))
            .select(field("pa.password").as("providerAccountPassword"))
            .from(table("provider").as("p"))
            .leftOuterJoin(table("provider_accounts").as("pa")).on(field("p.id").equal(field("pa.id"))).fetch();

    ArrayList<ProviderAccountObject> accounts = new ArrayList();

    for (var r : result)
    {
      Record record = (Record) r;
      ProviderAccountObject providerAccountObject = new ProviderAccountObject();

      providerAccountObject.setProviderId(record.get(field("providerId"), Integer.class));
      providerAccountObject.setProviderName(record.get("providerName", String.class));
      providerAccountObject.setProviderFullName(record.get("providerFullname", String.class));
      providerAccountObject.setProviderType(record.get("providerType", Integer.class));
      providerAccountObject.setProviderAccountId(record.get("providerAccountId", Integer.class));
      providerAccountObject.setProviderAccountUsername(record.get("providerAccountUsername", String.class));
      providerAccountObject.setProviderAccountPassword(record.get("providerAccountPassword", String.class));

      accounts.add(providerAccountObject);
    }

    conn.close();//close databaseconnection

    return accounts;
  }

  /**
   * get all provideraccounts of given user
   * @param userId
   * @return
   * @throws Exception
   */
  public static ArrayList<ProviderAccountObject> getProviderAccounts(int userId) throws Exception
  {
    DbConnector connector = new DbConnector(System.getenv("DB_URL"), System.getenv("DB_USER"), System.getenv("DB_PASSWORD"));

    connector.open();//open database connection

    Connection conn = connector.getConnection();

    DSLContext query = DSL.using(conn);

    Result result = query
            .select(field("p.id").as("providerId"))
            .select(field("p.name").as("providerName"))
            .select(field("p.fullname").as("providerFullname"))
            .select(field("p.type").as("providerType"))
            .select(field("pa.id").as("providerAccountId"))
            .select(field("pa.username").as("providerAccountUsername"))
            .select(field("pa.password").as("providerAccountPassword"))
            .from(table("provider").as("p"))
            .leftOuterJoin(table("provider_accounts").as("pa")).on(field("p.id").equal(field("pa.id")))
            .where(field("pa.user_id").equal(userId))
            .fetch();

    ArrayList<ProviderAccountObject> accounts = new ArrayList();

    for (var r : result)
    {
      Record record = (Record) r;
      ProviderAccountObject providerAccountObject = new ProviderAccountObject();

      providerAccountObject.setProviderId(record.get(field("providerId"), Integer.class));
      providerAccountObject.setProviderName(record.get("providerName", String.class));
      providerAccountObject.setProviderFullName(record.get("providerFullname", String.class));
      providerAccountObject.setProviderType(record.get("providerType", Integer.class));
      providerAccountObject.setProviderAccountId(record.get("providerAccountId", Integer.class));
      providerAccountObject.setProviderAccountUsername(record.get("providerAccountUsername", String.class));
      providerAccountObject.setProviderAccountPassword(record.get("providerAccountPassword", String.class));

      accounts.add(providerAccountObject);
    }

    conn.close();//close databaseconnection

    return accounts;
  }

  public String getEncryptedPw()
  {
    try
    {
      SecureRandom random = new SecureRandom();
      byte[] salt = new byte[16];
      random.nextBytes(salt);

      SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
      KeySpec spec = new PBEKeySpec(System.getenv("FPPSS_KEY").toCharArray(), salt, 65536, 256);
      SecretKey tmp = factory.generateSecret(spec);
      SecretKey secret = new SecretKeySpec(tmp.getEncoded(), "AES");

      Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
      cipher.init(Cipher.ENCRYPT_MODE, secret);
      AlgorithmParameters params = cipher.getParameters();
      byte[] iv = params.getParameterSpec(IvParameterSpec.class).getIV();
      byte[] encryptedText = cipher.doFinal(this.providerAccountPassword.getBytes("UTF-8"));

      // concatenate salt + iv + ciphertext
      ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
      outputStream.write(salt);
      outputStream.write(iv);
      outputStream.write(encryptedText);

      // properly encode the complete ciphertext
      String s = new String(Base64.getEncoder().encodeToString(outputStream.toByteArray()));

      return s;
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
    return null;
  }
}

