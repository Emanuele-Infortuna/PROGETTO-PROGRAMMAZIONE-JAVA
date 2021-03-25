package Calcolo_Massa;

import Autenticazione.Utente;

public class CalcoloMassaMagra {

    Utente utente;
    private double risultato;
    
    // ARRAY CONTENENTI I VALORI COSTATI DA USARE NEL CALCOLO
    final float valoriUomo[] = {1.10f, 128.0f};
    final float valoriDonna[] = {1.07f, 148.0f};
    //
    
    public CalcoloMassaMagra(){
       
    }
    
    //METODO USATO PER CALCOLARE LA MASSA MAGRA DI UN UTENTE
    public double formulaMassaMagra(){
        
        utente = new Utente();
        //CONTROLLO IL GENERE DELL'UTENTE, POICHé IL CALCOLO DIFFERISCE
        if (utente.getGenere().equals("U") || utente.getGenere().equals("A") ){
            risultato = (valoriUomo[0] * utente.getPeso() ) - valoriUomo[1] * ((Math.pow(utente.getPeso(), 2)/ (Math.pow(utente.getAltezza(), 2))));
        }else if(utente.getGenere().equals("D")){
            risultato = (valoriDonna[0] * utente.getPeso() ) - valoriDonna[1] * ((Math.pow(utente.getPeso(), 2)/ (Math.pow(utente.getAltezza(), 2))));
        }
        return risultato;
    }
        
}
