package hundirlaflota;
import java.util.ArrayList;
import java.util.*;
/**
 *
 * @author Ismael
 */
public class HundirLaFlota {
    //array de barcos
    public static ArrayList<Barco> barcosJugador = new ArrayList();
    public static ArrayList<Barco> barcosEnemigo = new ArrayList();
    //objeto scanner
    private static Scanner entrada = new Scanner(System.in);;
    
    //jugadores
    private String jugador1 = "Jugador1";
    private String Jugador2 = "Jugador2";
    public static Tablero tab = new Tablero();
    
    public static void main(String[] args) {
        
        //Crea el tablero del jugador con sus barcos
        tab.creaTablero();
        
        while(tab.totalBarcosJugador != 15 || tab.totalBarcosEnemigo != 15){
            System.out.print("introduce x: ");
            int x = entrada.nextInt();
            System.out.print("introduce y: ");
            int y = entrada.nextInt();
            System.out.println("");

            if(x > 7 || y > 7){
                System.out.println("Introduce numeros de 0 a 7 \n");
            }else{
                switch(tab.tableroEnemigo[x][y]){
                    case 1:
                        tab.tableroEnemigo[x][y]=3;
                        break;
                    case 0:
                        tab.tableroEnemigo[x][y]=2;
                        break;
                    default: 
                        System.out.print("Ya has realizado este movimiento");
                }
                
                tab.actualizarTablero();                
            } 
        }

    }  
    
}
