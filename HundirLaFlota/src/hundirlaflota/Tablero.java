package hundirlaflota;
/**
 *
 * @author Ismael
 */
public class Tablero {
    //atributos de la clase
    public int tableroJugador[][] = new int[8][8];
    public int tableroEnemigo[][] = new int[8][8];
    
    //Método que construye nuestro tablero
    public void iniciaTablero(int tablero[][]){
        for(int i = 1; i <= 8; i++){
            for(int j = 1; j <= 8; j++){
                if (HundirLaFlota.Barcos.get(0).posiciones[i-1][j-1]==1) {
                    System.out.print("[x]");
                }else{
                    System.out.print("[ ]");
                }
            }
            System.out.println("");
        }  
    }
    
    public void actualizarTablero(){
        for(int i = 1; i <= 8; i++){
            for(int j = 1; j <= 8; j++){

            }
            //System.out.println("");
        }  
    }
    
    //Muestra el tablero del jugador
    public void tableroJugador(){
        iniciaTablero(tableroJugador);
    }
    
    //Muestra el tablero del enemigo
    public void tableroEnemigo(){
        iniciaTablero(tableroEnemigo);
    }
    
}
