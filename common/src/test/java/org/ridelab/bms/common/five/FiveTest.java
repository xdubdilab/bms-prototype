package org.ridelab.bms.common.five;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import org.ridelab.bms.common.five.Five;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class FiveTest {

  @Test
  public void five() {
    assertEquals(5, Five.five());
  }

  @Test
  public void isFive() {
    assertTrue(Five.isFive(5));
    assertFalse(Five.isFive(6));
  }

  @Test
  public void multilingual() {
    assertTrue(StringUtils.isNoneBlank(
      Five.esperanto(),
      Five.greek(),
      Five.pinyin(),
      Five.morseCode(),
      Five.oclock()
    ));
  }

}
