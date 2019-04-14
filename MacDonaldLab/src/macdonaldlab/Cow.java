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
public class Cow extends Animal
{
  private String myType;
  private String mySound;
  public Cow(){
      super();
      myType = "cow";
      mySound = "moo";
  }
  public Cow(String farmer){
      super(farmer);
      myType = "cow";
      mySound = "moo";
  }

  @Override
  public String getSound()
  {
    return mySound; 
  }

  @Override
  public String getType()
  {
    return myType; 
  }
}
