package transposicion_matrices;
import java.util.*;
/**
 *
 * @author Ismael
 */
public class Transposicion_matrices {
    
    static Scanner datos = new Scanner(System.in);
    static int filas;
    static int columnas;
    
    public static void main(String[] args) {
        
        System.out.print("introduce filas: ");
        filas = datos.nextInt();
        System.out.print("Introduce columnas: ");
        columnas = datos.nextInt();
        
        //inicializamos la matriz
        int matriz[][] = new int[filas][columnas];
        
        //la llenamos con valores aleatorios 
        llenarMatriz(matriz);
        System.out.println("");
        //se realiza su transposición
        transponer(matriz);
  
    }
    
    
    //Método que imprime la primera matriz 
    public static int[][] llenarMatriz(int matriz[][]){
        System.out.println("Matriz");
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = (int)(Math.random()*9+1);
                System.out.print("["+matriz[i][j]+"]");
            }
        System.out.println("");
        } 
        return matriz;
    }
    
    //método que recibe una matriz por parámetro y realiza una transposición
    public static int[][] transponer(int matriz[][]){
        int transpuesta[][] = new int[columnas][filas];
        System.out.println("Matriz transpuesta");
        for(int i = 0; i < transpuesta.length; i++){
            for(int j = 0; j < transpuesta[i].length; j++){
                System.out.print("["+matriz[j][i]+"]");
            }
            System.out.println("");
        }
        return transpuesta;
    }
}
