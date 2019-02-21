package busqueda_strings;

import java.util.Scanner;

/**
 *
 * @author Ismael
 */
public class Busqueda_strings {
    
    static Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        String array[] = {"isma","miquel","luis","ach","alex","alvaro","carlos"}; 
        /*
        System.out.print("Introduce el valor buscado: ");
        String valorBuscado = entrada.nextLine();
        System.out.println("Posición: "+busquedaStrings(array, valorBuscado));
        */
        System.out.println("Posición: "+busqueda(array, "isma"));
        System.out.println("Posición: "+busqueda(array, "miquel"));
        System.out.println("Posición: "+busqueda(array, "luis"));
        System.out.println("Posición: "+busqueda(array, "ach"));
        System.out.println("Posición: "+busqueda(array, "alex"));
        System.out.println("Posición: "+busqueda(array, "alvaro"));
        System.out.println("Posición: "+busqueda(array, "carlos"));
         
    }
    
    public static int busqueda(String array[], String valorBuscado){
        int inicio = 0;
        int fin = array.length -1;
        
        while(inicio <= fin){
            
            int centro =(fin + inicio) / 2;
            
            int comparacion = valorBuscado.compareTo(array[centro]);
            
            if(array[centro].compareTo(valorBuscado) == 0){
                return centro;
            }
            else if(comparacion < 0){
                fin = centro -1;
            }else{
                inicio = centro +1;
            }
        }
        return -1;
    }
    
    public static int busquedaStrings(String array[], String valorBuscado){
        int inicio = 0;
        int fin = array.length-1;
        
        while(inicio <= fin){
            int mid = (inicio + fin)/2;
            if(array[mid]== valorBuscado){
                return mid;
            }
            else if(valorBuscado.compareTo(array[mid]) < 0){
                fin = mid -1;
            }else{
                inicio = mid +1;
            }
        }
        return -1;
    }
}