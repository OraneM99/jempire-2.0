package models.buildings;

import models.characters.Soldier;

public class Barrack extends Building {

 public Barrack(String name) {
  super("caserne");
 }

 public void generateSoldier(Soldier soldier) {
  soldier.setQuantity(soldier.getQuantity() + 1);
 }

}
