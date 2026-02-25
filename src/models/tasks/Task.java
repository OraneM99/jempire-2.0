package models.tasks;

import models.Item.Tool;
import models.Item.Pickaxe;
import models.Item.Sword;
import models.Item.Weapon;
import models.buildings.DefenseWall;
import models.buildings.Farm;
import models.buildings.Mine;
import models.buildings.Village;
import models.buildings.Workshop;
import models.characters.Craftman;
import models.characters.Scout;
import models.characters.Villager;

public class Task {
    String name;
    int min;
    int max;

    public Task(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRandomRessources(int min, int max) {
        return (int) (Math.random() * (max - min) + min);
    }

    public void buildHouse(Villager villager, Village village) {
        if (village.getWood() >= 10) {

            villager.setQuantity(villager.getQuantity() + 1);
            System.out.println("Vous avez gagné 1 villageois !");
            village.setWood(village.getWood() - 10);

        } else {
            System.out.println("Vous n'avez pas suffisament de bois.");
        }
    }

    public void buildFarm(Village village, Farm farm) {

        if (village.getWood() >= 8) {
            farm.setQuantity(farm.getQuantity() + 1);
            village.setStone(village.getStone() - 8);
        } else {
            System.out.println("Vous n'avez pas suffisament de bois.");
        }

    }

    public void buildMine(Village village, Mine mine) {

        if (village.getWood() >= 10) {
            mine.setQuantity(mine.getQuantity() + 1);
            village.setStone(village.getStone() - 10);
        } else {
            System.out.println("Vous n'avez pas suffisament de bois.");
        }

    }

    public void buildDefenseWall(Village village, DefenseWall defenseWall) {

        if (village.getStone() >= 20) {
            defenseWall.setQuantity(defenseWall.getQuantity() + 1);
            village.setStone(village.getStone() - 20);
        } else {
            System.out.println("Vous n'avez pas assez de pierres.");
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

    public void exploring(Village village, Scout scout) {
        if (scout.getQuantity() <= 0) {
            System.out.println("Vous ne pouvez pas explorer sans éclaireur.");
        } else {
            village.setFood(getRandomRessources(1, 6));
            village.setWood(getRandomRessources(1, 6));
            System.out.println("Bravo vous avez récupéré" + village.getFood() + " .");
        }
    }

    public void createWeapon(Village village, Weapon weapon, Workshop workshop, Craftman craftman) {
        if (craftman.getQuantity() == 0) {
            System.out.println("Vous ne pouvez pas construire d'armes sans artisan.");
            return;
        } else if (workshop.getQuantity() == 0) {
            System.out.println("Vous ne pouvez pas construire d'armes sans atelier.");
            return;
        } else if (village.getIron() < 8) {
            System.out.println("Vous n'avez pas les ressources nécessaires pour construire une arme.");
        } else {
            village.setIron(village.getIron() - 8);
            Weapon sword = new Sword();
            System.out.println("Vous avez crée " + sword.getName());
        }
    }

        public void createPickaxe(Village village, Tool tool, Workshop workshop, Craftman craftman) {
        if (craftman.getQuantity() == 0) {
            System.out.println("Vous ne pouvez pas construire d'armes sans artisan.");
            return;
        } else if (workshop.getQuantity() == 0) {
            System.out.println("Vous ne pouvez pas construire d'armes sans atelier.");
            return;
        } else if (village.getStone() < 3 && village.getWood() < 5) {
            System.out.println("Vous n'avez pas les ressources nécessaires pour construire une arme.");
        } else {
            village.setStone(village.getStone() - 3);
            village.setWood(village.getWood() - 5);
            Tool pickaxe = new Pickaxe();
            System.out.println("Vous avez crée " + pickaxe.getName());
        }
    }
}
