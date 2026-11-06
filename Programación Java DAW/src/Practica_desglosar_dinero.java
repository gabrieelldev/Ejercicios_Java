
import java.util.Scanner;

public class Practica_desglosar_dinero {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce cantidad a desglosar: ");
        int cantidad = teclado.nextInt();

        if (cantidad < 0) {
            System.out.println("La cantidad no puede ser negativa.");
        } else {
            int resto = cantidad;

            int billetes500 = resto / 500;
            resto %= 500;

            int billetes200 = resto / 200;
            resto %= 200;

            int billetes50 = resto / 50;
            resto %= 50;

            int billetes20 = resto / 20;
            resto %= 20;

            int billetes10 = resto / 10;
            resto %= 10;

            int billetes5 = resto / 5;
            resto %= 5;

            int monedas2 = resto / 2;
            resto %= 2;

            int monedas1 = resto;

            System.out.println("El desglose obtenido es...");

            if (billetes500 > 0) {
                System.out.println(billetes500 + " billete(s) de 500");
            }

            if (billetes200 > 0) {
                System.out.println(billetes200 + " billete(s) de 200");
            }

            if (billetes50 > 0) {
                System.out.println(billetes50 + " billete(s) de 50");
            }

            if (billetes20 > 0) {
                System.out.println(billetes20 + " billete(s) de 20");
            }

            if (billetes10 > 0) {
                System.out.println(billetes10 + " billete(s) de 10");
            }

            if (billetes5 > 0) {
                System.out.println(billetes5 + " billete(s) de 5");
            }

            if (monedas2 > 0) {
                System.out.println(monedas2 + " moneda(s) de 2");
            }

            if (monedas1 > 0) {
                System.out.println(monedas1 + " moneda(s) de 1");
            }
        }

    }
}
