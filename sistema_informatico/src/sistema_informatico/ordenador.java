package sistema_informatico;

/**
 *
 * @author Ismael
 */
public class ordenador {
    
    //atributos de la clase
    public static int id = 1;
    public int idOrdenador;
    public String Marca;
    public String Modelo;
    public int Pulgadas;
    
    //constructor sin parametros
    public ordenador(){
        idOrdenador = ordenador.id++;
    }
    //constructor por defecto
    public ordenador(String marca, String modelo, int pulgadas){
        //la id se autoincrementa cada vez que instanciamos un nuevo objeto
        idOrdenador = ordenador.id++;
        this.Marca = marca;
        this.Modelo = modelo;
        this.Pulgadas = pulgadas;
    }
    
    //constructor copia
    public ordenador(ordenador ordenador){
        this.idOrdenador = ordenador.idOrdenador;
        this.Marca = ordenador.Marca;
        this.Modelo = ordenador.Modelo;
        this.Pulgadas = ordenador.Pulgadas;
    }
    
    //getter
    public int getIdOrdenador(){
        return idOrdenador;
    }
    
    //getter
    public String getMarca(){
        return Marca;
    }
    
    //setter
    public void setMarca(String marca){
        this.Marca = marca;
    }
    
    //getter
    public String getModelo(){
        return Modelo;
    }
    
    //setter
    public void setModelo(String modelo){
        this.Modelo = modelo;
    }
    
    //getter
    public int getPulgadas(){
        return Pulgadas;
    }
    
    //setter
    public void setPulgadas(int pulgadas){
        this.Pulgadas = pulgadas;
    }
}
