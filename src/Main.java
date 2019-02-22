// Klassenimport
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Erstellung von Objekten
        Durchschnitt derDurchschnitt = new Durchschnitt();
        Scanner derScanner = new Scanner(System.in);

        // Zugriff auf unsere Methode aus der Klasse Durchschnitt

        derDurchschnitt.berechneDurchschnitt();
        derDurchschnitt.druckeDurchschnitt();
    }
}
