package SchedaForYou;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class AlgoritmoDue {
    
    public List<String> schedaDue(Map<String, String> dati){
     
        //MAP CHE CONTIENE (NOME ESERCIZI, PATH) NON RANDOM
        Map esercizi = new HashMap();
        //CREO ARRAY CHE CONTERRA' TUTTI E 15 GLI ESERCIZI
        List<String> eser = new ArrayList<String>();
        ////CREO ARRAY CHE CONTERRA' TUTTI E 15 PATH CORRISPONDENTI GLI ESERCIZI
        List<String> eser_path = new ArrayList<String>();
        
        //PRELEVA LE CHIAVI CHE VANNO DA ("0") A ("15") DAL MAP DATI
        for (String key : dati.keySet()) {
            for (int i = 1; i <= 15; i++) {
                //SE LA CHIAVE E' UGUALE AL VALORE DELL'INT I.              KEY =    "1"== 1     = INT I
                if (key.equals(String.valueOf(i))) {             
                    //AGGIUNGIAMO ALL ARRAYLIST ESER GLI ESERCIZI DAL 1 AL 15
                    eser.add(dati.get(key));
                    //AGGIUNGIAMO ALL ARRAYLIST ESER_PATH I PATH DELLE IMMAG. DI OGNI ESERCIZIO
                    eser_path.add(dati.get(key+"_path"));  
                    
                    //HASHMAP CONTENENTE GLI ESERCIZI E I PATH ("NOME_ESERCIZIO","PATH")  NON ANCORA RANDOM
                    esercizi.put(dati.get(key), dati.get(key+"_path"));   //[BURPEEE, C:// ]
                }
            }
        }    
        
        //MAP CHE CONTIENE (NOME STRETCHING, PATH) NON RANDOM
        Map strex = new HashMap();
        //ARRAY CHE CONTIENE TUTTI E 6 GLI STRETCHING
        List<String> stretching = new ArrayList<String>();
        Random random0 = new Random();
        List<String> numeri = new ArrayList<String>();          //[1,2]
        numeri.add("1");
        numeri.add("2");
        //PRELEVA LE CHIAVI CHE VANNO DA ("5.1,5.2,10.1,10.2,15.1,15.2") DAL MAP DATI
        for (int i = 5; i <= 16 ; i=i+5) {
                //STRING CONTENENTE NUMERO 1 O 2
                String rand0 = numeri.get(random0.nextInt(numeri.size()));      //"1" O "2"
                stretching.add(dati.get(i+"."+rand0));                          //5.1 O 5.2    //10.1 O 10.2    //15.1 O 15.2 
                //HASHMAP CONTENENTE GLI STRETCHING E I PATH ("NOME_STRECTCHING","PATH")  NON ANCORA RANDOM
                strex.put(dati.get(i+"."+rand0), dati.get(i+"."+rand0+"_path"));
        }
        
        
        
        //ARRAY CHE CONTIENE I 9 ESERCIZI RANDOM
        List<String> esercizi_random = new ArrayList<String>();
        Random random = new Random();
        //PRELEVA 9 ESERCIZI DIVERSI DALL'ARRAY CHE CONTIENE 15 ESERCIZI
        for(int i=0; i < 50; i++){
            if (esercizi_random.size() < 9) {
                //SINGOLO ESERCIZI
                String ran = eser.get( random.nextInt(eser.size()) );
                //SE IL SINGTOLO ESERCIZI ESISTE GIA'.      EVITA LA RIPETIIZIONE DI ESERCIZI UGUALI
                if (!esercizi_random.contains(ran))   { 
                    //SE NON ESISTE AGGIUNGILO
                    esercizi_random.add(ran);  
                }
            }
        }
        
        //ARRAY CHE CONTIENE I 3 STRETCHING RANDOM
        List<String> stretching_random = new ArrayList<String>();
        Random random1 = new Random();
        //PRELEVA 3 STRETCHING DIVERSI DALL'ARRAY CHE CONTIENE 3 STRETCHING
        for(int i=0; i < 50; i++){
            if (stretching_random.size() < 3) {
                //STRING CONTENENTE IL VALORE DELLA CHIAVE RANDOM DELL'ARRAY STRETCHING
                String rand = stretching.get( random1.nextInt(stretching.size()) );
                //SE IL SINGTOLO STRETCHING ESISTE GIA'.      EVITA LA RIPETIIZIONE DI STRETCHING UGUALI
                if (!stretching_random.contains(rand))   { 
                    //SE NON ESISTE AGGIUNGILO
                    stretching_random.add(rand); 
                    
                }
            }
        }
   
        //PER OTTENERE I PATH DA INSERIRE NELL'ARRAY LIST SCHEDA ALLENAMENTO UTILIZZO GLI HASHMAP ESERCIZI E STREX
        //CHE VENGONO ELABORATI NELLE ISTRUZIONI SOPRA.
        
        List<String> schedaAllenamento = new ArrayList<String>();

        for (String nome_esercizio : esercizi_random) {
            //INSERISCO NOME DELL'ESERCIZIO ALL'INTERNO DELL'ARRAYLIST SCHEDA ALLENAMENTO
            schedaAllenamento.add(nome_esercizio);
            //INSERISCO IL PATH CORRISPONDENTE AL NOME DELL'ESERCIZIO ALL'INTERNO DELL'ARRAYLIST SCHEDA ALLENAMENTO
            schedaAllenamento.add((String)esercizi.get(nome_esercizio));                        // [BUPREEE, c://]
        }
         
        for (String nome_stretching : stretching_random) {
            //INSERISCO NOME DELLO STRETCHING ALL'INTERNO DELL'ARRAYLIST SCHEDA ALLENAMENTO
            schedaAllenamento.add(nome_stretching);
            //INSERISCO IL PATH CORRISPONDENTE AL NOME DELLO STRETCHING ALL'INTERNO DELL'ARRAYLIST SCHEDA ALLENAMENTO
            schedaAllenamento.add((String)strex.get(nome_stretching));                  //[ALLUNGAMENTO BICIPITI, C://]
        }
         
        return schedaAllenamento;
    }
    
}


