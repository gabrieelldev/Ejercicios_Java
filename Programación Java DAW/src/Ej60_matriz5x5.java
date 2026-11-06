
public class Ej60_matriz5x5 {

    public static void main(String[] args) {

int[][] matriz = new int[5][5];
        int numero = 1;
        int suma = 0;
        String res = ""; 

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = numero;
                suma = suma + numero; 
                
                res = res + matriz[i][j] + " ";
                
                numero++; 
            }

            res = res + "\n"; 
        }


        System.out.print(res);
        

        System.out.print("\nLa suma de todos los elementos de la matriz es: " + suma + "\n");
    }
}
