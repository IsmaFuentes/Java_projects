package reductor_matrices_basico;

/**
 *
 * @author Ismael
 */
public class Reductor_matrices_basico {
    
    static int matriz2[][] = new int[32][32];
            
    public static void main(String[] args) {
        
        imprimirMatriz();
        
        while(esDivisible()){
            actualizar();
            imprimirMatriz();
            esDivisible();
        }
    }
    
    //comprueba que la matriz puede dividirse
    public static boolean esDivisible(){
        if((matriz2.length % 2 == 0) && (matriz2[0].length % 2 == 0)){
            return true;
        }else{
            return false;
        }
    }
    
    public static void actualizar(){
        matriz2 = new int[matriz2.length / 2][matriz2[0].length / 2];
    }
    
    //imprime la primera matriz
    public static void imprimirMatriz(){
        for(int i = 0; i < matriz2.length; i++){
            for(int j = 0; j < matriz2[i].length; j++){
                System.out.print("["+matriz2[i][j]+"]");
            }
            System.out.println();
        }
        System.out.println();
    }
}
