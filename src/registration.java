import java.awt.*;
import java.awt.event.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

public class registration extends javax.swing.JFrame {

    helper h=new helper();
    numbergenerate gen=new numbergenerate();
    String sname,sroll,spassword,shostel,suserid,sphone,temp,sl;
    /**
     * Creates new form student
     */
    public registration() {
        initComponents();
        warninglabel.setVisible(false);
    }
 public String cardnumber(){
     String card;
     String day,month,year,second,hour,minute;
     Calendar c = new GregorianCalendar();
     day=String.valueOf(c.get(Calendar.DAY_OF_MONTH));
     month=String.valueOf(c.get(Calendar.MONTH)+1);
     year=String.valueOf(c.get(Calendar.YEAR));
     card=day+month+year;
     return(card);
     
 }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        roll = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        hostel = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        submit = new javax.swing.JButton();
        exitbutton = new javax.swing.JButton();
        userid = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        warninglabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("FORM");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("NAME");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 256, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("ROLL ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 67, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("PHONE");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 294, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("PASSWORD");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 161, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("HOSTEL");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 207, -1, -1));

        phone.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        phone.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.gray, null, null));
        phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneActionPerformed(evt);
            }
        });
        getContentPane().add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, 152, -1));

        roll.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        roll.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.gray, null, null));
        getContentPane().add(roll, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 152, -1));

        name.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        name.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.gray, null, null));
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, 152, -1));

        hostel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        hostel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.gray, null, null));
        getContentPane().add(hostel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, 152, -1));

        jLabel6.setBackground(new java.awt.Color(0, 51, 255));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 255));
        jLabel6.setText("STUDENT REGISTRATION");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 10, 410, -1));

        submit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/save.png"))); // NOI18N
        submit.setText("SUBMIT");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        getContentPane().add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, 35));

        exitbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/delete-icon.png"))); // NOI18N
        exitbutton.setText("EXIT");
        exitbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(exitbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, 85, 35));

        userid.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        userid.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.gray, null, null));
        getContentPane().add(userid, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 152, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("USERID");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 115, -1, -1));

        password.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        password.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.gray, null, null));
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 152, -1));

        warninglabel.setForeground(new java.awt.Color(0, 0, 204));
        warninglabel.setText("10 digits(mobile)");
        getContentPane().add(warninglabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(464, 325, 89, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.gray, java.awt.Color.green));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneActionPerformed
        warninglabel.setVisible(true);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        sname=(name.getText());
        sname.toUpperCase();
        sroll=roll.getText();
        sroll.toUpperCase();
        suserid=userid.getText();
        sphone=String.valueOf(phone.getText());
        spassword=String.valueOf(password.getText());
        shostel=hostel.getText();
        shostel.toUpperCase();
        
           try{
               char fl=sroll.charAt(0);
        sl=sroll.substring(7,9);
        temp=fl+cardnumber()+gen.generate()+sl;
            String query;
            query="insert into student(name,roll,phone,password,userid,cardid) values ('"+sname+"','"+sroll+"','"+sphone+"','"+spassword+"','"+suserid+"','"+temp+"')";
            if(sphone.length()==10){
                h.runquery(query,0);
                phone.setText("");
            roll.setText("");
            name.setText("");
            password.setText("");
            hostel.setText("");
            userid.setText("");

            }
            else if(sphone.length()<10 || sphone.length()>10){
                JOptionPane.showMessageDialog(null,"Phone number inValid ");
            }   
           }
           catch(StringIndexOutOfBoundsException e){
               JOptionPane.showMessageDialog(null,"Please insert roll Correctly");
           }
            
             
        // TODO add your handling code here:
    }//GEN-LAST:event_submitActionPerformed

    private void exitbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbuttonActionPerformed

        WindowEvent m= new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(m);
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_exitbuttonActionPerformed

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
            java.util.logging.Logger.getLogger(registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new registration().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitbutton;
    private javax.swing.JTextField hostel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField name;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField phone;
    private javax.swing.JTextField roll;
    private javax.swing.JButton submit;
    private javax.swing.JTextField userid;
    private javax.swing.JLabel warninglabel;
    // End of variables declaration//GEN-END:variables
}
