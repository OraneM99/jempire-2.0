package models.characters;

import models.Item.Item;

public class Villager extends Unit {

  public Villager(String task, Item equippedItem, int health, int strength, int defense, String job) {
    super(task, equippedItem, health, strength, defense, job);
  }

  public Villager(int health, int strength, int defense, String job) {
    super(health, strength, defense, job);
  }

}
