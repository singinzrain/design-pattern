package com.dp.structural._9_Decorator;

public class Boeing747 implements IAircraft {

  @Override
  public void fly() {
    System.out.println("Boeing-747 flying ...");
  }

  @Override
  public void land() {
    System.out.println("Boeing-747 landing ...");
  }

  @Override
  public float getWeight() {
    return baseWeight;
  }
}
