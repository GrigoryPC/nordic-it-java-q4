package com.inordic.studycloud;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;

@Data
public class UserFile {

  @Autowired
  private String fileName;
  private long id;

}
