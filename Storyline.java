/* 
     * Name: Ivan Mudarth 
     * Project Name: RPG
     * File Name: Storyline.java 
     * Teacher: Ms. Arif 
     * The Storyline class contains all the sections of storyline; main story side story or ending, in the form of seperate modules. 
     * They are then called in the main method. This is done to not clump up the main method
    */
 
public class Storyline {
  public static void storyline1 () {
    //Initializes variable
    char input;
    
    GeneralMethods.blank ();
    System.out.println ("\n#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#");
    System.out.println ("#$#$#$#$#$#$#$                $#$#$#$#$#$#$");
    System.out.println ("#$# [02'01]--- Kokiri Forest ---[02'01] #$#");                    
    System.out.println ("#$#$#$#$#$#$#$                $#$#$#$#$#$#$");   
    System.out.println ("#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#");
    GeneralMethods.pause (3000);
    GeneralMethods.printSlow ("\nDeku Tree : In the vast, deep forest of Hyrule... Long have I served as the");
    GeneralMethods.printSlow ("guardian spirit... I am known as the Deku Tree...");
    GeneralMethods.printSlow ("\n* - A boy named 'Link' is seen sleeping inside of a treehouse.");
    GeneralMethods.printSlow ("\nNavi : Hello, Link! Wake up! The Great Deku Tree wants to talk to you! Link, get up!"); 
    GeneralMethods.printSlow ("\nHey! C'mon! Can Hyrule's destiny really depend on such a lazy boy?");
    GeneralMethods.printSlow ("\n* - Link has a flashback.");
    GeneralMethods.pause (500);
    ASCIIart.horseBack();
    GeneralMethods.pause (500);
    ASCIIart.horseBackINVERTED();
    GeneralMethods.pause (500);
    ASCIIart.horseBack();
    GeneralMethods.pause (500);
    ASCIIart.horseBackINVERTED();
    GeneralMethods.pause (500);
    ASCIIart.horseBack();
    GeneralMethods.pause (500);
    ASCIIart.horseBackINVERTED();
    GeneralMethods.pause (500);
    ASCIIart.horseBack();
    GeneralMethods.pause (500);
    GeneralMethods.printSlow ("\n* - Link awakens.");
    GeneralMethods.pause (2000);
    ASCIIart.linkFront ();
    GeneralMethods.pause (2000);
    GeneralMethods.printSlow ("\nNavi : You finally woke up! I'm Navi the fairy! The Great Deku Tree asked");
    GeneralMethods.printSlow ("me to be your partner from now on! Nice to meet you!");
    GeneralMethods.pause (2000);
    ASCIIart.navi ();
    GeneralMethods.pause (2000);
    GeneralMethods.printSlow ("\nThe Great Deku Tree has summoned you! So let's get going, right now!");
    GeneralMethods.blank ();
    System.out.println ("\n#$#$#$#$#$#$#$#$#$#$#$#$#");
    System.out.println ("$# Entering the meadow #$");
    System.out.println ("#$#$#$#$#$#$#$#$#$#$#$#$#");
    GeneralMethods.pause (2000);
    GeneralMethods.printSlow ("\nMido : Hey you! 'Mr. No Fairy!' What's your business with the Great Deku");
    GeneralMethods.printSlow ("Tree? Without a fairy, you're not even a real man!");
    GeneralMethods.printSlow ("\nWhat?! You've got a fairy?! Say what? The Great Deku Tree actually");
    GeneralMethods.printSlow ("summoned you? Whaaaaaaat?! Why would he summon you and not the great");
    GeneralMethods.printSlow ("Mido? This isn't funny...");
    GeneralMethods.printSlow ("\nI don't believe it! You aren't even fully equipped yet! How do you");
    GeneralMethods.printSlow ("think you're going to help the Great Deku Tree without both a sword");
    GeneralMethods.printSlow ("and shield ready?");
    GeneralMethods.printSlow ("\nWhat? You're right. I don't have my equipment ready, but... If you");
    GeneralMethods.printSlow ("want to pass through here, you should at least equip a sword and shield!");
    GeneralMethods.printSlow ("\n**In the shop (s) you can buy different weapons using rupees");
    GeneralMethods.printSlow ("**Check your inventory (i) to see what items you have in your possession");
    //Asks the user to check out the shop or inventory. Invalid input is handled by the do while loop 
    do {
      input = IBIO.inputChar ("\nPress (i) inventory or (s) shop: ");
    }while (input != 'i' && input != 'I'&& input != 's' && input != 'S');
    //displays the inventory if the user presses 'i' or 'I.' Displays the shop otherwise
    if (input == 'i' || input == 'I') {
      GeneralMethods.inventory ();
      GeneralMethods.printSlow ("Mido: Now here is the shop");
      GeneralMethods.shop ();
    }
      else {
      GeneralMethods.shop ();
      GeneralMethods.printSlow ("Mido: Now here is the inventory");
      GeneralMethods.inventory ();
      }
    GeneralMethods.printSlow ("\nMido: Since you don't have many rupees, you can have my sword!");
    GeneralMethods.printSlow ("* - Link receives a sword");
    ASCIIart.masterSword ();
    GeneralMethods.pause (3000);
    GeneralMethods.blank ();
    System.out.println ("\n#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$");
    System.out.println ("$# Great Deku Tree's Meadow #$");
    System.out.println ("#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$");
    GeneralMethods.pause (3000);
    ASCIIart.dekuTree ();
    GeneralMethods.pause (2000);
    GeneralMethods.printSlow ("\nDeku Tree : Oh... Navi... Thou hast returned...");
    GeneralMethods.printSlow ("\nLink... The time has come to test thy courage... I have been");
    GeneralMethods.printSlow ("cursed... I need you to break the curse with your wisdom and courage.");
    GeneralMethods.pause (3000);
  }
  
  public static void storyline2 () {
    GeneralMethods.printSlow ("\nDeku Tree : Link... Thou must know my time is short...");
    GeneralMethods.printSlow ("Now...listen carefully... A wicked man of the desert cast this");
    GeneralMethods.printSlow ("dreadful curse upon me...");
    GeneralMethods.printSlow ("\nThis evil man ceaselessly uses his vile, sorcerous powers in his");                      
    GeneralMethods.printSlow ("search for the Sacred Realm that is connected to Hyrule... For it");                      
    GeneralMethods.printSlow ("is in that Sacred Realm that one will find the divine relic,");   
    GeneralMethods.printSlow ("the Triforce, which contains the essence of the gods...");
    GeneralMethods.printSlow ("\nThou must never allow the desert man in black armor to lay his hands");
    GeneralMethods.printSlow ("on the sacred Triforce...");
    GeneralMethods.printSlow ("\n* -With the Deku Tree’s last ounce of energy, he reveals a message on the");  
    GeneralMethods.printSlow ("bark of the tree");
    GeneralMethods.pause (3000);
  }
  
  public static void storyline3 () {
    GeneralMethods.printSlow ("\nNavi : Let's go to Hyrule Castle, Link!!");
    GeneralMethods.printSlow ("\nGood-bye...Great Deku Tree...");
    GeneralMethods.printSlow ("\n* - Navi pauses for a moment, before following Link out of the meadow.");
    GeneralMethods.pause (2000);
    System.out.println ("\n#$#$#$#$#$#$#$#$#$#$#$#$#$");
    System.out.println ("$#  Exiting the meadow  #$");
    System.out.println ("#$#$#$#$#$#$#$#$#$#$#$#$#$");
    GeneralMethods.blank ();
    GeneralMethods.pause (3000);
  }
  
  public static void storyline4 () {
    GeneralMethods.blank ();
    System.out.println ("\n#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$$#$");
    System.out.println ("#$#$#$#$#$#$#$                   $#$#$#$#$#$#");
    System.out.println ("#$# [02'03] --- Hyrule Castle --- [02'03] #$#");
    System.out.println ("#$#$#$#$#$#$#$                   $#$#$#$#$#$#");
    System.out.println ("#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$$#$");
    GeneralMethods.pause (3000);
    ASCIIart.hyruleCastle ();
    GeneralMethods.pause (3000);
    GeneralMethods.printSlow ("\nGaebora : Hey, Link! This way! The princess is inside the castle just ahead.");
    GeneralMethods.printSlow ("Be careful not to get caught by the guards! Ho ho ho hoot!");
    GeneralMethods.pause (1000);
    ASCIIart.zelda ();
    GeneralMethods.pause (3000);
    GeneralMethods.printSlow ("\nZelda : Who?! Who are you? How did you get past the guards?");
    GeneralMethods.printSlow ("\nOh? What's that? Is that...a fairy?! Then, are you... are you");
    GeneralMethods.printSlow ("from the forest? Then...then...you wouldn't happen to have...");
    GeneralMethods.printSlow ("the Spiritual Stone of the Forest, would you?! That green and");
    GeneralMethods.printSlow ("shining stone...");
    GeneralMethods.printSlow ("\nOh, I'm sorry! I got carried away and I didn't even");
    GeneralMethods.printSlow ("properly introduce myself! I am Zelda, Princess of Hyrule.");
    GeneralMethods.printSlow ("\nWhat is your name? ..... Link... Strange...it sounds somehow...");
    GeneralMethods.printSlow ("familiar.");
    GeneralMethods.printSlow ("\nOK then, Link... I'm going to tell you the secret of the Sacred");
    GeneralMethods.printSlow ("Realm that has been passed down by the Royal Family of Hyrule.");
    GeneralMethods.printSlow ("Please keep this a secret from everyone...");
    GeneralMethods.pause (2000);
  }
  
  public static void storyline5 () {
    GeneralMethods.printSlow ("\nZelda : The legend goes like this...");
    GeneralMethods.printSlow ("\nThe three goddesses hid the Triforce containing the power of the");
    GeneralMethods.printSlow ("gods somewhere in Hyrule. If someone with an evil mind has the triforce in their");
    GeneralMethods.printSlow ("possession, the world will be consumed by evil...");
    GeneralMethods.printSlow ("\nThe man who symbolizes this evil is Ganondorf, the leader of the Gerudos.");
    GeneralMethods.printSlow ("What Ganondorf is after must be nothing less than the Triforce of the Sacred Realm.");
    GeneralMethods.printSlow ("He must have come to Hyrule to obtain it! And, he wants to conquer Hyrule...no, the entire world!");
    GeneralMethods.printSlow ("\nLink...now, we are the only ones who can protect Hyrule! I need your help.");
    GeneralMethods.pause (3000);
  }
  
  public static void storyline6 () {
    GeneralMethods.printSlow ("\nZelda : Thank you!");
    GeneralMethods.printSlow ("\nI...I am afraid... I have a feeling that man is going to destroy");
    GeneralMethods.printSlow ("Hyrule. He has such terrifying power! But it's fortunate that you have come...");
    GeneralMethods.printSlow ("\nWe must not let Ganondorf get the Triforce! I will protect the");
    GeneralMethods.printSlow ("Ocarina of Time with all my power! He shall not have it! You go find");
    GeneralMethods.printSlow ("the other two Spiritual Stones! Let's get the Triforce before");
    GeneralMethods.printSlow ("Ganondorf does, and then defeat him!");
    GeneralMethods.printSlow ("\nThe first Spiritual Stone can be found in Goron City. Hurry! Ganondorf is becoming");
    GeneralMethods.printSlow ("more powerful as we speak.");
    GeneralMethods.pause (2000);
    GeneralMethods.blank ();
    System.out.println ("\n#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$");
    System.out.println ("$#  Goron City  -  Darunia  #$");
    System.out.println ("#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$");
    GeneralMethods.pause (2000);
    GeneralMethods.printSlow ("\nDarunia : I am Darunia! I'm the big boss of the Gorons! Was there something");
    GeneralMethods.printSlow ("you wanted to ask me about?");
    GeneralMethods.printSlow ("\nWhat? You want the Spiritual Stone of Fire, too? The Spiritual Stone");
    GeneralMethods.printSlow ("of Fire, also known as the Goron's Ruby, is our race's hidden treasure... But hold");
    GeneralMethods.printSlow ("on--I'm not going to give it to you that easily, if you want it so badly...");
    GeneralMethods.printSlow ("\nWhy don't you fight me if you want the it. Prove you are worthy of its possession!");
    GeneralMethods.pause (3000);
  }
  
  public static void storyline7 () {
    GeneralMethods.printSlow ("\nDarunia : Well done! I am certainly impressed by your fighting skills.");
    GeneralMethods.printSlow ("\n ** You obtained the Goron's Ruby! This is the Spiritual Stone of Fire");
    GeneralMethods.printSlow ("passed down by the Gorons!");
    GeneralMethods.pause (2000);
    ASCIIart.spiritualStone ();
    GeneralMethods.pause (2000);
    GeneralMethods.printSlow ("\nNavi : Link! We must leave now. The final Spiritual Stone is in the possession of");
    GeneralMethods.printSlow ("Princess Ruto.");
    GeneralMethods.pause (3000);
  }
  
  public static void storyline8 () {
    GeneralMethods.blank ();
    System.out.println ("\n#$#$#$#$#$#$#$#$#$#$#$#$");
    System.out.println ("$#  Inside Jabu-Jabu  #$");
    System.out.println ("#$#$#$#$#$#$#$#$#$#$#$#$");
    GeneralMethods.pause (3000);
    GeneralMethods.printSlow ("\nRuto : You! Who are you?!");
    GeneralMethods.printSlow ("\nI am Ruto, Princess of the Zoras. What? You want my Spiritual Stone? It won’t ");
    GeneralMethods.printSlow ("Be that easy Link. Word has spread through the land of your bravery and your fighting");
    GeneralMethods.printSlow ("ability from your encounter with Darunia.");
    GeneralMethods.printSlow ("If you are really worthy of the Spiritual Stone of Water you must prove yourself");
    GeneralMethods.printSlow ("Yet again. But this time it will be against a far tougher enemy.");
    GeneralMethods.printSlow ("You must fight Ghuido, my finest soldier.");
  }
  
  public static void storyline9 () {
    GeneralMethods.printSlow ("\nRuto : Ok I must say, I am impressed! Few people are brave enough to battle Ghuido,");
    GeneralMethods.printSlow ("let alone beat him!");
    GeneralMethods.printSlow ("\nAll right! I'll give you my most precious possession: Zora's Sapphire!");
    GeneralMethods.pause (2000);
    ASCIIart.spiritualStone ();
    GeneralMethods.pause (2000);
    GeneralMethods.printSlow ("\n ** : You obtained Zora's Sapphire! This is the Spiritual Stone of Water passed down by the Zoras!");
    GeneralMethods.printSlow ("\nHer most precious possession? You don't know what she's talking");
    GeneralMethods.printSlow ("about, but you've finally collected all three Spiritual Stones!!");
    GeneralMethods.printSlow ("Go back to see Princess Zelda!");
    GeneralMethods.pause (3000);
  }
  
  public static void storyline10 () {
    GeneralMethods.blank ();
    System.out.println ("\n#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$$#$#$#");
    System.out.println ("#$#$#$#$#$#$#$                      $#$#$#$#$#$#$#");
    System.out.println ("#$# [02'12] --- Hyrule Castle Town --- [02'12] #$#");
    System.out.println ("#$#$#$#$#$#$#$                      $#$#$#$#$#$#$#");
    System.out.println ("#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$$#$#$#");
    GeneralMethods.pause (3000);
    GeneralMethods.printSlow ("\n* - Link comes to the town's entrance after nightfall, during a rainstorm.");
    GeneralMethods.printSlow ("      The drawbridge lowers, allowing Impa and Zelda to exit upon a horse.");
    GeneralMethods.printSlow ("\n* - Ganondorf soon emerges from the town upon his own horse.");
    GeneralMethods.pause (2000);
    ASCIIart.horseBack ();
    GeneralMethods.pause (2000);
    GeneralMethods.printSlow ("\nGanondorf : Arrrrgh! I lost her!");
    GeneralMethods.printSlow ("\nYou, over there! Little kid! You must have seen the white horse");
    GeneralMethods.printSlow ("gallop past just now... Which way did it go?! Answer me!!");
    GeneralMethods.printSlow ("\nSo, you think you can protect them from me... You've got guts, kid.");
    GeneralMethods.printSlow ("\n* - Link readies his sword.");
    GeneralMethods.pause (2000);
    ASCIIart.linkFront ();
    GeneralMethods.pause (2000);
    GeneralMethods.printSlow ("\nGanondorf : Heh heh heh... You want a piece of me?! Very funny! I like your attitude!");
    GeneralMethods.printSlow ("\n* - He raises his left hand and draws magical energy, which forms");
    GeneralMethods.printSlow ("a sphere. Ganondorf launches the sphere at Link, knocking him to the");
    GeneralMethods.printSlow ("ground upon impact.");
    GeneralMethods.printSlow ("\nGanondorf : Pathetic little fool! Do you realize who you are dealing with?!");
    GeneralMethods.printSlow ("I am Ganondorf! And soon, I will rule the world!");
    GeneralMethods.printSlow ("\n* - He takes his leave.");
    GeneralMethods.pause (3000);
  }
  
  public static void storyline11 () {   
    GeneralMethods.blank ();
    GeneralMethods.pause (3000);
    GeneralMethods.printSlow ("\n**7 Years Later");
    GeneralMethods.pause (4000);
    GeneralMethods.blank ();
    System.out.println ("\n#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$");
    System.out.println ("#$#$#$#$#$#$#$                      $#$#$#$#$#$#$#");
    System.out.println ("#$# [02'12] --- Hyrule Castle Town --- [02'12] #$#");
    System.out.println ("#$#$#$#$#$#$#$                      $#$#$#$#$#$#$#");
    System.out.println ("#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$");
    GeneralMethods.pause (2000);
    GeneralMethods.printSlow ("\nZelda : It is I, the Princess of Hyrule, Zelda.");
    GeneralMethods.printSlow ("\nI apologize for meeting you in disguise, but it was necessary to");
    GeneralMethods.printSlow ("hide from the King of Evil. Please forgive me...");
    GeneralMethods.printSlow ("\nOn that day, seven years ago, Ganondorf attacked Hyrule Castle.");
    GeneralMethods.printSlow ("I saw you as I was escaping from the castle with my attendant, Impa.");
    GeneralMethods.printSlow ("I thought I should entrust the Ocarina to you... I thought that");
    GeneralMethods.printSlow ("would be our best chance...");
    GeneralMethods.printSlow ("\nAs long as you had the Ocarina in your possession, I thought");
    GeneralMethods.printSlow ("Ganondorf could never enter the --");
    GeneralMethods.printSlow ("\n* - The temple begins to tremble.");
    GeneralMethods.printSlow ("\nZelda : That rumbling...It can't be!?");
    GeneralMethods.pause (2000);
    ASCIIart.ganondorf ();
    GeneralMethods.pause (2000);
    GeneralMethods.printSlow ("\n* - A crystal surrounds Zelda. Ganondorf transmits his voice.");
    GeneralMethods.printSlow ("\nGanondorf : Princess Zelda...you foolish traitor!");
    GeneralMethods.printSlow ("\nI commend you for avoiding my pursuit for seven long years.");
    GeneralMethods.printSlow ("But you let your guard down... I knew you would appear if I");
    GeneralMethods.printSlow ("let this kid wander around!");
    GeneralMethods.printSlow ("\nMy only mistake was to slightly underestimate the power of this kid...");
    GeneralMethods.printSlow ("\n* - The crystal floats into the air.");
    GeneralMethods.printSlow ("When I obtain these two Triforces... Then, I will become the true ruler of the world!!");
    GeneralMethods.printSlow ("\nIf you want to rescue Zelda, come to my castle!");
    GeneralMethods.printSlow ("\n* - The crystal disappears. Ganondorf laughs.");
    GeneralMethods.pause (2000);
  }
  
  public static void storyline12 () {
    //initializes variable
    char input;
    GeneralMethods.blank ();
    System.out.println ("\n#$#$#$#$#$#$#$#$#$#$#$");
    System.out.println ("$#  Ganon's Castle  #$");
    System.out.println ("#$#$#$#$#$#$#$#$#$#$#$");
    GeneralMethods.pause (2000);
    GeneralMethods.printSlow ("\nMido : Link...can you hear me? It's Mido, the Sage.");
    GeneralMethods.printSlow ("\nIf you want to rescue Zelda and regain control of the Triforce, then you must fight");
    GeneralMethods.printSlow ("Ganondorf. This will be your toughest battle yet, but to better your chances of ");
    GeneralMethods.printSlow ("Winning purchase better weapons from the shop.");
    do {
      input = IBIO.inputChar ("\nPress (s) shop: ");
    }while (input != 's' && input != 'S');
    //displays the shop if the user presses 's' or 'S'
    GeneralMethods.shop ();
    GeneralMethods.printSlow ("\nGanondorf : The Triforce parts are resonating... They are combining into one");
    GeneralMethods.printSlow ("again... The two Triforce parts that I could not capture on that day");
    GeneralMethods.printSlow ("seven years ago... I didn't expect they would be hidden within you");
    GeneralMethods.printSlow ("two! And now, finally, all the Triforce parts have gathered here!");
    GeneralMethods.printSlow ("These toys are too much for you! I command you to return them to me!");
    GeneralMethods.printSlow ("\n* - He raises his right hand, the symbol of the Triforce glowing thereupon.");
    GeneralMethods.printSlow ("A stream of dark light surges towards Link.");
    GeneralMethods.pause (2000);
  }
  
  public static void storyline13 () {
    GeneralMethods.printSlow ("\n* - Ganondorf conjours a blast of magic that destroys the roof and walls of");
    GeneralMethods.printSlow ("the room. Thereafter, he collapses.");
    GeneralMethods.printSlow ("\nThe crystal containing Zelda disappears.");
    GeneralMethods.printSlow ("\n* - The castle begins to tremble violently.");
    GeneralMethods.printSlow ("\nZelda : Link, listen to me! This tower will collapse soon! With his last");
    GeneralMethods.printSlow ("breath, Ganondorf is trying to crush us in the ruins of the tower!");
    GeneralMethods.printSlow ("We need to hurry and escape!");
    GeneralMethods.printSlow ("\nPlease follow me!");
    GeneralMethods.printSlow ("\n* - Zelda and Link escape the castle shortly before it falls apart.");
    GeneralMethods.printSlow ("\nZelda : It's over...it's finally over...");
    GeneralMethods.printSlow ("\nNavi : Link... I'm sorry I couldn't help you in the battle before!");
    GeneralMethods.printSlow ("\n* - A rumble is heard.");
    GeneralMethods.printSlow ("\nZelda : What is that sound?");
    GeneralMethods.printSlow ("\nGanondorf : YOU... CURSE YOU...ZELDA! CURSE YOU...SAGES!! CURSE YOU...LINK!");
    GeneralMethods.printSlow ("\nSomeday... When this seal is broken... That is when I will exterminate your descendants!!");
    GeneralMethods.pause (500);
    GeneralMethods.printSlow ("\nZelda : Thank you, Link... Thanks to you, Ganondorf has been sealed inside");
    GeneralMethods.printSlow ("the Evil Realm! Thus, peace will once again reign in this world...");
    GeneralMethods.printSlow ("for a time.");
    GeneralMethods.printSlow ("\nGood-bye....");
    GeneralMethods.pause (1000);
    ASCIIart.end ();
    GeneralMethods.pause (2000);
  }
  
  public static void sidestory1 () {
    GeneralMethods.printSlow ("Deku Tree: Then you must head to Master Yusuke. He will train you");
    GeneralMethods.blank ();
    GeneralMethods.pause (2000);
    System.out.println ("\n#$#$#$#$#$#$#$#$#$#$#$#$#$#");
    System.out.println ("$#  Master Yusuke’s Dojo #$");
    System.out.println ("#$#$#$#$#$#$#$#$#$#$#$#$#$#");
    GeneralMethods.pause (2000);
    ASCIIart.dojo ();
    GeneralMethods.pause (3000);
    GeneralMethods.printSlow ("\nMaster Yusuke : Oh! What is the matter, Link? You have an");
    GeneralMethods.printSlow ("urgent look about you... Has something happened?");
    GeneralMethods.printSlow ("\nWhatever it is, from the look on your face I suspect it is no");
    GeneralMethods.printSlow ("laughing matter...");
    GeneralMethods.printSlow ("\nWhat say you, Link?");
    GeneralMethods.printSlow ("\nAh, you have come for some serious instruction in the way of the");
    GeneralMethods.printSlow ("Sword.");
    GeneralMethods.printSlow ("\nPractise with me. Don’t worry, I will go easy!");
    GeneralMethods.pause (2000);
  }
  
  public static void sidestory2 () {
    GeneralMethods.printSlow ("\nMaster Yusuke : And yet… I sense a certain anxiousness in the sword you"); 
    GeneralMethods.printSlow ("hold… An eagerness that goes far beyond the mere desire to be wielded on the"); 
    GeneralMethods.printSlow ("Fields of battle");
    GeneralMethods.printSlow ("\nBut I have faith in you. Somehow, I doubt you will misuse that sword...");
    GeneralMethods.pause (2000);
  }
  public static void sidestory3 () {
    char input;
    GeneralMethods.blank ();
    System.out.println ("\n#$#$#$#$#$#$#$#$#$#$");
    System.out.println ("$#  Hyrule Market #$");
    System.out.println ("#$#$#$#$#$#$#$#$#$#$");
    GeneralMethods.printSlow ("\nSeller 1: Hey you! Come here. I have a great deal for you. Only 300 rupees for White Armor");
    do {
      input = IBIO.inputChar ("\nPress (s) shop: ");
    }while (input != 's' && input != 'S');
    //displays the shop if the user presses 's' or 'S'
    GeneralMethods.shop ();
    GeneralMethods.printSlow ("\nSeller 2: Young boy! Those clothes look awfully dirty. I have a new set for just");
    GeneralMethods.printSlow ("20 rupees. No, no, don’t leave!");
    GeneralMethods.pause (2000);
  }
  
  public static void sidestory4 () {
    GeneralMethods.printSlow ("\nGibdo: Wait a minute! I notice you. Aren’t you the boy who beat Master Yusuke?");
    GeneralMethods.printSlow ("No one has beat him in years! Are you really that good?");
    GeneralMethods.printSlow ("\nBibdo: He’s a fake, Gibdo. You are definitely stronger!");
    GeneralMethods.printSlow ("\nGibdo: Hmm… I think I am stronger too. You can’t come into this marketplace");
    GeneralMethods.printSlow ("Thinking that you are better than me. In fact, I challenge you to a fight! If you");
    GeneralMethods.printSlow ("Are really as good as they say you are meet me in the Hyrule Arena.");
    GeneralMethods.pause (2000);
  }
  
  public static void sidestory5 () {
    GeneralMethods.blank ();
    System.out.println ("\n#$#$#$#$#$#$#$#$#$#");
    System.out.println ("$#  Hyrule Arena #$");
    System.out.println ("#$#$#$#$#$#$#$#$#$#");
    GeneralMethods.pause (2000);
    GeneralMethods.printSlow ("\nGibdo: Looks like you showed up, surprisingly.");
    GeneralMethods.pause (2000);
  }
  
  public static void sidestory6 () {
    GeneralMethods.printSlow ("\nWow! I am impressed. You have really earned my respect.");
    GeneralMethods.printSlow ("\nIf you want I can show you a quick way to earn rupees!");
    GeneralMethods.pause (2000);
  }
  
  public static void sidestory7 () {
    GeneralMethods.printSlow ("\nNavi : Hey! Link, its Navi. I have been watching over you ever since you left");
    GeneralMethods.printSlow ("from the Kokiri Forest. I reported the outcome of your battles and both the Great");
    GeneralMethods.printSlow ("Deku Tree and I are impressed.");
    GeneralMethods.printSlow ("\nWe have decided that you are ready to take on this responsibility! Meet me back");
    GeneralMethods.printSlow ("at the Kokiri Forest and we will tell you more");
    GeneralMethods.pause (2000);
    GeneralMethods.blank ();
    System.out.println ("\n#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$");
    System.out.println ("$#  Great Deku Tree's Meadow  #$");
    System.out.println ("#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$");
    GeneralMethods.pause (2000);
  }
  
  public static void alternateEnding () {
    GeneralMethods.printSlow ("\nGanondorf: That was just as easy as I expected!");
    GeneralMethods.printSlow ("\nNow that I have the Triforce and access to the Door of Time you have given me the power to");
    GeneralMethods.printSlow ("exterminate anything that crosses my path");
    GeneralMethods.printSlow ("\nEvil will once again reign in Hyrule.");
    GeneralMethods.pause (100);
    ASCIIart.end ();
    GeneralMethods.pause (2000);
  }
}
