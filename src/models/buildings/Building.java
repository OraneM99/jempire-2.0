package models.buildings;

public abstract class Building {
 String name;

 public Building(String name) {
  this.name = name;
 }

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

}
