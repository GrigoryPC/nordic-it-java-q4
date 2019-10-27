package com.zoo.klass;

import com.zoo.animal;

public class riby extends animal {

  public void say() {
    System.out.println(this.name + ": буль-буль");
  }

  public void wayOfMoving() {
    System.out.println(this.name + ":" + this.pawsAvailability + " и они плавают");
  }
  
  public void tell() {
    System.out.println(this.name + ": на самом деле я не умею разговаривать");
  }

  public void kind() {
    System.out.println(this.name + ": я имераторский карп");
  }
  
}
