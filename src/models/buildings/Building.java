package models.buildings;

import java.util.ArrayList;
import java.util.List;

public abstract class Building {
   private String name;
   private List<House> houses = new ArrayList<>();
   private List<Barrack> barracks = new ArrayList<>();
   private List<DefenseWall> walls = new ArrayList<>();
   private List<Mine> mines = new ArrayList<>();
   private List<Farm> farms = new ArrayList<>();
   private List<Workshop> workshops = new ArrayList<>();

   public Building() {}

   public Building(String name) {
      this.name = name;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public void addHouse(House house) {
      houses.add(house);
   }

   public void addBarrack(Barrack barrack) {
      barracks.add(barrack);
   }

   public void addDefenseWall(DefenseWall wall) {
      walls.add(wall);
   }

   public void addMine(Mine mine) {
      mines.add(mine);
   }

   public void addFarm(Farm farm) {
      farms.add(farm);
   }

   public void addWorkshop(Workshop workshop) {
      workshops.add(workshop);
   }

   public List<House> getHouses() {
        return houses;
   }

   public List<Barrack> getBarracks() {
      return barracks;
   }
   
   public List<DefenseWall> getWalls() {
      return walls;
   }

   public List<Mine> getMines() {
      return mines;
   }

   public List<Farm> getFarms() {
      return farms;
   }

   public List<Workshop> getWorkshops() {
      return workshops;
   }
}
