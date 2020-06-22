package com.dp.creational._4_FactoryMethod;

import com.dp.creational._3_Prototype.F16BEngine;

public class F16B extends F16 {

  @Override
  public F16 makeF16() {
    super.makeF16();
    engine = new F16BEngine();
    return this;
  }
}
