package org.ridelab.bms.entity;

import lombok.Value;

@Value(staticConstructor = "of")
public class Item {

  String name;

  long id;

}
