package hundirlaflota;
import java.util.Random;
/**
 *
 * @author Ismael
 */
public class IA {
    
    public static void movimientos(int x, int y){
        //movimientos x e y aleatorios
        x = new Random().nextInt(8);
        y = new Random().nextInt(8);
        
        //mientras la posicion este vacia, se realiza el movimiento
        while(HundirLaFlota.tab.tableroJugador[x][y] > 1){
            x = new Random().nextInt(8);
            y = new Random().nextInt(8);
        }
        
        switch(HundirLaFlota.tab.tableroJugador[x][y]){
            case 1:
                HundirLaFlota.tab.tableroJugador[x][y] = 3;
                HundirLaFlota.tab.jugadorMueve = false;
                break;
            case 0:
                HundirLaFlota.tab.tableroJugador[x][y] = 2;
                HundirLaFlota.tab.jugadorMueve = true;
                break; 
            default:
               
        }   
    }
       
}
  