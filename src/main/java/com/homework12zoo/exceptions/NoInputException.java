package com.homework12zoo.exceptions;

public class NoInputException extends Exception {
  public NoInputException() {
    super("Вы ничего не ввели");
  }
}
