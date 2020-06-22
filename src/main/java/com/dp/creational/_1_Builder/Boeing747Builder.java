package com.dp.creational._1_Builder;

public class Boeing747Builder extends AircraftBuilder {

  Boeing747 boeing747;

  @Override
  public void buildCockpit() {

  }

  @Override
  public void buildEngine() {

  }

  @Override
  public void buildBathrooms() {

  }

  @Override
  public void buildWings() {

  }

  public IAircraft getResult() {
    return boeing747;
  }

  class Boeing747 extends IAircraft {

  }
}
