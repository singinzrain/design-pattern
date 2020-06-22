package com.dp.creational._2_Singleton;

public class AirforceOne_static {

  // The sole instance of the class
  private static AirforceOne_static onlyInstance = new AirforceOne_static();

  // Make the constructor private so its only accessible to
  // members of the class.
  private AirforceOne_static() {
  }

  // Create a static method for object creation
  // static problem: creates the object even if it's not used in a particular run of the application.
  // cost performance
  public static AirforceOne_static getInstance() {
    return onlyInstance;
  }

  public void fly() {
    System.out.println("Airforce one is flying...");
  }
}
