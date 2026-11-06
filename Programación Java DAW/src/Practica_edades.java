
import java.util.Scanner;

public class Practica_edades {


    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        System.out.print("Dame una edad: ");
        int num1 = teclado.nextInt();
        
        System.out.print("Dame otra edad: ");
        int num2 = teclado.nextInt();
        
        if (num1>num2){
            System.out.println(+num1+" es mayor que "+num2);
            
            
        }
        
        else{
            System.out.println(+num2+" es mayor que "+num1);
        }
    }

}
