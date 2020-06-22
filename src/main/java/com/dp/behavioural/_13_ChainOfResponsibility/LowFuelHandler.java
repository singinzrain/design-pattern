package com.dp.behavioural._13_ChainOfResponsibility;


public class LowFuelHandler extends AbstractHandler {
  public LowFuelHandler(AbstractHandler o) {
    super(o);
  }
}
