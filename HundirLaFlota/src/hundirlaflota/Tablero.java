package hundirlaflota;
/**
 *
 * @author Ismael
 */
public class Tablero {
    //atributos de la clase
    public int tableroJugador[][] = new int[8][8];
    public int tableroEnemigo[][] = new int[8][8];
    public int totalBarcosJugador = 0;
    public int totalBarcosEnemigo = 0;
    
    //Método que construye nuestro tablero
    public void iniciaTableros(){
        System.out.println("      Tablero del jugador  \t      Tablero del enemigo  ");
        System.out.println("   [0][1][2][3][4][5][6][7]\t   [0][1][2][3][4][5][6][7]");
        for(int i = 0; i < 8; i++){
            System.out.print("["+i+"]");
            for(int j = 0; j < 8; j++){
                System.out.print("[ ]");
            }
            System.out.print("\t["+i+"]");
            for(int j = 0; j < 8; j++){
                System.out.print("[ ]");
            }
            System.out.println("");
        }  
    }
    
    //Funcion que crea el tablero por primera vez
    public void creaTablero(){
        for(int i = 1; i < 6; i++){ 
            Barco barco1 = new Barco();
            HundirLaFlota.barcosJugador.add(barco1);
            barco1.posicionarBarco(i, tableroJugador);
        }
        for(int i = 1; i < 6; i++){ 
            Barco barco1 = new Barco();
            HundirLaFlota.barcosEnemigo.add(barco1);
            barco1.posicionarBarco(i, tableroEnemigo);
        }
        iniciaTableros();
    }
    
    //Funcion que actualiza el tablero
    public void actualizarTablero(){
        //total de barcos de ambos jugadores
        totalBarcosJugador = 0;
        totalBarcosEnemigo = 0;
        espaciar();
        
        //variables de la IA -> movimientos
        int x = 0, y = 0;
        IA.movimientos(x, y);
        
        System.out.println("      Tablero del jugador  \t      Tablero del enemigo  ");
        System.out.println("   [0][1][2][3][4][5][6][7]\t   [0][1][2][3][4][5][6][7]");
        for(int i = 0; i < 8; i++){
            //tablero jugador
            System.out.print("["+i+"]");
            for(int j = 0; j < 8; j++){
                switch(HundirLaFlota.tab.tableroJugador[i][j]){
                    case 2:
                        System.out.print("[0]");
                        break;
                    case 3:
                        totalBarcosJugador++;
                        System.out.print("[X]");
                        break;
                    default:
                        System.out.print("[ ]");
                        break;
                }
            }
            //tablero enemigo
            System.out.print("\t["+i+"]");
            for(int j = 0; j < 8; j++){
                switch(HundirLaFlota.tab.tableroEnemigo[i][j]){
                    case 2:
                        System.out.print("[0]");
                        break;
                    case 3:
                        totalBarcosEnemigo++;
                        System.out.print("[X]");
                        break;
                    default:
                        System.out.print("[ ]");
                        break;
                }
            }
            System.out.println("");
        }  
    }
    
    //Espacio entre tableros
    public void espaciar() {
        for (int i = 0; i < 5; ++i) System.out.println();
    }
    
}
