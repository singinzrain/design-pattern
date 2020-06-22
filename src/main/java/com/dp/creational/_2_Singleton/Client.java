package com.dp.creational._2_Singleton;

public class Client {

  public void main() {
    AirforceOne_lazy airforceOne = AirforceOne_lazy.getInstance();
    airforceOne.fly();
  }
}
