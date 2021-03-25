package Autenticazione;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class Utente extends Persona{
    
    public String genere; 
    public float peso, altezza, polso, caviglia;
    public float crf_vita, crf_collo, crf_fianchi;
    public String questionario;
    public double massagrassa, massamagra;
    public String esito;

    public Utente() {

       
        email = xmlpars2.getElement("Email");
        nome = xmlpars2.getElement("Nome");
        cognome = xmlpars2.getElement("Cognome");
        genere = xmlpars2.getElement("Genere");
        if (xmlpars2.nameRoot().equals("Utente") ) {
            peso = Float.parseFloat(xmlpars2.getElement("Peso"));
            altezza = Float.parseFloat(xmlpars2.getElement("Altezza"));
            polso = Float.parseFloat(xmlpars2.getElement("Polso"));
            caviglia = Float.parseFloat(xmlpars2.getElement("Caviglia"));
            crf_vita = Float.parseFloat(xmlpars2.getElement("Circonferenza_Vita"));
            crf_collo = Float.parseFloat(xmlpars2.getElement("Circonferenza_Collo"));
            crf_fianchi = Float.parseFloat(xmlpars2.getElement("Circonferenza_Fianchi"));
            questionario = xmlpars2.getElement("Questionario");
            massagrassa = Double.parseDouble(xmlpars2.getElement("Massa_Grassa"));
            massamagra = Double.parseDouble(xmlpars2.getElement("Massa_Magra"));
            esito = xmlpars2.getElement("Esito_Dottore");
        }
    }
    
    //*************************************************************
    
    // METODO PER REGISTRARE UN NUOVO UTENTE
    public String registrazione(String email, String password, String nome, String cognome, String genere, float peso, float altezza  ){
        //float altezza = (float)altezza;
        String msg = "Registrazione Effettuata";
        if (!email.isEmpty() && !password.isEmpty() && !nome.isEmpty() && !cognome.isEmpty() 
                && !genere.isEmpty() && altezza!=0 && peso!=0) {
            //CREA UN HASHMAP CONTENENTE LE SEGUENTI CHAVI-VALORI
            Map dati = new HashMap();
            dati.put("email", email);
            dati.put("password", password);
            dati.put("nome", nome);
            dati.put("cognome", cognome);
            dati.put("genere", genere);
            dati.put("peso", Float.toString(peso));
            dati.put("altezza", Float.toString(altezza));
            dati.put("tabella", "credenziali");
            dati.put("tabella1", "utente");
            //
            //EFFETTUA LA RICHIESTA AL SERVER UTILIZZANDO IL PATH SOTTOSTANTE
            InputStream richiesta = richieste.GetRichiesta("/registrazione/utente", dati, null);
            //PUSLISCE L'HASHMAP
            dati.clear();
            //INSERISCE LA RISPOSTA DEL SERVER ALL'INTERNO DELL'HASHMAP
            dati = json.LeggiJson(richiesta);
            //INSERISCO NELLA VARIABILE RESULT IL VALORE DELLA CHIAVE RESULT DELL'HASHMAP DATI
            String result = (String) dati.get("result");
            msg = result;

            if(!result.equals("Registrazione Effettuata")) {
                msg = "Registrazione Fallita";
            }else{
                super.setEmail(email);
                super.setNome(nome);
                super.setCognome(cognome);
                this.genere = genere;
                this.altezza = altezza;
                this.peso = peso;
            }
        }else{
            msg = "Registrazione Fallita";
        }
        return msg;
    }
 
    //METODO USATO PER MODIFICARE L'ALTEZZA E IL PESO
    public String modificaPesoAltezza(float pesonuovo, float altezzanuovo){

        String msg = "Informazioni Aggiornate";
        if(pesonuovo!= 0 && altezzanuovo!=0){
            //CREA UN HASHMAP CONTENENTE LE SEGUENTI CHAVI-VALORI
            Map dati = new HashMap();
            dati.put("email", getEmail());
            dati.put("pesonuovo", Float.toString(pesonuovo));
            dati.put("altezzanuovo", Float.toString(altezzanuovo));
            dati.put("tabella", "utente");
            //
            //EFFETTUA LA RICHIESTA AL SERVER UTILIZZANDO IL PATH SOTTOSTANTE
            InputStream richiesta = richieste.GetRichiesta("/impostazioni/modificaPesoAltezza", dati, null);
            //PUSLISCE L'HASHMAP
            dati.clear();
            //INSERISCE LA RISPOSTA DEL SERVER ALL'INTERNO DELL'HASHMAP
            dati = json.LeggiJson(richiesta);
            //INSERISCO NELLA VARIABILE RESULT IL VALORE DELLA CHIAVE RESULT DELL'HASHMAP DATI
            String result = (String) dati.get("result");
            msg = result;

            if(!result.equals("Informazioni Aggiornate")) {
                msg = "Modifica password fallita!";
            }
            }else{
                msg = "Campi vuoti";
            }
            return msg;
    }
    
    //METODO PER ELIMINARE UN ACCOUNT UTENTE
    public String eliminaAccount(){

        String msg = "Account eliminato";
        //CREA UN HASHMAP CONTENENTE LE SEGUENTI CHIAVI-VALORI
        Map dati = new HashMap();
        dati.put("email", getEmail());
        //
        //EFFETTUA LA RICHIESTA AL SERVER UTILIZZANDO IL PATH SOTTOSTANTE
        InputStream richiesta = richieste.GetRichiesta("/impostazioni/eliminaAccount", dati, null);
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
    
    // METODO PER INSERIRE RISPOSTE DEL QUESTIONARIO NEL DB
    public String invia(String email, String d1, String d2,String d3, String d4,String d5, String d6,
                        String d7, String d8, String d9, String d10, String d11, String d12, String d13){
        
        String msg = "Dati inviati";
        if (!email.isEmpty() && !d1.isEmpty() && !d2.isEmpty() && !d3.isEmpty() 
                && !d4.isEmpty() && !d5.isEmpty() && !d6.isEmpty() && !d7.isEmpty() && !d8.isEmpty() 
                && !d9.isEmpty() && !d10.isEmpty() && !d11.isEmpty() && !d12.isEmpty() && !d13.isEmpty()) {
            
            //CREA UN HASHMAP CONTENENTE I VALORI
            Map dati = new HashMap();
            dati.put("email", email);
            dati.put("d1", d1);
            dati.put("d2", d2);
            dati.put("d3", d3);
            dati.put("d4", d4);
            dati.put("d5", d5);
            dati.put("d6", d6);
            dati.put("d7", d7);
            dati.put("d8", d8);
            dati.put("d9", d9);
            dati.put("d10", d10);
            dati.put("d11", d11);
            dati.put("d12", d12);
            dati.put("d13", d13);
            dati.put("Tabella", "questionario");
            //EFFETTUA LA RICHIESTA AL SERVER UTILIZZANDO IL PATH SOTTOSTANTE
            InputStream richiesta = richieste.GetRichiesta("/utente/inviaQuestionario", dati, null);
            //PUSLISCE L'HASHMAP
            dati.clear();
            //INSERISCE LA RISPOSTA DEL SERVER ALL'INTERNO DELL'HASHMAP
            dati = json.LeggiJson(richiesta);
            //INSERISCO NELLA VARIABILE RESULT IL VALORE DELLA CHIAVE RESULT DELL'HASHMAP DATI
            String result = (String) dati.get("result");
            msg = result;

            if(!result.equals("Dati inviati")) {
                msg = "Dati non inviati";
            }
        }else{
            msg = "Campi vuoti";
        }
        return msg;

    }
   
    
    //METODO PER SALVARE NEL DB LE VARIE CIRCONFERENZE E LA MASSA GRASSA
    public String salvaCirconferenze(String vita, String fianchi, String collo, String massa_grassa){
        
        String msg = "Circonferenze Modificate";
        if (!vita.isEmpty() && !fianchi.isEmpty() && !collo.isEmpty()) {
            
            //CREA UN HASHMAP CONTENENTE LE SEGUENTI CHAVI-VALORI
            Map dati = new HashMap();
            dati.put("email", getEmail());
            dati.put("vita", vita);
            dati.put("fianchi", fianchi);
            dati.put("collo", collo);
            dati.put("massa_grassa", massa_grassa);
            dati.put("Tabella", "utente");
            //
            //EFFETTUA LA RICHIESTA AL SERVER UTILIZZANDO IL PATH SOTTOSTANTE
            InputStream richiesta = richieste.GetRichiesta("/utente/calcoloMassaGrassa", dati, null);
            //PUSLISCE L'HASHMAP
            dati.clear();
            //INSERISCE LA RISPOSTA DEL SERVER ALL'INTERNO DELL'HASHMAP
            dati = json.LeggiJson(richiesta);
            //INSERISCO NELLA VARIABILE RESULT IL VALORE DELLA CHIAVE RESULT DELL'HASHMAP DATI
            String result = (String) dati.get("result");
            msg = result;
            
            if(!result.equals("Circonferenze Modificate")) {
                msg = "Modifiche Fallite";
            }
        }else{
            msg = "Modifiche Fallite";
        }
        return msg;
    }
    
    //METODO PER SALVARE NEL DB LE CIRCONFERENZE DELLA CAVIGLIA E DEL POLSO
    public String salvaCrf_caviglia_polso(String caviglia, String polso){
        
        String msg = "Circonferenze Inserite";
        if (!caviglia.isEmpty() && !polso.isEmpty()) {
            
            Map dati = new HashMap();
            dati.put("email", getEmail());
            dati.put("caviglia", caviglia);
            dati.put("polso", polso);
            dati.put("Tabella", "utente");
            //EFFETTUA LA RICHIESTA AL SERVER UTILIZZANDO IL PATH SOTTOSTANTE
            InputStream richiesta = richieste.GetRichiesta("/utente/crfCavigliaPolso", dati, null);
            //PUSLISCE L'HASHMAP
            dati.clear();
            //INSERISCE LA RISPOSTA DEL SERVER ALL'INTERNO DELL'HASHMAP
            dati = json.LeggiJson(richiesta);
            //INSERISCO NELLA VARIABILE RESULT IL VALORE DELLA CHIAVE RESULT DELL'HASHMAP DATI
            String result = (String) dati.get("result");
            msg = result;
            
            if(!result.equals("Circonferenze Inserite")) {
                msg = "Circonferenze Non Inserite";
            }
        }else{
            msg = "Campi Caviglia e Polsi Vuoti!";
        }
        return msg;
    }
    
    //METODO PER SALVARE NEL DB LA MASSA MAGRA
    public String inserisciMassaMagra(String massaMagra){
        String msg = "Massa Magra Inserita";
        if (!massaMagra.isEmpty()) {
            //CREA UN HASHMAP CONTENENTE LE SEGUENTI CHAVI-VALORI
            Map dati = new HashMap();
            dati.put("email", getEmail());
            dati.put("massaMagra", massaMagra);
            dati.put("Tabella", "utente");
            //
            //EFFETTUA LA RICHIESTA AL SERVER UTILIZZANDO IL PATH SOTTOSTANTE
            InputStream richiesta = richieste.GetRichiesta("/utente/massaMagra", dati, null);
            //PUSLISCE L'HASHMAP
            dati.clear();
            //INSERISCE LA RISPOSTA DEL SERVER ALL'INTERNO DELL'HASHMAP
            dati = json.LeggiJson(richiesta);
            //INSERISCO NELLA VARIABILE RESULT IL VALORE DELLA CHIAVE RESULT DELL'HASHMAP DATI
            String result = (String) dati.get("result");
            msg = result;
            if(!result.equals("Massa Magra Inserita")) {
                msg = "Massa Magra Non Inserita";
            }
        }else{
            msg = "Campo Massa Magra Vuoto!";
        }
        return msg;
    }
    
    //METODO PER SALVARE LE MISURE DELLE VARIE PARTI DEL CORPO
    public String salvamisure(String petto, String bicipite, String avambraccio, String cosce, String polpacci){
        
        String msg = "Misure inserite";
        if (!petto.isEmpty() && !bicipite.isEmpty() && !avambraccio.isEmpty() && !cosce.isEmpty() && !polpacci.isEmpty()) {
           
            //CREA UN HASHMAP CONTENENTE LE SEGUENTI CHAVI-VALORI
            Map dati = new HashMap();
            dati.put("email", getEmail());
            dati.put("petto", petto);        
            dati.put("bicipite", bicipite);
            dati.put("avambraccio", avambraccio); 
            dati.put("cosce", cosce);
            dati.put("polpacci", polpacci);
            dati.put("Tabella", "misure");
            //
            //EFFETTUA LA RICHIESTA AL SERVER UTILIZZANDO IL PATH SOTTOSTANTE
            InputStream richiesta = richieste.GetRichiesta("/utente/salvamisure", dati, null);
            //PUSLISCE L'HASHMAP
            dati.clear();
            //INSERISCE LA RISPOSTA DEL SERVER ALL'INTERNO DELL'HASHMAP
            dati = json.LeggiJson(richiesta);    
            //INSERISCO NELLA VARIABILE RESULT IL VALORE DELLA CHIAVE RESULT DELL'HASHMAP DATI
            String result = (String) dati.get("result");
            msg = result;
            if(!result.equals("Misure inserite")) {
                msg = "Massa Magra Non Inserita";
            }
        }else{
            msg = "Campi Misure Vuoti!";
        }
        return msg;
    }
    
    //METODO PER SALVARE I LE MISURE INIZIALE DELLE VARIE PARTI DEL CORPO
    public String salvaValoriIniziali(String email, String petto, String bicipite, String avambraccio, String cosce, String polpacci ){
        
        String msg = "Valori Inseriti";
        if (!email.isEmpty() && !petto.isEmpty() && !bicipite.isEmpty() && !avambraccio.isEmpty() 
                && !cosce.isEmpty() && !polpacci.isEmpty()) {
            //CREA UN HASHMAP CONTENENTE LE SEGUENTI CHAVI-VALORI
            Map dati = new HashMap();
            dati.put("email", email);
            dati.put("petto", petto);
            dati.put("bicipite", bicipite);
            dati.put("avambraccio", avambraccio);
            dati.put("cosce", cosce);
            dati.put("polpacci", polpacci);
            dati.put("Tabella", "misure");
            //
            //EFFETTUA LA RICHIESTA AL SERVER UTILIZZANDO IL PATH SOTTOSTANTE
            InputStream richiesta = richieste.GetRichiesta("/utente/salvaValoriIniziali", dati, null);
            //PUSLISCE L'HASHMAP
            dati.clear();
            //INSERISCE LA RISPOSTA DEL SERVER ALL'INTERNO DELL'HASHMAP
            dati = json.LeggiJson(richiesta);
            //INSERISCO NELLA VARIABILE RESULT IL VALORE DELLA CHIAVE RESULT DELL'HASHMAP DATI
            String result = (String) dati.get("result");
            msg = result;
            if(!result.equals("Valori Inseriti")) {
                msg = "Valori non Inseriti";
            }
        }else{
            msg = "Campi vuoti";
        }
        return msg;
    }
    
    //METODO PER SALVARE LE MISURE DEI VALORI INTERMEDI DELLE VARIE PARTI DEL CORPO
    public String salvaValoriIntermedi(String email, String petto, String bicipite, String avambraccio, String cosce, String polpacci ){
        
        String msg = "Valori Intermedi Inseriti";
        if (!email.isEmpty() && !petto.isEmpty() && !bicipite.isEmpty() && !avambraccio.isEmpty() 
                && !cosce.isEmpty() && !polpacci.isEmpty()) {
            
            //CREA UN HASHMAP CONTENENTE LE SEGUENTI CHAVI-VALORI
            Map dati = new HashMap();
            dati.put("email", email);
            dati.put("petto", petto);
            dati.put("bicipite", bicipite);
            dati.put("avambraccio", avambraccio);
            dati.put("cosce", cosce);
            dati.put("polpacci", polpacci);
            dati.put("Tabella", "misure");
            //
            //EFFETTUA LA RICHIESTA AL SERVER UTILIZZANDO IL PATH SOTTOSTANTE
            InputStream richiesta = richieste.GetRichiesta("/utente/salvaValoriIntermedi", dati, null);
            //PUSLISCE L'HASHMAP
            dati.clear();
            //INSERISCE LA RISPOSTA DEL SERVER ALL'INTERNO DELL'HASHMAP
            dati = json.LeggiJson(richiesta);
            //INSERISCO NELLA VARIABILE RESULT IL VALORE DELLA CHIAVE RESULT DELL'HASHMAP DATI
            String result = (String) dati.get("result");
            msg = result;

            if(!result.equals("Valori Intermedi Inseriti")) {
                msg = "Valori Intermedi non Inseriti";
            }
        }else{
            msg = "Campi vuoti";
        }
        return msg;
        
    }
    
    public boolean controlloDati(String value) {
        for(int i = 0; i < value.length(); i++) {
            if(Character.isDigit(value.charAt(i))) {
                return false;
            }
        }        
        return true;
    }
 
    
    //************************************************************************************************************************************************


    public void setGenere(String genere) {
        this.genere = genere;
    }

    public String getGenere() {
        return genere;
    }


    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltezza() {
        return altezza;
    }

    public void setAltezza(float altezza) {
        this.altezza = altezza;
    }

    public float getPolso() {
        return polso;
    }

    public void setPolso(float polso) {
        this.polso = polso;
    }

    public float getCaviglia() {
        return caviglia;
    }

    public void setCaviglia(float caviglia) {
        this.caviglia = caviglia;
    }

    public float getCrf_vita() {
        return crf_vita;
    }

    public void setCrf_vita(float crf_vita) {
        this.crf_vita = crf_vita;
    }

    public float getCrf_collo() {
        return crf_collo;
    }

    public void setCrf_collo(float crf_collo) {
        this.crf_collo = crf_collo;
    }

    public float getCrf_fianchi() {
        return crf_fianchi;
    }

    public void setCrf_fianchi(float crf_fianchi) {
        this.crf_fianchi = crf_fianchi;
    }

    public String getQuestionario() {
        return questionario;
    }

    public void setQuestionario(String questionario) {
        this.questionario = questionario;
    }

    public double getMassagrassa() {
        return massagrassa;
    }

    public void setMassagrassa(double massagrassa) {
        this.massagrassa = massagrassa;
    }

    public double getMassamagra() {
        return massamagra;
    }

    public void setMassamagra(double massamagra) {
        this.massamagra = massamagra;
    }

    public String getEsito() {
        return esito;
    }

    public void setEsito(String esito) {
        this.esito = esito;
    }
  
    
}
