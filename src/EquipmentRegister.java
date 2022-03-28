import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class EquipmentRegister implements Register{
// OPPGAVE 1 - CREATE CLASS TO READ FROM FILE, CREATE AND PRINT OBJECTS

    private final String txt;

    public EquipmentRegister() {
        txt = "equipment.txt";
    }

    @Override
    public Set<Equipment> readEquipFromFile() throws FileNotFoundException {
        Set<Equipment> allEquip = new HashSet<>();
        File file = new File(txt);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String equipType = scanner.nextLine();
            switch (equipType) {
                case "Ball" -> {
                    Ball b = createBall(scanner);
                    allEquip.add(b);
                }
                case "TableTennisRacket" -> {
                    TableTennisRacket t = createRacket(scanner);
                    allEquip.add(t);
                }
                default -> System.out.println("Unknown equipment found");
            }
        }
        scanner.close();
        return allEquip;
    }

    private Ball createBall(Scanner scanner) {
        int idNr = readInt(scanner);
        String locker = scanner.nextLine();
        boolean replace = readBoolean(scanner);
        String ballType = scanner.nextLine();
        boolean needsAir = readBoolean(scanner);
        return new Ball(idNr, locker, replace, ballType, needsAir);
    }

    private TableTennisRacket createRacket(Scanner scanner) {
        int idNr = readInt(scanner);
        String locker = scanner.nextLine();
        boolean replace = readBoolean(scanner);
        boolean newPad = readBoolean(scanner);
        return new TableTennisRacket(idNr, locker, replace, newPad);
    }

    private int readInt (Scanner scanner) {
        int i = scanner.nextInt();
        scanner.nextLine(); // for CR
        return i;
    }

    private boolean readBoolean (Scanner scanner) {
        String s = scanner.nextLine();
        boolean b= Boolean.parseBoolean(s);
        return b;
    }

}
