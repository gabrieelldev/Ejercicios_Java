
import java.util.Scanner;

public class Ejemplo_while {


    public static void main(String[] args) {
        Scanner t= new Scanner (System.in);
        
        System.out.print("Dame un numero: "); 
        int num=t.nextInt();
        
        while (num>=0){
            System.out.print("Dame otro numero: ");
            num=t.nextInt();
        }
        System.out.println("Has introducido un numero negativo");
    }

}
