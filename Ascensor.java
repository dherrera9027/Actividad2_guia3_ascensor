public class Ascensor {
    private final int noPisos;
    private final int noSotanos;
    
    public Ascensor(int noPisos , int noSotanos){
        this.noPisos = noPisos;
        this.noSotanos = noSotanos;
    }
    
    public int getnoPisos(){
        return noPisos;
    }
    
    public int getnoSotanos(){
        return noSotanos;
    }
    
    public static int sgntPiso(int noPisos, int noSotanos , int piso){
        int siguiente = 0;
        int act;
        
        act = piso;
        piso++;
        
        if(act >= noPisos || noPisos == 0){
            siguiente = 0;
        }else{
            if(piso == 0){
                act = act + 2;
            }else{
                act++;
            }
            siguiente=act;
        }
        return siguiente;           
    }
    public static int antPiso(int noPisos, int noSotanos , int piso){
        int anterior = 0;
        int act;
        
        act = piso;
        piso--;
        
        if(act <= (noSotanos*-1)|| noSotanos == 0){
            anterior = 0;
        }else{
            if(piso == 0){
                act=act - 2;
            }else{
                act--;
            }
            anterior=act;
        }
        return anterior;           
    }  
    
    public static int Atencion(int pisos, int sotanos){
        int atencion=0;
        atencion = pisos + sotanos; 
        return atencion;
    }
}
