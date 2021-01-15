package ordenación_intercambio;

public class Ordenación_intercambio {

    public static void main(String[] args) {
        int a[];
        int pasada,vueltas;
            
        a = new int [100];   
        for(pasada = 0; pasada<a.length; pasada++) {
            a[pasada] = (int)
            (Math.random()*1000);
       }
       for (pasada=0; pasada<=a.length -2; pasada++){
           for (vueltas = pasada+1; vueltas<=a.length -1; vueltas++){
               if (a[pasada] > a[vueltas]){
                   int aux;
                   aux = a[pasada];
                   a[pasada] = a[vueltas];
                   a[vueltas] = aux;
               }
           } 
       }
       for (pasada = 0; pasada<a.length; pasada++){
           System.out.println(a[pasada]);
       }
    } 
}
