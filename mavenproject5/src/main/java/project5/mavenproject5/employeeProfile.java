/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project5.mavenproject5;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

/**
 *
 * @author hp
 */
public class employeeProfile extends javax.swing.JFrame {

    /**
     * Creates new form employeeProfile
     */
    public employeeProfile() {
        initComponents();
        jLabel8.setVisible(false);
        try {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            String strurl="jdbc:oracle:thin:@localhost:1521:xe";
            Connection con=DriverManager.getConnection(strurl,"c##project","20212022");
            Statement stmt=con.createStatement();
            ResultSet rs2=stmt.executeQuery("select * from Employee where ssn="+login.userid+"");
             if(rs2.next()){ 
             jTextField1.setText("0"+rs2.getString(6));
             jTextField2.setText(rs2.getString(13));
             jTextField4.setText(rs2.getString(8));
             jTextField5.setText(rs2.getString(9));
             jTextField8.setText(rs2.getString(10));
             jPasswordField1.setText(login.pass);
             } 
                  
        } catch (Exception ex) {
            //Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.toString());
        }
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
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.setLayout(null);

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Desktop\\databasepicture\\close.png")); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(314, 11, 19, 21);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Desktop\\databasepicture\\editProfile.jpg")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(86, 11, 162, 149);

        jTextField2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(jTextField2);
        jTextField2.setBounds(74, 220, 210, 32);

        jTextField4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(jTextField4);
        jTextField4.setBounds(74, 260, 210, 32);

        jTextField1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(jTextField1);
        jTextField1.setBounds(74, 180, 210, 32);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Desktop\\databasepicture\\postal.png")); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 340, 30, 30);

        jTextField5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(jTextField5);
        jTextField5.setBounds(74, 300, 210, 32);

        jButton2.setBackground(new java.awt.Color(46, 178, 178));
        jButton2.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Desktop\\databasepicture\\hand.png")); // NOI18N
        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(120, 420, 90, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Desktop\\databasepicture\\phone.png")); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 180, 30, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Desktop\\databasepicture\\gmail.jpg")); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 220, 50, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Desktop\\databasepicture\\city.png")); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(40, 260, 25, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Desktop\\databasepicture\\street.png")); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(40, 300, 25, 30);

        jTextField8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(jTextField8);
        jTextField8.setBounds(74, 340, 210, 32);

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Desktop\\databasepicture\\reset.png")); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(20, 380, 50, 40);
        jPanel1.add(jPasswordField1);
        jPasswordField1.setBounds(70, 380, 210, 30);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 153, 0));
        jLabel8.setText("Done successfully");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(120, 460, 110, 14);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       if(jTextField1.getText().isEmpty()||jTextField2.getText().isEmpty()||jTextField4.getText().isEmpty()||jTextField5.getText().isEmpty()||jTextField8.getText().isEmpty()||jPasswordField1.getText().isEmpty()){
       JOptionPane.showMessageDialog(null, "there is an empty request,please fill it all");jLabel8.setVisible(false);return;
       }
       String gm=jTextField2.getText();
          if (!(Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$",gm )))
           {
            JOptionPane.showMessageDialog(null, "Please enter a valid email", "Error", JOptionPane.ERROR_MESSAGE);jLabel8.setVisible(false);return;
            }
           String city=jTextField4.getText().strip();
          if(!(Pattern.matches("[a-zA-Z]+", city))){JOptionPane.showMessageDialog(null, "make sure to enter correct city","Error", JOptionPane.ERROR_MESSAGE);jLabel8.setVisible(false);return;}
          String street=jTextField5.getText().strip();
          String pastel=jTextField8.getText().strip();
           int pnum=0;
          try{
           pnum=Integer.parseInt(jTextField1.getText().strip());
           if(jTextField1.getText().length()!=10){JOptionPane.showMessageDialog(null, "make sure to enter correct phone number","Error", JOptionPane.ERROR_MESSAGE);jLabel8.setVisible(false);return;}
           }
          catch(Exception ex){JOptionPane.showMessageDialog(null, "phone number is in a wrong format","Error", JOptionPane.ERROR_MESSAGE);jLabel8.setVisible(false);return;}
          String passw=jPasswordField1.getText();
           try {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            String strurl="jdbc:oracle:thin:@localhost:1521:xe";
            Connection con=DriverManager.getConnection(strurl,"c##project","20212022");
            Statement stmt=con.createStatement();
            String str="UPDATE EMPLOYEE  set PHONN_NUMBER='"+pnum+"',GMAIL='"+gm+"',CITY='"+city+"',STREET='"+street+"',PASTEL_CODE='"+pastel+"'where ssn="+login.userid+"";
            stmt.executeUpdate(str);
            con.setAutoCommit(false);
            con.commit();
             ResultSet rs3=stmt.executeQuery("select ACCOUNT_ID from EMPLOYEE where SSN ="+login.userid+"");
            if(rs3.next()){ 
            stmt.executeUpdate("UPDATE USER_ACCOUNT  set ACCOUNT_PASSWORD='"+jPasswordField1.getText()+"'where USER_ACCOUNT.ACCOUNT_ID="+rs3.getInt(1)+"");}
            con.commit();
            jLabel8.setVisible(true);
            con.close();   
        } catch (Exception ex) {
            //Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(employeeProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(employeeProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(employeeProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(employeeProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new employeeProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}