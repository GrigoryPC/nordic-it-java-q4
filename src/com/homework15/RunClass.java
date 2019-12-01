package com.homework15;

import java.util.concurrent.atomic.AtomicInteger;

public class RunClass implements Runnable {
  private AtomicInteger count;

  public RunClass(AtomicInteger count) {
    this.count = count;
  }

  @Override
  public void run() {
    count.getAndIncrement();
  }
}
