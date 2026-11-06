
import java.util.Scanner;

public class Ej46_10nombres {

    public static void main(String[] args) {
        Scanner t = new Scanner (System.in);
        
        String lista[]= new String[10];

        for (int i = 0; i < lista.length; i++) {
            System.out.print("Dame el nombre "+(i+1)+": ");
            lista[i] = t.nextLine();
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(lista[i]);
            if (i < lista.length - 1){
                System.out.print(", ");
            }
        }
    }
    
}
