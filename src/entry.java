/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anirban
 */
import java.sql.*;

 
    
public class entry extends javax.swing.JFrame {

    public String str2,str1;  
    public entry() {
        initComponents();
    }

        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblcardno = new javax.swing.JLabel();
        cardnotextfield = new javax.swing.JTextField();
        lblrollno = new javax.swing.JLabel();
        rollnotextfield = new javax.swing.JTextField();
        rollnobutton = new javax.swing.JButton();
        cardnobutton = new javax.swing.JButton();
        lblerror = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(480, 640));
        setResizable(false);

        lblcardno.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblcardno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblcardno.setText("CARD NO.");
        lblcardno.setToolTipText("");

        cardnotextfield.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cardnotextfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblrollno.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblrollno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblrollno.setText("ROLL NO.");

        rollnotextfield.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        rollnotextfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        rollnotextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rollnotextfieldActionPerformed(evt);
            }
        });

        rollnobutton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        rollnobutton.setText("DONE");
        rollnobutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rollnobuttonActionPerformed(evt);
            }
        });

        cardnobutton.setText("OK");
        cardnobutton.setToolTipText("");
        cardnobutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardnobuttonActionPerformed(evt);
            }
        });

        lblerror.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblerror.setForeground(new java.awt.Color(255, 0, 0));
        lblerror.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(lblerror, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(lblcardno, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(cardnotextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(339, 339, 339)
                        .addComponent(cardnobutton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(lblrollno, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(rollnotextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(rollnobutton, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(lblerror, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblcardno, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(cardnotextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(cardnobutton, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblrollno, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(rollnotextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addComponent(rollnobutton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cardnobuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardnobuttonActionPerformed
        try{
            lblerror.setVisible(true);
            connection con=new connection();
            String cardnumber= cardnotextfield.getText().trim();
            String sql="select roll,name from student where card_id ='"+ cardnumber +"'";
            con.stmt=con.conn.createStatement();
            con.res=con.stmt.executeQuery(sql);
            if(con.res.next()){
                str1=con.res.getString(1);                                       //rollnumber
                str2=con.res.getString(2);                                       //name 
                rollnotextfield.setText(str1);
                lblerror.setVisible(false);
                       
            }else{
                lblerror.setText("Renter cardnumber"); 
                
            }
            
            }   
        
        catch(Exception e){
           
           System.out.print(e);
           
        }
    }//GEN-LAST:event_cardnobuttonActionPerformed

    private void rollnobuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rollnobuttonActionPerformed
       messentry messpage=new messentry();
       messpage.setVisible(true);
       //pass rollnumber and name to the messdetails Jframe
       messpage.fix(str1,str2);                                                     
    }//GEN-LAST:event_rollnobuttonActionPerformed

    private void rollnotextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rollnotextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rollnotextfieldActionPerformed

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
            java.util.logging.Logger.getLogger(entry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(entry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(entry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(entry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() { 
                new entry().setVisible(true);
            }
        });
    
         
     }
     
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cardnobutton;
    private javax.swing.JTextField cardnotextfield;
    private javax.swing.JLabel lblcardno;
    private javax.swing.JLabel lblerror;
    private javax.swing.JLabel lblrollno;
    private javax.swing.JButton rollnobutton;
    private javax.swing.JTextField rollnotextfield;
    // End of variables declaration//GEN-END:variables
}
