package com.dp.creational._5_AbstractFactory;

import com.dp.creational._4_FactoryMethod.ICockpit;

public class Aircraft {

  IEngine engine;
  ICockpit cockpit;
  IWings wings;
  IAircraftFactory factory;

  public Aircraft(IAircraftFactory factory) {
    this.factory = factory;
  }

  protected Aircraft makeAircraft() {
    engine = factory.createEngine();
    cockpit = factory.createCockpit();
    wings = factory.createWings();
    return this;
  }

  private void taxi() {
    System.out.println("Taxing on runway");
  }

  public void fly() {
    Aircraft aircraft = makeAircraft();
    aircraft.taxi();
    System.out.println("Flying");
  }
}