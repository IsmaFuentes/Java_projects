package busqueda_strings;

import java.util.Scanner;

/**
 *
 * @author Ismael
 */
public class Busqueda_strings {
    
    public static void main(String[] args) {
        
        String array[] = { "Chris", "Claire", "Django", "John", "Leon", "Morty", "Rick", "Saul", "Tuco", "Walter" };

        System.out.println("Posición: "+busqueda(array, "Chris"));
        System.out.println("Posición: "+busqueda(array, "Claire"));
        System.out.println("Posición: "+busqueda(array, "Django"));
        System.out.println("Posición: "+busqueda(array, "John"));
        System.out.println("Posición: "+busqueda(array, "Leon"));
        System.out.println("Posición: "+busqueda(array, "Morty"));
        System.out.println("Posición: "+busqueda(array, "Rick"));
        System.out.println("Posición: "+busqueda(array, "Saul"));
        System.out.println("Posición: "+busqueda(array, "Tuco"));
        System.out.println("Posición: "+busqueda(array, "Walter"));
        //valor que no se encuentra -> devuelve -1
        System.out.println("Posición: "+busqueda(array, "Ismael"));
         
    }
    
    public static int busqueda(String array[], String valorBuscado){
        int inicio = 0;
        int fin = array.length -1;
        
        while(inicio <= fin){
            
            int centro =(fin + inicio) / 2;
            int comparacion = valorBuscado.compareTo(array[centro]);
            
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