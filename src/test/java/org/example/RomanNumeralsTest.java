package org.example;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RomanNumeralsTest {

    @Test
    public void testToRoman() throws Exception {
        assertThat("1 converts to 'I'", RomanNumerals.toRoman(1), is("I"));
        assertThat("2 converts to 'II'", RomanNumerals.toRoman(2), is("II"));
        assertThat("9 converts to 'IX'", RomanNumerals.toRoman(9), is("IX"));
        assertThat("2942 converts to 'MMCMXLII'", RomanNumerals.toRoman(2942), is("MMCMXLII"));
    }

    @Test
    public void testFromRoman() throws Exception {
        assertThat("'I' converts to 1", RomanNumerals.fromRoman("I"), is(1));
        assertThat("'II' converts to 2", RomanNumerals.fromRoman("II"), is(2));
        assertThat("'IX' converts to 9", RomanNumerals.fromRoman("IX"), is(9));
        assertThat("'MMCMXLII' converts to 2942", RomanNumerals.fromRoman("MMCMXLII"), is(2942));
    }
}