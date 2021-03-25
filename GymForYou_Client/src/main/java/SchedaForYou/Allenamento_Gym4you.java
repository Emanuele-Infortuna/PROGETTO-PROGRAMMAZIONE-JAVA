package SchedaForYou;

import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;

public class Allenamento_Gym4you extends javax.swing.JFrame {
    
    Scheda_Gym4You gym4You;
    AlgoritmoDue algo;
    AlgoritmoUno  algoritmo;
    
    
    public Allenamento_Gym4you() {
        initComponents();
        ImageIcon icon = new ImageIcon("src/main/resources/imageicon.png");
        setIconImage(icon.getImage());
        setTitle("GYM FOR YOU");
        jScrollPane1.getVerticalScrollBar().setUnitIncrement(16);
        
        algo = new AlgoritmoDue();
        algoritmo = new AlgoritmoUno();
        //CREO UN ARRAYLIST CONTENENTE IL RISULTATO DELLA METODO SCHEDADUE
        List<String> schedaAllenamento = algo.schedaDue(algoritmo.schedaUno());
        
        //SEPARO I NOMI DAI PATH
        //INSERISCO I NOMI
        List<String> esercizi = new ArrayList<String>();
        //INSERISCO I PATH
        List<String> path = new ArrayList<String>();
        
        for (int i = 0; i < schedaAllenamento.size(); i++) { 	
            
            if (i%2==0) {
                //(NOMI)INSERISCO NELL'ARRAYLIST ESERCIZI GLI ELEMENTI IN POSIZIONE PARI DELL'ARRAYLIST SCHEDAALLENAMENTO
                esercizi.add(schedaAllenamento.get(i)); 
            }else{
                //(PATH)INSERISCO NELL'ARRAYLIST ESERCIZI GLI ELEMENTI IN POSIZIONE DISPARI DELL'ARRAYLIST SCHEDAALLENAMENTO
                path.add(schedaAllenamento.get(i));
            }
        }
        
        //1° CASO - BISOGNA ALLENARE UNA SOLA PARTE DEL CORPO (7 ESERCIZI TOTALI)
        if (schedaAllenamento.size() == 12) {
            ese2.setText(esercizi.get(0));
            ese3.setText(esercizi.get(1));
            ese4.setText(esercizi.get(2));
            ese5.setText(esercizi.get(3));
            ese6.setText(esercizi.get(4));
            ese7.setText(esercizi.get(5));

            ese8.setVisible(false);
            ese9.setVisible(false);
            ese10.setVisible(false);
            ese11.setVisible(false);
            ese12.setVisible(false);
            ese13.setVisible(false);
            
            img2.setIcon(new javax.swing.ImageIcon(path.get(0))); // NOI18N
            img3.setIcon(new javax.swing.ImageIcon(path.get(1))); // NOI18N
            img4.setIcon(new javax.swing.ImageIcon(path.get(2))); // NOI18N
            img5.setIcon(new javax.swing.ImageIcon(path.get(3))); // NOI18N
            img6.setIcon(new javax.swing.ImageIcon(path.get(4))); // NOI18N
            img7.setIcon(new javax.swing.ImageIcon(path.get(5))); // NOI18N
            
            img8.setVisible(false);
            img9.setVisible(false);
            img10.setVisible(false);
            img11.setVisible(false);
            img12.setVisible(false);
            img13.setVisible(false);
            
        //2° CASO - BISOGNA ALLENARE UNA SOLA PARTE DEL CORPO   (8 ESERCIZI TOTALI)
        }else if (schedaAllenamento.size() == 14) {
            ese2.setText(esercizi.get(0));
            ese3.setText(esercizi.get(1));
            ese4.setText(esercizi.get(2));
            ese5.setText(esercizi.get(3));
            ese6.setText(esercizi.get(4));
            ese7.setText(esercizi.get(5));
            ese8.setText(esercizi.get(6));
            
            ese9.setVisible(false);
            ese10.setVisible(false);
            ese11.setVisible(false);
            ese12.setVisible(false);
            ese13.setVisible(false);
            
            img2.setIcon(new javax.swing.ImageIcon(path.get(0))); // NOI18N
            img3.setIcon(new javax.swing.ImageIcon(path.get(1))); // NOI18N
            img4.setIcon(new javax.swing.ImageIcon(path.get(2))); // NOI18N
            img5.setIcon(new javax.swing.ImageIcon(path.get(3))); // NOI18N
            img6.setIcon(new javax.swing.ImageIcon(path.get(4))); // NOI18N
            img7.setIcon(new javax.swing.ImageIcon(path.get(5))); // NOI18N
            img8.setIcon(new javax.swing.ImageIcon(path.get(6))); // NOI18N
            
            img9.setVisible(false);
            img10.setVisible(false);
            img11.setVisible(false);
            img12.setVisible(false);
            img13.setVisible(false);
        
        //3° CASO - BISOGNA ALLENARE DUE PARTI DEL CORPO   (12 ESERCIZI TOTALI)
        }else if (schedaAllenamento.size() == 22) {
        
            ese2.setText(esercizi.get(0));
            ese3.setText(esercizi.get(1));
            ese4.setText(esercizi.get(2));
            ese5.setText(esercizi.get(3));
            ese6.setText(esercizi.get(4));
            ese7.setText(esercizi.get(5));
            ese8.setText(esercizi.get(6));
            ese9.setText(esercizi.get(7));
            ese10.setText(esercizi.get(8));
            ese11.setText(esercizi.get(9));
            ese12.setText(esercizi.get(10));
            
            ese13.setVisible(false);

            img2.setIcon(new javax.swing.ImageIcon(path.get(0))); // NOI18N
            img3.setIcon(new javax.swing.ImageIcon(path.get(1))); // NOI18N
            img4.setIcon(new javax.swing.ImageIcon(path.get(2))); // NOI18N
            img5.setIcon(new javax.swing.ImageIcon(path.get(3))); // NOI18N
            img6.setIcon(new javax.swing.ImageIcon(path.get(4))); // NOI18N
            img7.setIcon(new javax.swing.ImageIcon(path.get(5))); // NOI18N
            img8.setIcon(new javax.swing.ImageIcon(path.get(6))); // NOI18N
            img9.setIcon(new javax.swing.ImageIcon(path.get(7))); // NOI18N
            img10.setIcon(new javax.swing.ImageIcon(path.get(8))); // NOI18N
            img11.setIcon(new javax.swing.ImageIcon(path.get(9))); // NOI18N
            img12.setIcon(new javax.swing.ImageIcon(path.get(10))); // NOI18N

            img13.setVisible(false);
        //4° CASO - BISOGNA ALLENARE DUE/TRE PARTI DEL CORPO   (13 ESERCIZI TOTALI)
        }else{
            
            ese2.setText(esercizi.get(0));
            ese3.setText(esercizi.get(1));
            ese4.setText(esercizi.get(2));
            ese5.setText(esercizi.get(3));
            ese6.setText(esercizi.get(4));
            ese7.setText(esercizi.get(5));
            ese8.setText(esercizi.get(6));
            ese9.setText(esercizi.get(7));
            ese10.setText(esercizi.get(8));
            ese11.setText(esercizi.get(9));
            ese12.setText(esercizi.get(10));
            ese13.setText(esercizi.get(11));

            img2.setIcon(new javax.swing.ImageIcon(path.get(0))); // NOI18N
            img3.setIcon(new javax.swing.ImageIcon(path.get(1))); // NOI18N
            img4.setIcon(new javax.swing.ImageIcon(path.get(2))); // NOI18N
            img5.setIcon(new javax.swing.ImageIcon(path.get(3))); // NOI18N
            img6.setIcon(new javax.swing.ImageIcon(path.get(4))); // NOI18N
            img7.setIcon(new javax.swing.ImageIcon(path.get(5))); // NOI18N
            img8.setIcon(new javax.swing.ImageIcon(path.get(6))); // NOI18N
            img9.setIcon(new javax.swing.ImageIcon(path.get(7))); // NOI18N
            img10.setIcon(new javax.swing.ImageIcon(path.get(8))); // NOI18N
            img11.setIcon(new javax.swing.ImageIcon(path.get(9))); // NOI18N
            img12.setIcon(new javax.swing.ImageIcon(path.get(10))); // NOI18N
            img13.setIcon(new javax.swing.ImageIcon(path.get(11))); // NOI18N
            
            
        }
        
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
        img1 = new javax.swing.JLabel();
        img7 = new javax.swing.JLabel();
        img2 = new javax.swing.JLabel();
        img3 = new javax.swing.JLabel();
        img4 = new javax.swing.JLabel();
        img5 = new javax.swing.JLabel();
        img10 = new javax.swing.JLabel();
        img6 = new javax.swing.JLabel();
        img8 = new javax.swing.JLabel();
        img12 = new javax.swing.JLabel();
        img9 = new javax.swing.JLabel();
        img11 = new javax.swing.JLabel();
        img13 = new javax.swing.JLabel();
        ese3 = new javax.swing.JLabel();
        ese1 = new javax.swing.JLabel();
        ese4 = new javax.swing.JLabel();
        ese5 = new javax.swing.JLabel();
        ese6 = new javax.swing.JLabel();
        ese7 = new javax.swing.JLabel();
        ese8 = new javax.swing.JLabel();
        ese9 = new javax.swing.JLabel();
        ese2 = new javax.swing.JLabel();
        ese11 = new javax.swing.JLabel();
        ese12 = new javax.swing.JLabel();
        ese13 = new javax.swing.JLabel();
        ese10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(1001, 1590));

        jPanel1.setBackground(new java.awt.Color(155, 17, 30));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SCHEDA DI ALLENAMENTO PER TE ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI", 3, 18), new java.awt.Color(255, 255, 102))); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(965, 1590));

        img1.setBackground(new java.awt.Color(51, 51, 51));
        img1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jumping_jacks.gif"))); // NOI18N

        img7.setBackground(new java.awt.Color(51, 51, 51));
        img7.setBorder(new javax.swing.border.MatteBorder(null));

        img2.setBackground(new java.awt.Color(51, 51, 51));
        img2.setBorder(new javax.swing.border.MatteBorder(null));

        img3.setBackground(new java.awt.Color(51, 51, 51));
        img3.setBorder(new javax.swing.border.MatteBorder(null));

        img4.setBackground(new java.awt.Color(51, 51, 51));
        img4.setBorder(new javax.swing.border.MatteBorder(null));

        img5.setBackground(new java.awt.Color(51, 51, 51));
        img5.setBorder(new javax.swing.border.MatteBorder(null));

        img10.setBackground(new java.awt.Color(51, 51, 51));
        img10.setBorder(new javax.swing.border.MatteBorder(null));

        img6.setBackground(new java.awt.Color(51, 51, 51));
        img6.setBorder(new javax.swing.border.MatteBorder(null));

        img8.setBackground(new java.awt.Color(51, 51, 51));
        img8.setBorder(new javax.swing.border.MatteBorder(null));

        img12.setBackground(new java.awt.Color(51, 51, 51));
        img12.setBorder(new javax.swing.border.MatteBorder(null));

        img9.setBackground(new java.awt.Color(51, 51, 51));
        img9.setBorder(new javax.swing.border.MatteBorder(null));

        img11.setBackground(new java.awt.Color(51, 51, 51));
        img11.setBorder(new javax.swing.border.MatteBorder(null));

        img13.setBackground(new java.awt.Color(51, 51, 51));
        img13.setBorder(new javax.swing.border.MatteBorder(null));

        ese3.setFont(new java.awt.Font("Yu Gothic UI", 3, 12)); // NOI18N
        ese3.setForeground(new java.awt.Color(255, 255, 102));
        ese3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "3° esercizio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI", 3, 8), new java.awt.Color(255, 255, 102))); // NOI18N

        ese1.setFont(new java.awt.Font("Yu Gothic UI", 3, 12)); // NOI18N
        ese1.setForeground(new java.awt.Color(255, 255, 102));
        ese1.setText("Jumping jacks 30s");
        ese1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "1° esercizio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI", 3, 8), new java.awt.Color(255, 255, 102))); // NOI18N

        ese4.setFont(new java.awt.Font("Yu Gothic UI", 3, 12)); // NOI18N
        ese4.setForeground(new java.awt.Color(255, 255, 102));
        ese4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "4° esercizio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI", 3, 8), new java.awt.Color(255, 255, 102))); // NOI18N

        ese5.setFont(new java.awt.Font("Yu Gothic UI", 3, 12)); // NOI18N
        ese5.setForeground(new java.awt.Color(255, 255, 102));
        ese5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "5° esercizio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI", 3, 8), new java.awt.Color(255, 255, 102))); // NOI18N

        ese6.setFont(new java.awt.Font("Yu Gothic UI", 3, 12)); // NOI18N
        ese6.setForeground(new java.awt.Color(255, 255, 102));
        ese6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "6° esercizio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI", 3, 8), new java.awt.Color(255, 255, 102))); // NOI18N

        ese7.setFont(new java.awt.Font("Yu Gothic UI", 3, 12)); // NOI18N
        ese7.setForeground(new java.awt.Color(255, 255, 102));
        ese7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "7° esercizio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI", 3, 8), new java.awt.Color(255, 255, 102))); // NOI18N

        ese8.setFont(new java.awt.Font("Yu Gothic UI", 3, 12)); // NOI18N
        ese8.setForeground(new java.awt.Color(255, 255, 102));
        ese8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "8° esercizio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI", 3, 8), new java.awt.Color(255, 255, 102))); // NOI18N

        ese9.setFont(new java.awt.Font("Yu Gothic UI", 3, 12)); // NOI18N
        ese9.setForeground(new java.awt.Color(255, 255, 102));
        ese9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "9° esercizio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI", 3, 8), new java.awt.Color(255, 255, 102))); // NOI18N

        ese2.setFont(new java.awt.Font("Yu Gothic UI", 3, 12)); // NOI18N
        ese2.setForeground(new java.awt.Color(255, 255, 102));
        ese2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "2° eserczio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI", 3, 8), new java.awt.Color(255, 255, 102))); // NOI18N

        ese11.setFont(new java.awt.Font("Yu Gothic UI", 3, 12)); // NOI18N
        ese11.setForeground(new java.awt.Color(255, 255, 102));
        ese11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "11° esercizio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI", 3, 8), new java.awt.Color(255, 255, 102))); // NOI18N

        ese12.setFont(new java.awt.Font("Yu Gothic UI", 3, 12)); // NOI18N
        ese12.setForeground(new java.awt.Color(255, 255, 102));
        ese12.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "12° esercizio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI", 3, 8), new java.awt.Color(255, 255, 102))); // NOI18N

        ese13.setFont(new java.awt.Font("Yu Gothic UI", 3, 12)); // NOI18N
        ese13.setForeground(new java.awt.Color(255, 255, 102));
        ese13.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "13° esercizio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI", 3, 8), new java.awt.Color(255, 255, 102))); // NOI18N

        ese10.setFont(new java.awt.Font("Yu Gothic UI", 3, 12)); // NOI18N
        ese10.setForeground(new java.awt.Color(255, 255, 102));
        ese10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "10° esercizio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic", 3, 8), new java.awt.Color(255, 255, 102))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/indietro1.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(ese13, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ese9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(ese7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(ese5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ese3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ese11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ese1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(img13, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(img1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(img3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(img5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(img7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(img9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(img11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ese12, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                            .addComponent(ese8, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                            .addComponent(ese10, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                            .addComponent(ese2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ese4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ese6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(img12, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(img10, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(img2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(img4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(img6, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(img8, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(172, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(img2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(ese1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(39, 39, 39)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(img4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(57, 57, 57)
                                        .addComponent(ese3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(img6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(62, 62, 62)
                                        .addComponent(ese5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(img8, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)
                                        .addComponent(img10, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(67, 67, 67)
                                        .addComponent(ese7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(97, 97, 97)
                                        .addComponent(ese9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(ese2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(95, 95, 95)
                                .addComponent(ese4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(111, 111, 111)
                                .addComponent(ese6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(111, 111, 111)
                                .addComponent(ese8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ese10, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(img12, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(ese12, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(ese11, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(ese13, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(img1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(img3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(img5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(img7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(158, 158, 158))
                            .addComponent(img9, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addComponent(img11, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(img13, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(467, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1140, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        gym4You = new Scheda_Gym4You();
        gym4You.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

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
            java.util.logging.Logger.getLogger(Allenamento_Gym4you.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Allenamento_Gym4you.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Allenamento_Gym4you.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Allenamento_Gym4you.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Allenamento_Gym4you().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ese1;
    private javax.swing.JLabel ese10;
    private javax.swing.JLabel ese11;
    private javax.swing.JLabel ese12;
    private javax.swing.JLabel ese13;
    private javax.swing.JLabel ese2;
    private javax.swing.JLabel ese3;
    private javax.swing.JLabel ese4;
    private javax.swing.JLabel ese5;
    private javax.swing.JLabel ese6;
    private javax.swing.JLabel ese7;
    private javax.swing.JLabel ese8;
    private javax.swing.JLabel ese9;
    private javax.swing.JLabel img1;
    private javax.swing.JLabel img10;
    private javax.swing.JLabel img11;
    private javax.swing.JLabel img12;
    private javax.swing.JLabel img13;
    private javax.swing.JLabel img2;
    private javax.swing.JLabel img3;
    private javax.swing.JLabel img4;
    private javax.swing.JLabel img5;
    private javax.swing.JLabel img6;
    private javax.swing.JLabel img7;
    private javax.swing.JLabel img8;
    private javax.swing.JLabel img9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
