
import java.nio.channels.ByteChannel;
import java.util.Scanner;

public class Ejercicio_notas {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int nota;
        int suma = 0;
        int contador = 0;

//        do {
//            System.out.print("Dame una nota valida: ");
//            nota = t.nextInt();
//            if (nota != -1){
//            suma += nota;
//            contador++;
//            }
//        } while (nota != -1);
//        
//        double media = suma/contador;
//        System.out.println("Suma: "+suma);
//        System.out.println("Contador: "+contador);
//        System.out.println("Media: "+media);
        System.out.print("Dame un numero de notas: ");
        int numnota = t.nextInt();

        for (int i = 1; i <= numnota; i++) {
            System.out.print("Dame la nota " + i + ": ");
            nota = t.nextInt();
            if (nota != -1) {
                suma += nota;
                contador++;
            }
            
        }
            double media = suma / numnota;
            System.out.println("Suma: "+suma);
            System.out.println("Contador: "+contador);
            System.out.println("Media: "+media);
    }
}
