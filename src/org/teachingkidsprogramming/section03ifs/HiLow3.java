package org.teachingkidsprogramming.section03ifs;

import java.util.Random;

import org.teachingextensions.logo.Sound;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

// this variation tells how many guesses they have left
public class HiLow3
{
  public static void main(String[] args)
  {
    Random rand = new Random();
    int answer = rand.nextInt(100) + 1;
    //System.out.println("The answer is " + answer);
    int guesses = MessageBox.askForNumericalInput("How many guesses;");
    int uppeRnage = 100;
    for (int i = 0; i <= guesses; i++)
    {
      int guess = MessageBox.askForNumericalInput("What is ur guess");
      while (guess < 1 || guess > 100)
      {
        MessageBox.showMessage("Please enter a valid guess between 1 and " + uppeRnage);
        guess = MessageBox.askForNumericalInput("What is ur guess");
      }
      if (guess == answer)
      {
        Sound.playBeep();
        MessageBox.showMessage("You Won!!!");
        break;
      }
      else if (guess > answer)
      {
        MessageBox.showMessage("Too High :(");
        MessageBox.showMessage("Errors left " + (guesses - i));
      }
      else
      {
        MessageBox.showMessage("Too Low :(:");
      }
      if (i == answer)
      {
        MessageBox.showMessage("You Lost.You suck the answer was " + answer);
      }
    }
  }
}
