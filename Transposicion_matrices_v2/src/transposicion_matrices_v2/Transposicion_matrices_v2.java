package transposicion_matrices_v2;

/**
 *
 * @author Ismael
 */
public class Transposicion_matrices_v2 {
    
    public static void main(String[] args) {
        int matriz[][] = {{1,2,3},{4,5,6},{7,8,9},{9,6,4}};
        
        System.out.println("Matriz");
        imprimir(matriz);
        System.out.println("\nTranspuesta");
        imprimir(transponer(matriz));
    }
    
    public static int[][] transponer(int matriz[][]){
        int transpuesta[][] = new int[matriz[0].length][matriz.length];
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                transpuesta[j][i] = matriz[i][j];
            }
        }
        return transpuesta;
    }
    
    public static void imprimir(int matriz[][]){
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }
    }
}
