package models.Item;

public class Sword extends Weapon {

 public Sword(String name, int damage, double efficiency, double durability) {
  super(name, damage, efficiency, durability);
 }

  public void useSword(double durability, int damage) {
  durability = -5;
  damage = 2;
  System.out.println("Vous utilisez une épée !");
 }

}
