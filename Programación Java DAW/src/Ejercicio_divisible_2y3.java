
import java.util.Scanner;

public class Ejercicio_divisible_2y3 {

    public static void main(String[] args) {
        Scanner t = new Scanner (System.in);
        
        System.out.print("Introduce un numero entero: ");
        int num = t.nextInt();
        
        while (!(num%2==0 || num%3==0)){
            System.out.println("Error");
            System.out.print("Introduce otro numero entero: ");
            num = t.nextInt();
        }
        System.out.println("El resultado de tu numero divido entre 2 es: "+(num/2));
        System.out.println("El resultado de tu numero divido entre 3 es: "+(num/3));
        
    }
    
}
