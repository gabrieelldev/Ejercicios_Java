 
import java.util.Scanner;

public class Ejercicio1_array {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        System.out.print("Dame un numero entero: ");
        int num = t.nextInt();

        while (num <= 0) {
            System.out.println("El numero debe de ser mayor de 0 y no puede ser negativo");
            System.out.print("Dame otro numero: ");
            num = t.nextInt();
        }

        int[] lista = new int[num];
        int suma = 0;
        for (int i = 0; i < num; i++) {
            System.out.print("Dame el valor " + i + ": ");
            lista[i] = t.nextInt();
            suma = suma+(lista[i]);
        }
        
        System.out.println("Valores guardados:");
        for (int i = 0; i < num; i++) {
            if (i < num-1){
            System.out.print(lista[i]+", ");
            } else 
                System.out.println(lista[i]);
        }
        System.out.println("Media: "+(suma/num));

        
    }
}
