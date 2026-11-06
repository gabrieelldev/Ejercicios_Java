
import java.util.Scanner;

public class Practica_estaciones {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dame un numero del 1 al 12: ");
        int num = teclado.nextInt();

        if (num >= 1 && num <= 3) {
            System.out.println("Invierno");
        } else if (num >= 4 && num <= 6) {
            System.out.println("Primavera");
        } else if (num >= 7 && num <= 9) {
            System.out.println("Verano");
        } else if (num >= 10 && num <= 12) {
            System.out.println("Otono");
        } else {
            System.out.println("Numero incorrecto");
        }
    }

}
