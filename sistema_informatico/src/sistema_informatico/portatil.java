package sistema_informatico;

/**
 *
 * @author Ismael
 */
public class portatil extends ordenador{
    
    //atributos
    private int Bateria; //en miliamperios
    
    //constructor sin parametros
    public portatil(){
        
    }
    
    //constructor por defecto
    public portatil(String marca, String modelo, int pulgadas, int bateria) {
        super(marca, modelo, pulgadas);
        this.Bateria = bateria;
    }
    
    //constructor copia
    public portatil(portatil portatil){
        this.idOrdenador = portatil.idOrdenador;
        this.Marca = portatil.Marca;
        this.Modelo = portatil.Modelo;
        this.Pulgadas = portatil.Pulgadas;
        this.Bateria = portatil.Bateria;
    }
    
    //getter
    public int getBateria(){
        return Bateria;
    }
    
    //setter
    public void setBateria(int bateria){
        //si los miliamperios no son mayores o iguales a 1000 
        //el sistema nos lanza una excepción
        if(bateria >= 1000){
            this.Bateria = bateria;
        }else {
            throw new IllegalArgumentException("Los miliamperios introducidos no son correctos");
        }
    }
    
    @Override
    public String mostrarDatos(){
        String datos = "|Marca: "+this.Marca +" "+
                       "|Modelo: "+this.Modelo +" "+
                       "|Pulgadas: "+this.Pulgadas+" "+
                       "|Bateria: "+this.Bateria;
        return datos;
    }
}
