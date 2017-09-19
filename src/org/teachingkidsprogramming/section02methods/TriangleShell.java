package org.teachingkidsprogramming.section02methods;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

@SuppressWarnings("unused")
public class TriangleShell
{
  private static int length = 1;
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    for (int i = 0; i < 60; i++)
    {
      Tortoise.setPenColor(PenColors.getRandomColor());
      length = length + 4;
      drawTriangle();
      //
      Tortoise.turn(6);
    }
  }
  private static void drawTriangle()
  {
    //
    for (int i = 0; i < 3; i++)
    {
      Tortoise.move(length);
      Tortoise.turn(120);
    }
  }
}
