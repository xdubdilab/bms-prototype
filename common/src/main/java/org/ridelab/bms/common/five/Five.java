package org.ridelab.bms.common.five;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import lombok.experimental.UtilityClass;

/**
 * A library to overcomplicate 5.
 *
 * @see <a href="https://github.com/jackdclark/five">five</a>
 */
@UtilityClass
@FieldDefaults(level = AccessLevel.PUBLIC)
public class Five {

  int five() {
    return 5;
  }

  boolean isFive(int n) {
    return five() == n;
  }

  String esperanto() {
    return "kvin";
  }

  String greek() {
    return "πέντε";
  }

  String pinyin() {
    return "wǔ";
  }

  String morseCode() {
    return ".....";
  }

  String oclock() {
    // CHECKSTYLE:OFF
    return "\uD83D\uDD54";
    // CHECKSTYLE:ON
  }

}
