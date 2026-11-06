 
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Practica_POOC {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        System.out.print("Dame un numero de 4 cifras: ");
        int numpooc = t.nextInt();
        
        int provincia = numpooc / 1000;
            int operacion = (numpooc / 10) % 100;
            int control = numpooc % 10;

        if (numpooc < 1000 || numpooc > 10000) {
            System.out.println("El numero no cumple las condiciones para ser un numero POOC.");

         
        }
        else if (provincia<=1 || provincia>=8){
            System.out.println("El numero de provincia tiene que estar entre 1 y 8.");
        }
        else if ((operacion%provincia)!= control){
            System.out.println("El digito de control no corresponde para ser un numero POOC.");
        }
        else{
            System.out.println("Tu numero POOC desglosado es: "+provincia+", que es el numero de una de las 8 provincias, "+operacion+", que es el tipo de operacion, y por ultimo, "+control+", que es el numero de control.");
        }
    }
}
