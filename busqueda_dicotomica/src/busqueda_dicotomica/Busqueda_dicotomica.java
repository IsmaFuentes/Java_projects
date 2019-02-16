package busqueda_dicotomica;

import java.util.Scanner;
/**
 *
 * @author Ismael
 */
public class Busqueda_dicotomica {

    public static int busquedaBinaria(int matrix[], int valorBuscado) {

        int n = matrix.length;

        int centro;
        int min = 0;
        int max = n - 1;

        while (min <= max) {

            centro = (max + min) / 2;

            if (matrix[centro] == valorBuscado) {
                return centro;
            }else if (valorBuscado < matrix[centro]) {
                max = centro - 1;
            } else {
                min = centro + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner tl = new Scanner(System.in);

        int[] vector = { 1, 4, 7, 8, 9, 14, 23, 47, 56, 60, 61, 63, 65, 66, 68, 69, 70, 73, 76, 77, 79, 80, 82 };

        int valorBuscado = tl.nextInt();

        System.out.println("Posición: "+busquedaBinaria(vector, valorBuscado));
    }
    
}

