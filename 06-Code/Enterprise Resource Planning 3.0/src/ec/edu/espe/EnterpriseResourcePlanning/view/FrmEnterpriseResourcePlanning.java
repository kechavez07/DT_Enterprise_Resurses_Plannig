/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ec.edu.espe.EnterpriseResourcePlanning.view;

/**
 *
 * @author david
 */
public class FrmEnterpriseResourcePlanning extends javax.swing.JFrame {

    /**
     * Creates new form FrmEnterpriseResourcePlanning
     */
    public FrmEnterpriseResourcePlanning() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuInterpriseResourcePlanning = new javax.swing.JMenu();
        itmAbout = new javax.swing.JMenuItem();
        itmContacts = new javax.swing.JMenuItem();
        itmExit = new javax.swing.JMenuItem();
        mnuHumanResources = new javax.swing.JMenu();
        itmEmployeeRecords = new javax.swing.JMenuItem();
        mnuDepartamentFinance = new javax.swing.JMenu();
        itmPaymentRoll = new javax.swing.JMenuItem();
        itmMonetaryincome = new javax.swing.JMenuItem();
        itmExpenses = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/EnterpriseResourcePlanning/view/1.jpeg"))); // NOI18N

        mnuInterpriseResourcePlanning.setText("Enterprise Resource Planning");

        itmAbout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmAbout.setText("About");
        itmAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmAboutActionPerformed(evt);
            }
        });
        mnuInterpriseResourcePlanning.add(itmAbout);

        itmContacts.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmContacts.setText("Contacts");
        itmContacts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmContactsActionPerformed(evt);
            }
        });
        mnuInterpriseResourcePlanning.add(itmContacts);

        itmExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmExit.setText("Exit");
        itmExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmExitActionPerformed(evt);
            }
        });
        mnuInterpriseResourcePlanning.add(itmExit);

        jMenuBar1.add(mnuInterpriseResourcePlanning);

        mnuHumanResources.setText("Human Resources");

        itmEmployeeRecords.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmEmployeeRecords.setText("Employee Records");
        itmEmployeeRecords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmEmployeeRecordsActionPerformed(evt);
            }
        });
        mnuHumanResources.add(itmEmployeeRecords);

        jMenuBar1.add(mnuHumanResources);

        mnuDepartamentFinance.setText("Departament Finance");

        itmPaymentRoll.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmPaymentRoll.setText("Payment Roll");
        itmPaymentRoll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmPaymentRollActionPerformed(evt);
            }
        });
        mnuDepartamentFinance.add(itmPaymentRoll);

        itmMonetaryincome.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmMonetaryincome.setText("Monetary income");
        itmMonetaryincome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmMonetaryincomeActionPerformed(evt);
            }
        });
        mnuDepartamentFinance.add(itmMonetaryincome);

        itmExpenses.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmExpenses.setText("Expenses");
        itmExpenses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmExpensesActionPerformed(evt);
            }
        });
        mnuDepartamentFinance.add(itmExpenses);

        jMenuBar1.add(mnuDepartamentFinance);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(643, 643, 643)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(176, 176, 176))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(88, 88, 88)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(145, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itmPaymentRollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmPaymentRollActionPerformed
     FrmPaymentRoll frmPaymentRoll = new FrmPaymentRoll ();
  this.setVisible(false);
 frmPaymentRoll.setVisible(true);
    }//GEN-LAST:event_itmPaymentRollActionPerformed

    private void itmEmployeeRecordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmEmployeeRecordsActionPerformed
     FrmEmployeRecords frmEmployeRecords = new FrmEmployeRecords ();
  this.setVisible(false);
 frmEmployeRecords.setVisible(true);
    }//GEN-LAST:event_itmEmployeeRecordsActionPerformed

    private void itmMonetaryincomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmMonetaryincomeActionPerformed
     FrmMonetaryincome frmMonetaryincome = new FrmMonetaryincome();
  this.setVisible(false);
 frmMonetaryincome.setVisible(true);
    }//GEN-LAST:event_itmMonetaryincomeActionPerformed

    private void itmExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmExitActionPerformed
       this.dispose();
    }//GEN-LAST:event_itmExitActionPerformed

    private void itmAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmAboutActionPerformed
     FrmAbout frmAbout = new FrmAbout ();
  this.setVisible(false);
 frmAbout.setVisible(true);
    }//GEN-LAST:event_itmAboutActionPerformed

    private void itmContactsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmContactsActionPerformed
    FrmContacts frmContacts = new FrmContacts ();
  this.setVisible(false);
 frmContacts.setVisible(true);
    }//GEN-LAST:event_itmContactsActionPerformed

    private void itmExpensesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmExpensesActionPerformed
        FrmExpenses frmExpenses = new FrmExpenses ();
  this.setVisible(false);
 frmExpenses.setVisible(true);
    }//GEN-LAST:event_itmExpensesActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmEnterpriseResourcePlanning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FrmEnterpriseResourcePlanning().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itmAbout;
    private javax.swing.JMenuItem itmContacts;
    private javax.swing.JMenuItem itmEmployeeRecords;
    private javax.swing.JMenuItem itmExit;
    private javax.swing.JMenuItem itmExpenses;
    private javax.swing.JMenuItem itmMonetaryincome;
    private javax.swing.JMenuItem itmPaymentRoll;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu mnuDepartamentFinance;
    private javax.swing.JMenu mnuHumanResources;
    private javax.swing.JMenu mnuInterpriseResourcePlanning;
    // End of variables declaration//GEN-END:variables
}
