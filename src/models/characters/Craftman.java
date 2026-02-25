package models.characters;

import models.Item.Item;

public class Craftman extends Unit {

    public Craftman() {
    }

    public Craftman(String task, Item equippedItem, int health, int strength, int defense, String job) {
        super(task, equippedItem, 10, 2, 2, "artisan");
    }

}
