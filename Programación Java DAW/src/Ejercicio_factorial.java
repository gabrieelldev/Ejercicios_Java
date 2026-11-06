
import java.util.Scanner;

public class Ejercicio_factorial {

    public static void main(String[] args) {
        Scanner t = new Scanner (System.in);
        
        System.out.print("Dame un numero para hacerle el factorial: ");
        int num = t.nextInt();
        int fact=1;
        for(int i=1; i<=num; i++){
            fact=fact*i;
        }
        System.out.println("Tu numero factorial es: "+fact);
    }
    
}
