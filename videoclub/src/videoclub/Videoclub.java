package videoclub;

import java.util.*;
/**
 *
 * @author Ismael
 */
public class Videoclub {
    
    public static ArrayList<pelicula> misPeliculas = new ArrayList<pelicula>();
    public static Scanner datos = new Scanner(System.in);
    
    public static void main(String[] args) {
        misPeliculas.add(new pelicula("aaaa driver","Anonimo",75,"Acción",2017,2));
        misPeliculas.add(new pelicula("El señor de los anillos","Tolkien",120,"Fantasía",2001,1));
        misPeliculas.add(new pelicula("Harry Potter","JK Rowling",90,"Fantasía",2003,4));
        misPeliculas.add(new pelicula("Scary movie","James cameron",75,"Humor",2003,8));
        
        menu();
        
    }
    
    //menú
    public static void menu(){
        System.out.println("====================");
        System.out.println("=    M  E  N  Ú    =");
        System.out.println("====================");
        System.out.println("1) añadir pelicula  ");
        System.out.println("2) reservar pelicula");
        System.out.println("3) buscar películas ");
        System.out.println("4) salir            ");
        System.out.print(  "¿Qué opción deseas? ");
        int num = datos.nextInt();
        
        switch(num){
            case 1:
                pelicula.añadirPelicula();
                menu();
                break;
            case 2:
                pelicula.reservarPelicula();
                menu();
                break;
            case 3:
                pelicula.buscarPelicula();
                menu();
                break;
            case 4:
                break;
            default:
                break;
        }
    }
    
}
