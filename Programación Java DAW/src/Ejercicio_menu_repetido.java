
import java.util.Scanner;

public class Ejercicio_menu_repetido {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        System.out.println("1. Saludar");
        System.out.println("2. Mostrar un mensaje");
        System.out.println("3. Salir");
        System.out.print("Introduce una opcion: ");
        int num = t.nextInt();

        while (num != 3) {
            switch (num) {
                case 1:
                    System.out.println("Hola, usuario");
                    System.out.print("Introduce una opcion: ");
                    num = t.nextInt();
                    break;
                case 2:
                    System.out.println("Bienvenido al programa!");
                    System.out.print("Introduce una opcion: ");
                    num = t.nextInt();
                    break;
                default:
                    System.out.println("El numero no es correcto");
                    System.out.print("Introduce una opcion entre 1 y 3: ");
                    num = t.nextInt();
                    break;
            }
        }

    }

}
