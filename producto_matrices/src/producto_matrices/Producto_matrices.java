package producto_matrices;

import java.util.Scanner;
/**
 *
 * @author Ismael
 */
public class Producto_matrices {
    
    private static int matriz1[][];
    private static int matriz2[][];
    private static int filas1,filas2,columnas1,columnas2;
    private static int resultado[][];
    private static Scanner datos = new Scanner(System.in);
    
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
        
        //comprobamos que son multiplicables
        if(columnas1 == filas2){
            multiplica();
        }else{
            System.out.println(
                "Las dimensiones no son correctas, para que las matrices sean mutliplicables " +
                "las columnas de la 1ª han de tener el mismo valor que las filas de la 2ª");
        }
    }
    
    //método que actualiza las matrices
    public static void actualizarMatrices(int a[][], int b[][]){
        a = new int[filas1][columnas1];
        b = new int[filas2][columnas2];
        //rellenamos las matrices y las multiplicamos
        rellenarMatriz(a);
        rellenarMatriz(b);
        multiplicarMatrices(a,b);
    }
    
    //método que rellena la matriz
    public static void rellenarMatriz(int matriz[][]){
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = (int)(Math.random()*9);
            }
        }
        System.out.println("");
    }
    
    //método que multiplica dos matrices y guarda el resultado en una tercera
    public static void multiplicarMatrices(int a[][], int b[][]){
        resultado = new int[a.length][b[0].length];
        //multiplicación de las matrices
        for(int i = 0; i < resultado.length; i++){
            for(int j = 0; j < resultado[i].length; j++){
                for(int z = 0; z < a[0].length; z++){
                    resultado[i][j] += a[i][z] * b[z][j];
                }
            }
        } 
    }
    
    //lee la matriz y la imprime en pantalla
    public static void imprimirResultado(int resultado[][]){
        System.out.println("Resultado");
        for(int i = 0; i < resultado.length; i++){
            for(int j = 0; j < resultado[i].length; j++){
                System.out.print("["+resultado[i][j]+"]");
            }
            System.out.println();
        }
    }
    
    //actualiza las matrices, las multiplica e imprime el resultado
    public static void multiplica(){
        try{
            actualizarMatrices(matriz1,matriz2);
            imprimirResultado(resultado);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
