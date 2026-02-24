package models.buildings;

public abstract class Building {
 private String name;
 private int quantity;

 public Building(String name) {
  this.name = name;
  this.quantity = 0;
 }

 public Building(String name, int quantity) {
  this.name = name;
  this.quantity = quantity;
 }

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public int getQuantity() {
  return quantity;
 }

 public void setQuantity(int quantity) {
  this.quantity = quantity;
 }
}
