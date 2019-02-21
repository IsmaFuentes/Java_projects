package suma_matrices;

/**
 *
 * @author Ismael
 */
public class Suma_matrices {

    
    public static void main(String[] args) {
        
        int [][] matriz1 = {{2,4,4},{6,6,9}};
        int [][] matriz2 = {{2,4,4},{6,6,9}};

        imprimirResultado(sumarMatrices(matriz1,matriz2));
    }
   
    //método que suma dos matrices y devuelve el resultado
    public static int[][] sumarMatrices(int a[][], int b[][]){
        int suma[][] = new int[a.length][a[0].length];
        //comprobamos que pueden sumarse
        if((a.length == b.length) && (a[0].length == b[0].length)){
            for(int i = 0; i < a.length; i++){
                for(int j = 0; j < a[i].length; j++){
                    suma[i][j] = a[i][j] + b[i][j];
                }
            } 
        }else{
            System.out.println("las matrices no pueden sumarse");
        }
        return suma;
    }
    
    //método que imprime la matriz
    public static void imprimirResultado(int resultado[][]){
        System.out.println("Resultado de la suma");
        for(int i = 0; i < resultado.length; i++){
            for(int j = 0; j < resultado[i].length; j++){
                System.out.print("["+resultado[i][j]+"]");
            }
            System.out.println();
        }       
    }
}
