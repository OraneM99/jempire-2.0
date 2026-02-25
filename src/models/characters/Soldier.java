package models.characters;

import models.Item.Item;

public class Soldier extends Villager {

    public Soldier(int quantity, String task, Item equippedItem) {
        super(quantity, task, equippedItem, 20, 3, 5);
    }
}
