package com.homework07;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListFibonachi {

  public static void main(String[] args) {
    // Homework 07. Array list for Fibonachi
    var arrayContain = arrayFibonachi();
    arrayPrint(arrayContain);

    System.out        .println("Пожалуйста, введите положительное число для рекурсивного вычисления факториала");
    var scanner = new Scanner(System.in);
    var n = scanner.nextInt();
    
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
