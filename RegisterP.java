/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import static Main.Login.DB_URL;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Anushruth
 */
public class RegisterP extends javax.swing.JFrame {

    /**
     * Creates new form RegisterP
     */
    public RegisterP() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    static final String DB_URL="jdbc:mysql://localhost:3306/AMS";
     static final String USER="root";
     static final String PASS="Asranush1326";
     Connection con;
     ResultSet rs;
     Statement stmt;
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        PID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        RID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        PNAME = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        SERVICE = new javax.swing.JTextField();
        Password2 = new javax.swing.JLabel();
        PASSWORD = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        PRANK = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        Password3 = new javax.swing.JLabel();
        PASSWORD1 = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1366, 768));
        setMinimumSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(null);

        jPanel1.setMaximumSize(new java.awt.Dimension(1366, 768));
        jPanel1.setMinimumSize(new java.awt.Dimension(1366, 768));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Swis721 BlkCn BT", 0, 18)); // NOI18N
        jLabel2.setText("PID:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(570, 190, 40, 40);

        PID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PIDActionPerformed(evt);
            }
        });
        jPanel1.add(PID);
        PID.setBounds(610, 190, 180, 40);

        jLabel3.setFont(new java.awt.Font("Swis721 BlkCn BT", 0, 18)); // NOI18N
        jLabel3.setText("RID:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(570, 260, 40, 40);

        RID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RIDActionPerformed(evt);
            }
        });
        jPanel1.add(RID);
        RID.setBounds(610, 260, 170, 40);

        jLabel4.setFont(new java.awt.Font("Swis721 BlkCn BT", 0, 18)); // NOI18N
        jLabel4.setText("Personnel Name:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(480, 330, 130, 40);

        PNAME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PNAMEActionPerformed(evt);
            }
        });
        jPanel1.add(PNAME);
        PNAME.setBounds(610, 330, 250, 40);

        jLabel5.setFont(new java.awt.Font("Swis721 BlkCn BT", 0, 18)); // NOI18N
        jLabel5.setText("Personnel Rank:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(480, 400, 130, 40);

        jLabel6.setFont(new java.awt.Font("Swis721 BlkCn BT", 0, 18)); // NOI18N
        jLabel6.setText("Service:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(540, 470, 60, 40);

        SERVICE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SERVICEActionPerformed(evt);
            }
        });
        jPanel1.add(SERVICE);
        SERVICE.setBounds(610, 470, 150, 40);

        Password2.setFont(new java.awt.Font("Swis721 BlkCn BT", 0, 18)); // NOI18N
        Password2.setText("Password:");
        jPanel1.add(Password2);
        Password2.setBounds(520, 530, 80, 40);

        PASSWORD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PASSWORDActionPerformed(evt);
            }
        });
        jPanel1.add(PASSWORD);
        PASSWORD.setBounds(610, 530, 140, 40);

        jLabel8.setFont(new java.awt.Font("Swis721 BlkCn BT", 0, 36)); // NOI18N
        jLabel8.setText("REGISTER");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(630, 80, 150, 44);

        PRANK.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LIEUTENANT", "CAPTAIN", "MAJOR", "COLONEL", "GENERAL", "FIELD MARSHAL", "DEPARTMENT OF DEFENSE" }));
        PRANK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PRANKActionPerformed(evt);
            }
        });
        jPanel1.add(PRANK);
        PRANK.setBounds(610, 400, 250, 40);

        jButton1.setFont(new java.awt.Font("Capture it", 0, 14)); // NOI18N
        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(610, 650, 150, 30);

        Password3.setFont(new java.awt.Font("Swis721 BlkCn BT", 0, 18)); // NOI18N
        Password3.setText("Confirm Password:");
        jPanel1.add(Password3);
        Password3.setBounds(460, 590, 150, 40);
        jPanel1.add(PASSWORD1);
        PASSWORD1.setBounds(610, 590, 140, 40);

        jButton2.setFont(new java.awt.Font("Capture it", 0, 24)); // NOI18N
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(80, 40, 140, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/soldier-gear-1366x768-machine-gun-combat-helmet-sunset-hd-8157.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(1366, 768));
        jLabel1.setMinimumSize(new java.awt.Dimension(1366, 768));
        jLabel1.setPreferredSize(new java.awt.Dimension(1366, 768));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1370, 770);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1366, 768);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RIDActionPerformed

    private void PNAMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PNAMEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PNAMEActionPerformed

    private void PRANKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PRANKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PRANKActionPerformed

    private void PIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PIDActionPerformed

    private void PASSWORDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PASSWORDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PASSWORDActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
String PEID=PID.getText();
String REID=RID.getText();
String PNA=PNAME.getText();
String PRA=(String)PRANK.getSelectedItem();
int SER=Integer.parseInt(SERVICE.getText());
String PW=PASSWORD.getText();
String conpass=PASSWORD1.getText();
if(PW.equals(conpass))
{
    try{
        Class.forName("java.sql.Driver");
  con=DriverManager.getConnection(DB_URL,USER,PASS);
    String sql;
    sql="CALL SUBMIT('"+PEID+"','"+REID+"','"+PNA+"','"+PRA+"',"+SER+",'"+PW+"');";
stmt=con.createStatement();
    stmt.executeUpdate(sql);    
    JOptionPane.showMessageDialog(this,"Registered Successfully.");
    }
    catch (Exception e){
    e.printStackTrace();
    }
}
else{
    JOptionPane.showMessageDialog(this,"Password Does Not Match!");
    Password2.setForeground(Color.red);
    Password3.setForeground(Color.red);
}
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
this.setVisible(true);
            perhome h=new perhome();
            h.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void SERVICEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SERVICEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SERVICEActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField PASSWORD;
    private javax.swing.JPasswordField PASSWORD1;
    private javax.swing.JTextField PID;
    private javax.swing.JTextField PNAME;
    private javax.swing.JComboBox<String> PRANK;
    private javax.swing.JLabel Password2;
    private javax.swing.JLabel Password3;
    private javax.swing.JTextField RID;
    private javax.swing.JTextField SERVICE;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
