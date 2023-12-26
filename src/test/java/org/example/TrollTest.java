package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TrollTest {
    @Test
    public void FixedTests() {
        assertEquals("Ths wbst s fr lsrs LL!",Troll.disEmVowel("This website is for losers LOL!")
                                      );
        assertEquals("N ffns bt,\nYr wrtng s mng th wrst 'v vr rd", Troll.disEmVowel(
              "No offense but,\nYour writing is among the worst I've ever read"));
        assertEquals( "Wht r y,  cmmnst?", Troll.disEmVowel("What are you, a communist?"));
    }
}