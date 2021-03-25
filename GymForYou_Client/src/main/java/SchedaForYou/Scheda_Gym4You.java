package SchedaForYou;

import Autenticazione.Utente;
import Dashboard_Utente.Pannello_Utente;
import Impostazioni.Xml;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Scheda_Gym4You extends javax.swing.JFrame {
    
    Utente utente;     
    Misure misure;
    Xml xml;
    Allenamento_Gym4you allenamento;
    Pannello_Utente panello;
    
    public Scheda_Gym4You() {
        
        initComponents();
        ImageIcon icon = new ImageIcon("src/main/resources/imageicon.png");
        setIconImage(icon.getImage());
        setTitle("GYM FOR YOU");
        utente = new Utente();   
        misure = new Misure();
        
        //1° CASO - SE IL VALORE INIZIALE E' GIA' STATO INSERITO E VALORE INTERMEDIO NO
       if (misure.getPetto()!=0 && misure.getBicipite()!=0 && misure.getAvambracci()!=0 && misure.getCosce()!=0 && misure.getPolpacci()!=0&&
           misure.getPetto_inter()==0 && misure.getBicipite_inter()==0 && misure.getAvambracci_inter()==0 && misure.getCosce_inter()==0 && misure.getPolpacci_inter()==0) {
            
           //MOSTREREMO NEI TEXT FIELD I VALORI INIZIALI
            petto_iniz.setText(Float.toString(misure.getPetto()));
            bici_iniz.setText(Float.toString(misure.getBicipite()));
            ava_iniz.setText(Float.toString(misure.getAvambracci()));
            cosce_iniz.setText(Float.toString(misure.getCosce()));
            polpa_iniz.setText(Float.toString(misure.getPolpacci())); 
            
        //2° CASO - ( PRIMO ACCESSO UTENTE ) SE IL VALORE INIZIALE  E IL VALORE INTERMEDIO NON SONO STATI ANCORA INSERITI
        }else if (misure.getPetto()==0 && misure.getBicipite()==0 && misure.getAvambracci()==0 && misure.getCosce()==0 && misure.getPolpacci()==0 &&
                misure.getPetto_inter()==0 && misure.getBicipite_inter()==0 && misure.getAvambracci_inter()==0 && misure.getCosce_inter()==0 && misure.getPolpacci_inter()==0){
        
            petto_iniz.setText("");
            bici_iniz.setText("");
            ava_iniz.setText("");
            cosce_iniz.setText("");
            polpa_iniz.setText("");  
            
        //3° CASO - CASO IN CUI SONO STATI INSERITI I VALORI INIZIALI E INTERMEDI
        }else if (misure.getPetto()!=0 && misure.getBicipite()!=0 && misure.getAvambracci()!=0 && misure.getCosce()!=0 && misure.getPolpacci()!=0&&
                misure.getPetto_inter()!=0 && misure.getBicipite_inter()!=0 && misure.getAvambracci_inter()!=0 && misure.getCosce_inter()!=0 && misure.getPolpacci_inter()!=0) {
            
            // VERRA' MOSTRATO NEI TEXT FIELD I VALORI INTERMEDI
            petto_iniz.setText(Float.toString(misure.getPetto_inter()));
            bici_iniz.setText(Float.toString(misure.getBicipite_inter()));
            ava_iniz.setText(Float.toString(misure.getAvambracci_inter()));
            cosce_iniz.setText(Float.toString(misure.getCosce_inter()));
            polpa_iniz.setText(Float.toString(misure.getPolpacci_inter()));
            
            if (misure.getPetto() == misure.getPetto_f()) {
                jProgressBar1.setMinimum(0);
                jProgressBar1.setValue(1000000);
                jProgressBar1.setMaximum(1000000);
           }else{
                jProgressBar1.setMinimum((int)(misure.getPetto() *100));
                jProgressBar1.setValue((int)(misure.getPetto_inter()*100));
                jProgressBar1.setMaximum((int)(misure.getPetto_f() *100));
            }
            
            if((misure.getBicipite() == misure.getBicipite_f())){
                jProgressBar2.setMinimum(0);
                jProgressBar2.setValue(1000000);
                jProgressBar2.setMaximum(1000000);
            }else{
                jProgressBar2.setMinimum((int)(misure.getBicipite()*100));
                jProgressBar2.setValue((int)(misure.getBicipite_inter()*100));
                jProgressBar2.setMaximum((int)(misure.getBicipite_f()*100));
            }
            
            if((misure.getAvambracci() == misure.getAvambracci_f())){
                jProgressBar3.setMinimum(0);
                jProgressBar3.setValue(1000000);
                jProgressBar3.setMaximum(1000000);
            }else{
                jProgressBar3.setMinimum((int)(misure.getAvambracci()*100));
                jProgressBar3.setValue((int)(misure.getAvambracci_inter()*100));
                jProgressBar3.setMaximum((int)(misure.getAvambracci_f()*100));
            }
            
            if((misure.getCosce() == misure.getCosce_f())){
                jProgressBar4.setMinimum(0);
                jProgressBar4.setValue(1000000);
                jProgressBar4.setMaximum(1000000);
            }else{
                jProgressBar4.setMinimum((int)(misure.getCosce()*100));
                jProgressBar4.setValue((int)(misure.getCosce_inter()*100));
                jProgressBar4.setMaximum((int)(misure.getCosce_f()*100));
            }
            
            if (misure.getPolpacci() == misure.getPolpacci_f()) {
                jProgressBar5.setMinimum(0);
                jProgressBar5.setValue(1000000);
                jProgressBar5.setMaximum(1000000);
           }else{
                jProgressBar5.setMinimum((int)(misure.getPolpacci()*100));
                jProgressBar5.setValue((int)(misure.getPolpacci_inter()*100));
                jProgressBar5.setMaximum((int)(misure.getPolpacci_f()*100));
            }
        }
        
        //MOSTRO I VALORI FINALI PRELEVATI DA MISURE.SAVE
        pettofinal1.setText(Float.toString(misure.getPetto_f()));
        bicifinal.setText(Float.toString(misure.getBicipite_f()));
        ava_final.setText(Float.toString(misure.getAvambracci_f()));
        cosce_final.setText(Float.toString(misure.getCosce_f()));
        polpa_final.setText(Float.toString(misure.getPolpacci_f()));
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        petto_iniz = new javax.swing.JTextField();
        bicifinal = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bici_iniz = new javax.swing.JTextField();
        jProgressBar2 = new javax.swing.JProgressBar();
        pettofinal1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jProgressBar3 = new javax.swing.JProgressBar();
        ava_final = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ava_iniz = new javax.swing.JTextField();
        cosce_iniz = new javax.swing.JTextField();
        jProgressBar4 = new javax.swing.JProgressBar();
        cosce_final = new javax.swing.JLabel();
        polpacciotext = new javax.swing.JLabel();
        polpa_iniz = new javax.swing.JTextField();
        jProgressBar5 = new javax.swing.JProgressBar();
        polpa_final = new javax.swing.JLabel();
        schedaforyou = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel1.setBackground(new java.awt.Color(155, 240, 240));

        jPanel2.setBackground(new java.awt.Color(155, 17, 30));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PROGRESSI E SCHEDA FOR YOU", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI", 3, 18), new java.awt.Color(255, 255, 102))); // NOI18N

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(155, 17, 30));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Yu Gothic UI", 3, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Benvenuto nella pagina dedicata al tuo allenamento personale. Qui avrai la possibilità di portare i muscoli alle \nmisure corrette che ti abbiamo fornito. Per prima cosa dovrai inserire nella casella \"Valore iniziale\" \nil valore attuale del tuo muscolo, dopodichè il nostro sistema metterà a tua disposizione un allenamento \ncorretto per fare in modo che il tuo corpo raggiunga le misure stabilite. \nPer aiutarti nel raggiungimento dell'obbiettivo mettiamo a disposizione una barra dei progressi \nche ti aiuterà a capire quanto ti manca per raggiungerlo.\n");
        jScrollPane2.setViewportView(jTextArea1);

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 102));
        jLabel2.setText("BICIPITE");

        jProgressBar1.setBackground(new java.awt.Color(0, 0, 0));
        jProgressBar1.setFont(new java.awt.Font("Yu Gothic UI", 3, 14)); // NOI18N
        jProgressBar1.setForeground(new java.awt.Color(0, 0, 0));
        jProgressBar1.setMaximum(1000000);
        jProgressBar1.setStringPainted(true);

        petto_iniz.setBackground(new java.awt.Color(155, 17, 30));
        petto_iniz.setFont(new java.awt.Font("Yu Gothic UI", 3, 14)); // NOI18N
        petto_iniz.setForeground(new java.awt.Color(255, 255, 102));
        petto_iniz.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 102)));

        bicifinal.setFont(new java.awt.Font("Yu Gothic UI", 3, 14)); // NOI18N
        bicifinal.setForeground(new java.awt.Color(255, 255, 102));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 102));
        jLabel3.setText("PETTO");

        bici_iniz.setBackground(new java.awt.Color(155, 17, 30));
        bici_iniz.setFont(new java.awt.Font("Yu Gothic UI", 3, 14)); // NOI18N
        bici_iniz.setForeground(new java.awt.Color(255, 255, 102));
        bici_iniz.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 102)));

        jProgressBar2.setBackground(new java.awt.Color(0, 0, 0));
        jProgressBar2.setFont(new java.awt.Font("Yu Gothic UI", 3, 14)); // NOI18N
        jProgressBar2.setForeground(new java.awt.Color(0, 0, 0));
        jProgressBar2.setMaximum(1000000);
        jProgressBar2.setStringPainted(true);

        pettofinal1.setFont(new java.awt.Font("Yu Gothic UI", 3, 14)); // NOI18N
        pettofinal1.setForeground(new java.awt.Color(255, 255, 102));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 102));
        jLabel4.setText("COSCIA");

        jProgressBar3.setBackground(new java.awt.Color(0, 0, 0));
        jProgressBar3.setFont(new java.awt.Font("Yu Gothic UI", 3, 14)); // NOI18N
        jProgressBar3.setForeground(new java.awt.Color(0, 0, 0));
        jProgressBar3.setMaximum(1000000);
        jProgressBar3.setStringPainted(true);

        ava_final.setFont(new java.awt.Font("Yu Gothic UI", 3, 14)); // NOI18N
        ava_final.setForeground(new java.awt.Color(255, 255, 102));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 102));
        jLabel5.setText("AVAMBRACCIO");

        ava_iniz.setBackground(new java.awt.Color(155, 17, 30));
        ava_iniz.setFont(new java.awt.Font("Yu Gothic UI", 3, 14)); // NOI18N
        ava_iniz.setForeground(new java.awt.Color(255, 255, 102));
        ava_iniz.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 102)));

        cosce_iniz.setBackground(new java.awt.Color(155, 17, 30));
        cosce_iniz.setFont(new java.awt.Font("Yu Gothic UI", 3, 14)); // NOI18N
        cosce_iniz.setForeground(new java.awt.Color(255, 255, 102));
        cosce_iniz.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 102)));

        jProgressBar4.setBackground(new java.awt.Color(0, 0, 0));
        jProgressBar4.setFont(new java.awt.Font("Yu Gothic UI", 3, 14)); // NOI18N
        jProgressBar4.setForeground(new java.awt.Color(0, 0, 0));
        jProgressBar4.setMaximum(1000000);
        jProgressBar4.setStringPainted(true);

        cosce_final.setFont(new java.awt.Font("Yu Gothic UI", 3, 14)); // NOI18N
        cosce_final.setForeground(new java.awt.Color(255, 255, 102));

        polpacciotext.setFont(new java.awt.Font("Yu Gothic UI", 3, 14)); // NOI18N
        polpacciotext.setForeground(new java.awt.Color(255, 255, 102));
        polpacciotext.setText("POLPACCIO");

        polpa_iniz.setBackground(new java.awt.Color(155, 17, 30));
        polpa_iniz.setFont(new java.awt.Font("Yu Gothic UI", 3, 14)); // NOI18N
        polpa_iniz.setForeground(new java.awt.Color(255, 255, 102));
        polpa_iniz.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 102)));

        jProgressBar5.setBackground(new java.awt.Color(0, 0, 0));
        jProgressBar5.setFont(new java.awt.Font("Yu Gothic UI", 3, 14)); // NOI18N
        jProgressBar5.setForeground(new java.awt.Color(0, 0, 0));
        jProgressBar5.setMaximum(1000000);
        jProgressBar5.setStringPainted(true);

        polpa_final.setFont(new java.awt.Font("Yu Gothic UI", 3, 14)); // NOI18N
        polpa_final.setForeground(new java.awt.Color(255, 255, 102));

        schedaforyou.setBackground(new java.awt.Color(155, 17, 30));
        schedaforyou.setFont(new java.awt.Font("Yu Gothic UI", 3, 18)); // NOI18N
        schedaforyou.setForeground(new java.awt.Color(255, 255, 102));
        schedaforyou.setText("SCHEDA FOR YOU");
        schedaforyou.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        schedaforyou.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                schedaforyouMouseClicked(evt);
            }
        });
        schedaforyou.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                schedaforyouActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/indietro1.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 3, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 102));
        jLabel6.setText("Valore attuale");

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI", 3, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 102));
        jLabel7.setText("Valore finale");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(221, 221, 221)
                .addComponent(schedaforyou, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(polpacciotext, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                    .addComponent(petto_iniz)
                    .addComponent(bici_iniz)
                    .addComponent(ava_iniz, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                    .addComponent(cosce_iniz)
                    .addComponent(polpa_iniz))
                .addGap(70, 70, 70)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                    .addComponent(jProgressBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jProgressBar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jProgressBar4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jProgressBar5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(70, 70, 70)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bicifinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pettofinal1, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE))
                        .addComponent(polpa_final, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cosce_final, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ava_final, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(petto_iniz, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pettofinal1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bici_iniz, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jProgressBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bicifinal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ava_iniz, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(ava_final, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jProgressBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jProgressBar4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cosce_iniz, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cosce_final, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(polpacciotext, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(polpa_iniz, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jProgressBar5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(polpa_final, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(schedaforyou, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(93, 93, 93))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 732, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void schedaforyouMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_schedaforyouMouseClicked
        
        xml = new Xml();
        allenamento = new Allenamento_Gym4you();
                        
        if (misure.getPetto() == misure.getPetto_f() && misure.getBicipite() == misure.getBicipite_f() &&
            misure.getAvambracci() == misure.getAvambracci_f() && misure.getCosce() == misure.getCosce_f() &&
            misure.getPolpacci() == misure.getPolpacci_f() && misure.getPetto_inter() == misure.getPetto_f() &&
            misure.getBicipite_inter() == misure.getBicipite_f() && misure.getAvambracci_inter() == misure.getAvambracci_f() &&
            misure.getCosce_inter() == misure.getCosce_f() && misure.getPolpacci_inter() == misure.getPolpacci_f() ) {
            
            JOptionPane.showMessageDialog(null, "COMPLIMENTI! SEI RIUSCITO A RAGGIUNGERE IL LIVELLO MASSIMO DEI TUOI MUSCOLI.", "GRAZIE PER AVER USATO GYMFORYOU", JOptionPane.INFORMATION_MESSAGE);
            
        }else{
            
            //CONVERTIAMO LE VIRGOLE IN PUNTI
            petto_iniz.setText(petto_iniz.getText().replace(",", "."));
            bici_iniz.setText(bici_iniz.getText().replace(",", "."));
            ava_iniz.setText(ava_iniz.getText().replace(",", "."));
            cosce_iniz.setText(cosce_iniz.getText().replace(",", "."));
            polpa_iniz.setText(polpa_iniz.getText().replace(",", "."));
            //


            //1° CASO
            //SE I VALORI DI PETTO_INIZ, ECC. SONO DIVERSI DA ZERO, CIOE' SONO GIA' STATI INSERITI EFFETTUA L'INSERIMENTO DEI VALORI INTERMEDI
            if (misure.getPetto()!=0 && misure.getBicipite()!=0 && misure.getAvambracci()!=0 && misure.getCosce()!=0 && misure.getPolpacci()!=0 &&
                misure.getPetto_inter()==0 && misure.getBicipite_inter()==0 && misure.getAvambracci_inter()==0 && misure.getCosce_inter()==0 && misure.getPolpacci_inter()==0) {

                // RICHIAMO IL METODO DELLA CLASSE UTENTE E PASSO I PARAMETRI PRELEVATI DAL TEXT FIELD
                String msg = utente.salvaValoriIntermedi(utente.getEmail(),petto_iniz.getText(), bici_iniz.getText(),
                                                         ava_iniz.getText(),cosce_iniz.getText(),polpa_iniz.getText());
                
                //CONFRONTO IL MESSAGGIO RESTITUITO DAL SERVER CON QUELLO SOTTO
                if (msg.equals("Valori Intermedi Inseriti")) {
                        //SCRIVE FILE MISURE.SAVE CON I VALORI APPENA INSERITI
                        xml.salvaXmlMisure(utente.getEmail());
                        //
                        
                        allenamento.setVisible(true);
                        dispose();

                }else if(msg.equals("Campi vuoti")){
                    JOptionPane.showMessageDialog(null, "Attenzione uno o più campi vuoti", "ATTENZIONE", JOptionPane.WARNING_MESSAGE);
                }else if (msg.equals("Valori Intermedi non Inseriti")) {
                    JOptionPane.showMessageDialog(null, "Valori non inseriti", "ATTENZIONE", JOptionPane.WARNING_MESSAGE);
                }


            //2° CASO   (PRIMO ACCESSO UTENTE)
            //IN CUI ANCORA I VALORI INZIALI E INTERMEDI NON SONO STATI AGGIUNTI
            }else if (misure.getPetto()==0 && misure.getBicipite()==0 && misure.getAvambracci()==0 && misure.getCosce()==0 && misure.getPolpacci()==0 &&
                misure.getPetto_inter()==0 && misure.getBicipite_inter()==0 && misure.getAvambracci_inter()==0 && misure.getCosce_inter()==0 && misure.getPolpacci_inter()==0) {

                // RICHIAMO IL METODO DELLA CLASSE UTENTE E PASSO I PARAMETRI PRELEVATI DAL TEXT FIELD
                String msg = utente.salvaValoriIniziali(utente.getEmail(),
                                                        petto_iniz.getText(),
                                                        bici_iniz.getText(),
                                                        ava_iniz.getText(),
                                                        cosce_iniz.getText(),
                                                        polpa_iniz.getText());
                
                //CONFRONTO IL MESSAGGIO RESTITUITO DAL SERVER CON QUELLO SOTTO
                if (msg.equals("Valori Inseriti")) {
                        //SCRIVE FILE MISURE.SAVE CON I VALORI APPENA INSERITI
                        xml.salvaXmlMisure(utente.getEmail());
                        //
                        allenamento.setVisible(true);
                        dispose();

                }else if(msg.equals("Campi vuoti")){
                    JOptionPane.showMessageDialog(null, "Attenzione uno o più campi vuoti", "ATTENZIONE", JOptionPane.WARNING_MESSAGE);
                }else if (msg.equals("Valori non Inseriti")) {
                    JOptionPane.showMessageDialog(null, "Valori non inseriti", "ATTENZIONE", JOptionPane.WARNING_MESSAGE);
                }
            //3° CASO
            //SE I VALORI INIZIALI E INTERMEDI SONO DIVERSI DA ZERO, CIOE' SONO GIA' STATI INSERITI EFFETTUA L'UPDATE SUI VALORI INTERMEDI
            }else if (misure.getPetto()!=0 && misure.getBicipite()!=0 && misure.getAvambracci()!=0 && misure.getCosce()!=0 && misure.getPolpacci()!=0&&
                      misure.getPetto_inter()!=0 && misure.getBicipite_inter()!=0 && misure.getAvambracci_inter()!=0 && misure.getCosce_inter()!=0 && misure.getPolpacci_inter()!=0) {

                // RICHIAMO IL METODO DELLA CLASSE UTENTE E PASSO I PARAMETRI PRELEVATI DAL TEXT FIELD
                String msg = utente.salvaValoriIntermedi(utente.getEmail(),petto_iniz.getText(),bici_iniz.getText(),
                                                        ava_iniz.getText(),cosce_iniz.getText(),polpa_iniz.getText());
                                                        

                //CONFRONTO IL MESSAGGIO RESTITUITO DAL SERVER CON QUELLO SOTTO
                if (msg.equals("Valori Intermedi Inseriti")) {
                        //SCRIVE FILE MISURE.SAVE CON I VALORI APPENA INSERITI
                        xml.salvaXmlMisure(utente.getEmail());
                        //
                        allenamento.setVisible(true);
                        dispose();

                }else if(msg.equals("Campi vuoti")){
                    JOptionPane.showMessageDialog(null, "Attenzione uno o più campi vuoti", "ATTENZIONE", JOptionPane.WARNING_MESSAGE);
                }else if (msg.equals("Valori Intermedi non Inseriti")) {
                    JOptionPane.showMessageDialog(null, "Valori non inseriti", "ATTENZIONE", JOptionPane.WARNING_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_schedaforyouMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        panello = new Pannello_Utente();
        panello.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void schedaforyouActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_schedaforyouActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_schedaforyouActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Scheda_Gym4You.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Scheda_Gym4You.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Scheda_Gym4You.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Scheda_Gym4You.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Scheda_Gym4You().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ava_final;
    private javax.swing.JTextField ava_iniz;
    private javax.swing.JTextField bici_iniz;
    private javax.swing.JLabel bicifinal;
    private javax.swing.JLabel cosce_final;
    private javax.swing.JTextField cosce_iniz;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JProgressBar jProgressBar3;
    private javax.swing.JProgressBar jProgressBar4;
    private javax.swing.JProgressBar jProgressBar5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField petto_iniz;
    private javax.swing.JLabel pettofinal1;
    private javax.swing.JLabel polpa_final;
    private javax.swing.JTextField polpa_iniz;
    private javax.swing.JLabel polpacciotext;
    private javax.swing.JButton schedaforyou;
    // End of variables declaration//GEN-END:variables
}
