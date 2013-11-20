//The character class for the game, used to initialize and change attributes of players. This file and its .class must be in the same directory as 'Adventure.java'

public class Character
{
  private String    name;    //mainly just for reference in the game to who is doing what, doesn't change gameplay
  private boolean   gender;  //is the character male or female? Some situations and modifiers will only occur or be applied if the character is a certain gender
  private int       age,     //age, how old the character is, normally wont change and determines modifiers and outcomes of certain situations
                    str,     //strength, how strong the character initially is, determines modifiers and outcomes of certain situations
                    agil,    //agility, how fast the character initially is, determines modifiers and outcomes of certain situations
                    intel,   //intelligence, how smart the character initally is, determines modifiers and outcomes of certain situations
                    charm;   //charm, how attractive the character initially is, determines modifiers and outcomes of certain situations
         
  public Character(String n, boolean g, int a, int s, int agi, int i, int c) //constructor
  {
    name   = n;        //-----------------------------------------------------
    gender = g;        //  This area assigns the values declared in the
    age    = a;        // constructor to the actual values. The game will ask
    str    = s;        // for each stat individually and, when all variables
    agil   = agi;      // are assigned, put together the constructor for each  
    intel  = i;        // character.
    charm  = c;        //-----------------------------------------------------
  }
  

  public String getGender() //Tells the user what gender a certain character is
  {
    String returng;  //Converts 'm' to "Male" and 'f' to "Female", for user readability
    if (gender == true)
    {
      returng = "Male";
      return returng;
    }
    else
    {
      returng = "Female";
      return returng;  
    } 
  }
  
  public int Age()  //Tells the user what age a certain character is
  {
    return age;
  }
  
  public int Strength() //Tells the user how strong a certain character is
  {
    return str;
  }
  
  public int Agility() //Tells the user how much Agility a certain character is
  {
    return agil;
  }
  
  public int Intelligence() //Tells the user how smart a certain character is
  {
    return intel;
  }
  
  public int Charm() //Tells the user how smart a certain character is
  {
    return charm;
  }
  
  public void setName(String new_name) //Changes the character's name
  {
    name = new_name;
  }
  
  public void setGender(boolean new_gend) //Changes the character's gender
  {
    System.out.println("Will the new gender be male? Enter True or False ");
    gender = new_gend;
  }
  
  public void setAge(int new_age) //Changes the character's age
  {
    age = new_age;
  }
  
  public void setStrength(int new_str) //Changes the character's strength
  {
    str = new_str;
  }
  
  public void setAgility(int new_agil) //Changes the character's agility
  {
    agil = new_agil;
  }
  
  public void setIntel(int new_intel) //Changes the character's intelligence
  {
    intel = new_intel;
  }
  
  public void setCharm(int new_charm) //Changes the character's charm
  {
    charm = new_charm;
  }
}