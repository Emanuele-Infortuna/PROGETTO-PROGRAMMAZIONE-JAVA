
package Dashboard_Admin;
        
import Autenticazione.Admin;
import Autenticazione.Login;
import Impostazioni.Xml;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Pannello_Admin extends javax.swing.JFrame {

    Admin admin;
    ModificaPassword modifica;
    Login login;
    
  
    public Pannello_Admin() {
        
        initComponents();
        ImageIcon icon = new ImageIcon("src/main/resources/imageicon.png");
        setIconImage(icon.getImage());
        setTitle("GYM FOR YOU");
        
        //RICHIAMO IL METODO SOTTOSTANTE
        visualizzaRighe();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        bottoneInserisci = new javax.swing.JButton();
        bottoneModifica = new javax.swing.JButton();
        bottoneElimina = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        campo_email = new javax.swing.JTextField();
        campo_nome = new javax.swing.JTextField();
        campo_cognome = new javax.swing.JTextField();
        radio_medico = new javax.swing.JRadioButton();
        radio_trainer = new javax.swing.JRadioButton();
        campo_pwdvecchia = new javax.swing.JPasswordField();
        campo_pwdnuova = new javax.swing.JPasswordField();
        campo_pwdripeti = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(155, 17, 30));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PANNELLO AMMINISTRATORE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI", 3, 18), new java.awt.Color(255, 255, 102))); // NOI18N

        jPanel3.setBackground(new java.awt.Color(255, 255, 102));

        jPanel2.setBackground(new java.awt.Color(155, 17, 30));
        jPanel2.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 102));
        jLabel1.setText("Email");

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 102));
        jLabel2.setText("Nome");

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 102));
        jLabel3.setText("Cognome");

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 102));
        jLabel4.setText("Tipo");

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 102));
        jLabel5.setText("Password vecchia");

        bottoneInserisci.setBackground(new java.awt.Color(255, 255, 102));
        bottoneInserisci.setFont(new java.awt.Font("Yu Gothic UI", 3, 14)); // NOI18N
        bottoneInserisci.setForeground(new java.awt.Color(155, 17, 30));
        bottoneInserisci.setText("INSERISCI");
        bottoneInserisci.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bottoneInserisci.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bottoneInserisciMouseClicked(evt);
            }
        });

        bottoneModifica.setBackground(new java.awt.Color(255, 255, 102));
        bottoneModifica.setFont(new java.awt.Font("Yu Gothic UI", 3, 14)); // NOI18N
        bottoneModifica.setForeground(new java.awt.Color(155, 17, 30));
        bottoneModifica.setText("MODIFICA");
        bottoneModifica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bottoneModifica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bottoneModificaMouseClicked(evt);
            }
        });

        bottoneElimina.setBackground(new java.awt.Color(255, 255, 102));
        bottoneElimina.setFont(new java.awt.Font("Yu Gothic UI", 3, 14)); // NOI18N
        bottoneElimina.setForeground(new java.awt.Color(155, 17, 30));
        bottoneElimina.setText("ELIMINA");
        bottoneElimina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bottoneElimina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bottoneEliminaMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI", 3, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 102));
        jLabel8.setText("Password nuova");

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI", 3, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 102));
        jLabel9.setText("Ripeti password");

        campo_email.setBackground(new java.awt.Color(155, 17, 30));
        campo_email.setFont(new java.awt.Font("Yu Gothic UI", 3, 14)); // NOI18N
        campo_email.setForeground(new java.awt.Color(255, 255, 102));
        campo_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_emailActionPerformed(evt);
            }
        });

        campo_nome.setBackground(new java.awt.Color(155, 17, 30));
        campo_nome.setFont(new java.awt.Font("Yu Gothic UI", 3, 14)); // NOI18N
        campo_nome.setForeground(new java.awt.Color(255, 255, 102));

        campo_cognome.setBackground(new java.awt.Color(155, 17, 30));
        campo_cognome.setFont(new java.awt.Font("Yu Gothic UI", 3, 14)); // NOI18N
        campo_cognome.setForeground(new java.awt.Color(255, 255, 102));

        radio_medico.setBackground(new java.awt.Color(155, 17, 30));
        buttonGroup1.add(radio_medico);
        radio_medico.setFont(new java.awt.Font("Yu Gothic UI", 2, 12)); // NOI18N
        radio_medico.setForeground(new java.awt.Color(255, 255, 102));
        radio_medico.setText("Medico");
        radio_medico.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        radio_trainer.setBackground(new java.awt.Color(155, 17, 30));
        buttonGroup1.add(radio_trainer);
        radio_trainer.setFont(new java.awt.Font("Yu Gothic", 3, 12)); // NOI18N
        radio_trainer.setForeground(new java.awt.Color(255, 255, 102));
        radio_trainer.setText("Trainer");
        radio_trainer.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        radio_trainer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_trainerActionPerformed(evt);
            }
        });

        campo_pwdvecchia.setBackground(new java.awt.Color(155, 17, 30));
        campo_pwdvecchia.setFont(new java.awt.Font("Yu Gothic UI", 3, 14)); // NOI18N
        campo_pwdvecchia.setForeground(new java.awt.Color(255, 255, 102));

        campo_pwdnuova.setBackground(new java.awt.Color(155, 17, 30));
        campo_pwdnuova.setFont(new java.awt.Font("Yu Gothic UI", 3, 14)); // NOI18N
        campo_pwdnuova.setForeground(new java.awt.Color(255, 255, 102));

        campo_pwdripeti.setBackground(new java.awt.Color(155, 17, 30));
        campo_pwdripeti.setFont(new java.awt.Font("Yu Gothic UI", 3, 14)); // NOI18N
        campo_pwdripeti.setForeground(new java.awt.Color(255, 255, 102));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(bottoneInserisci, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(bottoneModifica, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(bottoneElimina, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campo_email, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                            .addComponent(campo_nome)
                            .addComponent(campo_cognome)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(radio_medico, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(radio_trainer, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(campo_pwdvecchia)
                            .addComponent(campo_pwdnuova)
                            .addComponent(campo_pwdripeti))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo_email, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo_cognome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radio_medico)
                    .addComponent(radio_trainer))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(campo_pwdvecchia, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo_pwdnuova, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(campo_pwdripeti, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bottoneInserisci, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bottoneModifica, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bottoneElimina, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Email", "Nome", "Cognome", "Voto", "Tipo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/impostazioni.png"))); // NOI18N
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.setPreferredSize(new java.awt.Dimension(50, 49));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logout.png"))); // NOI18N
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.setPreferredSize(new java.awt.Dimension(50, 49));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(155, 17, 30));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("LOGOUT");

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI", 3, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(155, 17, 30));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("MODIFICA PASSWORD");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
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

    //METODO PER VISUALIZZARE LE RIGHE DELLA TABELLA CONTENENTI L'EMAIL, IL NOME E IL COGNOME DEI TRAINER E DEI MEDICI
     private void visualizzaRighe(){
         
        admin = new Admin();
        //METODO PER GESTIRE LA TABELLA
        DefaultTableModel Df = (DefaultTableModel)jTable1.getModel();
        Df.setRowCount(0);
        
        //ISTANZIO L'OGGETTO CONTENENTE IL METODO CHE RITORNA LE RIGHE
        
        //CREO HASHMAP DATI
        Map dati = new HashMap();
        //INIZIALIZZO L'HASHMAP CONTENTE L'EMAIL, NOME E COGNOME DI OGNI TRAINER E MEDICO
        dati = admin.visualizzaRighe();
        //CICLA I TRAINER E I MEDICI CONTENTUTI NELL'HASHMAP
        for (int j=0; j<dati.size(); j=j+5) {
           Vector v2 = new Vector();
           //CREA UNA VETTORE PER CIASCUN TRAINER E MEDICO
           for (int i = 1; i <= dati.size(); i++) {
                //AGGIUNGE L'EMAIL AL VETTORE
                v2.add(dati.get(""+j));
                //AGGIUNGE NOME AL VETTORE
                v2.add(dati.get(""+(j+1)));
                //AGGIUNGE COGNOME AL VETTORE
                v2.add(dati.get(""+(j+2)));
                //AGGIUNGE VOTO AL VETTORE
                v2.add(dati.get(""+(j+3)));
                //AGGIUNGE TIPO AL VETTORE
                v2.add(dati.get(""+(j+4)));
           }     
           //AGGIUNGE LA RIGA ALLA TABELLA CONENTE IL VETTORE SOPRA
           Df.addRow(v2);
        }   
    }
    
    private void radio_trainerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_trainerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_trainerActionPerformed

    private void campo_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_emailActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // ISTRUZIONI PER PRELEVARE L'EMAIL, NOME E CGONME DALLA RIGA E FARLI APPARIRE NEL TEXT FIELD 
        
        DefaultTableModel Df = (DefaultTableModel)jTable1.getModel();
        //INDICE DELLA RIGA DELLA TABELLA
        int selectIndex = jTable1.getSelectedRow();
        
        campo_email.setText(Df.getValueAt(selectIndex,0).toString());
        campo_nome.setText(Df.getValueAt(selectIndex,1).toString());
        campo_cognome.setText(Df.getValueAt(selectIndex,2).toString());
        
        if(Df.getValueAt(selectIndex,4).toString().equals("Medico")){
            radio_medico.setSelected(true);
        }else if(Df.getValueAt(selectIndex,4).toString().equals("Trainer")){
            radio_trainer.setSelected(true);
        }
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void bottoneEliminaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bottoneEliminaMouseClicked
        // ISTRUZIONI PER ELIMINARE UN ACCOUNT DIPENDENTI DELL'ADMIN
        admin = new Admin();
        int dialogResult = JOptionPane.showConfirmDialog(null, "Desideri eliminare questo accout?", "ELIMINAZIONE ACCOUNT", JOptionPane.YES_NO_OPTION);
        if(dialogResult == JOptionPane.YES_OPTION){

            //RICHIAMO IL METODO DELLA CLASSE ADMIN E PASSO I PARAMETRI PRELEVATI DAL TEXT FIELD
            String msg = admin.eliminaAccount(campo_email.getText());
            //CONFRONTO IL MESSAGGIO RESTITUITO DAL SERVER CON QUELLO SOTTO
            if (msg.equals("Account eliminato")) {

                JOptionPane.showMessageDialog(null, "Account Eliminato!", "Account eliminato con successo.", JOptionPane.INFORMATION_MESSAGE);
                //AGGIORNIAMO LE RIGHE DELLA TABELLA
                visualizzaRighe();
            }else if (msg.equals("Impossbile eliminare account")){
                JOptionPane.showMessageDialog(null, "Impossibile Eliminare l'account!", "Attenzione", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_bottoneEliminaMouseClicked

    private void bottoneInserisciMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bottoneInserisciMouseClicked
        // ISTRUZIONI PER INSERIRE UN NUOVO DIPENDENTE
        admin = new Admin();
        //SE È FALSE SIGNIFICA CHE L'EMAIL INSERITA È ACCETABILE, POICHÈ NON ESISTE ANCORA
        if (admin.verificaEmail(campo_email.getText()) == false) {
            //CONTROLLA SE LA PASSWORD DI "PASSWORD" E "CONFERMA PASSWORD" SONO UGUALI
            if (campo_pwdnuova.getText().equals(campo_pwdripeti.getText())) {
                //CONTROLLO SE LA NUOVA PASSWORD INSERITA NEL TEXT FIELD HA LUNGHEZZA COMPRESA TRA 8-15 CARATTERI
                int pwd = campo_pwdnuova.getText().length();
                if (pwd >= 8 && pwd <= 15 ) {
                    //CAMPO GENERE
                    String campogenere = "" ;
                    //SE E' SELEZIONATO "DOTTORE"
                    if(radio_medico.isSelected()){
                        campogenere = "med";
                    //SE E' SELEZIONATO "TRAINER"
                    }else if(radio_trainer.isSelected()){
                        campogenere = "trn";
                    }
                    // RICHIAMO IL METODO DELLA CLASSE ADMIN E PASSO I PARAMETRI PRELEVATI DAL TEXT FIELD
                    String msg = admin.inserisciAccount(campo_email.getText(), campo_nome.getText(),
                                            campo_cognome.getText(), campogenere, campo_pwdnuova.getText());
                    //CONFRONTO IL MESSAGGIO RESTITUITO DAL SERVER CON QUELLO SOTTO
                    if (msg.equals("Registrazione Effettuata")) {
                        //AGGIORNIAMO LE RIGHE DELLA TABELLA
                        visualizzaRighe();
                        JOptionPane.showMessageDialog(null, "Registrazione effettuata!", "Registrazione effettuta", JOptionPane.INFORMATION_MESSAGE);
                        //SVUOTO I TEXTFIELD
                        campo_email.setText("");
                        campo_nome.setText("");
                        campo_cognome.setText("");
                        radio_medico.setEnabled(false);
                        radio_trainer.setEnabled(false);
                        campo_pwdnuova.setText("");
                        campo_pwdripeti.setText("");
                    }else{
                        JOptionPane.showMessageDialog(null, "Registrazione fallita!", "Attenzione", JOptionPane.WARNING_MESSAGE);
                    }
                }else{
                    campo_pwdnuova.setText("");
                    campo_pwdripeti.setText("");
                    JOptionPane.showMessageDialog(null, "La password deve essere compresa tra 8 e 15 caratteri.", "Attenzione", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                campo_pwdnuova.setText("");
                campo_pwdripeti.setText("");
                JOptionPane.showMessageDialog(null, "Le password non coincidono!!!", "Attenzione", JOptionPane.WARNING_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Utente già registrato con questa Email.", "Attenzione", JOptionPane.WARNING_MESSAGE);
        }   
      
    }//GEN-LAST:event_bottoneInserisciMouseClicked

    private void bottoneModificaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bottoneModificaMouseClicked
        // ISTRUZIONI PER MODIFICARE LA PASSWORD DI UN DIPENDENTE
        admin = new Admin();
        String email = campo_email.getText();
        String campogenere = "" ;
        //SE E' SELEZIONATO "DOTTORE"
        if(radio_medico.isSelected()){
            campogenere = "med";
        //SE E' SELEZIONATO "TRAINER"
        }else if(radio_trainer.isSelected()){
            campogenere = "trn";
        }
        //CONTROLLA SE LA PASSWORD DI "PASSWORD" E "RIPETI PASSWORD" SONO UGUALI
        if (campo_pwdnuova.getText().equals(campo_pwdripeti.getText())) {
            //CONTROLLO SE LA NUOVA PASSWORD INSERITA NEL TEXT FIELD HA LUNGHEZZA COMPRESA TRA 8-15 CARATTERI
            int pwd = campo_pwdnuova.getText().length();
            if(pwd >= 8 && pwd <= 15  ){
                
                // RICHIAMO IL METODO DELLA CLASSE ADMIN E PASSO I PARAMETRI PRELEVATI DAL TEXT FIELD
                String msg = admin.verificaModificaPassword(email,campo_pwdvecchia.getText(), campo_pwdnuova.getText());
                // 1° CASO MODIFICA CON SUCCESSO
                if (msg.equals("Password modificata con successo!")) {
                    campo_pwdvecchia.setText("");
                    campo_pwdnuova.setText("");
                    campo_pwdripeti.setText("");
                    JOptionPane.showMessageDialog(null, "Password modificata con successo!", "", JOptionPane.INFORMATION_MESSAGE);
                // 2° CASO CAMPI VUOTI
                }else if (msg.equals("Campi password vuoti!")) {
                    campo_pwdvecchia.setText("");
                    campo_pwdnuova.setText("");
                    campo_pwdripeti.setText("");
                    JOptionPane.showMessageDialog(null, "Uno o più campi sono vuoti!", "Attenzione", JOptionPane.WARNING_MESSAGE);
                //3° CASO MODIFICA FALLITA
                }else if(msg.equals("Modifica password fallita!")){
                    campo_pwdvecchia.setText("");
                    campo_pwdnuova.setText("");
                    campo_pwdripeti.setText("");
                    JOptionPane.showMessageDialog(null, "Modifica password fallita!", "Attenzione", JOptionPane.WARNING_MESSAGE);
                // 4° CASO IN CUI LA VECCHIA PASSWORD NON E' CORRETTA
                }else if (msg.equals("Password non coincidono")) {
                    campo_pwdvecchia.setText("");
                    campo_pwdnuova.setText("");
                    campo_pwdripeti.setText("");
                    JOptionPane.showMessageDialog(null, "Password vecchia errata!", "Attenzione", JOptionPane.WARNING_MESSAGE);
                }
            }else{
                campo_pwdvecchia.setText("");
                campo_pwdnuova.setText("");
                campo_pwdripeti.setText("");
                JOptionPane.showMessageDialog(null, "La password deve essere compresa tra 8 e 15 caratteri.", "Attenzione", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            campo_pwdvecchia.setText("");
            campo_pwdnuova.setText("");
            campo_pwdripeti.setText("");               
            JOptionPane.showMessageDialog(null, "Le password non coincidono!!!", "Attenzione", JOptionPane.WARNING_MESSAGE);
        }
        
        
    }//GEN-LAST:event_bottoneModificaMouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // BOTTONE LOGOUT
        login = new Login();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // BOTTONE MODIFICA PASSWORD ADMIN
        modifica = new ModificaPassword();
        modifica.setVisible(true);
    }//GEN-LAST:event_jLabel10MouseClicked

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
            java.util.logging.Logger.getLogger(Pannello_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pannello_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pannello_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pannello_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pannello_Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bottoneElimina;
    private javax.swing.JButton bottoneInserisci;
    private javax.swing.JButton bottoneModifica;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField campo_cognome;
    private javax.swing.JTextField campo_email;
    private javax.swing.JTextField campo_nome;
    private javax.swing.JPasswordField campo_pwdnuova;
    private javax.swing.JPasswordField campo_pwdripeti;
    private javax.swing.JPasswordField campo_pwdvecchia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton radio_medico;
    private javax.swing.JRadioButton radio_trainer;
    // End of variables declaration//GEN-END:variables
}
