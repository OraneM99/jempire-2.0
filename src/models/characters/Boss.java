package models.characters;

import models.Item.Item;

public class Boss extends Villager {

    public Boss(int quantity, String task, Item equippedItem) {
        super(quantity, task, equippedItem, 30, 7, 7);
    }

}
