
import java.util.Scanner;

public class Practica_calculadora_areas {


    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("1. Cuadrado");
        System.out.println("2. Rectangulo");
        System.out.println("3. Triangulo");
        System.out.println("4. Circulo");
        
        System.out.println("Dime el número de tu opcion: ");
        int num= teclado.nextInt();
        
        switch (num){
            case 1: System.out.print("Dime cuanto mide cada lado de tu cuadrado (en centimetros): ");
                    int lado= teclado.nextInt();
                    System.out.println("El area de tu cuadrado es: "+(lado*lado));
                    break;
            case 2: System.out.print("Dime la base del rectangulo (en centimetros): ");
                    int baser= teclado.nextInt();
                    System.out.println("Dime la altura de tu rectangulo (en centimetros): ");
                    int altura= teclado.nextInt();
                    System.out.println("El area de tu rectangulo es: "+(baser*altura));
                    break;
            case 3: System.out.print("Dame la base de tu triangulo (en centimetros): ");
                    double baset= teclado.nextDouble();
                    System.out.print("Dame la altura de tu triangulo (en centimetros)");
                    double alturat= teclado.nextDouble();
                    System.out.println("El area de tu triangulo es: "+((baset*alturat))/2);
                    break;
            case 4: System.out.println("Dime el radio de tu circulo (en centimetros): ");
                    double radio= teclado.nextDouble();
                    System.out.println("El area de tu circulo es: "+(Math.PI)*(Math.pow(radio, 2)));
                    break;
            default: System.out.println("Error");
                    
        }
    }

}
