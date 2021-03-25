package Autenticazione;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class Medico extends Persona{
   
    public Medico(){
        email = xmlpars2.getElement("email");

    }
    
    
    // METODO PER PRELEVARE L'EMAIL DEGLI UTENTI CHE HANNO COMPILATO IL QUESTIONARIO
    public Map visualizzaUtenti(){
        //CREA UN HASHMAP CONTENENTE I VALORI
        Map dati = new HashMap();
        dati.put("tabella", "questionario");
        //EFFETTUA LA RICHIESTA AL SERVER UTILIZZANDO IL PATH SOTTOSTANTE
        InputStream richiesta = richieste.GetRichiesta("/dottore/visualizzaQuestionari", dati, null);
        //PUSLISCE L'HASHMAP
        dati.clear();
        //INSERISCE LA RISPOSTA DEL SERVER ALL'INTERNO DELL'HASHMAP
        dati = json.LeggiJson(richiesta);
        
        return dati;     
    } 
    
    //METODO PER PRELEVARE LE RISPOSTE DEI QUESTIONARI DEI VARI UTENTI
    public Map prelevaRisposte(String email_riga){
        //CREA UN HASHMAP CONTENENTE I VALORI
        Map dati = new HashMap();
        dati.put("email", email_riga);
        dati.put("tabella", "questionario");
        //EFFETTUA LA RICHIESTA AL SERVER UTILIZZANDO IL PATH SOTTOSTANTE
        InputStream richiesta = richieste.GetRichiesta("/dottore/prelevaRisposte", dati, null);
        //PUSLISCE L'HASHMAP
        dati.clear();
        //INSERISCE LA RISPOSTA DEL SERVER ALL'INTERNO DELL'HASHMAP
        dati = json.LeggiJson(richiesta);
        
        return dati;     
    }
    
    //METODO USATO PER EFFETTUARE L'UPDATE DELL'ESITO DI UN UTENTE
    public String esito(String email_riga, String esito){
        
        String msg = "Esito Positivo";
        if (!email_riga.isEmpty()) {
            //CREA UN HASHMAP CONTENENTE I VALORI
            Map dati = new HashMap();
            dati.put("email", email_riga);
            dati.put("esito", esito);
            dati.put("Tabella", "questionario");
            dati.put("Tabella1", "utente");
            //EFFETTUA LA RICHIESTA AL SERVER UTILIZZANDO IL PATH SOTTOSTANTE
            InputStream richiesta = richieste.GetRichiesta("/dottore/esito", dati, null);
            //PUSLISCE L'HASHMAP
            dati.clear();
            //INSERISCE LA RISPOSTA DEL SERVER ALL'INTERNO DELL'HASHMAP
            dati = json.LeggiJson(richiesta);
            //INSERISCO NELLA VARIABILE RESULT IL VALORE DELLA CHIAVE RESULT DELL'HASHMAP DATI
            String result = (String) dati.get("result");
            msg = result;
            if(!result.equals("Esito Positivo")) {
                msg = "Modifiche Fallite";
            }
        }else{
            msg = "Campo vuoto!";
        }
        return msg;
    }
    
}
