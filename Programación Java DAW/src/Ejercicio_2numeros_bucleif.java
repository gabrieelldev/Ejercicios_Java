
import java.util.Scanner;

public class Ejercicio_2numeros_bucleif {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        System.out.print("Dame un numero: ");
        int num1 = t.nextInt();

        System.out.print("Dame otro numero: ");
        int num2 = t.nextInt();

        int mayor, menor;
        int suma = 0;
        int par = 0;
        if (num1 > num2) {
            mayor = num1;
            menor = num2;
        } else {
            mayor = num2;
            menor = num1;

        }
        
        for (int i = menor; i <= mayor; i++) {
            suma+=i;
            
            if (i==mayor){
                System.out.println("Suma: "+suma);
            }    
            if (i%2==0){
                par++;
            }
        }
        System.out.println("Cantidad de pares: "+par);
    }
}
