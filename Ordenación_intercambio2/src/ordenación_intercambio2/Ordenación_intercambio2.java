package ordenación_intercambio2;


public class Ordenación_intercambio2 {

    public static void main(String[] args) {
        int a[];
        a = new int[100];

        System.out.println("Array desordenado:");
        llenarArray(a);
        imprimirArray(a);
        ordenarArray(a);

        System.out.println("  ");
        System.out.println("Array ordenado:");
        imprimirArray(a);
    }

    private static void imprimirArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "  ");

        }
    }

    private static void llenarArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 1000);
        }
    }

    private static void ordenarArray(int[] a) {
        // Controlar el numero de pasadas a realizar
        for (int pasadaActual = 0; pasadaActual <= a.length - 2; pasadaActual++) {
            
            // Hacer una pasada
            for (int elementActual = pasadaActual + 1; elementActual <= a.length - 1; elementActual++) {
                
                if (a[pasadaActual] > a[elementActual]) {
                    // Realizar un intercambio
                    int aux = a[pasadaActual];
                    a[pasadaActual] = a[elementActual];
                    a[elementActual] = aux;
                }
            }
        }
    }
}