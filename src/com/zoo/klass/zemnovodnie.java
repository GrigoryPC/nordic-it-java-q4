package com.zoo.klass;

import com.zoo.animal;

public class zemnovodnie extends animal {

  public void say() {
    System.out.println(this.name + ": ква-ква");
  }

  public void wayOfMoving() {
    System.out.println(this.name + ":" + this.pawsAvailability + " и они прыгают");
  }
}
