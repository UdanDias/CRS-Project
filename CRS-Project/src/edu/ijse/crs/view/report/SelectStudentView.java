/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edu.ijse.crs.view.report;

import edu.ijse.crs.controller.StudentController;
import edu.ijse.crs.dto.StudentDTO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class SelectStudentView extends javax.swing.JFrame {

    
    private StudentController studentController = new StudentController();
    private GenerateReportsView generateReportsView;

    /**
     * Creates new form SelectStudentView
     */
    public SelectStudentView(GenerateReportsView generateReportsView) {
        this.generateReportsView = generateReportsView;
        initComponents();
        populateComboSelectStudent();
//        btnConfirm.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent evt) {
//                confirm();
//            }
//        });

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comboSelectStudent = new javax.swing.JComboBox<>();
        lblSelectStudent = new javax.swing.JLabel();
        btnConfirm = new javax.swing.JButton();
        btnBack1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        comboSelectStudent.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        comboSelectStudent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboSelectStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSelectStudentActionPerformed(evt);
            }
        });

        lblSelectStudent.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        lblSelectStudent.setForeground(new java.awt.Color(85, 136, 201));
        lblSelectStudent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSelectStudent.setText("Select Student");

        btnConfirm.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnConfirm.setForeground(new java.awt.Color(85, 136, 201));
        btnConfirm.setText("Confirm");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        btnBack1.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnBack1.setForeground(new java.awt.Color(85, 136, 201));
        btnBack1.setText("Back");
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnBack1)
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(lblSelectStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(comboSelectStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addComponent(btnConfirm)))
                .addContainerGap(207, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(lblSelectStudent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboSelectStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnConfirm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(btnBack1)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed

        confirm();
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void comboSelectStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSelectStudentActionPerformed

    }//GEN-LAST:event_comboSelectStudentActionPerformed

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        back();
    }//GEN-LAST:event_btnBack1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack1;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JComboBox<String> comboSelectStudent;
    private javax.swing.JLabel lblSelectStudent;
    // End of variables declaration//GEN-END:variables

    private void back() {
        this.setVisible(false);
        generateReportsView.setVisible(true);
    }

    private void populateComboSelectStudent() {
        try {
            comboSelectStudent.removeAllItems();
            ArrayList<StudentDTO> students = studentController.getAllStudents();
            for (StudentDTO student : students) {
                comboSelectStudent.addItem(student.getName());
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "An error occurred while populating the comboBox " + e.getMessage());
        }

    }

    public String getSelectedStudent() {
        return comboSelectStudent.getSelectedItem().toString();
    }

    private void generateReportForSelectedStudent() {
        String selectedStudent = getSelectedStudent();

        if (selectedStudent != null && !selectedStudent.trim().isEmpty()) {
            StudentReportView reportView = new StudentReportView(this);
            reportView.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Please select a student before generating the report.");
        }
    }

    private void confirm() {
        generateReportForSelectedStudent();
    }
}
