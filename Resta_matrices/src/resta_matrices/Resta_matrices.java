package resta_matrices;

/**
 *
 * @author Ismael
 */
public class Resta_matrices {


    public static void main(String[] args) {
        
        int [][] matriz1 = {{1,2,3},{4,5,6}};
        int [][] matriz2 = {{6,5,4},{3,2,1}};

        imprimirResultado(restarMatrices(matriz1,matriz2));
    }

    //método que resta dos matrices y devuelve el resultado
    public static int[][] restarMatrices(int a[][], int b[][]){
        int resta[][] = new int[a.length][a[0].length];
        //comprobamos que pueden sumarse
        if((a.length == b.length) && (a[0].length == b[0].length)){
            for(int i = 0; i < a.length; i++){
                for(int j = 0; j < a[i].length; j++){
                    resta[i][j] = a[i][j] - b[i][j];
                }
            } 
        }else{
            System.out.println("las matrices no pueden restarse");
        }
        return resta;
    }
    
    //método que imprime la matriz
    public static void imprimirResultado(int resultado[][]){
        System.out.println("Resultado de la resta");
        for(int i = 0; i < resultado.length; i++){
            for(int j = 0; j < resultado[i].length; j++){
                System.out.print("["+resultado[i][j]+"]");
            }
            System.out.println();
        }       
    }
}
