package com.dp.behavioural._17_Iterator;

import com.dp.structural._9_Decorator.Boeing747;
import com.dp.structural._9_Decorator.IAircraft;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AirForce {

  List<IAircraft> jets = new ArrayList<>();
  IAircraft[] helis = new IAircraft[1];
  LinkedList<Boeing747> cargo = new LinkedList<>();

  public AirForce() {
    jets.add(new F16());
    helis[0] = new CobraGunship();
    cargo.add(new Boeing747());
  }

  public List<IAircraft> getJets() {
    return jets;
  }

  public IAircraft[] getHelis() {
    return helis;
  }

  public LinkedList<Boeing747> getCargo() {
    return cargo;
  }

  // This method returns a concrete iterator that
  // traverses over the entire airforce planes.
  public Iterator createIterator() {
    return new AirForceIterator(this);

  }

  // This method returns a different concerete iterator
  // that traverses over only the jets in the airforce.
  public Iterator createJetsIterator() {
    return new JetsIterator(jets);

  }
}
