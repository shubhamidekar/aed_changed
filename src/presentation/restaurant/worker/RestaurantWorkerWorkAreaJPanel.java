/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation.restaurant.worker;

import business.enterprise.Enterprise;
import business.network.Network;
import business.userAccount.UserAccount;
import business.workQueue.CollectionWorkRequest;
import business.workQueue.WorkRequest;


import javax.swing.*;
import java.awt.*;


public class RestaurantWorkerWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount account;
    private Enterprise enterprise;
    private Network network;

    /**
     * Creates new form RestaurantWorkerWorkArea
     */
    public RestaurantWorkerWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.enterprise = enterprise;
        this.network = network;

        populateLoginDetails();
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
        lblWastage = new javax.swing.JLabel();
        lblWastageValue = new javax.swing.JLabel();
        btnCollectionReq = new javax.swing.JButton();
        btnLog = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        logoutBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 204, 255));

        lblHeader.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblHeader.setText("Restaurant Worker Work Area");

        lblName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblName.setText("Welcome, ");

        lblWastage.setText("Total wastage avoided :");

        lblWastageValue.setText("<wastage_avoided>");

        btnCollectionReq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentation/restaurant/worker/res/vegetable.png"))); // NOI18N
        btnCollectionReq.setText("Raise Collection Request");
        btnCollectionReq.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCollectionReq.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCollectionReq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCollectionReqActionPerformed(evt);
            }
        });

        btnLog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentation/ngo/manager/res/inventory (1).png"))); // NOI18N
        btnLog.setText("View Request Log");
        btnLog.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLog.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RestaurantAdmin/restaurantWorker/res/ramen.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RestaurantAdmin/restaurantWorker/res/vegetable.png"))); // NOI18N

        logoutBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        logoutBtn.setForeground(new java.awt.Color(255, 0, 0));
        logoutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentation/res/shutdown.png"))); // NOI18N
        logoutBtn.setText("Logout");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblWastage)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblWastageValue, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCollectionReq, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(btnLog, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 22, Short.MAX_VALUE)))
                .addGap(135, 135, 135)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(365, 365, 365))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutBtn)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoutBtn)
                .addGap(37, 37, 37)
                .addComponent(lblHeader)
                .addGap(27, 27, 27)
                .addComponent(lblName)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWastage)
                    .addComponent(lblWastageValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnCollectionReq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(175, 175, 175)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(224, 224, 224))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCollectionReqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCollectionReqActionPerformed
        RestaurantWorkerRaiseRequestJPanel restaurantWorkerRaiseRequestJPanel = new RestaurantWorkerRaiseRequestJPanel(userProcessContainer, account, enterprise.getName(), network);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RestaurantWorkerRaiseRequestJPanel", restaurantWorkerRaiseRequestJPanel);
        layout.next(userProcessContainer);

    }//GEN-LAST:event_btnCollectionReqActionPerformed

    private void btnLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogActionPerformed
        RestaurantWorkerViewRequestLogJPanel restaurantWorkerViewRequestLogJPanel = new RestaurantWorkerViewRequestLogJPanel(userProcessContainer, account);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RestaurantWorkerViewRequestLogJPanel", restaurantWorkerViewRequestLogJPanel);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnLogActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.removeAll();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        LoginNewJPanel mpjp = new LoginNewJPanel();
        userProcessContainer.add("LoginPanel", mpjp);
        layout.next(userProcessContainer);

        db4OUtil.storeSystem(system);
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void populateLoginDetails() {
        double quantity = 0;
        lblName.setText(lblName.getText() + " " + account.getEmployee().getName());
        for (WorkRequest wr : account.getWorkQueue().getWorkRequestList()) {
            if (wr instanceof CollectionWorkRequest) {
                CollectionWorkRequest cwr = (CollectionWorkRequest) wr;
                quantity += cwr.getTotalQuantity();
            }
        }
        lblWastageValue.setText(quantity + " pounds");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCollectionReq;
    private javax.swing.JButton btnLog;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblWastage;
    private javax.swing.JLabel lblWastageValue;
    private javax.swing.JButton logoutBtn;
    // End of variables declaration//GEN-END:variables
}
