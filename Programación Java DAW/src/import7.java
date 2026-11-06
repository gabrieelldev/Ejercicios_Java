
import java.util.Scanner;




public class import7 {

//    4- En una fábrica de coches se desea calcular el precio medio de un número de modelos de coche, 
//n, leído desde teclado. Se debe leer el precio de cada uno de esos n coches y calcular el precio 
//medio de los modelos. 
//Ejemplo del programa en pantalla: 
//Introduzca número de modelos de coche: 4 
//Precio modelo 1: 12000 
//Precio modelo 2: 22000 
//Precio modelo 3: 18000 
//Precio modelo 4: 28000 
//El valor medio de los 4 modelos de coche asciende a: 20000 €
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
    
          System.out.print("Introduzca número de modelos de coche: ");
        int n = teclado.nextInt();

        double suma = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Precio modelo " + i + ": ");
            double precio = teclado.nextDouble();

            suma = suma + precio;
        }

        double media = suma / n;

        System.out.println("El valor medio de los " + n
                + " modelos de coche asciende a: " + media + " €");
    
    
    
    
    }

}
