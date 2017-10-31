package org.teachingkidsprogramming.section04mastery;

import java.awt.Color;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.ColorWheel;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

public class DigiFlower
{
  public static void main(String[] args)
  {
    Tortoise.show();
    //    Make the tortoise move as fast as possible --#7
    Tortoise.setSpeed(10);
    //    Make the background silver  --#8
    //    Make the line the tortoise draws 3 pixels wide --#15
    //    createColorPalette (recipe below) --#9.1
    //        Do the following 15 times --#13.1
    //          drawOctogon (recipe below) --#10.1
    //          Turn the tortoise 1/15th of 360 degrees to the right --#12
    //        End Repeat --#14.2
    //    ------------- Recipe for createColorPalette --#9.2
    Color color1 = PenColors.Reds.Red;
    Color color2 = PenColors.Oranges.DarkOrange;
    Color color3 = PenColors.Yellows.Gold;
    Color color4 = PenColors.Yellows.Yellow;
    ColorWheel.addColor(color1);
    ColorWheel.addColor(color2);
    ColorWheel.addColor(color3);
    ColorWheel.addColor(color4);
    ColorWheel.addColor(color4);
    ColorWheel.addColor(color3);
    ColorWheel.addColor(color2);
    ColorWheel.addColor(color1);
    //    ------------- End of createColorPalette recipe --#9.3
    //
    //    ------------- Recipe for drawOctogon --#10.2
    for (int i = 0; i < 8; i++)
    {
      Tortoise.setPenColor(ColorWheel.getNextColor());
      Tortoise.move(50);
      Tortoise.turn(360 / 8);
    }
    //    ------------- End of drawOctogon recipe --#10.3
  }
}
