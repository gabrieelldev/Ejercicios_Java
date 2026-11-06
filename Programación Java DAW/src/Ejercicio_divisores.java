
import java.util.Scanner;

public class Ejercicio_divisores {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        int num = t.nextInt();

        int divisores = 1;
        System.out.print("Los divisores de " + num + " son: ");
        while (num != divisores) {
            if (num % divisores == 0) {
                System.out.print(+divisores + " ");
                divisores++;
            } else {
                divisores++;
            }
            

        }
        System.out.println(num);
    }

}
