import java.lang.module.ModuleDescriptor.Builder;
import java.util.List;
import java.util.Scanner;

import models.buildings.Building;
import models.buildings.Village;
import models.characters.Soldier;
import models.characters.Unit;
import models.characters.Villager;
import models.tasks.Task;

public class Main {


    private static void feedingVillagers(Village village) {
        int food = village.getFood();
        List<Unit> units = village.getUnits();

        if (units.isEmpty()) {
            System.out.println("Tous vos habitants sont morts.");
            return;
        }

        /* On parcourt notre liste d'unité pour les nourrir */
        int i = 0;
        while (i < units.size() && food > 0) {
            food--;
            i++;
        }

        /*
        * Si la nourriture est insuffisante on supprime les unités restantes
        */
        if (i < units.size()) {
            int deficit = units.size() - i;
            System.out.println("FAMINE !! " + deficit + " habitants sont morts.");

            for (int j = 0; j < deficit; j ++) {
                units.remove(units.size() - 1); /* On supprime depuis la fin */
            }
        }

        /* On met à jour la nourriture restante */
        village.setFood(food);
        System.out.println("Vous avez nourrit vos habitants, il reste " + food + " de nourriture.");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Village player1 = new Village();
        Villager villager = new Villager();

        int day = 1;
        player1.addUnit(villager);
        boolean quitMenu = false;
        

        do {
            System.out.println("\n=======================");
            System.out.println("\n==== JEMPIRE V2.0 ====");
            System.out.println("\n=======================");
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

            day++;
            System.out.println("Jour : " + day);
            feedingVillagers(player1);

        } while (!quitMenu);
        System.out.println("Merci d'avoir joué, à une prochaine fois !");
        scanner.close();
    }
}
