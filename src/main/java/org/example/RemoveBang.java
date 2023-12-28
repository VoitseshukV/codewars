package org.example;

public class RemoveBang {
  public static String removeBang(String str) {
    return str.replaceAll("\\b!+", "");
  }
}