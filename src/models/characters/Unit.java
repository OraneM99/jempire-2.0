package models.characters;

import models.Item.Item;

public abstract class Unit {
    private String task;
    private Item equippedItem;
    private int health;
    private int strength;
    private int defense;
    private String job;

    public Unit() {
    }

    public Unit(String job) {
    }

    public Unit(int health, int strength, int defense, String job) {
        this.health = health;
        this.strength = strength;
        this.defense = defense;
        this.job = job;
    }

    public Unit(String task, Item equippedItem, int health, int strength, int defense, String job) {
        this.task = task;
        this.equippedItem = equippedItem;
        this.health = health;
        this.strength = strength;
        this.defense = defense;
        this.job = job;
    }

    public String getTask() {
        return task;
    }

    protected void setTask(String task) {
        this.task = task;
    }

    public Item getEquippedItem() {
        return equippedItem;
    }

    protected void setEquippedItem(Item equippedItem) {
        this.equippedItem = equippedItem;
    }

    public int getHealth() {
        return health;
    }

    protected void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    protected void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDefense() {
        return defense;
    }

    protected void setDefense(int defense) {
        this.defense = defense;
    }

    public String getjob() {
        return job;
    }

    public void setjob(String job) {
        this.job = job;
    }

}