package com.homework15;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

  public static void main(String[] args) throws InterruptedException {
    // Homework15 
    var count = new AtomicInteger();

    var poolThread = new ArrayList<Thread>();
    
    threadsRun(count, poolThread);
    
    System.out.println(count);
  }

  public static void threadsRun(AtomicInteger count, ArrayList<Thread> poolThread)
      throws InterruptedException {
    for (var i = 0; i < 20; i++) {

      var thread1 = new Thread(new Runnable() {
        @Override
        public void run() {
          count.getAndIncrement();
        }
      });

      var thread2 = new Thread(new Runnable() {
        @Override
        public void run() {
          count.getAndIncrement();
        }
      });

      var thread3 = new Thread(new Runnable() {
        @Override
        public void run() {
          count.getAndIncrement();
        }
      });

      var thread4 = new Thread(new Runnable() {
        @Override
        public void run() {
          count.getAndIncrement();
        }
      });

      var thread5 = new Thread(new Runnable() {
        @Override
        public void run() {
          count.getAndIncrement();
        }
      });
      var thread6 = new Thread(new Runnable() {
        @Override
        public void run() {
          count.getAndIncrement();
        }
      });

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
  }
}
