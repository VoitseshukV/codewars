package org.example;

import java.util.Arrays;

public class CuckooClock {
  public static String cuckooClock(String inputTime, int chimes) {
    int[] parts = Arrays.stream(inputTime.split(":"))
            .mapToInt(Integer::valueOf)
            .toArray();
    if (parts.length != 2) {
      throw new RuntimeException("Invalid time format: " + inputTime);
    }
    return chimeNext(parts[0], parts[1], chimes);
  }

  private static String chimeNext(int hours, int minutes, int chimes) {
    int currentChimes;
    int nextMinutes;
    int nextHours = hours;
    if (minutes < 15) {
      nextMinutes = 15;
    } else if (minutes < 30) {
      nextMinutes = 30;
    } else if (minutes < 45) {
      nextMinutes = 45;
    } else {
      nextMinutes = 0;
      nextHours++;
      if (nextHours > 12) {
        nextHours = 1;
      }
    }
    currentChimes = switch (minutes) {
      case 0: yield hours;
      case 15, 30, 45: yield 1;
      default: yield 0;
    };
    if (currentChimes >= chimes) {
      return String.format("%02d:%02d", hours, minutes);
    } else {
      return chimeNext(nextHours, nextMinutes, chimes - currentChimes);
    }
  }
}