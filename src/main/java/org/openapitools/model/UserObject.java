package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;


/**
 * UserObject
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-01T11:29:28.434168600+02:00[Europe/Vienna]")
public class UserObject   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("name")
  private String name;

  @JsonProperty("firstname")
  private String firstname;

  @JsonProperty("surename")
  private String surename;

  @JsonProperty("email")
  private String email;

  public UserObject id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * id of user
   * @return id
  */
  @ApiModelProperty(example = "1", value = "id of user")


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public UserObject name(String name) {
    this.name = name;
    return this;
  }

  /**
   * username
   * @return name
  */
  @ApiModelProperty(example = "hugo", value = "username")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UserObject firstname(String firstname) {
    this.firstname = firstname;
    return this;
  }

  /**
   * first name of user
   * @return firstname
  */
  @ApiModelProperty(example = "Hugo", value = "first name of user")


  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public UserObject surename(String surename) {
    this.surename = surename;
    return this;
  }

  /**
   * surename of user
   * @return surename
  */
  @ApiModelProperty(example = "Muster", value = "surename of user")


  public String getSurename() {
    return surename;
  }

  public void setSurename(String surename) {
    this.surename = surename;
  }

  public UserObject email(String email) {
    this.email = email;
    return this;
  }

  /**
   * email address of user
   * @return email
  */
  @ApiModelProperty(example = "a@b.xyz", value = "email address of user")


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserObject userObject = (UserObject) o;
    return Objects.equals(this.id, userObject.id) &&
        Objects.equals(this.name, userObject.name) &&
        Objects.equals(this.firstname, userObject.firstname) &&
        Objects.equals(this.surename, userObject.surename) &&
        Objects.equals(this.email, userObject.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, firstname, surename, email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserObject {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    firstname: ").append(toIndentedString(firstname)).append("\n");
    sb.append("    surename: ").append(toIndentedString(surename)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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

