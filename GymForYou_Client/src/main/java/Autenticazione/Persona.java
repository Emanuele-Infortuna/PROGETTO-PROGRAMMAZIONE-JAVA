package Autenticazione;

import Impostazioni.JSON;
import Impostazioni.Richieste;
import Impostazioni.Xmlpars;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public abstract class Persona {
    
    public  String email;
    public  String nome;
    public  String cognome;
    public Richieste richieste;
    public Xmlpars xmlpars;
    public JSON json;
    public final Xmlpars xmlpars2;

    
    public Persona(/*String email, String nome, String cognome*/){
        //INIZIALIZZA LA VARIABILE XMLPARS CON IL FILE IMPOSTAZIONI.XML
        xmlpars = new Xmlpars("Impostazioni.xml");
        if (!xmlpars.exists()) {
            //SE IL FILE IMPOSTAZIONI.XML NON ESISTE VIENE CREATO CON I VALORI DI DEAFULT
            xmlpars.ImpoDefault();           
        }
        xmlpars2 = new Xmlpars("filexml.save");
        //INIZIALIZZA LA VARIABILE DELLA CLASSE JSON 
        json = new JSON();
        //INIZIALIZZA LA VARAIBILE PER EFFETTUARE RICHIESTE TRA CLIENT E SERVER
        richieste = new Richieste(xmlpars.getElement("PROTOCOL"), xmlpars.getElement("SERVER_ADDRES"), xmlpars.getElement("SERVER_PORTA"));
       
    }
    
    public String verificaModificaPassword(String email, String vecchiapass, String nuovapass){
                                
        String msg = "Password modificata con successo!";
        
        if (!email.isEmpty() && !vecchiapass.isEmpty() && !nuovapass.isEmpty()) {
            //CREA UN HASHMAP CONTENENTE LE SEGUENTI CHAVI-VALORI
            Map dati = new HashMap();
            dati.put("email", email);
            dati.put("vecchiapass", vecchiapass);
            dati.put("nuovapass", nuovapass);
            dati.put("tabella", "credenziali");
            //
            
            //INSERISCO NELLA VARIABILE RESULT IL VALORE DELLA CHIAVE RESULT DELL'HASHMAP DATI
            InputStream richiesta = richieste.GetRichiesta("/impostazioni/verificaModificaPassword", dati, null);
            //PUSLISCE L'HASHMAP
            dati.clear();
            //INSERISCE LA RISPOSTA DEL SERVER ALL'INTERNO DELL'HASHMAP
            dati = json.LeggiJson(richiesta);
            //INSERISCO NELLA VARIABILE RESULT IL VALORE DELLA CHIAVE RESULT DELL'HASHMAP DATI
            String result = (String) dati.get("result");
            msg = result;

            if(result.equals("Password non coincidono")) {
                msg = "Password non coincidono";
            }else if(!result.equals("Password modificata con successo!")){
                msg = "Modifica password fallita!";
            }
        }else{
            msg = "Campi password vuoti!";
        }
        return msg;
    }
    public  boolean verificaEmail(String email){
        
        String msg;
        //CREA UN HASHMAP CONTENENTE I VALORI
        Map dati = new HashMap();
        dati.put("email", email);
        dati.put("tabella", "credenziali");
        //
        //EFFETTUA LA RICHIESTA AL SERVER UTILIZZANDO IL PATH SOTTOSTANTE
        InputStream richiesta = richieste.GetRichiesta("/controllo/emaildoppia", dati, null);
        //PUSLISCE L'HASHMAP
        dati.clear();
        //INSERISCE LA RISPOSTA DEL SERVER ALL'INTERNO DELL'HASHMAP
        dati = json.LeggiJson(richiesta);
        //INSERISCO NELLA VARIABILE RESULT IL VALORE DELLA CHIAVE RESULT DELL'HASHMAP DATI
        String result = (String) dati.get("result");
        //STRING MSG E' UGALE AL VALORE DELLA STRINGA RESULT
        msg = result;
        
        Boolean risultato;
        
        //RITORNA TRUE NEL CASO IN CUI L'EMAIL E' GIA' UTILIZZATA DA UN ALTRO UTENTE
        if (result.equals("Email Presente")) {
           risultato=   true;
        }else{
           risultato =  false; 
        }
        
        return risultato;
    }
    public String eliminaAccount(String email){

        String msg = "Account eliminato";
        //CREA UN HASHMAP CONTENENTE LE SEGUENTI CHAVI-VALORI
        Map dati = new HashMap();
        dati.put("email",email);
        //
        //EFFETTUA LA RICHIESTA AL SERVER UTILIZZANDO IL PATH SOTTOSTANTE
        InputStream richiesta = richieste.GetRichiesta("/admin/eliminaAccount", dati, null);
        //PUSLISCE L'HASHMAP
        dati.clear();
        //INSERISCE LA RISPOSTA DEL SERVER ALL'INTERNO DELL'HASHMAP
        dati = json.LeggiJson(richiesta);
        //INSERISCO NELLA VARIABILE RESULT IL VALORE DELLA CHIAVE RESULT DELL'HASHMAP DATI
        String result = (String) dati.get("result");
        msg = result;
        if(!result.equals("Account eliminato")) {
            msg = "Impossbile eliminare account";
        }
        return msg;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    
    
}
