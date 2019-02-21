package reductor_matrices;

import java.util.Scanner;
/**
 *
 * @author Ismael
 */
public class Reductor_matrices {
    
    static Scanner entrada = new Scanner(System.in);
    static int filas;
    static int columnas;
    static boolean divisible = false;
    
    public static void main(String[] args) {
        System.out.print("introduce filas: ");
        filas = entrada.nextInt();
        System.out.print("introduce columnas: ");
        columnas = entrada.nextInt();
        
        int matriz_base[][] = new int [filas][columnas];
        reducirMatriz(rellenarMatriz(matriz_base));
        
    }
    
    //llena la matriz con números aleatorios
    public static int[][] rellenarMatriz(int matriz[][]){
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = (int)(Math.random()*9);
            }
        }
        return matriz;
    }
    
    //comprueba que la matriz es divisible
    public static void esDivisible(){
        if(filas % 2 == 0 && columnas % 2 == 0){
            filas = filas / 2;
            columnas = columnas / 2;
            divisible = true;
        }else{
            divisible = false;
            System.out.println("No se puede reducir más");
        }       
    }
    
    //reduce la matriz
    public static void reducirMatriz(int matriz[][]){

        imprimirMatriz(rellenarMatriz(matriz));
        esDivisible();
        
        while(divisible == true){
            matriz = new int[filas][columnas];
            rellenarMatriz(matriz);
            imprimirMatriz(matriz);
            esDivisible();
        }
        
    }
    
    //imprime la matriz por pantalla
    public static void imprimirMatriz(int matriz[][]){
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }
        System.out.println();
    }
    
}
