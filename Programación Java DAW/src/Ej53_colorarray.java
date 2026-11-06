import java.util.Scanner;

public class Ej53_colorarray {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        
        String colores[] = new String[10];
        int contadorrojo = 0;
        int contadorazul = 0;

        for (int i = 0; i < colores.length; i++) {
            System.out.print("Dame el color " + (i + 1) + ": ");
            colores[i] = t.nextLine().toLowerCase();
            
            switch (colores[i]) {
                case "rojo":
                    contadorrojo++;
                    break;
                case "azul":
                    contadorazul++;
                    break;
            }
        }
        
        System.out.println("El color rojo sale " + contadorrojo + " veces");
        System.out.println("El color azul sale " + contadorazul + " veces");
    }
}
