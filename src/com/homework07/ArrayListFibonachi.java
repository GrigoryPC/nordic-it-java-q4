package com.homework07;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListFibonachi {

  public static void main(String[] args) {
    // Homework 07. Array list for Fibonachi
    var arrayContain = arrayFibonachi();
    arrayPrint(arrayContain);


    System.out.println("Введите число n больше 0 для расчета факториала при помощи рекурсии");
    Scanner scanner = new Scanner(System.in);

    var n = scanner.nextInt();
    scanner.close();

    System.out.println("Факторил " + n + " = " + Faktorial(n));

  }

  public static int Faktorial(int n) {
    if (n == 0 || n == 1)
      return 1;
    return n * Faktorial(n - 1);
  }


  public static void arrayPrint(ArrayList<Integer> arrayContain) {
    System.out.println("Массив для чисел Фибоначчи до 30");
    System.out.println(arrayContain);
  }

  public static ArrayList<Integer> arrayFibonachi() {
    var arrayContain = new ArrayList<Integer>(30);
    var Fibonachi0 = 0;
    var Fibonachi1 = 1;
    for (var i = 0; i < 31; i++) {
      var FibonachiX = i - 1;
      arrayContain.add(FibonachiX);
    }
    arrayContain.set(0, Fibonachi0);
    arrayContain.set(1, Fibonachi1);
    return arrayContain;
  }

}
