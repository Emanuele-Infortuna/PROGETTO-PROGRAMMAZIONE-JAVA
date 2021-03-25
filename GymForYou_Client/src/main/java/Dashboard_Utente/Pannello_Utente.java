package Dashboard_Utente;

import Autenticazione.Login;
import Autenticazione.Utente;
import Calcolo_Massa.Calcolo_MassaGra_MassaMag;
import Consultazioni.Utente.SceltaOperazioni;
import SchedaForYou.CorpoPerfetto;
import SchedaForYou.Scheda_Gym4You;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Pannello_Utente extends javax.swing.JFrame{

    Utente utente;     
    CompilaQuestionario compila;
    ImpostazioniAccount impo;
    Login login;
    CorpoPerfetto scheda;
    Calcolo_MassaGra_MassaMag calcolo;
    Scheda_Gym4You scheda4you;
    SceltaOperazioni consulta;
    
    public Pannello_Utente() {
        
        initComponents();
        ImageIcon icon = new ImageIcon("src/main/resources/imageicon.png");
        setIconImage(icon.getImage());
        setTitle("GYM FOR YOU");
        
        utente = new Utente();
  
        // CONTROLLO PER VERIFICARE SE UN DETERMINATO UTENTE HA OTTENUTO L'ESITO DEL DOTTORE
        if (utente.getEsito().equals("vuoto")) {
            //CASO IN CUI L'UTENTE HA SCRITTO IL QUESTIONARIO E DEVE ATTENDERE L'ESITO DEL MEDICO
            if (utente.getQuestionario().equals("si")) {
                compilaquestionario.setVisible(false);
                statoquestionario.setText("ESITO = attendi 3 giorni lavoarativi dall'invio del questionario.");
            }
        // CASO IN CUI L'UTENTE HA RICEVUTO L'ESITO NEGATIVO DA PARTE DEL MEDICO
        }else if (utente.getEsito().equals("negativo")) {
            compilaquestionario.setVisible(false);
            statoquestionario.setText("ESITO DOTTORE = negativo.");
        // CASO IN CUI L'UTENTE HA RICEVUTO L'ESITO POSITIVO DA PARTE DEL MEDICO
        }else if(utente.getEsito().equals("positivo")){
            compilaquestionario.setVisible(false);
            statoquestionario.setText("ESITO DOTTORE = Positivo.");
        } 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        compilaquestionario = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        calcolatore = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        impostazioniText = new javax.swing.JLabel();
        impostazioniIcon = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        statoquestionario = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(155, 17, 30));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PANNELLO UTENTE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI", 3, 18), new java.awt.Color(255, 255, 102))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(255, 255, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));

        compilaquestionario.setBackground(new java.awt.Color(255, 255, 102));
        compilaquestionario.setFont(new java.awt.Font("Yu Gothic UI", 3, 12)); // NOI18N
        compilaquestionario.setForeground(new java.awt.Color(255, 0, 51));
        compilaquestionario.setText("Compila questionario");
        compilaquestionario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        compilaquestionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                compilaquestionarioMouseClicked(evt);
            }
        });
        compilaquestionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compilaquestionarioActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 102));
        jButton3.setFont(new java.awt.Font("Yu Gothic UI", 3, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 0, 51));
        jButton3.setText("Scheda  For You");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        calcolatore.setBackground(new java.awt.Color(255, 255, 102));
        calcolatore.setFont(new java.awt.Font("Yu Gothic UI", 3, 12)); // NOI18N
        calcolatore.setForeground(new java.awt.Color(255, 0, 51));
        calcolatore.setText("Calcolatore peso corporeo e delle misurazioni massime muscolari");
        calcolatore.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        calcolatore.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calcolatoreMouseClicked(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(255, 255, 102));
        jButton7.setFont(new java.awt.Font("Yu Gothic UI", 3, 12)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 0, 51));
        jButton7.setText("Calcolo massa magra e massa grassa ");
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });

        impostazioniText.setFont(new java.awt.Font("Yu Gothic UI", 3, 14)); // NOI18N
        impostazioniText.setText("IMPOSTAZIONI ACCOUNT");

        impostazioniIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/impostazioni.png"))); // NOI18N
        impostazioniIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        impostazioniIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                impostazioniIconMouseClicked(evt);
            }
        });

        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logout.png"))); // NOI18N
        logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 3, 14)); // NOI18N
        jLabel2.setText("LOGOUT");

        statoquestionario.setFont(new java.awt.Font("Yu Gothic UI", 3, 10)); // NOI18N
        statoquestionario.setForeground(new java.awt.Color(255, 255, 102));

        jButton1.setBackground(new java.awt.Color(255, 255, 102));
        jButton1.setFont(new java.awt.Font("Yu Gothic UI", 3, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 51));
        jButton1.setText("Consulta Medico");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 102));
        jButton2.setFont(new java.awt.Font("Yu Gothic UI", 3, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 0, 51));
        jButton2.setText("Consulta Trainer");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(487, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(impostazioniText, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(impostazioniIcon)
                            .addComponent(logout))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(32, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(calcolatore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(statoquestionario, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(compilaquestionario, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE))))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(compilaquestionario, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(statoquestionario, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(calcolatore, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(impostazioniIcon)
                    .addComponent(impostazioniText, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 761, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void compilaquestionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compilaquestionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_compilaquestionarioActionPerformed

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        
        // BOTTONE CALCOLA MASSA MAGRA E GRASSA
        calcolo = new Calcolo_MassaGra_MassaMag();
        calcolo.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton7MouseClicked

    private void calcolatoreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calcolatoreMouseClicked
        
        // CALCOLATORE PESO CORPOREO E DELLE MISURAZIONI
        // CONTROLLO PER VERIFICARE SE UN UTENTE HA OTTENUTO UN ESITO POSITIVO
        if (utente.getEsito().equals("vuoto") || utente.getEsito().equals("negativo") ) {
            JOptionPane.showMessageDialog(null, "Per accedere a questa funzionalità devi avere prima compilato il questionario e ottenuto un esito positivo.", "ATTENZIONE", JOptionPane.WARNING_MESSAGE);
        }else{
            
            scheda = new CorpoPerfetto();
            scheda.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_calcolatoreMouseClicked

    private void impostazioniIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_impostazioniIconMouseClicked
        // BOTTONE IMPOSTAZIONI IMMAGINE
        
        impo = new ImpostazioniAccount();
        impo.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_impostazioniIconMouseClicked

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        // BOTTONE LOGOUT
        
        login = new Login();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_logoutMouseClicked

    private void compilaquestionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_compilaquestionarioMouseClicked
        // BOTTONE COMPILA QUESTIONARIO
        compila = new CompilaQuestionario();
        compila.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_compilaquestionarioMouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // BOTTONE SCHEDA FOR YOU
        // CONTROLLO PER VERIFICARE SE UN UTENTE HA OTTENUTO UN ESITO POSITIVO
        
        if (utente.getEsito().equals("vuoto") || utente.getEsito().equals("negativo") ) {
            JOptionPane.showMessageDialog(null, "Per accedere a questa funzionalità devi avere prima compilato il questionario e ottenuto un esito positivo.", "ATTENZIONE", JOptionPane.WARNING_MESSAGE);
        }else{
            if (utente.getPolso()==0 && utente.getCaviglia() == 0) {
                JOptionPane.showMessageDialog(null, "Devi Calcolatore peso corporeo e delle misurazioni massime muscolari", "Attenzione", JOptionPane.WARNING_MESSAGE);
            }else{
                scheda4you = new Scheda_Gym4You();
                scheda4you.setVisible(true);
                dispose();

            }
            
        }
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        
        consulta = new SceltaOperazioni("med");
        consulta.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        consulta = new SceltaOperazioni("trn");
        consulta.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2MouseClicked

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
            java.util.logging.Logger.getLogger(Pannello_Utente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pannello_Utente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pannello_Utente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pannello_Utente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pannello_Utente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calcolatore;
    private javax.swing.JButton compilaquestionario;
    private javax.swing.JLabel impostazioniIcon;
    private javax.swing.JLabel impostazioniText;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel statoquestionario;
    // End of variables declaration//GEN-END:variables
}
