package producto_matrices;

import java.util.Scanner;
/**
 *
 * @author Ismael
 */
public class Producto_matrices {
    
    static int filas1,filas2,columnas1,columnas2;
    static Scanner datos = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        //datos 1a matriz
        System.out.print("Filas 1º matriz: ");
        filas1 = datos.nextInt();
        System.out.print("Columnas 1º matriz: ");
        columnas1 = datos.nextInt();
        //datos segunda matriz
        System.out.print("Filas 2º matriz: ");
        filas2 = datos.nextInt();
        System.out.print("Columnas 2º matriz: ");
        columnas2 = datos.nextInt();
        
        int matriz1[][] = new int[filas1][columnas1];
        int matriz2[][] = new int[filas2][columnas2];

        if(columnas1 == filas2){
            rellenarMatriz(matriz1);
            rellenarMatriz(matriz2);
            imprimirResultado(multiplicarMatrices(matriz1, matriz2));        
        }else{
            throw new RuntimeException(
                "Las dimensiones no son correctas, para que las matrices sean mutliplicables" +
                "las columnas de la 1ª han de tener el mismo valor que las filas de la 2ª"
            );
        }

    }
    
    //método que rellena la matriz
    public static void rellenarMatriz(int matriz[][]){
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = (int)(Math.random()*9);
            }
        }
    }
    
    //método que multiplica dos matrices y devuelve el resultado
    public static int[][] multiplicarMatrices(int a[][], int b[][]){
        int resultado[][] = new int[a.length][b[0].length];
        //multiplicación de las matrices
        for(int i = 0; i < resultado.length; i++){
            for(int j = 0; j < resultado[i].length; j++){
                for(int z = 0; z < a[0].length; z++){
                    resultado[i][j] += a[i][z] * b[z][j];
                }
            }
        }
        return resultado;
    }
    
    //método que imprime la matriz
    public static void imprimirResultado(int resultado[][]){
        System.out.println("Resultado");
        for(int i = 0; i < resultado.length; i++){
            for(int j = 0; j < resultado[i].length; j++){
                System.out.print("["+resultado[i][j]+"]");
            }
            System.out.println();
        }       
    }
      
}
