package com.zoo.klass;

import com.zoo.animal;

public class pticy extends animal {

  public void say() {
    System.out.println(this.name + ": кар-кар");
  }

  public void wayOfMoving() {
    System.out.println(this.name + ":" + this.pawsAvailability + " и они бегают");
  }

  public void wings() {
    System.out.println(this.name + ": у меня есть крылья");
  }

  public void flight() {
    System.out.println(this.name + ": я умею летать");
  }
}
