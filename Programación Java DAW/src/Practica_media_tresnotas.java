import java.util.Scanner;


public class Practica_media_tresnotas {


    public static void main(String[] args) {
        Scanner teclado= new Scanner (System.in);
        
        System.out.print("Introduce la primera nota: ");
        double nota1= teclado.nextDouble();
        
         System.out.print("Introduce la segunda nota: ");
        double nota2= teclado.nextDouble();
        
         System.out.print("Introduce la tercera nota: ");
        double nota3= teclado.nextDouble();
        
        double media= ((nota1+nota2+nota3)/3);
        if (+media >6.5){
            System.out.println("Has promocionado con una media de:" +((nota1+nota2+nota3)/3));
        }
        else{
            System.out.println("No promocionas");
        }
    }

}
