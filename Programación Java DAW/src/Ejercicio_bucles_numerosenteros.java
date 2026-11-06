
import java.util.Scanner;

public class Ejercicio_bucles_numerosenteros {

    public static void main(String[] args) {

        Scanner t = new Scanner(System.in);

        System.out.print("Dame un numero entero: ");
        int num1 = t.nextInt();

        System.out.print("Dame otro numero entero: ");
        int num2 = t.nextInt();

        int inicio = Math.min(num1, num2);
        int fin = Math.max(num1, num2);

        while (num1 != num2) {
            if (num1 < num2) {
                System.out.print(num1 + " ");
                num1++;

            } else {
                System.out.print(num2 + " ");
                num2++;

            }
        }
        if (num1 == num2 && num1 < num2) {
            System.out.println(num2);
        } else {
            System.out.println(num1);
        }
        System.out.println("-----Solo los numeros pares-----");
        while (inicio <= fin) {
            if (inicio % 2 == 0) {
                System.out.print(inicio + " ");
            }
            inicio++;
        }
        System.out.println("");
    }

}
