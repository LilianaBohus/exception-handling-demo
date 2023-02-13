import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        // Próbáljunk meg beolvasni egy nem létező fájlból!
        File file = new File("nem_letezo_fajl.txt");
        Scanner scanner = new Scanner(file);

    }
}