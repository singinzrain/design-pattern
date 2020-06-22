package com.dp.behavioural._16_Command;


public class LandingGearUpCommand implements Command {
  LandingGear landingGear;

  public LandingGearUpCommand(LandingGear landingGear) {
    this.landingGear = landingGear;
  }

  @Override
  public void execute() {
    landingGear.up();
  }
}
