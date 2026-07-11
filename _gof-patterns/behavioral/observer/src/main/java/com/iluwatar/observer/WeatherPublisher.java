package com.iluwatar.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class WeatherPublisher {
  public abstract void addObserver(WeatherObserver obs);
  public abstract void removeObserver(WeatherObserver obs);

  //Need to keep it abstract so its keeps private from outside,
  // not possible in an interface without defining a method body
  protected abstract void notifyObservers();
}
