public class Ej47_mathrandom {

    public static void main(String[] args) {
        int[] lista = new int[10];
        int num = 20;
        
        System.out.println("Orden original:");
        for (int i = 0; i < lista.length; i++) {
            int ale = (int) (Math.random() * num + 1);
            lista[i] = ale; 
            System.out.print(lista[i] + " "); 
        }
        
        System.out.println("\n\nInversa:");

        for (int i = lista.length - 1; i >= 0; i--) {
            System.out.print(lista[i] + " "); 
        }
        System.out.println(); 
    }
}