package org.teachingkidsprogramming.section07objects;

import org.teachingextensions.WindowUtils.MultiTurtleWindow;
import org.teachingextensions.logo.Turtle;

public class SuperTurtles
{
  public MultiTurtleWindow mtw = new MultiTurtleWindow();
  public SuperTurtles()
  {
    showSomeTurtles();
  }
  public static void main(String[] args)
  {
    new SuperTurtles();
  }
  private void showSomeTurtles()
  {
    makeSpeedyTurtle();
    //  makeCrazyTurtle (recipe below) --#6.0
    //  ------------- Recipe for makeCrazyTurtle --#5.1
    //  ------------- End of makeCrazyTurtle --#5.2
  }
  private void makeSpeedyTurtle()
  {
    Turtle speedyTurtle = new Turtle();
    mtw.addAndShowTurtle(speedyTurtle);
    speedyTurtle.setSpeed(10);
    speedyTurtle.drawTriangle(100);
  }
  private void makeSlowTurtle()
  {
    //        Create a new slowTurtle instance 
    Turtle slowTurtle = new Turtle();
    //        Add your slowTurtle to your MultiTurtleWindow
    mtw.addAndShowTurtle(slowTurtle);
    slowTurtle.setSpeed(1);
    //        Have your slowTurtle draw a upside down triangle with 50 pixel sides
    slowTurtle.drawTriangle(-50);
  }
  private void makeCrazyTurtle()
  {
    //        Create a new crazyTurtle instance  
    Turtle crazyTurtle = new Turtle();
    //        Add your crazyTurtle to your MultiTurtleWindow
    mtw.addAndShowTurtle(crazyTurtle);
    //        Have your crazyTurtle draw a 55 pixel long lightning bolt
    crazyTurtle.drawLightning(55);
  }
}
