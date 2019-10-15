package com.zoo.klass;

import com.zoo.animal;

public class nasekomie extends animal {

  public void say() {
    System.out.println(this.name + ": тКтКтК");
  }

  public void wayOfMoving() {
    System.out.println(this.name + ":" + this.pawsAvailability + " и они бегают");
  }

  public void color() {
    System.out.println(this.name + ": у меня красный цвет");
  }

  public void dlina() {
    System.out.println(this.name + ": моя длина 60 мм");
  }
}

