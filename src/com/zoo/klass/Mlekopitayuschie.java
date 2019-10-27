package com.zoo.klass;

import com.zoo.animal;

public class mlekopitayuschie extends animal {

  public void say() {
    System.out.println(this.name + ": привет");
  }

  public void wayOfMoving() {
    System.out.println(this.name + ":" + this.pawsAvailability + " и они бегают");
  }

  public void pol() {
    System.out.println(this.name + ": мужской пол");
  }

  public void vozrast() {
    System.out.println(this.name + ": 30 лет");
  }

}
