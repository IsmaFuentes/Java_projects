package hundirlaflota;
import java.util.Random;
/**
 *
 * @author Ismael
 */
public class IA {
    
    //array en el que se guardan los movimientos de la IA
    static int array[][] = new int[8][8];
    
    public static void movimientos(int x, int y){
        //movimientos x e y aleatorios
        x = new Random().nextInt(8);
        y = new Random().nextInt(8);
        
        //mientras la posicion este vacia, se realiza el movimiento
        while(array[x][y] != 0){
            x = new Random().nextInt(8);
            y = new Random().nextInt(8);
        }
        //Movimientoo realizado
        array[x][y] = 1;
        
        
        switch(HundirLaFlota.tab.tableroJugador[x][y]){
            case 1:
                HundirLaFlota.tab.tableroJugador[x][y] = 3;
                break;
            case 0:
                HundirLaFlota.tab.tableroJugador[x][y] = 2;
                break; 
            default:
               
        }
        
    }
    
     
}
  