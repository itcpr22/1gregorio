/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Lab1-30
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
        initComponents();
        us.requestFocusInWindow();
        this.setLocationRelativeTo(null);

    }
    registrationClass regist = new registrationClass();
    loginClass loginObj = new loginClass();

    public void createcleartxt() {
        fname.setText("");
        lname.setText("");
        address.setText("");
        cn.setText("");
        username.setText("");
        password.setText("");
        cp.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        create = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        cn = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        fname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        cp = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        ss = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        us = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        ps = new javax.swing.JPasswordField();
        jButton3 = new javax.swing.JButton();

        create.setTitle("CREATE ACCOUNT");
        create.setLocation(new java.awt.Point(300, 200));
        create.setLocationByPlatform(true);
        create.setMaximumSize(new java.awt.Dimension(350, 350));
        create.setMinimumSize(new java.awt.Dimension(350, 350));
        create.setPreferredSize(new java.awt.Dimension(350, 350));
        create.setResizable(false);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setMaximumSize(new java.awt.Dimension(310, 350));
        jPanel2.setMinimumSize(new java.awt.Dimension(310, 350));
        jPanel2.setPreferredSize(new java.awt.Dimension(310, 350));

        cn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jButton4.setBackground(new java.awt.Color(0, 153, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Register");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Contact Number:");

        jButton5.setBackground(new java.awt.Color(204, 0, 0));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Cancel");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Address:");

        lname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        fname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Firstname:");

        password.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passwordKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passwordKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Username:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Lastname:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Passwoord:");

        username.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        address.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        cp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpActionPerformed(evt);
            }
        });
        cp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cpKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cpKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cpKeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("confirm Password:");

        ss.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cp, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(username)
                            .addComponent(password)
                            .addComponent(address)
                            .addComponent(ss, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(fname, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                    .addComponent(lname)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cn, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(99, 99, 99))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(145, 145, 145))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ss, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout createLayout = new javax.swing.GroupLayout(create.getContentPane());
        create.getContentPane().setLayout(createLayout);
        createLayout.setHorizontalGroup(
            createLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        createLayout.setVerticalGroup(
            createLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOG IN FORM");
        setLocation(new java.awt.Point(500, 250));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("PASSWORD:");

        us.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel3.setText("LOG IN");

        jButton1.setBackground(new java.awt.Color(0, 153, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("LOG IN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("USERNAME:");

        jButton2.setBackground(new java.awt.Color(204, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("EXIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        ps.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                psActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("create account");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ps)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 6, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(us, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(106, 106, 106))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(99, 99, 99))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addGap(82, 82, 82))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton2)
                .addGap(11, 11, 11)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(us, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
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
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String sus = us.getText();
        String sps = new String(ps.getPassword());

        int x = loginObj.login(sus, sps);
        if (x == 1) {
            this.setVisible(false);
            JFrame homepage = new home(loginObj.fname);
            homepage.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Incorrect username or password, or either CAPSLOCK is ON?", "UNKNOWN USER!!!", JOptionPane.ERROR_MESSAGE);
            us.setText("");
            ps.setText("");
        }
  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        if (JOptionPane.showConfirmDialog(rootPane, "Do you really want to EXIT?", "EXIT CONFIRMATION!",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
            System.exit(0);
        } else {

        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void psActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_psActionPerformed
        jButton1ActionPerformed(evt);        // TODO add your handling code here:
    }//GEN-LAST:event_psActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        create.setVisible(true);
        create.setAlwaysOnTop(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (JOptionPane.showConfirmDialog(rootPane, "Do you really want to cancel your creating account?", "CANCELING...!",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
            create.setVisible(false);
        } else {

        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        String sfname = fname.getText();
        String slname = lname.getText();
        String saddress = address.getText();
        String scn = cn.getText();
        String susername = username.getText();
        String spassword = new String(password.getPassword());
        String scp = new String(cp.getPassword());

        int y = regist.confirmpassword(spassword, scp);
        int z = regist.usernametest(susername);

        if (sfname.isEmpty()) {
            JOptionPane.showMessageDialog(create, "Please fill your Firstname", "Empty!!!", JOptionPane.WARNING_MESSAGE);
            fname.requestFocusInWindow();
        } else if (slname.isEmpty()) {
            JOptionPane.showMessageDialog(create, "Please fill your Lastname", "Empty!!!", JOptionPane.WARNING_MESSAGE);
            lname.requestFocusInWindow();
        } else if (saddress.isEmpty()) {
            JOptionPane.showMessageDialog(create, "Please fill your Complete Address", "Empty!!!", JOptionPane.WARNING_MESSAGE);
            address.requestFocusInWindow();
        } else if (scn.isEmpty()) {
            JOptionPane.showMessageDialog(create, "Please fill your Contact Number", "Empty!!!", JOptionPane.WARNING_MESSAGE);
            cn.requestFocusInWindow();
        } else if (susername.isEmpty()) {
            JOptionPane.showMessageDialog(create, "Please fill your Username", "Empty!!!", JOptionPane.WARNING_MESSAGE);
            username.requestFocusInWindow();
        } else if (spassword.isEmpty()) {
            JOptionPane.showMessageDialog(create, "Please fill your Password", "Empty!!!", JOptionPane.WARNING_MESSAGE);
            password.requestFocusInWindow();
        } else if (scp.isEmpty()) {
            JOptionPane.showMessageDialog(create, "Please fill your Confirm Password", "Empty!!!", JOptionPane.WARNING_MESSAGE);
            cp.requestFocusInWindow();
        } else   if(!"".equals(sfname) && !"".equals(slname) && !"".equals(saddress) && !"".equals(scn) && !"".equals(susername)&& !"".equals(spassword) && !"".equals(scp)){
            if (y == 1) {
                if (z == 0) {
                    int x = regist.register(sfname, slname, saddress, scn, susername, spassword);
                    if (x == 1) {
                        JOptionPane.showMessageDialog(create, "Successfully Registered!");
                        this.createcleartxt();
                        create.setVisible(false);
                        create.setAlwaysOnTop(false);
                    }
                } else {
                    JOptionPane.showMessageDialog(create, "Username " + susername + " Already Taken, please input different username!", "Duplicated Username!", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(create, "Password Does Not Match!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(create, "Please Fill out the fields!", "Error", JOptionPane.ERROR_MESSAGE);
        }
// TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        jButton4ActionPerformed(evt);
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void cpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpActionPerformed
        jButton4ActionPerformed(evt);        // TODO add your handling code here:
    }//GEN-LAST:event_cpActionPerformed

    private void cpKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cpKeyReleased
        confirmpass();
        // TODO add your handling code here:
    }//GEN-LAST:event_cpKeyReleased

    private void cpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cpKeyPressed
        confirmpass(); // TODO add your handling code here:
    }//GEN-LAST:event_cpKeyPressed

    private void cpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cpKeyTyped
        confirmpass();
    }//GEN-LAST:event_cpKeyTyped

    private void passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyPressed
        confirmpass();       // TODO add your handling code here:
    }//GEN-LAST:event_passwordKeyPressed

    private void passwordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyReleased
        confirmpass();       // TODO add your handling code here:
    }//GEN-LAST:event_passwordKeyReleased

    private void passwordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyTyped
        confirmpass();       // TODO add your handling code here:
    }//GEN-LAST:event_passwordKeyTyped

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JTextField cn;
    private javax.swing.JPasswordField cp;
    private javax.swing.JDialog create;
    private javax.swing.JTextField fname;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField lname;
    private javax.swing.JPasswordField password;
    private javax.swing.JPasswordField ps;
    private javax.swing.JLabel ss;
    private javax.swing.JTextField us;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
  private void logins() {
        String sun = us.getText();
        String spw = new String(ps.getPassword());

        if (sun.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Please fill up your USERNAME!", "Empty USERNAME!", JOptionPane.WARNING_MESSAGE);
            us.requestFocusInWindow();
        } else if (spw.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Please fill up your PASSWORD!", "Empty PASSWORD!", JOptionPane.WARNING_MESSAGE);
            ps.requestFocusInWindow();
        } else {

            try {
                Class.forName("com.mysql.jdbc.Driver");
                String conURL = "jdbc:mysql://localhost/greglogin"
                        + "?user=root&password=";
                Connection con = DriverManager.getConnection(conURL);

                PreparedStatement pstmt = con.prepareStatement("select * from tbllogin "
                        + "where username=? "
                        + "and pass=md5(?);");

                pstmt.setString(1, sun);
                pstmt.setString(2, spw);

                ResultSet rs = pstmt.executeQuery();

                if (rs.next()) {
                    this.setVisible(false);
                    new home().setVisible(true);
                    JFrame home = new home(sun);

                } else {
                    JOptionPane.showMessageDialog(rootPane, "Invaled username or password or either CAPSLOCK is on!", "Log in ERROR", JOptionPane.ERROR_MESSAGE);
                    us.requestFocusInWindow();
                }

                us.setText("");
                ps.setText("");

            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void createaccount() {
        String sfname = fname.getText();
        String slname = lname.getText();
        String saddress = address.getText();
        String scn = cn.getText();
        String susername = username.getText();
        String spassword = new String(password.getPassword());
        String scp = new String(cp.getPassword());
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String conURL = "jdbc:mysql://localhost/greglogin"
                    + "?user=root&password=";
            Connection con = DriverManager.getConnection(conURL);
            PreparedStatement pstmt = con.prepareStatement("insert into tbllogin"
                    + " (fname,lname,address,contactNumber,username,pass) "
                    + "values (?,?,?,?,?, md5(?));");

            pstmt.setString(1, sfname);
            pstmt.setString(2, slname);
            pstmt.setString(3, saddress);
            pstmt.setString(4, scn);
            pstmt.setString(5, susername);
            pstmt.setString(6, spassword);

            pstmt.executeUpdate();

            JOptionPane.showMessageDialog(rootPane, "COMPLETELY SAVED");
            create.setVisible(false);
            fname.setText("");
            lname.setText("");
            address.setText("");
            cn.setText("");
            username.setText("");
            password.setText("");
            cp.setText("");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void confirmpass() {
        String spassword = new String(password.getPassword());
        String scp = new String(cp.getPassword());
        if (!spassword.equals(scp)) {

            ss.setText("Password does not Match");
        } else {
            ss.setText("Password Match");
        }

        if (spassword.isEmpty() || scp.isEmpty()) {
            ss.setText(" ");
        }
    }

}