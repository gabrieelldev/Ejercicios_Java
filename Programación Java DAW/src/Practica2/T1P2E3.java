package Practica2;

import java.util.Scanner;

public class T1P2E3 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
//        Creo las variables necesarias
        int saldo = 1075;
        int cant = 0;
        int ning = 0;
        int nret = 0;
//        Hago el menu, y doy a elegir opcion
        System.out.println("1. Ingresar dinero");
        System.out.println("2. Retirar dinero");
        System.out.println("3. Consultar saldo");
        System.out.println("4. Salir");

        System.out.print("Opcion?: ");
        int op = t.nextInt();
//        De mientras que el numero no sea el 4 (es el boton de salida), entra dentro del swicth
        while (op != 4) {
//        En el switch pido primero la cantidad, despues me aseguro que sea mayor que 0, y que se sume o se reste al saldo si este numero es unicamente
//        mayor que 0, el 3 consulta el saldo, y cuando se introduce cualquier otro numero que no sea del 1 al 4, sale un error por pantalla en bucle
//        hasta que introduzcas un numero entre 1 y 4
            switch (op) {
                case 1:
                    System.out.print("Introduce cantidad a ingresar: ");
                    cant = t.nextInt();
                    while (cant < 0) {

                        System.out.print("Introduce una cantidad positiva (y mayor que 0): ");
                        cant = t.nextInt();

                    }
                    if (cant > 0) {
                        saldo = saldo + cant;
                        ning++;
                    }

                    System.out.print("Opcion?: ");
                    op = t.nextInt();
                    break;

                case 2:
                    System.out.print("Introduce una cantidad a retirar: ");
                    cant = t.nextInt();
                    while (cant < 0) {
                        System.out.print("Introduce una cantidad positiva (y mayor que 0): ");
                        cant = t.nextInt();
                    }

                    if (saldo > cant) {
                        System.out.println("Operacion completada");
                    } else {
                        System.out.println("No hay saldo suficiente");
                    }
                    if (cant < 0 || cant < saldo) {
                        saldo = saldo - cant;
                        nret++;
                    }
                    System.out.print("Opcion?: ");
                    op = t.nextInt();
                    break;

                case 3:
                    System.out.println("Saldo: " + saldo);
                    System.out.println("Opcion?: ");
                    op = t.nextInt();
                default:
                    System.out.println("Error");
                    System.out.print("Elige una opcion entre 1 y 4: ");
                    op = t.nextInt();
            }
        }
//        Lo que sale por pantalla
        System.out.println("Numero de ingresos: " + ning);
        System.out.println("Numero de retiradas: " + nret);
        System.out.println("Saldo final: " + saldo);
    }
}
