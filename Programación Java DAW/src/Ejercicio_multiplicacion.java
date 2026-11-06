
import java.util.Scanner;

public class Ejercicio_multiplicacion {

    public static void main(String[] args) {
        Scanner t = new Scanner (System.in);
        
        System.out.print("Dame un numero y te doy su tabla de multiplicar: ");
        int num = t.nextInt();
        
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(+num+"x"+i+"= "+(num*i));
            
        }
        
    }
    
}
