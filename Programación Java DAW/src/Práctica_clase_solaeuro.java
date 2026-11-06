
import java.util.Scanner;

public class Práctica_clase_solaeuro {


    public static void main(String[] args) {
         Scanner teclado = new Scanner (System.in);
         
         System.out.println("Dime cuantos soles peruanos tienes: ");
         double soles = teclado.nextDouble();
         
         double euro = 0.26;
         
         System.out.println("Tu cantidad de soles en euros es: "+(soles * euro));
    }

}
