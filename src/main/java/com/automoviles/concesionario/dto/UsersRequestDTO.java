package com.automoviles.concesionario.dto;

public class UsersRequestDTO {
  private String branch;
  private String price;
  private String version;

  public UsersRequestDTO(String branch, String price, String version) {
    this.branch = branch;
    this.price = price;
    this.version = version;
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
