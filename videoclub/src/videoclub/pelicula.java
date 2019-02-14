package videoclub;

/**
 *
 * @author Ismael
 */
public class pelicula {

    private String titulo;
    private String director;
    private int minutos;
    private String genero;
    private int año;
    private boolean disponible;
    private int copias;
    private int copias_reservadas;
    
    private int idPelicula;
    public static int id = 0;
    
    //constructor sin parámetros
    public pelicula(){
        
    }
    
    //constructor con parámetros
    public pelicula(String tit, String dir, int min, String gen, int año, int cop){
        //parámetros a establecer al instanciar el objeto
        this.titulo = tit;
        this.director = dir;
        this.genero = gen;
        this.minutos = min;
        this.año = año;
        this.copias = cop;
        
        //parámetros preestablecidos
        this.disponible = true;
        idPelicula = pelicula.id++;
        this.copias_reservadas = 0;
        
    }
    
    //getters
    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public int getMinutos() {
        return minutos;
    }

    public String getGenero() {
        return genero;
    }

    public int getAño() {
        return año;
    }

    public boolean getDisponibilidad() {
        return disponible;
    }

    public int getCopias() {
        return copias;
    }

    public int getCopias_reservadas() {
        return copias_reservadas;
    }
    
    //setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void setDisponibilidad(boolean disponible) {
        this.disponible = disponible;
    }

    public void setCopias(int copias) {
        if(copias < 3000){
            this.copias = copias;
        }else {
            System.out.println("El videoclub no puede almacenar más copias");
        }
        
    }

    public void setCopias_reservadas(int copias_reservadas) {
        this.copias_reservadas = copias_reservadas;
    }
    
    //método añadir pelicula
    public static void añadirPelicula(){
        System.out.print("\nCantidad de copias: ");
        int copias = Videoclub.datos.nextInt();
        Videoclub.datos.nextLine();
        
        System.out.print("Título de la película: ");
        String titulo = Videoclub.datos.nextLine();
        System.out.print("Director de la película: ");
        String director = Videoclub.datos.nextLine();
        System.out.print("Género de la película: ");
        String genero = Videoclub.datos.nextLine();
        System.out.print("Año de la película: ");
        int año = Videoclub.datos.nextInt();
        System.out.print("Duración en minutos: ");
        int minutos = Videoclub.datos.nextInt();
        //añadimos la pelicula al ArrayList
        Videoclub.misPeliculas.add(new pelicula(titulo,director,minutos,genero,año,copias));
    }
    
    //lista las peliculas disponibles en el array misPeliculas
    public static void listarPeliculas(){
        for(int i = 0; i < Videoclub.misPeliculas.size(); i++){
            System.out.println(
                    "id: "+Videoclub.misPeliculas.get(i).idPelicula+" "+
                    "Título: "+Videoclub.misPeliculas.get(i).getTitulo()+" "+
                    "Director: "+Videoclub.misPeliculas.get(i).getDirector()+" "+
                    "Género: "+Videoclub.misPeliculas.get(i).getGenero()+" "+
                    "Año: "+Videoclub.misPeliculas.get(i).getAño()+" "+
                    "Duración: "+Videoclub.misPeliculas.get(i).getMinutos()+" "+
                    "Disponible: "+Videoclub.misPeliculas.get(i).getDisponibilidad());
        }
    }
    
    //método para reservar peliculas
    public static void reservarPelicula(){
        System.out.println("\nListado de películas");
        listarPeliculas();
        System.out.print("\nId de la pelicula a reservar:");
        int id = Videoclub.datos.nextInt();
        
        //bloque try/catch por si la id no coincide
        try{
            if(Videoclub.misPeliculas.get(id).getDisponibilidad() == true){
                Videoclub.misPeliculas.get(id).copias_reservadas++;
                System.out.println("Copia reservada\n");
                //si las copias reservadas coinciden con el número de copias la disponibilidad es = false
                if(Videoclub.misPeliculas.get(id).copias_reservadas == Videoclub.misPeliculas.get(id).copias){
                    Videoclub.misPeliculas.get(id).disponible = false;
                }
            }
            else{
                System.out.println("No quedan copias disponibles");
            }    
        }
        catch(Exception e){
            System.out.println("La id no es correcta, porfavor introduce otra:");
            //vuelve a llamar al método reservarPelicula()
            reservarPelicula();
        }
    }
    
    //método buscar peliculas
    public static void buscarPelicula(){
        System.out.println("¿Qué tipo de búsqueda deseas realizar?");
        System.out.println("1) por título");
        System.out.println("2) por director");
        System.out.println("3) por género");
        System.out.println("4) por año");
        System.out.println("5) por duración");
        
        int num = Videoclub.datos.nextInt();
        
        switch(num){
            case 1:
                System.out.print("Introduce el texto que quieres que aparezca en la búsqueda: ");
                Videoclub.datos.nextLine();
                String cadena = Videoclub.datos.nextLine();
                
                for(pelicula peli : Videoclub.misPeliculas){
                    if(peli.getTitulo().contains(cadena)){
                        System.out.println(
                                "id: "+peli.idPelicula+" "+
                                "Título: "+peli.getTitulo()+" "+
                                "Director: "+peli.getDirector()+" "+
                                "Género: "+peli.getGenero()+" "+
                                "Año: "+peli.getAño()+" "+
                                "Duración: "+peli.getMinutos()+" "+
                                "Disponible: "+peli.getDisponibilidad()
                            );
                    }else{
                        System.out.println("Los datos de búsqueda no coinciden con ninguna pelicula");
                        break;
                    }
                }
                break;
            default:
                break;
        }
        
    }
}
