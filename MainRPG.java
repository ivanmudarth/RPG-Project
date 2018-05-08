/* 
     * Name: Ivan Mudarth 
     * Project Name: RPG
     * File Name: MainRPG.java 
     * Teacher: Ms. Arif 
     * Description: The main class is what brings all the methods from other classes together. It calls these methods 
     * according to decisions made by the user
    */

//import library
import javax.swing.*;

public class MainRPG {
  //Initializes global variables
  public static int coins = 500;
  public static int health = 100;
  public static int maxAttackDmg = 50;
  public static int numHealthPots = 3;
  
  public static void main (String args [])
  {
    new MainRPG ();
  }
  
  public MainRPG ()
  {
    //Prints the date and time
    GeneralMethods.dateAndTime ();
    //Requires a password from the user in order to begin the game
    GeneralMethods.password ();
    
    //Plays music
    GeneralMethods.music ();
    
    //initializes variable
    boolean running = true; 
    //A while loop begins. If the user wants to play again, they will return back to this point
    while (running) {  
      
      //Initializes char variables
      char decision1;
      char decision2; 
      char decision3; 
      char decision4; 
      char decision5; 
      char decision6; 
      String decision7 = ""; 
      String decision8 = ""; 
      char decision9; 
      
      //ASCII text for the intro are printed with 2 second pauses between them
      GeneralMethods.pause (2000);
      ASCIIart.intro1 ();
      GeneralMethods.pause (2000);
      ASCIIart.intro2 ();
      GeneralMethods.pause (2000);
      ASCIIart.intro3 ();
      GeneralMethods.pause (2000);
      
      //storyline1 is called
      Storyline.storyline1 ();
      
      //After storyline1, is the first decision. The decision question is asked until valid input is given
      do {
        decision1 = IBIO.inputChar ("\nDost thou have courage enough to undertake this task? (y/n) ");
      }while (decision1 != 'y' && decision1 != 'n' && decision1 != 'Y' && decision1 != 'N');
      
      //If the user chooses 'n' or 'N,' they are lead on a different that ends when the while loop ends
      while (decision1 == 'n' || decision1 == 'N') {
        //sidestory1 is called
        Storyline.sidestory1 ();
        
        //The first battle is called. The battle is against Master Susuke (difficulty 3). 
        MainRPG.health = Tasks.battle (3, MainRPG.numHealthPots, MainRPG.health, MainRPG.maxAttackDmg);
        
        //storyline2 is called
        Storyline.sidestory2 ();
        
        //The first decision from the side path is outputted. The do while loop repeats the question until valid input is given
        do {
          decision2 = IBIO.inputChar ("\nDo you want to go into the town of Hyrule? I’m sure you will gain more" +
                                      " experience there. (y/n)");
        }while (decision2 != 'y' && decision2 != 'n' && decision2 != 'Y' && decision2 == 'N');
        
        //If the user responds with with 'y' or 'Y' they are given a riddle
        if (decision2 == 'y' || decision2 == 'Y') {
          GeneralMethods.printSlow ("\nBefore I give you the directions, please complete a riddle!");
          Tasks.riddle ();
        }
        //If the user responds with 'n' or 'N' then they exit from the sidestory while loop
        else {
          GeneralMethods.printSlow ("\nThen I suppose you are confident enough to return to Deku Tree. Goodbye and" + 
                                    " goodluck on your adventure!");
          break;
        }
        
        //sidestory3 is called
        Storyline.sidestory3 ();
        //the user is given the multiple choice task
        Tasks.multipleChoice (1);
        //sidestory4 is called 
        Storyline.sidestory4 ();
        
        //Another decision is given. The do while loop handles invalid input by repeating the question
        do {
          decision3 = IBIO.inputChar ("\nWhat do you say? (y/n) ");
        }while (decision3 != 'y' && decision3 != 'n' && decision3 != 'Y' && decision3 == 'N');
        
        //If the user responds with 'n' or 'N' then they break from the sidestory loop. Otherwise, they continue the sidestory
        if (decision3 == 'n' || decision3 == 'N') {
          GeneralMethods.printSlow ("\nGibdo: Pfft. I knew you were scared. Looks like I remain the toughest in this town." +
                                    " Go back to where you came from! \nThe Deku Tree? Yeah that's where you belong!");
          break;
        }
        //sidestory5 is called
        Storyline.sidestory5 ();
        //Another side battle is called. The battle is against Gibdo (difficulty 4).
        MainRPG.health = Tasks.battle (4, MainRPG.numHealthPots, MainRPG.health, MainRPG.maxAttackDmg);
        //sidestory6 is called
        Storyline.sidestory6 ();
        
        //the do while loop asks for the users  input for a decision and handles invalid input
        do {
          decision4 = IBIO.inputChar ("\nDo you want to know how? (y/n) ");
        }while (decision4 != 'y' && decision4 != 'n' && decision4 != 'Y' && decision4 == 'N');
        
        //if the user responds with 'y' or 'Y' then they are given a multiple choice task. Otherwise, the sidestory continues
        if (decision4 == 'y' || decision4 == 'Y') {
          GeneralMethods.printSlow ("\nHere, my friend will show you!");
          
          Tasks.multipleChoice (2);
        }
        else
          GeneralMethods.printSlow ("Ok. Whatever you want, kid. You missed out though!");
        //sidestory7 is called
        Storyline.sidestory7 ();
        //After sidestory7, the first sidestory path inevitably returns to the main storyline
        break;
      }
      //storyline2 is called
      Storyline.storyline2 ();
      //the user is given a deciphering task
      Tasks.deciphering ();
      //storyline3 is called
      Storyline.storyline3 ();
      //the user is given a mysteryChest task
      MainRPG.coins = Tasks.mysteryChest (MainRPG.coins);
      //storyline4 is called
      Storyline.storyline4 ();
      
      //The user is asked a decision. The invalid input is handled by a do while loop 
      do {
        decision5 = IBIO.inputChar ("\n\t(a) OK \n\t(b) No\t");
      }while (decision5 != 'a' && decision5 != 'A' && decision5 != 'b' && decision5 == 'B');
      
      //If they respond with 'b' or 'B,' they are repeatedly asked the question until they respond with 'a' or 'A'
      while (decision5 == 'b' || decision5 == 'B') {
        GeneralMethods.printSlow ("C'mon...don't be a blabber-mouth! Please keep this a secret from " +
                                  "everyone... OK? ");
        
        do {
          decision5 = IBIO.inputChar ("\n\t(a) OK \n\t(b) No\n");
        }while (decision5 != 'a' && decision5 != 'A' && decision5 != 'b' && decision5 == 'B');
      }
      //storyline5 is called
      Storyline.storyline5 ();
      
      //The user is asked a decision. The invalid input is handled by a do while loop
      do {
        decision6 = IBIO.inputChar ("\n\t(a) OK \n\t(b) I don't believe you.\n");
      }while (decision6 != 'a' && decision6 != 'A' && decision6 != 'b' && decision6 == 'B');
      
      //If they respond with 'b' or 'B,' they are repeatedly asked the question until they respond with 'a' or 'A'
      while (decision6 == 'b' || decision5 == 'B') {
        GeneralMethods.printSlow ("Please believe me... My prophecies have never been wrong! Please!");
        
        do {
          decision6 = IBIO.inputChar ("\n\t(a) OK \n\t(b) No\n");
        }while (decision6 != 'a' && decision6 != 'A' && decision6 != 'b' && decision6 == 'B');
      }
      //storyline6 is called
      Storyline.storyline6 ();
      //the user is given a battle against Darunia (difficulty 1)
      MainRPG.health = Tasks.battle (1, MainRPG.numHealthPots, MainRPG.health, MainRPG.maxAttackDmg);
      //storyline7 is called
      Storyline.storyline7 ();
      //the user is given a riddle task
      Tasks.riddle ();
      //storyline8 is called
      Storyline.storyline8 ();
      //the user is given a battle against Guido (difficulty 2)
      MainRPG.health = Tasks.battle (2, MainRPG.numHealthPots, MainRPG.health, MainRPG.maxAttackDmg);
      //storyline9 is called
      Storyline.storyline9 ();
      //the user is given a multipleChoice task
      Tasks.multipleChoice (3);
      //storyline10 is called
      Storyline.storyline10 ();
      
      //The user is asked a decision question. The do while loop checks for invalid input
      do {
        String [] possibleValues = {"(a) Stay where he is", "(b) Chase after Ganondorf"};
        decision7 = (String) JOptionPane.showInputDialog (null, "What will Link do? ",
                                                          "Input", JOptionPane.INFORMATION_MESSAGE, null, possibleValues, possibleValues [0]);
      }while (!decision7.equals ("(a) Stay where he is") && !decision7.equals ("(b) Chase after Ganondorf"));
      
      //If the user choose 'b' or 'B' the following loop runs. Otherwise the story continues
      while (decision7.equals("(b) Chase after Ganondorf")) {
        System.out.println ("\n*-Link jumps on a horse tied to a tree");
        System.out.println ("*-He catches up to Ganondorf");
        System.out.println ("\nGanondorf: “You again! How foolish can you be. I thought I told you to stay away");
        System.out.println ("from me, this has nothing to do with you.");
        
        GeneralMethods.pause (2000);
        //The user is asked a decision question. The do while loop checks for invalid input
        do {
          String [] possibleValues = {"(a) Stop the pursuit", "(b) Jump onto Ganondorf’s horse", "(c) Push Ganondorf off his horse"};
          decision8 = (String) JOptionPane.showInputDialog (null, "What will Link do?",
                                                            "Input", JOptionPane.INFORMATION_MESSAGE, null, possibleValues, possibleValues [0]);
        }while (!decision8.equals ("(a) Stop the pursuit") && !decision8.equals ("(b) Jump onto Ganondorf’s horse") && !decision8.equals ("(c) Push Ganondorf off his horse"));
        
        //if the user chooses 'a' the side story path ends
        if (decision8.equals ("(a) Stop the pursuit"))
          break;
        
        //Otherwise the following print statements are displayed and the side story path continues
        else if (decision8.equals ("(b) Jump onto Ganondorf’s horse")) {
          GeneralMethods.printSlow ("\nGanondorf: Hey! Get off me.");
          GeneralMethods.printSlow ("\n*-Link pulls Ganondorf off the horse, falling with him");
        }
        
        GeneralMethods.printSlow ("*-They both tumble onto the dirt road. They stand up to face each other.");
        GeneralMethods.printSlow ("\nGanondorf: Let's settle this quick. I don’t have time to play fight with you, Zelda");
        GeneralMethods.printSlow ("is getting away as we speak");
        
        //The user is asked if they would like to battle. The do while loop checks for invalid input
        do {
          decision9 = IBIO.inputChar ("\nShall we battle? (y/n) ");
        }while (decision9 != 'y' && decision9 != 'n' && decision9 != 'Y' && decision9 != 'N');
        //If the user chooses 'y' or 'Y' they battle Ganondorf
        if (decision9 == 'y')
          MainRPG.health = Tasks.battle (5, MainRPG.numHealthPots, MainRPG.health, MainRPG.maxAttackDmg);
        //Otherwise, the side story path ends
        else
          break;
        //The following print statements are shown and the side story path comes to an end
        GeneralMethods.printSlow ("\nGanondorf: Haha! That was way too easy. I knew you were a waste of time");
        GeneralMethods.printSlow ("\n*-Ganondorf retrieves his horse and continues after Zelda");
        GeneralMethods.pause (2000);
          
        break;                            
      }
      
      //the user is given a mysteryChest task
      MainRPG.coins = Tasks.mysteryChest (MainRPG.coins);
      //storyline11 is called
      Storyline.storyline11 ();
      //the user is given a riddle task
      Tasks.riddle ();
      //storyline12 is called
      Storyline.storyline12 ();
      //the user is given a final boss battle against Ganondorf (difficulty 6)
      MainRPG.health = Tasks.battle (6, MainRPG.numHealthPots, MainRPG.health, MainRPG.maxAttackDmg);
      
      //if the player beats Ganondorf at the end, a certain ending is executed. 
      if (MainRPG.health >= 0)
        Storyline.storyline13 ();
      //If the player lost, a different ending is executed
      else 
        Storyline.alternateEnding ();
      
      //dialog box askes the user if they would like to play again
      String input;
      do {
        input = JOptionPane.showInputDialog ("Would you like to play again? (y/n) ");
      }while (!input.equalsIgnoreCase ("y") && !input.equalsIgnoreCase ("n") && !input.equalsIgnoreCase ("yes") && !input.equalsIgnoreCase ("no"));
      
      //If the user doesn't want to  play again, the game ends. Otherwise, the game loops back
      if (input.equalsIgnoreCase ("n") || input.equalsIgnoreCase ("no"))
        running = false;
    }
  }
}









