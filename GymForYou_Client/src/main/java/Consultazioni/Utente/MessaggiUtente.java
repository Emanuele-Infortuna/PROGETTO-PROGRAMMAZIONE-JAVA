package Consultazioni.Utente;

import Consultazioni.Messaggi;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;


public class MessaggiUtente extends Messaggi{
    
   
    
    public Map visualizzaMediciTrainer(String tabella){
        
        Map dati = new HashMap();
        dati.put("tabella", tabella);
        //EFFETTUA LA RICHIESTA AL SERVER UTILIZZANDO IL PATH SOTTOSTANTE
        InputStream richiesta = richieste.GetRichiesta("/consultazione/visualizzaMediciTrainer", dati, null);
        //PUSLISCE L'HASHMAP
        dati.clear();
        //INSERISCE LA RISPOSTA DEL SERVER ALL'INTERNO DELL'HASHMAP
        dati = json.LeggiJson(richiesta);
        
        return dati; 
    }
    
    
    
    
    
    public String inviaValutazione(String id, String valutazione){

        String msg = "Valutazione inviata!";

        Map dati = new HashMap();
        dati.put("id", id);
        dati.put("valutazione", valutazione);

        InputStream richiesta = richieste.GetRichiesta("/consultazione/inviaValutazione", dati, null);
        dati.clear();
        dati = json.LeggiJson(richiesta);
        String result = (String) dati.get("result");
        if(!result.equals("Valutazione inviata!")) {
            msg = "Valutazione non inviata";
        }
        
        return msg;
    }

    
    
    
}
