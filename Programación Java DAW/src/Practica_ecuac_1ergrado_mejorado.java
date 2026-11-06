
import java.util.Scanner;

public class Practica_ecuac_1ergrado_mejorado {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime un primer valor para la ecuacion ax+b=0: ");
        int num1 = teclado.nextInt();

        System.out.print("Dime un segundo valor para la ecuacion ax+b=0: ");
        int num2 = teclado.nextInt();

        if ((num2 % num1) != 0) {
            System.out.print("No se puede hacer esta division para que sea exacta");
        } 
        else {
            System.out.println("La solucion es: " + (-(num2) / num1));
        }

       
    }

}
