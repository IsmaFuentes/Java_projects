package sistema_informatico;

import java.util.*;
/**
 *
 * @author Ismael
 */
public class Sistema_informatico {
    //array de tipo ordenador
    static ordenador ordenadores[] = new ordenador[3];
    
    //entrada de datos por teclado
    static Scanner datos = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        ordenador ordenador2 = new sobremesa();

        ordenadores[0] = new ordenador("Toshiba","TC23-5T",25);
        ordenadores[1] = new sobremesa("Lenovo","LT5S-C4",25,456,345);
        ordenadores[2] = new portatil("Acer","AGTH-6R",22,1000);
        
        menu();
        
    }
    
    public static void menu(){
        System.out.println("Menú");
        System.out.println("1 - Consulta los ordenadores disponibles");
        System.out.println("2 - Salir del programa");
        
        int opcion = datos.nextInt();
        
        switch(opcion){
            case 1:
                mostrarOrdenadores();
                break;
            case 2:
                break;
            default:
                break;
        }
    }
    
    public static void mostrarOrdenadores(){
        System.out.println("Ordenadores disponibles");
        for(int i = 0; i < ordenadores.length; i++){
            ordenadores[i].mostrarDatos();
        }
    }
    
}
