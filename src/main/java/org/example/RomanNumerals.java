package org.example;

import java.util.LinkedHashMap;
import java.util.Map;

public class RomanNumerals {
 
  public static String toRoman(int n) {
    Map<Integer, String> allDigits = allSteps();
    int remainder = n;
    StringBuilder result = new StringBuilder();
    for (Map.Entry<Integer, String> entry : allDigits.entrySet()) {
        if (remainder >= entry.getKey()) {
            int count = remainder / entry.getKey();
            result.append(entry.getValue().repeat(count));
            remainder -= entry.getKey() * count;
        }
    }
    return result.toString();
  }
  
  public static int fromRoman(String romanNumeral) {
    int result = 0;
    int stack = 0;
    int prevWeight = 0;
    for (char digit : romanNumeral.toCharArray()) {
      int weight = romanDigitWeight(digit);
      if (weight != prevWeight) {
        result += Integer.compare(prevWeight, weight) * stack;
        stack = 0;
      }
      stack += weight;
      prevWeight = weight;
    }
    result += stack;
    return result;
  }

  private static int romanDigitWeight(char digit) {
    return switch (digit) {
      case 'M' -> 1000;
      case 'D' -> 500;
      case 'C' -> 100;
      case 'L' -> 50;
      case 'X' -> 10;
      case 'V' -> 5;
      case 'I' -> 1;
      default -> 0;
    };
  }

  private static Map<Integer, String> allSteps() {
    Map<Integer, String> result = new LinkedHashMap<>();
    result.put(1000, "M");
    result.put(900, "CM");
    result.put(500, "D");
    result.put(400, "CD");
    result.put(100, "C");
    result.put(90, "XC");
    result.put(50, "L");
    result.put(40, "XL");
    result.put(10, "X");
    result.put(9, "IX");
    result.put(5, "V");
    result.put(4, "IV");
    result.put(1, "I");
    return result;
  }
}