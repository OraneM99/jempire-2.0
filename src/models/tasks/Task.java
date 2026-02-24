package models.tasks;

import models.buildings.Farm;
import models.buildings.Mine;
import models.buildings.Village;
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

    public void buildFarm(Village village, Farm farm) {
        if (village.getWood() >= 8) {
            farm.setQuantity(farm.getQuantity() + 1);
        } else {
            System.out.println("Vous n'avez pas suffisament de bois.");
        }
    }

    public void buildMine(Village village, Mine mine) {
        if (village.getWood() >= 10) {
            mine.setQuantity(mine.getQuantity() + 1);
        } else {
            System.out.println("Vous n'avez pas suffisament de bois.");
        }
    }

    public int workFarm(Farm farm, Village village) {
        if (farm.getQuantity() > 0) {
            village.setFood(village.getFood() + 5);
            System.out.println("Vous avez gagné 5 de nourriture !");
        } else {
            System.out.println("Vous n'avez pas de ferme.");
        }
        return village.getFood();
    }

    public int miningStone(Mine mine, Village village) {
        if (mine.getQuantity() > 0) {
            village.setStone(village.getStone() + 5);
        } else {
            System.out.println("Vous n'avez pas de mine.");
        }

        return village.getStone();
    }

    public int miningIron(Mine mine, Village village) {
        if (mine.getQuantity() > 0) {
            village.setIron(village.getIron() + 4);
        } else {
            System.out.println("Vous n'avez pas de mine.");
        }

        return village.getIron();
    }

    public int miningIronAndStone(Mine mine, Village village) {
        if (mine.getQuantity() > 0) {
            village.setStone(village.getStone() + 3);
            village.setIron(village.getIron() + 2);
        } else {
            System.out.println("Vous n'avez pas de mine.");
        }

        return village.getStone() + village.getIron();
    }
}
