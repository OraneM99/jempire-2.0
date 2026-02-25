package models.buildings;

import models.characters.Soldier;
import models.characters.Unit;

public class Barrack extends Building {

<<<<<<< HEAD
   public Barrack() {
   }
=======
 public Barrack() {
  super("caserne");
 }

 /*
  * public void generateSoldier(Soldier soldier) {
  * soldier.setQuantity(soldier.getQuantity() + 1);
  * }
  */
>>>>>>> 90736eb76141c2e5f3b61637c0b463900a0b0061

   public Barrack(String name) {
      super("Caserne");
   }
}
