package Dashboard_Utente;

import Autenticazione.Utente;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ModificaPassword extends javax.swing.JFrame {

    Utente utente;
    
    public ModificaPassword() {
        initComponents();
        ImageIcon icon = new ImageIcon("src/main/resources/imageicon.png");
        setIconImage(icon.getImage());
        setTitle("GYM FOR YOU");
        
        //CHIUDERE JFRAME CORRENTE SENZA CHIUDERE INTERO PROGRAMMA
        setDefaultCloseOperation(ModificaPassword.DISPOSE_ON_CLOSE);
      
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        email = new javax.swing.JLabel();
        campoemail = new javax.swing.JTextField();
        vecchiapass = new javax.swing.JLabel();
        nuovapass = new javax.swing.JLabel();
        ripetipass = new javax.swing.JLabel();
        modificaemail = new javax.swing.JButton();
        campovecchiapass = new javax.swing.JPasswordField();
        camponuovapass = new javax.swing.JPasswordField();
        camporipetipass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(155, 17, 30));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "INFORMAZIONI ACCOUNT", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI", 3, 14), new java.awt.Color(255, 255, 102))); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 500));

        email.setFont(new java.awt.Font("Yu Gothic UI", 3, 14)); // NOI18N
        email.setForeground(new java.awt.Color(255, 255, 102));
        email.setText("EMAIL");

        campoemail.setBackground(new java.awt.Color(155, 17, 30));
        campoemail.setFont(new java.awt.Font("Yu Gothic UI", 3, 14)); // NOI18N
        campoemail.setForeground(new java.awt.Color(255, 255, 102));
        campoemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoemailActionPerformed(evt);
            }
        });

        vecchiapass.setFont(new java.awt.Font("Yu Gothic UI", 3, 14)); // NOI18N
        vecchiapass.setForeground(new java.awt.Color(255, 255, 102));
        vecchiapass.setText("VECCHIA PASSWORD");

        nuovapass.setFont(new java.awt.Font("Yu Gothic UI", 3, 14)); // NOI18N
        nuovapass.setForeground(new java.awt.Color(255, 255, 102));
        nuovapass.setText("NUOVA PASSWORD");

        ripetipass.setFont(new java.awt.Font("Yu Gothic UI", 3, 14)); // NOI18N
        ripetipass.setForeground(new java.awt.Color(255, 255, 102));
        ripetipass.setText("RIPETI PASSWORD");

        modificaemail.setBackground(new java.awt.Color(255, 255, 102));
        modificaemail.setFont(new java.awt.Font("Yu Gothic UI", 3, 14)); // NOI18N
        modificaemail.setForeground(new java.awt.Color(155, 17, 30));
        modificaemail.setText("MODIFICA PASSWORD");
        modificaemail.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        modificaemail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modificaemailMouseClicked(evt);
            }
        });

        campovecchiapass.setBackground(new java.awt.Color(155, 17, 30));
        campovecchiapass.setFont(new java.awt.Font("Yu Gothic UI", 3, 14)); // NOI18N
        campovecchiapass.setForeground(new java.awt.Color(255, 255, 102));
        campovecchiapass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campovecchiapassActionPerformed(evt);
            }
        });

        camponuovapass.setBackground(new java.awt.Color(155, 17, 30));
        camponuovapass.setFont(new java.awt.Font("Yu Gothic UI", 3, 14)); // NOI18N
        camponuovapass.setForeground(new java.awt.Color(255, 255, 102));

        camporipetipass.setBackground(new java.awt.Color(155, 17, 30));
        camporipetipass.setFont(new java.awt.Font("Yu Gothic UI", 3, 14)); // NOI18N
        camporipetipass.setForeground(new java.awt.Color(255, 255, 102));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(modificaemail))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(nuovapass, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(camponuovapass, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(campoemail, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(vecchiapass, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(campovecchiapass, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ripetipass, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(camporipetipass, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoemail, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vecchiapass, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campovecchiapass, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nuovapass, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(camponuovapass, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ripetipass, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(camporipetipass, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(modificaemail, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(119, Short.MAX_VALUE))
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

    private void campoemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoemailActionPerformed

    private void modificaemailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificaemailMouseClicked

        // BOTTONE MODIFICA PASSWORD
        utente = new Utente();
        // CONFRONTA EMAIL INSERITA NEL TEXT FIELD CON L'EMAIL PRESENTE NEL FILE FILEXML.SAVE DELL'UTENTE CORRENTE.
        if (campoemail.getText().equals(utente.getEmail())) {
            //CONTROLLO SE LA NUOVA PASSWORD INSERITA NEL TEXT FIELD HA LUNGHEZZA COMPRESA TRA 8-15 CARATTERI
            int pwd = camponuovapass.getText().length();
            if(pwd >= 8 && pwd <= 15  ){
                //CONFRONTO TRA NUOVA PASSWORD E RIPETI PASSWORD
                if (camponuovapass.getText().equals(camporipetipass.getText())) {
                    // RICHIAMO IL METODO DELLA CLASSE UTENTE E PASSO I PARAMETRI PRELEVATI DAL TEXT FIELD
                    String msg = utente.verificaModificaPassword(campoemail.getText(),campovecchiapass.getText(), camponuovapass.getText());
                    //CONFRONTO IL MESSAGGIO RESTITUITO DAL SERVER CON QUELLO SOTTO
                    if (msg.equals("Password modificata con successo!")) {
                        JOptionPane.showMessageDialog(null, "Password modificata con successo!", "PASSWORD MODIFICATA", JOptionPane.INFORMATION_MESSAGE);
                        //APPENA VIENE CLICCATO OK VIENE CHIUSA LA FINESTRA
                        if (JOptionPane.INFORMATION_MESSAGE == 1) {
                            dispose();
                        }
                    // SE IL MESSAGGIO RESTITUITO DAL SERVER E' DIVERSO "PASSWORD MODIFICATA CON SUCCESSO"  
                    }else{
                        //ELIMINO TUTTI I CARATTERI INSERITI NEL TEXT FIELD
                        campoemail.setText("");
                        campovecchiapass.setText("");
                        camponuovapass.setText("");
                        camporipetipass.setText("");
                        //
                        JOptionPane.showMessageDialog(null, "Non è stato possibile modificare la password!", "Attenzione", JOptionPane.WARNING_MESSAGE);
                    }
                // SE NUOVA PASSWORD E RIPETI PASSWORD SONO DIVERSE 
                }else{
                    //ELIMINO TUTTI I CARATTERI INSERITI NEL TEXT FIELD
                    campovecchiapass.setText("");
                    camponuovapass.setText("");
                    camporipetipass.setText("");
                    //
                    JOptionPane.showMessageDialog(null, "Le password non concidono!", "Attenzione", JOptionPane.WARNING_MESSAGE);
                }
            //SE LA PASSWORD NON E' COMPRESA TRA 8-15 CARATTERI
            }else{
                //ELIMINO TUTTI I CARATTERI INSERITI NEL TEXT FIELD
                campovecchiapass.setText("");
                camponuovapass.setText("");
                camporipetipass.setText("");
                //
                JOptionPane.showMessageDialog(null, "La password deve essere compresa tra 8 e 15 caratteri.", "Attenzione", JOptionPane.WARNING_MESSAGE);
            }
            
        // SE L'EMAIL INSERITA NEL TEXT FIELD E' DIVERSA DA QUELLA DEL FILE FILEXML.SAVE   
        }else{
            //ELIMINO TUTTI I CARATTERI INSERITI NEL TEXT FIELD
            campoemail.setText("");
            campovecchiapass.setText("");
            camponuovapass.setText("");
            camporipetipass.setText("");
            JOptionPane.showMessageDialog(null, "Email Errata", "Attenzione", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_modificaemailMouseClicked

    private void campovecchiapassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campovecchiapassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campovecchiapassActionPerformed

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
            java.util.logging.Logger.getLogger(ModificaPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificaPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificaPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificaPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificaPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campoemail;
    private javax.swing.JPasswordField camponuovapass;
    private javax.swing.JPasswordField camporipetipass;
    private javax.swing.JPasswordField campovecchiapass;
    private javax.swing.JLabel email;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton modificaemail;
    private javax.swing.JLabel nuovapass;
    private javax.swing.JLabel ripetipass;
    private javax.swing.JLabel vecchiapass;
    // End of variables declaration//GEN-END:variables
}
