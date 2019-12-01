package com.homework15;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

  public static void main(String[] args) throws InterruptedException {
    // Homework15 
    var count = new AtomicInteger();

    var poolThread = new ArrayList<Thread>();
    for (var i = 0; i < 20; i++) {

      var thread1 = new Thread (new RunClass());
      var thread2 = new Thread (new RunClass());
      var thread3 = new Thread (new RunClass());
      var thread4 = new Thread (new RunClass());
      var thread5 = new Thread (new RunClass());
      var thread6 = new Thread (new RunClass());

      thread1.start();
      thread2.start();

      thread1.join();
      thread2.join();

      thread3.start();
      thread3.join();

      thread4.start();
      thread5.start();

      thread4.join();
      thread5.join();

      thread6.start();
      poolThread.add(thread6);

    }
    for (var thread6 : poolThread) {
      thread6.join();
    }
    System.out.println(count);
  }
}
