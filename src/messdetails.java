import javax.swing.*;
import java.util.*;
import java.awt.*;
import net.proteanit.sql.DbUtils;

public class messdetails extends javax.swing.JFrame {
    
    static String str="",str1;
    String radiotext;
    connection con=new connection();
    /**
     * Creates new form messdetails
     */
    public messdetails() {
       
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        transactionbutton = new javax.swing.JButton();
        Rdbutton1 = new javax.swing.JRadioButton();
        Rdbutton3 = new javax.swing.JRadioButton();
        monthtextfield = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        resetbutton = new javax.swing.JButton();
        combox = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        idtextfield = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        messtbl = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        transactionbutton.setText("Transaction");
        transactionbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transactionbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(transactionbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 111, 105, 31));

        buttonGroup1.add(Rdbutton1);
        Rdbutton1.setText("Mess");
        Rdbutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rdbutton1ActionPerformed(evt);
            }
        });
        jPanel1.add(Rdbutton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 208, 112, -1));

        buttonGroup1.add(Rdbutton3);
        Rdbutton3.setText("Student");
        jPanel1.add(Rdbutton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 255, 112, -1));

        monthtextfield.setForeground(new java.awt.Color(102, 102, 102));
        monthtextfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        monthtextfield.setText("MONTH");
        jPanel1.add(monthtextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 252, 127, 28));

        jButton2.setText("Submit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 359, 112, 32));

        resetbutton.setText("Reset");
        resetbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(resetbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 24, -1, -1));

        combox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "gmess", "Mess2", "Mess3", "Mess4" }));
        combox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboxActionPerformed(evt);
            }
        });
        jPanel1.add(combox, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 116, 95, -1));

        jButton1.setText("PRINT");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 470, -1, -1));

        idtextfield.setForeground(new java.awt.Color(102, 102, 102));
        idtextfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        idtextfield.setText("ID");
        idtextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idtextfieldActionPerformed(evt);
            }
        });
        jPanel1.add(idtextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 205, 127, 29));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 507));

        messtbl.setBackground(new java.awt.Color(0, 204, 204));
        messtbl.setForeground(new java.awt.Color(255, 255, 255));
        messtbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "name", "roll", "Title 3", "Title 4", "Title 5"
            }
        ));
        messtbl.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        messtbl.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(messtbl);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 442, 485));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void Rdbutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rdbutton1ActionPerformed
       
        
    }//GEN-LAST:event_Rdbutton1ActionPerformed

    private void transactionbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transactionbuttonActionPerformed
       
        str=combox.getSelectedItem().toString();
        System.out.print(str);
        try{
        con=new connection();
        str1="Select id from mess where name='"+str+"'";
        con.stmt=con.conn.createStatement();
        con.res=con.stmt.executeQuery(str1);
        if(con.res.next()){
            str=con.res.getString(1);
        }
        str1="Select messid as messname,roll,date,time,amount from eat where messid='"+str+"'";
        con.stmt=con.conn.createStatement();
        con.res=con.stmt.executeQuery(str1);
        messtbl.setModel(DbUtils.resultSetToTableModel(con.res));
       
        }
        catch(Exception e){
            System.out.print(e);
        }
    }//GEN-LAST:event_transactionbuttonActionPerformed

    private void comboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboxActionPerformed

    private void idtextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idtextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idtextfieldActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jButton2.setBackground(Color.blue);
        String id=idtextfield.getText();
       String month=monthtextfield.getText();
        try{
            con.stmt=con.conn.createStatement();
        if(Rdbutton1.isSelected()){
             str1="Select transactionid,roll,date,time,amount from eat where messid='"+ id+"' and date like '%/"+month+"/%'" ;
             con.res=con.stmt.executeQuery(str1);
             messtbl.setModel(DbUtils.resultSetToTableModel(con.res));
             }
           
        
        if(Rdbutton3.isSelected()){
             str1="Select transactionid,roll,date,time,amount from eat where roll='"+ id+"' and date like '%/"+month+"/%'" ;
             con.res=con.stmt.executeQuery(str1);
             messtbl.setModel(DbUtils.resultSetToTableModel(con.res));
        }
    }
          catch(Exception ex){
                 System.out.print(ex);                
             }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void resetbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetbuttonActionPerformed
                Rdbutton1.setSelected(false);
                Rdbutton3.setSelected(false);
                idtextfield.setText("ID");
                monthtextfield.setText("MONTH");
                combox.setSelectedIndex(0);
    }//GEN-LAST:event_resetbuttonActionPerformed

    /**
     * @param args the command lne arguments
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
            java.util.logging.Logger.getLogger(messdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(messdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(messdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(messdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new messdetails().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Rdbutton1;
    private javax.swing.JRadioButton Rdbutton3;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox combox;
    private javax.swing.JTextField idtextfield;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable messtbl;
    private javax.swing.JTextField monthtextfield;
    private javax.swing.JButton resetbutton;
    private javax.swing.JButton transactionbutton;
    // End of variables declaration//GEN-END:variables
}