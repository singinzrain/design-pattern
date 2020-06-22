package com.dp.behavioural._17_Iterator;

import com.dp.structural._9_Decorator.IAircraft;

public interface Iterator {

  IAircraft next();

  boolean hasNext();
}
