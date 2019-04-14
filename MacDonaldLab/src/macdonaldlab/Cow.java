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
public class Cow implements Animal
{
  private String myType;
  private String mySound;
  public Cow(){
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
