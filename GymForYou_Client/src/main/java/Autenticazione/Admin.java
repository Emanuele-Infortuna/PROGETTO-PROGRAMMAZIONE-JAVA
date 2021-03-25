package Autenticazione;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;


public class Admin extends Persona {
  
    public Admin(){
    }

 
    public String inserisciAccount(String email, String nome, String cognome, String genere, String password ){
        //float altezza = (float)altezza;
        String msg = "Registrazione Effettuata";
        if (!email.isEmpty() &&  !nome.isEmpty() && !cognome.isEmpty() 
                && !genere.isEmpty() &&!password.isEmpty()) {
            //CREA UN HASHMAP CONTENENTE LE SEGUENTI CHAVI-VALORI
            Map dati = new HashMap();
            dati.put("email", email);
            dati.put("nome", nome);
            dati.put("cognome", cognome);
            dati.put("genere", genere);
            dati.put("password", password);
            dati.put("tabella", "credenziali");
            dati.put("tabella1", "trainer");
            dati.put("tabella2", "dottore");
            //
            //EFFETTUA LA RICHIESTA AL SERVER UTILIZZANDO IL PATH SOTTOSTANTE
            InputStream richiesta = richieste.GetRichiesta("/admin/inserisciAccount", dati, null);
            //PUSLISCE L'HASHMAP
            dati.clear();
            //INSERISCE LA RISPOSTA DEL SERVER ALL'INTERNO DELL'HASHMAP
            dati = json.LeggiJson(richiesta);
            //INSERISCO NELLA VARIABILE RESULT IL VALORE DELLA CHIAVE RESULT DELL'HASHMAP DATI
            String result = (String) dati.get("result");
            msg = result;

            if(!result.equals("Registrazione Effettuata")) {
                msg = "Registrazione Fallita";
            }
        }else{
            msg = "Registrazione Fallita";
        }
        return msg;
    }

     //METODO USATO NELL'ADMIN DASHBOARD PER PRELEVARE L'EMAIL, NOME E COGOME DI OGNI TRAINER E MEDICO
    public Map visualizzaRighe(){
        
        //CREA UN HASHMAP CONTENENTE I VALORI
        Map dati = new HashMap();
        dati.put("tabella","dottore");
        dati.put("tabella1", "trainer");
        //EFFETTUA LA RICHIESTA AL SERVER UTILIZZANDO IL PATH SOTTOSTANTE
        InputStream richiesta = richieste.GetRichiesta("/admin/visualizzaRighe", dati, null);
        //PUSLISCE L'HASHMAP
        dati.clear();
        //INSERISCE LA RISPOSTA DEL SERVER ALL'INTERNO DELL'HASHMAP
        dati = json.LeggiJson(richiesta);
        
        return dati; 
    }  
    
}
