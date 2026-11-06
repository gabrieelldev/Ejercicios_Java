
import java.util.Scanner;

public class Ejercicio_lista {

    public static void main(String[] args) {
        Scanner t = new Scanner (System.in);
        int primera = 0;
        int ultima = 0;
        int posicion = 0;

        System.out.print("Introduce un numero (0 para terminar): ");
        int numero = t.nextInt();

        while (numero != 0) {
            posicion++;
            if (numero == 12) {
                if (primera == 0) {
                    primera = posicion;
                }
                ultima = posicion;
            }
            System.out.print("Introduce un numero (0 para terminar): ");
            numero = t.nextInt();
        }

        if (primera == 0) {
            System.out.println("El 12 no aparece en la lista");
        } else {
            System.out.println("Primera aparicion: " + primera);
            System.out.println("Ultima aparicion: " + ultima);
        }
            
            
        }
        }
    
    

