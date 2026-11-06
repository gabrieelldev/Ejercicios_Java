
import java.util.Scanner;

public class Práctica_clase_sumrestmultdivmod {


    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Dame el primer numero: ");
        int num1 = teclado.nextInt();
        
        System.out.println("Dame el segundo numero: ");
        int num2 = teclado.nextInt();
       
        System.out.println("La suma de estos numeros es: "+(num1 + num2));
        System.out.println("La resta de estos numeros es: "+(num1 - num2));
        System.out.println("La multiplicacion de estos numeros es: "+(num1 * num2));
        System.out.println("La division de estos numeros es: "+(num1 / num2));
        System.out.println("El modulo de estos numeros es: "+(num1 % num2));
    }

}
