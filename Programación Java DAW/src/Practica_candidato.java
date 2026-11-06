
import java.util.Scanner;

public class Practica_candidato {


    public static void main(String[] args) {
        Scanner teclado= new Scanner (System.in);
        
        System.out.print("Dame un numero:");
        int num1=teclado.nextInt();
        
        System.out.print("Dame otro numero:");
        int num2=teclado.nextInt();
        
        System.out.print("Dame otro numero:");
        int num3=teclado.nextInt();
        
        System.out.print("Dame otro numero:");
        int num4=teclado.nextInt();
        
        System.out.print("Dame otro numero:");
        int num5=teclado.nextInt();
        
        if ((num1>num2)&&(num1>num3)&&(num1>num4)&&(num1>num5)){
            System.out.println("El mayor es: "+num1);
        }
        else if ((num2>num1)&&(num2>num3)&&(num2>num4)&&(num2>num5)){
            System.out.println("El mayor es: "+num2);
        }
        else if ((num3>num1)&&(num3>num2)&&(num3>num4)&&(num3>num5)){
            System.out.println("El mayor es: "+num3);
        }
        else if ((num4>num1)&&(num4>num2)&&(num4>num3)&&(num4>num5)){
            System.out.println("El mayor es: "+num4);
        }
        else if ((num5>num1)&&(num5>num3)&&(num5>num4)&&(num5>num1)){
            System.out.println("El mayor es: "+num5);
        }
    }

}
