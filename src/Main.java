import java.lang.module.ModuleDescriptor.Builder;
import java.util.Scanner;

import models.buildings.Building;
import models.buildings.Village;
import models.characters.Soldier;
import models.characters.Unit;
import models.characters.Villager;
import models.tasks.Task;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Village player1 = new Village();
        Villager villager= new Villager(10, 1, 1,"Villageois");

        player1.addUnit(villager);

        boolean quitMenu = false;
        
        do {    
            System.out.println("--- MENU ---");
            System.out.println("1. Details du village");
            System.out.println("2. Construire un bâtiment");
            System.out.println("3. Assigner une unité");
            System.out.println("4. Former une unité (caserne)");
            System.out.println("5. Libérer une unité");
            System.out.println("6. Améliorer un bâtiment");
            System.out.println("7. Recruter une unité");
            System.out.println("8. Equiper une unité");
            System.out.println("9. Passer au jour suivant");
            System.out.println("0. Quitter");

            byte input = scanner.nextByte();
            Task task = new Task();

            switch (input) {
                case 1 -> player1.getAllResources();
                case 2 -> {
                    task.menuBuilding(player1, villager);
                    player1.displayUnits();
                    player1.displayBuildings();
                }
                case 3 -> System.out.println("On l'a pas fait encore");
                case 4 -> System.out.println("On l'a pas fait encore");
                case 5 -> System.out.println("On l'a pas fait encore");
                case 6 -> System.out.println("On l'a pas fait encore");
                case 7 -> System.out.println("On l'a pas fait encore");
                case 8 -> System.out.println("On l'a pas fait encore");
                case 9 -> System.out.println("On l'a pas fait encore");
                case 0 -> quitMenu = true;
                default -> System.out.println("Impossible de faire cette action");
                
            }
        
            /* System.out.println(player1.getVillagersUnits()); */
        } while (!quitMenu);
        System.out.println("Merci d'avoir joué, à une prochaine fois !");
        scanner.close();
    }
}
