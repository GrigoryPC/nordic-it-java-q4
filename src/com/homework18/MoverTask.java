package com.homework17;

import java.util.concurrent.LinkedBlockingDeque;

public class MoverTask implements Runnable {
  private LinkedBlockingDeque<Integer> queue;
  private LinkedBlockingDeque<Integer> vector;

  public MoverTask(LinkedBlockingDeque<Integer> queue, LinkedBlockingDeque<Integer> vector) {
    super();
    this.queue = queue;
    this.vector = vector;
  }

  @Override
  public void run() {
    while (moveElement()) {
      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
        System.out.println("Stop");
        return;
      }
    }
  }

  private boolean moveElement() {

    var element = queue.poll();

    if (queue != null) {
      vector.add(element);
      return true;
    } else {
      return false;
    }
  }
}
