package SchedaForYou;

import Impostazioni.Xmlpars;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AlgoritmoUno {
    
    private Xmlpars parser4;
    private Xmlpars parser5;
    private Xmlpars parser6;
    
    Misure misura = new Misure();
    
    Xmlpars parser3 = new Xmlpars("misure.save");
    
    public int petto= (int) (misura.getPetto() *100);
    public int petto_inter = (int)  (misura.getPetto_inter() *100);
    public int petto_f = (int) ( misura.getPetto_f() *100);
      
    public int bici = (int) (misura.getBicipite() *100 );
    public int bici_inter = (int) (misura.getBicipite_inter() *100);
    public int bici_f = (int) (misura.getBicipite_f() *100);

    public int ava = (int) (misura.getAvambracci() *100 );
    public int ava_inter = (int) (misura.getAvambracci_inter()*100);
    public int ava_f = (int) (misura.getAvambracci_f()*100);

    public int cosce = (int) (misura.getCosce()*100) ;
    public int cosce_inter = (int) (misura.getCosce_inter()*100);
    public int cosce_f = (int) (misura.getCosce_f()*100);

    public int polpa = (int) (misura.getPolpacci()*100) ;
    public int polpa_inter = (int) (misura.getPolpacci_inter()*100);
    public int polpa_f = (int) (misura.getPolpacci_inter()*100);
    
    
    public Map schedaUno(){
        
        double percentuale_petto;
        double percentuale_bicipite;
        double percentuale_avambraccio;
        double percentuale_cosce ;
        double percentuale_polpacci ;
        
       
        //CONTROLLO PER VERIFICARE SE LE PERCETUALI DI OGNI PARTE DEL CORPO SONO AL 100%
        if(petto_inter == petto_f) {
             percentuale_petto =  1 ;
        }else{
            //CALCOLO PER OTTENRE LA PERCENTUALE ALL'INTERNO DELLA PROGRESS BAR
            double n1 = (petto_f - petto_inter);
            double d1 = (petto_f - petto);
            percentuale_petto = (1 - (n1/d1));
        }
        
        if (bici_inter == bici_f) {
             percentuale_bicipite =  1 ;
        }else{
             double n2 = (bici_f - bici_inter);
             double d2 = (bici_f - bici);
             percentuale_bicipite = (1 - (n2/d2));
        }
        if (ava_inter == ava_f) {
            percentuale_avambraccio =  1 ;
        }else{
            double n3 = (ava_f - ava_inter);
            double d3 = (ava_f - ava);
            percentuale_avambraccio = (1 - (n3/d3));
        }
        if (cosce_inter == cosce_f) {
             percentuale_cosce =  1 ;
        }else{
            double n4 = (cosce_f - cosce_inter);
            double d4 = (cosce_f - cosce);
            percentuale_cosce = (1 - (n4/d4)); 
        }
        if (polpa_inter == polpa_f) {
            percentuale_polpacci =  1 ;
        }else{
            double n5 = (polpa_f - polpa_inter);
            double d5 = (polpa_f - polpa);
            percentuale_polpacci = (1 - (n5/d5));
        }      
        //
       
        //ARRAY CONTENETE TUTTE LE PERCENTUALI DELLE VARIE PARTI DEL CORPO
        double[] nums={percentuale_petto, percentuale_bicipite, percentuale_avambraccio, percentuale_cosce, percentuale_polpacci};
        //METODO PER ORDINARE L'ARRAY IN ORDINE CRESCENTE
        Arrays.sort(nums);

        //CICLO TUTTO L'ARRAY NUMS
        for (int i = 0; i < nums.length; i++) {
            //*************************************************************************************************************************************************************************************************************************************************

            //1° GRUPPO ESERCIZI 
            
            if (nums[0] == nums[i]) {   
                //CONTROLLO A QUALE VARIABILE DELL'ARRAY COINCIDE IL NUMERO PIù PICCOLO DELL'ARRAY ORDINATO    
                //IN BASE A QUALE PARTE DEL CORPO RISULTA MENO ALLENATA VERRANNO SOMMINISTRATI GLI ESERCIZI CORRISPONDENTI 
                if (nums[i] == percentuale_petto) {
                    parser4 = new Xmlpars("esercizi/petto.save");           
                }else if (nums[i] == percentuale_bicipite) {
                     parser4 = new Xmlpars("esercizi/bicipiti.save");
                }else if (nums[i] == percentuale_avambraccio) {
                     parser4 = new Xmlpars("esercizi/avambracci.save");
                }else if (nums[i] == percentuale_cosce) {
                     parser4 = new Xmlpars("esercizi/cosce.save");
                }else if (nums[i] == percentuale_polpacci) {
                     parser4 = new Xmlpars("esercizi/polpacci.save");
                }
            }
            
            
            //*************************************************************************************************************************************************************************************************************************************************
            //2° GRUPPO ESERCIZI 
            
            //1°CASO - IN CUI IL SECONDO NUMERO PIù PICCOLO DELL'ARRAY E' GIA' AL 100%, AUTOMATICAMENTE BISOGNA ALLENARE SOLTANTO LA PARTE DEL CORPO CORRISPONDENTE AL NUMERO PIU' PICCOLO DELL ARRAY
            
            //CONTROLLO SE IL SECONDO NUMERO PIU' PICCOLO E' GIA' AL 100%
            //NEL CASO IN CUI LO FOSSE, VERRANNO SCELTI ALTRI ESERCIZI DELLA PARTE DEL CORPO PIU'PICCOLA OVVERO IL PRIMO ELEMENTO DELL'ARRAY
            if (nums[1] == 1){ 
                
                nums[1] = nums[0];
                if (nums[1] == nums[i]) {   
                                
                    if (nums[i] == percentuale_petto) {
                        parser5 = new Xmlpars("esercizi/petto.save");
                    }else if (nums[i] == percentuale_bicipite) {
                         parser5 = new Xmlpars("esercizi/bicipiti.save");
                    }else if (nums[i] == percentuale_avambraccio) {
                         parser5 = new Xmlpars("esercizi/avambracci.save");
                    }else if (nums[i] == percentuale_cosce) {
                         parser5 = new Xmlpars("esercizi/cosce.save");
                    }else if (nums[i] == percentuale_polpacci) {
                         parser5 = new Xmlpars("esercizi/polpacci.save");
                    }
                }
                
            }else{
                //2°CASO
                //NEL CASO IN CUI IL SECONDO NUMERO PIU' PICCOLO DELL ARRAY NON E' AL 100%, VERRANNO SCELTI ESERCIZI RELATIVI A QUELLA PARTE DEL CORPO
                if(nums[1] == nums[i]){
                
                    // CONTROLLO QUAL'E' LA PARTE DEL CORPO CHE VA ALLENATA
                    if (nums[i] == percentuale_petto) {
                        parser5 = new Xmlpars("esercizi/petto.save");
                    }else if (nums[i] == percentuale_bicipite) {
                         parser5 = new Xmlpars("esercizi/bicipiti.save");
                    }else if (nums[i] == percentuale_avambraccio) {
                         parser5 = new Xmlpars("esercizi/avambracci.save");
                    }else if (nums[i] == percentuale_cosce) {
                         parser5 = new Xmlpars("esercizi/cosce.save");
                    }else if (nums[i] == percentuale_polpacci) {
                         parser5 = new Xmlpars("esercizi/polpacci.save");
                    }
                }
            }   
            
            
            //*************************************************************************************************************************************************************************************************************************************************
            //3° GRUPPO ESERCIZI
            
            //1°CASO - IN CUI IL TERZO NUMERO PIù PICCOLO DELL'ARRAY E' GIA' AL 100%, AUTOMATICAMENTE BISOGNA ALLENARE SOLTANTO LA PARTE DEL CORPO CORRISPONDENTE AL NUMERO PIU' PICCOLO DELL ARRAY
            
            //CONTROLLO SE IL TERZO NUMERO PIU' PICCOLO E' GIA' AL 100%
            //NEL CASO IN CUI LO FOSSE, VERRANNO SCELTI ALTRI ESERCIZI DELLA PARTE DEL CORPO PIU'PICCOLA OVVERO IL PRIMO ELEMENTO DELL'ARRAY
            if (nums[2] == 1){
                
                nums[2] = nums[0];
                if (nums[2] == nums[i]) {   
                                
                    if (nums[i] == percentuale_petto) {
                        parser6 = new Xmlpars("esercizi/petto.save");
                    }else if (nums[i] == percentuale_bicipite) {
                         parser6 = new Xmlpars("esercizi/bicipiti.save");
                    }else if (nums[i] == percentuale_avambraccio) {
                         parser6 = new Xmlpars("esercizi/avambracci.save");
                    }else if (nums[i] == percentuale_cosce) {
                         parser6 = new Xmlpars("esercizi/cosce.save");
                    }else if (nums[i] == percentuale_polpacci) {
                         parser6 = new Xmlpars("esercizi/polpacci.save");
                    }
                }
            }else{
                //2°CASO
                //NEL CASO IN CUI IL TERZO NUMERO PIU' PICCOLO DELL ARRAY NON E' AL 100%, VERRANNO SCELTI ESERCIZI RELATIVI A QUELLA PARTE DEL CORPO
                if(nums[2] == nums[i]){
                    
                    // CONTROLLO QUAL'E' LA PARTE DEL CORPO CHE VA ALLENATA
                    if (nums[i] == percentuale_petto) {
                        parser6 = new Xmlpars("esercizi/petto.save");
                    }else if (nums[i] == percentuale_bicipite) {
                         parser6 = new Xmlpars("esercizi/bicipiti.save");
                    }else if (nums[i] == percentuale_avambraccio) {
                         parser6 = new Xmlpars("esercizi/avambracci.save");
                    }else if (nums[i] == percentuale_cosce) {
                         parser6 = new Xmlpars("esercizi/cosce.save");
                    }else if (nums[i] == percentuale_polpacci) {
                         parser6 = new Xmlpars("esercizi/polpacci.save");
                    }
                }
            }   
        }
        
            //*************************************************************************************************************************************************************************************************************************************************

        
        
        //CREO UN HASHMAP CONTENETE GLI ESERCIZI DEL 1°GRUPPO, OVVERO LA PARTE DEL CORPO PIU' PICCOLA
        Map ese1 = new HashMap();
        ese1.put("1", parser4.getElement("primo"));
        ese1.put("1_path", parser4.getElement("path_primo"));
        ese1.put("2", parser4.getElement("secondo"));
        ese1.put("2_path", parser4.getElement("path_secondo"));
        ese1.put("3", parser4.getElement("terzo"));
        ese1.put("3_path", parser4.getElement("path_terzo"));
        ese1.put("4", parser4.getElement("quarto"));
        ese1.put("4_path", parser4.getElement("path_quarto"));
        ese1.put("5", parser4.getElement("quinto"));
        ese1.put("5_path", parser4.getElement("path_quinto"));
        ese1.put("5.1", parser4.getElement("sesto"));
        ese1.put("5.1_path", parser4.getElement("path_sesto"));
        ese1.put("5.2", parser4.getElement("settimo"));
        ese1.put("5.2_path", parser4.getElement("path_settimo"));
        
        //CREO UN HASHMAP CONTENETE GLI ESERCIZI DEL 2°GRUPPO, OVVERO LA SECONDA PARTE DEL CORPO PIU' PICCOLA
        //NEL CASO IN CUI LA PARTE DEL CORPO DEL 2°GRUPPO E' GIA' ALLENATA, VERRANO SCELTI GLI ESERCIZI DELLA PARTE DEL CORPO PIU' PICCOLA
        Map ese2 = new HashMap();
        ese2.put("6", parser5.getElement("primo"));
        ese2.put("6_path", parser5.getElement("path_primo"));
        ese2.put("7", parser5.getElement("secondo"));
        ese2.put("7_path", parser5.getElement("path_secondo"));
        ese2.put("8", parser5.getElement("terzo"));
        ese2.put("8_path", parser5.getElement("path_terzo"));
        ese2.put("9", parser5.getElement("quarto"));
        ese2.put("9_path", parser5.getElement("path_quarto"));
        ese2.put("10", parser5.getElement("quinto"));
        ese2.put("10_path", parser5.getElement("path_quinto"));
        ese2.put("10.1", parser5.getElement("sesto"));
        ese2.put("10.1_path", parser5.getElement("path_sesto"));
        ese2.put("10.2", parser5.getElement("settimo"));
        ese2.put("10.2_path", parser5.getElement("path_settimo"));
        
        //CREO UN HASHMAP CONTENETE GLI ESERCIZI DEL 3°GRUPPO, OVVERO LA TERZA PARTE DEL CORPO PIU' PICCOLA
        //NEL CASO IN CUI LA PARTE DEL CORPO DEL 3°GRUPPO E' GIA' ALLENATA, VERRANO SCELTI GLI ESERCIZI DELLA PARTE DEL CORPO PIU' PICCOLA
        Map ese3 = new HashMap();
        ese3.put("11", parser6.getElement("primo"));
        ese3.put("11_path", parser6.getElement("path_primo"));
        ese3.put("12", parser6.getElement("secondo"));
        ese3.put("12_path", parser6.getElement("path_secondo"));
        ese3.put("13", parser6.getElement("terzo"));
        ese3.put("13_path", parser6.getElement("path_terzo"));
        ese3.put("14", parser6.getElement("quarto"));
        ese3.put("14_path", parser6.getElement("path_quarto"));
        ese3.put("15", parser6.getElement("quinto"));
        ese3.put("15_path", parser6.getElement("path_quinto"));
        ese3.put("15.1", parser6.getElement("sesto"));
        ese3.put("15.1_path", parser6.getElement("path_sesto"));
        ese3.put("15.2", parser6.getElement("settimo"));
        ese3.put("15.2_path", parser6.getElement("path_settimo"));
        
        /// CREO UN HASHAMP CHE CONTERRA' TUTTI E 3 GLI HASHMAP SOPRA CREATI, COMPOSTI DAGLI ESERCIZI RITENUTI NECESSARI
        Map total = new HashMap();
        
        //AGGIUNGO IL PRIMO HASHMAP
        total.putAll(ese1);
        //AGGIUNGO IL SECONDO HASHMAP
        total.putAll(ese2);
        //AGGIUNGO IL TERZO HASHMAP
        total.putAll(ese3);
        ///
        
        return total; 
    }
   
    
}
