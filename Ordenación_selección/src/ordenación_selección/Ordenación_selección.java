package ordenación_selección;


public class Ordenación_selección {

    public static void main(String[] args) {
        int a[];
        a = new int[100];

        System.out.println("Array desordenado:");
        omplirArray(a);
        imprimirArray(a);

        System.out.println(" ");
        System.out.println("Array ordenado:");
        ordenarArray(a);
        imprimirArray(a);
    }

    private static void omplirArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 1000);
        }
    }

    private static void ordenarArray(int a[]) {
        for (int i = 0; i < a.length - 1; i++) {
            int indiceMenor = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[indiceMenor]) {
                    indiceMenor = j;
                }
            }
            if (i != indiceMenor) {
                int aux = a[i];
                a[i] = a[indiceMenor];
                a[indiceMenor] = aux;
            }
        }
    }

    private static void imprimirArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "  ");

        }
    }
}
