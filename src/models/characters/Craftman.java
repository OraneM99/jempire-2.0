package models.characters;

import models.Item.Item;

public class Craftman extends Villager {

    public Craftman(int quantity, String task, Item equippedItem) {
        super(quantity, task, equippedItem, 10, 2, 2);
    }

}
