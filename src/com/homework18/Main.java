package com.homework18;

import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

public class Main {

  public static void main(String[] args) throws InterruptedException {
    // homework 18

    var queue = new LinkedBlockingDeque<Integer>();
    var vector = new LinkedBlockingDeque<Integer>();
    var random = new Random();


    for (int i = 0; i < 2000; i++) {
      queue.put(i);
      var randomNumber = random.ints(1, 1, 100).findFirst().getAsInt();
      vector.put(randomNumber);
    }

    var executorService = Executors.newFixedThreadPool(4);
    var counter1 = executorService.submit(new MoverCallable(queue, vector));
    var counter2 = executorService.submit(new MoverCallable(queue, vector));
    var counter3 = executorService.submit(new MoverCallable(queue, vector));
    var counter4 = executorService.submit(new MoverCallable(queue, vector));

    executorService.shutdown();

    try {
      var count1 = counter1.get();
      System.out.println("Касса №1 " + count1 + "руб.");
    } catch (ExecutionException e) {
      return;
    }

    try {
      var count2 = counter2.get();
      System.out.println("Касса №2 " + count2 + "руб.");
    } catch (ExecutionException e) {
      return;
    }

    try {
      var count3 = counter3.get();
      System.out.println("Касса №3 " + count3 + "руб.");
    } catch (ExecutionException e) {
      return;
    }

    try {
      var count4 = counter4.get();
      System.out.println("Касса №4 " + count4 + "руб.");
    } catch (ExecutionException e) {
      return;
    }

  }
}
