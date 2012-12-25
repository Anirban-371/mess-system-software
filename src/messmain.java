import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;

public class messmain extends javax.swing.JFrame {
    String str6;
    connection con=new connection();
    public messmain() {
        initComponents();
    }
     public void close(){
        WindowEvent c= new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(c);
    }
     
    public void view(String str2){ 
       lblmessname.setText(str2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblwelcome = new javax.swing.JLabel();
        lblmessname = new javax.swing.JLabel();
        billingbutton = new javax.swing.JButton();
        transactionbutton = new javax.swing.JButton();
        registerbutton = new javax.swing.JButton();
        backbutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 204));
        setPreferredSize(new java.awt.Dimension(600, 400));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblwelcome.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lblwelcome.setForeground(new java.awt.Color(0, 153, 153));
        lblwelcome.setText("Welcome ");
        getContentPane().add(lblwelcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 169, 61));

        lblmessname.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lblmessname.setForeground(new java.awt.Color(0, 153, 153));
        lblmessname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblmessname, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 167, 61));

        billingbutton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        billingbutton.setForeground(new java.awt.Color(51, 0, 0));
        billingbutton.setText("BILLING");
        billingbutton.setPreferredSize(new java.awt.Dimension(80, 25));
        billingbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billingbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(billingbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 160, 30));

        transactionbutton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        transactionbutton.setForeground(new java.awt.Color(51, 0, 0));
        transactionbutton.setText("TRANSACTION");
        transactionbutton.setPreferredSize(new java.awt.Dimension(80, 25));
        transactionbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transactionbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(transactionbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, 130, 30));

        registerbutton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        registerbutton.setForeground(new java.awt.Color(51, 0, 0));
        registerbutton.setText("REGISTER");
        registerbutton.setPreferredSize(new java.awt.Dimension(80, 25));
        registerbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(registerbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 160, 30));

        backbutton.setText("Back");
        backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(backbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void billingbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billingbuttonActionPerformed
         billingbutton.setBackground(Color.lightGray);
         entry ent=new entry();
         ent.sent(str6);
         close();
         ent.setVisible(true);
         //con.close(mess);
    }//GEN-LAST:event_billingbuttonActionPerformed

    private void transactionbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transactionbuttonActionPerformed
         transactionbutton.setBackground(Color.lightGray);
         messdetails mesd=new messdetails();
         mesd.idsend(str6);
         mesd.addcombo();
         close();
         mesd.setVisible(true);
         
         
            
    }//GEN-LAST:event_transactionbuttonActionPerformed

    private void registerbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerbuttonActionPerformed
         registerbutton.setBackground(Color.lightGray);
         messregistration reg= new messregistration();
         close();
         reg.setVisible(true);
       
    }//GEN-LAST:event_registerbuttonActionPerformed

    private void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonActionPerformed
        close();
        loginmain log=new loginmain();
        log.setVisible(true);
    }//GEN-LAST:event_backbuttonActionPerformed
    public void setname(String name,String id){
         lblmessname.setText(name);
         str6=id;
        
         
                
       
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
            java.util.logging.Logger.getLogger(messmain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(messmain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(messmain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(messmain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new messmain().setVisible(true);
            }
        });
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbutton;
    private javax.swing.JButton billingbutton;
    private javax.swing.JLabel lblmessname;
    private javax.swing.JLabel lblwelcome;
    private javax.swing.JButton registerbutton;
    private javax.swing.JButton transactionbutton;
    // End of variables declaration//GEN-END:variables
}
