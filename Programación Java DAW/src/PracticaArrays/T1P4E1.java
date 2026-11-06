package PracticaArrays;

import java.util.Scanner;

public class T1P4E1 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        int lista[] = new int[10];
        int pos = 0;
        boolean array = false;
        int tamano = 0;
        for (int i = 0; i < lista.length; i++) {
            int ale = (int) (Math.random() * (45 - 3 + 1)) + 3;
            lista[i] = ale;

        }
        System.out.println("Array de valores creado...");
        System.out.print("Introduzca un tamano entre 3 y 45: ");
        tamano = t.nextInt();

        while (tamano < 3 || tamano > 45) {
            System.out.println("ERROR. El numero introducido no esta dentro del rango indicado");
            System.out.print("Introduzca un tamano entre 3 y 45: ");
            tamano = t.nextInt();
        }
        for (int i = 0; i < lista.length; i++) {
            if (lista[i]==tamano){
                array=true;
                pos=i;
            }
        }
        

        if (array == true) {
            System.out.println("\nEl numero " + tamano + " ESTA EN EL ARRAY y su primera posicion es la " + (pos+1));
        } else if (array==false) {
            System.out.println("\nEl numero " + tamano + " NO ESTA EN EL ARRAY");
        }

        for (int i = 0; i < lista.length; i++) {
            System.out.print(+lista[i] + " ");
        }
    }
}
