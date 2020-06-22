package com.dp.behavioural._23_Visitor;

public class F16 implements IAircraft {

  @Override
  public void accept(IAircraftVisitor visitor) {
    visitor.visitF16(this);
  }
}
