package models.Item;

public class Sword extends Weapon {

 public Sword() {
  super("épée", 10, 5, 10);
 }

  public void useSword(double durability, int damage) {
  durability = -5;
  damage = 2;
  System.out.println("Vous utilisez une épée !");
 }

}
