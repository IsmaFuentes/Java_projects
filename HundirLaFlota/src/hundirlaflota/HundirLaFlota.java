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
    
    //tablero
    public static Tablero tab = new Tablero();
    
    public static void main(String[] args) {
        
        //Crea el tablero del jugador con sus barcos
        tab.creaTablero();
        
        while(tab.totalPuntosEnemigo != 15){
            if(tab.totalPuntosJugador == 15){
                break;
            }
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
        
        if(tab.totalPuntosJugador == 15){
            System.out.println("Enhorabuena, has ganado");
        }
        if(tab.totalPuntosEnemigo == 15){
            System.out.println("El jugador enemigo ha ganado");
        }
    }  
    
}
