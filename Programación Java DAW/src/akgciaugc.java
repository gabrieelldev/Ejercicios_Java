import java.util.Scanner;

public class akgciaugc {
    public static void main(String[] args) {
        final String USUARIO_CORRECTO = "admin";
        final String PASSWORD_CORRECTA = "1234";
        final int MAX_INTENTOS = 3;

        Scanner sc = new Scanner(System.in);
        int intentos = 0;

        while (intentos < MAX_INTENTOS) {
            System.out.print("User: ");
            String user = sc.nextLine();
            System.out.print("Pass: ");
            String pass = sc.nextLine();

            if (user.equals(USUARIO_CORRECTO) && pass.equals(PASSWORD_CORRECTA)) {
                System.out.println("Bronze Forever");
                sc.close();
                return;
            }

            intentos++;
            if (intentos < MAX_INTENTOS) {
                System.out.println("Error: usuario o contraseña incorrectos. Te quedan "
                        + (MAX_INTENTOS - intentos) + " intentos.\n");
            }
        }

        System.out.println("Error: has agotado los 3 intentos. Ya no tienes mas pruebas.");
        sc.close();
    }
}
