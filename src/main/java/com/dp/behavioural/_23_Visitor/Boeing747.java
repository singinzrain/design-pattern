package com.dp.behavioural._23_Visitor;

public class Boeing747 implements IAircraft {

  @Override
  public void accept(IAircraftVisitor visitor) {
    visitor.visitBoeing747(this);
  }
}
