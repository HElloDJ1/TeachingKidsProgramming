package org.teachingkidsprogramming.section08events;

import java.util.Random;

import org.teachingextensions.WindowUtils.ProgramWindow;
import org.teachingextensions.logo.utils.ColorUtils.ColorWheel;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.logo.utils.EventUtils.MouseLeftClickListener;
import org.teachingextensions.logo.utils.LineAndShapeUtils.Circle;
import org.teachingextensions.virtualproctor.VirtualProctor;

public class SimpleBubble implements MouseLeftClickListener
{
  ProgramWindow programWindow;
  public SimpleBubble()
  {
    VirtualProctor.setName("Alexis L.");
    programWindow = new ProgramWindow("My Bubble");
    programWindow.setWindowVisible(true);
    programWindow.addMouseLeftClickListener(this);
    prepareColorPalette();
  }
  private void prepareColorPalette()
  {
    ColorWheel.addColor(PenColors.Purples.Purple);
    ColorWheel.addColor(PenColors.Blues.LightBlue);
    ColorWheel.addColor(PenColors.Blues.Blue);
    ColorWheel.addColor(PenColors.Blues.DarkBlue);
  }
  @Override
  public void onLeftMouseClick(int x, int y)
  {
    createBubble(x, y);
  }
  private void createBubble(int x, int y)
  {
    // programWindow.clearWindow();
    Random random = new Random();
    int radius = random.nextInt(41) + 10;
    Circle circle = new Circle(radius, ColorWheel.getNextColor());
    circle.setCenter(x, y);
    circle.addTo(programWindow);
  }
  public static void main(String[] args)
  {
    new SimpleBubble();
  }
}