package com.dp.creational._3_Prototype;

public interface IAircraftPrototype {

  void fly();

  IAircraftPrototype clone();

  void setEngine(F16Engine f16Engine);
}
