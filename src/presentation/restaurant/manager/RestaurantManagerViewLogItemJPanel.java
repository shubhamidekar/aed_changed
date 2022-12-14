/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation.restaurant.manager;

import business.util.request.RequestItem;
import business.workQueue.CollectionWorkRequest;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;


public class RestaurantManagerViewLogItemJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private CollectionWorkRequest collectionWorkRequest;

    /**
     * Creates new form RestaurantWorkerViewLogItemJPanel
     */
    public RestaurantManagerViewLogItemJPanel(JPanel userProcessContainer, CollectionWorkRequest collectionWorkRequest) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.collectionWorkRequest = collectionWorkRequest;
        populateItemTable();
        populateData();
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
        tblFoodItems = new javax.swing.JTable();
        lblRequestFrom = new javax.swing.JLabel();
        lblRequestFromVal = new javax.swing.JLabel();
        lblRequestDate = new javax.swing.JLabel();
        lblRequestDateVal = new javax.swing.JLabel();
        lblRequestStatus = new javax.swing.JLabel();
        lblRequestStatusVal = new javax.swing.JLabel();
        lblQuantity = new javax.swing.JLabel();
        lblQuantityVal = new javax.swing.JLabel();
        lblNGO = new javax.swing.JLabel();
        lblNGOVal = new javax.swing.JLabel();
        lblLogistics = new javax.swing.JLabel();
        lblLogisticsVal = new javax.swing.JLabel();
        lblCost = new javax.swing.JLabel();
        lblCostVal = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnBack1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 204, 255));

        tblFoodItems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Food Type", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane.setViewportView(tblFoodItems);
        if (tblFoodItems.getColumnModel().getColumnCount() > 0) {
            tblFoodItems.getColumnModel().getColumn(0).setResizable(false);
            tblFoodItems.getColumnModel().getColumn(1).setResizable(false);
        }

        lblRequestFrom.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblRequestFrom.setText("Raised by:");

        lblRequestFromVal.setText("<request_from>");

        lblRequestDate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblRequestDate.setText("Request Date:");

        lblRequestDateVal.setText("<request_date>");

        lblRequestStatus.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblRequestStatus.setText("Request status:");

        lblRequestStatusVal.setText("<request_status>");

        lblQuantity.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblQuantity.setText("Food Quantity:");

        lblQuantityVal.setText("<quantity>");

        lblNGO.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNGO.setText("NGO delivered to:");

        lblNGOVal.setText("<ngo>");

        lblLogistics.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblLogistics.setText("Logistics");

        lblLogisticsVal.setText("<logistics>");

        lblCost.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCost.setText("Pickup Cost:");

        lblCostVal.setText("<cost>");

        jTextField1.setBackground(new java.awt.Color(255, 204, 204));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField1.setText("                !!!FOOD COLLECTION REQUEST!!!");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RestaurantAdmin/RestaurantManager/res/fast-delivery.png"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RestaurantAdmin/RestaurantManager/res/fast-food (2).png"))); // NOI18N

        btnBack1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnBack1.setForeground(new java.awt.Color(51, 51, 255));
        btnBack1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentation/res/back-button.png"))); // NOI18N
        btnBack1.setText("Back");
        btnBack1.setBorder(null);
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(170, 170, 170)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblRequestFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(118, 118, 118)
                                    .addComponent(lblRequestFromVal))
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(809, 809, 809))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblNGO)
                                    .addGap(18, 18, 18)
                                    .addComponent(lblNGOVal))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblCost)
                                        .addComponent(lblLogistics))
                                    .addGap(47, 47, 47)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblLogisticsVal)
                                        .addComponent(lblCostVal)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblQuantity)
                                        .addComponent(lblRequestDate))
                                    .addGap(33, 33, 33)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblQuantityVal)
                                        .addComponent(lblRequestDateVal)
                                        .addComponent(lblRequestStatusVal)))
                                .addComponent(lblRequestStatus))
                            .addGap(899, 899, 899)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
            .addGroup(layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(28, 28, 28)
                            .addComponent(jLabel1)
                            .addGap(25, 25, 25))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBack1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(4, 4, 4))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblRequestFrom)
                        .addComponent(lblRequestFromVal)))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRequestDate)
                    .addComponent(lblRequestDateVal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRequestStatus)
                    .addComponent(lblRequestStatusVal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuantity)
                    .addComponent(lblQuantityVal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNGO)
                    .addComponent(lblNGOVal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLogistics)
                    .addComponent(lblLogisticsVal))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCost)
                    .addComponent(lblCostVal))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(240, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBack1ActionPerformed

    public void populateItemTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblFoodItems.getModel();
        dtm.setRowCount(0);

        for (RequestItem ri : collectionWorkRequest.getRequestItems()) {
            Object row[] = new Object[2];
            row[0] = ri;
            row[1] = ri.getQuantity();

            dtm.addRow(row);
        }
    }

    public void populateData() {

        lblRequestFromVal.setText(collectionWorkRequest.getRaisedBy().getEmployee().getName());
        lblRequestDateVal.setText(collectionWorkRequest.getRequestDate() + "");
        lblRequestStatusVal.setText(collectionWorkRequest.getStatus());
        lblQuantityVal.setText(collectionWorkRequest.getTotalQuantity() + " pounds");

        String ngo = collectionWorkRequest.getDeliverToNGO() == null ? "Undelivered" : collectionWorkRequest.getDeliverToNGO();
        lblNGOVal.setText(ngo);

        String logistics = collectionWorkRequest.getDeliveredByLogistics() == null ? "Undelivered" : collectionWorkRequest.getDeliveredByLogistics();
        lblLogisticsVal.setText(logistics);

        String cost = collectionWorkRequest.getDeliveryCost() == 0d ? "Undelivered" : "$" + collectionWorkRequest.getDeliveryCost();
        lblCostVal.setText(cost);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblCost;
    private javax.swing.JLabel lblCostVal;
    private javax.swing.JLabel lblLogistics;
    private javax.swing.JLabel lblLogisticsVal;
    private javax.swing.JLabel lblNGO;
    private javax.swing.JLabel lblNGOVal;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JLabel lblQuantityVal;
    private javax.swing.JLabel lblRequestDate;
    private javax.swing.JLabel lblRequestDateVal;
    private javax.swing.JLabel lblRequestFrom;
    private javax.swing.JLabel lblRequestFromVal;
    private javax.swing.JLabel lblRequestStatus;
    private javax.swing.JLabel lblRequestStatusVal;
    private javax.swing.JTable tblFoodItems;
    // End of variables declaration//GEN-END:variables
}
