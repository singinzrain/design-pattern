package com.dp.structural._7_Bridge;

public abstract class AbstractCorolla {

  protected AbstractCorollaImpl corollaImpl;

  public AbstractCorolla(AbstractCorollaImpl corollaImpl) {
    this.corollaImpl = corollaImpl;
  }

  public void setCorollaImpl(AbstractCorollaImpl corollaImpl) {
    this.corollaImpl = corollaImpl;
  }

  abstract void listSafetyEquipment();

  abstract boolean isCarRightHanded();
}
