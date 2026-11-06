
import java.util.Scanner;


public class Practica_ecuac_1ergrado {


    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        System.out.print("Dame un primer numero para la ecuacion ax+b=0 ");
        double num1= teclado.nextDouble();
        
        System.out.print("Dame un segundo numero para la ecuacion ax+b=0 ");
        double num2= teclado.nextDouble();
        
        System.out.println("El resultado de esta ecuacion es: "+(-(num2)/num1));
    }

}
