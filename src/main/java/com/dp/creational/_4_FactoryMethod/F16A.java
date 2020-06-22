package com.dp.creational._4_FactoryMethod;

import com.dp.creational._3_Prototype.F16AEngine;

public class F16A extends F16 {

  @Override
  public F16 makeF16() {
    super.makeF16();
    engine = new F16AEngine();
    return this;
  }
}
