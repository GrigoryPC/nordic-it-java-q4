package com.classwork.homework26;

public class SimpleNumeric {
  public static boolean isSimple(Integer a) {

    // проверяем число на простоту
    if (a <= 1)
      return false;

    for (var i = 2; i * i <= a; i++) {
      if (a % i == 0)
        return false;
    }
    return true;
  }
}
