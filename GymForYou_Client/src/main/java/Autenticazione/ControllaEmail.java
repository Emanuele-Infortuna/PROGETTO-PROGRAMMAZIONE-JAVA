package Autenticazione;

import Impostazioni.JSON;
import Impostazioni.Richieste;
import Impostazioni.Xmlpars;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class ControllaEmail {
    
    private final Richieste richieste;
    private final Xmlpars xmlpars;
    private final JSON json;
    
    public ControllaEmail(){
        
        //INIZIALIZZA LA VARIABILE XMLPARS CON IL FILE IMPOSTAZIONI.XML
        xmlpars = new Xmlpars("Impostazioni.xml");
        //CONTROLLA SE IL FILE IMPOSTAZIONI.XML E' PRESENTE NELLA CARTELLA
        if (!xmlpars.exists()) {
            //SE IL FILE IMPOSTAZIONI.XML NON ESISTE VIENE CREATO CON I VALORI DI DEAFULT
            xmlpars.ImpoDefault();           
        }
        //INIZIALIZZA LA VARIABILE DELLA CLASSE JSON 
        json = new JSON();
        //INIZIALIZZA LA VARAIBILE PER EFFETTUARE RICHIESTE TRA CLIENT E SERVER
        richieste = new Richieste(xmlpars.getElement("PROTOCOL"), xmlpars.getElement("SERVER_ADDRES"), xmlpars.getElement("SERVER_PORTA"));
    }
    
    //METODO UTILIZZATO NEL LOGIN PER OTTENERE IL TYPE DI UTENTE CHE SI STA LOGGANDO
    public String controllo(String email, String password) {
        
        String msg;
        if(!email.isEmpty()) {
            if(!password.isEmpty()) {
                //CREA UN HASHMAP CONTENENTE I VALORI
                Map dati = new HashMap();
                dati.put("email", email);                       //("email","mario@rossi.it")
                dati.put("password", password);                 //("password","mariorossi")
                dati.put("tabella", "credenziali");             //("tabella","credenziali")
                //EFFETTUA LA RICHIESTA AL SERVER UTILIZZANDO IL PATH SOTTOSTANTE
                InputStream richiesta = richieste.GetRichiesta("/controllo/email", dati, null);
                //PUSLISCE L'HASHMAP
                dati.clear();
                //INSERISCE LA RISPOSTA DEL SERVER ALL'INTERNO DELL'HASHMAP
                dati = json.LeggiJson(richiesta);                                   //("RESULT" ,"UTENTE")
                //INSERISCO NELLA VARIABILE RESULT IL VALORE DELLA CHIAVE RESULT DELL'HASHMAP DATI
                String result = (String) dati.get("result");                        //RESULT = "UTENTE";
                //STRING MSG E' UGALE AL VALORE DELLA STRINGA RESULT
                msg = result;                       
                if(!result.equals("Utente") && !result.equals("Medico") && !result.equals("Trainer") && !result.equals("Admin")) {
                    msg = "Credenziali errate.";
                }
            } else {
                msg = "Inserire la password";
            }
        } else {
            msg = "Inserire il nome utente";
        }
        return msg;   
    }
    
    

}
