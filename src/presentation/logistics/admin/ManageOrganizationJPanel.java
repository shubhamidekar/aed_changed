/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation.logistics.admin;

import business.organization.Organization;
import business.organization.Organization.Type;
import business.organization.OrganizationDirectory;


import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

/**
 *
 * @author Rishabh
 */
public class ManageOrganizationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LogisticsManageOrganizationJPanel
     */
    private OrganizationDirectory organizationDirectory;
    private JPanel userProcessContainer;

    public ManageOrganizationJPanel(JPanel userProcessContainer, OrganizationDirectory organizationDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organizationDirectory = organizationDirectory;
        populateTable();
        populateCombo();
    }

    private void populateCombo() {
        cmbOrganization.removeAllItems();
        for (Organization.Type type : Organization.Type.values()) {
            if ((!type.getValue().equals(Organization.Type.LogisticsAdmin.getValue())) && (type.getValue().indexOf("Logistics") >= 0)) {
                cmbOrganization.addItem(type);
            }
        }
    }

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblOrganization.getModel();

        model.setRowCount(0);

        for (Organization organization : organizationDirectory.getOrganizationList()) {
            Object[] row = new Object[2];
            row[0] = organization.getOrganizationID();
            row[1] = organization.getName();

            model.addRow(row);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane = new javax.swing.JScrollPane();
        tblOrganization = new javax.swing.JTable();
        lblOrg = new javax.swing.JLabel();
        cmbOrganization = new javax.swing.JComboBox();
        btnBack = new javax.swing.JButton();
        btnAddOrganization = new javax.swing.JButton();
        lblHeading = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 204));

        tblOrganization.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane.setViewportView(tblOrganization);

        lblOrg.setText("Organization Type ");

        btnBack.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(51, 0, 255));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentation/res/back-button.png"))); // NOI18N
        btnBack.setText("Back");
        btnBack.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnAddOrganization.setText("Add Organization");
        btnAddOrganization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddOrganizationActionPerformed(evt);
            }
        });

        lblHeading.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lblHeading.setForeground(new java.awt.Color(0, 102, 255));
        lblHeading.setText("Manage Organizations");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblOrg)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbOrganization, 0, 168, Short.MAX_VALUE)
                            .addComponent(btnAddOrganization, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1235, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeading)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOrg))
                .addGap(18, 18, 18)
                .addComponent(btnAddOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(253, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddOrganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddOrganizationActionPerformed

        Type type = (Type) cmbOrganization.getSelectedItem();

        if (type == null) {
            JOptionPane.showMessageDialog(null, "Invalid input!");
            return;
        }

        organizationDirectory.addOrganization(type);

        JOptionPane.showMessageDialog(null, "Organziation created successfully!");
        populateTable();
    }//GEN-LAST:event_btnAddOrganizationActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddOrganization;
    private javax.swing.JButton btnBack;
    private javax.swing.JComboBox cmbOrganization;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JLabel lblOrg;
    private javax.swing.JTable tblOrganization;
    // End of variables declaration//GEN-END:variables
}
