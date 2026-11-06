package Practica2;

import java.util.Scanner;

public class T1P2E2 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
//        Introduce la nota
        System.out.print("Cuantas notas vas a introducir?: ");
        int notas = t.nextInt();
//        Si el numero de notas es negativo, sale "error" por pantalla en bucle hasta que metas un valor positivo
        do{
            System.out.println("Error");
            System.out.print("Dame un valor de notas positivo: ");
            notas = t.nextInt();
        } while (notas<=0); 
//        Creo todas las variables necesarias
        int num = 0;
        int sus = 0;
        int max = 0;
        int min = 0;
        int sum = 0;
        int not = 0;
//        Creo un bucle en el que va de la nota 1 hasta la nota num, y termina cuando introduces la ultima nota
        for (int i = 1; i <= notas; i++) {
            System.out.print("Nota " + i + ": ");
            num = t.nextInt();
            sum = sum + num;
            while (num > 10 || num < 0) {
                System.out.print("Nota incorrecta, dame una nota entre 1 y 10: ");
                num = t.nextInt();

            }
//        Todas las condiciones para que pueda ser notable, suspenso, nota maxima o nota minima
            if (num >= 7) {
                not++;
            }
            if (num < 5) {
                sus++;
            }
            if (num > max) {
                max = num;
            }
            if (num < max) {
                min = num;

            }
        }

        System.out.println("Notables: " + not);
        System.out.println("Suspensos: " + sus);
        System.out.println("Nota maxima: " + max);
        System.out.println("Nota minima: " + min);
        System.out.println("Suma de notas: " + sum);
    }

}
