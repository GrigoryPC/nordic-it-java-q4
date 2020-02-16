package com.homework18;

import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;

public class MoverCallable implements Callable<Integer> {
  private LinkedBlockingDeque<Integer> queue;
  private LinkedBlockingDeque<Integer> vector;

  public MoverCallable(LinkedBlockingDeque<Integer> queue, LinkedBlockingDeque<Integer> vector) {
    super();
    this.queue = queue;
    this.vector = vector;
  }

  @Override
  public Integer call() throws Exception {

    var countMoney = 0;
    var count = 0;
    var counts = queue.poll();

    while (count != 0) {
      var pollMoney = vector.poll();
      countMoney += pollMoney;
      counts++;
    }

    var result = countMoney;

    return result;
  }

}
