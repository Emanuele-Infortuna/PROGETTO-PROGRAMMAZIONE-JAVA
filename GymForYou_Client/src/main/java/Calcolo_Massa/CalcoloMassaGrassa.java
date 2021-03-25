package Calcolo_Massa;

import Autenticazione.Utente;

public class CalcoloMassaGrassa {
    
    Utente utente;
    
    private double risultato;
    private double log1;
    private double log2;
    private double log3;
    
    // ARRAY CONTENENTI I VALORI COSTATI DA USARE NEL CALCOLO
    final float valoriUomo[]  = {495.0f, 1.0324f, 0.19077f, 0.15456f, 450f };
    final float valoriDonna[]  = {495.0f, 1.29579f, 0.35004f, 0.22100f, 450f };
    //
    
    public CalcoloMassaGrassa(){
       
    }
    
    //METODO USATO PER CALCOLARE LA MASSA GRASSA DI UN UTENTE
    public double formulaMassaGrassa(float vita, float fianchi, float collo ){
        utente = new Utente();
        
        log1 = Math.log10((vita - collo));
        log2 = Math.log10(utente.getAltezza());
        log3 = Math.log10((vita + fianchi - collo));
        
        //CONTROLLO IL GENERE DELL'UTENTE, POICHé IL CALCOLO DIFFERISCE
        if (utente.getGenere().equals("U") || utente.getGenere().equals("A") ){
            risultato = valoriUomo[0]/(valoriUomo[1] - valoriUomo[2] * log1 + valoriUomo[3] * log2  ) - valoriUomo[4];
        }else if(utente.getGenere().equals("D")){
            risultato = valoriDonna[0]/(valoriDonna[1] - valoriDonna[2] * log3 + valoriDonna[3] * log2  ) - valoriDonna[4];
        }
        return risultato;
    }
 
  
  
}
