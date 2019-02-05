package transposicion_matrices;
import java.util.*;
/**
 *
 * @author Ismael
 */
public class Transposicion_matrices {
    
    public static Scanner datos = new Scanner(System.in);

    public static void main(String[] args) {
        
        System.out.print("introduce filas: ");
        int m = datos.nextInt();
        System.out.print("Introduce columnas: ");
        int n = datos.nextInt();
        
        int matriz[][] = new int[m][n];
        int transpuesta[][] = new int[n][m];
        
        System.out.println("Matriz MxN");
        generaMatriz(matriz);
        System.out.println();
        System.out.println("Matriz NxM");
        transponerMatriz(matriz,transpuesta);
    }
    
    //Método que imprime la primera matriz 
    public static void generaMatriz(int matriz[][]){
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                //los números de la matriz se generan aleatoriamente
                matriz[i][j] = (int)(Math.random()*9+1);
                System.out.print("["+matriz[i][j]+"]");
            }
        System.out.println("");
        }   
    }
    
    //Método que realiza la transposición de la matriz
    public static void transponerMatriz(int matriz[][],int transpuesta[][]){
        for(int i = 0; i < transpuesta.length; i++){
            for(int j = 0; j < transpuesta[i].length; j++){
                System.out.print("["+matriz[j][i]+"]");
            }
        System.out.println("");
        }   
    }
}


        //int matriz[][] = new int[4][2];
        /*
        matriz[0][0] = 2;
        matriz[0][1] = 4;

        matriz[1][0] = 6;
        matriz[1][1] = 6;

        matriz[2][0] = 8;
        matriz[2][1] = 5;
        
        matriz[3][0] = 2;
        matriz[3][1] = 1;*/