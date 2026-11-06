
import java.util.Scanner;

public class Practica_dados {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el nombre de jugador 1: ");
        String jug1 = teclado.nextLine();

        System.out.print("Introduce el nombre de jugador 2: ");
        String jug2 = teclado.nextLine();

        int aleat1 = (int) (Math.random() * 6) + 1;
        int aleat2 = (int) (Math.random() * 6) + 1;

        System.out.println("La tirada de " + jug1 + " es: " + aleat1);
        System.out.println("La tirada de " + jug2 + " es: " + aleat2);

        if (aleat1 > aleat2) {
            System.out.println("Ha ganado " + jug1);
        } else if (aleat1 < aleat2) {
            System.out.println("Ha ganado " + jug2);
        } else {
            System.out.println("Empate");
        }

    }

}
