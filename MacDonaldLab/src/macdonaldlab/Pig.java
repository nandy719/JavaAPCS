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
public class Pig extends Animal
{
  private String myType;
  private String mySound;
  public Pig(){
      super();
      myType = "pig";
      mySound = "oink";
  }
  public Pig(String farmer){
      super(farmer);
      myType = "pig";
      mySound = "oink";
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
