/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edu.ijse.crs.view;

import edu.ijse.crs.view.dashBoard.DashBoardView;
import edu.ijse.crs.controller.UserController;
import edu.ijse.crs.dto.UserDTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public class UserUpdateView extends javax.swing.JFrame {

    private DashBoardView dashBoardView;
    private UserController userController = new UserController();

    /**
     * Creates new form UserUpdate
     */
    public UserUpdateView(DashBoardView dashBoardView) {
        this.dashBoardView = dashBoardView;
        initComponents();
        loadTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHeader = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUpdateUser = new javax.swing.JTable();
        btnUpdateUser = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblHeader.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        lblHeader.setForeground(new java.awt.Color(85, 136, 201));
        lblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader.setText("Update User");

        lblUserName.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        lblUserName.setText("User Name");
        lblUserName.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtUserName.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N

        lblPassword.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        lblPassword.setText("Password");
        lblPassword.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtPassword.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N

        tblUpdateUser.setBackground(new java.awt.Color(223, 232, 232));
        tblUpdateUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblUpdateUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUpdateUserMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblUpdateUser);

        btnUpdateUser.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnUpdateUser.setForeground(new java.awt.Color(85, 136, 201));
        btnUpdateUser.setText("Update User");
        btnUpdateUser.setActionCommand("Update");
        btnUpdateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateUserActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(85, 136, 201));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnUpdateUser)
                        .addGap(181, 181, 181)
                        .addComponent(btnBack))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(27, 27, 27)
                                    .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblHeader)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserName)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPassword)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdateUser)
                    .addComponent(btnBack))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        back();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnUpdateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateUserActionPerformed
        updateUser();
    }//GEN-LAST:event_btnUpdateUserActionPerformed

    private void tblUpdateUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUpdateUserMouseClicked
        get();
    }//GEN-LAST:event_tblUpdateUserMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnUpdateUser;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JTable tblUpdateUser;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables

    private void back() {
        this.setVisible(false);
        dashBoardView.setVisible(true);
    }

    private void updateUser() {

        try {
            int selectedRow = tblUpdateUser.getSelectedRow();
            if (selectedRow == -1) {
                JOptionPane.showMessageDialog(this, "Please select a user to update.");
                return;
            }
            if (txtUserName.getText().trim().isEmpty() || txtPassword.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "All fields must be filled.");
                return;
            }
            int userId = (int) tblUpdateUser.getValueAt(selectedRow, 0);
            String role = tblUpdateUser.getValueAt(selectedRow, 3).toString();

            UserDTO userDTO = new UserDTO(
                    userId,
                    txtUserName.getText(),
                    txtPassword.getText(),
                    role
            );
            String resp = userController.updateUser(userDTO);
            JOptionPane.showMessageDialog(this, resp);
            loadTable();
            clearForm();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage());

        }
    }

    public void loadTable() {
        try {
            String[] columns = {"User ID", "UserN Name", "Password", "User Role"};
            DefaultTableModel dtm = new DefaultTableModel(columns, 0) {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }

            };
            tblUpdateUser.setModel(dtm);
            ArrayList<UserDTO> userDtos = userController.getAllUsers();
            if (userDtos != null) {
                for (UserDTO userDto : userDtos) {
                    Object[] rowData = {userDto.getUserId(),
                        userDto.getUserName(),
                        userDto.getPassword(),
                        userDto.getRole()
                    };
                    dtm.addRow(rowData);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    private void clearForm() {
        txtUserName.setText("");
        txtPassword.setText("");

    }

    private void get() {
        int selectedRow = tblUpdateUser.getSelectedRow();
        if (selectedRow == -1) {  // No row selected
            JOptionPane.showMessageDialog(this, "Please select a user first.");
            return;
        }

        int userId = (int) tblUpdateUser.getValueAt(tblUpdateUser.getSelectedRow(), 0);
        try {
            UserDTO userDto = userController.getUser(userId);
            if (userDto != null) {

                txtUserName.setText(userDto.getUserName());
                txtPassword.setText(userDto.getPassword());

            } else {
                JOptionPane.showMessageDialog(this, "User not found");
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
}
