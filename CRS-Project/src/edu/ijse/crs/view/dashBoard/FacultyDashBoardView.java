/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edu.ijse.crs.view.dashBoard;

import edu.ijse.crs.controller.UserController;
import edu.ijse.crs.dto.UserDTO;
import edu.ijse.crs.view.AssignGradeView;
import edu.ijse.crs.view.management.CourseManagementView;
import edu.ijse.crs.view.LoginView;
import java.awt.event.KeyEvent;

/**
 *
 * @author USER
 */
public class FacultyDashBoardView extends DashBoardView {

    private UserController userController = new UserController();
    private LoginView loginView = new LoginView();

    /**
     * Creates new form DashBoardView
     */
    public FacultyDashBoardView(UserDTO userDTO) {
        initComponents();
        setWelcomeText(userDTO);
        setTitle("Course Management System- Faculty DashBoard");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblWelcomeDashBoard = new javax.swing.JLabel();
        btnManageCourses = new javax.swing.JButton();
        lblWelcome = new javax.swing.JLabel();
        btnAssignGrades = new javax.swing.JButton();
        lblWelcomeUser = new javax.swing.JLabel();
        btnLogOut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(85, 136, 201));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DashBoard");

        lblWelcomeDashBoard.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblWelcomeDashBoard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnManageCourses.setBackground(new java.awt.Color(197, 225, 225));
        btnManageCourses.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        btnManageCourses.setText("Manage Courses");
        btnManageCourses.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnManageCourses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageCoursesActionPerformed(evt);
            }
        });
        btnManageCourses.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnManageCoursesKeyPressed(evt);
            }
        });

        lblWelcome.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        lblWelcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnAssignGrades.setBackground(new java.awt.Color(197, 225, 225));
        btnAssignGrades.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        btnAssignGrades.setText("Assign Grades");
        btnAssignGrades.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAssignGrades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignGradesActionPerformed(evt);
            }
        });
        btnAssignGrades.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnAssignGradesKeyPressed(evt);
            }
        });

        lblWelcomeUser.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        lblWelcomeUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWelcomeUser.setText(" ");

        btnLogOut.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnLogOut.setForeground(new java.awt.Color(85, 136, 201));
        btnLogOut.setText("Log out");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });
        btnLogOut.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnLogOutKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 136, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(259, 259, 259))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblWelcomeUser, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(138, 138, 138))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(lblWelcomeDashBoard, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(lblWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAssignGrades, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnManageCourses, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(135, 135, 135)
                                .addComponent(btnLogOut)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblWelcomeDashBoard)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblWelcome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblWelcomeUser, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnManageCourses, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAssignGrades, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLogOut)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageCoursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageCoursesActionPerformed
        manageCourses();
    }//GEN-LAST:event_btnManageCoursesActionPerformed

    private void btnAssignGradesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignGradesActionPerformed
        assignGrades();
    }//GEN-LAST:event_btnAssignGradesActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        logout();
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnManageCoursesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnManageCoursesKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            manageCourses();
        } else if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            btnAssignGrades.requestFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_UP) {
            btnLogOut.requestFocus();
        }
    }//GEN-LAST:event_btnManageCoursesKeyPressed

    private void btnAssignGradesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnAssignGradesKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            assignGrades();
        } else if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            btnLogOut.requestFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_UP) {
            btnManageCourses.requestFocus();
        }
    }//GEN-LAST:event_btnAssignGradesKeyPressed

    private void btnLogOutKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnLogOutKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            logout();
        } else if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            btnManageCourses.requestFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_UP) {
            btnAssignGrades.requestFocus();
        }
    }//GEN-LAST:event_btnLogOutKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssignGrades;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnManageCourses;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JLabel lblWelcomeDashBoard;
    private javax.swing.JLabel lblWelcomeUser;
    // End of variables declaration//GEN-END:variables

    private void setWelcomeText(UserDTO userDTO) {
        if (userDTO != null) {
            lblWelcomeUser.setText("Welcome, " + userDTO.getUserName());
        }
    }

    private void manageCourses() {
        new CourseManagementView(this).setVisible(true);
        this.setVisible(false);
    }

    private void assignGrades() {
        new AssignGradeView(this).setVisible(true);
        this.setVisible(false);
    }

    private void logout() {
        new LoginView(this).setVisible(true);
        this.setVisible(false);
    }

}
