package com.dp.behavioural._14_Observer;

public interface ISubject {

  void addObserver(IObserver observer);

  void removeObserver(IObserver observer);

  void notifyObservers();
}
