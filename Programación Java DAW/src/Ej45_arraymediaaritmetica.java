
import java.util.Scanner;

public class Ej45_arraymediaaritmetica {

    public static void main(String[] args) {
        int notas[] = {6, 3, 9, 7, 5, 8, 10, 2, 4, 5};
        double suma = 0;
        for (int i = 0; i < notas.length; i++) {
            suma = suma + notas[i];

        }
        double media = suma / notas.length;
        System.out.println("La media aritmetica es: " + media);
    }

}
