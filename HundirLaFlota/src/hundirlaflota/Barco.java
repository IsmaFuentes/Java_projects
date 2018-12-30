package hundirlaflota;
import java.util.Random;
/**
 *
 * @author Ismael
 */
public class Barco{ 

    public int posiciones[][];
    private int puntosBarco[][] = new int[8][8];
    private String orientacion;
    private int largo;
    private boolean hundido = false;

    //posiciona el barco en el tablero
    public void posicionarBarco(int largo, int posiciones[][]){
        this.largo = largo;
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
        /**
         * Para ubicar el barco en el tablero, se comprueba que este no 
         * sobrepase los limites del array, en caso de sobrepasarlos
         * se reubica
         */
        if(largo+x > 8 || largo+y > 8){
            posicionarBarco(largo, posiciones);
            return;
        }
        /**
         * Comprueba si hay espacio para el barco
         * en caso afirmativo, este se imprime
         */
        if(posicionVacia(largo,x,y,orientacion)){
            //se posiciona verticalmente
            if(orientacion == "vertical"){
                for(int i = 0; i < largo; i++){
                    posiciones[i+x][y] = 1;
                    puntosBarco[i+x][y] = 1;
                }
            }
            //se posiciona horizontalmente
            if(orientacion == "horizontal"){
                for(int i = 0; i < largo; i++){
                    posiciones[x][i+y] = 1;
                    puntosBarco[x][i+y] = 1;
                }
            } 
        }else{
            posicionarBarco(largo, posiciones);
        }
    }
    
    //comprueba si hay espacio en el array
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
    /**
     * identifica cuanto ocupa cada barco en el array para 
     * poder saber que barco hemos hundido
     */
    public void identificaBarco(){
        int largoBarco = 0;
        
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                if(puntosBarco[i][j]== 1 && posiciones[i][j]== 3){
                    largoBarco++;
                }
            }
        }
        //se comprueba si el barco se a hundido o no
        if(!hundido){
            if(largoBarco == this.largo){
                hundido = true;
                if(HundirLaFlota.barcosJugador.contains(this)){
                    System.out.println("El Enemigo ha undido el barco "+largo);
                    System.out.println("Puntos: "+HundirLaFlota.tab.totalPuntosEnemigo);
                }else{
                    System.out.println("Jugador ha undido el barco "+largo);
                    System.out.println("Puntos: "+HundirLaFlota.tab.totalPuntosJugador);
                }
            }  
        }
    }
}
