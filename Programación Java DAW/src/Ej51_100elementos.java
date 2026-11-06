
import java.net.UnixDomainSocketAddress;

public class Ej51_100elementos {

    public static void main(String[] args) {
        int lista[] = new int[100];

        for (int i = 0; i < lista.length; i++) {
            lista[i] = (int) (Math.random() * 100 + 1);
        }
        System.out.print("");
        String res = "";
        for (int i = 0; i < lista.length; i++) {
            res += lista[i];
            if (i < lista.length - 1) {
                res += ",";
            }
            System.out.print(res);
            System.out.print("");
            
            
        }
        for (int i = 0; i < 10; i++) {
            if(lista[i]%5==0){
                System.out.print(lista[i]+ " ");
            }
        }
        System.out.println("\nApartado B");
        for (int i = 0; i < lista.length; i++) {
            if(lista[i]%2==0){
                System.out.print(lista[i]+" ");
            }
        }
        System.out.println("\nApartado C");
        int mayor = lista[0];
        int menor = lista[0];
        int posmay = 0;
        int posmen = 0;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i]>mayor){
                mayor=lista[i];
                posmay=i;
            }
            if (lista[i]<menor){
                menor=lista[i];
                posmen=i;
                
            }
        }
        System.out.println("El mayor es: "+mayor+", y esta en la posicion "+posmay);
        System.out.println("El menor es: "+menor+", y esta en la posicion "+posmen);
    }

}
