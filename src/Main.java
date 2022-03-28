import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        Register equipReg = new EquipmentRegister();

        try {
            Program p = new Program(equipReg);
            p.menuInput();
        }
        catch (FileNotFoundException e) {
            System.out.println("Alert: Cannot find file. See stack trace below.");
            e.printStackTrace();
        }
        catch (IOException io) {
            System.out.println("Alert: Input problem. See stack trace below.");
            io.printStackTrace();
        }
    }
}
