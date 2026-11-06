
import java.util.Scanner;

public class Practica_tiempo {


    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        System.out.print("Dame un tiempo expresado en segundos: ");
        int segTotal= teclado.nextInt();
        
        int horas= (segTotal/3600);
        int min= (segTotal % 3600 )/60;
        int seg= (segTotal % 60);
        
        
        System.out.println("Tus segundos convertidos son:" + horas + " horas, " + min + " minutos y " +seg +" segundos." );
      
        
    }

}
