package ordenación_inserción;

public class Ordenación_inserción {

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
        int n = 0;
        for (int i = 1; i < a.length; i++){
            int j = i;
            int aux = a[i]; 
            while (j > 0 && aux < a[j-1]){
                a[j] = a[j-1];
                j--;
            }
            a[j] = aux;
        }
    }

    private static void imprimirArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "  ");

        }
    } 
}
    
