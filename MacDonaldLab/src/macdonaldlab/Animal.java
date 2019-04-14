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

public abstract class Animal{
  private String farmer;

  public Animal(){
    farmer = "Old MacDonald";
  }
  
  public Animal(String farmer)
  {
      this.farmer = farmer;
  }

  public abstract String getSound();

  public abstract String getType();
  
  public String getFarmer()
  {
      return farmer;
  }
}