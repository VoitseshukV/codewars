package org.example;

import java.util.stream.Collector;

public class Troll {
    public static String disEmVowel(String str) {
        return str.chars()
                .mapToObj(value -> (char) value)
                .filter(character -> "AEIOUaeiou".indexOf(character) == -1)
                .collect(Collector.of(
                        StringBuilder::new,
                        StringBuilder::append,
                        StringBuilder::append,
                        StringBuilder::toString));
    }
}