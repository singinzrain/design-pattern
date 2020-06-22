package com.dp.creational._5_AbstractFactory;

import com.dp.creational._4_FactoryMethod.ICockpit;

public class Boeing747Factory implements IAircraftFactory {

  @Override
  public IEngine createEngine() {
    return new Boeing747Engine();
  }

  @Override
  public IWings createWings() {
    return new Boeing747Wings();
  }

  @Override
  public ICockpit createCockpit() {
    return new Boeing747Cockpit();
  }

  private class Boeing747Engine implements IEngine {
    @Override
    public void start() {

    }
  }

  private class Boeing747Wings implements IWings {
  }

  private class Boeing747Cockpit implements ICockpit {
  }
}
