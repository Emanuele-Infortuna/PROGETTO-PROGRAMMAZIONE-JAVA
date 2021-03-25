package SchedaForYou;

import Autenticazione.Utente;

public class CalcoloCorpoPerfetto {
        
    Utente utente;
    
    public CalcoloCorpoPerfetto() {
    }
    
    //METODO USATO PER CALCOLARE IL PESO MUSCOLARE MASSIMO
    public double pesoMuscolareMax( ){
        
        utente = new Utente();
        double massaGrassa = utente.getMassagrassa();
        double altezza = utente.getAltezza();
        double polso = utente.getPolso();
        double caviglia = utente.getCaviglia();
        

        double risultato = 0.0;
        //ARRAY CONENENTE I VALORI COSTANTI DA USARE NEL CALCOLO
        final float valore[] = {1.5f, 22.6670f, 17.0104f, 224f, 1f};
        
        double altezzapollice = altezza/2.54;
        double polsopollice = polso/2.54;
        double cavigliapollice = caviglia/2.54;
        
        risultato = (Math.pow(altezzapollice, valore[0])) * ((Math.sqrt(polsopollice)/ valore[1] + Math.sqrt(cavigliapollice)/valore[2])) * ((massaGrassa/valore[3]) + valore[4]); 
        
        return risultato/2.2046;
    }
    
   
}
