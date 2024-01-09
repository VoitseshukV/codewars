package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DecToolsTests {
  @Test
  public void Digits() {
    assertEquals(1,  DecTools.Digits(5l));
    assertEquals(5,  DecTools.Digits(12345l));
    assertEquals(10, DecTools.Digits(9876543210l));
  }
}