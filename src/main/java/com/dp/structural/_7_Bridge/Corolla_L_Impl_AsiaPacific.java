package com.dp.structural._7_Bridge;

public class Corolla_L_Impl_AsiaPacific extends AbstractCorollaImpl {

  @Override
  void listSafetyEquipment() {
    System.out.println("Not so safe.");
  }

  @Override
  boolean isCarRightHanded() {
    return false;
  }
}
 

