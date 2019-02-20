package calcular_primos;

import java.util.*;
/**
 *
 * @author Ismael
 */
public class Calcular_primos {

    static Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.print("Introduce un número entero: ");
        int numero = entrada.nextInt();
        System.out.print("Introduce un límite: ");
        int limite = entrada.nextInt();
        System.out.println("Primos del "+numero+" hasta el "+limite);
        
        System.out.println(calcularPrimos(numero,limite));
        
    }
    
    //método que calculara x números prmos a partir de un número entero
    public static ArrayList calcularPrimos(int inicio, int numeros){
        //arraylist donde se irán guardando los primos
        ArrayList<Integer> arrayDePrimos = new ArrayList<Integer>();
        
        boolean esPrimo = true;
        for(int i = inicio; i <= numeros; i++){
            esPrimo = true;
            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    esPrimo = false;
                }
            }
            //si es primo se añade al arraylist
            if(esPrimo){
                arrayDePrimos.add(i);
            }
        }
        //devuelve el arraylist lleno
        return arrayDePrimos;
    }
    
    
}
