import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Kérjünk be a felhasználótól két számot és osszuk el őket!
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add meg az osztandó számot!");
        int osztando = Integer.parseInt(scanner.nextLine());
        System.out.println("Add meg az osztót!");
        int oszto = Integer.parseInt(scanner.nextLine());

        // Próbáljunk nullával osztani!
        double tortHanyados = (double) osztando / oszto;
        System.out.println("A két szám tört hányadosa: " + tortHanyados);
        int egeszHanyados = osztando / oszto;
        System.out.println("A két szám egész hányadosa: " + egeszHanyados);
    }
}