package com.dp.creational._5_AbstractFactory;

import com.dp.creational._4_FactoryMethod.ICockpit;

public interface IAircraftFactory {

  IEngine createEngine();

  IWings createWings();

  ICockpit createCockpit();
}
