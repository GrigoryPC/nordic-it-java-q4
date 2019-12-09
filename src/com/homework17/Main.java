package com.homework17;

import java.util.ArrayList;
import java.util.Vector;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;

public class Main {

  public static void main(String[] args) throws InterruptedException {
    // Homework17 

    var queue = new LinkedBlockingDeque<Integer>();
    var vector = new LinkedBlockingDeque<Integer>();

    for (int i = 0; i < 500; i++) {
      queue.put(i);
    }
    var executorService = Executors.newFixedThreadPool(4);

    for (int i = 0; i < 4; i++) {
      executorService.execute(new MoverTask(queue, vector));
    }
    executorService.shutdown();

    System.out.println(queue.size());
    System.out.println(vector);
    System.out.println(vector.size());
  }
}
