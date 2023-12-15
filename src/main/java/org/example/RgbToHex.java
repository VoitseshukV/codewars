package org.example;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RgbToHex {

    public static String rgb(int r, int g, int b) {
        return Stream.of(r, g, b)
                .map(value -> Integer.min(255, value))
                .map(value -> Integer.max(0, value))
                .map(value -> String.format("%02X", value))
                .collect(Collectors.joining());
    }
}