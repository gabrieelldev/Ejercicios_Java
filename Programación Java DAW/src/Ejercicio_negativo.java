
import java.util.Scanner;

public class Ejercicio_negativo {

    public static void main(String[] args) {
        Scanner t = new Scanner (System.in);
           
        int num;
        String res="";
        
        do{
            System.out.print("Dame un numero positivo numero: ");
            num=t.nextInt();
            if (num>0){
                res=res+num+" ";
            }
            
        } while(num>0);
        System.out.println(res);
        System.out.print("Se acabo...");
    }
    
}
