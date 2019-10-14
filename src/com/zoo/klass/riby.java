package com.zoo.klass;

import com.zoo.animal;

public class riby extends animal {

  public void say() {
    System.out.println(this.name + ": буль-буль");
  }

  public void wayOfMoving() {
    System.out.println(this.name + ":" + this.pawsAvailability + " и они плавают");
  }
}
