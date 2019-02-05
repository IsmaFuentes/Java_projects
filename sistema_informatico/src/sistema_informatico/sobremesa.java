package sistema_informatico;

/**
 *
 * @author Ismael
 */
public class sobremesa extends ordenador{
   
    //atributos
    private int Altura;
    private int Ancho;
    
    //constructor sin parametros
    public sobremesa(){
        
    }
    
    //constructor por defecto
    public sobremesa(String marca, String modelo, int pulgadas, int altura, int ancho) {
        super(marca, modelo, pulgadas);
        this.Altura = altura;
        this.Ancho = ancho;
    }
    
    //constructor copia
    public sobremesa(sobremesa sobremesa){
        this.idOrdenador = sobremesa.idOrdenador;
        this.Marca = sobremesa.Marca;
        this.Modelo = sobremesa.Modelo;
        this.Pulgadas = sobremesa.Pulgadas;
        this.Altura = sobremesa.Altura;
        this.Ancho = sobremesa.Ancho;
    }
    
    //getter
    public int getAltura(){
        return Altura;
    }
    
    //setter
    public void setAltura(int altura){
        this.Altura = altura;
    }
    
    //getter
    public int getAncho(){
        return Ancho;
    }
    
    //setter
    public void setAncho(int ancho){
        this.Ancho = ancho;
    }
    
}
