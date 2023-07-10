
package project.company.management.view;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class NhapKho extends javax.swing.JPanel {
    DefaultTableModel model;
    
    public NhapKho() {
        initComponents();
        showTable();
        ButtonGroup bt1 = new ButtonGroup();
        ButtonGroup bt2 = new ButtonGroup();
        bt1.add(coRDB1);
        bt1.add(khongRDB1);
        bt2.add(coRDB2);
        bt2.add(khongRDB2);
            jLabel1.setVisible(false);
            jLabel2.setVisible(false);
            jLabel3.setVisible(false);
            jLabel4.setVisible(false);
            jLabel5.setVisible(false);
            jLabel6.setVisible(false);
            jLabel7.setVisible(false);
            jLabel8.setVisible(false);
            idKhaiTf.setVisible(false);
            tenTf.setVisible(false);
            cccdTf.setVisible(false);
            idHoTf.setVisible(false);
            nhapTf.setVisible(false);
            coRDB1.setVisible(false);
            coRDB2.setVisible(false);
            khongRDB1.setVisible(false);
            khongRDB2.setVisible(false);
            khaiBaoBtn.setVisible(false);
            xoaBtn.setVisible(false);
            suaBtn.setVisible(false);
            timBtn.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        kGradientPanel3 = new com.k33ptoo.components.KGradientPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        xoaLabel = new javax.swing.JLabel();
        idKhaiTf = new javax.swing.JTextField();
        tenTf = new javax.swing.JTextField();
        idHoTf = new javax.swing.JTextField();
        cccdTf = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        coRDB1 = new javax.swing.JRadioButton();
        coRDB2 = new javax.swing.JRadioButton();
        khongRDB1 = new javax.swing.JRadioButton();
        khongRDB2 = new javax.swing.JRadioButton();
        khaiBaoBtn = new com.k33ptoo.components.KButton();
        xoaBtn = new com.k33ptoo.components.KButton();
        suaBtn = new com.k33ptoo.components.KButton();
        timBtn = new com.k33ptoo.components.KButton();
        jLabel8 = new javax.swing.JLabel();
        nhapTf = new javax.swing.JTextField();

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.red, null));

        kGradientPanel3.setkEndColor(new java.awt.Color(51, 204, 255));
        kGradientPanel3.setkStartColor(new java.awt.Color(0, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Khai báo", "Họ tên", "CCCD", "ID Hộ khẩu", "Đi qua vùng dịch", "Tiếp xúc ca mắc"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(25);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(100);
        }

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mời chọn chức năng", "Khai báo", "Xóa khai báo", "Chỉnh sửa", "Tìm kiếm" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel6.setText(".");

        xoaLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        idKhaiTf.setPreferredSize(new java.awt.Dimension(140, 30));

        tenTf.setPreferredSize(new java.awt.Dimension(140, 30));

        idHoTf.setPreferredSize(new java.awt.Dimension(140, 30));

        cccdTf.setPreferredSize(new java.awt.Dimension(140, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("ID Khai báo");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("CCCD");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Họ tên");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("ID Hộ khẩu");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Trong vòng 14 ngày có đi qua vùng dịch không?");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Trong vòng 14 ngày có tiếp xúc với ca mắc nào không?");

        coRDB1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        coRDB1.setText("Có");

        coRDB2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        coRDB2.setText("Có");

        khongRDB1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        khongRDB1.setText("Không");

        khongRDB2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        khongRDB2.setText("Không");

        khaiBaoBtn.setText("Khai báo");
        khaiBaoBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        khaiBaoBtn.setPreferredSize(new java.awt.Dimension(130, 45));
        khaiBaoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                khaiBaoBtnActionPerformed(evt);
            }
        });

        xoaBtn.setText("Xóa");
        xoaBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        xoaBtn.setPreferredSize(new java.awt.Dimension(130, 45));
        xoaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoaBtnActionPerformed(evt);
            }
        });

        suaBtn.setText("Chỉnh sửa");
        suaBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        suaBtn.setPreferredSize(new java.awt.Dimension(130, 45));
        suaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suaBtnActionPerformed(evt);
            }
        });

        timBtn.setText("Tìm kiếm");
        timBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        timBtn.setPreferredSize(new java.awt.Dimension(130, 45));
        timBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timBtnActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Nhập CCCD");

        nhapTf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nhapTf.setPreferredSize(new java.awt.Dimension(150, 30));

        javax.swing.GroupLayout kGradientPanel3Layout = new javax.swing.GroupLayout(kGradientPanel3);
        kGradientPanel3.setLayout(kGradientPanel3Layout);
        kGradientPanel3Layout.setHorizontalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                .addGap(450, 450, 450)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                .addGap(530, 530, 530)
                .addComponent(xoaLabel))
            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                .addGap(271, 271, 271)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addComponent(idKhaiTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(tenTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                .addGap(410, 410, 410)
                .addComponent(jLabel8)
                .addGap(26, 26, 26)
                .addComponent(nhapTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(jLabel4)
                .addGap(40, 40, 40)
                .addComponent(idHoTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(jLabel2)
                .addGap(23, 23, 23)
                .addComponent(cccdTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                .addGap(271, 271, 271)
                .addComponent(jLabel5)
                .addGap(106, 106, 106)
                .addComponent(coRDB1)
                .addGap(51, 51, 51)
                .addComponent(khongRDB1))
            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                .addGap(271, 271, 271)
                .addComponent(jLabel7)
                .addGap(66, 66, 66)
                .addComponent(coRDB2)
                .addGap(51, 51, 51)
                .addComponent(khongRDB2)
                .addGap(321, 321, 321)
                .addComponent(jLabel6))
            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                .addGap(520, 520, 520)
                .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(suaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(khaiBaoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xoaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 741, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        kGradientPanel3Layout.setVerticalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(xoaLabel)
                .addGap(10, 10, 10)
                .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel3Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel1))
                    .addComponent(idKhaiTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(tenTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(nhapTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(idHoTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(cccdTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel3Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel5))
                    .addComponent(coRDB1)
                    .addComponent(khongRDB1))
                .addGap(46, 46, 46)
                .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel3Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel7))
                    .addGroup(kGradientPanel3Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(coRDB2))
                    .addGroup(kGradientPanel3Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(khongRDB2))
                    .addComponent(jLabel6))
                .addGap(24, 24, 24)
                .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(suaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(khaiBaoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xoaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(kGradientPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        int x = jComboBox1.getSelectedIndex();
        if(x == 0){
            jLabel1.setVisible(false);
            jLabel2.setVisible(false);
            jLabel3.setVisible(false);
            jLabel4.setVisible(false);
            jLabel5.setVisible(false);
            jLabel6.setVisible(false);
            jLabel7.setVisible(false);
            jLabel8.setVisible(false);
            idKhaiTf.setVisible(false);
            tenTf.setVisible(false);
            cccdTf.setVisible(false);
            idHoTf.setVisible(false);
            nhapTf.setVisible(false);
            coRDB1.setVisible(false);
            coRDB2.setVisible(false);
            khongRDB1.setVisible(false);
            khongRDB2.setVisible(false);
            khaiBaoBtn.setVisible(false);
            xoaBtn.setVisible(false);
            suaBtn.setVisible(false);
            timBtn.setVisible(false);
        }

        if(x == 1){
            jLabel1.setVisible(true);
            jLabel2.setVisible(true);
            jLabel3.setVisible(true);
            jLabel4.setVisible(true);
            jLabel5.setVisible(true);
            jLabel6.setVisible(true);
            jLabel7.setVisible(true);
            jLabel8.setVisible(false);
            idKhaiTf.setVisible(true);
            tenTf.setVisible(true);
            cccdTf.setVisible(true);
            idHoTf.setVisible(true);
            nhapTf.setVisible(false);
            coRDB1.setVisible(true);
            coRDB2.setVisible(true);
            khongRDB1.setVisible(true);
            khongRDB2.setVisible(true);
            khaiBaoBtn.setVisible(true);
            xoaBtn.setVisible(false);
            suaBtn.setVisible(false);
            timBtn.setVisible(false);
            
        }

        if(x == 2){
            jLabel1.setVisible(true);
            jLabel2.setVisible(true);
            jLabel3.setVisible(true);
            jLabel4.setVisible(true);
            jLabel5.setVisible(true);
            jLabel6.setVisible(true);
            jLabel7.setVisible(true);
            jLabel8.setVisible(false);
            idKhaiTf.setVisible(true);
            tenTf.setVisible(true);
            cccdTf.setVisible(true);
            idHoTf.setVisible(true);
            nhapTf.setVisible(false);
            coRDB1.setVisible(true);
            coRDB2.setVisible(true);
            khongRDB1.setVisible(true);
            khongRDB2.setVisible(true);
            khaiBaoBtn.setVisible(false);
            xoaBtn.setVisible(true);
            suaBtn.setVisible(false);
            timBtn.setVisible(false);
        }

        if(x == 3){
            jLabel1.setVisible(true);
            jLabel2.setVisible(true);
            jLabel3.setVisible(true);
            jLabel4.setVisible(true);
            jLabel5.setVisible(true);
            jLabel6.setVisible(true);
            jLabel7.setVisible(true);
            jLabel8.setVisible(false);
            idKhaiTf.setVisible(true);
            tenTf.setVisible(true);
            cccdTf.setVisible(true);
            idHoTf.setVisible(true);
            nhapTf.setVisible(false);
            coRDB1.setVisible(true);
            coRDB2.setVisible(true);
            khongRDB1.setVisible(true);
            khongRDB2.setVisible(true);
            khaiBaoBtn.setVisible(false);
            xoaBtn.setVisible(false);
            suaBtn.setVisible(true);
            timBtn.setVisible(false);
        }
        if(x == 4){
            jLabel1.setVisible(false);
            jLabel2.setVisible(false);
            jLabel3.setVisible(false);
            jLabel4.setVisible(false);
            jLabel5.setVisible(false);
            jLabel6.setVisible(false);
            jLabel7.setVisible(false);
            jLabel8.setVisible(true);
            idKhaiTf.setVisible(false);
            tenTf.setVisible(false);
            cccdTf.setVisible(false);
            idHoTf.setVisible(false);
            nhapTf.setVisible(true);
            coRDB1.setVisible(false);
            coRDB2.setVisible(false);
            khongRDB1.setVisible(false);
            khongRDB2.setVisible(false);
            khaiBaoBtn.setVisible(false);
            xoaBtn.setVisible(false);
            suaBtn.setVisible(false);
            timBtn.setVisible(true);
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        if(jTable1.getSelectedRowCount() == 1){
            idKhaiTf.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
            tenTf.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
            cccdTf.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString());
            idHoTf.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString());
            if(jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString().equals("Có"))
                coRDB1.doClick();
            else khongRDB1.doClick();
            if(jTable1.getValueAt(jTable1.getSelectedRow(), 5).toString().equals( "Có"))
                coRDB2.doClick();
            else khongRDB2.doClick();
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void khaiBaoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_khaiBaoBtnActionPerformed
        // TODO add your handling code here:
        String x, y;
        model = (DefaultTableModel) jTable1.getModel();
        if(idKhaiTf.getText().equals("") || 
           tenTf.getText().equals("") ||
           cccdTf.getText().equals("") ||
           idHoTf.getText().equals("") ||
           (!coRDB1.isSelected() && !khongRDB1.isSelected()) ||
           (!coRDB2.isSelected() && !khongRDB2.isSelected()))
            JOptionPane.showMessageDialog(null, "Không được để trống!");
        else{
            if(coRDB1.isSelected())
                x = coRDB1.getText();
            else x = khongRDB1.getText();
            if(coRDB2.isSelected())
                y = coRDB2.getText();
            else y = khongRDB2.getText();
            model.addRow(new Object[]{
                idKhaiTf.getText(), tenTf.getText(), cccdTf.getText(), idHoTf.getText(), x, y
            });
            JOptionPane.showMessageDialog(null, "Khai báo thành công!");
            idKhaiTf.setText("");
            tenTf.setText("");
            cccdTf.setText("");
            idHoTf.setText("");
        }
        
    }//GEN-LAST:event_khaiBaoBtnActionPerformed

    private void xoaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoaBtnActionPerformed
        // TODO add your handling code here:
        model = (DefaultTableModel) jTable1.getModel();
        if(jTable1.getSelectedRowCount() == 0){
            JOptionPane.showMessageDialog(null, "Hãy chọn một khai báo!");
        }
        else if(jTable1.getSelectedRowCount() > 1){
            JOptionPane.showMessageDialog(null, "Chỉ được chọn một khai báo!");
        }
        else {
            model.removeRow(jTable1.getSelectedRow());
            JOptionPane.showMessageDialog(null, "Xóa thành công!");
        }
    }//GEN-LAST:event_xoaBtnActionPerformed

    private void suaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suaBtnActionPerformed
        // TODO add your handling code here:
        model = (DefaultTableModel) jTable1.getModel();
        if(jTable1.getSelectedRowCount() == 0){
            JOptionPane.showMessageDialog(null, "Hãy chọn một khai báo!");
        }
        else if(jTable1.getSelectedRowCount() > 1){
            JOptionPane.showMessageDialog(null, "Chỉ được chọn một khai báo!");
        }
        else{
            jTable1.setValueAt(idKhaiTf.getText(), jTable1.getSelectedRow(), 0);
            jTable1.setValueAt(tenTf.getText(), jTable1.getSelectedRow(), 1);
            jTable1.setValueAt(cccdTf.getText(), jTable1.getSelectedRow(), 2);
            jTable1.setValueAt(idHoTf.getText(), jTable1.getSelectedRow(), 3);
            if(coRDB1.isSelected())
                jTable1.setValueAt("Có", jTable1.getSelectedRow(), 4);
            else jTable1.setValueAt("Không", jTable1.getSelectedRow(), 4);
            if(coRDB2.isSelected())
                jTable1.setValueAt("Có", jTable1.getSelectedRow(), 5);
            else jTable1.setValueAt("Không", jTable1.getSelectedRow(), 5);
            JOptionPane.showMessageDialog(null, "Chỉnh sửa thành công!");
        }
    }//GEN-LAST:event_suaBtnActionPerformed

    private void timBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timBtnActionPerformed
        // TODO add your handling code here:
        model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        model.addRow(new Object[]{
            "A0003", "Hồ Ngọc Hà", "024203443821", "000002AAB", "Không", "Không"
        });
    }//GEN-LAST:event_timBtnActionPerformed

    public void showTable(){
        model = (DefaultTableModel) jTable1.getModel();
        
        model.setRowCount(0);
        
        model.addRow(new Object[]{
            "A0001", "Lê Ngọc Phương Linh", "032494210411", "000001AAA", "Có", "Không"
        });
        
        model.addRow(new Object[]{
            "A0002", "Phan Tấn Trung", "026234790300", "000001AAA", "Không", "Không"
        });
        
        model.addRow(new Object[]{
            "A0003", "Hồ Ngọc Hà", "024203443821", "000002AAB", "Không", "Không"
        });
        
        model.addRow(new Object[]{
            "A0004", "Nguyễn Thanh Tùng", "022283055431", "000003ABC", "Không", "Có"
        });
        
        model.addRow(new Object[]{
            "A0005", "Phạm Ngọc Thạch", "034759124932", "000006EGB", "Có", "Có"
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cccdTf;
    private javax.swing.JRadioButton coRDB1;
    private javax.swing.JRadioButton coRDB2;
    private javax.swing.JTextField idHoTf;
    private javax.swing.JTextField idKhaiTf;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel3;
    private com.k33ptoo.components.KButton khaiBaoBtn;
    private javax.swing.JRadioButton khongRDB1;
    private javax.swing.JRadioButton khongRDB2;
    private javax.swing.JTextField nhapTf;
    private com.k33ptoo.components.KButton suaBtn;
    private javax.swing.JTextField tenTf;
    private com.k33ptoo.components.KButton timBtn;
    private com.k33ptoo.components.KButton xoaBtn;
    private javax.swing.JLabel xoaLabel;
    // End of variables declaration//GEN-END:variables
}
