package com.automoviles.concesionario.repository;

public class UsersRepository {
  public static final String INSERT_USER = "INSERT INTO user (name, email, phone, address) VALUES (?,?,?,?)";

  public static final String GET_USERS = "SELECT * FROM users";
}
