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
public class Farm
{
   private Animal [] myFarm;

   public Farm()
   {
      myFarm = new Animal [4];
      myFarm[0] = new Cow();
      myFarm[1] = new Chick();
      myFarm[2] = new Pig();
      myFarm[3] = new NamedCow("Elsie");
   }

   public void animalSounds()
   {
      Animal temp;
      for(int i = 0; i < myFarm.length; i++)
      {
         temp = myFarm[i];
         System.out.println(temp.getType() + " goes " + temp.getSound());
      }

      Chick tweety = new Chick(true);
      for(int i = 0; i < 5; i++)
      {
         System.out.println(tweety.getType() + " goes " + tweety.getSound());
      }

      NamedCow named = (NamedCow)myFarm[3];
      System.out.println("I am a cow named " + named.getName());
   }
}
