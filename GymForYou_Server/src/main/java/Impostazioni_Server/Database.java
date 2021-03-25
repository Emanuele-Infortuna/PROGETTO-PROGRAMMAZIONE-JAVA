package Impostazioni_Server;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Database {
    
    private Statement st = null;
    private String username, password, db, indirizzo;
    private Integer porta;
    private MysqlDataSource dataSource = new MysqlDataSource();
    Connection conn;
    
     /**
     *
     * @param dataSource
     */
    public Database(MysqlDataSource dataSource) {
        this.dataSource = dataSource;
    }
    
    /**
     *
     * @param url
     * @param username
     * @param password
     */
    
    public Database(String indirizzo, Integer porta, String username, String password, String db) {
        
        this.indirizzo=indirizzo;
        this.porta= porta;        
        this.username=username;
        this.password=password;
        this.db=db;
           
    }
    //************************************************************************************************************************************************************************************************************************
    //                              LOGIN E REGISTRAZIONE
    //************************************************************************************************************************************************************************************************************************
    
    //METODO CHE RESTITUISCE IL TIPO DI PERSONA CHE STA EFFETTUANDO IL LOGIN  (TAB :CREDENZIALI)
    public String ControlloEmail(Map dati){
        String risultato = "";
        try {
            PreparedStatement prepareStatement = conn.prepareStatement("SELECT type FROM " + dati.get("tabella") + " WHERE email = ? AND password = MD5(?)");
            prepareStatement.setString(1, (String) dati.get("email"));
            prepareStatement.setString(2, (String) dati.get("password"));
            ResultSet executeQuery = prepareStatement.executeQuery();
            executeQuery.last();
            
            if(executeQuery.getRow() > 0) {
                risultato = executeQuery.getString("type");
            }
 
        } catch(SQLException e) {
            System.out.println("errore query: " + e);
        }
        return risultato ;
    }
    
    //METODO CHE RESTITUISCE TRUE O FALSE NEL CASO IN CUI CI SIANO DUE EMAIL UGUALI NELLA TABELLA  (TAB :CREDENZIALI)
    public Boolean EmailDoppia(Map dati){
        
        boolean risultato = true;
        try {
            PreparedStatement prepareStatement = conn.prepareStatement("SELECT * FROM " + dati.get("tabella") + " WHERE email = ? ");
            prepareStatement.setString(1, (String) dati.get("email"));
            ResultSet executeQuery = prepareStatement.executeQuery();
            executeQuery.last();
            
            if(executeQuery.getRow() > 0) {
                risultato = true;
            }else{
                risultato = false;
            }
 
        } catch(SQLException e) {
            System.out.println("errore query: " + e);
        }
        return risultato;
    }
    
    //METODO CHE INSERISCE EMAIL E PASSWORD NELLA TABELLA CREDENZIALI E TABELLA UTENTE  (TAB :CREDENZIALI)
    public void Registrazione(Map dati){
        try {
            //INSERT INTO CREDENZIALI
            PreparedStatement prepareStatement = conn.prepareStatement("INSERT INTO " + dati.get("tabella") + "(email, password)  VALUES (?,MD5(?)) ");
            prepareStatement.setString(1, (String) dati.get("email"));
            prepareStatement.setString(2, (String) dati.get("password"));
            
            //INSERT INTO UTENTE
            PreparedStatement prep = conn.prepareStatement("INSERT INTO " + dati.get("tabella1") + "(nome, cognome, email, genere, peso, altezza)  VALUES (?,?,?,?,?,?) ");
            prep.setString(1, (String) dati.get("nome"));
            prep.setString(2, (String) dati.get("cognome"));
            prep.setString(3, (String) dati.get("email"));
            prep.setString(4, (String) dati.get("genere"));
            prep.setString(5, (String) dati.get("peso"));
            prep.setString(6, (String) dati.get("altezza"));
            
            prepareStatement.executeUpdate();
            prep.executeUpdate();
            
        } catch(SQLException e) {
            System.out.println("Impossibile effettuare la registrazione: " + e);
        }
    }
    
    //************************************************************************************************************************************************************************************************************************
    //                              MODIFICHE ACCOUNT
    //************************************************************************************************************************************************************************************************************************
    
    //METODO CHE VERIFICA SE LA PASSWORD INSERITA (VECCHIA PASSWORD) DALL'UTENTE CORRISPONDE A QUELLA DELLA TABELLA CREDENZIALI INSERITA ALLA MOMENTO DELLA REGISTRAZIONE
    //SE LE DUE PASSWORD CORRISPONDONO VIENE MODIFICATA LA PASSWORD PRESENTE NELLA TABELLA CREDENZIALI
    public String verificaModificaPassword(Map dati){
        
        String msg = "Password modificata!";
        try {
            //INSERT INTO CREDENZIALI
            PreparedStatement prepareStatement = conn.prepareStatement("SELECT password FROM " + dati.get("tabella") + " WHERE email = ?");
            prepareStatement.setString(1, (String) dati.get("email"));
            ResultSet executeQuery = prepareStatement.executeQuery();
            executeQuery.last();
            //prepareStatement.executeUpdate();
            if(executeQuery.getRow() > 0) {
                if (executeQuery.getString("password").equals(dati.get("vecchiapass"))) {
                    PreparedStatement prep = conn.prepareStatement("UPDATE " + dati.get("tabella") + " SET password = MD5(?) WHERE email = ? ");

                    prep.setString(1, (String) dati.get("nuovapass"));
                    prep.setString(2, (String) dati.get("email"));
                    prep.executeUpdate();
                    
                }else{
                    msg="errore";
                }
            }else{
                msg="Password non coincidono";
            }
        } catch(SQLException e) {
            System.out.println("Impossibile effettuare la registrazione: " + e);
            msg= "Modifica fallita!";
        }
        return msg;
    }
    
    //METODO USATO PER MODIFICARE IL PESO E L'ALTEZZA DI UN UTENTE
    public void modificaPesoAltezza(Map dati){
        try {
            PreparedStatement prep = conn.prepareStatement("UPDATE " + dati.get("tabella") + " SET peso=?, altezza=? WHERE email = ? ");
            prep.setString(1, (String) dati.get("pesonuovo"));
            prep.setString(2, (String) dati.get("altezzanuovo"));
            prep.setString(3, (String) dati.get("email"));
            prep.executeUpdate();
            
        }catch(SQLException e) {
            System.out.println("Impossibile modificare peso e/o altezza: " + e);
        }
    }
    
    //************************************************************************************************************************************************************************************************************************
    //                              ADMIN METHODS
    //************************************************************************************************************************************************************************************************************************
    
    //METODO USATO NELLA DASHBOARD ADMIN PER ELIMINARE GLI ACCOUNT DEI MEIDICI O DEI TRAINER
    public void eliminaAccountAdmin(Map dati){
        try {
            
            PreparedStatement prep1 = conn.prepareStatement("DELETE from `trainer`  WHERE email = ?");
            prep1.setString(1, (String) dati.get("email"));
            prep1.executeUpdate();
            
            PreparedStatement prep2 = conn.prepareStatement("DELETE from `dottore`  WHERE email = ?");
            prep2.setString(1, (String) dati.get("email"));
            prep2.executeUpdate();
            
            PreparedStatement prep3 = conn.prepareStatement("DELETE from `credenziali`  WHERE email = ?");
            prep3.setString(1, (String) dati.get("email"));
            prep3.executeUpdate();
            
        } catch(SQLException e) {
            System.out.println("Impossibile emilinare account: " + e);
        }
    }
    
    //METODO USATO NELLA DASHBOARD ADMIN PER INSERIRE UN NUOVO ACCOUNT  MEIDICO O  TRAINER
    public void inserisciAccount(Map dati){
        try {
            
            PreparedStatement prepareStatement = conn.prepareStatement("INSERT INTO " + dati.get("tabella") + "(email, password,type)  VALUES (?,MD5(?),?) ");
            prepareStatement.setString(1, (String) dati.get("email"));
            prepareStatement.setString(2, (String) dati.get("password"));
            prepareStatement.setString(3, (String) dati.get("genere"));
            
            if (dati.get("genere").equals("med")) {
                PreparedStatement prep = conn.prepareStatement("INSERT INTO " + dati.get("tabella2") + "(email, nome, cognome )  VALUES (?,?,?) ");
                prep.setString(1, (String) dati.get("email"));
                prep.setString(2, (String) dati.get("nome"));
                prep.setString(3, (String) dati.get("cognome"));
                prepareStatement.executeUpdate();
                prep.executeUpdate();
                
            }else if (dati.get("genere").equals("trn")) {
                PreparedStatement prep = conn.prepareStatement("INSERT INTO " + dati.get("tabella1") + "(email, nome, cognome )  VALUES (?,?,?)  ");
                prep.setString(1, (String) dati.get("email"));
                prep.setString(2, (String) dati.get("nome"));
                prep.setString(3, (String) dati.get("cognome"));

                prepareStatement.executeUpdate();
                prep.executeUpdate();
            }
            
        } catch(SQLException e) {
            System.out.println("Impossibile effettuare la registrazione: " + e);
        }
    }
    
    //METODO USATO NELLA DASHBOARD ADMIN PER MOSTRARE TUTTI I MEDICI E TRAINER REGISTRATI (TAB:MEDICI E TAB1: TRAINER)
    public ArrayList visualizzaRighe(String tabella,String tabella_uno){
        
        Map result = new HashMap();
        ArrayList<String> lista = new ArrayList<String>();
        
        try {
            PreparedStatement prepareStatement = conn.prepareStatement("SELECT email,nome,cognome,voto FROM " + tabella +" ");
            ResultSet rs = prepareStatement.executeQuery();
            while (rs.next()) {
                String email = rs.getString(1);
                String nome = rs.getString(2);
                String cognome = rs.getString(3);
                String voto = rs.getString(4);
                lista.add(email);
                lista.add(nome);
                lista.add(cognome);
                lista.add(voto);
                lista.add("Medico");
            }
            
            PreparedStatement prep = conn.prepareStatement("SELECT email,nome,cognome,voto FROM " + tabella_uno +" ");
            ResultSet rs1 = prep.executeQuery();
            while (rs1.next()) {
                String email = rs1.getString(1);
                String nome = rs1.getString(2);
                String cognome = rs1.getString(3);
                String voto = rs1.getString(4);
                lista.add(email);
                lista.add(nome);
                lista.add(cognome);
                lista.add(voto);
                lista.add("Trainer");
            }
            
        } catch(SQLException e) {
            System.out.println("Dati Questionario errore!");
        }
        return lista;
    }
    
    //************************************************************************************************************************************************************************************************************************
    //                              DOTTORE METHODS
    //************************************************************************************************************************************************************************************************************************
    
    //METODO USATO NELLA DASHBOARD DOTTORE PER PRELEVARE LE RISPOSTE DEL QUESTIONARIO DI UN DETERMINATO UTENTE
    //(TAB: QUESTIONARIO)
    public Map prelevaRisposte(String email, String tabella){
        
        Map result = new HashMap();
        try {
            PreparedStatement prepareStatement = conn.prepareStatement("SELECT * FROM " + tabella +" WHERE email = ?");
            prepareStatement.setString(1, email);
            ResultSet executeQuery = prepareStatement.executeQuery();
            executeQuery.last();
            
            if(executeQuery.getRow() > 0) {
                result.put("Email", executeQuery.getString("email"));
                result.put("prima", executeQuery.getString("prima"));
                result.put("seconda", executeQuery.getString("seconda"));
                result.put("terza", executeQuery.getString("terza"));
                result.put("quarta", executeQuery.getString("quarta"));
                result.put("quinta", executeQuery.getString("quinta"));
                result.put("sesta", executeQuery.getString("sesta"));
                result.put("settima", executeQuery.getString("settima"));
                result.put("ottava", executeQuery.getString("ottava"));
                result.put("nona", executeQuery.getString("nona"));
                result.put("decima", executeQuery.getString("decima"));
                result.put("undicesima", executeQuery.getString("undicesima"));
                result.put("dodicesima", executeQuery.getString("dodicesima"));
                result.put("tredicesima", executeQuery.getString("tredicesima"));
            }
        } catch(SQLException e) {
            System.out.println("Risposte questionario prelevate sbagliate!");
        }
        return result;
    }
    
    //METODO USATO NELLA DASHBOARD DEL DOTTORE PER MOSTRARE GLI UTENTI CHE HANNO COMPILATO IL QUESTIONARIO 
    public ArrayList visualizzaUtenti(String tabella){
        
        Map result = new HashMap();
        ArrayList<String> lista = new ArrayList<String>();
        
        try {
            PreparedStatement prepareStatement = conn.prepareStatement("SELECT * FROM " + tabella +" WHERE esito='vuoto'");
            ResultSet rs = prepareStatement.executeQuery();
            while (rs.next()) {
                String email = rs.getString(1);
                lista.add(email);
            }
        } catch(SQLException e) {
            System.out.println("Dati Questionario errore!");
        }
        return lista;
    }
    
    //METODO USATO PER MODIFICARE L'ESITO DEL QUESTIONARIO 
    public void esito(Map dati){
        try {
            
            //MODIFICA DENTRO TABELLA QUESTIONARIO
            PreparedStatement prepareStatement = conn.prepareStatement("UPDATE " + dati.get("Tabella1") + " SET esito=?  WHERE email = ? ");
            prepareStatement.setString(1, (String) dati.get("esito"));
            prepareStatement.setString(2, (String) dati.get("email"));
            prepareStatement.executeUpdate();
  
            //MODIFICA DENTRO TABELLA UTENTE
            PreparedStatement prep = conn.prepareStatement("UPDATE " + dati.get("Tabella") + " SET esito=? WHERE email = ? ");
            prep.setString(1, (String) dati.get("esito"));
            prep.setString(2, (String) dati.get("email"));
            prep.executeUpdate();
          
        } catch(SQLException e) {
            System.out.println("Impossibile modificare il campo esito: " + e);
        }
    }
    
    //************************************************************************************************************************************************************************************************************************
    //                              UTENTE METHODS
    //************************************************************************************************************************************************************************************************************************
    
    //METODO USATO PER ELIMNARE UN ACCOUNT UTENTE
    public void eliminaAccount(Map dati){
        try {
            PreparedStatement prep1 = conn.prepareStatement("DELETE from `questionario`  WHERE email = ?");
            prep1.setString(1, (String) dati.get("email"));
            prep1.executeUpdate();
            
            PreparedStatement prep2 = conn.prepareStatement("DELETE from `misure`  WHERE email = ?");
            prep2.setString(1, (String) dati.get("email"));
            prep2.executeUpdate();
            
            PreparedStatement prep3 = conn.prepareStatement("DELETE from `utente`  WHERE email = ?");
            prep3.setString(1, (String) dati.get("email"));
            prep3.executeUpdate();
            
            PreparedStatement prep4 = conn.prepareStatement("DELETE from `credenziali`  WHERE email = ?");
            prep4.setString(1, (String) dati.get("email"));
            prep4.executeUpdate();
            
        } catch(SQLException e) {
            System.out.println("Impossibile emilinare account: " + e);
        }
    }
    
    //METODO USATO PER INVIARE LE RISPOSTE DEL QUESTIONARIO AL DB
    public void inviaQuestionario(Map dati){
        try {
            //MODIFICA IL CAMPO QUESTIONARIO DELLA TABELLA UTENTE
            PreparedStatement prepare = conn.prepareStatement("UPDATE  utente SET questionario = 'si' WHERE email= ?  ");
            prepare.setString(1, (String) dati.get("email"));
            prepare.executeUpdate();
            
            //INSERISCE LE RISPOSTE DEL QUESTIONARIO NELLA CORRISPONDENTE TABELLA
            PreparedStatement prep = conn.prepareStatement("INSERT INTO " + dati.get("Tabella") + 
                            "(email, prima, seconda, terza, quarta, quinta, sesta, settima, ottava,nona,decima,undicesima,dodicesima,tredicesima)  "
                                    + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            prep.setString(1, (String) dati.get("email"));
            prep.setString(2, (String) dati.get("d1"));
            prep.setString(3, (String) dati.get("d2"));
            prep.setString(4, (String) dati.get("d3"));
            prep.setString(5, (String) dati.get("d4"));
            prep.setString(6, (String) dati.get("d5"));
            prep.setString(7, (String) dati.get("d6"));
            prep.setString(8, (String) dati.get("d7"));
            prep.setString(9, (String) dati.get("d8"));
            prep.setString(10, (String) dati.get("d9"));
            prep.setString(11, (String) dati.get("d10"));
            prep.setString(12, (String) dati.get("d11"));
            prep.setString(13, (String) dati.get("d12"));
            prep.setString(14, (String) dati.get("d13"));
            
            
            prep.executeUpdate();
            
        } catch(SQLException e) {
            System.out.println("Impossibile inviare dati del questionario: " + e);
        }
    }
    
    //************************************************************************************************************************************************************************************************************************
    //                              INSERIMENTO MISURE
    //************************************************************************************************************************************************************************************************************************
    
    //METODO USATO PER SALVARE I VALORI INIZIALI NELLA TABELLA MISURE
    public Map salvaValoriIniziali(String email,String petto,String bicipite,String avambraccio, String cosce, String polpacci, String tabella){

        Map risultato = new HashMap();
        try {
            //UPDATE TABELLA MISURE CON MISURE INIZIALI DI PETTO, ECC..
            PreparedStatement prep = conn.prepareStatement("UPDATE " + tabella + " SET petto_iniz =" + petto + ", bicipite_iniz= " + bicipite + ", avambraccio_iniz= " + avambraccio + ", cosce_iniz= " + cosce + ",polpacci_iniz=" + polpacci + " WHERE email = '"+email +"' ");
            prep.executeUpdate();
            risultato.put("result", "Valori Inseriti");
        } catch(SQLException e) {
            System.out.println("Impossibile inserire i valori iniziali: " + e);
        }
        return risultato;
    }
    
    //METODO USATO PER SALVARE I VALORI INTERMEDI NELLA TABELLA MISURE
    public Map salvaValoriIntermedi(String email,String petto,String bicipite,String avambraccio, String cosce, String polpacci, String tabella){
        
        Map risultato = new HashMap();
        try {
            //UPDATE TABELLA MISURE CON MISURE INTERMEDIE DI PETTO, ECC..
            PreparedStatement prep = conn.prepareStatement("UPDATE " + tabella + " SET petto_inter =" + petto + ", bicipite_inter= " + bicipite + ", avambraccio_inter= " + avambraccio + ", cosce_inter= " + cosce + ",polpacci_inter=" + polpacci + " WHERE email = '"+email +"' ");
            prep.executeUpdate();
            risultato.put("result", "Valori Intermedi Inseriti");
            
        } catch(SQLException e) {
            System.out.println("Impossibile inserire i valori iniziali: " + e);
        }
        return risultato;
    }
    
    //METODO USATO PER MODIFICARE I VALORI DELLE CIRCONFERENZE
    public void modificaCirconferenze(Map dati){
        
        try {
            PreparedStatement prep = conn.prepareStatement("UPDATE " + dati.get("Tabella") + " SET crf_vita = ?, crf_collo=?, crf_fianchi=?, massa_grassa= ? WHERE email = ? ");
            prep.setString(1, (String) dati.get("vita"));
            prep.setString(2, (String) dati.get("collo"));
            prep.setString(3, (String) dati.get("fianchi"));
            prep.setString(4, (String) dati.get("massa_grassa"));
            prep.setString(5, (String) dati.get("email"));
            prep.executeUpdate();
            
        } catch(SQLException e) {
            System.out.println("Impossibile modificare i valori delle circonferenze: " + e);
        }
    }
    
    //METODO USATO PER MODIFICARE I VALORI DELLE CIRCONFERENZE
    public void modificaCrf_Caviglia_Polso(Map dati){
        try {
           
            PreparedStatement prep = conn.prepareStatement("UPDATE " + dati.get("Tabella") + " SET polso = ?, caviglia=?  WHERE email = ? ");
            prep.setString(1, (String) dati.get("polso"));
            prep.setString(2, (String) dati.get("caviglia"));
            prep.setString(3, (String) dati.get("email"));
            prep.executeUpdate();
            
        } catch(SQLException e) {
            System.out.println("Impossibile modificare i valori delle circonferenze: " + e);
        }
    }
    
    //METODO USATO PER INSERIRE MASSA MAGRA NEL DB
    public void inserisciMassaMagra(Map dati){
        try {
            //INSERT INTO UTENTE
            PreparedStatement prep = conn.prepareStatement("UPDATE " + dati.get("Tabella") + " SET massa_magra=? WHERE email = ? ");
            prep.setString(1, (String) dati.get("massaMagra"));
            prep.setString(2, (String) dati.get("email"));
            prep.executeUpdate();
            
        } catch(SQLException e) {
            System.out.println("Impossibile modificare i valori delle circonferenze: " + e);
        }
    }
    
    //METODO USATO PER INSERIRE LE MISURAZIONI FINALI 
    public void inseriscimisure(Map dati){
        try {
            //INSERISCI MISURE PETTO,BICIPITI, .....
            PreparedStatement prepareStatement = conn.prepareStatement("SELECT * FROM " + dati.get("Tabella") +" WHERE email = ?");
            prepareStatement.setString(1, (String) dati.get("email"));
            ResultSet executeQuery = prepareStatement.executeQuery();
            executeQuery.last();
            
            if(executeQuery.getRow() == 0) {
                PreparedStatement prep = conn.prepareStatement("INSERT INTO " + dati.get("Tabella") + "(email,petto_final,bicipite_final,avambraccio_final,cosce_final,polpacci_final) VALUES (?,?,?,?,?,?)  ");
                prep.setString(1, (String) dati.get("email"));
                prep.setString(2, (String) dati.get("petto"));
                prep.setString(3, (String) dati.get("bicipite"));
                prep.setString(4, (String) dati.get("avambraccio"));
                prep.setString(5, (String) dati.get("cosce"));
                prep.setString(6, (String) dati.get("polpacci"));
                prep.executeUpdate();
            
            //CASO IN CUI VENGONO MODIFICATI I VALORI DI POLSO E CAVIGLIA
            }else if (executeQuery.getRow() > 0) {
                
                PreparedStatement prep = conn.prepareStatement("UPDATE  " + dati.get("Tabella") + " SET petto_final = ?,bicipite_final=?, avambraccio_final=?, cosce_final=?, polpacci_final=? WHERE email=?  ");
                prep.setString(1, (String) dati.get("petto"));
                prep.setString(2, (String) dati.get("bicipite"));
                prep.setString(3, (String) dati.get("avambraccio"));
                prep.setString(4, (String) dati.get("cosce"));
                prep.setString(5, (String) dati.get("polpacci"));
                prep.setString(6, (String) dati.get("email"));
                prep.executeUpdate();
            }
        } catch(SQLException e) {
            System.out.println("Impossibile inserire le misure finali: " + e);
        }
    }
    
    //************************************************************************************************************************************************************************************************************************
    //                              PRELEVAMENTO DATI PER XML
    //************************************************************************************************************************************************************************************************************************
    
    //METODO USATO PRELEVARE I DATI DAL DB PER POI SCRIVERE IL FILEXML.SAVE  (TAB: UTENTE)
    public Map PrendiDati(String email, String tabella){
        
        Map result = new HashMap();
        try {
            PreparedStatement prepareStatement = conn.prepareStatement("SELECT * FROM " + tabella +" WHERE email = ?");
            prepareStatement.setString(1, email);
            ResultSet executeQuery = prepareStatement.executeQuery();
            executeQuery.last();
            if(executeQuery.getRow() > 0) {
                result.put("Nome", executeQuery.getString("nome"));
                result.put("Cognome", executeQuery.getString("cognome"));
                result.put("Email", executeQuery.getString("email"));
                result.put("Genere", executeQuery.getString("genere"));
                result.put("Peso", executeQuery.getString("peso"));
                result.put("Altezza", executeQuery.getString("altezza"));
                result.put("Polso", executeQuery.getString("polso"));
                result.put("Caviglia", executeQuery.getString("caviglia"));
                result.put("Circonferenza_Vita", executeQuery.getString("crf_vita"));
                result.put("Circonferenza_Collo", executeQuery.getString("crf_collo"));
                result.put("Circonferenza_Fianchi", executeQuery.getString("crf_fianchi"));
                result.put("Questionario", executeQuery.getString("questionario"));
                result.put("Massa_Grassa", executeQuery.getString("massa_grassa"));
                result.put("Massa_Magra", executeQuery.getString("massa_magra"));
                result.put("Esito_Dottore", executeQuery.getString("esito"));
            }
        } catch(SQLException e) {
            System.out.println("Dati Scritti sul file .save in modo sbagliato!");
        }
        return result;
    }
    
    //METODO USATO PER PRELEVARE MISURE PRESENTI NEL DB E SCRIVERLE NEL FILE MISURE.SAVE
    public Map prelevamisure(String email, String tabella){
        
        Map result = new HashMap();
        try {
            PreparedStatement prepareStatement = conn.prepareStatement("SELECT * FROM " + tabella +" WHERE email = ?");
            prepareStatement.setString(1, email);
            ResultSet executeQuery = prepareStatement.executeQuery();
            executeQuery.last();
            
            if(executeQuery.getRow() > 0) {
                result.put("Email", executeQuery.getString("email"));
                result.put("Petto_Iniziale", executeQuery.getString("petto_iniz"));
                result.put("Bicipite_Iniziale", executeQuery.getString("bicipite_iniz"));
                result.put("Avambraccio_Iniziale", executeQuery.getString("avambraccio_iniz"));
                result.put("Cosce_Iniziale", executeQuery.getString("cosce_iniz"));
                result.put("Polpacci_Iniziale", executeQuery.getString("polpacci_iniz"));
                result.put("Petto_Intermedio", executeQuery.getString("petto_inter"));
                result.put("Bicipite_Intermedio", executeQuery.getString("bicipite_inter"));
                result.put("Avambraccio_Intermedio", executeQuery.getString("avambraccio_inter"));
                result.put("Cosce_Intermedio", executeQuery.getString("cosce_inter"));
                result.put("Polpacci_Intermedio", executeQuery.getString("polpacci_inter"));
                result.put("Petto_Finale", executeQuery.getString("petto_final"));
                result.put("Bicipite_Finale", executeQuery.getString("bicipite_final"));
                result.put("Avambraccio_Finale", executeQuery.getString("avambraccio_final"));
                result.put("Cosce_Finale", executeQuery.getString("cosce_final"));
                result.put("Polpacci_Finale", executeQuery.getString("polpacci_final"));
            }
        } catch(SQLException e) {
            System.out.println("Dati Scritti sul file misure.save in modo sbagliato!");
        }
        return result;
    }
    
//************************************************************************************************************************************************************************************************************************
//                              CONSULTAZIONE
//************************************************************************************************************************************************************************************************************************
    
    //METODO USATO NELLA DASHBOARD ADMIN PER MOSTRARE TUTTI I MEDICI E TRAINER REGISTRATI (TAB:MEDICI E TAB1: TRAINER)
    public ArrayList visualizzaMediciTrainer(String tabella){
        
        ArrayList<String> lista = new ArrayList<String>();
        
        try {
            PreparedStatement prepareStatement = conn.prepareStatement("SELECT email,nome,cognome FROM " + tabella +" ");
            ResultSet rs = prepareStatement.executeQuery();
            while (rs.next()) {
                String email = rs.getString(1);
                String nome = rs.getString(2);
                String cognome = rs.getString(3);
                lista.add(email);
                lista.add(nome);
                lista.add(cognome);
            }
          
            
        } catch(SQLException e) {
            System.out.println("Impossibile prelevare i medici!");
        }
        return lista;
    }
    
    
    public boolean utenteInvia(Map dati){
        
        boolean risultato=true;
        
        try {                                                         
            //INSERISCI MISURE PETTO,BICIPITI, .....  
            String coach = (String) dati.get("coach");
            PreparedStatement prepareStatement = conn.prepareStatement("INSERT INTO consultazione(utente,"+coach+",categoria,domanda) VALUES (?,?,?,?)");
            prepareStatement.setString(1, (String) dati.get("utente"));
            prepareStatement.setString(2, (String) dati.get("emailMedicoTrainer"));
            prepareStatement.setString(3, (String) dati.get("categoria"));
            prepareStatement.setString(4, (String) dati.get("domanda"));
            prepareStatement.executeUpdate();
            
        } catch(SQLException e) {
            System.out.println("Impossibile una domanda " + e);
            risultato=false;
        }
        return risultato;
    }
    
    //METODO USATO NELLA DASHBOARD ADMIN PER MOSTRARE TUTTE LE RISPOSTE
    public ArrayList visualizzaRisposte(String coach, String tabella, String utente){
        
        ArrayList<String> lista = new ArrayList<String>();
        
        try {
            PreparedStatement prepareStatement = conn.prepareStatement("SELECT id,"+coach+",categoria,domanda,risposta,voto FROM " + tabella +" WHERE utente = '"+ utente +"' AND "+ coach+" is not null ");
            ResultSet rs = prepareStatement.executeQuery();
            while (rs.next()) {
                String id = rs.getString(1);
                String dottore = rs.getString(2);
                String categoria = rs.getString(3);
                String domanda = rs.getString(4);
                String risposta = rs.getString(5);
                String voto = rs.getString(6);
                
                lista.add(id);
                lista.add(dottore);
                lista.add(categoria);
                lista.add(domanda);
                lista.add(risposta);
                lista.add(voto);
            }
          
            
        } catch(SQLException e) {
            System.out.println("Impossibile prelevare le risposte!");
        }
        return lista;
    }
    
    public boolean inviaValutazione(Map dati){
        
        boolean risultato=true;
        
        try {
            PreparedStatement prepareStatement = conn.prepareStatement("UPDATE consultazione SET voto= ? WHERE id=?");
            prepareStatement.setString(1, (String) dati.get("valutazione"));
            prepareStatement.setString(2, (String) dati.get("id"));
           
            prepareStatement.executeUpdate();
            
        } catch(SQLException e) {
            System.out.println("Impossibile una domanda " + e);
            risultato=false;
        }
        return risultato;
    }
    
    //METODO USATO PER IL MEDICO PER VISUALIZZARE LE DOMANDE PROPOSTE
    public ArrayList visualizzaDomande(String tabella, String persona, String coach){
        
        ArrayList<String> lista = new ArrayList<String>();
        
        try {
            PreparedStatement prepareStatement = conn.prepareStatement("SELECT id,utente,categoria,domanda,risposta,voto FROM " + tabella +" WHERE " + coach + "= '"+ persona+"' ");
            ResultSet rs = prepareStatement.executeQuery();
            while (rs.next()) {
                String id = rs.getString(1);
                String utente = rs.getString(2);
                String categoria = rs.getString(3);
                String domanda = rs.getString(4);
                String risposta =rs.getString(5);
                String voto = rs.getString(6);
                lista.add(id );
                lista.add(utente);
                lista.add(categoria);
                lista.add(domanda );
                lista.add(risposta);
                lista.add(voto);
            }
          
            
        } catch(SQLException e) {
            System.out.println("Impossibile prelevare le domande!");
        }
        return lista;
    }
    
    public boolean inviaRisposta(Map dati){
        
        boolean risultato=true;
        
        try {
            PreparedStatement prepareStatement = conn.prepareStatement("UPDATE consultazione SET risposta= ? WHERE id=?");
            prepareStatement.setString(1, (String) dati.get("risposta"));
            prepareStatement.setString(2, (String) dati.get("id"));
           
            prepareStatement.executeUpdate();
            
        } catch(SQLException e) {
            System.out.println("Impossibile rispondere a questa domanda!" + e);
            risultato=false;
        }
        return risultato;
    }
  
    
    public float mediaVoti(String email, String tabella, String coach) {
        float i = 0;
        try {
            PreparedStatement prepareStatement = conn.prepareStatement("SELECT AVG(voto) FROM " + tabella + " WHERE "+ coach +" = '"+ email+"' ");
            
            ResultSet executeQuery = prepareStatement.executeQuery();
            
            if(executeQuery.next()) {
                i = executeQuery.getFloat(1);
            }
           
        } catch(SQLException e) {
            System.out.println("Non è stato possibile fare la media. " + e);
        }
        return i;
    }
    
    
    
//************************************************************************************************************************************************************************************************************************
//                            RECENSIONI
//************************************************************************************************************************************************************************************************************************
  
          
    public boolean inviaRecensione(String email, String voto, String tabella){

        boolean risultato=true;
        float votoAttuale = 0;
        String votofinale ="";

        try {
            PreparedStatement prep = conn.prepareStatement("SELECT voto FROM " + tabella + " WHERE email = '"+ email+"' ");
            
            ResultSet rs = prep.executeQuery();
            while (rs.next()) {
                votoAttuale = rs.getFloat(1);
            }
            
            Float votoinserito = Float.parseFloat(voto);
            if (votoAttuale >= 0 ) {
                if (votoAttuale == 0) {
                    votofinale = Float.toString(votoinserito);
                }else{
                    votofinale = Float.toString(((votoAttuale + votoinserito)/2));
                }
            }
            
            PreparedStatement prepareStatement = conn.prepareStatement("UPDATE "+ tabella+ " SET voto= " + votofinale + " WHERE email='" + email + "'");

            prepareStatement.executeUpdate();

        } catch(SQLException e) {
            System.out.println("Impossibile recensire questo medico!" + e);
            risultato=false;
        }
        return risultato;
    }    
          
    public float prelevaMediaVoto(String email, String tabella) {
        float i = 0;
        try {
            PreparedStatement prepareStatement = conn.prepareStatement("SELECT voto FROM " + tabella + " WHERE email = '"+ email+"' ");
            
            ResultSet executeQuery = prepareStatement.executeQuery();
            
            if(executeQuery.next()) {
                i = executeQuery.getFloat(1);
            }
           
        } catch(SQLException e) {
            System.out.println("Non è stato possibile prelevare la media del medico e/o trainer. " + e);
        }
        return i;
    }
          
          
          
          
//************************************************************************************************************************************************************************************************************************
//                            FINE  RECENSIONI
//************************************************************************************************************************************************************************************************************************
    
    public Connection getConnection()  {
         
        dataSource.setServerName(this.indirizzo);
        dataSource.setUser(this.username);
        dataSource.setPassword(this.password);
        dataSource.setDatabaseName(this.db);
        dataSource.setPortNumber(this.porta);
        
        try {
            conn = dataSource.getConnection();
            return conn;
        } catch (SQLException ex) {
           System.out.println(ex);
        }
        return null;
    }
    
        /**
     * @return the dataSource
     */
    public MysqlDataSource getDatasource() {
        return dataSource;
    }

    /**
     * @param dataSource the dataSource to set
     */
    public void setDatasource(MysqlDataSource dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * @return the st
     */
    public Statement getSt() {
        return st;
    }

    /**
     * @param st the st to set
     */
    public void setSt(Statement st) {
        this.st = st;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
}
