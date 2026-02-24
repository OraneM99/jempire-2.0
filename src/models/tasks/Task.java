package models.tasks;

import models.buildings.Farm;
import models.buildings.Village;
import models.characters.Villager;

public class Task {
    String name;
    boolean isFarmer = false;

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

    public int workFarm(Farm farm, Village village) {
        if (!isFarmer) {
            if (farm.getQuantity() > 0) {
                village.setFood(village.getFood() + 5);
            }
        }
        return village.getFood();
    }
}
