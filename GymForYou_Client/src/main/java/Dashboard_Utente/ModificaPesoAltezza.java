package Dashboard_Utente;

import Autenticazione.Utente;
import Impostazioni.Xml;
import javax.swing.ImageIcon;

import javax.swing.JOptionPane;

public class ModificaPesoAltezza extends javax.swing.JFrame {
   
    Utente utente;
    Xml xml;
    
    public ModificaPesoAltezza() {
        
        initComponents();
        ImageIcon icon = new ImageIcon("src/main/resources/imageicon.png");
        setIconImage(icon.getImage());
        setTitle("GYM FOR YOU");
        
        setDefaultCloseOperation(ModificaPesoAltezza.DISPOSE_ON_CLOSE);
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pesoattuale = new javax.swing.JLabel();
        altezzaattuale = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        pesonuovo = new javax.swing.JTextField();
        altezzanuovo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(155, 17, 30));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MODIFICA PESO E ALTEZZA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI", 3, 18), new java.awt.Color(255, 255, 102))); // NOI18N

        pesoattuale.setBackground(new java.awt.Color(155, 17, 30));
        pesoattuale.setFont(new java.awt.Font("Yu Gothic UI", 3, 14)); // NOI18N
        pesoattuale.setForeground(new java.awt.Color(255, 255, 102));
        pesoattuale.setText("Peso attuale");

        altezzaattuale.setBackground(new java.awt.Color(155, 17, 30));
        altezzaattuale.setFont(new java.awt.Font("Yu Gothic UI", 3, 14)); // NOI18N
        altezzaattuale.setForeground(new java.awt.Color(255, 255, 102));
        altezzaattuale.setText("Altezza attuale");

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(155, 17, 30));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Yu Gothic UI", 3, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Qui potrai modificare la tua altezza e il tuo peso nel caso in cui subiscano \ndelle variazioni, ricordati che se vuoi calcolare la tua nuova massa grassa, massa \nmagra e se vorrai avere una nuova scheda adatta a te devi  riutilizzare le \nfunzioni dedicate.");
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setBackground(new java.awt.Color(255, 255, 102));
        jButton1.setFont(new java.awt.Font("Yu Gothic UI", 3, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(155, 17, 30));
        jButton1.setText("MODIFICA");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        pesonuovo.setBackground(new java.awt.Color(155, 17, 30));
        pesonuovo.setFont(new java.awt.Font("Yu Gothic UI", 3, 14)); // NOI18N
        pesonuovo.setForeground(new java.awt.Color(255, 255, 102));

        altezzanuovo.setBackground(new java.awt.Color(155, 17, 30));
        altezzanuovo.setFont(new java.awt.Font("Yu Gothic UI", 3, 14)); // NOI18N
        altezzanuovo.setForeground(new java.awt.Color(255, 255, 102));

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 102));
        jLabel1.setText("KG");

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 102));
        jLabel2.setText("CM");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(181, 181, 181))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(altezzaattuale, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pesoattuale, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(132, 132, 132)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pesonuovo)
                    .addComponent(altezzanuovo, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(pesoattuale, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pesonuovo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 202, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(altezzaattuale, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(altezzanuovo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
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

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        //BOTTONE MODIFICA ALTEZZA E PESO
       xml = new Xml();
       utente = new Utente();
        //MODIFICA SOLO PESO
        if(altezzanuovo.getText().isEmpty() ){
            // RICHIAMO IL METODO DELLA CLASSE UTENTE E PASSO I PARAMETRI PRELEVATI DAL TEXT FIELD
            String msg = utente.modificaPesoAltezza(Float.parseFloat(pesonuovo.getText().replace(",", ".")), utente.getAltezza());
            //CONFRONTO IL MESSAGGIO RESTITUITO DAL SERVER CON QUELLO SOTTO
            if(msg.equals("Informazioni Aggiornate")){
            JOptionPane.showMessageDialog(null, "Informazioni fisiche modificate con successo con successo!", "INFORMAZIONI FISICHE MODIFICATE", JOptionPane.INFORMATION_MESSAGE);
            //ELIMINO TUTTI I CARATTERI INSERITI NEL TEXT FIELD
            pesonuovo.setText("");
            altezzanuovo.setText("");
            //
            //SCRIVO FILEXML.SAVE CON I VALORI PRELEVATI DAL DB
            xml.scriviXmlDati(utente.getEmail());
            //
            dispose();
            //SE IL SERVER RESTITUISCE IL MESSAGGIO "CAMPI VUOTI"
            }else if(msg.equals("Campi vuoti")){
                JOptionPane.showMessageDialog(null, "Uno o più campi vuoti", "ATTENZIONE", JOptionPane.WARNING_MESSAGE);
            //SE CI SONO PROBLEMI DI COMUNICAZIONE FRA CLIENT-SERVER
            }else{
                JOptionPane.showMessageDialog(null, "Impossibile modificare peso e/o altezza", "ATTENZIONE", JOptionPane.WARNING_MESSAGE);
            }
            
//******************************************************************************************************************************************************************************************************************            
            
        //MODIFICA SOLO ALTEZZA
        }else if(pesonuovo.getText().isEmpty() ){
            // RICHIAMO IL METODO DELLA CLASSE UTENTE E PASSO I PARAMETRI PRELEVATI DAL TEXT FIELD
            String msg = utente.modificaPesoAltezza(utente.getPeso(), Float.parseFloat(altezzanuovo.getText().replace(",", ".")));
            //CONFRONTO IL MESSAGGIO RESTITUITO DAL SERVER CON QUELLO SOTTO
            if(msg.equals("Informazioni Aggiornate")){
                JOptionPane.showMessageDialog(null, "Informazioni fisiche modificate con successo con successo!", "INFORMAZIONI FISICHE MODIFICATE", JOptionPane.INFORMATION_MESSAGE);
                //ELIMINO TUTTI I CARATTERI INSERITI NEL TEXT FIELD
                pesonuovo.setText("");
                altezzanuovo.setText("");
                //
                //SCRIVO FILEXML.SAVE CON I VALORI PRELEVATI DAL DB
                xml.scriviXmlDati(utente.getEmail());
                //
                dispose();
            //SE IL SERVER RESTITUISCE IL MESSAGGIO "CAMPI VUOTI"
            }else if(msg.equals("Campi vuoti")){
                JOptionPane.showMessageDialog(null, "Uno o più campi vuoti", "ATTENZIONE", JOptionPane.WARNING_MESSAGE);
            //SE CI SONO PROBLEMI DI COMUNICAZIONE FRA CLIENT-SERVER
            }else{
                JOptionPane.showMessageDialog(null, "Impossibile modificare peso e/o altezza", "ATTENZIONE", JOptionPane.WARNING_MESSAGE);
            }
//******************************************************************************************************************************************************************************************************************            
        
        //MODIFICA SIA ALTEZZA CHE PESO
        }else{
            // RICHIAMO IL METODO DELLA CLASSE UTENTE E PASSO I PARAMETRI PRELEVATI DAL TEXT FIELD
            String msg = utente.modificaPesoAltezza(Float.parseFloat(pesonuovo.getText().replace(",", ".")), Float.parseFloat(altezzanuovo.getText().replace(",", ".")));
           //CONFRONTO IL MESSAGGIO RESTITUITO DAL SERVER CON QUELLO SOTTO
            if(msg.equals("Informazioni Aggiornate")){
                JOptionPane.showMessageDialog(null, "Informazioni fisiche modificate con successo con successo!", "INFORMAZIONI FISICHE MODIFICATE", JOptionPane.INFORMATION_MESSAGE);
                //ELIMINO TUTTI I CARATTERI INSERITI NEL TEXT FIELD
                pesonuovo.setText("");
                altezzanuovo.setText("");
                //
                //SCRIVO FILEXML.SAVE CON I VALORI PRELEVATI DAL DB
                xml.scriviXmlDati(utente.getEmail());
                //
                dispose();
            //SE IL SERVER RESTITUISCE IL MESSAGGIO "CAMPI VUOTI"
            }else if(msg.equals("Campi vuoti")){
                JOptionPane.showMessageDialog(null, "Uno o più campi vuoti", "ATTENZIONE", JOptionPane.WARNING_MESSAGE);
            //SE CI SONO PROBLEMI DI COMUNICAZIONE FRA CLIENT-SERVER
            }else{
                JOptionPane.showMessageDialog(null, "Impossibile modificare peso e/o altezza", "ATTENZIONE", JOptionPane.WARNING_MESSAGE);
            }
        }

    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(ModificaPesoAltezza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificaPesoAltezza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificaPesoAltezza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificaPesoAltezza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificaPesoAltezza().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel altezzaattuale;
    private javax.swing.JTextField altezzanuovo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel pesoattuale;
    private javax.swing.JTextField pesonuovo;
    // End of variables declaration//GEN-END:variables
}
