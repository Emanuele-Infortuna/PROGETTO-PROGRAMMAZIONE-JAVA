package Consultazioni.Utente;

import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class InviaDomanda extends javax.swing.JFrame {

   MessaggiUtente chat;
   SceltaOperazioni scelta;
   
   
   private static String type;
   
    public InviaDomanda(String type) {
        initComponents();
        ImageIcon icon = new ImageIcon("src/main/resources/imageicon.png");
        setIconImage(icon.getImage());
        setTitle("GYM FOR YOU");
        this.type = type;
        if (type.equals("trn")) {
            jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CONSULTA IL TRAINER", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI", 3, 18), new java.awt.Color(255, 255, 102)));
            jLabel1.setText("Ciao, utilizza questo servizio messo a tua disposizione per chiedere qualcosa ai trainer associati con Gym for You. ");
            cat1.setText("Consigli esecuzione esercizio");
            cat2.setText("Consigli allenamento");
            cat3.setText("Corso");
            cat4.setText("Corso2");
            cat5.setText("Altro...");
            jLabel3.setText("Seleziona trainer a cui inviare la domanda");
            
        }
        visualizzaMedici();
    }

    private InviaDomanda() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scegliCategoria = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        cat1 = new javax.swing.JRadioButton();
        cat2 = new javax.swing.JRadioButton();
        cat3 = new javax.swing.JRadioButton();
        cat4 = new javax.swing.JRadioButton();
        cat5 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        campodomanda = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        indietro = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(155, 17, 30));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CONSULTA IL MEDICO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI", 3, 18), new java.awt.Color(255, 255, 102))); // NOI18N

        jLabel1.setBackground(new java.awt.Color(155, 17, 30));
        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 3, 14)); // NOI18N
        jLabel1.setText("Ciao, utilizza questo servizio messo a tua disposizione per chiedere qualcosa ai medici associati con Gym for You. ");

        jPanel2.setBackground(new java.awt.Color(255, 255, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Scegli una categoria.", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI", 3, 14))); // NOI18N

        cat1.setBackground(new java.awt.Color(255, 255, 102));
        scegliCategoria.add(cat1);
        cat1.setFont(new java.awt.Font("Yu Gothic UI", 3, 14)); // NOI18N
        cat1.setText("Dolori articolari ");
        cat1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cat1ActionPerformed(evt);
            }
        });

        cat2.setBackground(new java.awt.Color(255, 255, 102));
        scegliCategoria.add(cat2);
        cat2.setFont(new java.awt.Font("Yu Gothic UI", 3, 14)); // NOI18N
        cat2.setText("Problemi di respirazione");
        cat2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        cat3.setBackground(new java.awt.Color(255, 255, 102));
        scegliCategoria.add(cat3);
        cat3.setFont(new java.awt.Font("Yu Gothic UI", 3, 14)); // NOI18N
        cat3.setText("Dolori muscolari");
        cat3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        cat4.setBackground(new java.awt.Color(255, 255, 102));
        scegliCategoria.add(cat4);
        cat4.setFont(new java.awt.Font("Yu Gothic UI", 3, 14)); // NOI18N
        cat4.setText("Problemi fisici");
        cat4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        cat5.setBackground(new java.awt.Color(255, 255, 102));
        scegliCategoria.add(cat5);
        cat5.setFont(new java.awt.Font("Yu Gothic UI", 3, 14)); // NOI18N
        cat5.setText("Altro...");
        cat5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cat5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cat5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cat2, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                    .addComponent(cat1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cat3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cat4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cat5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 30, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(cat1)
                .addGap(18, 18, 18)
                .addComponent(cat2)
                .addGap(27, 27, 27)
                .addComponent(cat3)
                .addGap(29, 29, 29)
                .addComponent(cat4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(cat5))
        );

        jTable1.setBackground(new java.awt.Color(255, 255, 102));
        jTable1.setFont(new java.awt.Font("Yu Gothic UI", 3, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Email", "Nome", "Cognome"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane1.setViewportView(jTable1);

        campodomanda.setBackground(new java.awt.Color(255, 255, 102));
        campodomanda.setColumns(20);
        campodomanda.setFont(new java.awt.Font("Yu Gothic UI", 3, 12)); // NOI18N
        campodomanda.setLineWrap(true);
        campodomanda.setRows(5);
        campodomanda.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Scrivi domanda. Max 250 caratteri", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI", 3, 14))); // NOI18N
        jScrollPane2.setViewportView(campodomanda);

        jButton1.setBackground(new java.awt.Color(255, 255, 102));
        jButton1.setFont(new java.awt.Font("Yu Gothic UI", 3, 14)); // NOI18N
        jButton1.setText("INVIA");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        indietro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/indietro1.png"))); // NOI18N
        indietro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        indietro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                indietroMouseClicked(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(155, 17, 30));
        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 3, 12)); // NOI18N
        jLabel3.setText("Seleziona medico a cui inviare la domanda");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(259, 259, 259)
                .addComponent(indietro, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
            .addComponent(jScrollPane2)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(179, 179, 179)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(indietro, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void visualizzaMedici(){

        DefaultTableModel Df = (DefaultTableModel)jTable1.getModel();
        Df.setRowCount(0);

        
        Map dati = new HashMap();
        
        if (type.equals("trn")) {
            chat = new MessaggiUtente();
            dati = chat.visualizzaMediciTrainer("trainer");
            
        }else if(type.equals("med")){
            chat = new MessaggiUtente();
            dati = chat.visualizzaMediciTrainer("dottore");
        }
        
        for(int j=0; j<dati.size(); j = j+3){
            Vector v2 = new Vector();
            for(int i=1; i <=dati.size(); i++){

                v2.add(dati.get(""+j));
                v2.add(dati.get(""+(j+1)));
                v2.add(dati.get(""+(j+2)));
            }
            Df.addRow(v2);
        }
    }
    
    
    private void cat5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cat5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cat5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cat1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cat1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
       // TODO add your handling code here:
       String msg = "";
       DefaultTableModel Df = (DefaultTableModel)jTable1.getModel();
        int selectIndex = jTable1.getSelectedRow();
        String email = Df.getValueAt(selectIndex,0).toString();
        
        String categoria="";
        
        if (cat1.isSelected()) {
            categoria = cat1.getText();
        }else if(cat2.isSelected()){
            categoria = cat2.getText();
        }else if(cat3.isSelected()){
            categoria = cat3.getText();
        }else if(cat4.isSelected()){
            categoria = cat4.getText();
        }else if(cat5.isSelected()){
            categoria = cat5.getText();
        }
       
        int n = JOptionPane.showConfirmDialog(null, "Confermi di voler inviare la domanda?", "Conferma domanda", JOptionPane.YES_NO_OPTION);
        if(n == JOptionPane.YES_OPTION) {
            if (type.equals("trn")) {
                msg = chat.invia("trainer",categoria,email,campodomanda.getText());
            }else if(type.equals("med")){
                msg = chat.invia("dottore",categoria,email, campodomanda.getText());
            }
            
            
            if(msg.equals("Domanda inviata correttamente!")) {
                campodomanda.setText("");
                JOptionPane.showMessageDialog(null, "Domanda inviata correttamente.", "Inviata!", JOptionPane.INFORMATION_MESSAGE);
            }else if(msg.equals("Domanda non inviata")) {
                JOptionPane.showMessageDialog(null, "Domanda non inviata!", "Attenzione", JOptionPane.WARNING_MESSAGE);
            }else if(msg.equals("Domanda non inviata! La domanda contiene più di 250 caratteri!")) {
                JOptionPane.showMessageDialog(null, "La domanda contiene più di 250 caratteri", "Attenzione!", JOptionPane.WARNING_MESSAGE);
            }else if(msg.equals("Scrivi il testo della domanda")) {
                JOptionPane.showMessageDialog(null, "Testo non inserito! La prego di inserire il testo!", "Attenzione!", JOptionPane.WARNING_MESSAGE);
            }else if(msg.equals("Selezionare la categoria della domanda")) {
                JOptionPane.showMessageDialog(null, "Categoria non selezionata! La prego di selezionare la categoria!", "Attenzione!", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void indietroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_indietroMouseClicked
        // TODO add your handling code here:
        if (type.equals("trn")) {
            scelta = new SceltaOperazioni("trn");
            scelta.setVisible(true);
            dispose();
            
        }else if(type.equals("med")){
            scelta = new SceltaOperazioni("med");
            scelta.setVisible(true);
            dispose();
        }
        
        
    }//GEN-LAST:event_indietroMouseClicked

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
            java.util.logging.Logger.getLogger(InviaDomanda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InviaDomanda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InviaDomanda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InviaDomanda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InviaDomanda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea campodomanda;
    private javax.swing.JRadioButton cat1;
    private javax.swing.JRadioButton cat2;
    private javax.swing.JRadioButton cat3;
    private javax.swing.JRadioButton cat4;
    private javax.swing.JRadioButton cat5;
    private javax.swing.JLabel indietro;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.ButtonGroup scegliCategoria;
    // End of variables declaration//GEN-END:variables
}
