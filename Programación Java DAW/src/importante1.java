import java.util.Scanner;
//Ejercicio 1: Calificaciones de una asignatura
//Escribe un programa en Java que vaya pidiendo por teclado la nota de los alumnos de un examen (valores double). La entrada de datos terminará cuando se introduzca una nota negativa (menor que 0).
//
//Al finalizar, el programa debe mostrar:
//- El número total de alumnos evaluados.
//- La nota media de la clase.
//- La nota más alta obtenida.


public class importante1 {

    
    public static void main(String[] args) {
     Scanner teclado = new Scanner(System.in);

        double nota;
        double suma = 0;
        double mayor = 0;
        int alumnos = 0;

        System.out.println("Introduce una nota negativa para terminar.");

        System.out.print("Introduce una nota: ");
        nota = teclado.nextDouble();

        while (nota >= 0) {
            suma = suma + nota;
            alumnos++;

            if (alumnos == 1 || nota > mayor) {
                mayor = nota;
            }

            System.out.print("Introduce otra nota: ");
            nota = teclado.nextDouble();
        }

        System.out.println("Alumnos evaluados: " + alumnos);

        if (alumnos > 0) {
            System.out.println("Nota media: " + (suma / alumnos));
            System.out.println("Nota más alta: " + mayor);
        } else {
            System.out.println("No se han introducido notas.");
        }    }

}
