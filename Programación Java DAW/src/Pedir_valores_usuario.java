//1. Importar la herramienta que voy a usar
import java.util.Scanner;

public class Pedir_valores_usuario {
public static void main(String[] args) {
       
        //Pedir valores al usuario
        //2. Crear "la entrada"
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Dame tu nombre: ");
        String nombre = teclado.nextLine();
        
        //3. Mensaje al usuario (POR FAVOR!!!)
        System.out.println("Dame tu edad: ");
        int edad = teclado.nextInt(); // En esto pido números ENTEROS
        
        
        System.out.println("Tu nombre es: "+nombre);
        System.out.println("Tu edad es: "+edad);
        
    }

}
