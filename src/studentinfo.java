import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.*;
import java.text.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;



/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rajdeep
 */
public class studentinfo extends javax.swing.JFrame {
private helper h=new helper();

    public static String m,uid,month,pass,name,ro,sql,sql2,sql3,sql4;
    
    /**
     * Creates new form student
     */
    
    public studentinfo() {
        // l.setVisible(false);
       // loginmain l=new loginmain();
            initComponents();    
            
    }
    public void close(){
        WindowEvent clo= new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(clo);
    }
      
    
    
    public void fix(String n,String id,String password,String r){
   try{
       name=n;
       n="welcome "+n;
       welcomelabel.setText(n);
          uid=id;
          pass=password;
          ro=r;
        }
        catch(Exception e){
            System.out.print(e);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        studenttable = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox();
        welcomelabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        submitbutton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        printbutton = new javax.swing.JButton();
        totallb1 = new javax.swing.JLabel();
        totallabel = new javax.swing.JLabel();
        totallb = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAutoRequestFocus(false);
        setResizable(false);
        addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                formMouseWheelMoved(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        studenttable.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        studenttable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "a", "v", "e"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(studenttable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 450, 270));

        jComboBox1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "select", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 125, -1));

        welcomelabel.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        welcomelabel.setForeground(new java.awt.Color(0, 51, 204));
        welcomelabel.setText("jLabel1");
        getContentPane().add(welcomelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 13, 267, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Select month");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        submitbutton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        submitbutton.setText("Submit");
        submitbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(submitbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 80, 30));

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Login-out-icon.png"))); // NOI18N
        jButton1.setText("Log-out");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.gray, java.awt.Color.green));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Total Amount");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, -1, -1));

        printbutton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        printbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Printer-icon.png"))); // NOI18N
        printbutton.setText("Print");
        printbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(printbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 350, 90, 30));

        totallb1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        totallb1.setText("Monthly Bill");
        jPanel1.add(totallb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 100, -1));

        totallabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(totallabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, -1, -1));

        totallb.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(totallb, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 52, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_formMouseWheelMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseWheelMoved

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        JComboBox cb=(JComboBox)evt.getSource();
        m=(String)cb.getSelectedItem();
        m="%/"+m+"/%";       
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed
 
    private void submitbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitbuttonActionPerformed
        sql="select m.name as name ,e.date as date,e.amount as amount from mess m,eat e where e.messid=m.userid and date like '"+m+"'and e.roll='"+ro+"'";
        sql2="select sum(amount) from eat where roll='"+ro+"' and date like'"+m+"'";
        sql3="select roll from student where userid='"+uid+"' and password='"+pass+"' and name='"+name+"'";
        sql4="select sum(amount) from eat where roll='"+ro+"'";
       
        try{
          Connection con=getH().connect();
          PreparedStatement pt=con.prepareStatement(sql);
          ResultSet rs=pt.executeQuery();
          studenttable.setModel(DbUtils.resultSetToTableModel(rs));
          PreparedStatement ps=con.prepareStatement(sql2);
          ResultSet rt=ps.executeQuery();
          PreparedStatement pq=con.prepareStatement(sql4);
          ResultSet r=pq.executeQuery();
          if(rt.next())
              totallb.setText(rt.getString("sum(amount)"));
          if(r.next()){
              totallabel.setText(r.getString("sum(amount)"));
          }   
              
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            System.exit(1);
        }
        
        
            
        
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_submitbuttonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        loginmain l=new loginmain();
        l.setVisible(true);
              
        close();
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void printbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printbuttonActionPerformed
 
        MessageFormat header = new MessageFormat(name+" Mess Bill");
        MessageFormat footer = new MessageFormat("Page,{0,number,integer}");
        try{
            studenttable.print(JTable.PrintMode.NORMAL,header,footer);
        }
        catch(java.awt.print.PrinterException e){
            System.err.format("Cannot print %s %n",e.getMessage());
        }
        
        
    }//GEN-LAST:event_printbuttonActionPerformed

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
            java.util.logging.Logger.getLogger(studentinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(studentinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(studentinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(studentinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
                new studentinfo().setVisible(true);
                
            }
        });
       
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton printbutton;
    private javax.swing.JTable studenttable;
    private javax.swing.JButton submitbutton;
    private javax.swing.JLabel totallabel;
    private javax.swing.JLabel totallb;
    private javax.swing.JLabel totallb1;
    private javax.swing.JLabel welcomelabel;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the h
     */
    public helper getH() {
        return h;
    }

    /**
     * @param h the h to set
     */
    public void setH(helper h) {
        this.h = h;
    }
}
