package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class VowelsToExclamationMarkTest {
    @Test
    public void basicTests() {
        assertEquals("H!!",      VowelsToExclamationMark.replace("Hi!"));
        assertEquals("!H!! H!!", VowelsToExclamationMark.replace("!Hi! Hi!"));
        assertEquals("!!!!!",    VowelsToExclamationMark.replace("aeiou"));
        assertEquals("!BCD!",    VowelsToExclamationMark.replace("ABCDE"));
    }
}