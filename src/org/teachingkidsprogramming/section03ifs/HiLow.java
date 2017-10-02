package org.teachingkidsprogramming.section03ifs;

import java.util.Random;

import org.teachingextensions.logo.Sound;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class HiLow
{
  public static void main(String[] args)
  {
    Random rand = new Random();
    int answer = rand.nextInt(100) + 1;
    //System.out.println("The answer is " + answer);
    for (int i = 0; i < 8; i++)
    {
      int guess = MessageBox.askForNumericalInput("What is ur guess");
      if (guess == answer)
      {
        Sound.playBeep();
        MessageBox.showMessage("You Won!!!");
        break;
      }
      else if (guess > answer)
      {
        MessageBox.showMessage("Too High :(");
      }
      else
      {
        MessageBox.showMessage("Too Low :(:");
      }
      if (i == answer)
      {
        MessageBox.showMessage("You Lost.You suck the answer was ___");
      }
    }
  }
}
