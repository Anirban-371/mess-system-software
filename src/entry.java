
import java.awt.Toolkit;
import java.awt.event.WindowEvent;

public class entry extends javax.swing.JFrame {

    public String str2,str1,str5="";  
    messentry messpage=new messentry();
    public entry() {
        initComponents();
        
        
    }
     public void close(){
        WindowEvent c= new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(c);
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
        jLabel1 = new javax.swing.JLabel();
        backbutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(480, 640));
        setPreferredSize(new java.awt.Dimension(400, 100));
        setResizable(false);

        lblcardno.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblcardno.setForeground(new java.awt.Color(0, 153, 153));
        lblcardno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblcardno.setText("CARD NO.");
        lblcardno.setToolTipText("");

        cardnotextfield.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cardnotextfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblrollno.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblrollno.setForeground(new java.awt.Color(0, 153, 153));
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

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Student Entry");

        backbutton.setText("Back");
        backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cardnobutton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rollnobutton, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblcardno, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblrollno, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rollnotextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cardnotextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblerror, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(backbutton)))
                .addContainerGap(300, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backbutton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(lblerror, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cardnotextfield, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(lblcardno, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addComponent(cardnobutton, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblrollno, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rollnotextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addComponent(rollnobutton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(115, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void sent(String id){
        
        str5=id;
        System.out.println(str5);
         
    }
    private void cardnobuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardnobuttonActionPerformed
        try{
            lblerror.setVisible(true);
            connection con=new connection();
            String cardnumber= cardnotextfield.getText().trim();
            String sql="select roll,name from student where cardid ='"+ cardnumber +"'";
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
        close();
        messpage.setVisible(true);
        messpage.fix(str1,str2,str5);                                                     
    }//GEN-LAST:event_rollnobuttonActionPerformed

    private void rollnotextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rollnotextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rollnotextfieldActionPerformed

    private void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonActionPerformed
       close();
       messmain mess1=new messmain();
       mess1.setVisible(true);
    }//GEN-LAST:event_backbuttonActionPerformed

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
    private javax.swing.JButton backbutton;
    private javax.swing.JButton cardnobutton;
    private javax.swing.JTextField cardnotextfield;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblcardno;
    private javax.swing.JLabel lblerror;
    private javax.swing.JLabel lblrollno;
    private javax.swing.JButton rollnobutton;
    private javax.swing.JTextField rollnotextfield;
    // End of variables declaration//GEN-END:variables
}
