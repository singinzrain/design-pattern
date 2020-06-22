package com.dp.structural._7_Bridge;

public class Client {

  public void main() {

    AbstractCorolla myCorolla = new Corolla_L(new Corolla_L_Impl_AsiaPacific());
    System.out.println(myCorolla.isCarRightHanded());

    myCorolla.setCorollaImpl(new Corolla_L_Impl_NorthAmerica());
    System.out.println(myCorolla.isCarRightHanded());
  }
}
