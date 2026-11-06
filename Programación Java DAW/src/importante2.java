import java.util.Scanner;
//Ejercicio 2: Tienda de deportes
//Realiza un programa en Java que gestione el cobro de prendas en una tienda de deportes.
//
//El programa irá pidiendo sucesivamente la letra inicial de la categoría del producto ('C' para Calzado, 'R' para Ropa, 'A' para Accesorios) y su precio.
//
//El proceso de compra continuará mientras la inicial introducida no sea la letra 'F' (tanto en mayúscula como en minúscula), que indicará el fin de compra.
//
//Si se introduce una letra distinta de 'C', 'R', 'A' o 'F', el programa mostrará un mensaje de «Categoría no válida» y no sumará nada al importe.

//Cuando se introduzca la letra 'F' (o 'f'), el bucle finalizará y el programa mostrará el importe total de la compra y el número de prendas válidas que se han procesado.
public class importante2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String categoria;
        double precio;
        double total = 0;
        int prendas = 0;

        System.out.print("Categoria (C, R, A o F): ");
        categoria = teclado.next();

        while (!categoria.equals("F") && !categoria.equals("f")) {

            if (categoria.equals("C") || categoria.equals("c")
                    || categoria.equals("R") || categoria.equals("r")
                    || categoria.equals("A") || categoria.equals("a")) {

                System.out.print("Introduce el precio: ");
                precio = teclado.nextDouble();

                total = total + precio;
                prendas++;
            } else {
                System.out.println("Categoria no valida");
            }

            System.out.print("Categoria (C, R, A o F): ");
            categoria = teclado.next();
        }

        System.out.println("Importe total: " + total + " euros");
        System.out.println("Prendas validas: " + prendas);

        teclado.close();
    }

}
