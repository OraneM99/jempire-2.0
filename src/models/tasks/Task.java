package models.tasks;

import models.characters.Villager;

public class Task {
    String name;

    public Task(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void buildHouse(Villager villager) {
        villager.setQuantity(villager.getQuantity() + 1);
        System.out.println("Vous avez gagné 1 villageois !");
        System.out.println(villager.getQuantity());
    }
}
