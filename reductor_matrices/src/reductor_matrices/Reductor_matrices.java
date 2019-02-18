package reductor_matrices;

/**
 *
 * @author Ismael
 */
public class Reductor_matrices {
    
    //declaramos la matriz
    public static int filas = 8;
    public static int columnas = 8;
    public static boolean divisible = false;
    public static int matriz_base[][] = new int [filas][columnas];

    public static void main(String[] args) {
        
        rellenarMatriz(matriz_base);
        esDivisible();
        
        while(divisible == true){
            actualizar(matriz_base);
            rellenarMatriz(matriz_base);
            esDivisible();
        }
    }
    
    //llena la matriz con números aleatorios
    public static void rellenarMatriz(int matriz[][]){
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = (int)(Math.random()*9);
                System.out.print("["+matriz[j][i]+"]");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    //determina si la matriz es divisible o no
    public static void esDivisible(){
        if(filas % 2 == 0 && columnas % 2 == 0){
            filas = filas / 2;
            columnas = columnas / 2;
            divisible = true;
        }else{
            System.out.println("La matriz no puede dividirse más");
            divisible = false;
        }
    }
    
    //actualiza la matriz con las nuevas dimensiones
    public static void actualizar(int matriz[][]){
        if(divisible == true){
            matriz = new int[filas][columnas];
            matriz_base = matriz;
        }
    }
    
}
