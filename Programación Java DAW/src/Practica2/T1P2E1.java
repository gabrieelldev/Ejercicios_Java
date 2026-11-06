package Practica2;

import java.util.Scanner;

public class T1P2E1 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
//        Pido numero
        System.out.print("Introduzca un numero entre 17 y 25 (ambos incluidos): ");
        int num = t.nextInt();
//Si el numero es mayor de 25 o menor de 17, la condicion se cumple, por lo que le numero seria erroneo
        while (num > 25 || num < 17) {
            System.out.print("El numero es incorrecto, dame otro numero: ");
            num = t.nextInt();
        }

        int numale = 55;
//        Creo una variable random que empieza en 5 y termina en 55
        int ale = (int) (Math.random() * (numale) + 5);
        System.out.println("El numero que ha escogido la maquina es: " + ale);
//        El programa te dice si has ganado porque tu numero es mayor que el de la maquina, si has perdido porque tu numero es menor que el de la maquina o si has empatado
        if (num > ale) {
            System.out.println("Tu numero (" + num + ") es mayor que el de la maquina (" + ale + ")");
            System.out.println("Has ganado!!");
        } else if (num == ale) {
            System.out.println("Tu numero (" + num + ") es igual que el de la maquina (" + ale + ")");
            System.out.println("Has empatado!!");
        } else {
            System.out.println("Tu numero (" + num + ") es menor que el de la maquina (" + ale + ")");
            System.out.println("Has perdido!!");
        }
    }

}
