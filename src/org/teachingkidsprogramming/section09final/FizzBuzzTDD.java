package org.teachingkidsprogramming.section09final;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzBuzzTDD
{
  //   For the numbers being tested, print out either that number, or,
  //    If that number is divisible by 3, then print the word 'Fizz', 
  //    If that number is divisible by 5, then print the word 'Buzz', 
  //    If that number is divisible by 3 and 5, then print the word 'FizzBuzz'
  //
  //    Write tests using the Assert object via the TDD style
  //
  //    For more complete directions see this page
  @Test
  public void test1Returns1()
  {
    String result = FizzBuzzTDD.convert(1);
    assertEquals("1", result);
  }
  public static String convert(int num)
  {
    if (num % 15 == 0)
      return "Fizz Buzz";
    else if (num % 3 == 0)
      return "Fizz";
    return num + "";
  }
  @Test
  public void test3ReturnsFizz()
  {
    String result = FizzBuzzTDD.convert(3);
  }
  @Test
  public void test5ReturnsBuzz()
  {
    String result = FizzBuzzTDD.convert(5);
  }
  @Test
  public void test15ReturnFizzBuzz()
  {
    String result = FizzBuzzTDD.convert(15);
    assertEquals("Fizz Buzz", result);
  }
}
