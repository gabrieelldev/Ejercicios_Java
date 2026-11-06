
import java.util.Scanner;

public class Practica_bolera {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Bienvenido a la bolera Los Pibes!!");

        int precio = 8;

        System.out.print("Dime tu nombre: ");
        String nombre = teclado.nextLine();

        System.out.print("Dame tu edad: ");
        int edad = teclado.nextInt();

        if (edad >= 8 && edad <= 17) {
            System.out.println(nombre + ", tu precio es: " + (precio * 0.75) + " euros, ya que tienes un descuento del 25%");
        } else if (edad >= 18 && edad <= 55) {
            System.out.println(nombre + ", tu precio es: " + precio + " euros");
        } else if (edad >= 56 && edad <= 70) {
            System.out.println(nombre + ", tu precio es: " + (precio * 0.75) + " euros, ya que solo pagas el 75%");
        } else {
            System.out.println(nombre + ", tienes la entrada gratis!!");

        }
    }
}
