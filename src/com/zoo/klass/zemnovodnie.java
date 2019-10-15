package com.zoo.klass;

import com.zoo.animal;

public class zemnovodnie extends animal {

  public void say() {
    System.out.println(this.name + ": ква-ква");
  }

  public void wayOfMoving() {
    System.out.println(this.name + ":" + this.pawsAvailability + " и они прыгают");
  }

  public void food() {
    System.out.println(this.name + ": я питаюсь насекомыми");
  }

  public void birth() {
    System.out.println(this.name + ": я рождаюсь из икры и становлюсь головастиком");

  }
}
