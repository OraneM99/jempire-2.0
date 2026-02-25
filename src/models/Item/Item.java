package models.Item;

public abstract class Item {
 private String name;
 private int damage;
 private double efficiency;
 private double durability;

 public Item(String name, double efficiency, double durability) {
  this.name = name;
  this.efficiency = efficiency;
  this.durability = 100;
 }

 public Item(String name, int damage, double efficiency, double durability) {
  this(name, efficiency, durability);
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

 public double getDurability() {
  return durability;
 }

 protected void setDurability(double durability) {
  this.durability = durability;
 }

public void useItem(double durability) {
 System.out.println("J'utilise l'item.");
}

}
