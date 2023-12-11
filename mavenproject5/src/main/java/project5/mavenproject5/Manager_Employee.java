package project5.mavenproject5;


import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.swing.JRViewer;
import oracle.jdbc.pool.OracleDataSource;


public class Manager_Employee extends javax.swing.JFrame {
        public static boolean found=false;
        public static String ids;

    private static Connection con;
    String ConnectionURL ="jdbc:oracle:thin:@localhost:1521:XE [c##taima on Default schema]";
 
    public Manager_Employee() {
        initComponents();
        jButton7.setVisible(false);
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Employee_Table = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        jPanel1.setLayout(null);

        jButton3.setBackground(new java.awt.Color(0, 153, 153));
        jButton3.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Desktop\\databasepicture\\6.png")); // NOI18N
        jButton3.setText("Search");
        jButton3.setToolTipText("");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(10, 120, 190, 42);

        jButton7.setBackground(new java.awt.Color(0, 153, 153));
        jButton7.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Desktop\\databasepicture\\salary.png")); // NOI18N
        jButton7.setText("Edit Salary ");
        jButton7.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);
        jButton7.setBounds(420, 180, 160, 40);

        jButton8.setBackground(new java.awt.Color(0, 153, 153));
        jButton8.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Desktop\\databasepicture\\8.png")); // NOI18N
        jButton8.setText("Delete     ");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8);
        jButton8.setBounds(10, 180, 190, 42);

        Employee_Table.setFont(new java.awt.Font("Times New Roman", 0, 8)); // NOI18N
        Employee_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SSN", "F-Nmae", "M-Name", "L-Name", "SHIFT_TIME", "PHONN_NUMBER", "BIRTH_DATE", "CITY", "STRATE", "PASTEL_CODE", "SEX", "SALARY", "GMAIL"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Employee_Table);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 240, 782, 268);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tempus Sans ITC", 2, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Desktop\\databasepicture\\5.png")); // NOI18N
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(10, 11, 42, 34);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Desktop\\databasepicture\\n02.jpg")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(610, 20, 210, 200);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel2.setText("Employy SSN :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(19, 62, 171, 42);

        jTextField1.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(170, 70, 207, 30);
        jPanel1.add(jLabel3);
        jLabel3.setBounds(619, 266, 163, 0);

        jButton2.setBackground(new java.awt.Color(0, 153, 153));
        jButton2.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Desktop\\databasepicture\\15.png")); // NOI18N
        jButton2.setText("View all employee");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(220, 120, 190, 40);

        jButton9.setBackground(new java.awt.Color(0, 153, 153));
        jButton9.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Desktop\\databasepicture\\9.png")); // NOI18N
        jButton9.setText("Add Employee ");
        jButton9.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9);
        jButton9.setBounds(220, 180, 190, 40);

        jButton10.setBackground(new java.awt.Color(0, 153, 153));
        jButton10.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Desktop\\databasepicture\\repicon.png")); // NOI18N
        jButton10.setText("generate report");
        jButton10.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10);
        jButton10.setBounds(420, 120, 160, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 835, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            DefaultTableModel tbModel1=(DefaultTableModel)Employee_Table.getModel();
         tbModel1.setRowCount(0);
        try {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            String strurl="jdbc:oracle:thin:@localhost:1521:xe";
            Connection con=DriverManager.getConnection(strurl,"c##project","20212022");
            Statement stmt=con.createStatement();
            Statement stmt1=con.createStatement();

            String userssn=jTextField1.getText();
            if(userssn.equals("")){
              jTextField1.setBorder(new LineBorder (Color.red,1));}
            else {
            
            int s1=0;
            ids=userssn;
            ResultSet rs=stmt.executeQuery("select * from employee where SSN ="+userssn+"");
           
            while(rs.next()){
              jButton7.setVisible(true);
           String ss=String.valueOf(rs.getInt("SSN"));
               String fn=rs.getString("FNAME");          
               String mn=rs.getString("MNAME");
               String ln=rs.getString("LNAME");
               String st=rs.getString("SHIFT_TIME");
               String pn=String.valueOf(rs.getInt("PHONN_NUMBER"));
               String bd=rs.getString("BIRTH_DATE");
               String c=rs.getString("CITY");
               String s=rs.getString("STREET");
               String pc=rs.getString("PASTEL_CODE");
               String sex=rs.getString("SEX");
               String sa=rs.getString("SALARY");
               String gm=rs.getString("GMAIL");
               String tbData[]={ss,fn,mn,ln,st,pn,bd,c,s,pc,sex,sa,gm};
               tbModel1.addRow(tbData);}
            found=true;
            } 
            }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
            } 
            }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.toString());} 

      

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        EditSalary frame2=new EditSalary();
        frame2.setVisible(true);   
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        manager_design frame2=new manager_design();
        Manager_Employee.this.setVisible(false);
        frame2.setVisible(true);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
         deleteEmployee emp=new deleteEmployee();
        emp.setLocationRelativeTo(null);
        emp.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultTableModel tbModel1=(DefaultTableModel)Employee_Table.getModel();
         tbModel1.setRowCount(0);
        try {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            String strurl="jdbc:oracle:thin:@localhost:1521:xe";
            Connection con=DriverManager.getConnection(strurl,"c##project","20212022");
            Statement stmt=con.createStatement();
            String sql="select * from employee";
            ResultSet rs= stmt.executeQuery(sql);
            while(rs.next()){
               String ss=String.valueOf(rs.getInt("SSN"));
               String fn=rs.getString("FNAME");          
               String mn=rs.getString("MNAME");
               String ln=rs.getString("LNAME");
               String st=rs.getString("SHIFT_TIME");
               String pn=String.valueOf(rs.getInt("PHONN_NUMBER"));
               String bd=rs.getString("BIRTH_DATE");
               String c=rs.getString("CITY");
               String s=rs.getString("STREET");
               String pc=rs.getString("PASTEL_CODE");
               String sex=rs.getString("SEX");
               String sa=rs.getString("SALARY");
               String gm=rs.getString("GMAIL");
               String tbData[]={ss,fn,mn,ln,st,pn,bd,c,s,pc,sex,sa,gm};
               tbModel1.addRow(tbData); }
               con.close();
        }
        catch (SQLException ex) {
            Logger.getLogger(Manager_Employee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
       Add_employee frame2=new Add_employee();
        Manager_Employee.this.setVisible(false);
        frame2.setVisible(true);
        
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
          try {
         
            Connection con;
            InputStream input;
            JasperDesign jasperDesign;
            JasperReport jasperReport;
            JasperPrint jasperPrint;
            OutputStream output;
            OracleDataSource ods;
            ods = new OracleDataSource();
            ods.setURL("jdbc:oracle:thin:@localhost:1521:xe");
            ods.setUser("c##project");
            ods.setPassword("20212022");
            con=ods.getConnection();
            input=new FileInputStream(new File("employee.jrxml"));
            jasperDesign=JRXmlLoader.load(input);
            jasperReport=JasperCompileManager.compileReport(jasperDesign);
            jasperPrint=JasperFillManager.fillReport(jasperReport, null, con);
            JFrame frame = new JFrame("Report");
            frame.getContentPane().add(new JRViewer(jasperPrint));
            frame.pack();
            frame.setSize(700, 600);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);

     
          input.close();
          con.close();

        } catch (Exception ex) {
            //Logger.getLogger(testrecord.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "error");
        }
    }//GEN-LAST:event_jButton10ActionPerformed
public static void main(String args[]) {
     
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Manager_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Manager_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Manager_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Manager_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Manager_Employee().setVisible(true);
            }
        });
    }
     
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Employee_Table;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
