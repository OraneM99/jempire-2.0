package models.characters;

import models.Item.Item;

public class Scout extends Unit {

    public Scout() {
    }

    public Scout(String task, Item equippedItem, int health, int strength, int defense, String job) {
        super(task, equippedItem, 15, 2, 2, "Eclaireur");
    }

}
