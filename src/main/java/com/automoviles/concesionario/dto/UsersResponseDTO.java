package com.automoviles.concesionario.dto;

public class UsersResponseDTO {
  private long id;
  private String branch;
  private String price;
  private String version;

  public UsersResponseDTO(long id, String branch, String price, String version) {
    this.id = id;
    this.branch = branch;
    this.price = price;
    this.version = version;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getBranch() {
    return branch;
  }

  public void setBranch(String branch) {
    this.branch = branch;
  }

  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  
}
