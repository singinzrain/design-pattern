package com.dp.behavioural._17_Iterator;

import com.dp.structural._9_Decorator.IAircraft;

import java.util.List;


public class JetsIterator implements Iterator {
  public JetsIterator(List<IAircraft> jets) {
  }

  @Override
  public IAircraft next() {
    return null;
  }

  @Override
  public boolean hasNext() {
    return false;
  }
}
