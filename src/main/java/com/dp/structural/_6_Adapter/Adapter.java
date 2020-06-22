package com.dp.structural._6_Adapter;

public class Adapter implements IAircraft {

  HotAirBalloon hotAirBalloon;

  public Adapter(HotAirBalloon hotAirBalloon) {
    this.hotAirBalloon = hotAirBalloon;
  }

  @Override
  public void fly() {
    String feulUsed = hotAirBalloon.inflateWithGas();
    hotAirBalloon.fly(feulUsed);
  }
}
