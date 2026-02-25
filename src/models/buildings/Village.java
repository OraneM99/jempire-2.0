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
    private List<Unit> units = new ArrayList<>();
    private int people;

    public Village() {
        this.wood = 0;
        this.stone = 0;
        this.food = 100;
        this.iron = 0;
        this.gold = 50;
        this.people = 1;
    }

    public int getWood() {
        return wood;
    }

    public void setWood(int wood) {
        this.wood = wood;
    }

    public int getStone() {
        return stone;
    }

    public void setStone(int stone) {
        this.stone = stone;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food += food;
    }

    public int getIron() {
        return iron;
    }

    public void setIron(int iron) {
        this.iron = iron;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }
    
    public void getAllResources() {
        System.out.println("Vos ressources sont : Bois : " + wood + " | Pierre : " + stone + " | Or : " +
                gold + " | Fer : " + iron + " | Nourriture : " + food);
    }

    public List<String> getVillagersUnits() {
        List<String> unitList = new ArrayList<>();
        for (Unit unit : units) {
            unitList.add(unit.getjob());
        }
        System.out.println("Coucou, voici tes unités, " + unitList);
        return unitList;
    }

    public List<Unit> getUnits() {
        return units;
    }

    public void addUnit(Unit unit) {
        units.add(unit);
    }

    public void setUnits(List<Unit> units) {
        this.units = units;
    }

    public int getPeople() {
        return people;
    }

    protected void setPeople(int people) {
        this.people = people;
    }
}
