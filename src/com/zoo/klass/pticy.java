package com.zoo.klass;

import com.zoo.animal;

public class pticy extends animal {

  public void say() {
    System.out.println(this.name + ": кар-кар");
  }

  public void wayOfMoving() {
    System.out.println(this.name + ":" + this.pawsAvailability + " и они бегают");
  }
}
