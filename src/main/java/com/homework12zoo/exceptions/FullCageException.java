package com.homework12zoo.exceptions;

public class FullCageException extends Exception {
  public FullCageException() {
    super("Клетка заполнена");
  }
}
