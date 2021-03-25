package Autenticazione;
 
import Impostazioni.Xml;
import Dashboard_Admin.Pannello_Admin;
import Dashboard_Medico.Pannello_Medico;
import Dashboard_Trainer.Pannello_Trainer;
import Dashboard_Utente.Pannello_Utente;
import Impostazioni.Xmlpars;
import java.util.HashMap;
import javax.swing.JOptionPane;
import java.util.Map;
import javax.swing.ImageIcon;

public class Login extends javax.swing.JFrame {
    
    ControllaEmail verifica;
    Utente utente;
    Pannello_Medico pannello;
    Admin admin;
    Xmlpars parser2;
    Pannello_Admin pannello_admin;
    Medico medico;
    Registrazione registra;
    Xml xml;
    Pannello_Trainer pannello_trainer;
    Trainer trn;
    
    public Login() {
        
        initComponents();
        ImageIcon icon = new ImageIcon("src/main/resources/imageicon.png");
        setIconImage(icon.getImage());
        setTitle("GYM FOR YOU");
        
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        emailcampo = new javax.swing.JTextField();
        passwordcampo = new javax.swing.JPasswordField();
        Accesso = new javax.swing.JButton();
        Registrazione = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(155, 17, 30));

        jPanel2.setBackground(new java.awt.Color(255, 255, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "LOGIN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI", 3, 18))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 3, 14)); // NOI18N
        jLabel1.setText("EMAIL");

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 3, 14)); // NOI18N
        jLabel2.setText("PASSWORD");

        emailcampo.setFont(new java.awt.Font("Yu Gothic UI", 3, 14)); // NOI18N
        emailcampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailcampoActionPerformed(evt);
            }
        });

        passwordcampo.setFont(new java.awt.Font("Yu Gothic UI", 3, 14)); // NOI18N
        passwordcampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordcampoActionPerformed(evt);
            }
        });

        Accesso.setBackground(new java.awt.Color(155, 17, 30));
        Accesso.setFont(new java.awt.Font("Yu Gothic UI", 3, 18)); // NOI18N
        Accesso.setText("ACCEDI");
        Accesso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Accesso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AccessoMouseClicked(evt);
            }
        });
        Accesso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccessoActionPerformed(evt);
            }
        });

        Registrazione.setBackground(new java.awt.Color(155, 17, 30));
        Registrazione.setFont(new java.awt.Font("Yu Gothic UI", 3, 14)); // NOI18N
        Registrazione.setText("REGISTRATI");
        Registrazione.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Registrazione.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegistrazioneMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(passwordcampo, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailcampo, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Accesso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Registrazione, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailcampo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordcampo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addComponent(Accesso, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Registrazione, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo_login.png"))); // NOI18N

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(155, 17, 30));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Yu Gothic UI", 3, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("             \n\n             TI DIAMO IL BENVENUTO IN \n                        GYM FOR YOU\n\n\nLA PALESTRA VIRTUALE CHE TI PERMETTERA'\n     DI ALLENARTI A CASA DIVERTENDOTI.\n\n\n              ENJOY WITH GYM FOR YOU");
        jTextArea1.setBorder(null);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(105, Short.MAX_VALUE))
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

    private void emailcampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailcampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailcampoActionPerformed

    private void AccessoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AccessoMouseClicked
        // BOTTONE ACCEDI
         verifica = new ControllaEmail();
        // RICHIAMO IL METODO DELLA CLASSE E PASSO I PARAMETRI PRELEVATI DAL TEXT FIELD
        String msg = verifica.controllo(emailcampo.getText(), passwordcampo.getText());
        //CONFRONTO IL MESSAGGIO RESTITUITO DAL SERVER CON QUELLO SOTTO
        //PRIMO CASO LOGIN=UTENTE
        if(msg.equals("Utente")) {
            
            xml = new Xml();
            xml.scriviXmlDati(emailcampo.getText());
            xml.salvaXmlMisure(emailcampo.getText());
            
            //MOSTRA FINESTRA DASHBOARD UTENTE
            Pannello_Utente dash = new Pannello_Utente();
            dash.setVisible(true);
            dispose();
            
        //SECONDO CASO LOGIN=MEDICO
        }else if(msg.equals("Medico")){
            
            medico = new Medico();
            
            Map dati = new HashMap();
            parser2 = new Xmlpars("filexml.save");
            dati.put("email", emailcampo.getText());
            parser2.ScriviXML("Medico", dati);
            
            //
            pannello = new Pannello_Medico();
            //MOSTRA FINESTRA DASHBOARD DOTTORE
            pannello.setVisible(true);
            dispose();
            
        //TERZO CASO LOGIN=TRAINER        
        }else if(msg.equals("Trainer")){
            
            trn = new Trainer();
            
            Map dati = new HashMap();
            parser2 = new Xmlpars("filexml.save");
            dati.put("email", emailcampo.getText());
            parser2.ScriviXML("Trainer", dati);
            
            
            pannello_trainer = new Pannello_Trainer();
            pannello_trainer.setVisible(true);
            dispose();
            
        //QUARTO CASO LOGIN=ADMIN
        }else if(msg.equals("Admin")){
            
            admin = new Admin();

            //SCRIVO FILEXML.SAVE CON I VALORI PRELEVATI DAL DB
            Map dati = new HashMap();
            parser2 = new Xmlpars("filexml.save");
            dati.put("email", emailcampo.getText());
            parser2.ScriviXML("Admin", dati);
            //
            pannello_admin = new Pannello_Admin();
            pannello_admin.setVisible(true);
            dispose();
        
        }else if(msg.equals("Credenziali errate.")){
            passwordcampo.setText("");
            JOptionPane.showMessageDialog(null, "Credenziali Errate", "Login", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_AccessoMouseClicked

    private void AccessoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccessoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AccessoActionPerformed

    private void passwordcampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordcampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordcampoActionPerformed

    private void RegistrazioneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrazioneMouseClicked
        
        // BUTTON REGISTRAZIONE
        registra = new Registrazione();
        registra.setVisible(true);
        dispose();
   
    }//GEN-LAST:event_RegistrazioneMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Accesso;
    private javax.swing.JButton Registrazione;
    private javax.swing.JTextField emailcampo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPasswordField passwordcampo;
    // End of variables declaration//GEN-END:variables
}
