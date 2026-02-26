package models.buildings;

import java.util.ArrayList;
import java.util.List;

import models.characters.Unit;

public class Village {
    private int wood;
    private int stone;
    private int food;
    private int iron;
    private int gold;
    private int populationCapacity = 1;
    private List<Unit> units = new ArrayList<>();
    private List<Building> buildings = new ArrayList<>();

    public Village() {
        this.wood = 100;
        this.stone = 100;
        this.food = 100;
        this.iron = 100;
        this.gold = 100;
    }

    public int getWood() {
        return wood;
    }

    public void setWood(int wood) {
        this.wood = wood;
    }

    public void addWood(int amount) {
        wood += amount;
    }

    public boolean removeWood(int amount) {
        if (wood >= amount) {
            wood -= amount;
            return true;
        }
        return false;
    }

    public int getStone() {
        return stone;
    }

    public void setStone(int stone) {
        this.stone = stone;
    }

    public void addStone(int amount) {
        stone += amount;
    }

    public boolean removeStone(int amount) {
        if (stone >= amount) {
            stone -= amount;
            return true;
        }
        return false;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food += food;
    }

    public void addFood(int amount) {
        food += amount;
    }

    public boolean removeFood(int amount) {
        if (food >= amount) {
            food -= amount;
            return true;
        }
        return false;
    }

    public int getIron() {
        return iron;
    }

    public void setIron(int iron) {
        this.iron = iron;
    }

    public void addIron(int amount) {
        iron += amount;
    }

    public boolean removeIron(int amount) {
        if (iron >= amount) {
            iron -= amount;
            return true;
        }
        return false;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public void addGold(int amount) {
        gold += amount;
    }

    public boolean removeGold(int amount) {
        if (gold >= amount) {
            gold -= amount;
            return true;
        }
        return false;
    }

    public int getPopulationCapacity() {
        return populationCapacity;
    }

    public void setPopulationCapacity(int populationCapacity) {
        this.populationCapacity = populationCapacity;
    }

    public void getAllResources() {
        System.out.println("Vos ressources sont : Bois : " + wood + " | Pierre : " + stone + " | Or : " +
                gold + " | Fer : " + iron + " | Nourriture : " + food);
    }

    public void displayUnits() {
        if (units.isEmpty()) {
            System.out.println("Vous n'avez aucun habitant.");
            return;
        }

        System.out.println("===== Vos unités =====");

        List<String> alreadyDisplayed = new ArrayList<>();

        for (int i = 0; i < units.size(); i++) {
            String job = units.get(i).getjob();

            if (alreadyDisplayed.contains(job)) {
                continue;
            }

            int count = 0;

            for (int j = 0; j < units.size(); j++) {
                if (units.get(j).getjob().equals(job)) {
                    count++;
                }
            }

            System.out.println(job + " : " + count);
            alreadyDisplayed.add(job);
        }
    }

    public void displayBuildings() {
        if (buildings.isEmpty()) {
            System.out.println("Vous n'avez aucun bâtiment.");
            return;
        }

        System.out.println("===== Vos bâtiments =====");

        List<String> alreadyDisplayed = new ArrayList<>();

        for (int i = 0; i < buildings.size(); i++) {
            String name = buildings.get(i).getName();

            if (alreadyDisplayed.contains(name)) {
                continue;
            }

            int count = 0;

            for (int j = 0; j < buildings.size(); j++) {
                if (buildings.get(j).getName().equals(name)) {
                    count++;
                }
            }

            System.out.println(name + " : " + count);
            alreadyDisplayed.add(name);
        }
    }

    public List<Unit> getUnits() {
        return units;
    }

    public boolean addUnit(Unit unit) {
        if (units.size() < populationCapacity) {
            units.add(unit);
            return true;
        } else {
            System.out.println("Capacité de population atteinte !");
            return false;
        }
    }

    public void setUnits(List<Unit> units) {
        this.units = units;
    }

    public void addBuilding(Building building) {
        buildings.add(building);
    }

    public List<Building> getBuildings() {
        return buildings;
    }

    public void setBuildings(List<Building> buildings) {
        this.buildings = buildings;
    }

}
