/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import tubespbo_autogatesystem.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author maula
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form test
     */
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        button_register = new javax.swing.JButton();
        field_email = new javax.swing.JTextField();
        label_password = new javax.swing.JLabel();
        label_email = new javax.swing.JLabel();
        label_tidakpunyaakun = new javax.swing.JLabel();
        button_login = new javax.swing.JButton();
        field_password = new javax.swing.JPasswordField();
        label_akuntidaktersedia = new javax.swing.JLabel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 255));
        setMinimumSize(new java.awt.Dimension(700, 530));
        setName("frame_login"); // NOI18N
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        button_register.setBackground(new java.awt.Color(102, 102, 255));
        button_register.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        button_register.setForeground(new java.awt.Color(255, 255, 255));
        button_register.setText("REGISTER");
        button_register.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_registerActionPerformed(evt);
            }
        });
        getContentPane().add(button_register, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, 152, 33));

        field_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field_emailActionPerformed(evt);
            }
        });
        getContentPane().add(field_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 152, -1));

        label_password.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label_password.setText("PASSWORD");
        label_password.setToolTipText("");
        getContentPane().add(label_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, -1, -1));

        label_email.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label_email.setText("EMAIL");
        label_email.setToolTipText("");
        getContentPane().add(label_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 149, -1, -1));

        label_tidakpunyaakun.setText("Tidak punya akun?");
        getContentPane().add(label_tidakpunyaakun, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, -1, -1));

        button_login.setBackground(new java.awt.Color(102, 102, 255));
        button_login.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        button_login.setForeground(new java.awt.Color(255, 255, 255));
        button_login.setText("LOGIN");
        button_login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_loginActionPerformed(evt);
            }
        });
        getContentPane().add(button_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, 152, 33));
        getContentPane().add(field_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, 150, -1));

        label_akuntidaktersedia.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        label_akuntidaktersedia.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(label_akuntidaktersedia, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, 150, 20));

        kGradientPanel1.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setkStartColor(new java.awt.Color(255, 255, 255));

        kGradientPanel2.setkEndColor(new java.awt.Color(0, 255, 204));

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 285, Short.MAX_VALUE)
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("X");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                keluar(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 398, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(0, 514, Short.MAX_VALUE))
        );

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void button_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_loginActionPerformed
        // TODO add your handling code here:
        String email, password;
        
        email = field_email.getText();
        password = field_password.getText();
        
        String role = User.get_role(email, password);
        if ("user".equals(role)){
            LocalDateTime waktu = LocalDateTime.now();
            DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String date = waktu.format(format);
            
            int userid = User.get_userid(email, password);
            System.out.println(userid);
            String[] options = {"NO", "YES" };
            int x = JOptionPane.showOptionDialog(null, "Apakah anda pakai masker?", "Verifikasi Masker", JOptionPane.DEFAULT_OPTION,JOptionPane.WARNING_MESSAGE, null, options, options[0]);
            if (x == 1) {
		//LoginSucces berhasil = new LoginSucces();
		//berhasil.show();
                JOptionPane.showMessageDialog(null, "Selamat, anda diperbolehkan untuk masuk!!");

		
		Boolean masker = true;
		User.input_alatverified(userid, date, masker);
                dispose();

						
            } else if ( x == 0){
		JOptionPane.showMessageDialog(null, "Anda harus pakai masker");
		Boolean masker = false;
		User.input_alatverified(userid, date, masker);
            }
        } else if ("security".equals(role)){
            System.out.println("anda masuk dengan akun security");
            Security_Dashboard_Home securitypage = new Security_Dashboard_Home();
            securitypage.show();
            
            dispose();
        } else if ("datascientist".equals(role)){
            DataScientist_Dashboard_Home datascientistpage = new DataScientist_Dashboard_Home();
            datascientistpage.show();
            dispose();
        } else {
            label_akuntidaktersedia.setText(" akun tidak tersedia!");
        }
        
    }//GEN-LAST:event_button_loginActionPerformed

    private void field_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field_emailActionPerformed

    private void keluar(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_keluar
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_keluar

    private void button_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_registerActionPerformed
        // TODO add your handling code here:
        Register registerpage = new Register();
        registerpage.show();
        dispose();
    }//GEN-LAST:event_button_registerActionPerformed

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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_login;
    private javax.swing.JButton button_register;
    private javax.swing.JTextField field_email;
    private javax.swing.JPasswordField field_password;
    private javax.swing.JLabel jLabel4;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private javax.swing.JLabel label_akuntidaktersedia;
    private javax.swing.JLabel label_email;
    private javax.swing.JLabel label_password;
    private javax.swing.JLabel label_tidakpunyaakun;
    // End of variables declaration//GEN-END:variables
}
