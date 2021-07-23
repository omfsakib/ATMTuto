/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmtuto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author afwadmin
 */
public class FastCashs extends javax.swing.JFrame {

    /**
     * Creates new form FastCashs
     */
    public FastCashs() {
        initComponents();
    }

   int MyAccNum;
     public FastCashs(int AccNum) {
        initComponents();
        MyAccNum = AccNum;
       // AccNumLbl.setText(""+AccNum);
        GetBalance();
    }
Connection Con = null;
        PreparedStatement pst = null,pst1=null;
        ResultSet Rs = null,Rs1=null;
        Statement St = null,St1=null;
        int OldBalance;
   private void GetBalance()
   {
        String Query = "select * from Accounttbl where AccNum='"+MyAccNum+"'";
        try {
              Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","");
              St1 = Con.createStatement();
              Rs1 = St1.executeQuery(Query);
              if(Rs1.next()){
              OldBalance = Rs1.getInt(9);   
              BallLbl.setText("Rs"+OldBalance);
              }else
              {
                
              }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        DEPOSITBTN = new javax.swing.JButton();
        DEPOSITBTN1 = new javax.swing.JButton();
        DEPOSITBTN2 = new javax.swing.JButton();
        DEPOSITBTN3 = new javax.swing.JButton();
        DEPOSITBTN4 = new javax.swing.JButton();
        DEPOSITBTN5 = new javax.swing.JButton();
        BallLbl = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 0, 255));

        jLabel7.setFont(new java.awt.Font("Averia", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("X");

        jLabel2.setFont(new java.awt.Font("Averia", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("MNS BANK");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(694, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(311, 311, 311)
                    .addComponent(jLabel2)
                    .addContainerGap(311, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(27, 27, 27)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(27, Short.MAX_VALUE)))
        );

        jLabel4.setFont(new java.awt.Font("Averia", 0, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("FAST CASH");

        DEPOSITBTN.setFont(new java.awt.Font("Averia", 0, 22)); // NOI18N
        DEPOSITBTN.setForeground(new java.awt.Color(0, 0, 255));
        DEPOSITBTN.setText("Rs 100");
        DEPOSITBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DEPOSITBTNMouseClicked(evt);
            }
        });

        DEPOSITBTN1.setFont(new java.awt.Font("Averia", 0, 22)); // NOI18N
        DEPOSITBTN1.setForeground(new java.awt.Color(0, 0, 255));
        DEPOSITBTN1.setText("Rs 500");
        DEPOSITBTN1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DEPOSITBTN1MouseClicked(evt);
            }
        });

        DEPOSITBTN2.setFont(new java.awt.Font("Averia", 0, 22)); // NOI18N
        DEPOSITBTN2.setForeground(new java.awt.Color(0, 0, 255));
        DEPOSITBTN2.setText("Rs 2000");
        DEPOSITBTN2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DEPOSITBTN2MouseClicked(evt);
            }
        });

        DEPOSITBTN3.setFont(new java.awt.Font("Averia", 0, 22)); // NOI18N
        DEPOSITBTN3.setForeground(new java.awt.Color(0, 0, 255));
        DEPOSITBTN3.setText("Rs 1000");
        DEPOSITBTN3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DEPOSITBTN3MouseClicked(evt);
            }
        });

        DEPOSITBTN4.setFont(new java.awt.Font("Averia", 0, 22)); // NOI18N
        DEPOSITBTN4.setForeground(new java.awt.Color(0, 0, 255));
        DEPOSITBTN4.setText("Rs 5000");
        DEPOSITBTN4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DEPOSITBTN4MouseClicked(evt);
            }
        });

        DEPOSITBTN5.setFont(new java.awt.Font("Averia", 0, 22)); // NOI18N
        DEPOSITBTN5.setForeground(new java.awt.Color(0, 0, 255));
        DEPOSITBTN5.setText("Rs 10000");
        DEPOSITBTN5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DEPOSITBTN5MouseClicked(evt);
            }
        });

        BallLbl.setFont(new java.awt.Font("Averia", 0, 22)); // NOI18N
        BallLbl.setForeground(new java.awt.Color(0, 0, 255));
        BallLbl.setText("Balance");

        jLabel6.setFont(new java.awt.Font("Averia", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 0));
        jLabel6.setText("LOGOUT");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Averia", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 255));
        jLabel3.setText("MNS BANK");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(301, 301, 301))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(329, 329, 329))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(115, 115, 115)
                                .addComponent(DEPOSITBTN4))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DEPOSITBTN3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(DEPOSITBTN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                        .addComponent(BallLbl)))
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(DEPOSITBTN1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DEPOSITBTN5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DEPOSITBTN2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(122, 122, 122))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(209, 209, 209))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DEPOSITBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DEPOSITBTN1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DEPOSITBTN3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DEPOSITBTN2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BallLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DEPOSITBTN4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DEPOSITBTN5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void DEPOSITBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DEPOSITBTNMouseClicked
        if(OldBalance < 100)
        {
             JOptionPane.showMessageDialog(this, "No Enough Balance");
        }else
        {
            try {
            String Query = "Update AccountTbl set Balance=? where AccNum=?";
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root",""); 
            PreparedStatement ps = Con.prepareStatement(Query);
            ps.setInt(1, OldBalance-100);
            ps.setInt(2, MyAccNum);
            if(ps.executeUpdate() == 1)
            {
                JOptionPane.showMessageDialog(this, "Balance Updated");
                 new LOGIN().setVisible(true);
          this.dispose();
            }else
            {
                JOptionPane.showMessageDialog(this, "Missing Information");
            }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }
          
        }
    }//GEN-LAST:event_DEPOSITBTNMouseClicked

    private void DEPOSITBTN1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DEPOSITBTN1MouseClicked
       if(OldBalance < 500)
        {
             JOptionPane.showMessageDialog(this, "No Enough Balance");
        }else
        {
            try {
            String Query = "Update AccountTbl set Balance=? where AccNum=?";
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root",""); 
            PreparedStatement ps = Con.prepareStatement(Query);
            ps.setInt(1, OldBalance-500);
            ps.setInt(2, MyAccNum);
            if(ps.executeUpdate() == 1)
            {
                JOptionPane.showMessageDialog(this, "Balance Updated");
                 new MainMenu().setVisible(true);
          this.dispose();
            }else
            {
                JOptionPane.showMessageDialog(this, "Missing Information");
            }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }
          
        }
    }//GEN-LAST:event_DEPOSITBTN1MouseClicked

    private void DEPOSITBTN3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DEPOSITBTN3MouseClicked
        if(OldBalance < 1000)
        {
             JOptionPane.showMessageDialog(this, "No Enough Balance");
        }else
        {
            try {
            String Query = "Update AccountTbl set Balance=? where AccNum=?";
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root",""); 
            PreparedStatement ps = Con.prepareStatement(Query);
            ps.setInt(1, OldBalance-1000);
            ps.setInt(2, MyAccNum);
            if(ps.executeUpdate() == 1)
            {
                JOptionPane.showMessageDialog(this, "Balance Updated");
                 new MainMenu().setVisible(true);
          this.dispose();
            }else
            {
                JOptionPane.showMessageDialog(this, "Missing Information");
            }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }
          
        }
    }//GEN-LAST:event_DEPOSITBTN3MouseClicked

    private void DEPOSITBTN2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DEPOSITBTN2MouseClicked
        if(OldBalance < 2000)
        {
             JOptionPane.showMessageDialog(this, "No Enough Balance");
        }else
        {
            try {
            String Query = "Update AccountTbl set Balance=? where AccNum=?";
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root",""); 
            PreparedStatement ps = Con.prepareStatement(Query);
            ps.setInt(1, OldBalance-2000);
            ps.setInt(2, MyAccNum);
            if(ps.executeUpdate() == 1)
            {
                JOptionPane.showMessageDialog(this, "Balance Updated");
                 new MainMenu().setVisible(true);
          this.dispose();
            }else
            {
                JOptionPane.showMessageDialog(this, "Missing Information");
            }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }
          
        }
    }//GEN-LAST:event_DEPOSITBTN2MouseClicked

    private void DEPOSITBTN4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DEPOSITBTN4MouseClicked
        if(OldBalance < 5000)
        {
             JOptionPane.showMessageDialog(this, "No Enough Balance");
        }else
        {
            try {
            String Query = "Update AccountTbl set Balance=? where AccNum=?";
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root",""); 
            PreparedStatement ps = Con.prepareStatement(Query);
            ps.setInt(1, OldBalance-5000);
            ps.setInt(2, MyAccNum);
            if(ps.executeUpdate() == 1)
            {
                JOptionPane.showMessageDialog(this, "Balance Updated");
                 new MainMenu().setVisible(true);
          this.dispose();
            }else
            {
                JOptionPane.showMessageDialog(this, "Missing Information");
            }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }
          
        }
    }//GEN-LAST:event_DEPOSITBTN4MouseClicked

    private void DEPOSITBTN5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DEPOSITBTN5MouseClicked
        if(OldBalance < 10000)
        {
             JOptionPane.showMessageDialog(this, "No Enough Balance");
        }else
        {
            try {
            String Query = "Update AccountTbl set Balance=? where AccNum=?";
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root",""); 
            PreparedStatement ps = Con.prepareStatement(Query);
            ps.setInt(1, OldBalance-10000);
            ps.setInt(2, MyAccNum);
            if(ps.executeUpdate() == 1)
            {
                JOptionPane.showMessageDialog(this, "Balance Updated");
                 new MainMenu().setVisible(true);
          this.dispose();
            }else
            {
                JOptionPane.showMessageDialog(this, "Missing Information");
            }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }
          
        }
    }//GEN-LAST:event_DEPOSITBTN5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
         new MainMenu().setVisible(true);
          this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

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
            java.util.logging.Logger.getLogger(FastCashs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FastCashs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FastCashs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FastCashs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FastCashs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BallLbl;
    private javax.swing.JButton DEPOSITBTN;
    private javax.swing.JButton DEPOSITBTN1;
    private javax.swing.JButton DEPOSITBTN2;
    private javax.swing.JButton DEPOSITBTN3;
    private javax.swing.JButton DEPOSITBTN4;
    private javax.swing.JButton DEPOSITBTN5;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
