import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Kérjünk be a felhasználótól két számot és osszuk el őket!
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add meg az osztandó számot!");
        int osztando = Integer.parseInt(scanner.nextLine());
        System.out.println("Add meg az osztót!");
        int oszto = Integer.parseInt(scanner.nextLine());

        // Kezeljük le az előfordul(hat)ó hibákat!
        try {
            int egeszHanyados = osztando / oszto;
            System.out.println("A két szám egész hányadosa: " + egeszHanyados);
        } catch (ArithmeticException e) {
            System.out.println("Hiba történt: " + e.getMessage());
        }

        /* Tanulság:
        Java-ban a RuntimeException-ök unchecked exceptionnek számítanak,
        tehát nem kötelez minket a compiler arra, hogy lekezeljük őket,
        ettől függetlenül mi megtehetjük.
         */
    }
}