package gestionempleados;

/**
 *
 * @author Ismael
 */
public class empleado {
    private String nombre;
    private int telefono;
    private String email;
    private String fechaAlta;
    
    public empleado(String nom, int tlf, String mail, String alta){
        this.nombre =  nom;
        this.telefono = tlf;
        this.email = mail;
        this.fechaAlta = alta;
    }
    
    //getter para el nombre del empleado
    public String getNombre(){
        return nombre;
    }
    
    //getter para el telefono del empleado
    public int getTelefono(){
        return telefono;
    }
    
    //getter para el mail del empleado
    public String getEmail(){
        return email;
    }
    
    //getter fecha de alta del empleado
    public String getFechaAlta(){
        return fechaAlta;
    }
    
    //setter para el telefono
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    
    //setter para el email
    public void setEmail(String email){
        this.email = email;
    }
    
}
