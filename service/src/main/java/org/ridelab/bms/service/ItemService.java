package org.ridelab.bms.service;

import org.ridelab.bms.entity.Item;

import java.util.Optional;

public interface ItemService {

  /**
   * Find one by id
   *
   * @param id id
   * @return found item
   */
  Optional<Item> findOneById(long id);

  /**
   * Find all by name
   *
   * @param name name
   * @return found items
   */
  Iterable<Item> findAllByName(String name);

}
