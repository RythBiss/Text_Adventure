//This file and its .class must be in the same folder as Character.java and Character.class
import java.util.Scanner;
import java.util.Random;

public class Adventure
{

  static Random dice = new Random(); //The generator is delcated out here so that it can be referenced in the "rtd()" method
  

  public static void main(String[] args)
  {
    String        name,
                  gender_string,
                  satis;
    boolean       sat,
                  gender;
    int           age,
                  str,
                  agi,
                  intel,
                  charm,
                  player_count,
                  count = 1;
    
    Scanner kb = new Scanner(System.in);
    
    System.out.print("Welcome to the adventure! How many characters will be participating? ");
    player_count = kb.nextInt();
    kb.nextLine(); //Input buffer, otherwise name is not recorded
    
    while (player_count >= count)  //This loop will be used to create all the characters
    {
      int rerolls = 1;
      System.out.println("Great! Now we will be creating player " + count + "\n");
      System.out.print("What is the character's name? ");
      name = kb.nextLine(); 
      
      System.out.print("Is the character male or female? ");
      gender_string = kb.nextLine();
      if (gender_string == "male")
        gender = true;
      else gender = false;
      
      System.out.print("How old is the character? ");
      age = kb.nextInt();
      
      
      System.out.println("Awesome, now we need to generate your character's stats.");
      System.out.println("If you are unhappy with the roll, you can reroll your stats up to 3 times\n");
      
      str   = rtd();
      agi   = rtd();
      intel = rtd();
      charm = rtd();
       
      System.out.println(name + "'s stats are: \n" + str + " Strength\n" + agi + " Agility\n" + intel + " Intelligence\n" + charm + " Charm\n");
      System.out.print("Are these satisfactory? Enter yes or no : ");
      satis = kb.nextLine();
      
      if (satis == "yes")
        sat = true;
      else sat = false;
      
      kb.nextLine(); //Clear the input buffer so the text doesn't mess up
      
      
      do //If the user is unhappy with his/her roll, then the entire process will occur again up to 3 times
      {
        System.out.println("This is reroll #" + rerolls);
        str   = rtd();
        agi   = rtd();
        intel = rtd();
        charm = rtd();
       
        System.out.println(name + "'s stats are: \n" + str + " Strength\n" + agi + " Agility\n" + intel + " Intelligence\n" + charm + " Charm\n");
        System.out.print("Are these satisfactory? Enter yes or no : ");
        satis = kb.nextLine();
          
        if (satis == "yes")
          sat = true;
        else sat = false;
          
        rerolls++;
          
      } while (sat == false && rerolls <= 3); //End of dowhile loop for re-generating stats
      
      System.out.println("\n" + name + "'s character creation is complete! \n\n");
      count++;
      
    } //End of character creation loop
  
    if (player_count == 1)
    {
      System.out.println("This is a story of a great and mighty adventurer, who goes on an extravagent quest for treasure, adventure, and women");
      System.out.println("He's probably going to die horribly, but that's beside the point!");
    }
    else
    {
      System.out.println("This is a story of " + player_count + " mighty adventurers, who travel together on an extravagent quest for women, women, and more women!");
      System.out.println("I'm pretty certain atleast one of them is going to die on the journey, but don't tell them that.");
    }
    
    
  
  } //End of main definition
  
  
  private static int rtd() //A method that greatly shortens the amount of typing required to obtain a dice roll, emulating a d20
  {
    int result;
    
    result = dice.nextInt(19);
    result++;
    
    return result;
  } //End of rtd() definition
  
} //End of class definition