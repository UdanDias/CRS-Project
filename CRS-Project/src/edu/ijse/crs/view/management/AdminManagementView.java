/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edu.ijse.crs.view.management;

import edu.ijse.crs.view.dashBoard.DashBoardView;
import edu.ijse.crs.controller.AdminController;
import edu.ijse.crs.controller.UserController;
import edu.ijse.crs.dto.AdminDTO;
import edu.ijse.crs.dto.UserDTO;
import edu.ijse.crs.view.LoginView;
import edu.ijse.crs.view.UserAddView;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public class AdminManagementView extends javax.swing.JFrame {

    private AdminController adminController = new AdminController();
    private UserController userController = new UserController();
    private LoginView loginView = new LoginView();
    private DashBoardView dashBoardView;

    /**
     * Creates new form StudentView
     */
    public AdminManagementView(DashBoardView dashBoardView) {
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
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblContact = new javax.swing.JLabel();
        txtContact = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAdmin = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("frame 0"); // NOI18N

        lblHeader.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        lblHeader.setForeground(new java.awt.Color(85, 136, 201));
        lblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader.setText("Admin Management");

        lblName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblName.setText("Name");
        lblName.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtName.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        lblContact.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblContact.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblContact.setText("Contact");
        lblContact.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtContact.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        txtContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactActionPerformed(evt);
            }
        });

        btnAdd.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(85, 136, 201));
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(85, 136, 201));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(85, 136, 201));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        tblAdmin.setBackground(new java.awt.Color(223, 232, 232));
        tblAdmin.setModel(new javax.swing.table.DefaultTableModel(
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
        tblAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAdminMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblAdmin);

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
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblContact, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(190, 190, 190))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBack)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 763, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblHeader)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnUpdate)
                            .addComponent(btnAdd)
                            .addComponent(btnDelete)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblName)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblContact)
                            .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBack)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        add();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        update();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        delete();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tblAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAdminMouseClicked
        get();
    }//GEN-LAST:event_tblAdminMouseClicked

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        back();
    }//GEN-LAST:event_btnBackActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblContact;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblName;
    private javax.swing.JTable tblAdmin;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables

    private void add() {
        
        String name = txtName.getText().trim();
        String contact = txtContact.getText().trim();

        if (name.isEmpty() || contact.isEmpty()) {
            JOptionPane.showMessageDialog(this, "All fields must be filled.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return; 
        }

        
        AdminDTO adminDTO = new AdminDTO(
                name,
                contact,
                -1 
        );

        
        UserAddView userAddView = new UserAddView(adminDTO, adminController);
        userAddView.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                loadTable(); 
            }
        });
        userAddView.setVisible(true);

        clearForm();
    }

    private void update() {

        try {
            int selectedRow = tblAdmin.getSelectedRow();
            if (selectedRow == -1) {
                JOptionPane.showMessageDialog(this, "Please select an admin to update.");
                return;
            }
            if (txtName.getText().trim().isEmpty() || txtContact.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "All fields must be filled.");
                return;
            }
            int adminId = (int) tblAdmin.getValueAt(selectedRow, 0);
            int userId = (int) tblAdmin.getValueAt(selectedRow, 3);

            AdminDTO adminDTO = new AdminDTO(
                    adminId,
                    txtName.getText(),
                    txtContact.getText(),
                    userId
            );
            String resp = adminController.updateAdmin(adminDTO);
            JOptionPane.showMessageDialog(this, resp);
            loadTable();
            clearForm();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage());

        }
    }

    private void delete() {

        try {
            int selectedRow = tblAdmin.getSelectedRow();
            if (selectedRow == -1) {
                JOptionPane.showMessageDialog(this, "Please select an admin to delete.");
                return;
            }

            int adminId = (int) tblAdmin.getValueAt(tblAdmin.getSelectedRow(), 0);
            int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this admin?", "Confirm Delete", JOptionPane.YES_NO_OPTION);

            if (confirm == JOptionPane.YES_OPTION) {
                String resp = adminController.deleteAdmin(adminId);
                JOptionPane.showMessageDialog(this, resp);
                loadTable();
                clearForm();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error while deleting admin.");
        }
    }

    private void get() {
        int selectedRow = tblAdmin.getSelectedRow();
        if (selectedRow == -1) {  
            JOptionPane.showMessageDialog(this, "Please select an admin first.");
            return;
        }

        int adminId = (int) tblAdmin.getValueAt(tblAdmin.getSelectedRow(), 0);
        try {
            AdminDTO adminDto = adminController.getAdmin(adminId);
            if (adminDto != null) {

                txtName.setText(adminDto.getName());

                txtContact.setText(adminDto.getContact());
            } else {
                JOptionPane.showMessageDialog(this, "Admin not found");
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    public void loadTable() {
        try {
            String columns[] = {"Admin ID", "Name", "Contact", "User ID"};
            DefaultTableModel dtm = new DefaultTableModel(columns, 0) {

                public boolean isCellEditable(int row, int column) {
                    return false;
                }

            };
            tblAdmin.setModel(dtm);
            ArrayList<AdminDTO> adminDtos = adminController.getAllAdmins();
            if (adminDtos != null) {
                for (AdminDTO adminDto : adminDtos) {
                    Object[] rowData = {adminDto.getAdminId(),
                        adminDto.getName(),
                        adminDto.getContact(),
                        adminDto.getUserId()};
                    dtm.addRow(rowData);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    private void clearForm() {
        txtName.setText("");
        txtContact.setText("");
    }

    private void back() {
        this.setVisible(false); 
        dashBoardView.setVisible(true); 
    }

}
