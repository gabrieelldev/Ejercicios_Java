package PracticaArrays;

import java.util.Scanner;

public class T1P4E2 {

    public static void main(String[] args) {
        int lista[] = new int[20];
        int contador20 = 0;
        double media = 0;
        
        System.out.println("Mostrando arrays de temperaturas:");
        for (int i = 0; i < lista.length; i++) {
            int ale = (int) (Math.random() * (50 - (-10) + 1)) - 10;
            lista[i] = ale;
            media += ale;

            if (ale < 20) {
                contador20++;
            }
        }
        for (int i = 0; i < 20; i++) {
            System.out.print(lista[i]);
            if (i < lista.length - 1) {
                System.out.print(", ");
            }
        }
        int mayor = lista[0];
        int menor = lista[0];
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] > mayor) {
                mayor = lista[i];
            }
            if (lista[i] < menor) {
                menor = lista[i];

            }
        }
        System.out.println("\n\nTemperatura maxima: " + mayor);
        System.out.println("Temperatura minima: " + menor);
        System.out.println("Dias por debajo de 20 grados: " + contador20);
        System.out.println("Temperatura media: " + (media / lista.length));
    }
}
