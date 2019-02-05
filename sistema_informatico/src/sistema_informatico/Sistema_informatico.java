package sistema_informatico;

/**
 *
 * @author Ismael
 */
public class Sistema_informatico {

    public static void main(String[] args) {
        
        ordenador ord1 = new ordenador("Toshiba","AC3-S0",25);
        ordenador ord3 = new ordenador(ord1);
        
        sobremesa sob1 = new sobremesa("Lenovo","LC3-50",25,456,345);
        sobremesa copia = new sobremesa(sob1);
        
        portatil port1 = new portatil("Acer","AL3-S0",22,1000);
        portatil port2 = new portatil();
        
        
        port2.setBateria(1000);
    }
    
}
