/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package macdonaldlab;

/**
 *
 * @author nandy
 */
public class Chick extends Animal
{
  private String myType;
  private String mySound;
  private boolean twoSounds;
  public Chick(){
      super();
      myType = "Chicken";
      mySound = "cheep";
      twoSounds = false;
  }
  public Chick(boolean makesTwoSounds){
      myType = "Chicken";
      mySound = "cheep";
      twoSounds = makesTwoSounds;
  }
  public Chick(String farmer){
      super(farmer);
            myType = "Chicken";
            mySound = "cheep";
            twoSounds = false;
  }
  public Chick(String farmer, boolean makesTwoSounds){
      super(farmer);
      myType = "Chicken";
      mySound = "cheep";
      twoSounds = makesTwoSounds;
  }

  @Override
  public String getSound()
  {
    if(twoSounds){
        int rand = (int)(Math.random()*2);
        if(rand == 0) return "cheep";
        else return "cluck";
        }
    
    return mySound; 
  }

  @Override
  public String getType()
  {
    return myType; 
  }
}
