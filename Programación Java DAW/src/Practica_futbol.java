
import java.util.Scanner;

public class Practica_futbol {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("En que segundo del partido estas?: ");
        double seg = teclado.nextDouble();

        double momento = seg / 60;
        momento = (Math.ceil(momento));

        System.out.println("Estamos en el minuto: "+momento);
    }

}
