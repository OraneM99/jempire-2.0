package models.characters;

import models.Item.Item;

public class Scout extends Villager {

    public Scout(int quantity, String task, Item equippedItem) {
        super(quantity, task, equippedItem, 15, 2, 2);
    }

}
