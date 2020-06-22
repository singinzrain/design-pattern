package com.dp.behavioural._23_Visitor;

import java.util.ArrayList;
import java.util.List;

public class Airforce {

  // Holds a collection of planes
  private List<IAircraft> planes = new ArrayList<>();

  // Returns an iterator to its collection of planes
  public List<IAircraft> getPlanes() {
    return planes;
  }
}
