
import java.util.Scanner;

public class Practica_clave {


    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        System.out.print("Dime la clave que quieres guardar: ");
        String clave1= teclado.nextLine();
        
        System.out.print("Repite la clave: ");
        String clave2= teclado.nextLine();
        
        if (clave1.equals(clave2)){
            System.out.println("Clave registrada correctamente");
        }
        else{
            System.out.println("Las claves no coinciden");
        }
               
    }

}
