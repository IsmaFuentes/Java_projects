package streams;

//imports
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Ismael
 */
public class Streams {
    
    //array de alumnos
    static Alumno misAlumnos[] = new Alumno[4];
    static Scanner datos = new Scanner(System.in);
    
    static ArrayList<String> arrayString = new ArrayList<String>();
    
    public static void main(String[] args) {
        
        misAlumnos[0] = new Alumno("Pepe","Garcia",28);
        misAlumnos[1] = new Alumno("Juán","Sánchez",18);
        misAlumnos[2] = new Alumno("Adrián","Hernández",17);
        misAlumnos[3] = new Alumno("Santiago","Garcia",15);
        
        System.out.println("Selecciona una opción:");
        System.out.println("1) Imprimir Alumnos:");
        System.out.println("2) Imprimir hola mundo:");
        System.out.println("3) Leer txt:");
        System.out.println("4) Leer txt y aplicar formato:");
        System.out.println("5) Salir:");
        int opcion = datos.nextInt();
        
        switch(opcion){
            case 1:
                //imprimirAlumnos();
                escribirDesdeFichero();
                break;
            case 2:
                escribirDatos();
            case 3: 
                leerTxt();
                break;
            case 4:
                leerTxtConFormato();
            case 5: 
                break;
        }
        
    }
    //Genera un archivo txt con datos de los alumnos que son mayores de edad
    public static void imprimirAlumnos(){
        FileOutputStream fos = null;
        File file;
        
        String contenido = "-------------------\r\n"
                         + "Listado de alumnos \r\n"
                         + "-------------------\r\n";
        
        for(int i = 0; i < misAlumnos.length; i++){
            if(misAlumnos[i].edad > 17){
                contenido += "-----Alumno nº"+i+"----\r\n"+
                             "Nombre: "+misAlumnos[i].getNombre()+"\r\n"+
                             "Apellido: "+misAlumnos[i].getApellido()+"\r\n"+
                             "Edad: "+misAlumnos[i].getEdad()+"\r\n";
            }else{
                //System.out.println("nada");
            }
        }
        
        try {
            file = new File("C:/Users/Ismael/Desktop/ficheros/documento.txt");
            fos = new FileOutputStream(file);
            
            if(!file.exists()){
                file.createNewFile();//si el fichero no existe creará uno
            }
            
            byte[] arrayDeBytes = contenido.getBytes();
            fos.write(arrayDeBytes);
            fos.flush();
            System.out.println("Datos escritos!!");
        }catch(Exception e){
            System.out.println(e);
        }
        finally{
            try{
                if(fos != null){
                    fos.close();
                }
            }catch(Exception e){
                System.out.println("Error al cerrar el stream");
            }
        }
    }
    
    
   /* Archivo txt con el que trabajamos
    Pepe García 28
    Juan Sánchez 18
    Adrián Hernández 17
    Santiago García 15
    */
    //Lee los datos de un fichero y los imprime en otro aplicandole formato
    public static void escribirDesdeFichero(){
        File fichero = new File("C:/Users/Ismael/Desktop/ficheros/entrada.txt");
        String linea = null;
        int id = 1;
        
        String contenido = "------------------\r\n"
                         + "Listado de alumnos\r\n"
                         + "------------------\r\n";
        
        String alumnos = "";
        
        try{
            FileReader leerfichero = new FileReader(fichero);
            BufferedReader miBuffer = new BufferedReader(leerfichero);
            
            while((linea = miBuffer.readLine()) != null){
                //separamos el string del fichero por lineas
                String[] array = linea.split("\\s+");
                
                //Por cada línea comprobamos si existint num = 1;e un número entre 18 y 99
                //expr regular ^0?(1[89]|[2-9]\d)$
                
                for(int i = 0; i < array.length; i++){
                    //si en la línea se cumple la condición esta se guarda en
                    //la cadena alumnos
                    if(array[i].matches("^0?(1[89]|[2-9]\\d)$")){
                        alumnos+= "----Alumno nº"+id+"----\n"+linea+"\n";
                        id++;
                    }
                }  
            }
            //cerramos el buffer
            miBuffer.close();
            
            System.out.println(contenido+alumnos);
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    //método que lee un fichero .txt e imprime su contenido con formato
    public static void leerTxtConFormato(){
        File fichero = new File("C:/Users/Ismael/Desktop/ficheros/leer.txt");
        String linea = null;
        
        try{
            FileReader lectura = new FileReader(fichero);
            BufferedReader leerBuffer = new BufferedReader(lectura);
            
            while((linea = leerBuffer.readLine()) != null){
                String[] array = linea.split(" ");

                for(int i = 0; i < array.length; i++){
                    arrayString.add(array[i]);
                    //System.out.print(array[i]);
                }
            }
            leerBuffer.close();
            
            
            for(int i = 0; i < arrayString.size(); i++){
                System.out.println(arrayString.get(i));
            }

        }catch(Exception e){
            System.out.println("Error de lectura: "+e);
        }
        
    }
    
    //método que lee un fichero .txt e imprime su contenido
    public static void leerTxt(){
        File fichero = new File("C:/Users/Ismael/Desktop/ficheros/leer.txt");
        String linea = null;
        
        try{
            FileReader lectura = new FileReader(fichero);
            
            BufferedReader leerBuffer = new BufferedReader(lectura);

            while((linea = leerBuffer.readLine()) != null){
                System.out.println(linea);
            }
            leerBuffer.close();
            
        }catch(Exception e){
            System.out.println("Error de lectura: "+e);
        }

    }
    
    //método que crea un txt con el mensaje "hola mundo"
    public static void escribirDatos(){
        FileOutputStream fos = null;
        File file;
        String contenido = "Hola mundo";
        
        try {
            file = new File("C:/Users/Ismael/Desktop/ficheros/documento.txt");
            fos = new FileOutputStream(file);
            
            if(!file.exists()){
                file.createNewFile();//si el fichero no existe creará uno
            }
            
            byte[] arrayDeBytes = contenido.getBytes();
            fos.write(arrayDeBytes);
            fos.flush();
            System.out.println("Datos escritos!!");
        }catch(Exception e){
            System.out.println(e);
        }
        finally{
            try{
                if(fos != null){
                    fos.close();
                }
            }catch(Exception e){
                System.out.println("Error al cerrar el stream");
            }
        }
    }
    
}
