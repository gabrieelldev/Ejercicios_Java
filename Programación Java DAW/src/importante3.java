import java.util.Scanner;
//Ejercicio 3: Piedra, papel o tijera
//Realiza un programa que simule una variante simplificada del juego Piedra, Papel o Tijera entre el jugador 1 y la máquina.
//1. El jugador 1 introduce una opción: 'p' para piedra o 't' para tijera.
//2. Si introduce una letra que no sea ninguna de estas dos, el programa muestra un mensaje de error y vuelve a solicitar la entrada hasta que sea válida. Hay que contemplar como válido que el usuario introduzca minúsculas o mayúsculas.
//3. A continuación, la máquina realiza su elección de forma aleatoria ('p' o 't').
//4. Reglas del resultado:
//   - Si las jugadas son iguales (ambos eligen piedra o ambos eligen tijera), el programa indica que el jugador 1 ha ganado.
////   - Si las jugadas son diferentes (uno elige piedra y el otro tijera), el programa indica que la máquina ha ganado.
//5. El juego finaliza tras una sola ronda.
public class importante3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String jugador;
        String maquina;

        System.out.print("Elige piedra (p) o tijera (t): ");
        jugador = teclado.next();

        while (!jugador.equals("p") && !jugador.equals("P")
                && !jugador.equals("t") && !jugador.equals("T")) {

            System.out.println("Opcion no valida.");
            System.out.print("Introduce p o t: ");
            jugador = teclado.next();
        }

        int aleatorio = (int) (Math.random() * 2);

        if (aleatorio == 0) {
            maquina = "p";
        } else {
            maquina = "t";
        }

        System.out.println("Jugador: " + jugador);
        System.out.println("Maquina: " + maquina);

        if (jugador.equals("p") || jugador.equals("P")) {
            if (maquina.equals("p")) {
                System.out.println("El jugador 1 ha ganado.");
            } else {
                System.out.println("La maquina ha ganado.");
            }
        } else {
            if (maquina.equals("t")) {
                System.out.println("El jugador 1 ha ganado.");
            } else {
                System.out.println("La maquina ha ganado.");
            }
        }

        teclado.close();
    }

}
