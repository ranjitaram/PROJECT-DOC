/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.main.view;

import javax.swing.JFrame;

/**
 *
 * @author namita
 */
public class MasterFrame extends javax.swing.JFrame {

    /**
     * Creates new form MasterFrame
     */
    public MasterFrame() {
        initComponents();
        setExtendedState(this.getExtendedState() | JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        MenuBar = new javax.swing.JMenuBar();
        systemMenu = new javax.swing.JMenu();
        homeMenuItem = new javax.swing.JMenuItem();
        passwordMenuItem = new javax.swing.JMenuItem();
        stockMenuItem = new javax.swing.JMenuItem();
        contactMenuItem = new javax.swing.JMenuItem();
        employeeMenuItem = new javax.swing.JMenuItem();
        inquiryMenuItem = new javax.swing.JMenuItem();
        studentMenu = new javax.swing.JMenu();
        statusMenuItem = new javax.swing.JMenuItem();
        studentDetailMenuItem = new javax.swing.JMenuItem();
        internshipMenuItem = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        groupTelecallinMenuItem = new javax.swing.JMenuItem();
        groupQueriesMenuItem = new javax.swing.JMenuItem();
        groupMenuItem = new javax.swing.JMenuItem();
        groupBugsMenuItem = new javax.swing.JMenuItem();
        groupSchedulesMenuItem = new javax.swing.JMenuItem();
        AccountMenu = new javax.swing.JMenu();
        projectPaymentMenuItem = new javax.swing.JMenuItem();
        employeePaymentMenuItem = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        accountTallyMenuItem = new javax.swing.JMenuItem();
        tallyOrgMenuItem = new javax.swing.JMenuItem();
        reciptGenerateMenuItem = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 237, 204));

        jPanel1.setBackground(new java.awt.Color(255, 237, 204));
        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        MenuBar.setBackground(new java.awt.Color(255, 237, 204));

        systemMenu.setText("System");

        homeMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/main/icon/home-icon.png"))); // NOI18N
        homeMenuItem.setText("Home");
        homeMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeMenuItemActionPerformed(evt);
            }
        });
        systemMenu.add(homeMenuItem);

        passwordMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/main/icon/Key-icon.png"))); // NOI18N
        passwordMenuItem.setText("Password Update");
        passwordMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordMenuItemActionPerformed(evt);
            }
        });
        systemMenu.add(passwordMenuItem);

        stockMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/main/icon/folder-data-icon.png"))); // NOI18N
        stockMenuItem.setText("Stock project");
        stockMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockMenuItemActionPerformed(evt);
            }
        });
        systemMenu.add(stockMenuItem);

        contactMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/main/icon/Emails-Folder-icon.png"))); // NOI18N
        contactMenuItem.setText("Contact");
        contactMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactMenuItemActionPerformed(evt);
            }
        });
        systemMenu.add(contactMenuItem);

        employeeMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/main/icon/contacts-icon.png"))); // NOI18N
        employeeMenuItem.setText("Employee Detail");
        employeeMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeMenuItemActionPerformed(evt);
            }
        });
        systemMenu.add(employeeMenuItem);

        inquiryMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/main/icon/contacts-icon.png"))); // NOI18N
        inquiryMenuItem.setText("Quick inquiry");
        inquiryMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inquiryMenuItemActionPerformed(evt);
            }
        });
        systemMenu.add(inquiryMenuItem);

        MenuBar.add(systemMenu);

        studentMenu.setText("Student");

        statusMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/main/icon/briefcase-icon.png"))); // NOI18N
        statusMenuItem.setText("Project Status");
        statusMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusMenuItemActionPerformed(evt);
            }
        });
        studentMenu.add(statusMenuItem);

        studentDetailMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/main/icon/Matte-Group-icon.png"))); // NOI18N
        studentDetailMenuItem.setText("Student Detail");
        studentDetailMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentDetailMenuItemActionPerformed(evt);
            }
        });
        studentMenu.add(studentDetailMenuItem);

        internshipMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/main/icon/Matte-Group-icon.png"))); // NOI18N
        internshipMenuItem.setText("Internship");
        internshipMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                internshipMenuItemActionPerformed(evt);
            }
        });
        studentMenu.add(internshipMenuItem);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/main/icon/Matte-Group-icon.png"))); // NOI18N
        jMenu2.setText("Group ");

        groupTelecallinMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/main/icon/Matte-Group-icon.png"))); // NOI18N
        groupTelecallinMenuItem.setText("Group Telecalling");
        groupTelecallinMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                groupTelecallinMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(groupTelecallinMenuItem);

        groupQueriesMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/main/icon/Matte-Group-icon.png"))); // NOI18N
        groupQueriesMenuItem.setText("Group Queries");
        groupQueriesMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                groupQueriesMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(groupQueriesMenuItem);

        groupMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/main/icon/Matte-Group-icon.png"))); // NOI18N
        groupMenuItem.setText("Project Groups");
        groupMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                groupMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(groupMenuItem);

        groupBugsMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/main/icon/Matte-Group-icon.png"))); // NOI18N
        groupBugsMenuItem.setText("Group Bugs");
        groupBugsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                groupBugsMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(groupBugsMenuItem);

        groupSchedulesMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/main/icon/Matte-Group-icon.png"))); // NOI18N
        groupSchedulesMenuItem.setText("Group schedules");
        jMenu2.add(groupSchedulesMenuItem);

        studentMenu.add(jMenu2);

        MenuBar.add(studentMenu);

        AccountMenu.setText("Account");

        projectPaymentMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/main/icon/Invoice-icon.png"))); // NOI18N
        projectPaymentMenuItem.setText("Project Payment");
        projectPaymentMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                projectPaymentMenuItemActionPerformed(evt);
            }
        });
        AccountMenu.add(projectPaymentMenuItem);

        employeePaymentMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/main/icon/Invoice-icon.png"))); // NOI18N
        employeePaymentMenuItem.setText("employee payment");
        AccountMenu.add(employeePaymentMenuItem);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/main/icon/Calculator-icon.png"))); // NOI18N
        jMenu1.setText("Account Tally");

        accountTallyMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/main/icon/Calculator-icon.png"))); // NOI18N
        accountTallyMenuItem.setText("Account Tally");
        accountTallyMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountTallyMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(accountTallyMenuItem);

        tallyOrgMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/main/icon/Calculator-icon.png"))); // NOI18N
        tallyOrgMenuItem.setText("Account Tally org");
        tallyOrgMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tallyOrgMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(tallyOrgMenuItem);

        AccountMenu.add(jMenu1);

        reciptGenerateMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/main/icon/invoice-icon (1).png"))); // NOI18N
        reciptGenerateMenuItem.setText("Recipt Generation");
        AccountMenu.add(reciptGenerateMenuItem);

        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/main/icon/Logout-icon (1).png"))); // NOI18N
        jMenuItem11.setText("Logout");
        AccountMenu.add(jMenuItem11);

        MenuBar.add(AccountMenu);

        helpMenu.setText("Help");
        MenuBar.add(helpMenu);

        setJMenuBar(MenuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passwordMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordMenuItemActionPerformed
        // TODO add your handling code here:
        new ChangePassWordPage().setVisible(true);
    }//GEN-LAST:event_passwordMenuItemActionPerformed

    private void stockMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockMenuItemActionPerformed
        // TODO add your handling code here:
        new ViewProjectPage().setVisible(true);
    }//GEN-LAST:event_stockMenuItemActionPerformed

    private void statusMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusMenuItemActionPerformed
        // TODO add your handling code here:
        new StatusDetail().setVisible(true);
    }//GEN-LAST:event_statusMenuItemActionPerformed

    private void groupMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_groupMenuItemActionPerformed
        // TODO add your handling code here:
        new ProjectGroupDetailPage().setVisible(true);
    }//GEN-LAST:event_groupMenuItemActionPerformed

    private void homeMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeMenuItemActionPerformed
        // TODO add your handling code here:
        new MainPage().setVisible(true);
    }//GEN-LAST:event_homeMenuItemActionPerformed

    private void projectPaymentMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_projectPaymentMenuItemActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_projectPaymentMenuItemActionPerformed

    private void groupTelecallinMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_groupTelecallinMenuItemActionPerformed
        new GroupTellingCallingPage().setVisible(true);
    }//GEN-LAST:event_groupTelecallinMenuItemActionPerformed

    private void groupQueriesMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_groupQueriesMenuItemActionPerformed
        // TODO add your handling code here:
        new Groupquerydetail().setVisible(true);
    }//GEN-LAST:event_groupQueriesMenuItemActionPerformed

    private void studentDetailMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentDetailMenuItemActionPerformed
        // TODO add your handling code here:
        new CreateStudentDetail().setVisible(true);
    }//GEN-LAST:event_studentDetailMenuItemActionPerformed

    private void internshipMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_internshipMenuItemActionPerformed
        // TODO add your handling code here:
        new Internshipdetails().setVisible(true);
    }//GEN-LAST:event_internshipMenuItemActionPerformed

    private void groupBugsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_groupBugsMenuItemActionPerformed
        // TODO add your handling code here:
        new GroupBugsPage().setVisible(true);
    }//GEN-LAST:event_groupBugsMenuItemActionPerformed

    private void accountTallyMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountTallyMenuItemActionPerformed
        // TODO add your handling code here:
        new TallyChat().setVisible(true);
    }//GEN-LAST:event_accountTallyMenuItemActionPerformed

    private void tallyOrgMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tallyOrgMenuItemActionPerformed
        // TODO add your handling code here:
        new TallyChat1().setVisible(true);
    }//GEN-LAST:event_tallyOrgMenuItemActionPerformed

    private void contactMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactMenuItemActionPerformed
        // TODO add your handling code here:
        new CONTACTDETAIL().setVisible(true);
    }//GEN-LAST:event_contactMenuItemActionPerformed

    private void employeeMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeMenuItemActionPerformed
        new EmployeePage().setVisible(true);
    }//GEN-LAST:event_employeeMenuItemActionPerformed

    private void inquiryMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inquiryMenuItemActionPerformed
        // TODO add your handling code here:
        new QuickInquiryDetail().setVisible(true);
    }//GEN-LAST:event_inquiryMenuItemActionPerformed

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
            java.util.logging.Logger.getLogger(MasterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MasterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MasterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MasterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MasterFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu AccountMenu;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenuItem accountTallyMenuItem;
    private javax.swing.JMenuItem contactMenuItem;
    private javax.swing.JMenuItem employeeMenuItem;
    private javax.swing.JMenuItem employeePaymentMenuItem;
    private javax.swing.JMenuItem groupBugsMenuItem;
    private javax.swing.JMenuItem groupMenuItem;
    private javax.swing.JMenuItem groupQueriesMenuItem;
    private javax.swing.JMenuItem groupSchedulesMenuItem;
    private javax.swing.JMenuItem groupTelecallinMenuItem;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuItem homeMenuItem;
    private javax.swing.JMenuItem inquiryMenuItem;
    private javax.swing.JMenuItem internshipMenuItem;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem passwordMenuItem;
    private javax.swing.JMenuItem projectPaymentMenuItem;
    private javax.swing.JMenuItem reciptGenerateMenuItem;
    private javax.swing.JMenuItem statusMenuItem;
    private javax.swing.JMenuItem stockMenuItem;
    private javax.swing.JMenuItem studentDetailMenuItem;
    private javax.swing.JMenu studentMenu;
    private javax.swing.JMenu systemMenu;
    private javax.swing.JMenuItem tallyOrgMenuItem;
    // End of variables declaration//GEN-END:variables
}