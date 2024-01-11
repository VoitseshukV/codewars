package org.example;

import java.util.stream.IntStream;

public class MaxProduct {
  public int adjacentElementsProduct(int[] array) {
    return IntStream.range(0, array.length - 1)
            .map(i -> array[i] * array[i + 1])
            .max().getAsInt();
  }
}