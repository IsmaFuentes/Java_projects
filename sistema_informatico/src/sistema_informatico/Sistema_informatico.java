package sistema_informatico;

import java.io.File;
import java.io.FileOutputStream;
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

        ordenadores[0] = new ordenador("Toshiba","TC23-5T",25);
        ordenadores[1] = new sobremesa("Lenovo","LT5S-C4",25,456,345);
        ordenadores[2] = new portatil("Acer","AGTH-6R",22,1000);
        
        menu();
        
    }
    
    public static void menu(){
        System.out.println("Menú");
        System.out.println("1 - Consulta los ordenadores disponibles");
        System.out.println("2 - Imprimir datos");
        System.out.println("3 - Salir del programa");
        
        int opcion = datos.nextInt();
        
        switch(opcion){
            case 1:
                mostrarOrdenadores();
                break;
            case 2:
                imprimirDatos();
                break;
            case 3: 
                break;
            default:
                break;
        }
    }
    
    public static void mostrarOrdenadores(){
        System.out.println("Ordenadores disponibles");
        //bucle for each
        for(ordenador ord:ordenadores){
            System.out.println(ord.mostrarDatos());
        }
        //imprimirDatos();
    }
    
    public static void imprimirDatos(){
        FileOutputStream salida = null;
        File fichero;
        String contenido = "";
    
        for(ordenador ord: ordenadores){
            //llenamos la cadena con los datos del array de ordenadores
            contenido += ord.mostrarDatos()+"\n";
        }
        
        try {
            fichero = new File("C:/Users/Ismael/Desktop/documento.txt");
            salida = new FileOutputStream(fichero);
            
            if(!fichero.exists()){//si el fichero no existe creará uno
                fichero.createNewFile();
            }
            byte[] arrayDeBytes = contenido.getBytes();
            salida.write(arrayDeBytes);
            salida.flush();
            System.out.println("Los datos se han imprimido correctamente");
        }catch(Exception e){
            System.out.println(e);
        }
        finally{
            try{
                if(salida != null){
                    salida.close();
                }
            }catch(Exception e){
                System.out.println("Error al cerrar el stream");
            }
        }
    }
    
}
