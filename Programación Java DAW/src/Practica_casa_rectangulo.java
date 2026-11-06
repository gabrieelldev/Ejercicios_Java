
import java.util.Scanner;

/*Escribe un programa que le pida al usuario el largo y el ancho de un rectángulo (en
metros). Calcule su área y su perímetro. Muestre ambos resultados con dos decimales*/
public class Practica_casa_rectangulo {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime el largo en metros de tu rectangulo: ");
        double largo = teclado.nextDouble();

        System.out.print("Dime el ancho en metros de tu rectangulo: ");
        double ancho = teclado.nextDouble();

        System.out.println("El area de este rectangulo es: " + (largo * ancho) + " metros cuadrados");
        System.out.println("El perimetro de este rectangulo es: " + ((largo * 2) + (ancho * 2)));

    }
}
