
import java.util.Scanner;

public class Ejercicio_FIZZBUZZ {

    public static void main(String[] args) {
        Scanner t= new Scanner (System.in);
        
        System.out.print("Dame un numero mayor a 10: ");
        int num = t.nextInt();
        
        while (num<=10){
            System.out.println("Error!");
            System.out.print("Dame un numero mayor a 10: ");
            num=t.nextInt();
        }
        
        for (int i = 1; i <= num; i++) {
            if (i%3==0 && i%5!=0){
                System.out.println("FIZZ");
                
            } else if (i%5==0 && i%3!=0){
                System.out.println("BUZZ");
                
            } else if (i%3==0 && i%5==0){
                System.out.println("FIZZBUZZ");
                
            } else{
                System.out.println(+i);
            }
            
        }
    }
    
}
