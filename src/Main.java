import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            readFromFile("nem_letezo_fajl.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Hiba a fájl beolvasása során");;
        }
    }

    private static void readFromFile(String path) throws FileNotFoundException {
        File file = new File(path);
        Scanner scanner = new Scanner(file);
    }
}