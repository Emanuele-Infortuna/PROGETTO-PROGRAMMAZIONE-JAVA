/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Consultazioni.Utente;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ValutaRisposta extends javax.swing.JFrame {
    
    MessaggiUtente chat;

    VisualizzaDomandeRisposte tabella;
    /**
     * Creates new form VisualizzaValuta
     * @param domanda
     * @param risposta
     */
    private static String type;
    private static String domanda;
    private static String risposta;
    private static String voto;
    private static String id;
    
    public ValutaRisposta(String type,String id,String domanda, String risposta, String voto) {
        initComponents();
        ImageIcon icon = new ImageIcon("src/main/resources/imageicon.png");
        setIconImage(icon.getImage());
        setTitle("GYM FOR YOU");
        this.type = type;
        this.domanda = domanda;
        this.risposta = risposta;
        this.voto = voto;
        this.id = id;
        
        campodomanda.setText(domanda);
        camporisposta.setText(risposta);
        
        
        if (risposta.equals("") || !voto.equals("") ){
            valutarisposta.setText("");
            spinner.setVisible(false);
            tastoinvia.setVisible(false);
        }
        
    }

    private ValutaRisposta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        campodomanda = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        camporisposta = new javax.swing.JTextArea();
        valutarisposta = new javax.swing.JLabel();
        tastoinvia = new javax.swing.JButton();
        spinner = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(155, 17, 30));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "VISUALIZZA E VALUTA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI", 3, 18), new java.awt.Color(255, 255, 102))); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(620, 630));

        campodomanda.setEditable(false);
        campodomanda.setBackground(new java.awt.Color(155, 17, 30));
        campodomanda.setColumns(20);
        campodomanda.setFont(new java.awt.Font("Yu Gothic UI", 3, 14)); // NOI18N
        campodomanda.setLineWrap(true);
        campodomanda.setRows(5);
        campodomanda.setAutoscrolls(false);
        campodomanda.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Domanda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI", 3, 14), new java.awt.Color(255, 255, 102))); // NOI18N
        jScrollPane1.setViewportView(campodomanda);

        camporisposta.setEditable(false);
        camporisposta.setBackground(new java.awt.Color(155, 17, 30));
        camporisposta.setColumns(20);
        camporisposta.setFont(new java.awt.Font("Yu Gothic UI", 3, 14)); // NOI18N
        camporisposta.setLineWrap(true);
        camporisposta.setRows(5);
        camporisposta.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Risposta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI", 3, 14), new java.awt.Color(255, 255, 102))); // NOI18N
        jScrollPane2.setViewportView(camporisposta);

        valutarisposta.setFont(new java.awt.Font("Yu Gothic UI", 3, 16)); // NOI18N
        valutarisposta.setForeground(new java.awt.Color(255, 255, 102));
        valutarisposta.setText("Valuta risposta");

        tastoinvia.setBackground(new java.awt.Color(255, 255, 102));
        tastoinvia.setFont(new java.awt.Font("Yu Gothic UI", 3, 14)); // NOI18N
        tastoinvia.setText("INVIA VALUTAZIONE");
        tastoinvia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tastoinvia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tastoinviaMouseClicked(evt);
            }
        });

        spinner.setFont(new java.awt.Font("Yu Gothic UI", 3, 14)); // NOI18N
        spinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));
        spinner.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/indietro1.png"))); // NOI18N
        jLabel3.setText("Back");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jScrollPane2)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(valutarisposta, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115)
                        .addComponent(spinner, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tastoinvia)
                        .addGap(96, 96, 96)))
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valutarisposta, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinner, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(tastoinvia)
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
       
        if (type.equals("trn")) {
            
            tabella = new VisualizzaDomandeRisposte("trn");
            tabella.setVisible(true);
            dispose();
            
        }else if(type.equals("med")){
            
            tabella = new VisualizzaDomandeRisposte("med");
            tabella.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void tastoinviaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tastoinviaMouseClicked
        // BOTTONE CLICCA
        chat = new MessaggiUtente();
               
        Integer val = (Integer) spinner.getValue();
        String votoSpinner = val.toString();

        String msg = chat.inviaValutazione(id,votoSpinner);

        if (msg.equals("Valutazione inviata!")) {
            JOptionPane.showMessageDialog(null, "Valutazione effettuata!", "Valutazione inviata", JOptionPane.INFORMATION_MESSAGE);

            if (type.equals("trn")) {
                tabella = new VisualizzaDomandeRisposte("trn");
                tabella.setVisible(true);
                dispose();
            }else if(type.equals("med")){
                tabella = new VisualizzaDomandeRisposte("med");
                tabella.setVisible(true);
                dispose();
            }

        }else if(msg.equals("Valutazione non inviata")){
            JOptionPane.showMessageDialog(null, "Impossibile effettuare la valutazione!", "Valutazione non inviata", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_tastoinviaMouseClicked

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
            java.util.logging.Logger.getLogger(ValutaRisposta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ValutaRisposta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ValutaRisposta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ValutaRisposta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ValutaRisposta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea campodomanda;
    private javax.swing.JTextArea camporisposta;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner spinner;
    private javax.swing.JButton tastoinvia;
    private javax.swing.JLabel valutarisposta;
    // End of variables declaration//GEN-END:variables
}
