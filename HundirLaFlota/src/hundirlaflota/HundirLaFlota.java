package hundirlaflota;
import java.util.ArrayList;
/**
 *
 * @author Ismael
 */
public class HundirLaFlota {
    //array de barcos
    public static ArrayList<Barco> Barcos = new ArrayList();
    
    //jugadores
    private String jugador1 = "Jugador1";
    private String Jugador2 = "Jugador2";
    public static Tablero tab = new Tablero();
    
    public static void main(String[] args) {
        

        
        //Crea el tablero del jugador con sus barcos
        for(int i = 1; i < 6; i++){ 
            Barco barco1 = new Barco();
            Barcos.add(barco1);
            barco1.posicionarBarco(i);
        }
        tab.tableroJugador();
       
        
    }
    
}
