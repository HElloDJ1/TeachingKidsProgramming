package org.teachingkidsprogramming.section06modelviewcontroller;

import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class exceptionalAdLibsVariation
{
  public static void main(String[] args)
  {
    String adVerb = askAdverb();
    String edVerb = askEdVerb();
    String bodyPart = askBodyPart();
    String currentStory = " I woke " + adVerb + ". ";
    //  Add the words '"Then I " + currentEdVerb + " " to the currentStory --#5
    currentStory += "Then I " + edVerb + " ";
    //  Add the words "my " + currentBodyPart + ". " to the current story --#7
    currentStory += "my " + bodyPart + ". ";
    //  Show the currentStory in a message box as a message --#1.1
    MessageBox.showMessage(currentStory);
  } // end of main
  private static String askBodyPart()
  {
    String bodyPart = MessageBox.askForTextInput("Enter a body part :");
    if (bodyPart.isEmpty())
    {
      MessageBox.showMessage("Try again -_-");
      askBodyPart();
    }
    else if (bodyPart.matches("[//d]*"))
    {
      MessageBox.showMessage("Try again -_-");
    }
    return bodyPart;
  }
  private static String askEdVerb()
  {
    String edVerb = MessageBox.askForTextInput("Enter a verb ending in '-ed'");
    if (edVerb.isEmpty())
    {
      MessageBox.showMessage("Try again -_-");
      askEdVerb();
    }
    else if (edVerb.matches("[\\d]*"))
    {
      MessageBox.showMessage("try again -_-");
    }
    return edVerb;
  }
  private static String askAdverb()
  {
    String adverb = MessageBox.askForTextInput("Enter an adverb: ");
    if (adverb.isEmpty())
    {
      MessageBox.showMessage("Try again -_-");
      askAdverb();
    }
    else if (adverb.matches("[\\d]*"))
    {
      MessageBox.showMessage("try again -_-");
      askAdverb();
    }
    return adverb;
  } // end of method
} // end of class
