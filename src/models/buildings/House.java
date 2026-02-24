package models.buildings;

import models.characters.Villager;

public class House extends Building {

 Villager villager;

 public House(String name, int production) {
  super(name, production);
 }

 public void newVillager(Villager villager) {
  villager.setQuantity(villager.getQuantity() + 1);
  System.out.println("Vous avez gagné un villageois, GG !");
  System.out.println(villager.getQuantity());
 }

}
