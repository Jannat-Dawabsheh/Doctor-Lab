package project5.mavenproject5;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Time;
import java.text.ParseException;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

public class Add_Patient extends javax.swing.JFrame {
    Date date;

    public Add_Patient() {
        initComponents();
        
         try {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            String strurl="jdbc:oracle:thin:@localhost:1521:xe";
            Connection con=DriverManager.getConnection(strurl,"c##project","20212022");
            Statement stmt=con.createStatement();
             ResultSet rs=stmt.executeQuery("select EXAMINATION_NAME from EXAMINATION ");
             while(rs.next()){ jComboBox1.addItem(rs.getString(1));} 
                  
        } catch (Exception ex) {
            //Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.toString());
        }
       
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jTextField10 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255,80));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel2.setText("SSN");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 10, 87, 23);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel3.setText("First Name");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 40, 87, 23);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel4.setText("Middle Name");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 70, 87, 23);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel5.setText("Last Name");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 100, 87, 23);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel6.setText("Phone Number");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(30, 130, 84, 23);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel7.setText("Birth Date");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(30, 160, 87, 23);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel8.setText("Consultant");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(30, 190, 113, 23);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel11.setText("Sex");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(30, 220, 113, 23);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel12.setText("Marital status");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(30, 250, 113, 23);

        jTextField1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(120, 10, 85, 23);

        jTextField2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(jTextField2);
        jTextField2.setBounds(120, 40, 85, 23);

        jTextField3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(jTextField3);
        jTextField3.setBounds(120, 70, 85, 23);

        jTextField4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(jTextField4);
        jTextField4.setBounds(120, 100, 85, 23);

        jTextField5.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(jTextField5);
        jTextField5.setBounds(120, 130, 85, 23);

        jTextField6.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(jTextField6);
        jTextField6.setBounds(120, 190, 180, 23);

        jComboBox2.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Female", "Male" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(120, 220, 85, 23);

        jComboBox3.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Married", "divorced", "widow/er" }));
        jPanel1.add(jComboBox3);
        jComboBox3.setBounds(120, 250, 80, 23);

        jButton1.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Desktop\\databasepicture\\hand.png")); // NOI18N
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(310, 280, 215, 29);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel14.setText("Result Value of Examination");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(270, 80, 180, 23);

        jDateChooser1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(jDateChooser1);
        jDateChooser1.setBounds(120, 160, 133, 23);

        jTextField10.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(jTextField10);
        jTextField10.setBounds(450, 80, 80, 27);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel15.setText("Examination name");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(270, 40, 120, 25);

        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(390, 40, 138, 25);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel9.setText("Examination date");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(270, 10, 130, 26);

        jDateChooser2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(jDateChooser2);
        jDateChooser2.setBounds(390, 10, 137, 25);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(150, 70, 570, 340);

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Desktop\\databasepicture\\5.png")); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(10, 10, 40, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Desktop\\databasepicture\\3.jpg")); // NOI18N
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 820, 450);

        setSize(new java.awt.Dimension(824, 450));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         dispose();
       employee_design pa=new employee_design();
        pa.setVisible(true);
       //  pa.setBounds(0, 0, 980, 580);
        pa.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       if(jTextField1.getText().isEmpty()||jTextField10.getText().isEmpty()||jTextField2.getText().isEmpty()||jTextField5.getText().isEmpty()||jTextField3.getText().isEmpty()||jTextField4.getText().isEmpty()||jDateChooser1.getDate().toString().isEmpty()||jDateChooser2.getDate().toString().isEmpty()){
       JOptionPane.showMessageDialog(null, "there is an empty request,please fill it all");
       }
       else{
           float result=0;
           try{
            result=Float.parseFloat(jTextField10.getText().strip());}
           catch(Exception ex){JOptionPane.showMessageDialog(null, "examination result is in a wrong format");}
           String ename=jComboBox1.getSelectedItem().toString();
           int sn=0;
           try{
            sn=Integer.parseInt(jTextField1.getText().strip());if(jTextField1.getText().strip().length()!=9){JOptionPane.showMessageDialog(null, "make sure to enter correct ssn");return;}}
           catch(Exception ex){JOptionPane.showMessageDialog(null, "SSN is in a wrong format");return;}
           Date da=jDateChooser2.getDate();
          String []t1= da.toString().split(" ");
          String t=t1[5]+"-"+t1[1]+"-"+t1[2];
          Date bd=jDateChooser1.getDate();
          String []b= bd.toString().split(" ");
          String birth=b[5]+"-"+b[1]+"-"+b[2];
          char sex;
          if(jComboBox2.getSelectedIndex()==0)sex='F';else sex='M';
          String fname=jTextField2.getText().strip();
          if(!(Pattern.matches("[a-zA-Z]+", fname))){JOptionPane.showMessageDialog(null, "make sure to enter correct Fname");return;}
          String mname=jTextField3.getText().strip();
          if(!(Pattern.matches("[a-zA-Z]+", mname))){JOptionPane.showMessageDialog(null, "make sure to enter correct mname");return;}
          String lname=jTextField4.getText().strip();
          if(!(Pattern.matches("[a-zA-Z]+", lname))){JOptionPane.showMessageDialog(null, "make sure to enter correct lname");return;}
          int pnum=0;
          try{
           pnum=Integer.parseInt(jTextField5.getText().strip());
           if(jTextField5.getText().length()!=10){JOptionPane.showMessageDialog(null, "make sure to enter correct phone number");return;}
           }
          catch(Exception ex){JOptionPane.showMessageDialog(null, "phone number is in a wrong format");return;}
          String ms=jComboBox3.getSelectedItem().toString();
          String cons=jTextField6.getText();
        try {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            String strurl="jdbc:oracle:thin:@localhost:1521:xe";
            Connection con=DriverManager.getConnection(strurl,"c##project","20212022");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select SSN from patiant where SSN ="+sn+"");
            if(!rs.next()){String st="insert into patiant values('"+sn+"','"+fname+"','"+mname+"','"+lname+"','"+pnum+"',{d'"+birth+"'},'"+sex+"','"+ms+"','"+cons+"')";
              stmt.executeUpdate(st);
             con.setAutoCommit(false);
             con.commit();
            }
             String stat="insert into examination_record values(EXAMINATION_RECORD_ID.nextval,{d'"+t+"'},'"+result+"','"+ename+"','"+sn+"')";
             stmt.executeUpdate(stat);
             con.setAutoCommit(false);
             con.commit();
             con.close();
             jTextField1.setText(null);jTextField10.setText(null);jTextField2.setText(null);jTextField3.setText(null);jTextField4.setText(null);jTextField5.setText(null);jDateChooser1.setDate(null);jDateChooser2.setDate(null);jTextField6.setText(null);
                  
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
       } 
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
     
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Add_Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_Patient().setVisible(true);
            }
        });
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
