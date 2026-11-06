
import java.util.Scanner;

public class Ejemplo_bucle_usuario_contraseña {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        String usercorr = "elmasPerron";
        String passcorr = "Kevin123";
        int intmax = 3;
        int intentos = 0;
        while (intentos < intmax) {
            System.out.print("Dame tu usuario: ");
            String user = t.nextLine();

            System.out.print("Dame tu pass: ");
            String pass = t.nextLine();

            if (intentos>intmax) {
                System.out.print("Bronze forever");
                
            
                
            }

            intentos++;
            if ((intentos < intmax)&&(!user.equals(usercorr) && !pass.equals(passcorr))) {
                System.out.println("Llevas " + intentos + " intento, te quedan " + (intmax - intentos) + " intentos\n");
            
            }

        }

    }

}
