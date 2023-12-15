package org.example;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LeapYearTest
{
  
  @Test
  public void testYear2020()
  {
      assertTrue(LeapYears.isLeapYear(2020));
  }
  
  @Test
  public void testYear2000()
  {
      assertTrue(LeapYears.isLeapYear(2000));
  }
  
  @Test
  public void testYear2015()
  {
      assertFalse(LeapYears.isLeapYear(2015));
  }
    
  @Test
  public void testYear2100()
  {
      assertFalse(LeapYears.isLeapYear(2100));
  }
}
