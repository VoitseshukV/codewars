package org.example;

// Replace all vowel to exclamation mark in the sentence.
public class VowelsToExclamationMark {
    public static String replace(final String s) {
        return s.replaceAll("(?i)[aeiou]","!");
    }
}