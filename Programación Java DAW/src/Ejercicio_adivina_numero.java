
import java.util.Scanner;

public class Ejercicio_adivina_numero {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        int pensamiento = (int) (Math.random() * 100 + 1);

        System.out.print("Adivina el numero entre 1 y 100: ");
        int jugada = t.nextInt();

        while (jugada != pensamiento) {
            if (jugada > pensamiento) {
                System.out.println("Te has pasado!!");
            } else {
                System.out.println("Te has quedado corto!!");
            }
            System.out.print("Intentalo otra vez: ");
            jugada = t.nextInt();
        }

        System.out.println("Lo lograste!!");
    }

}
