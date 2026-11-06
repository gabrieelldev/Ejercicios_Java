
import java.util.Scanner;

public class Practica_media_numeros {


    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        System.out.print("Dame un numero: ");
        int num1= teclado.nextInt();
        
        System.out.print("Dame otro numero: ");
        int num2= teclado.nextInt();
        
        System.out.print("Dame otro numero: ");
        int num3= teclado.nextInt();
        
        System.out.print("Dame otro numero: ");
        int num4= teclado.nextInt();
        
        System.out.print("Dame otro numero: ");
        int num5= teclado.nextInt();
        
        double media= ((num1+num2+num3+num4+num5)/5);
        
        System.out.println("La media de todos estos numeros es: "+media);
    }

}
