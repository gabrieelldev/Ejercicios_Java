
public class Ej48_flags {

    public static void main(String[] args) {
        int[] flags = {0, 1, 0, -1, 0, -1, -1, -1, 0, 0, -1};
        int[] tivic = new int[flags.length];

        for (int i = 0; i < flags.length; i++) {
            tivic[i] = flags[i];
        }
        System.out.println("Orden flags: ");
        for (int i = 0; i < flags.length; i++) {
            System.out.print(flags[i] + " ");
        }
        System.out.println("\nOrden tivic: ");
        for (int i = 0; i < tivic.length; i++) {
            if (tivic[i] < 0) {
                System.out.print(" 8 ");
            } else {
                System.out.print(tivic[i] + " ");
            }

        }
    }

}
