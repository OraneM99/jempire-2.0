package models.Item;

public class Item {
 String name;
 int damage;
 double efficiency;

 public Item(String name, double efficiency) {
  this.name = name;
  this.efficiency = efficiency;
 }

 public Item(String name, int damage, double efficiency) {
  this(name, efficiency);
  this.damage = damage;
 }

 public String getName() {
  return name;
 }

 protected void setName(String name) {
  this.name = name;
 }

 public int getDamage() {
  return damage;
 }

 protected void setDamage(int damage) {
  this.damage = damage;
 }

 public double getEfficiency() {
  return efficiency;
 }

 protected void setEfficiency(double efficiency) {
  this.efficiency = efficiency;
 }

}
