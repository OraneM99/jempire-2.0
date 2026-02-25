package models.Item;

public class Pickaxe extends Tool{

  public Pickaxe(String name, double efficiency, double durability) {
  super(name, efficiency, durability);
 }
 
 public void usePickaxe(double durability, double efficiency) {
  durability = -5;
  efficiency = 1.25;
  System.out.println("Vous utilisez une pioche !");
 }

}
