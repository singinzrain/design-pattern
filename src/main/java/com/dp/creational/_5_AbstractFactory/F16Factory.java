package com.dp.creational._5_AbstractFactory;

import com.dp.creational._4_FactoryMethod.F16Cockpit;
import com.dp.creational._4_FactoryMethod.ICockpit;

public class F16Factory implements IAircraftFactory {

  @Override
  public IEngine createEngine() {
    return new F16Engine();
  }

  @Override
  public IWings createWings() {
    return new F16Wings();
  }

  @Override
  public ICockpit createCockpit() {
    return new F16Cockpit();
  }
}
