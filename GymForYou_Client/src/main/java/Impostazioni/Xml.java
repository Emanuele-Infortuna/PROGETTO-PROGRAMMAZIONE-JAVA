/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Impostazioni;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author HP250G3
 */
public class Xml {
    
    
    
    public Richieste richieste;
    public Xmlpars xmlpars;
    public Xmlpars xmlpars2;
    public JSON json;

    public Xml() {
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
    
    
      //METODO PER SCRIVERE FILE FILEXML.SAVE
    public void scriviXmlDati(String email){
        
        Map dati = new HashMap();
        Xmlpars parser2 = new Xmlpars("filexml.save");      
        dati = prendiDatiUtente(email);
        dati.put("Tipologia", "Utente");         
        parser2.ScriviXML("Utente", dati);
        
    }
    
    public void salvaXmlMisure(String email){
        
        //SCRIVE FILE MISURE.SAVE CON I VALORI APPENA INSERITI
        Xmlpars parser3 = new Xmlpars("misure.save");
        Map dati = prelevamisure(email);         
        parser3.ScriviXML("Misure", dati);
        //
    }
    
    
    //METODO PER PRELEVARE I VALORI DAL DB DELLA TABELLA UTENTE
    public Map prendiDatiUtente(String email){
        //CREA UN HASHMAP CONTENENTE LE SEGUENTI CHAVI-VALORI
        Map dati = new HashMap();
        dati.put("email", email);
        dati.put("Tabella", "utente");
        //
        //EFFETTUA LA RICHIESTA AL SERVER UTILIZZANDO IL PATH SOTTOSTANTE
        InputStream richiesta = richieste.GetRichiesta("/utente/prelevadati", dati, null);
        //PUSLISCE L'HASHMAP
        dati.clear();
        //INSERISCE LA RISPOSTA DEL SERVER ALL'INTERNO DELL'HASHMAP
        dati = json.LeggiJson(richiesta);
        return dati;
    }
    
    //METODO PER PRELEVARE LE MISURE INIZIALI/INTERMEDIE/FINALI DAL DB
    public Map prelevamisure(String email){
        //CREA UN HASHMAP CONTENENTE LE SEGUENTI CHAVI-VALORI
        Map dati = new HashMap();
        dati.put("email", email);
        dati.put("Tabella", "misure");
        //
        //EFFETTUA LA RICHIESTA AL SERVER UTILIZZANDO IL PATH SOTTOSTANTE
        InputStream richiesta = richieste.GetRichiesta("/utente/prelevamisure", dati, null);
        //PUSLISCE L'HASHMAP
        dati.clear();
        //INSERISCE LA RISPOSTA DEL SERVER ALL'INTERNO DELL'HASHMAP
        dati = json.LeggiJson(richiesta);
        
        return dati;
    }
}
