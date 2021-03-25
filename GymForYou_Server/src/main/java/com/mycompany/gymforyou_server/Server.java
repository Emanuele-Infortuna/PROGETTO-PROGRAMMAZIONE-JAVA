package com.mycompany.gymforyou_server;

import Impostazioni_Server.Database;
import Impostazioni_Server.FileLogger;
import Impostazioni_Server.Xmlpars;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletOutputStream;
import static spark.Spark.*;
import org.apache.log4j.PropertyConfigurator;
import spark.Spark;

public class Server {

    
    private static int portServer = 0;
    private static FileLogger filelog;
    private static Xmlpars xmlparser;
    private static Database database;
    private static JSON js;

    public static void main(String[] args) {
        // TODO code application logic here
        filelog = new FileLogger(); // istanzio l'oggetto per controllare l'esistenza delle impostazioni del logger.
        xmlparser = new Xmlpars("Impostazioni.xml");
        if (!filelog.exists()) {
            filelog.Scrivi();
        }
        PropertyConfigurator.configure(filelog.getPath());
        
        if (!xmlparser.exists()) {
            xmlparser.ImpoDefault();
        }
        portServer = Integer.parseInt(xmlparser.getElement("PORT_SERVER"));

        // inizializzazione server di SparkServer       
        Spark.port(portServer);// inizializza spark sulla porta portServer 
        Spark.init();

        System.out.println("Spark Avviato sulla porta :" + Spark.port());

        // creazione oggetto database 
        String indirizzodb = xmlparser.getElement("SERVER_DATABASE");
        String porta = xmlparser.getElement("PORT_DATABASE");
        String nomedb = xmlparser.getElement("NAME_DATABASE");
        
        System.out.println("Connessione al DB in corso....");
        database = new Database(indirizzodb, Integer.valueOf(porta), xmlparser.getElement("USER_DATABASE"), xmlparser.getElement("PASS_DATABASE"), nomedb);
        Connection connection = database.getConnection();
       
        System.out.println("***   Connesso al DB   *** -> " + "Indrizzo: " +indirizzodb + ", Porta: " + porta + ", NomeDB: " + nomedb + ".");
        System.out.println("Server attivo......");
       
        js = new JSON();

        
        //QUI SOTTO SONO ELENCATE TUTTE LE ROUTE DISPONIBILI DELL'APPLICAZIONE
        //ESSE HANNO LO SCOPO DI FAR COMUNICARE L'APPLICAZIONE CLIENT CON IL SERVER,
        //CONDIVIDERE DATI ED EFFETUARE RICHIESTE AL DATABASE
        
        
        
        path("/", () -> {
            path("controllo", () -> {
                get("/email", (req, res) -> {
                    Map dati = new HashMap();
                    dati.put("email", req.queryParams("email"));
                    dati.put("password", req.queryParams("password"));
                    dati.put("tabella", req.queryParams("tabella"));
                    String ruolo = database.ControlloEmail(dati);
                    if(ruolo.equals("usr")) {
                        dati.put("result", "Utente");  
                    } else if (ruolo.equals("med")){
                        dati.put("result", "Medico");
                    } else if (ruolo.equals("trn")){
                        dati.put("result", "Trainer");
                     }else if(ruolo.equals("adm")){
                        dati.put("result", "Admin");
                     }else{
                        dati.put("result", "Utente non trovato");
                    }
                    String ScriviJson = js.ScriviJson(dati);
                    // rimando indietro json
                    ServletOutputStream outputStream = res.raw().getOutputStream();
                    outputStream.print(ScriviJson);
                    outputStream.flush();
                    return "ok";
                });
                get("/emaildoppia", (req, res) -> {
                   Map dati = new HashMap();
                   dati.put("email", req.queryParams("email"));
                   dati.put("tabella", req.queryParams("tabella"));
                   Boolean ruolo = database.EmailDoppia(dati);  // Torna true se esiste già
                   if(ruolo) {
                       dati.put("result", "Email Presente");  
                   }else{
                       dati.put("result", "Email Non Presente");
                   }
                   String ScriviJson = js.ScriviJson(dati);
                   // rimando indietro json
                   ServletOutputStream outputStream = res.raw().getOutputStream();
                   outputStream.print(ScriviJson);
                   outputStream.flush();
                   return "ok";
                    });
                });
            path("admin", () -> {
                get("/visualizzaRighe", (req, res) -> {
                    
                    String tabella = req.queryParams("tabella"); 
                    String tabella_uno = req.queryParams("tabella1");
                    ArrayList<String> array = database.visualizzaRighe(tabella,tabella_uno);
                    Map result = new HashMap();
                    for (int i = 0; i < array.size(); i=i+4) {
                        result.put(""+i,array.get(i));
                        for (int j = 1; j < array.size(); j=j+4) {
                            result.put(""+j, array.get(j));
                            for (int k = 2; k < array.size(); k=k+4) {
                                result.put(""+ k, array.get(k));
                                for (int h = 3; h < array.size(); h=h+4) {
                                    result.put(""+ h, array.get(h));
                                    for (int l = 4; l < array.size(); l=l+5) {
                                        result.put(""+ l, array.get(l));
                                    }
                                }
                            }
                        }
                    }
                    String ScriviJson = js.ScriviJson(result);
                    ServletOutputStream outputStream = res.raw().getOutputStream();
                    outputStream.print(ScriviJson);
                    outputStream.flush();
                    return "ok";
                });
                get("/eliminaAccount", (req, res) -> {
    
                    Map dati = new HashMap();
                    dati.put("email", req.queryParams("email"));
                    database.eliminaAccountAdmin(dati);
                    dati.put("result", "Account eliminato");
                    String ScriviJson = js.ScriviJson(dati);
                    // rimando indietro json
                    ServletOutputStream outputStream = res.raw().getOutputStream();
                    outputStream.print(ScriviJson);
                    outputStream.flush();
                    return "ok";
                });
                get("/inserisciAccount", (req, res) -> {
                    
                    Map dati = new HashMap();
                    dati.put("email", req.queryParams("email"));
                    dati.put("nome", req.queryParams("nome"));
                    dati.put("cognome", req.queryParams("cognome"));
                    dati.put("genere", req.queryParams("genere"));
                    dati.put("password", req.queryParams("password"));
                    dati.put("tabella1", req.queryParams("tabella1"));
                    dati.put("tabella", req.queryParams("tabella"));
                    dati.put("tabella2", req.queryParams("tabella2"));
                    
                    database.inserisciAccount(dati);
                    
                    dati.put("result", "Registrazione Effettuata");
                    
                    String ScriviJson = js.ScriviJson(dati);
                    // rimando indietro json
                    ServletOutputStream outputStream = res.raw().getOutputStream();
                    outputStream.print(ScriviJson);
                    outputStream.flush();
                    return "ok";
                }); 
            });
            path("registrazione", () -> {
                get("/utente", (req, res) -> {
                    
                    Map dati = new HashMap();
                    dati.put("email", req.queryParams("email"));
                    dati.put("password", req.queryParams("password"));
                    dati.put("nome", req.queryParams("nome"));
                    dati.put("cognome", req.queryParams("cognome"));
                    dati.put("genere", req.queryParams("genere"));
                    dati.put("altezza", req.queryParams("altezza"));
                    dati.put("peso", req.queryParams("peso"));
                    dati.put("tabella1", req.queryParams("tabella1"));
                    dati.put("tabella", req.queryParams("tabella"));
                    database.Registrazione(dati);
                    dati.put("result", "Registrazione Effettuata");
                    String ScriviJson = js.ScriviJson(dati);
                    // rimando indietro json
                    ServletOutputStream outputStream = res.raw().getOutputStream();
                    outputStream.print(ScriviJson);
                    outputStream.flush();
                    return "ok";
                });               
            });
            
            path("impostazioni", () -> {
                get("/verificaModificaPassword", (req, res) -> {
                    //------
                    String plaintext = req.queryParams("vecchiapass");
                    MessageDigest m = MessageDigest.getInstance("MD5");
                    m.reset();
                    m.update(plaintext.getBytes());
                    byte[] digest = m.digest();
                    BigInteger bigInt = new BigInteger(1,digest);
                    String hashtext = bigInt.toString(16);
                    // Now we need to zero pad it if you actually want the full 32 chars.
                    while(hashtext.length() < 32 ){
                    hashtext = "0"+hashtext;
                    }
                    //---------
                    
                    Map dati = new HashMap();
                    dati.put("email", req.queryParams("email"));
                    dati.put("vecchiapass", hashtext);
                    dati.put("nuovapass", req.queryParams("nuovapass"));
                    dati.put("tabella", req.queryParams("tabella"));
                    String msg = database.verificaModificaPassword(dati);
                    if (msg.equals("Password modificata!")) {
                        dati.put("result", "Password modificata con successo!");
                    }else if(msg.equals("Password non coincidono")){
                        dati.put("result", "Password non coincidono");
                    }else{
                        dati.put("result", "fallita");
                    }
                    
                    String ScriviJson = js.ScriviJson(dati);
                    // rimando indietro json
                    ServletOutputStream outputStream = res.raw().getOutputStream();
                    outputStream.print(ScriviJson);
                    outputStream.flush();
                    return "ok";
                });   
                get("/modificaPesoAltezza", (req, res) -> {
    
                    Map dati = new HashMap();
                    dati.put("email", req.queryParams("email"));
                    dati.put("pesonuovo", req.queryParams("pesonuovo"));
                    dati.put("altezzanuovo", req.queryParams("altezzanuovo"));
                    dati.put("tabella", req.queryParams("tabella"));
                    database.modificaPesoAltezza(dati);
                    dati.put("result", "Informazioni Aggiornate");
                    String ScriviJson = js.ScriviJson(dati);
                    // rimando indietro json
                    ServletOutputStream outputStream = res.raw().getOutputStream();
                    outputStream.print(ScriviJson);
                    outputStream.flush();
                    return "ok";
                });
                get("/eliminaAccount", (req, res) -> {
    
                    Map dati = new HashMap();
                    dati.put("email", req.queryParams("email"));
                    database.eliminaAccount(dati);
                    dati.put("result", "Account eliminato");
                    String ScriviJson = js.ScriviJson(dati);
                    // rimando indietro json
                    ServletOutputStream outputStream = res.raw().getOutputStream();
                    outputStream.print(ScriviJson);
                    outputStream.flush();
                    return "ok";
                });
            });
            
            path("utente", () -> {
                get("/prelevadati", (req, res) -> {
                    String email = req.queryParams("email");
                    String tabella = req.queryParams("Tabella"); 
                    Map result = database.PrendiDati(email,tabella);
                    String ScriviJson = js.ScriviJson(result);
                    ServletOutputStream outputStream = res.raw().getOutputStream();
                    outputStream.print(ScriviJson);
                    outputStream.flush();
                    return "ok"; 
                });
                get("/calcoloMassaGrassa", (req, res) -> {
                    Map dati = new HashMap();
                    dati.put("email", req.queryParams("email"));
                    dati.put("vita", req.queryParams("vita"));
                    dati.put("fianchi", req.queryParams("fianchi"));
                    dati.put("collo", req.queryParams("collo"));
                    dati.put("massa_grassa", req.queryParams("massa_grassa"));
                    dati.put("Tabella", req.queryParams("Tabella"));
                    database.modificaCirconferenze(dati);
                    dati.put("result", "Circonferenze Modificate");
                    String ScriviJson = js.ScriviJson(dati);
                    ServletOutputStream outputStream = res.raw().getOutputStream();
                    outputStream.print(ScriviJson);
                    outputStream.flush();
                    return "ok"; 
                });
                get("/crfCavigliaPolso", (req, res) -> {
                    Map dati = new HashMap();
                    dati.put("email", req.queryParams("email"));
                    dati.put("caviglia", req.queryParams("caviglia"));
                    dati.put("polso", req.queryParams("polso"));
                    dati.put("Tabella", req.queryParams("Tabella"));
                    database.modificaCrf_Caviglia_Polso(dati);
                    dati.put("result", "Circonferenze Inserite");
                    String ScriviJson = js.ScriviJson(dati);
                    ServletOutputStream outputStream = res.raw().getOutputStream();
                    outputStream.print(ScriviJson);
                    outputStream.flush();
                    return "ok"; 
                });
                get("/massaMagra", (req, res) -> {
                    
                    Map dati = new HashMap();
                    dati.put("email", req.queryParams("email"));
                    dati.put("massaMagra", req.queryParams("massaMagra"));
                    dati.put("Tabella", req.queryParams("Tabella"));
                    database.inserisciMassaMagra(dati);
                    dati.put("result", "Massa Magra Inserita");
                    String ScriviJson = js.ScriviJson(dati);
                    ServletOutputStream outputStream = res.raw().getOutputStream();
                    outputStream.print(ScriviJson);
                    outputStream.flush();
                    return "ok"; 
                });
                get("/salvamisure", (req, res) -> {
                    
                    Map dati = new HashMap();
                    dati.put("email", req.queryParams("email"));
                    dati.put("petto", req.queryParams("petto"));
                    dati.put("bicipite", req.queryParams("bicipite"));
                    dati.put("avambraccio", req.queryParams("avambraccio"));
                    dati.put("cosce", req.queryParams("cosce"));
                    dati.put("polpacci", req.queryParams("polpacci"));
                    dati.put("Tabella", req.queryParams("Tabella"));
                    database.inseriscimisure(dati);
                    dati.put("result", "Misure inserite");
                    String ScriviJson = js.ScriviJson(dati);
                    ServletOutputStream outputStream = res.raw().getOutputStream();
                    outputStream.print(ScriviJson);
                    outputStream.flush();
                    return "ok"; 
                });
                
                get("/prelevamisure", (req, res) -> {
                    
                    String email = req.queryParams("email");
                    String tabella = req.queryParams("Tabella"); 
                    Map result = database.prelevamisure(email,tabella);
                    String ScriviJson = js.ScriviJson(result);
                    ServletOutputStream outputStream = res.raw().getOutputStream();
                    outputStream.print(ScriviJson);
                    outputStream.flush();
                    return "ok"; 
                });
                
                get("/inviaQuestionario", (req, res) -> {
                    
                    Map dati = new HashMap();
                    dati.put("email", req.queryParams("email"));
                    dati.put("d1", req.queryParams("d1"));
                    dati.put("d2", req.queryParams("d2"));
                    dati.put("d3", req.queryParams("d3"));
                    dati.put("d4", req.queryParams("d4"));
                    dati.put("d5", req.queryParams("d5"));
                    dati.put("d6", req.queryParams("d6"));
                    dati.put("d7", req.queryParams("d7"));
                    dati.put("d8", req.queryParams("d8"));
                    dati.put("d9", req.queryParams("d9"));
                    dati.put("d10", req.queryParams("d10"));
                    dati.put("d11", req.queryParams("d11"));
                    dati.put("d12", req.queryParams("d12"));
                    dati.put("d13", req.queryParams("d13"));
                    dati.put("Tabella", req.queryParams("Tabella"));
                    database.inviaQuestionario(dati);
                    dati.put("result", "Dati inviati");
                    String ScriviJson = js.ScriviJson(dati);
                    ServletOutputStream outputStream = res.raw().getOutputStream();
                    outputStream.print(ScriviJson);
                    outputStream.flush();
                    return "ok"; 
                });
                get("/salvaValoriIniziali", (req, res) -> {
                    String email = req.queryParams("email");
                    String petto = req.queryParams("petto");
                    String bicipite = req.queryParams("bicipite");
                    String avambraccio = req.queryParams("avambraccio");
                    String cosce = req.queryParams("cosce");
                    String polpacci = req.queryParams("polpacci");
                    String tabella = req.queryParams("Tabella"); 
                    Map result = database.salvaValoriIniziali(email, petto, bicipite, avambraccio, cosce, polpacci, tabella);
                    String ScriviJson = js.ScriviJson(result);
                    ServletOutputStream outputStream = res.raw().getOutputStream();
                    outputStream.print(ScriviJson);
                    outputStream.flush();
                    return "ok"; 
                });
                get("/salvaValoriIntermedi", (req, res) -> {
                    String email = req.queryParams("email");
                    String petto = req.queryParams("petto");
                    String bicipite = req.queryParams("bicipite");
                    String avambraccio = req.queryParams("avambraccio");
                    String cosce = req.queryParams("cosce");
                    String polpacci = req.queryParams("polpacci");
                    String tabella = req.queryParams("Tabella"); 
                    Map result = database.salvaValoriIntermedi(email, petto, bicipite, avambraccio, cosce, polpacci, tabella);
                    String ScriviJson = js.ScriviJson(result);
                    ServletOutputStream outputStream = res.raw().getOutputStream();
                    outputStream.print(ScriviJson);
                    outputStream.flush();
                    return "ok"; 
                });
            });
            
            path("dottore", () -> {
                get("/visualizzaQuestionari", (req, res) -> {
                    String tabella = req.queryParams("tabella"); 
                    ArrayList<String> array = database.visualizzaUtenti(tabella);
                                        
                    Map result = new HashMap();
                    for (String i : array) {
                        result.put("email"+i.toString(),i);
                    }
                    String ScriviJson = js.ScriviJson(result);
                    ServletOutputStream outputStream = res.raw().getOutputStream();
                    outputStream.print(ScriviJson);
                    outputStream.flush();
                    return "ok";
                });   
                get("/prelevaRisposte", (req, res) -> {
                    String email = req.queryParams("email");
                    String tabella = req.queryParams("tabella"); 
                    Map result = database.prelevaRisposte(email,tabella);
                    String ScriviJson = js.ScriviJson(result);
                    ServletOutputStream outputStream = res.raw().getOutputStream();
                    outputStream.print(ScriviJson);
                    outputStream.flush();
                    return "ok"; 
                }); 
                get("/esito", (req, res) -> {
                    Map dati = new HashMap();
                    dati.put("email", req.queryParams("email"));
                    dati.put("esito", req.queryParams("esito"));
                    dati.put("Tabella1", req.queryParams("Tabella1"));
                    dati.put("Tabella", req.queryParams("Tabella"));
                    database.esito(dati);
                    dati.put("result", "Esito Positivo");
                    String ScriviJson = js.ScriviJson(dati);
                    ServletOutputStream outputStream = res.raw().getOutputStream();
                    outputStream.print(ScriviJson);
                    outputStream.flush();
                    return "ok"; 
                }); 
            });
            path("consultazione", () -> {
                get("/visualizzaMediciTrainer", (req, res) -> {
                    String tabella = req.queryParams("tabella"); 
                    ArrayList<String> array = database.visualizzaMediciTrainer(tabella);
                    Map result = new HashMap();
                    for (int i = 0; i < array.size(); i=i+3) {
                        result.put(""+i,array.get(i));
                        for (int j = 1; j < array.size(); j=j+3) {
                            result.put(""+j, array.get(j));
                            for (int k = 2; k < array.size(); k=k+3) {
                                result.put(""+ k, array.get(k));
                            }
                        }
                    }
                    String ScriviJson = js.ScriviJson(result);
                    ServletOutputStream outputStream = res.raw().getOutputStream();
                    outputStream.print(ScriviJson);
                    outputStream.flush();
                    return "ok";
                });
                get("/utenteInvia", (req, res) -> {
                    Map dati = new HashMap();
                    dati.put("coach", req.queryParams("coach"));
                    dati.put("utente", req.queryParams("utente"));
                    dati.put("emailMedicoTrainer", req.queryParams("emailMedicoTrainer"));
                    dati.put("categoria", req.queryParams("categoria"));
                    dati.put("domanda", req.queryParams("domanda"));
                    
                    if(database.utenteInvia(dati)){
                        dati.put("result", "Domanda inviata correttamente!");
                    }
                    String ScriviJson = js.ScriviJson(dati);
                    ServletOutputStream outputStream = res.raw().getOutputStream();
                    outputStream.print(ScriviJson);
                    outputStream.flush();
                    return "ok"; 
                });
                get("/visualizzaRisposte", (req, res) -> {
                    String coach = req.queryParams("coach"); 
                    String tabella = req.queryParams("tabella"); 
                    String utente =  req.queryParams("utente"); 
                    ArrayList<String> array = database.visualizzaRisposte(coach, tabella, utente);
                    Map result = new HashMap();
                    for (int i = 0; i < array.size(); i=i+6) {
                        result.put(""+i,array.get(i));
                        for (int j = 1; j < array.size(); j=j+6) {
                            result.put(""+j, array.get(j));
                            for (int k = 2; k < array.size(); k=k+6) {
                                result.put(""+ k, array.get(k));
                                for (int l = 3; l < array.size(); l=l+6) {
                                    result.put(""+ l, array.get(l));
                                    for (int m = 4; m < array.size(); m=m+6) {
                                        result.put(""+ m, array.get(m));
                                        for (int q = 5; q < array.size(); q=q+6) {
                                            result.put(""+ q, array.get(q));
                                        }
                                    }
                                }
                            }
                        }
                    }
                    String ScriviJson = js.ScriviJson(result);
                    ServletOutputStream outputStream = res.raw().getOutputStream();
                    outputStream.print(ScriviJson);
                    outputStream.flush();
                    return "ok";
                });
                get("/inviaValutazione", (req, res) -> {
                    
                     Map dati = new HashMap();
                    dati.put("id", req.queryParams("id"));
                    dati.put("valutazione", req.queryParams("valutazione"));
                                        
                    if(database.inviaValutazione(dati)){
                        dati.put("result", "Valutazione inviata!");
                    }
                    String ScriviJson = js.ScriviJson(dati);
                    ServletOutputStream outputStream = res.raw().getOutputStream();
                    outputStream.print(ScriviJson);
                    outputStream.flush();
                    return "ok"; 
                });
                get("/visualizzaDomande", (req, res) -> {
                    String tabella = req.queryParams("tabella"); 
                    String persona = req.queryParams("persona"); 
                    String coach  = req.queryParams("coach"); 
                    ArrayList<String> array = database.visualizzaDomande(tabella,persona,coach);
                    Map result = new HashMap();
                    for (int i = 0; i < array.size(); i=i+6) {
                        result.put(""+i,array.get(i));
                        for (int j = 1; j < array.size(); j=j+6) {
                            result.put(""+j, array.get(j));
                            for (int k = 2; k < array.size(); k=k+6) {
                                result.put(""+ k, array.get(k));
                                for (int l = 3; l < array.size(); l=l+6) {
                                    result.put(""+ l, array.get(l));
                                    for (int m = 4; m < array.size(); m=m+6) {
                                        result.put(""+ m, array.get(m));
                                        for (int q = 5; q < array.size(); q=q+6) {
                                            result.put(""+ q, array.get(q));
                                        }
                                    }
                                }
                            }
                        }
                    }
                    String ScriviJson = js.ScriviJson(result);
                    ServletOutputStream outputStream = res.raw().getOutputStream();
                    outputStream.print(ScriviJson);
                    outputStream.flush();
                    return "ok";
                });
                get("/inviaRisposta", (req, res) -> {
                    
                     Map dati = new HashMap();
                    dati.put("id", req.queryParams("id"));
                    dati.put("risposta", req.queryParams("risposta"));
                                        
                    if(database.inviaRisposta(dati)){
                        dati.put("result", "Risposta inviata!");
                    }
                    String ScriviJson = js.ScriviJson(dati);
                    ServletOutputStream outputStream = res.raw().getOutputStream();
                    outputStream.print(ScriviJson);
                    outputStream.flush();
                    return "ok"; 
                });
                get("/mediaVoti", (req, res) -> {
                    
                    Map dati = new HashMap();
                    String email =  req.queryParams("email");
                    String tabella =  req.queryParams("tabella");
                    String coach =  req.queryParams("coach");  
                    float value = database.mediaVoti(email,tabella,coach);
                    if(value >= 0 && value <= 5){
                        dati.put("result", "Media voti ottenuta!");
                        dati.put("risultato", ""+value);
                    }
                    
                    String ScriviJson = js.ScriviJson(dati);
                    ServletOutputStream outputStream = res.raw().getOutputStream();
                    outputStream.print(ScriviJson);
                    outputStream.flush();
                    return "ok"; 
                });
            });
            path("recensioni", () -> {
                get("/inviaRecensione", (req, res) -> {
                    Map dati = new HashMap();
                    
                    String email = req.queryParams("email"); 
                    String voto = req.queryParams("voto"); 
                    String tabella = req.queryParams("tabella"); 
                    
                    if(database.inviaRecensione(email,voto,tabella)){
                        dati.put("result", "Recensione effettuata!");
                    }
                    
                    String ScriviJson = js.ScriviJson(dati);
                    ServletOutputStream outputStream = res.raw().getOutputStream();
                    outputStream.print(ScriviJson);
                    outputStream.flush();
                    return "ok"; 
                });
                get("/prelevaMediaVoto", (req, res) -> {
                    
                    Map dati = new HashMap();
                    String email =  req.queryParams("email");
                    String tabella =  req.queryParams("tabella");
                      
                    float value = database.prelevaMediaVoto(email,tabella);
                    if(value >= 0){
                        dati.put("result", "Voto prelevato!");
                        dati.put("risultato", ""+value);
                    }
                    
                    String ScriviJson = js.ScriviJson(dati);
                    ServletOutputStream outputStream = res.raw().getOutputStream();
                    outputStream.print(ScriviJson);
                    outputStream.flush();
                    return "ok"; 
                });
            });
        });
    }
}
