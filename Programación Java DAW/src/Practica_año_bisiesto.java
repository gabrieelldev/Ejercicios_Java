
import java.util.Scanner;

public class Practica_año_bisiesto {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        System.out.println("Dime un anio: ");
        int num1 = t.nextInt();

        if (num1 % 4 == 0 && num1 % 100 != 0 && num1 % 400 != 0) {
            System.out.println("Es un anio bisiesto");
        } else {
            System.out.println("No es un anio bisiesto");
            
        }
        if (num1 < 0) {
            System.out.println("Un anio no puede ser negativo.");
            return;
        }
        System.out.println("Dime el numero de un mes: ");
        int num2 = t.nextInt();
        switch (num2) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tu mes tiene 31 dias. ");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
            case 2:
                if ((num1 % 4 == 0 && num1 % 100 != 0) || num1 % 400 != 0) {
                    System.out.println("Este febrero tiene 29 dias");
                } else {
                    System.out.println("Este febrero tiene 28 dias");
                }
                break;
            default:
                System.out.println("El mes tiene que ser entre 1 y 12");
                break;
        }
    }

}
