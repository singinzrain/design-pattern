package com.dp.structural._8_composite;

import java.util.ArrayList;
import java.util.List;

public class Airforce implements IAlliancePart {

  List<IAlliancePart> planes = new ArrayList<>();

  public void add(IAlliancePart alliancePart) {
    planes.add(alliancePart);
  }

  @Override
  public int getPersonnel() {

    // We iterator over the entire air force which can
    // contain leaf nodes (planes) or other composites
    // (air forces). This iteration is an example of an
    // internal iterator.
    int staff = 0;

    for (IAlliancePart plane : planes) {
      staff += plane.getPersonnel();
    }
    return staff;
  }
}
