
import java.util.Scanner;

public class Practica_pares_impares {


    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        System.out.print("Dame un numero del 1 al 4: ");
        int num = teclado.nextInt();
        
        switch(num){
            case 1: 
            case 3: System.out.println("Tu numero es impar");
                    break;
            case 2: 
            case 4: System.out.println("Tu numero es par");
                    break;
            
            default: System.out.println("El numero tiene que ser entre 1 y 4");
                
        }
    }

}
