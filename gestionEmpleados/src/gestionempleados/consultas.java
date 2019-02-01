package gestionempleados;

import java.util.*;
/**
 *
 * @author Ismael
 */
public class consultas {
    
    private static Scanner datos = new Scanner(System.in);
    
    //dar de alta nuevos empleados
    public static void altaEmpleado(){
        System.out.print("Nombre del empleado: ");
        String nom = datos.next();
        System.out.print("Telefono del empleado: ");
        int tlf = datos.nextInt();
        System.out.print("Email del epleado: ");
        String mail = datos.next();
        System.out.print("Fecha de alta: ");
        String fecha = datos.next();
        //añadimos un nuevo empleado al array de empleados
        GestionEmpleados.misEmpleados.add(new empleado(nom, tlf, mail, fecha));
        System.out.println("");
    }
    
    //consulta los empleados
    public static void consultarEmpleados(){
        System.out.println("\nEmpleados dados de alta:");
        //recorremos el array de empleados e imprimimos sus datos (nombre/email/tlf/alta)
        for(int i = 0;i < GestionEmpleados.misEmpleados.size(); i++){
            System.out.println(
            "Id:"+i+" | Nombre: "+GestionEmpleados.misEmpleados.get(i).getNombre()+" "+ 
            "| Email: "+GestionEmpleados.misEmpleados.get(i).getEmail()+" "+
            "| Teléfono: "+GestionEmpleados.misEmpleados.get(i).getTelefono()+" "+
            "| Fecha de alta: "+GestionEmpleados.misEmpleados.get(i).getFechaAlta()
            ); 
        }
        System.out.println("");
    }   
    
    //Elminina el objeto con posicion X del array "misEmpleados"
    public static void dropArrayElement(int idEmpleado){
        GestionEmpleados.misEmpleados.remove(idEmpleado);
    }
    //Método que da de baja a un empleado
    public static void bajaEmpleado(){
        System.out.println("introduce la id del empleado a dar de baja:");
        int id = datos.nextInt();
        //si introducimos una id invalida el sistema nos lanzará un error 
        try{
            dropArrayElement(id);
            System.out.println("Empleado dado de baja \n");
        }catch(Exception e){
            System.out.println("No se ha podido dar de baja al usuario, error de tipo "+e+"\n");
        }
    }
}
