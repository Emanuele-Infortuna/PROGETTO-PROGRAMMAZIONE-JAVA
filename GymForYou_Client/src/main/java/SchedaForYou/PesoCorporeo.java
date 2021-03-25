package SchedaForYou;

import Autenticazione.Utente;

public class PesoCorporeo {

    Utente utente;
    CalcoloCorpoPerfetto calcolo;
    
    public PesoCorporeo(){
      
    }
    //METODO USATO PER CALCOLARE IL PESO CORPOREO
    public double calcolo_PesoCorporeo(){
        utente = new Utente();
        calcolo = new CalcoloCorpoPerfetto();
        double risultato = 0.0;
        
        final double valore = 100.0;
        
        double pesoMuscolareMax = calcolo.pesoMuscolareMax();
        double massaGrassa = utente.getMassagrassa();
        
        risultato = (pesoMuscolareMax / (valore - massaGrassa)) * valore ;
        
        return risultato;
    }
    
    public double calcolo_PesoCorporeo_Max(){
        
        return calcolo_PesoCorporeo() * 1.04;
    }
}
