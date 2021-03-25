package Valutazioni;

import Autenticazione.Medico;
import Impostazioni.JSON;
import Impostazioni.Richieste;
import Impostazioni.Xmlpars;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class Valutazione {
    public Richieste richieste;
    public Xmlpars xmlpars;
    public JSON json;
    Medico medico;
    
    public Valutazione() {
         //INIZIALIZZA LA VARIABILE XMLPARS CON IL FILE IMPOSTAZIONI.XML
        xmlpars = new Xmlpars("Impostazioni.xml");
        if (!xmlpars.exists()) {
            //SE IL FILE IMPOSTAZIONI.XML NON ESISTE VIENE CREATO CON I VALORI DI DEAFULT
            xmlpars.ImpoDefault();           
        }
        
        //INIZIALIZZA LA VARIABILE DELLA CLASSE JSON 
        json = new JSON();
        //INIZIALIZZA LA VARAIBILE PER EFFETTUARE RICHIESTE TRA CLIENT E SERVER
        richieste = new Richieste(xmlpars.getElement("PROTOCOL"), xmlpars.getElement("SERVER_ADDRES"), xmlpars.getElement("SERVER_PORTA"));
    }
    
    public String recensione(String email, String voto,String tabella){
        
        String msg = "Recensione effettuata!";
        if (!email.equals("")) {
            if (!voto.equals("")) {
                Map dati = new HashMap();
                dati.put("email", email);
                dati.put("voto", voto);
                dati.put("tabella", tabella);

                InputStream richiesta = richieste.GetRichiesta("/recensioni/inviaRecensione", dati, null);
                dati.clear();
                dati = json.LeggiJson(richiesta);
                String result = (String) dati.get("result");
                if(!result.equals("Recensione effettuata!")) {
                    msg = "Recensione non effettuata!";
                }
            }else{
                msg = "Inserisci voto!";
            }
        }else{
            msg = "Seleziona un'email!";
        }
        
        return msg;
    }
    
    
    public float prelevaMediaVoto(String tabella){
        
        float risultato = 0;
        
        medico = new Medico();
        Map dati = new HashMap();
        dati.put("email", medico.getEmail());
        dati.put("tabella", tabella);

        InputStream richiesta = richieste.GetRichiesta("/recensioni/prelevaMediaVoto", dati, null);
        dati.clear();
        dati = json.LeggiJson(richiesta);
        String result = (String) dati.get("result");
        if(!result.equals("Voto prelevato!")) {
            risultato = 0;
        }else{
            risultato = Float.parseFloat("" + dati.get("risultato"));
        }
        
        return risultato;
    }
    
    
    
    
    
    
}
