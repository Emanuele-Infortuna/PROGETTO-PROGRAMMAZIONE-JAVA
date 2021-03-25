package Consultazioni;

import Autenticazione.Medico;
import Autenticazione.Trainer;
import Autenticazione.Utente;
import Impostazioni.JSON;
import Impostazioni.Richieste;
import Impostazioni.Xmlpars;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;


public abstract class Messaggi {
    public Richieste richieste;
    public Xmlpars xmlpars;
    public JSON json;
    Utente utente;
    Medico medico;
    Trainer trainer;
    
    
    public Messaggi() {
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
    
    public Map visualizzaDomande(String tabella, String email,String coach){
             
        Map dati = new HashMap();
        dati.put("tabella", tabella);
        dati.put("persona",email);
        dati.put("coach", coach);
        //EFFETTUA LA RICHIESTA AL SERVER UTILIZZANDO IL PATH SOTTOSTANTE
        InputStream richiesta = richieste.GetRichiesta("/consultazione/visualizzaDomande", dati, null);
        //PUSLISCE L'HASHMAP
        dati.clear();
        //INSERISCE LA RISPOSTA DEL SERVER ALL'INTERNO DELL'HASHMAP
        dati = json.LeggiJson(richiesta);
        
        return dati; 
    }
    
    public String inviaRisposta(String id, String risposta){

        String msg = "Risposta inviata!";

        if (risposta.length() < 250) {
            Map dati = new HashMap();
            dati.put("id", id);
            dati.put("risposta", risposta);

            InputStream richiesta = richieste.GetRichiesta("/consultazione/inviaRisposta", dati, null);
            dati.clear();
            dati = json.LeggiJson(richiesta);
            String result = (String) dati.get("result");
            if(!result.equals("Risposta inviata!")) {
                msg = "Risposta non inviata";
            }
        }else{
            msg = "Risposta non inviata! La domanda contiene più di 250 caratteri!";
        }
        
        return msg;
    }
    
    public String invia(String coach,String categoria,String email, String domanda){
        utente = new Utente();
        String msg = "Domanda inviata correttamente!";
        if(!categoria.isEmpty()){
            if(!domanda.isEmpty()){
                if(domanda.length() < 250){
                    Map dati = new HashMap();
                    dati.put("utente", utente.getEmail());
                    dati.put("coach", coach);
                    dati.put("emailMedicoTrainer", email);
                    dati.put("categoria", categoria);
                    dati.put("domanda", domanda);
                    InputStream richiesta = richieste.GetRichiesta("/consultazione/utenteInvia", dati, null);
                    dati.clear();
                    dati = json.LeggiJson(richiesta);
                    String result = (String) dati.get("result");
                    if(!result.equals("Domanda inviata correttamente!")) {
                        msg = "Domanda non inviata";
                    }
                }else{
                    msg = "Domanda non inviata! La domanda contiene più di 250 caratteri!";
                }
            }else{
                msg = "Scrivi il testo della domanda";
            }
        }else{
            msg = "Selezionare la categoria della domanda";
        }
            return msg;
    }
    
    public Map visualizzaRisposte(String coach){
        
        utente = new Utente();
        
        Map dati = new HashMap();
        dati.put("coach", coach);
        dati.put("tabella", "consultazione");
        dati.put("utente", utente.getEmail());
        //EFFETTUA LA RICHIESTA AL SERVER UTILIZZANDO IL PATH SOTTOSTANTE
        InputStream richiesta = richieste.GetRichiesta("/consultazione/visualizzaRisposte", dati, null);
        //PUSLISCE L'HASHMAP
        dati.clear();
        //INSERISCE LA RISPOSTA DEL SERVER ALL'INTERNO DELL'HASHMAP
        dati = json.LeggiJson(richiesta);
        return dati; 
    }
    
    
    public String mediaVoti(String coach){
        
        String msg = "Media voti ottenuta!";
        String risultato = "";
        Map dati = new HashMap();
        
        if (coach.equals("trainer")) {
            trainer = new Trainer();
            dati.put("email", trainer.getEmail());
        }else if(coach.equals("dottore")){
            medico = new Medico();
            dati.put("email", medico.getEmail());
        }
        dati.put("tabella", "consultazione");
        dati.put("coach", coach);

        InputStream richiesta = richieste.GetRichiesta("/consultazione/mediaVoti", dati, null);
        dati.clear();
        dati = json.LeggiJson(richiesta);
        String result = (String) dati.get("result");
        if(result.equals("Media voti ottenuta!")) {
            risultato = (String) dati.get("risultato");   
        }
        return risultato;
    }
    
    
    
    
    
    
    
}
