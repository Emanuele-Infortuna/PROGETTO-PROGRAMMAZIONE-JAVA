package Autenticazione;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Registrazione extends javax.swing.JFrame {
    
    Utente utente;
    Login login;

    public Registrazione() {
        initComponents();
        
        ImageIcon icon = new ImageIcon("src/main/resources/imageicon.png");
        setIconImage(icon.getImage());
        setTitle("GYM FOR YOU");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        camponome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        campocognome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        campoemail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        campopassword = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        campopasswordconferma = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        campouomo = new javax.swing.JRadioButton();
        campoaltro = new javax.swing.JRadioButton();
        campodonna = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        campoaltezza = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        campopeso = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(155, 17, 30));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "REGISTRAZIONE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI", 3, 18), new java.awt.Color(255, 255, 102))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(255, 255, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 1000));

        jPanel2.setBackground(new java.awt.Color(255, 255, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CREDENZIALI", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI", 3, 18), new java.awt.Color(155, 17, 30))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 3, 12)); // NOI18N
        jLabel1.setText("NOME");

        camponome.setFont(new java.awt.Font("Yu Gothic UI", 3, 12)); // NOI18N
        camponome.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 3, 12)); // NOI18N
        jLabel2.setText("COGNOME");

        campocognome.setFont(new java.awt.Font("Yu Gothic UI", 3, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 3, 12)); // NOI18N
        jLabel3.setText("EMAIL");

        campoemail.setFont(new java.awt.Font("Yu Gothic UI", 3, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 3, 12)); // NOI18N
        jLabel4.setText("PASSWORD");

        campopassword.setFont(new java.awt.Font("Yu Gothic UI", 3, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 3, 12)); // NOI18N
        jLabel5.setText("CONFERMA PASSWORD");

        campopasswordconferma.setFont(new java.awt.Font("Yu Gothic UI", 3, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 3, 12)); // NOI18N
        jLabel6.setText("GENERE");

        campouomo.setBackground(new java.awt.Color(255, 255, 102));
        buttonGroup1.add(campouomo);
        campouomo.setText("Uomo");
        campouomo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campouomoActionPerformed(evt);
            }
        });

        campoaltro.setBackground(new java.awt.Color(255, 255, 102));
        buttonGroup1.add(campoaltro);
        campoaltro.setText("Altro");

        campodonna.setBackground(new java.awt.Color(255, 255, 102));
        buttonGroup1.add(campodonna);
        campodonna.setText("Donna");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(camponome)
                        .addComponent(campocognome)
                        .addComponent(campoemail)
                        .addComponent(campopassword)
                        .addComponent(campopasswordconferma, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(campouomo)
                    .addComponent(campoaltro)
                    .addComponent(campodonna))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(camponome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campocognome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(campouomo)
                        .addGap(35, 35, 35)
                        .addComponent(campoaltro)
                        .addGap(7, 7, 7)
                        .addComponent(campoemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campodonna))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campopassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campopasswordconferma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FISICO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI", 3, 18), new java.awt.Color(155, 17, 30))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI", 3, 12)); // NOI18N
        jLabel7.setText("ALTEZZA (CM)");

        campoaltezza.setFont(new java.awt.Font("Yu Gothic UI", 3, 12)); // NOI18N
        campoaltezza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoaltezzaActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI", 3, 12)); // NOI18N
        jLabel8.setText("PESO (KG)");

        campopeso.setFont(new java.awt.Font("Yu Gothic UI", 3, 12)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(campoaltezza)
                    .addComponent(campopeso, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoaltezza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campopeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(161, Short.MAX_VALUE))
        );

        jButton1.setBackground(new java.awt.Color(155, 17, 30));
        jButton1.setFont(new java.awt.Font("Yu Gothic UI", 3, 18)); // NOI18N
        jButton1.setText("REGISTRATI");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(281, 281, 281)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(289, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(485, Short.MAX_VALUE))
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

    private void campouomoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campouomoActionPerformed
        
    }//GEN-LAST:event_campouomoActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        
        utente = new Utente();
        
        // Se è false significa che l'email inserita è accetabile, poichè non esiste ancora
        if (utente.verificaEmail(campoemail.getText()) == false) {
            
            //CONTROLLA SE LA PASSWORD DI "PASSWORD" E "CONFERMA PASSWORD" SONO UGUALI
            if (campopassword.getText().equals(campopasswordconferma.getText())) {
                //CONTROLLO SE LA NUOVA PASSWORD INSERITA NEL TEXT FIELD HA LUNGHEZZA COMPRESA TRA 8-15 CARATTERI
                int pwd = campopassword.getText().length();
                if (pwd >= 8 && pwd <= 15 ) {
                    // Campo genere
                    String campogenere = "" ;
                    //SE E' SELEZIONATO "UOMO"
                    if(campouomo.isSelected()){
                        campogenere = "U";
                    //SE E' SELEZIONATO "DONNA"
                    }else if(campodonna.isSelected()){
                        campogenere = "D";
                    //SE E' SELEZIONATO "ALTRO"
                    }else if(campoaltro.isSelected()){
                        campogenere = "A";
                    }
                   


                    if((utente.controlloDati(camponome.getText())) && (utente.controlloDati(campocognome.getText()))){
                        
                            //NEL CASO IN CUI VENGONO INSERITI CARATTERI AL POSTO DI NUMERI
                        if (utente.controlloDati(campopeso.getText())) {
                            JOptionPane.showMessageDialog(null, "Il valore inserito nel campo peso non è corretto!", "Attenzione", JOptionPane.WARNING_MESSAGE);
                        }else if(utente.controlloDati(campoaltezza.getText())){
                            JOptionPane.showMessageDialog(null, "Il valore inserito nel campo altezza non è corretto!", "Attenzione", JOptionPane.WARNING_MESSAGE);
                        }else if(!(utente.controlloDati(campopeso.getText())) && !(utente.controlloDati(campoaltezza.getText()))){
                            
                                //RICHIAMO IL METODO DELLA CLASSE E PASSO I PARAMETRI PRELEVATI DAL TEXT FIELD
                                String msg = utente.registrazione(
                                campoemail.getText(),
                                campopassword.getText(),
                                camponome.getText(),
                                campocognome.getText(),
                                campogenere,
                                Float.parseFloat(campopeso.getText().replace(",", ".")),
                                Float.parseFloat(campoaltezza.getText().replace(",", ".")));
                                //CONFRONTO IL MESSAGGIO RESTITUITO DAL SERVER CON QUELLO SOTTO
                                if (msg.equals("Registrazione Effettuata")) {
                                    JOptionPane.showMessageDialog(null, "Registrazione effettuata! Benvenuto/a  "+ camponome.getText() + ", " + campocognome.getText(), "Attenzione", JOptionPane.INFORMATION_MESSAGE);

                                    login = new Login();
                                    login.setVisible(true);
                                    dispose();
                                }else{
                                JOptionPane.showMessageDialog(null, "Registrazione fallita!", "Attenzione", JOptionPane.WARNING_MESSAGE);
                                }
                            
                            
                        }else{
                            JOptionPane.showMessageDialog(null, "Controllare tutti i campi di input!", "Attenzione", JOptionPane.WARNING_MESSAGE);
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "Controllare i campi NOME E/O COGNOME.", "Attenzione", JOptionPane.WARNING_MESSAGE);
                    }
                    
                }else{
                    campopassword.setText("");
                    campopasswordconferma.setText("");
                    JOptionPane.showMessageDialog(null, "La password deve essere compresa tra 8 e 15 caratteri.", "Attenzione", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                campopassword.setText("");
                campopasswordconferma.setText("");
                JOptionPane.showMessageDialog(null, "Le password non coincidono!!!", "Attenzione", JOptionPane.WARNING_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Utente già registrato con questa Email.", "Attenzione", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void campoaltezzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoaltezzaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoaltezzaActionPerformed

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
            java.util.logging.Logger.getLogger(Registrazione.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrazione.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrazione.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrazione.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrazione().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JTextField campoaltezza;
    private javax.swing.JRadioButton campoaltro;
    private javax.swing.JTextField campocognome;
    private javax.swing.JRadioButton campodonna;
    private javax.swing.JTextField campoemail;
    private javax.swing.JTextField camponome;
    private javax.swing.JPasswordField campopassword;
    private javax.swing.JPasswordField campopasswordconferma;
    private javax.swing.JTextField campopeso;
    private javax.swing.JRadioButton campouomo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
