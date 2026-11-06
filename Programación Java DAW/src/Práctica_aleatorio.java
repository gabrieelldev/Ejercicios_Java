
import java.util.Scanner;

public class Práctica_aleatorio {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dame un numero: ");
        int num1 = teclado.nextInt();

        System.out.println("Dame otro numero: ");
        int num2 = teclado.nextInt();

        int aleat = (int) (Math.random() * (num1 - num2 + 1) + num2);

        System.out.println("Tu numero aleatorio es: " + aleat);

    }

}
