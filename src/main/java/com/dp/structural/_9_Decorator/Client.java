package com.dp.structural._9_Decorator;

public class Client {

  public void main() {
    IAircraft simpleBoeing = new Boeing747();
    IAircraft luxuriousBoeing = new LuxuryFittings(simpleBoeing);
    IAircraft bulletProofBoeing = new BulletProof(luxuriousBoeing);
    float netWeight = bulletProofBoeing.getWeight();
    System.out.println("Final weight of the plane: " + netWeight);
  }
}
