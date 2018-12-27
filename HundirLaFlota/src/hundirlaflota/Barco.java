package hundirlaflota;
import java.util.Random;
/**
 *
 * @author Ismael
 */
public class Barco{ 
    //new int[8][8]
    public int posiciones[][] = HundirLaFlota.tab.tableroJugador;
    private String orientacion;

    //posiciona el barco en el tablero
    public void posicionarBarco(int largo){
        int random = new Random().nextInt(2);
        //La orientación se decide aleatoriamente
        if(random == 0){
            orientacion = "horizontal";
        }else{
            orientacion = "vertical";
        }
        
        //punto de partida donde se empezara a construir el barco
        int x = new Random().nextInt(7);//posición eje x
        int y = new Random().nextInt(7);//posición eje y
        
        if(HundirLaFlota.Barcos.isEmpty()){
            //comprueba si el array de barcos esta vacio
            posiciones[x][y] = 1;
        }else{
            //crea los puntos de inicio
            while(posiciones[x][y] != 0){
                x = new Random().nextInt(7);
                y = new Random().nextInt(7);
            }
        }
        //crea el barco
        crearBarco(largo,x,y,orientacion);
    }
    
    //crea el barco
    public void crearBarco(int largo, int x, int y, String orientacion){
        //En caso de que el barco sobrepase los límites del array, se reinicia
        if(largo+x > 8 || largo+y > 8){
            posicionarBarco(largo);
            return;
        }
        //Comprueba si hay espacio para el barco
        //en caso afirmativo, este se imprime
        if(posicionVacia(largo,x,y,orientacion)){
            if(orientacion == "vertical"){
                for(int i = 0; i < largo; i++){
                    posiciones[i+x][y] = 1;
                }
            }
            if(orientacion == "horizontal"){
                for(int i = 0; i < largo; i++){
                    posiciones[x][i+y] = 1;
                }
            } 
        }else{
            posicionarBarco(largo);
        }
    }
    
    //comprueba si hay espacio
    public boolean posicionVacia(int largo, int x, int y, String orientacion){
        
        boolean hayEspacio = false;
        
        //comprueba si hay espacio al colocar el barco verticalmente
        if(orientacion == "vertical"){
            for(int i = 0; i < largo; i++){
                if(posiciones[i+x][y] == 0){
                    hayEspacio = true;
                }
            }
        }
        //comprueba si hay espacio al colocar el barco horizontalmente
        if(orientacion == "horizontal"){
            for(int i = 0; i < largo; i++){
                if(posiciones[x][i+y] == 0){
                    hayEspacio = true;
                }
            }
        }
        return hayEspacio;
    }
}
