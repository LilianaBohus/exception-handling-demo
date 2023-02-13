import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Próbáljunk meg beolvasni egy nem létező fájlból!
        File file = new File("nem_letezo_fajl.txt");
        Scanner scanner = new Scanner(file);

        /*
         Ez a kód még hibás: nincs lekezelve az előfordulható checked exception.
         (Soha ne pusholj nem forduló kódot!)
         */
    }
}