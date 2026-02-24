package models.buildings;

public abstract class Building {
 String name;
 int production;

 public Building(String name, int production) {
  this.name = name;
  this.production = production;
 }

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public int getProduction() {
  return production;
 }

 public void setProduction(int production) {
  this.production = production;
 }

}
