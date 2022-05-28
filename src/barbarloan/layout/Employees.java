/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package barbarloan.layout;

import barbarloan.connection.ConnectionDB;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author adria
 */
public class Employees extends javax.swing.JInternalFrame {

    /**
     * Creates new form Employees
     */
    public Employees() {
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

        jPanel1 = new javax.swing.JPanel();
        clear = new javax.swing.JButton();
        submit = new javax.swing.JButton();
        Taddress = new javax.swing.JTextField();
        Ttelp = new javax.swing.JTextField();
        Tname = new javax.swing.JTextField();
        LAddress = new javax.swing.JLabel();
        LName = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        employee = new javax.swing.JTable();
        telp = new javax.swing.JLabel();
        edit = new javax.swing.JButton();
        delete = new javax.swing.JButton();

        setBackground(java.awt.Color.white);
        setClosable(true);
        setResizable(true);
        setTitle("Data Employee");
        setToolTipText("");

        jPanel1.setBackground(java.awt.Color.white);

        clear.setBackground(new java.awt.Color(220, 220, 220));
        clear.setFont(new java.awt.Font("Product Sans", 1, 12)); // NOI18N
        clear.setForeground(new java.awt.Color(33, 150, 243));
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        submit.setBackground(new java.awt.Color(33, 150, 243));
        submit.setFont(new java.awt.Font("Product Sans", 1, 12)); // NOI18N
        submit.setForeground(java.awt.Color.white);
        submit.setText("Save");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        Taddress.setFont(new java.awt.Font("Product Sans", 0, 12)); // NOI18N

        Ttelp.setFont(new java.awt.Font("Product Sans", 0, 12)); // NOI18N

        Tname.setFont(new java.awt.Font("Product Sans", 0, 12)); // NOI18N

        LAddress.setFont(new java.awt.Font("Product Sans", 1, 14)); // NOI18N
        LAddress.setText("Address");

        LName.setFont(new java.awt.Font("Product Sans", 1, 14)); // NOI18N
        LName.setText("Name");

        employee.setFont(new java.awt.Font("Product Sans", 0, 12)); // NOI18N
        employee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "#", "Name", "Address", "Telp", "id"
            }
        ));
        employee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                employeeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(employee);

        telp.setFont(new java.awt.Font("Product Sans", 1, 14)); // NOI18N
        telp.setText("Telp");

        edit.setBackground(new java.awt.Color(33, 150, 243));
        edit.setFont(new java.awt.Font("Product Sans", 1, 12)); // NOI18N
        edit.setForeground(java.awt.Color.white);
        edit.setText("Edit");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        delete.setBackground(new java.awt.Color(33, 150, 243));
        delete.setFont(new java.awt.Font("Product Sans", 1, 12)); // NOI18N
        delete.setForeground(java.awt.Color.white);
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(submit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(delete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(477, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(LName)
                        .addComponent(telp)
                        .addComponent(LAddress))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Ttelp, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                        .addComponent(Tname, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                        .addComponent(Taddress, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submit)
                    .addComponent(edit)
                    .addComponent(delete)
                    .addComponent(clear))
                .addContainerGap(200, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(LName)
                                .addComponent(Tname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(telp)
                                .addComponent(Ttelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(LAddress)
                                .addComponent(Taddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(107, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        showTable(employee);
        employee.removeColumn(employee.getColumnModel().getColumn(4));
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        String name = Tname.getText();
        String address = Taddress.getText();
        String telp = Ttelp.getText();

        if (address.isEmpty() || name.isEmpty() || telp.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Please fill the data");
        } else {
            try {
                Connection conn = ConnectionDB.conn();
                String sqlQuery = "insert into employees values(null,'"+name+"','"+telp+"','"+address+"')";
                PreparedStatement preparedStatement = conn.prepareStatement(sqlQuery);
                preparedStatement.execute();
                JOptionPane.showMessageDialog(null,"Data Added!");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null,ex.toString());
            }

            showTable(employee);
            employee.removeColumn(employee.getColumnModel().getColumn(4));
            Tname.setText("");
            Taddress.setText("");
            Ttelp.setText("");
        }
    }//GEN-LAST:event_submitActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        Tname.setText("");
        Taddress.setText("");
        Ttelp.setText("");
    }//GEN-LAST:event_clearActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        String name = Tname.getText();
        String address = Taddress.getText();
        String telp = Ttelp.getText();

        if (address.isEmpty() || name.isEmpty() || telp.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Please fill the data");
        } else {
            try {
                Connection conn = ConnectionDB.conn();
                String sqlQuery = "update employees set name ='"+name+"', telp = '"+telp+"', address = '"+address+"' where id = "+ID;
                PreparedStatement preparedStatement = conn.prepareStatement(sqlQuery);
                preparedStatement.execute();
                JOptionPane.showMessageDialog(null,"Data Edited!");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null,ex.toString());
            }

            showTable(employee);
            employee.removeColumn(employee.getColumnModel().getColumn(4));
            Tname.setText("");
            Taddress.setText("");
            Ttelp.setText("");
        }
    }//GEN-LAST:event_editActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        try {
            Connection conn = ConnectionDB.conn();
            String sqlQuery = "delete from employees where id = "+ID;
            PreparedStatement preparedStatement = conn.prepareStatement(sqlQuery);
            preparedStatement.execute();
            JOptionPane.showMessageDialog(null,"Data Deleted!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex.toString());
        }
        showTable(employee);
        employee.removeColumn(employee.getColumnModel().getColumn(4));
        Tname.setText("");
        Taddress.setText("");
        Ttelp.setText("");
    }//GEN-LAST:event_deleteActionPerformed

    private void employeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employeeMouseClicked
        int row = employee.rowAtPoint(evt.getPoint());
//                int col = table.columnAtPoint(e.getPoint());

        String name = employee.getValueAt(row,1).toString();
        String telp = employee.getValueAt(row,2).toString();
        String address = employee.getValueAt(row,3).toString();

        ID = employee.getModel().getValueAt(employee.getSelectedRow(),4).toString();
        Tname.setText(name);
        Ttelp.setText(telp);
        Taddress.setText(address);

    }//GEN-LAST:event_employeeMouseClicked

    private void showTable(JTable table) {
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("#");
        tableModel.addColumn("Name");
        tableModel.addColumn("Telp");
        tableModel.addColumn("address");
        tableModel.addColumn("");

        try {
            Connection conn = ConnectionDB.conn();
            String sqlQuery = "select*from employees";
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(sqlQuery);
            int no = 0;

            while (resultSet.next()) {
                no++;
                tableModel.addRow(new Object[] {
                        no,
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getString(1)
                });
            }

            table.setModel(tableModel);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.toString());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LAddress;
    private javax.swing.JLabel LName;
    private javax.swing.JTextField Taddress;
    private javax.swing.JTextField Tname;
    private javax.swing.JTextField Ttelp;
    private javax.swing.JButton clear;
    private javax.swing.JButton delete;
    private javax.swing.JButton edit;
    private javax.swing.JTable employee;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton submit;
    private javax.swing.JLabel telp;
    private String ID;
    // End of variables declaration//GEN-END:variables
}
