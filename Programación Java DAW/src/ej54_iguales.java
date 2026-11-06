
import java.util.Scanner;

public class ej54_iguales {

    public static void main(String[] args) {
        Scanner t = new Scanner (System.in);
        
        int array1 [] = {0,4,8,5,4,8,3,1,6,8,9,3};
        int array2 [] = new int [12];
        int num = 0;
        System.out.println("Array 1:");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i]+" ");
        }
        
        boolean sonIguales=true;
        if (array1==array2){
            sonIguales=true;
        } else{
            sonIguales=false;
        }
        System.out.println("\nDame valores para el segundo array:");
        for (int i = 0; i < array2.length; i++) {
            System.out.print("Dame el valor "+(i+1)+": ");
            array2[i] = t.nextInt();
        }
        System.out.println("Array 1:");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i]+" ");
        }
        System.out.println("\nArray 2: ");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i]+" ");
        }
        if (sonIguales=true){
            System.out.println("\nLos arrays son iguales");
        } else{
            System.out.println("\nSon diferentes");
        }
        
    }
    
}
