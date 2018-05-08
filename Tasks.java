/* 
     * Name: Ivan Mudarth 
     * Project Name: RPG
     * File Name: Tasks.java 
     * Teacher: Ms. Arif 
     * The Tasks class conatins the 5 different tasks that are used in the game. The majority are used more than once so it is 
     * more efficient to keep them as methods
    */

public class Tasks {
  
  //Task 1: battle (easy, medium, hard, boss)
  public static int battle (int difficulty, int numHealthPots, int health, int maxAttackDamage) {
    //Initializes variables
    int maxEnemyAttackDamage = 0;
    int damageDealt, damageTaken;
    int maxEnemyHealth = 0;
    String enemy = "";
    
    /* Determines the difficulty of the enemy based on "difficulty" parameter. maxEnemyHealth, enemyAttackDamage, and enemy
     * variables are set accordingly. */
    switch (difficulty)
    {
      case 1:
        maxEnemyHealth = 100;
        maxEnemyAttackDamage = 30;
        enemy = "Darunia";
        break;
      case 2:
        maxEnemyHealth = 125;
        maxEnemyAttackDamage = 35;
        enemy = "Ghuido";
        break;
      case 3:
        maxEnemyHealth = 100;
        maxEnemyAttackDamage = 30;
        enemy = "Master Yusuke";
        break;
      case 4:
        maxEnemyHealth = 120;
        maxEnemyAttackDamage = 45;
        enemy = "Gibdo";
        break;
      case 5:
        maxEnemyHealth = 300;
        maxEnemyAttackDamage = 100;
        enemy = "Ganondorf";
        //This is the first possible Ganodorf that can be face. He is purposely made to be impossible to beat.
        break;
      case 6:
        maxEnemyHealth = 150;
        maxEnemyAttackDamage = 40;
        enemy = "Ganondorf";
        break;
    }
    
    // Player variables
    int healthPotionHealAmount = 30;
    // Initializes player variables healthPotionHealAmount
    
    boolean running = true;
    
    // Label
    GAME:
      while (running) {
      System.out.println ("--------------------------------------");
      
      int enemyHealth = ((int) (Math.random() * 10 + (maxEnemyHealth - 10)));
      /*Sets enemyHealth as a random number from the maxEnemyHealth - 10 to the maxEnemyHealth (between a range of 10 numbers. 
       This is done to avoid having the same exact outcome if the user faces the same enemy twice */
      
      GeneralMethods.printSlow ("\t# " + enemy + " wants to battle you! #\n");
      
      ASCIIart.enemy (difficulty);
      ASCIIart.linkBack ();
      
      //while enemy is alive
      while (enemyHealth > 0) {
        GeneralMethods.printSlow("\tYour HP: " + MainRPG.health);
        GeneralMethods.printSlow("\t" + enemy + "'s HP: " + enemyHealth);
        System.out.println("\n\t1. Attack - Master Sword");
        System.out.println("\t2. Drink Life potion");
        System.out.println("\t3. Run!");
        //Prints player health, enemy health, and options for the user
        
        String input = IBIO.inputString ("\n\tWhat would you like to do?");
        
        //Option 1: Attack
        if (input.equals("1")) {
          damageDealt = ((int) ((int) (Math.random() * 10 + (MainRPG.maxAttackDmg - 10))));
          damageTaken = ((int) (Math.random() * 10 + (maxEnemyAttackDamage - 10)));
          /*Sets damageDealt and damageDealt as a random number from a range of 5 or 10 numbers below the maxAttackDmg 
           * or maxEnemyAttackDamage that has been set. This is done to avoid predictable outcomes */
          
          enemyHealth -= damageDealt;
          MainRPG.health -= damageTaken;
          //simulates the damage exchange
          
          GeneralMethods.printSlow("\t> You strike " + enemy + " for " + damageDealt + " damage");
          GeneralMethods.printSlow("\t> You recieved " + damageTaken + " in retaliation");
          
          //checks if player is sill alive and breaks loop if so
          if (MainRPG.health < 1) {
            GeneralMethods.printSlow("\t You have taken too much damage, you are too weak to go on");
            break;
          }
          
          //Option 2: Heal
        } else if (input.equals("2")) {
          
          if (MainRPG.numHealthPots > 0) {
            MainRPG.health += healthPotionHealAmount;
            MainRPG.numHealthPots--;
            GeneralMethods.printSlow ("\t> You drank a health potion, healed for: " + healthPotionHealAmount + "."
                                        + "\n\t> You now have " + MainRPG.health + "HP."
                                        + "\n\t> You now have " + MainRPG.numHealthPots + " health potions left.\n");
            //Adds healthPotionHealAmount to health and notifies player of these changes
            
          } else {
            GeneralMethods.printSlow ("\t> You have no health potions, defeat enemies for a chance to get one");
            //If user has no health potions they won't be healed
          }
          
          //Option 3: Run!
        } 
        else if (input.equals("3")) {
          GeneralMethods.printSlow ("\t> You run away from the " + enemy);
          GeneralMethods.printSlow (enemy + ": Did you realy think it was going to be that easy? Come here and fight me.");
          continue GAME;
          //Notifies user that they have run away and jumps to the next iteration of the loop
          
          //Invalid input
        } else {
          GeneralMethods.printSlow ("\tInvalid command");
          //If invalid input is given, they will be given the chance to answer again
        }
      }
      if (MainRPG.health < 1) {
        GeneralMethods.printSlow("\nYou limp out of the battlefeild, weak from your duel.");
        
        //For both of the battles against Ganondorf, Link leaves the battle when he has lost
        if (difficulty == 5 || difficulty == 6) {
          //The question mark operator sets the users health at 100 if it was the first battle against Ganondorf, or 0 otherwise (the second battle)
          MainRPG.health = (difficulty == 5) ? 100 : 0;
          break;
        }
      
        GeneralMethods.printSlow("\nYou're in luck, " + enemy + " wants a rematch! He has regenerated your health and " +
                                 "number of Life Potions.");
        MainRPG.health = 100;
        MainRPG.numHealthPots = 3;
        /* After the inner while loop has ended, this "if" statement checks if the user lost. If so, the user is required to
         * play again until they have beat the enemy. Their health will be regenerated back to 100  and the number of health potions will go to 3*/
      }
      
      else {
        //if the user wins, the following is printed
        System.out.println("--------------------------------------");
        GeneralMethods.printSlow(" # " + enemy + " was defeated! # ");
        GeneralMethods.printSlow(" # You have " + MainRPG.health + "HP left # ");
        
        if (((int) (Math.random() * 10)) % 2 == 0) {
          MainRPG.numHealthPots++;
          GeneralMethods.printSlow(" # The " + enemy + " dropped a health potion. # ");
          GeneralMethods.printSlow(" # You now have " + MainRPG.numHealthPots + " health potion(s). # ");
          //Determines if the enemy drops a health potion for the player or not based on a 50 / 50 chance
        }
        running = false;
        //"running" which is the condition of the main while loop in the battle is turned to false
      }
    }
      System.out.println ("--------------------------------------");
      return MainRPG.health;
  }
  
  public static int mysteryChest (int coins) {
    // Initialize Variables
    int user_chest, open_chest, other_chest, prize_chest;
    String badPrize = ""; 
    String badPrize2  = "";
    String prize = "";
    char userReply;
    
    //randomly determines the amount of coins that the user can win - the "good" prize
    int maxCoins = 500;
    int coinsPrize = (int )(Math.random() * 400 + (maxCoins - 100));
    
    //Generates random value from 1-3 to assign a prize item to a chest
    prize_chest = (int)(Math.random() * 3 + 1);
    other_chest = prize_chest;
    
    /*A "for" loop is run to assign a random bad prize to a chest. Two bad prizes will be assigned since there are two 
     * chests which won't have the winning prize */
    for (int i = 1; i <= 2; i++) {
      int random = (int )(Math.random() * 8 + 1);
      //Random number is chosen from 1-8; each signifying the number of possible "bad" items
      switch (random)
      {
        case 1:
          prize = "n Apple";
          break;
        case 2:
          prize = " Sunshroom";
          break;
        case 3:
          prize = " Volten Trout";
          break;
        case 4:
          prize = " Lynel Hoof";
          break;
        case 5:
          prize = " Fortified Pumpkin";
          break;
        case 6:
          prize = " Lantern";
          break;
        case 7:
          prize = " Stone Talus";
          break;
        case 8:
          prize = " Sand Crab";
          break;
      } 
      //According to the question parameter, the prize is set using the switch mechanism
      
      if (i == 1)
        badPrize = prize;
      else 
        badPrize2 = prize;
      /*The first time the loop is run, a bad prize is assigned. The second time the loop is run, this process is done 
       * again but another bad prize variable is created. Two bad prizes are assigned since there will be two "useless" chests*/ 
    }
    
    ASCIIart.mido ();
    // Begin Game
    System.out.println ("--------------------------------------");
    GeneralMethods.printSlow ("Mido has appeared!");
    GeneralMethods.printSlow ("\nMido : Hello Link, nice to see you again. If you want to be successful in your journey, open a Kokari chest!"); 
    GeneralMethods.printSlow ("\nIt can bless you with new items, coins or weapons! Choose one of three chests below;");
    GeneralMethods.printSlow ("two of them contain useless items, the other is one that you will surely want.");
    
    // Asks for first chest selection and validates response
    do{
      user_chest = IBIO.inputInt ("\nSelect the chest (1, 2, or 3): ");
    }while (user_chest > 3 || user_chest < 0);
    
    //The 3 ASCII art chests are printed out for the user
    ASCIIart.mysteryChestCLOSED ();
    GeneralMethods.printSlow ("Chest 1:");
    GeneralMethods.pause (1000);
    ASCIIart.mysteryChestCLOSED ();
    GeneralMethods.printSlow ("Chest 2:");
    GeneralMethods.pause (1000);
    ASCIIart.mysteryChestCLOSED ();
    GeneralMethods.printSlow ("Chest 3:");
    GeneralMethods.pause (1000);
    
    //Assigns the chest that will be opened. If the chest is the chest with the prize in it or the users choice, then its will run again
    do{
      open_chest = (int)(Math.random() * 3 + 1);
    }while (open_chest == prize_chest || open_chest == user_chest);
    
    //Tells users what prize is located where, and the following game instructions
    GeneralMethods.printSlow("\nIn a moment, I will show you where the prize is located,");
    GeneralMethods.printSlow("but first I will show you what is behind one of the other chests");
    GeneralMethods.printSlow("\nBehind chest number " + open_chest + " is a" + badPrize + "!");
    GeneralMethods.printSlow("You selected chest number " + user_chest);
    
    //The 3  ASCII mystery chests are printed again, but this time one is opened. The ASCII chests are printed according to their Chest #
    if (open_chest == 1) {
      GeneralMethods.pause (2000);
      ASCIIart.mysteryChestOPEN ();
    }
    ASCIIart.mysteryChestCLOSED ();
    GeneralMethods.pause (2000);
    
    if (open_chest == 2) {
      ASCIIart.mysteryChestOPEN ();
      GeneralMethods.pause (2000);
    }
    ASCIIart.mysteryChestCLOSED ();
    GeneralMethods.pause (2000);
    
    if (open_chest == 3) {
      ASCIIart.mysteryChestOPEN ();
      GeneralMethods.pause (2000);
    }
    
    //Asks if users would like to switch their choice and validates response
    do{
      userReply = IBIO.inputChar ("\nWould you like to switch to the other chest (y) , or stay with Chest " + user_chest + " (n)? ");
    }while (userReply != 'y' && userReply != 'n');       
    
    //If the user wants to switch their choice then their selections is switched to the one chest that is not itself (user_duplicate) or the already opened chest
    int user_duplicate = user_chest;
    if (userReply == 'y') {
      do{
        user_chest = (int)(Math.random() * 3 + 1);
      }while (user_chest == open_chest || user_chest == user_duplicate);
    }
    
    GeneralMethods.printSlow("The prize is behind chest number: " + prize_chest);
    GeneralMethods.pause (2000);
    
    //Tells users their prize if they won, and how many coins they won. The updated total number of coins that the user has is returned
    if (user_chest == prize_chest) {
      GeneralMethods.printSlow("Congratulations! You won " + coinsPrize + " coins. See you later!");
      System.out.println ("--------------------------------------");
      return MainRPG.coins += coinsPrize;
    } 
    //If the user lost they recieves a useless item. The original number of coins that the user had before the game is returned
    else {
      GeneralMethods.printSlow("Oh no! You recieved a" + badPrize2 + ". Have fun with that! See you later.");
      System.out.println ("--------------------------------------");
      return MainRPG.coins;
    }
  }
  
  
  public static void deciphering () {
    /*The deciphering task is one of the five tasks in the game. The purpose of this task is to prompt problem-solving skills
     * from the user. A coded message will be given, purposely with few instructions and little context. The user is given 3 chances to solve the riddle*/
    boolean running = true;
    
    while (running) {
      System.out.println ("--------------------------------------");
      GeneralMethods.printSlow ("\ngo to theOn the trunk of the tree it reads a message: ");
      GeneralMethods.printSlow ("\nA B C D E F G H I J K L M N O P Q R S T U V W X Y");
      GeneralMethods.printSlow ("Z Y X W V U T S R Q P O N M L K J I H G F E D C B");
      GeneralMethods.printSlow ("\nTL JL GSV SBIFOV KIRMXVHH ZG GSV SBIFOV XZHGOV");
      //Prints out the clues to the coded message. The last print line is the message that needs to be deciphered.
      
      String ans = IBIO.inputString ("\nWhat does the message say? You have 3 chances to decipher the code >> ");
      //input from the user for their answer. The users input is converted to uppercase to avoid ambiguous answers
      
      String codeAns = "GO TO THE HYRULE PRINCESS AT THE HYRULE CASTLE";
      //The real answer to the problem
      
      int tries = 0;
      //Initializes the "tries" counter  
      
      while (!ans.equalsIgnoreCase (codeAns) && tries < 3) {
        GeneralMethods.printSlow ("\nI'm sorry, that is not the correct answer. Try again!");
        ans = IBIO.inputString ("\nWhat does the message say? ");
        
        tries++;
        /*A while loop keeps running until the user uses up all their tries, or until they get the answer right. When the loop 
         * is run, input is asked again from the user and their number of tries increases by one*/
      }
      
      if (ans.equalsIgnoreCase (codeAns))
        break;
      //If the users response is correct, the outer while loop ends
      else {
        GeneralMethods.printSlow ("Oh no! the inscription has faded away. You must pay 100 rupees to get three more opportunities to crack the code.");
        MainRPG.coins -= 100;
        GeneralMethods.printSlow (MainRPG.coins + " - 100 rupees");
        GeneralMethods.printSlow ("You have " + MainRPG.coins + " rupees left.");
        //If the users response is incorrect, the user is deducted 100 rupees and is allowed to try cracking the code again
      }
    }
    GeneralMethods.printSlow ("Congratulations! That is the correct solution.");
    System.out.println ("--------------------------------------");
  }
  
  public static void multipleChoice (int question) {
    /*The multipleChoice task is one of five tasks in the game. The user is asked to answer a multiple choice questions during
     * a certain point in the storyine. The question is based on events mentioned earlier*/
    
    boolean running = true;
    System.out.println ("--------------------------------------");
    ASCIIart.navi ();
    GeneralMethods.pause (2000);
    GeneralMethods.printSlow ("\nHey! it is Navi the fairy.");
    GeneralMethods.printSlow ("\nHave you been paying attention to the story? If so, then I have a question for you!");
    GeneralMethods.printSlow ("If you get the question wrong, you have to pay me 25 rupees, otherwise you can move on.");
    //Introduction and instructions
    
    while (running) {
      char realAns = ' ';
      
      switch (question)
      {
        case 1:
          GeneralMethods.printSlow ("\nThe fatherly guardian of the forest who safeguards not only the dense land around him,"); 
          GeneralMethods.printSlow ("but the small population of beings that live in his shadow");
          GeneralMethods.printSlow ("(a) Fire Temple");
          GeneralMethods.printSlow ("(b) Shadow Temple");
          GeneralMethods.printSlow ("(c) Spirit Temple");      
          GeneralMethods.printSlow ("(d) Great Deku Tree"); 
          //Question is printed according to the value in "question" paramater. This is done so that a specific question is asked at a specific time
          
          realAns = 'd';
          //A variable is given to the correct multiple choice answer
          break;
        case 2:
          GeneralMethods.printSlow ("\nGanondorf is the king of whom?");
          GeneralMethods.printSlow ("(a) Gerudos");
          GeneralMethods.printSlow ("(b) Gorons");
          GeneralMethods.printSlow ("(c) Zoras");      
          GeneralMethods.printSlow ("(d) Kokiri");
          
          realAns = 'a';
          break;
        case 3:
          GeneralMethods.printSlow ("\nThe Great Deku Tree bestowed upon Link which item?");
          GeneralMethods.printSlow ("(a) Kokiri sword");
          GeneralMethods.printSlow ("(b) Deku shield");
          GeneralMethods.printSlow ("(c) Spiritual Stone of Forest");      
          GeneralMethods.printSlow ("(d) Forest Medallion");   
          
          realAns = 'c';
          break;
      }
      
      char ansRaw1 = IBIO.inputChar ("What is the correct answer? ");
      char ans1 = Character.toLowerCase (ansRaw1);
      //A char response is asked from the user, and it is then converted to lower case to avoid ambiguous answers
      
      while (ans1 != 'a' && ans1 != 'b' && ans1 != 'c' && ans1 != 'd') {
        GeneralMethods.printSlow ("Invalid input.");
        ansRaw1 = IBIO.inputChar ("What is the correct answer? ");
        ans1 = Character.toLowerCase (ansRaw1);
        //Checks for an invalid response. If the response is invalid, the user is asked to answer again
      }
      if (ans1 == realAns) {
        GeneralMethods.printSlow ("\nCongratulations! That is the correct answer. You shall continue your journey.");
        break;
        //If the user's response is correct they move on in the story line
      }
      else {
        GeneralMethods.printSlow ("That is not the correct answer! You must pay 25 rupees and try again.");
        MainRPG.coins -= 25;
        GeneralMethods.printSlow (MainRPG.coins + " - 25 rupees");
        GeneralMethods.printSlow ("You have " + MainRPG.coins + " rupees left.");
        //if the user's response is incorrect, they are deducted 25 rupees and required to answer the question again
      }
    }
    System.out.println ("--------------------------------------");
  }
  
  public static void riddle () {
    /*The riddle method is one of five tasks in the game. The user is given a riddle and required to find the term that
     * Satisfies the statement. The purpose of the task is to prompt thinking-skills by requiring the user to interpret tricky sentences.
     * If the user is incorrect they are deducted 50 rupees and asked the riddle again*/
    System.out.println ("--------------------------------------");
    GeneralMethods.printSlow ("\nWelcome to the Riddles of Hyrule!");
    GeneralMethods.printSlow ("This is a side quest, meaning that you can't lose! But, you do have the chance of winning coins if you are successful.");
    GeneralMethods.printSlow ("A statement will be given to you, and you need to respond with the object that best satasfies this statement.");
    GeneralMethods.printSlow ("HINT: ALL THE ANSWERS ARE FOUND IN YOUR INVENTORY.");
    //Introduction and instructions
    
    boolean running = true;
    int rand = (int )(Math.random() * 8 + 1);
    //Chooses a random number between 1 and 8
    
    String realAns = "";
    String riddleStatement = "";
    
    while (running) {
      switch (rand)
      {
        case 1:
          riddleStatement = ("\nSmall, red, round, and sweet! Bring me one of this simple treat!");
          realAns = "apple";
          //According to the random number chosen, a random riddle is assigned to the user
          break;
        case 2:
          riddleStatement = ("\nKakariko Village’s specialty fruit! Its rock-hard flesh is quite resolute!");
          realAns = "fortified pumpkin";
          break;
        case 3:
          riddleStatement = ("\nThis sultry shroom will warm your bones. It makes its home in warmer zones.");
          realAns = "sunshroom";
          break;
        case 4:
          riddleStatement = ("\nIts scales and tail will zap you, no doubt! This shocking swimmer is called a … fish");
          realAns = "voltin trout";
          break;
        case 5:
          riddleStatement = ("\nIf stepped on by this, you will go poof! It starts with an L and ends with an oof!");
          realAns = "lynel hoof";
          //This is the first possible Ganodorf that can be face. He is purposely made to be impossible to beat.
          break;
        case 6:
          riddleStatement = ("\nYou've owned me in the past, I'm sure, for the darkness I'm the cure. But now I'm stuck in evil's grip, only you can make it slip");
          realAns = "lantern";
          break;
        case 7:
          riddleStatement = ("\nWith the scenery I blend, all I have to do is bend. Come, sit, enjoy the sight, you fell for it, time to fight!");
          realAns = "stone talus";
          break;
        case 8:
          riddleStatement = ("\nThe scissors by the water, on its small legs it totters");
          realAns = "sand crab";
          break;
      }
      
      GeneralMethods.printSlow (riddleStatement);
      
      String ans = IBIO.inputString ("\nWhat is the solution to this riddle? [Press (i) for inventory] ");
      //converts the users input to lowercase to avoid ambiguous answers
      
      //if the user presses "i" then the inventory is display and they are required to answer the question afterwards
      if (ans.equalsIgnoreCase ("i")) {
        GeneralMethods.inventory ();
        ans = IBIO.inputString ("\nWhat is the solution to this riddle? ");
      }
      
      if (ans.equalsIgnoreCase (realAns)) {
        GeneralMethods.printSlow ("\nCongratulations! That is the correct answer. You are awarded 100 rupees.");
        GeneralMethods.printSlow (MainRPG.coins + " + 100 rupees");
        MainRPG.coins += 100;
        GeneralMethods.printSlow ("You now have " + MainRPG.coins + " rupees.");
        break;
        //If the user's response is correct they move on in the storyline and are awarded 100 coins
      }
      else {
        GeneralMethods.printSlow ("That is not the correct answer!");
        char tryAgain = IBIO.inputChar ("\nWould you like to try again? (y/n) ");
        //Since this is a side quest, a wrong answer does not result in consequences. Instead the user is asked if they want to try again
        
        while (tryAgain != 'y' && tryAgain != 'Y' && tryAgain != 'n' && tryAgain != 'N') {
          GeneralMethods.printSlow ("Invalid input.");
          tryAgain = IBIO.inputChar ("\nWould you like to try again? (y/n) ");
          //Checks for an invalid response. If the response is invalid, the user is asked to answer again
        }
        
        if (tryAgain == 'n' || tryAgain == 'N') {
          System.out.print ("Good bye!");
          break;
          //If the user does not want to try again, they are break out of the loop. Otherwise they start the quest over again
        }
      }
    }
    System.out.println ("--------------------------------------");
  }  
}
