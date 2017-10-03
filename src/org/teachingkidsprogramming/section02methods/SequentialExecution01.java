package org.teachingkidsprogramming.section02methods;

public class SequentialExecution01
{
  static int counter = 1;
  // Looking at sequential execution,
  // the order operation run in a program
  public static void main(String[] args)
  {
    System.out.println("In main #1");
    myMethod1();
    System.out.println("In main #2");
  }// end of main method
  public static void myMethod1()
  {
    System.out.println("In method #1");
    myMethod2();
  }
  public static void myMethod2()
  {
    System.out.println("In method #1");
    if (counter < 10)
    {
      counter++;
      myMethod3();
    }
  }
  public static void myMethod3()
  {
    System.out.println("In method #1");
    myMethod2();
  }
}// end of the class
