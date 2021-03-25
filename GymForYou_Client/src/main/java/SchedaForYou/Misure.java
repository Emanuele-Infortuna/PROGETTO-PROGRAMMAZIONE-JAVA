package SchedaForYou;

import Autenticazione.Utente;
import Impostazioni.Xmlpars;

public class Misure {
    
    public float petto,petto_inter, petto_f;
    public float bicipite,bicipite_inter,bicipite_f;
    public float avambracci, avambracci_inter, avambracci_f;
    public float cosce,cosce_inter,cosce_f;
    public float polpacci,polpacci_inter,polpacci_f;
    
    Xmlpars parser3 = new Xmlpars("misure.save");
    Utente utente = new Utente();


    public Misure() {
        
        petto = Float.parseFloat(parser3.getElement("Petto_Iniziale"));
        petto_inter = Float.parseFloat(parser3.getElement("Petto_Intermedio"));
        petto_f = Float.parseFloat(parser3.getElement("Petto_Finale"));
        bicipite = Float.parseFloat(parser3.getElement("Bicipite_Iniziale"));
        bicipite_inter = Float.parseFloat(parser3.getElement("Bicipite_Intermedio"));
        bicipite_f = Float.parseFloat(parser3.getElement("Bicipite_Finale"));
        avambracci = Float.parseFloat(parser3.getElement("Avambraccio_Iniziale"));
        avambracci_inter = Float.parseFloat(parser3.getElement("Avambraccio_Intermedio"));
        avambracci_f = Float.parseFloat(parser3.getElement("Avambraccio_Finale"));
        cosce = Float.parseFloat(parser3.getElement("Cosce_Iniziale"));
        cosce_inter = Float.parseFloat(parser3.getElement("Cosce_Intermedio"));
        cosce_f = Float.parseFloat(parser3.getElement("Cosce_Finale"));
        polpacci = Float.parseFloat(parser3.getElement("Polpacci_Iniziale"));
        polpacci_inter = Float.parseFloat(parser3.getElement("Polpacci_Intermedio"));
        polpacci_f = Float.parseFloat(parser3.getElement("Polpacci_Finale"));
        
    }
    
    public float getPetto() {
        return petto;
    }

    public void setPetto(float petto) {
        this.petto = petto;
    }

    public float getPetto_inter() {
        return petto_inter;
    }

    public void setPetto_inter(float petto_inter) {
        this.petto_inter = petto_inter;
    }

    public float getPetto_f() {
        return petto_f;
    }

    public void setPetto_f(float petto_f) {
        this.petto_f = petto_f;
    }

    public float getBicipite() {
        return bicipite;
    }

    public void setBicipite(float bicipite) {
        this.bicipite = bicipite;
    }

    public float getBicipite_inter() {
        return bicipite_inter;
    }

    public void setBicipite_inter(float bicipite_inter) {
        this.bicipite_inter = bicipite_inter;
    }

    public float getBicipite_f() {
        return bicipite_f;
    }

    public void setBicipite_f(float bicipite_f) {
        this.bicipite_f = bicipite_f;
    }

    public float getAvambracci() {
        return avambracci;
    }

    public void setAvambracci(float avambracci) {
        this.avambracci = avambracci;
    }

    public float getAvambracci_inter() {
        return avambracci_inter;
    }

    public void setAvambracci_inter(float avambracci_inter) {
        this.avambracci_inter = avambracci_inter;
    }

    public float getAvambracci_f() {
        return avambracci_f;
    }

    public void setAvambracci_f(float avambracci_f) {
        this.avambracci_f = avambracci_f;
    }

    public float getCosce() {
        return cosce;
    }

    public void setCosce(float cosce) {
        this.cosce = cosce;
    }

    public float getCosce_inter() {
        return cosce_inter;
    }

    public void setCosce_inter(float cosce_inter) {
        this.cosce_inter = cosce_inter;
    }

    public float getCosce_f() {
        return cosce_f;
    }

    public void setCosce_f(float cosce_f) {
        this.cosce_f = cosce_f;
    }

    public float getPolpacci() {
        return polpacci;
    }

    public void setPolpacci(float polpacci) {
        this.polpacci = polpacci;
    }

    public float getPolpacci_inter() {
        return polpacci_inter;
    }

    public void setPolpacci_inter(float polpacci_inter) {
        this.polpacci_inter = polpacci_inter;
    }

    public float getPolpacci_f() {
        return polpacci_f;
    }

    public void setPolpacci_f(float polpacci_f) {
        this.polpacci_f = polpacci_f;
    }

 
    
    
}
