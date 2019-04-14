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
public class Chick implements Animal
{
  private String myType;
  private String mySound;
  private boolean twoSounds;
  public Chick(){
      myType = "Chicken";
      mySound = "cheep";
      twoSounds = false;
  }
  public Chick(boolean makesTwoSounds){
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
