package com.petclinic.PetClinic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@AllArgsConstructor
@Data
@ToString(exclude = "password")
public class User {

  private String login;
  private String password;
  private String name;

}
