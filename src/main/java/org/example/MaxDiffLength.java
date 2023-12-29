package org.example;

import java.util.Arrays;

class MaxDiffLength {
    public static int mxdiflg(String[] a1, String[] a2) {
        if (a1.length == 0 || a2.length == 0) {
            return -1;
        }
        return Math.max(
                Arrays.stream(a1)
                        .mapToInt(String::length)
                        .max().orElse(0) -
                Arrays.stream(a2)
                        .mapToInt(String::length)
                        .min().orElse(0),
                Arrays.stream(a2)
                        .mapToInt(String::length)
                        .max().orElse(0) -
                Arrays.stream(a1)
                        .mapToInt(String::length)
                        .min().orElse(0));
    }
}