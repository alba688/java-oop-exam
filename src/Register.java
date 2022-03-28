import java.io.FileNotFoundException;
import java.util.Set;

public interface Register {
    Set<Equipment> readEquipFromFile() throws FileNotFoundException;
}
