
package com.dgr.swing;

import com.dgr.members.*;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author jerome.lombard
 */
public class Register extends javax.swing.JFrame {
    
    private FenConnexion fenConnexion;
    /**
     * Creates new form Register
     */
    public Register(FenConnexion fenConnexion) {
        initComponents();
        this.fenConnexion = fenConnexion;
        radioLevelMod1.setVisible(false);
        radioLevelMod2.setVisible(false);
        labelSalary.setVisible(false);
        inputSalary.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelFirst_name1 = new javax.swing.JLabel();
        labelTitle = new javax.swing.JLabel();
        buttonValidateRegister = new javax.swing.JButton();
        labelName = new javax.swing.JLabel();
        inputName = new javax.swing.JTextField();
        inputFirst_name = new javax.swing.JTextField();
        labelFirst_name = new javax.swing.JLabel();
        labelBirthYear = new javax.swing.JLabel();
        buttonBack = new javax.swing.JButton();
        inputBirthYear = new javax.swing.JTextField();
        labelBirthYear1 = new javax.swing.JLabel();
        listRole = new javax.swing.JComboBox<>();
        radioLevelMod1 = new javax.swing.JRadioButton();
        radioLevelMod2 = new javax.swing.JRadioButton();
        labelSalary = new javax.swing.JLabel();
        inputSalary = new javax.swing.JTextField();

        labelFirst_name1.setText("Prénom :");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inscription");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        setSize(new java.awt.Dimension(500, 500));

        labelTitle.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        labelTitle.setText("Inscription :");

        buttonValidateRegister.setText("OK");
        buttonValidateRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonValidateRegisterActionPerformed(evt);
            }
        });

        labelName.setText("Nom :");

        inputFirst_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputFirst_nameActionPerformed(evt);
            }
        });

        labelFirst_name.setText("Prénom :");

        labelBirthYear.setText("Année de naissance :");

        buttonBack.setText("Retour");
        buttonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBackActionPerformed(evt);
            }
        });

        inputBirthYear.setToolTipText("");
        inputBirthYear.setName(""); // NOI18N
        inputBirthYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputBirthYearActionPerformed(evt);
            }
        });

        labelBirthYear1.setText("Rôle");

        listRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Utilisateur", "Modérateur", "Directeur" }));
        listRole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listRoleActionPerformed(evt);
            }
        });

        radioLevelMod1.setText("niveau 1");
        radioLevelMod1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioLevelMod1ActionPerformed(evt);
            }
        });

        radioLevelMod2.setText("niveau 2");

        labelSalary.setText("Salaire");

        inputSalary.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(radioLevelMod1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(inputName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(labelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelBirthYear1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelBirthYear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(12, 12, 12))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labelFirst_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(buttonBack)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                        .addGap(18, 18, 18))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(radioLevelMod2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inputSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(153, 153, 153)
                                            .addComponent(buttonValidateRegister))
                                        .addComponent(inputBirthYear)
                                        .addComponent(inputFirst_name)
                                        .addComponent(listRole, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(labelSalary, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGap(50, 50, 50))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(labelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelFirst_name, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputFirst_name, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelBirthYear, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputBirthYear, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelBirthYear1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioLevelMod1)
                    .addComponent(labelSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioLevelMod2)
                    .addComponent(inputSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonValidateRegister)
                    .addComponent(buttonBack))
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonValidateRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonValidateRegisterActionPerformed
        // TODO add your handling code here:
        int birthYear;
        int salary;
        Person personToCreate;
        
        if(listRole.getSelectedItem().equals("Utilisateur")){
            try{
                birthYear = Integer.parseInt(inputBirthYear.getText());
                personToCreate = new User(inputName.getText(), inputFirst_name.getText(), birthYear);
                fenConnexion.listCustomers.getListUsers().add(personToCreate);
                this.setVisible(false);
                fenConnexion.setVisible(true);
            
            }catch(Exception e){
                showMessageDialog(this, "Attention année incorrecte !!");;   
            }
        
        }else if(listRole.getSelectedItem().equals("Modérateur")){
            try{
                birthYear = Integer.parseInt(inputBirthYear.getText());
                personToCreate = new Moderator_level1(inputName.getText(), inputFirst_name.getText(), birthYear, 50);
                fenConnexion.listCustomers.getListUsers().add(personToCreate);
                this.setVisible(false);
                fenConnexion.setVisible(true);
            
            }catch(Exception e){
                showMessageDialog(this, "Attention année incorrecte !!");;   
            }
        
        }else if(listRole.getSelectedItem().equals("Directeur")){
            try{
                birthYear = Integer.parseInt(inputBirthYear.getText());
                salary = Integer.parseInt(inputSalary.getText());
                personToCreate = new Director   (inputName.getText(), inputFirst_name.getText(), birthYear, salary);
                fenConnexion.listCustomers.getListUsers().add(personToCreate);
                this.setVisible(false);
                fenConnexion.setVisible(true);

            }catch(Exception e){
                showMessageDialog(this, "Attention année incorrecte !!");;   
            }
        }
        
        
        
        System.out.println(inputBirthYear.getText());

        
        
    }//GEN-LAST:event_buttonValidateRegisterActionPerformed

    private void inputFirst_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputFirst_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputFirst_nameActionPerformed

    private void buttonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBackActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        fenConnexion.setVisible(true);
    }//GEN-LAST:event_buttonBackActionPerformed

    private void inputBirthYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputBirthYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputBirthYearActionPerformed

    private void listRoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listRoleActionPerformed
        // TODO add your handling code here:
        System.out.println(listRole.getSelectedItem());
        
        if(listRole.getSelectedItem().equals("Modérateur")){
            radioLevelMod1.setVisible(true);
            radioLevelMod2.setVisible(true);
            labelSalary.setVisible(false);
            inputSalary.setVisible(false);
        }else if(listRole.getSelectedItem().equals("Utilisateur")){
            radioLevelMod1.setVisible(false);
            radioLevelMod2.setVisible(false);
            labelSalary.setVisible(false);
            inputSalary.setVisible(false);
        }else if(listRole.getSelectedItem().equals("Directeur")){
            radioLevelMod1.setVisible(false);
            radioLevelMod2.setVisible(false);
            labelSalary.setVisible(true);
            inputSalary.setVisible(true);
        }
    }//GEN-LAST:event_listRoleActionPerformed

    private void radioLevelMod1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioLevelMod1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioLevelMod1ActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBack;
    private javax.swing.JButton buttonValidateRegister;
    private javax.swing.JTextField inputBirthYear;
    private javax.swing.JTextField inputFirst_name;
    private javax.swing.JTextField inputName;
    private javax.swing.JTextField inputSalary;
    private javax.swing.JLabel labelBirthYear;
    private javax.swing.JLabel labelBirthYear1;
    private javax.swing.JLabel labelFirst_name;
    private javax.swing.JLabel labelFirst_name1;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel labelSalary;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JComboBox<String> listRole;
    private javax.swing.JRadioButton radioLevelMod1;
    private javax.swing.JRadioButton radioLevelMod2;
    // End of variables declaration//GEN-END:variables
}
