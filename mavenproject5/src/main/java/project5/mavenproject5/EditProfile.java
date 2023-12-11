package project5.mavenproject5;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;


public class EditProfile extends javax.swing.JFrame {
    public EditProfile() {
        initComponents();
        jLabel2.setVisible(false);
       try {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            String strurl="jdbc:oracle:thin:@localhost:1521:xe";
            Connection con=DriverManager.getConnection(strurl,"c##project","20212022");
            Statement stmt=con.createStatement();
            ResultSet rs2=stmt.executeQuery("select * from manager where ssn="+login.userid+"");
             if(rs2.next()){ 
             phoneT.setText("0"+rs2.getString(5));
             CityT.setText(rs2.getString(7));
             StreetT.setText(rs2.getString(8));
             GmailT.setText(rs2.getString(11));
             Pastel_codeT.setText(rs2.getString(9));
             jPassword.setText(login.pass);
             } 
                  
        } catch (Exception ex) {
            //Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jLabel44 = new javax.swing.JLabel();
        GmailT = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jPassword = new javax.swing.JPasswordField();
        jLabel46 = new javax.swing.JLabel();
        phoneT = new javax.swing.JTextField();
        updateDBSettings = new javax.swing.JButton();
        jLabel51 = new javax.swing.JLabel();
        CityT = new javax.swing.JTextField();
        StreetT = new javax.swing.JTextField();
        Pastel_codeT = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        jPanel4.setLayout(null);

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setFont(new java.awt.Font("Tempus Sans ITC", 2, 18)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Desktop\\databasepicture\\5.png")); // NOI18N
        jButton7.setBorder(null);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton7);
        jButton7.setBounds(10, 10, 40, 30);

        jLabel44.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel44.setText("Gmail");
        jPanel4.add(jLabel44);
        jLabel44.setBounds(30, 220, 121, 38);

        GmailT.setBackground(new java.awt.Color(240, 240, 240));
        GmailT.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jPanel4.add(GmailT);
        GmailT.setBounds(150, 220, 210, 30);

        jLabel45.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel45.setText("City");
        jPanel4.add(jLabel45);
        jLabel45.setBounds(30, 110, 120, 38);

        jPassword.setBackground(new java.awt.Color(240, 240, 240));
        jPassword.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jPanel4.add(jPassword);
        jPassword.setBounds(150, 320, 210, 30);

        jLabel46.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel46.setText("Phone Number");
        jPanel4.add(jLabel46);
        jLabel46.setBounds(20, 70, 129, 38);

        phoneT.setBackground(new java.awt.Color(240, 240, 240));
        phoneT.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jPanel4.add(phoneT);
        phoneT.setBounds(150, 70, 210, 30);

        updateDBSettings.setBackground(new java.awt.Color(51, 51, 51));
        updateDBSettings.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        updateDBSettings.setForeground(new java.awt.Color(255, 255, 255));
        updateDBSettings.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Desktop\\databasepicture\\hand.png")); // NOI18N
        updateDBSettings.setText("Save");
        updateDBSettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateDBSettingsActionPerformed(evt);
            }
        });
        jPanel4.add(updateDBSettings);
        updateDBSettings.setBounds(70, 390, 232, 43);

        jLabel51.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel51.setText("Password");
        jPanel4.add(jLabel51);
        jLabel51.setBounds(30, 320, 118, 38);

        CityT.setBackground(new java.awt.Color(240, 240, 240));
        CityT.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jPanel4.add(CityT);
        CityT.setBounds(150, 120, 210, 30);

        StreetT.setBackground(new java.awt.Color(240, 240, 240));
        StreetT.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jPanel4.add(StreetT);
        StreetT.setBounds(150, 170, 210, 30);

        Pastel_codeT.setBackground(new java.awt.Color(240, 240, 240));
        Pastel_codeT.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jPanel4.add(Pastel_codeT);
        Pastel_codeT.setBounds(150, 270, 210, 30);

        jLabel52.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel52.setText("Pastel code");
        jPanel4.add(jLabel52);
        jLabel52.setBounds(30, 270, 120, 38);

        jLabel53.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel53.setText("Street");
        jPanel4.add(jLabel53);
        jLabel53.setBounds(30, 160, 120, 38);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel2.setText("Done successfully");
        jPanel4.add(jLabel2);
        jLabel2.setBounds(120, 440, 180, 21);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Desktop\\databasepicture\\maedit.jpg")); // NOI18N
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel4.add(jLabel1);
        jLabel1.setBounds(0, 0, 730, 480);

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        manager_design frame2=new manager_design();
        EditProfile.this.setVisible(false);
        frame2.setVisible(true);

    }//GEN-LAST:event_jButton7ActionPerformed

 
    private void updateDBSettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateDBSettingsActionPerformed
      if(phoneT.getText().isEmpty()||CityT.getText().isEmpty()||StreetT.getText().isEmpty()||GmailT.getText().isEmpty()||Pastel_codeT.getText().isEmpty()||jPassword.getText().isEmpty()){
       JOptionPane.showMessageDialog(null, "there is an empty request,please fill it all");jLabel2.setVisible(false);return;
       }
       String gm=GmailT.getText();
          if (!(Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$",gm )))
           {
            JOptionPane.showMessageDialog(null, "Please enter a valid email", "Error", JOptionPane.ERROR_MESSAGE);jLabel2.setVisible(false);return;
            }
           String city=CityT.getText().strip();
          if(!(Pattern.matches("[a-zA-Z]+", city))){JOptionPane.showMessageDialog(null, "make sure to enter correct city","Error", JOptionPane.ERROR_MESSAGE);jLabel2.setVisible(false);return;}
          String street=StreetT.getText().strip();
          String pastel=Pastel_codeT.getText().strip();
           int pnum=0;
          try{
           pnum=Integer.parseInt(phoneT.getText().strip());
           if(phoneT.getText().length()!=10){JOptionPane.showMessageDialog(null, "make sure to enter correct phone number","Error", JOptionPane.ERROR_MESSAGE);jLabel2.setVisible(false);return;}
           }
          catch(Exception ex){JOptionPane.showMessageDialog(null, "phone number is in a wrong format","Error", JOptionPane.ERROR_MESSAGE);jLabel2.setVisible(false);return;}
           try {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            String strurl="jdbc:oracle:thin:@localhost:1521:xe";
            Connection con=DriverManager.getConnection(strurl,"c##project","20212022");
            Statement stmt=con.createStatement();
            String str="UPDATE manager set PHONN_NUMBER='"+pnum+"',GMAIL='"+gm+"',CITY='"+city+"',STREET='"+street+"',PASTEL_CODE='"+pastel+"'where ssn="+login.userid+"";
            stmt.executeUpdate(str);
            con.setAutoCommit(false);
            con.commit();
             ResultSet rs3=stmt.executeQuery("select ACCOUNT_ID from manager where SSN ="+login.userid+"");
            if(rs3.next()){ 
            stmt.executeUpdate("UPDATE USER_ACCOUNT  set ACCOUNT_PASSWORD='"+jPassword.getText()+"'where USER_ACCOUNT.ACCOUNT_ID="+rs3.getInt(1)+"");}
            con.commit();
            jLabel2.setVisible(true);
            con.close();   
        } catch (Exception ex) {
            //Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        
    }//GEN-LAST:event_updateDBSettingsActionPerformed

    public static void main(String args[]) {
     
          java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new EditProfile().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CityT;
    private javax.swing.JTextField GmailT;
    private javax.swing.JTextField Pastel_codeT;
    private javax.swing.JTextField StreetT;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JTextField phoneT;
    private javax.swing.JButton updateDBSettings;
    // End of variables declaration//GEN-END:variables
}
