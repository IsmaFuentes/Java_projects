package hundirlaflota;
import java.util.Random;
/**
 *
 * @author Ismael
 */
public class Barco{ 

    public int posiciones[][];
    private String orientacion;

    //posiciona el barco en el tablero
    public void posicionarBarco(int largo, int posiciones[][]){
        this.posiciones = posiciones;
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

        while(posiciones[x][y] != 0){
            x = new Random().nextInt(7);
            y = new Random().nextInt(7);
        }
        //crea el barco
        crearBarco(largo,x,y,orientacion);
    }
    
    //crea el barco
    public void crearBarco(int largo, int x, int y, String orientacion){
        //En caso de que el barco sobrepase los límites del array, se reinicia
        if(largo+x > 8 || largo+y > 8){
            posicionarBarco(largo, posiciones);
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
            posicionarBarco(largo, posiciones);
        }
    }
    
    //comprueba si hay espacio
    public boolean posicionVacia(int largo, int x, int y, String orientacion){
        
        boolean hayEspacio = true;
        //comprueba si hay espacio al colocar el barco verticalmente
        if(orientacion == "vertical"){
            for(int i = 0; i < largo; i++){
                if(posiciones[i+x][y] == 0){
                    hayEspacio = true;
                }else{
                    hayEspacio = false;
                    break;
                }
            }
        }
        //comprueba si hay espacio al colocar el barco horizontalmente
        if(orientacion == "horizontal"){
            for(int i = 0; i < largo; i++){
                if(posiciones[x][i+y] == 0){
                    hayEspacio = true;
                }else{
                    hayEspacio = false;
                    break;
                }
            }
        }
        return hayEspacio;
    }
}
