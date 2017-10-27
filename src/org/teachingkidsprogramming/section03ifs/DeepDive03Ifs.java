package org.teachingkidsprogramming.section03ifs;

import org.junit.Assert;
import org.junit.Test;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

@SuppressWarnings("unused")
public class DeepDive03Ifs
{
  //  Step 1: SELECT the method name (doesABear on line 19), then click the Run Button
  //            Keyboard shortcut to run ->  PC: Ctrl+F11 or Mac: Command+fn+F11
  //  Step 2: READ the name of the method that failed
  //  Step 3: FILL IN the blank (___) to make that method pass
  //  Step 4: SAY at least one thing you just learned
  //  Step 5: GO to the next method
  //  IMPORTANT - Do NOT change anything except the blank (___)//  
  //  
  @Test
  public void doesABear() throws Exception
  {
    String bearPoopPlace = "";
    if (true)
    {
      bearPoopPlace = "woods";
    }
    Assert.assertEquals("woods", bearPoopPlace);
  }
  @Test
  public void neverEverEver() throws Exception
  {
    String dessert = "chocolate";
    if (false)
    {
      dessert = "ketchup";
    }
    Assert.assertEquals("chocolate", dessert);
  }
  @Test
  public void notEverEverEver() throws Exception
  {
    String dessert = "chocolate";
    if (!false)
    {
      dessert = "ketchup";
    }
    Assert.assertEquals("chocolate", dessert);
  }
  @Test
  public void isThePopeCatholic() throws Exception
  {
    String pope = "";
    if (true)
    {
      pope = "Catholic";
    }
    Assert.assertEquals("Catholic", pope);
  }
  @Test
  public void trueOrFalse() throws Exception
  {
    String animal = "cat";
    boolean elephant = true;
    if (elephant)
    {
      animal = "flat " + animal;
    }
    Assert.assertEquals("flat cat", animal);
  }
  @Test
  public void letSleepingBabiesLie() throws Exception
  {
    String babySounds = "";
    boolean sleeping = false;
    if (sleeping)
    {
      babySounds = "zzzzzzzzzzzz";
    }
    else
    {
      babySounds = "waaaaaahhh!";
    }
    Assert.assertEquals("waaaaaahhh!", babySounds);
  }
  @Test
  public void howCoachThinks() throws Exception
  {
    String coachSays = "try harder";
    int percentEffort = 110;
    if (percentEffort == 110)
    {
      coachSays = "good job";
    }
    Assert.assertEquals("good job", coachSays);
  }
  @Test
  public void lessThan() throws Exception
  {
    String modeOfTransportation = "";
    int age = 14;
    if (age < 16)
    {
      modeOfTransportation = "keep walking";
    }
    else
    {
      modeOfTransportation = "drive away";
    }
    Assert.assertEquals("keep walking", modeOfTransportation);
  }
  @Test
  public void greaterThan() throws Exception
  {
    String kidSays = "";
    int numberOfIceCreams = 6;
    if (numberOfIceCreams > 4)
    {
      kidSays = "I think I'm gonna barf";
    }
    else
    {
      kidSays = "More ice cream!";
    }
    Assert.assertEquals("I think I'm gonna barf", kidSays);
  }
  @Test
  public void notEqual() throws Exception
  {
    String playerSays = "";
    int cards = 52;
    if (cards != 52)
    {
      playerSays = "Not playing with a full deck!";
    }
    else
    {
      playerSays = "Game on!";
    }
    Assert.assertEquals("Game on!", playerSays);
  }
  @Test
  public void equalsForStrings() throws Exception
  {
    String knockKnock = "";
    String whosThere = "bananas";
    if (whosThere.equals("bananas"))
    {
      knockKnock = "Who's there?";
    }
    else if (whosThere.equals("orange"))
    {
      knockKnock = "Orange you glad I didn't say bananas?";
    }
    Assert.assertEquals("Who's there?", knockKnock);
  }
  @Test
  public void thisAndThat() throws Exception
  {
    String time = "";
    int score = 4;
    int years = 7;
    if (score == 4 && years == 7)
    {
      time = "Presidential";
    }
    Assert.assertEquals("Presidential", time);
  }
  @Test
  public void theBeginningOrEnd() throws Exception
  {
    String shoppingList = "";
    int age = 92;
    if (age <= 2 || 90 <= age)
    {
      shoppingList = "diapers";
    }
    Assert.assertEquals("diapers", shoppingList);
  }
  @Test
  public void ifInHighSchool() throws Exception
  {
    String status = "";
    int age = 16;
    if (age <= 15)
    {
      status = "smarty";
    }
    else if (age > 19)
    {
      status = "dummy";
    }
    else
    {
      status = "normal";
    }
    Assert.assertEquals("normal", status);
  }
  @Test
  public void nestedIfOrPigsInABlanket() throws Exception
  {
    String status = "";
    String animal = "PIG";
    boolean isWinningKarate = false;
    if (animal.equalsIgnoreCase("pig"))
    {
      if (isWinningKarate)
      {
        status = "pork chop";
      }
      else
      {
        status = "hambulance";
      }
    }
    Assert.assertEquals("hambulance", status);
  }
  @Test
  public void semicolonsMessUpIfStatements() throws Exception
  {
    String dessert = "chocolate";
    if (false)
    {
      dessert = "ketchup";
    }
    Assert.assertEquals("chocolate", dessert);
  }
  // test for Choose Your Own Adventure
  //out first test
  @Test
  public void cyoawakeUpTest() throws Exception
  {
    String result = MessageBox.askForTextInput("Do you want to 'wake up' or 'explore' the dream?");
    //test the user entered "hello"  
    Assert.assertEquals(result, "wake up");
  }
  @Test
  public void cyoaInputTest2() throws Exception
  {
    String result = MessageBox.askForTextInput("Do you want to eat the rotten chips or throw away?");
    Assert.assertEquals(result, "throw away");
  }
  @Test
  public void cyoaincorrectInputTest() throws Exception
  {
    String result = MessageBox.askForTextInput("Do you want to 'wake up' or 'explore' the dream?");
    Assert.assertEquals("", result);
  }
  @Test
  public void ifstatments() throws Exception
  {
    String teachersays = "may";
    if (_______)
    {
      teachersays = "can";
    }
    Assert.assertEquals("may", teachersays);
  }
  @Test
  public void napsOrLaps() throws Exception
  {
    String lapsOrnaps = "laps";
    if (true)
    {
      lapsOrnaps = "naps";
    }
    Assert.assertEquals("naps", lapsOrnaps);
  }
  @Test
  public void icecreamOrChocolate() throws Exception
  {
    String iceCreamOrChoco = "Ice Cream";
    if (______)
    {
      iceCreamOrChoco = "Chocolate";
      Assert.assertEquals("Choclate", iceCreamOrChoco);
    }
  }
  /**
  
   * Ignore the following, It's needed to run the deep dive
   * 
   * 
   * 
   * 
   * 
   * 
   * 
   * 
   
   * 
   */
  public boolean _____   = false;
  public boolean _______ = false;
  public boolean ______  = true;
  public String  ___     = "You need to fill in the blank ___";
  public Integer ____    = null;
  public String ___()
  {
    return ___;
  }
}
