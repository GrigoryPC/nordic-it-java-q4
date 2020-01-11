package com.homework12zoo.exceptions;

public class WrongNumberCageException extends Exception {
  public WrongNumberCageException() {
    super("Вы ввели неверный номер клетки");
  }
}
