/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author astr4
 */
public class Doctor extends javax.swing.JFrame {

    /**
     * Creates new form Doctor
     */
    public Doctor() {
        initComponents();
        docs.add(drCheckBox1);
        docs.add(drCheckBox2);
        docs.add(drCheckBox3);
        
        hours.add(hourRadioButton1);
        hours.add(hourRadioButton2);
        hours.add(hourRadioButton3);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        docs = new javax.swing.ButtonGroup();
        hours = new javax.swing.ButtonGroup();
        drCheckBox1 = new javax.swing.JCheckBox();
        hourRadioButton1 = new javax.swing.JRadioButton();
        hourRadioButton2 = new javax.swing.JRadioButton();
        drCheckBox2 = new javax.swing.JCheckBox();
        drCheckBox3 = new javax.swing.JCheckBox();
        hourRadioButton3 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        devamButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        drCheckBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        drCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drCheckBox1ActionPerformed(evt);
            }
        });

        hourRadioButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        hourRadioButton1.setText("7:00");
        hourRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hourRadioButton1ActionPerformed(evt);
            }
        });

        hourRadioButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        hourRadioButton2.setText("8:00");

        drCheckBox2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        drCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drCheckBox2ActionPerformed(evt);
            }
        });

        drCheckBox3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        drCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drCheckBox3ActionPerformed(evt);
            }
        });

        hourRadioButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        hourRadioButton3.setText("9:00");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Doktorunuzu seçiniz!");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Saat seçiniz!");

        devamButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        devamButton.setText("Devam");
        devamButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                devamButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(drCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(drCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(devamButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(drCheckBox3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(hourRadioButton1)
                                        .addGap(18, 18, 18)
                                        .addComponent(hourRadioButton2)
                                        .addGap(18, 18, 18)
                                        .addComponent(hourRadioButton3)))
                                .addGap(0, 17, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(drCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(drCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(drCheckBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hourRadioButton1)
                    .addComponent(hourRadioButton2)
                    .addComponent(hourRadioButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(devamButton, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void drCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drCheckBox1ActionPerformed
        // TODO add your handling code here:
        hourRadioButton1.setVisible(false);
        hourRadioButton2.setVisible(true);
        hourRadioButton3.setVisible(true);
    }//GEN-LAST:event_drCheckBox1ActionPerformed

    private void hourRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hourRadioButton1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_hourRadioButton1ActionPerformed

    private void drCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drCheckBox2ActionPerformed
        // TODO add your handling code here:
        hourRadioButton1.setVisible(true);
        hourRadioButton2.setVisible(false);
        hourRadioButton3.setVisible(true);
        
    }//GEN-LAST:event_drCheckBox2ActionPerformed

    private void drCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drCheckBox3ActionPerformed
        // TODO add your handling code here:
        hourRadioButton1.setVisible(true);
        hourRadioButton2.setVisible(true);
        hourRadioButton3.setVisible(false);
    }//GEN-LAST:event_drCheckBox3ActionPerformed

    private void devamButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_devamButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_devamButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
        
            public void run() {
                new Doctor().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton devamButton;
    private javax.swing.ButtonGroup docs;
    javax.swing.JCheckBox drCheckBox1;
    javax.swing.JCheckBox drCheckBox2;
    javax.swing.JCheckBox drCheckBox3;
    private javax.swing.JRadioButton hourRadioButton1;
    private javax.swing.JRadioButton hourRadioButton2;
    private javax.swing.JRadioButton hourRadioButton3;
    private javax.swing.ButtonGroup hours;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
