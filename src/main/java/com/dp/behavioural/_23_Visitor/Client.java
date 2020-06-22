package com.dp.behavioural._23_Visitor;

import java.util.List;

public class Client {

  public void main(Airforce airforce) {

    List<IAircraft> planes = airforce.getPlanes();
    MetricsVisitor aircraftVisitor = new MetricsVisitor();

    for (IAircraft plane : planes) {
      plane.accept(aircraftVisitor);
    }
    aircraftVisitor.printAccumulatedResults();
  }
}
