import java.awt.Toolkit;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class loginmain extends javax.swing.JFrame {

    String id,pass;
       public static String comboboxvalue,n,q,roll,sql,sql2;
      connection con = new connection();
       
       
       
    public void close(){
        WindowEvent c= new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(c);
    }
    
    public loginmain() {
        initComponents();
     
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        useridtextbox = new javax.swing.JTextField();
        logincombobox = new javax.swing.JComboBox();
        submitbutton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        passwordfeild = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAutoRequestFocus(false);
        setBounds(new java.awt.Rectangle(40, 60, 100, 200));
        setIconImage(getIconImage());
        setMinimumSize(new java.awt.Dimension(500, 420));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.gray, java.awt.Color.green));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        useridtextbox.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        useridtextbox.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 0, 0), new java.awt.Color(0, 204, 204), null));
        jPanel1.add(useridtextbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 132, -1));

        logincombobox.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        logincombobox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Student", "Admin", "Mess" }));
        logincombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logincomboboxActionPerformed(evt);
            }
        });
        jPanel1.add(logincombobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 132, 30));

        submitbutton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        submitbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Login-in-icon.png"))); // NOI18N
        submitbutton.setText("Login");
        submitbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(submitbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 90, 30));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("USER ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("PASSWORD");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, 20));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("USER");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jLabel5.setFont(new java.awt.Font("Poor Richard", 0, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 102, 255));
        jLabel5.setText("LOGIN");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 140, 50));

        passwordfeild.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        passwordfeild.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 0, 0), new java.awt.Color(0, 204, 204), null));
        jPanel1.add(passwordfeild, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 132, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Nitc_logo.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        jLabel6.setPreferredSize(new java.awt.Dimension(700, 500));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 380, 360));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitbuttonActionPerformed

        id=String.valueOf(useridtextbox.getText());
        pass=String.valueOf(passwordfeild.getText());
        sql="select name from "+comboboxvalue+" where userid='"+id+"' and password='"+pass+"'";
        sql2="select roll from student where userid='"+id+"' and password='"+pass+"'";
        functional(sql,sql2);
                
    }//GEN-LAST:event_submitbuttonActionPerformed
    
    public void functional(String sql,String sql2){
        
        try {
            con.stmt=con.conn.createStatement();
            con.res=con.stmt.executeQuery(sql);
            
            if(con.res.next()){
             JOptionPane.showMessageDialog(null,"welcome");
                   
                   
                   
                   n=con.res.getString(1);
                   q=String.valueOf(useridtextbox.getText());
                  
                switch (comboboxvalue) {
                    case "Student":
                        try{
                            con.stmt=con.conn.createStatement();
                             con.res=con.stmt.executeQuery(sql2);
                            if(con.res.next()) {
                                roll=con.res.getString(1);
                            }
                        }
                        catch(Exception e){
                            JOptionPane.showMessageDialog(null,e);
                        }
                        studentinfo al =new studentinfo();
                        close();
                        al.setVisible(true);
                        al.fix(n,id,pass,roll);
                        
                        break;
                    case "Admin":
                        adminpage a=new adminpage();
                        a.setVisible(true);
                        close();
                        a.getid(n);
                        break;
                    case "Mess":
                            messmain mess=new messmain();
                            close();
                            mess.setVisible(true);
                            mess.setname(n,id);
                 }
                
            }
            else{
               
                JOptionPane.showMessageDialog(null,"Sorry insert correct password and uid");

            }
             
        }
        catch (SQLSyntaxErrorException e) {
            JOptionPane.showMessageDialog(null,"Please select from User");
        }
        catch(SQLException ex){
            System.err.print(ex);
        }
    }
   
    
    
    private void logincomboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logincomboboxActionPerformed

        JComboBox cb=(JComboBox)evt.getSource();
        comboboxvalue=(String)cb.getSelectedItem();

        // TODO add your handling code here:
    }//GEN-LAST:event_logincomboboxActionPerformed

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
            java.util.logging.Logger.getLogger(loginmain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginmain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginmain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginmain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new loginmain().setVisible(true);
                
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox logincombobox;
    private javax.swing.JPasswordField passwordfeild;
    private javax.swing.JButton submitbutton;
    private javax.swing.JTextField useridtextbox;
    // End of variables declaration//GEN-END:variables
}
