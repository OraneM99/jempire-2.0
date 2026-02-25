package models.characters;

import models.Item.Item;

public class Boss extends Unit {

    public Boss(String task, Item equippedItem, int health, int strength, int defense, String job) {
        super(task, equippedItem, 30, 7, 7, "Chef du village");
    }


}
