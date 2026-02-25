package models.Item;

public class Pickaxe extends Tool{

  public Pickaxe() {
  super("pioche", 5, 10);
 }
 
 public void usePickaxe(double durability, double efficiency) {
  durability = -5;
  efficiency = 1.25;
  System.out.println("Vous utilisez une pioche !");
 }

}
