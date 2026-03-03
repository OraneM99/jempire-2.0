package models.characters;

import models.Item.Item;

public class Soldier extends Unit {

    public Soldier() {
    }

    public Soldier(String task, Item equippedItem, int health, int strength, int defense, String job) {
        super(task, equippedItem, 20, 5, 5, "Soldat");
    }

    // public Soldier(int health, int strength, int defense, String job) {
    //     super(health, strength, defense, job);
    // }

}
