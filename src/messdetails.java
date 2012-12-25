import java.awt.*;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.text.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;

public class messdetails extends javax.swing.JFrame {
    
    static String str="",str1,str2;
    String radiotext;
    connection con=new connection();
    
    
    public messdetails() {
         initComponents();
    }
    
    public void close(){
        WindowEvent c= new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(c);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
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
        lbliderror = new javax.swing.JLabel();
        lblmontherror = new javax.swing.JLabel();
        lblradiobuttonerror = new javax.swing.JLabel();
        backbutton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        messtbl = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 550));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        transactionbutton.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        transactionbutton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        transactionbutton.setForeground(new java.awt.Color(51, 0, 0));
        transactionbutton.setText("Transaction");
        transactionbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transactionbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(transactionbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 110, 40));

        buttonGroup.add(Rdbutton1);
        Rdbutton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Rdbutton1.setText("Mess");
        Rdbutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rdbutton1ActionPerformed(evt);
            }
        });
        jPanel1.add(Rdbutton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 208, 112, -1));

        buttonGroup.add(Rdbutton3);
        Rdbutton3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Rdbutton3.setText("Student");
        jPanel1.add(Rdbutton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 112, -1));

        monthtextfield.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        monthtextfield.setForeground(new java.awt.Color(0, 204, 204));
        monthtextfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        monthtextfield.setText("MONTH");
        jPanel1.add(monthtextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 140, 40));

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 0, 0));
        jButton2.setText("Submit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 140, 50));

        resetbutton.setText("Reset");
        resetbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(resetbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, -1));

        combox.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        combox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select" }));
        combox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboxActionPerformed(evt);
            }
        });
        jPanel1.add(combox, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 116, 110, -1));

        jButton1.setText("PRINT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, -1, -1));

        idtextfield.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        idtextfield.setForeground(new java.awt.Color(0, 204, 204));
        idtextfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        idtextfield.setText("ID");
        idtextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idtextfieldActionPerformed(evt);
            }
        });
        jPanel1.add(idtextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 140, 40));

        lbliderror.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbliderror.setForeground(new java.awt.Color(153, 0, 0));
        lbliderror.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbliderror, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 140, 20));

        lblmontherror.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblmontherror.setForeground(new java.awt.Color(204, 0, 0));
        lblmontherror.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblmontherror, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 140, 20));

        lblradiobuttonerror.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(lblradiobuttonerror, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 120, 20));

        backbutton.setText("Back");
        backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(backbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 290, 507));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 10, 460, 485));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void idsend(String id){
        str2=id;
    }
    
    private void Rdbutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rdbutton1ActionPerformed
           
    }//GEN-LAST:event_Rdbutton1ActionPerformed

    private void transactionbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transactionbuttonActionPerformed
        
        transactionbutton.setBackground(Color.LIGHT_GRAY);
        str=combox.getSelectedItem().toString();
        
        if(str.equals("Select")){
            JOptionPane.showMessageDialog(null,"Select an item");
        }         
                try{
                    con=new connection();
                    str1="Select userid from mess where name='"+str+"'";
                    con.stmt=con.conn.createStatement();
                    con.res=con.stmt.executeQuery(str1);
                    
                    if(con.res.next()){
                        str=con.res.getString(1);
                    }
                    if(str.equals(str2)){
                        str1="Select messid as messname,roll,date,time,amount from eat where messid='"+str+"'";
                        con.stmt=con.conn.createStatement();
                        con.res=con.stmt.executeQuery(str1);
                        messtbl.setModel(DbUtils.resultSetToTableModel(con.res));
                        
                    }else{
                        JOptionPane.showMessageDialog(null,"Select your mess id");
                    }
                }
                
               catch(SQLException | HeadlessException e){
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
        jButton2.setBackground(Color.LIGHT_GRAY);
        String id=idtextfield.getText();
        String month=monthtextfield.getText();
        if(!"".equals(id) && !"".equals(month)){
            try{
                con.stmt=con.conn.createStatement();
                if(Rdbutton1.isSelected()){
                    str1="Select transactionid,roll,date,time,amount from eat where messid='"+ id+"' and date like '%/"+month+"/%'" ;
                    con.res=con.stmt.executeQuery(str1);
                    messtbl.setModel(DbUtils.resultSetToTableModel(con.res));
             
                }else if(Rdbutton3.isSelected()){
                            str1="Select transactionid,roll,date,time,amount from eat where roll='"+ id+"' and date like '%/"+month+"/%'" ;
                            con.res=con.stmt.executeQuery(str1);
                            messtbl.setModel(DbUtils.resultSetToTableModel(con.res));
                        }else{
                            lblradiobuttonerror.setText("**Select one choice");
                 }
            }
            catch(Exception ex){
                    System.out.print(ex);                
             }
        }else if("".equals(id)){
            lbliderror.setText("**Fill the id");
            
        }else if("".equals(month)){
            lblmontherror.setText("**Fill the month");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void resetbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetbuttonActionPerformed
           Rdbutton1.setSelected(false);
           Rdbutton3.setSelected(false);
           idtextfield.setText("ID");
           monthtextfield.setText("MONTH");
           combox.setSelectedIndex(0);
    }//GEN-LAST:event_resetbuttonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MessageFormat header=new MessageFormat("Report Print");
        MessageFormat footer=new MessageFormat("page{0,number,integer}");
        try{
            messtbl.print(JTable.PrintMode.NORMAL, header, footer);
        }catch(Exception ex){
            System.out.print(ex);
        }
            
    }//GEN-LAST:event_jButton1ActionPerformed

    private void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonActionPerformed
        close();
        messmain mess=new messmain();
        mess.setVisible(true);
        mess.view(str2);
          
    }//GEN-LAST:event_backbuttonActionPerformed

    public void addcombo(){
        str="select name from mess";
        try{
            con.stmt=con.conn.createStatement();
            con.res=con.stmt.executeQuery(str);
            while(con.res.next()){
                 combox.addItem(con.res.getString(1));
            }
        }catch(Exception e){
            System.out.print(e);
        }
    }
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
            @Override
            public void run() {
                new messdetails().setVisible(true);
            }
        });
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Rdbutton1;
    private javax.swing.JRadioButton Rdbutton3;
    private javax.swing.JButton backbutton;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JComboBox combox;
    private javax.swing.JTextField idtextfield;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbliderror;
    private javax.swing.JLabel lblmontherror;
    private javax.swing.JLabel lblradiobuttonerror;
    private javax.swing.JTable messtbl;
    private javax.swing.JTextField monthtextfield;
    private javax.swing.JButton resetbutton;
    private javax.swing.JButton transactionbutton;
    // End of variables declaration//GEN-END:variables
}
