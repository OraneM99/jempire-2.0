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

    boolean quitMenu = false;

    public Task() {
    }

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

    public void menuBuilding(Village village, Unit villager) {
        Scanner scanner = new Scanner(System.in);
        boolean quitBuildingMenu = false;

        do {
            System.out.println("Quel bâtiment voulez-vous construire : ");
            System.out.println("1. Une maison | Coût : 10 bois");
            System.out.println("2. Une ferme | Coût : 1 pierre, 8 bois");
            System.out.println("3. Une mine | Coût : 10 bois");
            System.out.println("4. Mur de défense | Coût : ");
            System.out.println("5. Une caserne | Coût : ");
            System.out.println("6. Un atelier | Coût : ");
            System.out.println("0. Quitter");

            byte input = scanner.nextByte();

            switch (input) {
                case 1 -> buildHouse(villager, village);
                case 2 -> buildFarm(village);
                case 3 -> buildMine(village);
                case 4 -> buildDefenseWall(village);
                case 5 -> buildBarracks(village);
                case 6 -> buildWorkshop(village);
                case 0 -> quitBuildingMenu = true;
                default -> {
                    quitBuildingMenu = false;
                    System.out.println("Impossible d'effectuer cette action.");
                }
            }
        } while (!quitBuildingMenu);
    }

    public void buildHouse(Unit villager, Village village) {
        if (village.removeWood(10)) {

            House house = new House();
            village.addBuilding(house);

            village.setPopulationCapacity(
                    village.getPopulationCapacity() + 2);

            System.out.println("Maison construite ! Capacité +2");

            System.out.println("Maison construite ! Vous avez gagné un nouveau villageois.");
        }
    }

    public void buildFarm(Village village) {
        if (village.removeStone(1) && village.removeWood(8)) {
            Farm farm = new Farm();
            village.addBuilding(farm);

            System.out.println("Ferme construite ! Vous pouvez gagner plus de nourriture au prochain tour.");

        }
    }

    public void buildMine(Village village) {
        if (village.removeStone(10)) {
            Mine mine = new Mine();
            village.addBuilding(mine);
            System.out.println("Mine construite ! Vous allez désormais pouvoir récupérer de l'or et de la pierre.");
        }
    }

    public void buildDefenseWall(Village village) {
        if (village.removeIron(8) && village.removeStone(10)) {
            DefenseWall wall = new DefenseWall();
            village.addBuilding(wall);
            System.out.println("Mur construit ! Votre village est mieux protégé !");
        }
    }

    public void buildBarracks(Village village) {
        if (village.removeStone(10) && village.removeWood(5)) {
            Barrack barrack = new Barrack();
            village.addBuilding(barrack);
            System.out.println("Caserne construite ! Vous allez recruter de nouveaux soldats un peu plus vite !");
        }
    }

    public void buildWorkshop(Village village) {
        if (village.removeStone(5) && village.removeWood(5) && village.removeIron(5)) {
            Workshop workshop = new Workshop();
            village.addBuilding(workshop);
            System.out.println("Atelier construit ! Vous pouvez désormais créer des outils et des armes !");

        }
    }

    // public int workFarm(Farm farm, Village village) {
    // if (farm.getQuantity() > 0) {
    // village.setFood(village.getFood() + 5);
    // System.out.println("Vous avez gagné 5 de nourriture !");
    // } else {
    // System.out.println("Vous n'avez pas de ferme.");
    // }
    // return village.getFood();
    // }

    // public int miningStone(Mine mine, Village village) {
    // if (mine.getQuantity() > 0) {
    // village.setStone(village.getStone() + 5);
    // } else {
    // System.out.println("Vous n'avez pas de mine.");
    // }

    // return village.getStone();
    // }

    // public int miningIron(Mine mine, Village village) {
    // if (mine.getQuantity() > 0) {
    // village.setIron(village.getIron() + 4);
    // } else {
    // System.out.println("Vous n'avez pas de mine.");
    // }

    // return village.getIron();
    // }

    // public int miningIronAndStone(Mine mine, Village village) {
    // if (mine.getQuantity() > 0) {
    // village.setStone(village.getStone() + 3);
    // village.setIron(village.getIron() + 2);
    // } else {
    // System.out.println("Vous n'avez pas de mine.");
    // }

    // return village.getStone() + village.getIron();
    // }

    /*
     * public void exploring(Village village, Scout scout) {
     * if (scout.getQuantity() <= 0) {
     * System.out.println("Vous ne pouvez pas explorer sans éclaireur.");
     * } else {
     * village.setFood(getRandomRessources(1, 6));
     * village.setWood(getRandomRessources(1, 6));
     * System.out.println("Bravo vous avez récupéré" + village.getFood() + " .");
     * }
     * }
     */

    // public void createWeapon(Village village, Weapon weapon, Workshop workshop,
    // Craftman craftman) {
    // if (village.getIron() < 8) {
    // System.out.println("Vous n'avez pas les ressources nécessaires pour
    // construire une arme.");
    // } else {
    // village.setIron(village.getIron() - 8);
    // Weapon sword = new Sword();
    // System.out.println("Vous avez crée " + sword.getName());
    // }
    // }

    // public void createPickaxe(Village village, Tool tool, Workshop workshop,
    // Craftman craftman) {
    // if (village.getStone() < 3 && village.getWood() < 5) {
    // System.out.println("Vous n'avez pas les ressources nécessaires pour
    // construire une arme.");
    // } else {
    // village.setStone(village.getStone() - 3);
    // village.setWood(village.getWood() - 5);
    // Tool pickaxe = new Pickaxe();
    // System.out.println("Vous avez crée " + pickaxe.getName());
    // }
    // }
}
