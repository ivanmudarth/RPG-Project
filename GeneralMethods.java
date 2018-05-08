/* 
 * Name: Ivan Mudarth 
 * Project Name: RPG
 * File Name: GeneralMethods.java 
 * Teacher: Ms. Arif 
 * Description: The GeneralMethods class contains methods that are not directly related to eachother. However,  
 * some of these functionc are used very often, so it is more efficient to make them methods
 */

//Import Libraries
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.util.*;
import java.text.*;

public class GeneralMethods {
  //initializes global variables
  public static int whiteSword = 0;
  public static int kokiriSword = 0;
  public static int magicalSword = 0;
  public static int whiteArmor = 0;
  public static int kokiriArmor = 0;
  public static int magicalArmor = 0;
  
  public static void pause (int time) {
    //This method is used to pause the time in between lines of text
    try {
      //The "time" parameter determines how many milliseconds to pause for
      Thread.sleep(time);
    } catch (Exception e) {
      e.printStackTrace();
    }
    
  }
  
  public static void printSlow (String s) 
  { 
    for (int i = 0 ; i < s.length () ; i++) 
    { 
      System.out.print ("" + s.charAt (i)); 
      //sleep for a bit after printing a letter 
      try 
      { 
        //the methods pauses for 60 milliseconds between each character
        Thread.sleep (60); 
      } 
      catch (InterruptedException m) 
      { 
        ; 
      } 
    } 
    System.out.println (); 
  } 
  
  
  
  public static void shop () {
    //Initializes variables
    boolean running = true;
    int damageIncrease = 0;
    int healthIncrease = 0;
    int cost = 0;
    int choice;
    int itemsLeft = 2;
    String name = "";
    char choice2;
    char choice3;
    
    //Prints shop display for the user
    System.out.println ("-------------------------------------------------------------------");
    System.out.println ("                         --  SHOP  --");
    System.out.println ("\n      Weapons                                  Armor");
    System.out.println ("\n   #1 White Sword                           #4 White Armor");
    System.out.println ("   Increases damage by 10                   Increases health by 10");
    System.out.println ("   Cost: 300 rupees                         Cost: 300 rupees");
    System.out.println ("\n   #2 Kokiri Sword                          #5 Kokiri Armor");
    System.out.println ("   Increases damage by 15                   Increases health by 20");
    System.out.println ("   Cost: 500 rupees                         Cost: 500 rupees");
    System.out.println ("\n   #3 Magical Sword                         #6 Magical Armor");
    System.out.println ("   Increases damage by 30                   Increases health by 30");
    System.out.println ("   Cost: 700 rupees                         Cost: 700 rupees");
    System.out.println ("-------------------------------------------------------------------");
    
    //A while loop begins that will only end when "running" is false
    while (running) {
      //Notfies the user that they can press "0" to leave the shop
      System.out.println ("\nPress (0) to leave the shop");
      
      //Asks the user which item they would like to buy. The do while loop makes sure the player enters a number from 1-6
      do {
        choice = IBIO.inputInt ("\nEnter the number of the item that you would like to purchase: ");
      }while (choice != 0 && choice != 1 && choice != 2 && choice != 3 && choice != 4 && choice != 5 && choice != 6);
      
      //Determines the cost, damage/health increase, and name based on the users choice. If the item is purchased that item is no longer available
      if (choice == 1) {
        damageIncrease = 10;
        cost = 300; 
        name = "White Sword";
        itemsLeft--;
        GeneralMethods.whiteSword++;
      }
      else if (choice == 2) {
        damageIncrease = 15;
        cost = 500; 
        name = "Kokiri Sword";
        itemsLeft--;
        GeneralMethods.kokiriSword++;
      }
      else if (choice == 3) {
        damageIncrease = 30;
        cost = 700; 
        name = "Magical Sword";
        itemsLeft--;
        GeneralMethods.magicalSword++;
      }
      else if (choice == 4) {
        healthIncrease = 10;
        cost = 300; 
        name = "White Armor";
        itemsLeft--;
        GeneralMethods.whiteArmor++;
      }
      else if (choice == 5) {
        healthIncrease = 20;
        cost = 500; 
        name = "Kokiri Armor";
        GeneralMethods.kokiriArmor++;
      }
      else if (choice == 6) {
        healthIncrease = 30;
        cost = 700; 
        name = "Magical Armor";
        itemsLeft--;
        GeneralMethods.magicalArmor++;
      }
      //If the user presses "0" they leave the shop
      else
        break;
      
      //if the user has enough money...
      if (MainRPG.coins > cost && itemsLeft == 0) {
        GeneralMethods.printSlow ("\nYou have purchsed the " + name + ". Congratulations!");
        MainRPG.coins -= cost;
        
        //if the item is a sword, the max attack damage is upgraded 
        if (choice <= 3)
          MainRPG.maxAttackDmg += damageIncrease;
        //if the item purchased was armor than the health is set to 100 and then upgraded
        else
          MainRPG.health = (100 + healthIncrease);
        //The user leaves the shop
        running = false;
      }
      //if the user has already purchased that item...
      else if (itemsLeft < 0){
        //The user is asked if they would like to purchase another item or leave the shoop
        do {
          choice2 = IBIO.inputChar ("\nYou have already purchased that item. Would you like to select another item? (y/n)");
        }while (choice2 != 'y' && choice2 != 'Y' && choice2 != 'n' && choice2 != 'N' );
        //if the user responds with 'n' or 'N' they leave the shop. Otherwise the while loop is run again
        if (choice2 == 'n' || choice2 == 'N')
          running = false;
      }
      //if the user doesn't have enough money...
      else {
        //The user is asked if they would like to purchase another item or leave the shoop
        do {
          choice3 = IBIO.inputChar ("\nInsufficient funds. Would you like to select another item? (y/n)");
        }while (choice3 != 'y' && choice3 != 'Y' && choice3 != 'n' && choice3 != 'N' );
        //if the user responds with 'n' or 'N' they leave the shop. Otherwise the while loop is run again
        if (choice3 == 'n' || choice3 == 'N')
          running = false;
      }
    }
  }
  
  public static void inventory () {
    //initializes variable
    char exit;
    
    //The inventory is displayed for the user. The items on the column to the right are given a set value because they serve no use
    System.out.println ("----------------------------------------------------------------------");
    System.out.println ("                     --  INVENTORY  --");
    System.out.println ("   # " + MainRPG.coins + " Rupees                                    #   12 Sunshroom(s)");
    System.out.println ("   #   " + MainRPG.numHealthPots + " Life Potions                              #   14 Apple(s)");
    System.out.println ("   #   " + GeneralMethods.whiteSword + " White Sword                               #    1 Sand Crab(s)");
    System.out.println ("   #   " + GeneralMethods.kokiriSword + " Kokiri Sword                              #    3 Volten Trout(s)");
    System.out.println ("   #   " + GeneralMethods.magicalSword + " Magical Sword                             #    6 Lynel Hoof(s)");
    System.out.println ("   #   " + GeneralMethods.whiteArmor + " White Armor                               #   10 Fortified Pumpkin(s)");
    System.out.println ("   #   " + GeneralMethods.kokiriArmor + " Kokiri Armor                              #    3 Lantern(s)");
    System.out.println ("   #   " + GeneralMethods.magicalArmor + " Magical Armor                             #    7 Stone Talus(s)");
    
    do {
      exit = IBIO.inputChar ("\nPress (x) to exit the inventory. ");
    }while (exit != 'x' && exit != 'X');   
  }
  
  public static void music ()
  {
    String audioFileName = "LegendOfZeldaTheme.wav";
    // Tries the code, but provides a "catch" to handle any exceptions
    try
    {
      
      // Opens an audio input stream
      AudioInputStream audioIn = AudioSystem.getAudioInputStream (GeneralMethods.class.getResource(audioFileName));
      
      // Gets a sound clip resource
      Clip clip = AudioSystem.getClip();
      
      // Open audio clip and loads clip from the audio input stream.
      clip.open(audioIn);
      
      // Starts clip
      clip.start();
      
      // In case of error, message to console is printed
    }
    catch (Exception ex)
    {
      System.out.println("Customized Error 404! AudioFile Not Found!\nCould be due to user settings");
    }
  }
  
  public static void password () {
    //Method gets the user's input in the form of a dialog box. Repeats until the password (ICS208) is given
    
    
    //initializes variables
    int attempts = 4;
    String hint;
    String ifIncorrect = "";
    boolean test = true;
    
    do {
      /*decreases the variable "hint" by one so that every time the loop runs, a different hint will be shown. 
       After 3 password attempts, the hint remains the same*/
      
      attempts--;
      //A "hint" String is assigned according to the users attempt
      if (attempts == 3)
        hint = "course code";      
      else if (attempts == 2) {
        hint = "six characters long";
        //if the user has give the an incorrect password, then "Incorrect Password:" will be displayed instead of "Password
        ifIncorrect = "Incorrect ";
      }
      else 
        hint = "contains six characters and three characters";
      
      //the panel and label (the text) that are going to be on the dialog box are set
      JPanel panel = new JPanel();
      JLabel label = new JLabel(ifIncorrect + "Password: \n[Hint: " + hint + "]");
      
      //10 of the spaces (Max) inputed from from the user are hidden using the JPasswordFeild API.
      //This is done to provide extra security
      JPasswordField pass = new JPasswordField (10);
      //The add () method adds the widgets "label" and "pass" to the screen. 
      panel.add(label);
      panel.add(pass);
      
      //The text that is going to be displayed on the two button options are in the form of an array
      String[] options = new String[]{"Cancel", "OK"};
      
      //The type of JOptionPanel is set. It sets the properties of the dialog box; the label, options etc. 
      //The title of the dialog box is "Password"
      //The Dialog Box gives a "no" option - a cancel button
      //The style of the dialog box is a 'PLAIN_MESSAGE'
      //The box has two options labeled "Cancel" and "OK"
      int option = JOptionPane.showOptionDialog(null, panel, "Password",
                                                JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE,
                                                null, options, options[1]);
      //Option 1 has been defined as "OK." So, every time the user presses "OK" the following code runs...
      if(option == 1) 
      {
        //The password is processed and tested to see if it matches with the correct password. This is done in the 
        //passwordProcess boolean method. 
        test = passwordProcess (pass);       
      }
    }while (!test); 
    //The condition: the loop plays until the user gets the correct password 
  }  
  
  //The password is processed and tested to see if it matches with the correct password. The parameter is the raw input from the user
  public static boolean passwordProcess (JPasswordField pass) {
    //sets the password, as a string
    String realPassword = "ICS208";
    //initializes variable
    String password1 = "";
    
    //The input from the JPasswordFeild (the parameter) is processed and converted into an array of individual chars using the 
    //API .getPassword ()
    char [] password = pass.getPassword();
    //For the purpose of comparison, individual chars are converted to a String
    password1 = new String(password);
    
    
    if (realPassword.equals(password1))
      return true;
    else
      return false;
  }
  
  public static void dateAndTime (){
    Date now = new Date ();
    DateFormat df = DateFormat.getDateInstance ();
    String s = df.format (now);
    System.out.println ("Today is " + s);
  }
  
  public static void blank (){
    //the following method cleans out the whole compiler output by adding spaces. This is done to make the user understand when one scene ends in the storyline
    for (int i = 1; i < 43; i++){
      System.out.println ();
    }
  }
}


