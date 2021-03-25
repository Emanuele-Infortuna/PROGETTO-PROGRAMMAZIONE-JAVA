package SchedaForYou;

import Autenticazione.Utente;


public class CalcoloMaxMisureMuscolari {
        
        Utente utente = new Utente();
        double caviglia = utente.getCaviglia();
        double polso = utente.getPolso();
        double altezza = utente.getAltezza();

    public CalcoloMaxMisureMuscolari(){
           
    }
    
    public double calcolo_petto(){
        
        double risultato = 0.0;
        final double valore[] ={1.6817f, 1.3759f, 0.3314f};
        
        risultato = (valore[0] * polso) + (valore[1] * caviglia) + (valore[2] * altezza) ;
                
               
        return risultato;
    }
       
    public double calcolo_bicipite(){
        
        double risultato = 0.0;
        final double valore[] ={1.2033f, 0.1236f};
        
        risultato = (valore[0] * polso) + (valore[1] * altezza) ;
                
        return risultato;
    }
    
    public double calcolo_avambraccio(){
        
        double risultato = 0.0;
        final double valore[] ={0.9626f, 0.0989f};
        
        risultato = (valore[0] * polso) + (valore[1] * altezza) ;
                
        return risultato;
    }
    
    public double calcolo_cosce(){
        
        double risultato = 0.0;
        final double valore[] ={1.3868f, 0.1805f};
        
        risultato = (valore[0] * caviglia) + (valore[1] * altezza) ;
                
        return risultato;
    }
    
    public double calcolo_polpacci(){
        
        double risultato = 0.0;
        final double valore[] ={0.9298f, 0.1210f};
        
        risultato = (valore[0] * caviglia) + (valore[1] * altezza) ;
                
        return risultato;
    }
}
