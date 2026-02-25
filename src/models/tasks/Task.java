package models.tasks;

import models.Item.Tool;

import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

import models.Item.Pickaxe;
import models.buildings.Barrack;
import models.buildings.Building;
import models.buildings.DefenseWall;
import models.buildings.Farm;
import models.buildings.House;
import models.buildings.Mine;
import models.buildings.Village;
import models.buildings.Workshop;
import models.characters.Craftman;
import models.characters.Scout;
import models.characters.Soldier;
import models.characters.Unit;
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

    public void menuBuilding(Village village, Mine mine, Farm farm, House house, DefenseWall defenseWall, Workshop workshop, Barrack barrack) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quel bâtiment voulez-vous construire : ");
        System.out.println("1. Une maison | Coût : 10 bois");
        System.out.println("2. Une ferme | Coût : 1 pierre, 8 bois");
        System.out.println("3. Une mine | Coût : 10 bois");
        System.out.println("4. Mur de défense | Coût : ");
        System.out.println("5. Une caserne | Coût : ");
        System.out.println("6. Un atelier | Coût : ");

        byte input = scanner.nextByte();

        switch (input) {
            case 1 -> buildHouse();
        
            default:
                break;
        }
    }

    public void buildHouse(Unit villager, Village village) {
        if (village.getWood() >= 10) {
            village.addUnit(new Villager());
            village.setWood(village.getWood() - 10);
            System.out.println("Bravo ! Vous avez gagné un nouveau villageois.");
        } else {
            System.out.println("Pas assez de ressources.");
        }
    }

    public void buildFarm(Village village, Farm farm, Building building) {
        if (village.getWood() >= 10 && village.getStone() >= 2) {
            building.addFarm(new Farm());
            village.setWood(village.getWood() - 10);
            village.setStone(village.getStone() - 2);
            System.out.println("Vous avez crée une ferme !");
        } else {
            System.out.println("Pas assez de ressources.");
        }

    }

    public void buildMine(Village village, Mine mine, Building building) {
        if (village.getStone() >= 10) {
            building.addMine(new Mine());
            village.setStone(village.getStone() - 10);
            System.out.println("Vous avez crée une mine !");
        } else {
            System.out.println("Pas assez de ressources.");
        }
    }

    public void buildDefenseWall(Village village, DefenseWall defenseWall, Building building) {
        if (village.getStone() >= 15 && village.getIron() >= 2) {
            building.addDefenseWall(new DefenseWall());
            village.setStone(village.getStone() - 15);
            village.setIron(village.getIron() - 2);
            System.out.println("Vous avez crée un mur de défense !");
        } else {
            System.out.println("Pas assez de ressources.");
        }
    }

    public void buildBarracks(Village village, Barrack barrack, Building building) {
        if (village.getWood() >= 5 && village.getStone() >= 10) {
            building.addBarrack(new Barrack());
            village.addUnit(new Soldier());
            village.setWood(village.getWood() - 5);
            village.setStone(village.getStone() - 10);
            System.out.println("Vous avez crée une caserne !");
        } else {
            System.out.println("Pas assez de ressources.");
        }
    }

    public void buildWorkshop(Village village, Workshop workshop, Building building) {
        if (village.getWood() >= 5 && village.getStone() >= 5 && village.getIron() >= 2) {
            building.addWorkshop(new Workshop());
            village.addUnit(new Craftman());
            village.setWood(village.getWood() - 5);
            village.setStone(village.getStone() - 5);
            village.setIron(village.getIron() - 2);
            System.out.println("Vous avez crée un atelier !");
        } else {
            System.out.println("Pas assez de ressources.");
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

/*     public void exploring(Village village, Scout scout) {
        if (scout.getQuantity() <= 0) {
            System.out.println("Vous ne pouvez pas explorer sans éclaireur.");
        } else {
            village.setFood(getRandomRessources(1, 6));
            village.setWood(getRandomRessources(1, 6));
            System.out.println("Bravo vous avez récupéré" + village.getFood() + " .");
        }
    } */

    public void createWeapon(Village village, Weapon weapon, Workshop workshop, Craftman craftman) {
        if (village.getIron() < 8) {
            System.out.println("Vous n'avez pas les ressources nécessaires pour construire une arme.");
        } else {
            village.setIron(village.getIron() - 8);
            Weapon sword = new Sword();
            System.out.println("Vous avez crée " + sword.getName());
        }
    }

    public void createPickaxe(Village village, Tool tool, Workshop workshop, Craftman craftman) {
        if (village.getStone() < 3 && village.getWood() < 5) {
            System.out.println("Vous n'avez pas les ressources nécessaires pour construire une arme.");
        } else {
            village.setStone(village.getStone() - 3);
            village.setWood(village.getWood() - 5);
            Tool pickaxe = new Pickaxe();
            System.out.println("Vous avez crée " + pickaxe.getName());
        }
    }
}
