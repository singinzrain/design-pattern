package com.dp.behavioural._23_Visitor;

public interface IAircraft {

  // Each concrete element class is expected to
  // define the accept method
  void accept(IAircraftVisitor visitor);

}
