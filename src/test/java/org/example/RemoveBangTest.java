package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RemoveBangTest {
  @Test
  public void testBasic() {
    assertEquals("nothing to do", RemoveBang.removeBang("nothing to do"));
    assertEquals("should remove bangs from the end of words", "No seriously Seriously Wow", RemoveBang.removeBang("No seriously! Seriously!! Wow"));
    assertEquals("should remove bangs from the end of words only", "!!No seriously !Seriously !!Wow", RemoveBang.removeBang("!!No! seriously! !Seriously!! !!Wow!"));
  }
}