package busqueda_dicotomica;

import java.util.Scanner;
/**
 *
 * @author Ismael
 */
public class Busqueda_dicotomica {
    
    static Scanner datos = new Scanner(System.in);

    public static void main(String[] args) {
       
        int[] array = {1,4,7,8,9,14,23,47,56,60,61,63,65,66,68,69,70,73,76,77,79,80,82};
        
        System.out.print("Introduce el valor buscado: ");
        int valorBuscado = datos.nextInt();
        System.out.println("Posición: "+busquedaBinaria(array, valorBuscado));
    }
    
    public static int busquedaBinaria(int matriz[], int valorBuscado) {
        
        int centro;
        int min = 0;
        int max = matriz.length - 1;

        while (min <= max) {
            centro = (max + min) / 2;

            if (matriz[centro] == valorBuscado) {
                return centro;
            }else if (valorBuscado < matriz[centro]) {
                max = centro - 1;
            }else {
                min = centro + 1;
            }
        }
        return -1;
    }
    
}

