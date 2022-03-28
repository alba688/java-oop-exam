import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;

public class Program {
// OPPGAVE 3 - CREATE CLASS THAT OFFERS 3 METHODS
// OPPGAVE 4 - CREATE PROGRAM TO RUN METHODS AS INTENDED

    private final Register equipmentReg;
    Set<Equipment> equipment;

    public Program(Register equipmentReg) throws FileNotFoundException {
        this.equipmentReg = equipmentReg;
        equipment = equipmentReg.readEquipFromFile();
    }

    public void menuInput () throws IOException {
        Scanner input = new Scanner(System.in);
        int choice =0;
        while (choice !=5) {
            programMenu();
            choice = validateMenuInput(input);
            switch (choice) {
                case 1 -> printAllEquip();
                case 2 -> printBallsNeedingMoreAir();
                case 3 -> printEquipmentNeedingToBeReplaced();
                case 4 -> printTableTennisRacketsNeedingNewPads();
                case 5 -> System.out.println("Goodbye!");
                default -> System.out.println("Not a valid choice.");
            }
        }
    }

    private void programMenu() {
        System.out.println("Welcome to Equipment Registry. Choose from menu:");
        System.out.println("1 = Show all equipment in registry");
        System.out.println("2 = Show balls that need air");
        System.out.println("3 = Show equipment that needs to be replaced");
        System.out.println("4 = Show table tennis rackets that need new pads");
        System.out.println("5 = End program");
    }

    private int validateMenuInput (Scanner scanner) {
        int choice = -1;
        while (choice <0 || choice > 5) {
            try {
                String s = scanner.nextLine();
                choice = Integer.parseInt(s);
            } catch (Exception e) {
                System.out.println("Enter a valid number");
            }
            if (choice <0 || choice>5) {
                System.out.println("Must enter a number 1-5");
            }
        }
        return choice;
    }

    private void printAllEquip() {
        System.out.println("* * * Printing all equipment in register * * *");
        for (Equipment e:
             equipment) {
            System.out.println(e.toString());
        }
    }

    private void printBallsNeedingMoreAir() {
        System.out.println("* * * Balls that need to be pumped with air * * *");
        for (Equipment e:
             equipment) {
            if (e instanceof Ball) {
                if (((Ball) e).isNeedsAir()) {
                    System.out.println(e.toString());
                }
            }
        }
    }

    private void printEquipmentNeedingToBeReplaced() {
        System.out.println("* * * Equipment that needs replacement * * *");
        for (Equipment e:
                equipment) {
            if (e.toReplace()) {
                System.out.println(e.toString());
            }
        }
    }

    private void printTableTennisRacketsNeedingNewPads() {
        System.out.println("* * * Tennis Rackets that need new pads * * *");
        for (Equipment e:
                equipment) {
            if (e instanceof TableTennisRacket) {
                if(((TableTennisRacket) e).isNewPad()) {
                    System.out.println(e.toString());
                }
            }

        }
    }

}
