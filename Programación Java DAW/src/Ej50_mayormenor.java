public class Ej50_mayormenor {

    public static void main(String[] args) {
        int[] lista = new int[100];
        
        int mayor = lista[0]; 
        int menor = lista[0]; 

        for (int i = 0; i < lista.length; i++) {
            lista[i] = (int) (Math.random() * 100 + 1);
            
            if (i==0){
                mayor=lista[0];
                menor=lista[0];
            }

            if (lista[i] > mayor) { 
                mayor = lista[i];
            }
            if (lista[i] < menor) {
                menor = lista[i];
            }
        }
        
        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);
    }
}
