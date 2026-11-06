
import java.util.Scanner;

public class Ejercicio_notas_bucle {

    public static void main(String[] args) {
        Scanner t = new Scanner (System.in);
        
        System.out.print("Dame un numero: ");
        double num = t.nextDouble();
        double total=0;
        double division=0;
        while (num>=0 && (num<=10 && num>=0)){
            total=total+num;
            System.out.print("Dame otro numero: ");
            num = t.nextInt();
            division++;
            for (int i=0; i<num; i++);
            System.out.print("Tu media es: "+(total/division));
            
        }
        
    }
    
}
