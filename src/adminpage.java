import java.awt.*;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.MessageFormat;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class adminpage extends javax.swing.JFrame {

    helper h=new helper();
    static String student,mess,id,identity,sql;
   
    public adminpage() {
        initComponents();
        rolltextbox.setVisible(false);
        searchbutton.setVisible(false);
        warninglabel.setVisible(false);
       
    }
public void cleartable(){
    DefaultTableModel dm = (DefaultTableModel)table.getModel();
        dm.getDataVector().removeAllElements();	
        table.repaint();
}
    
    public void getid(String m){
        namelabel.setText(m);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        namelabel = new javax.swing.JLabel();
        searchbutton = new javax.swing.JButton();
        studentbutton = new javax.swing.JButton();
        addbutton = new javax.swing.JButton();
        messbutton = new javax.swing.JButton();
        delbutton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        rolltextbox = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        logoutbutton = new javax.swing.JButton();
        backbutton = new javax.swing.JButton();
        printbutton = new javax.swing.JButton();
        warninglabel = new javax.swing.JLabel();
        speclabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.gray, java.awt.Color.green));

        namelabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        namelabel.setForeground(new java.awt.Color(102, 153, 255));
        namelabel.setText("name");

        searchbutton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        searchbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/search.png"))); // NOI18N
        searchbutton.setText("SEARCH");
        searchbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbuttonActionPerformed(evt);
            }
        });

        studentbutton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        studentbutton.setText("STUDENT");
        studentbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentbuttonActionPerformed(evt);
            }
        });

        addbutton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Actions-list-add-icon.png"))); // NOI18N
        addbutton.setText("ADD");
        addbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbuttonActionPerformed(evt);
            }
        });

        messbutton.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        messbutton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        messbutton.setText("MESS");
        messbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messbuttonActionPerformed(evt);
            }
        });

        delbutton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        delbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/delete-icon.png"))); // NOI18N
        delbutton.setText("DEL");
        delbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delbuttonActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "NAME", "USERID", "PASSWORD"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setToolTipText("");
        jScrollPane1.setViewportView(table);

        rolltextbox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rolltextbox.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.gray, null, null));
        rolltextbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rolltextboxActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 153, 255));
        jLabel1.setText("Welcome");

        logoutbutton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        logoutbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Login-out-icon.png"))); // NOI18N
        logoutbutton.setText("LOGOUT");
        logoutbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutbuttonActionPerformed(evt);
            }
        });

        backbutton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        backbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/back.png"))); // NOI18N
        backbutton.setText("BACK");
        backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonActionPerformed(evt);
            }
        });

        printbutton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        printbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Printer-icon.png"))); // NOI18N
        printbutton.setText("PRINT");
        printbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printbuttonActionPerformed(evt);
            }
        });

        warninglabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        warninglabel.setForeground(new java.awt.Color(204, 0, 204));
        warninglabel.setText("Result not Found");

        speclabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        speclabel.setForeground(new java.awt.Color(255, 0, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(logoutbutton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backbutton)
                        .addGap(67, 67, 67)
                        .addComponent(printbutton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(studentbutton)
                        .addGap(36, 36, 36)
                        .addComponent(messbutton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addbutton)
                        .addGap(32, 32, 32)
                        .addComponent(delbutton)))
                .addGap(87, 87, 87))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(10, 10, 10)
                        .addComponent(namelabel)
                        .addGap(87, 87, 87)
                        .addComponent(speclabel)
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(warninglabel, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(rolltextbox, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(searchbutton)))
                        .addGap(107, 107, 107))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchbutton)
                            .addComponent(rolltextbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(speclabel))
                        .addGap(16, 16, 16)
                        .addComponent(warninglabel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(namelabel))))
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(studentbutton)
                    .addComponent(messbutton)
                    .addComponent(addbutton)
                    .addComponent(delbutton))
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoutbutton)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(printbutton)
                        .addComponent(backbutton)))
                .addGap(19, 19, 19))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 668, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void studentbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentbuttonActionPerformed
        student="student";
        messbutton.setVisible(false);
        mess="";
        rolltextbox.setVisible(true);
        searchbutton.setVisible(true);
        studentbutton.setBackground(Color.CYAN);
        speclabel.setText("ROLL");

    }//GEN-LAST:event_studentbuttonActionPerformed
    public void close(){
        WindowEvent c = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(c);
    }
    private void addbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbuttonActionPerformed
        if(student.equals("student")){
            registration r=new registration();
            r.setVisible(true);
        }
        else if(mess.equals("mess")){
            messregistration m=new messregistration();
            m.setVisible(true);
            
        }
       
    }//GEN-LAST:event_addbuttonActionPerformed

    private void delbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delbuttonActionPerformed

        JOptionPane.showMessageDialog(null,"You really want to Delete");
        if(mess.equals("mess")){
        sql="delete from mess where name='"+identity+"'";
        h.runquery(sql,0);
        
        }
        else if(student.equals("student")){
            sql="delete from student where roll='"+identity+"'";
            h.runquery(sql,0);
        }
         cleartable(); 
        
        // TODO add your handling code here:
    }//GEN-LAST:event_delbuttonActionPerformed

    private void searchbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbuttonActionPerformed
        identity=rolltextbox.getText();     
        if(student.equals("student")){
            try{
                Connection con;
                con=h.connect();
                sql="select name as NAME,userid as USERID,password as PASSWORD from student where roll='"+identity+"'";
                PreparedStatement ps=con.prepareStatement(sql);
                PreparedStatement p=con.prepareStatement(sql);
                ResultSet rs=ps.executeQuery();
                ResultSet r=p.executeQuery();
                if(r.next()){
                    warninglabel.setVisible(false);
                    table.setModel(DbUtils.resultSetToTableModel(rs));
                }
                else{
                    warninglabel.setVisible(true);
                    cleartable();
                }
                    
             
                }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }
                       
        }
        else if(mess.equals("mess")){
            try{
                Connection con;
                con=h.connect();
                sql="select name as NAME,userid as USERID,password as PASSWORD from mess where name='"+identity+"'";
               PreparedStatement ps=con.prepareStatement(sql);
                PreparedStatement p=con.prepareStatement(sql);
                ResultSet rs=ps.executeQuery();
                ResultSet r=p.executeQuery();
                if(r.next()){
                    warninglabel.setVisible(false);
                    table.setModel(DbUtils.resultSetToTableModel(rs));
                }
                else{
                    warninglabel.setVisible(true);
                    cleartable();
                }
                }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }
        }
        
    }//GEN-LAST:event_searchbuttonActionPerformed
   
    private void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonActionPerformed

       
           messbutton.setVisible(true);
           studentbutton.setVisible(true);
           rolltextbox.setText("");
           cleartable();
           rolltextbox.setVisible(false);
            searchbutton.setVisible(false);
             messbutton.setBackground(Color.white);
             studentbutton.setBackground(Color.white);
             student=null;
             mess=null;
             speclabel.setText("");
      
    }//GEN-LAST:event_backbuttonActionPerformed

    private void messbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messbuttonActionPerformed
        studentbutton.setVisible(false);
        mess="mess";
        student="";
        rolltextbox.setVisible(true);
        searchbutton.setVisible(true);
        messbutton.setBackground(Color.GREEN);
        speclabel.setText("NAME");

    }//GEN-LAST:event_messbuttonActionPerformed

    private void printbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printbuttonActionPerformed

        MessageFormat header= new MessageFormat("Report");
        MessageFormat footer=new MessageFormat("Page{0,number,integer}");
        try{
            table.print(JTable.PrintMode.NORMAL, header, footer);
        }
        catch(java.awt.print.PrinterException e){
            System.err.format("cannot print %s%n",e.getMessage());
        }
        
      
    }//GEN-LAST:event_printbuttonActionPerformed

    private void logoutbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutbuttonActionPerformed

        loginmain l=new loginmain();
        l.setVisible(true);
        WindowEvent e=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(e);
    
    }//GEN-LAST:event_logoutbuttonActionPerformed

    private void rolltextboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rolltextboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rolltextboxActionPerformed
   
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
            java.util.logging.Logger.getLogger(adminpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminpage().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbutton;
    private javax.swing.JButton backbutton;
    private javax.swing.JButton delbutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logoutbutton;
    private javax.swing.JButton messbutton;
    private javax.swing.JLabel namelabel;
    private javax.swing.JButton printbutton;
    private javax.swing.JTextField rolltextbox;
    private javax.swing.JButton searchbutton;
    private javax.swing.JLabel speclabel;
    private javax.swing.JButton studentbutton;
    private javax.swing.JTable table;
    private javax.swing.JLabel warninglabel;
    // End of variables declaration//GEN-END:variables
}