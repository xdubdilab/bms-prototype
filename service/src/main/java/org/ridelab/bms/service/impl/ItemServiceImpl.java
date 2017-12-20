package org.ridelab.bms.service.impl;

import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.apache.commons.lang3.RandomUtils;
import org.ridelab.bms.entity.Item;
import org.ridelab.bms.service.ItemService;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Slf4j
public class ItemServiceImpl implements ItemService {

  @Override
  public Optional<Item> findOneById(long id) {

    if (id < 0) {

      logger.debug("Can't find item with negative id {}", id);

      return Optional.empty();

    } else {

      val item = Item.of("nothing", id);

      logger.debug("Found item {}", item);

      return Optional.of(item);
    }
  }

  @Override
  public Iterable<Item> findAllByName(String name) {

    val items = IntStream.range(1, RandomUtils.nextInt(5, 10)).
      mapToObj(i -> Item.of(name, RandomUtils.nextInt())).
      sorted(Comparator.comparingLong(Item::getId)).
      collect(Collectors.toList());

    logger.debug("Found items <size = {}> {}", items.size(), items);

    return items;
  }

}
