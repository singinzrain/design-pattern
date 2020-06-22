package com.dp.creational._2_Singleton;

public class AirforceOne_lazy {

  // The sole instance of the class
  private static AirforceOne_lazy onlyInstance;

  // Make the constructor private so its only accessible to
  // members of the class.
  private AirforceOne_lazy() {
  }

  // Create a static method for object creation
//  public static AirforceOne_lazy getInstance() {
  // synchronized problem: expensive
  public synchronized static AirforceOne_lazy getInstance() {

    // Only instantiate the object when needed.
    if (onlyInstance == null) {
      onlyInstance = new AirforceOne_lazy();
    }

    return onlyInstance;
  }

  public void fly() {
    System.out.println("Airforce one is flying...");
  }
}
