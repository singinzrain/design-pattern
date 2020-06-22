package com.dp.structural._8_composite;

public class F16 implements IAircraft, IAlliancePart {

  @Override
  public int getPersonnel() {
    // We need 2 pilots for F-16
    return 2;
  }
}
