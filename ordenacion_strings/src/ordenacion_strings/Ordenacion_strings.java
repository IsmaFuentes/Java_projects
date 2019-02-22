package ordenacion_strings;

import java.util.*;
/**
 *
 * @author Ismael
 */
public class Ordenacion_strings {
    
    public static void main(String[] args) {
        
        ArrayList<String> nombres = new ArrayList<String>();

        nombres.add("Aries");
        nombres.add("Tauro");
        nombres.add("Geminis");
        nombres.add("Cancer");
        nombres.add("Leo");
        nombres.add("Virgo");
        nombres.add("Libra");
        nombres.add("Escorpio");
        nombres.add("Sagitario");
        nombres.add("Capricornio");
        nombres.add("Acuario");
        nombres.add("Piscis");
        
        // Ordenamos la lista.
        Collections.sort(nombres); 
         
        // Imprimimos
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println(nombres.get(i));
        } 
        
        System.out.println("Posicion "+busqueda(nombres,"Tauro"));
    }
    
    //busqueda dicotomica strings
    public static int busqueda(ArrayList array, String valorBuscado){
        int inicio = 0;
        int fin = array.size() -1;
        
        while(inicio <= fin){
            
            int centro =(fin + inicio) / 2;
            int comparacion = valorBuscado.compareTo(array.get(centro).toString());
            
            //si se encuentra en el centro...
            if(comparacion == 0){
                return centro;
            }
            //izquierda
            if(comparacion < 0){
                fin = centro -1;
            }
            //derecha
            else{
                inicio = centro +1;
            }
        }
        //en caso de no encontrar el String, devuelve -1
        return -1;
    }
    
}
