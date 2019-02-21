package producto_matrices_basico;

/**
 *
 * @author Ismael
 */
public class Producto_matrices_basico {

    public static void main(String[] args) {
        
        int [][] matriz1 = {{1,3,2},{4,3,1}};
        int [][] matriz2 = {{3,1},{2,1},{1,2}};

        imprimirResultado(multiplicar(matriz1,matriz2));
    }
   
    //método que multiplica dos matrices y devuelve el resultado
    public static int[][] multiplicar(int a[][], int b[][]){
        int producto[][] = new int[a.length][b[0].length];
        //comprobamos que pueden multiplicarse
        if(a[0].length == b.length){
            //multiplicación de las matrices
            for(int i = 0; i < producto.length; i++){
                for(int j = 0; j < producto[i].length; j++){
                    for(int z = 0; z < a[0].length; z++){
                        producto[i][j] += a[i][z] * b[z][j];
                    }
                }
            }
        }else{
            System.out.println("las matrices no pueden multiplicarse");
        }
        return producto;
    }
    
    //método que imprime la matriz
    public static void imprimirResultado(int resultado[][]){
        System.out.println("Resultado de la multiplicación");
        for(int i = 0; i < resultado.length; i++){
            for(int j = 0; j < resultado[i].length; j++){
                System.out.print("["+resultado[i][j]+"]");
            }
            System.out.println();
        }       
    }   
}
