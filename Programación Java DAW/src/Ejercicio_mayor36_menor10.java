
import java.util.Scanner;

public class Ejercicio_mayor36_menor10 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.print("Dame un numero: ");
        int num= t.nextInt();
        int sumatotal=0;
        int m36=0;
        int m10=0;
        for (int i = 1; i < 5 ; i++) {
            System.out.print("Dame otro numero: ");
            num=t.nextInt();
            sumatotal+=num;
            if(num>36){
                m36=m36+num;
            } else if (num<10){
                m10=m10+num;
            } 
                
             
            
        }
        System.out.println("Tu suma total es: "+sumatotal);
        System.out.println("La suma de los mayores de 36 es: "+m36);
        System.out.println("La suma de los menores de 10 es: "+m10);
    }

}
