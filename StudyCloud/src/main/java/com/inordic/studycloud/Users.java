package com.inordic.studycloud;

import org.springframework.beans.factory.annotation.Autowired;
import lombok.Data;

@Data
public class Users {

  @Autowired
  private String name;
  private String login;
  private String password;

}