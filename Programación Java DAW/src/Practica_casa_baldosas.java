
/*Se necesita un algoritmo que calcule el coste total de baldosas cuadradas necesarias
para cubrir el suelo de una habitación rectangular.
El programa solicitará como datos:
• las dimensiones de la habitación en metros (ancho y largo),
• el lado de cada baldosa expresado en centímetros
• y el precio por baldosa expresado en euros.
Con esos datos calculará el número de baldosas necesarias que hay que colocar en la
habitación (redondeando hacia arriba si el resultado no es un numero entero) y el precio
total a invertir.*/
import java.util.Scanner;

public class Practica_casa_baldosas {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Cuantos metros de ancho tiene tu habitacion?: ");
        double ancho = teclado.nextDouble();

        System.out.print("Cuantos metros de largo tiene tu habitacion?: ");
        double largo = teclado.nextDouble();

        System.out.print("Cuanto mide cada lado de tu baldosa? (en centimetros): ");
        double bald = teclado.nextDouble();

        System.out.print("Cuanto vale cada baldosa?: ");
        double valor = teclado.nextDouble();

        double numBald = (ancho * largo) / ((bald) / 100);
        numBald=Math.ceil (numBald);
        double precBald= ((ancho * largo) / ((bald) / 100)*valor);

        System.out.println("El numero de baldosas que necesitas son: " + numBald);
        System.out.println("Te va a costar: " + precBald + " euros");

    }

}
