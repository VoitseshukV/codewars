package org.example;

import java.util.stream.Collectors;

public class Switch {
  public static String switcheroo(String x) {
    return x.chars()
            .mapToObj(value -> (char) value)
            .map(character -> switch (character) {
              case ('a') -> "b";
              case ('b') -> "a";
              default -> "" + character;
            })
            .collect(Collectors.joining());
  }
}