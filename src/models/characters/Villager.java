package models.characters;

import models.Item.Item;

public class Villager {
    private int quantity;
    private String task;
    private Item equippedItem;
    private int health;
    private int strength;
    private int defense;

    public Villager(int quantity, String task, Item equippedItem) {
        this.quantity = quantity;
        this.task = task;
        this.equippedItem = equippedItem;
        this.health = 10;
        this.strength = 1;
        this.defense = 1;
    }

    public Villager(int quantity, String task, Item equippedItem, int health, int strength, int defense) {
        this.quantity = quantity;
        this.task = task;
        this.equippedItem = equippedItem;
        this.health = health;
        this.strength = strength;
        this.defense = defense;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public Item getEquippedItem() {
        return equippedItem;
    }

    public void setEquippedItem(Item equippedItem) {
        this.equippedItem = equippedItem;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }
}
