
import java.util.Scanner;

public class Ej59_matrices {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        System.out.print("Dame un valor entre 3 y 4: ");
        int valor = t.nextInt();
        int num = 0;
        String res="";
        int matriz[][] = new int[valor][valor];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                
                System.out.print("Dame el valor "+i+" "+j+": ");
                matriz[i][j] = t.nextInt();
                
                res = res+matriz[i][j]+" ";
            }
            res=res+"\n";
        } 

        
        System.out.print(res);
    }

}
