import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Próbáljunk meg beolvasni egy nem létező fájlból!
        File file = new File("nem_letezo_fajl.txt");
        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Nem található ilyen fájl!");
        }

    }
}