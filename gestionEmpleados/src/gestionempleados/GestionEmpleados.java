package gestionempleados;

import java.util.*;
/**
 *
 * @author Ismael
 */
public class GestionEmpleados {
    
    public static ArrayList<empleado> misEmpleados = new ArrayList<empleado>();
    private static Scanner datos = new Scanner(System.in);

    public static void main(String[] args) {
        //jefes de la empresa
        misEmpleados.add(new Jefatura("Alejandro",655789809,"alejandro@gmail.com","01/01/94"));
        
        //llamamos al menú de opciones
        menu();
 
    }
    
    //menú de opciones
    public static void menu(){
        System.out.println("Selecciona una opción");
        System.out.println(
            "1- Dar de alta empleados \n"
          + "2- Consultar altas \n"
          + "3- Dar de baja empleados \n"      
          + "4- Salir"
        );
        
        int opcion = datos.nextInt();
    
        while(opcion > 0){
            
            switch(opcion){
                case 1:
                    consultas.altaEmpleado();
                    menu();
                    break;
                case 2:
                    consultas.consultarEmpleados();
                    menu();
                    break;
                case 3:
                    consultas.bajaEmpleado();
                    menu();
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }
    }
}
