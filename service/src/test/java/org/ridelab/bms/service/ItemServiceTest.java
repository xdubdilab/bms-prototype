package org.ridelab.bms.service;

import lombok.val;
import org.junit.Test;
import org.ridelab.bms.service.impl.ItemServiceImpl;

import static org.junit.Assert.*;

public class ItemServiceTest {

  private final ItemService itemService = new ItemServiceImpl();

  @Test
  public void getOneById() {
    val result = itemService.findOneById(1L);
    assertTrue(result.isPresent());
    assertEquals(1L, result.get().getId());
  }

  @Test
  public void getOneByIdNonexistent() {
    val result = itemService.findOneById(-1L);
    assertFalse(result.isPresent());
  }

  @Test
  public void findAllByName() {
    val result = itemService.findAllByName("nothing");
    assertTrue(result.iterator().hasNext());
    assertEquals("nothing", result.iterator().next().getName());
  }

}
