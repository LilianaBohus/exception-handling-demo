import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        readFromFile("nem_letezo_fajl.txt");

        /*
        Itt még hibás a kód, megint le kell kezelnünk a kivételeket.
        (Soha ne pusholjunk nem forduló kódot!)
         */
    }

    private static void readFromFile(String path) throws FileNotFoundException {
        File file = new File(path);
        Scanner scanner = new Scanner(file);
    }
}