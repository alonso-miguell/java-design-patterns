package com.iluwatar.command;

// Receiver
// Knows HOW to do the actual work. No pattern knowledge whatsoever.
public class Kitchen {

  public void prepareDish(String dish) {
    System.out.println("Kitchen: preparing " + dish);
  }

  public void cancelDish(String dish) {
    System.out.println("Kitchen: cancelling " + dish);
  }
}
