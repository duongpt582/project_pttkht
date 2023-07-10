/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package project.company.management.view;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import project.company.management.model.HangHoa;
import project.company.management.model.NhanVien;

/**
 *
 * @author ASUS
 */
public class QuanLyHangHoa extends javax.swing.JPanel {

    public static ArrayList<HangHoa> danhSachHangHoa;
    DefaultTableModel model;

    public QuanLyHangHoa() {
        initComponents();
        
        taoHangHoa();
        
        model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        
        showData();
    }
    private void taoHangHoa() {
        danhSachHangHoa = new ArrayList<>();
        danhSachHangHoa.add(new HangHoa("112", "Dầu gội", "1000"));
        danhSachHangHoa.add(new HangHoa("112", "Dầu gội", "1000"));
        danhSachHangHoa.add(new HangHoa("456", "Xà phòng", "500"));
        danhSachHangHoa.add(new HangHoa("789", "Bột giặt", "2000"));
        danhSachHangHoa.add(new HangHoa("123", "Nước rửa tay", "800"));
        danhSachHangHoa.add(new HangHoa("789", "Kem đánh răng", "1500"));
        danhSachHangHoa.add(new HangHoa("456", "Bia", "5000"));
        danhSachHangHoa.add(new HangHoa("112", "Sữa tắm", "1200"));
        danhSachHangHoa.add(new HangHoa("123", "Dầu ăn", "2500"));
        danhSachHangHoa.add(new HangHoa("789", "Nước ngọt", "3000"));
        danhSachHangHoa.add(new HangHoa("456", "Bánh mì", "200"));
    }
    
    public void showData() {
        for (HangHoa hangHoa : danhSachHangHoa) {
            
             model.addRow(new Object[]{
                 hangHoa.getMaHang(),
                 hangHoa.getTenHang(),
                 hangHoa.getDonGia()
            });
        
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel_ten = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel_TenHang = new javax.swing.JLabel();
        jLabel_maHang = new javax.swing.JLabel();
        etTenHang = new javax.swing.JTextField();
        etMaHang = new javax.swing.JTextField();
        btThem = new com.k33ptoo.components.KButton();
        btXoa = new com.k33ptoo.components.KButton();
        btChinhSua = new com.k33ptoo.components.KButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel_TenHang1 = new javax.swing.JLabel();
        etDonGia = new javax.swing.JTextField();

        jLabel1.setText("jLabel1");

        setBackground(new java.awt.Color(102, 255, 255));

        jLabel_ten.setFont(new java.awt.Font("STIXVariants", 1, 36)); // NOI18N
        jLabel_ten.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_ten.setText("Quản Lý Hàng Hoá");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mời bạn chọn chức năng", "Thêm mới hàng hoá", "Thay đổi thông tin hàng hoá", "Xoá hàng hoá" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel_TenHang.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel_TenHang.setText("Tên hàng:");

        jLabel_maHang.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel_maHang.setText("Mã hàng:");

        etTenHang.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N

        etMaHang.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N

        btThem.setText("Thêm hàng hoá");
        btThem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btThem.setkEndColor(new java.awt.Color(255, 255, 51));
        btThem.setPreferredSize(new java.awt.Dimension(130, 40));
        btThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThemActionPerformed(evt);
            }
        });

        btXoa.setText("Xoá");
        btXoa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btXoa.setkEndColor(new java.awt.Color(255, 255, 51));
        btXoa.setPreferredSize(new java.awt.Dimension(130, 40));
        btXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXoaActionPerformed(evt);
            }
        });

        btChinhSua.setText("Chỉnh sửa");
        btChinhSua.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btChinhSua.setkEndColor(new java.awt.Color(255, 255, 51));
        btChinhSua.setPreferredSize(new java.awt.Dimension(130, 40));
        btChinhSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btChinhSuaActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã hàng", "Tên hàng", "Đơn giá"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jLabel_TenHang1.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel_TenHang1.setText("Đơn giá");

        etDonGia.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_ten, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addComponent(btThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(btChinhSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(btXoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 205, Short.MAX_VALUE)))
                .addGap(60, 60, 60))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(402, 402, 402)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(447, 447, 447)
                                .addComponent(jLabel_TenHang1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(etDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel_TenHang, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(etTenHang, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel_maHang)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(etMaHang, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel_ten, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_maHang, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etMaHang, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_TenHang, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etTenHang, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_TenHang1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btChinhSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btXoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
          if(jComboBox1.getSelectedIndex() == 0){
            btChinhSua.setEnabled(false);
            btThem.setEnabled(false);
            btXoa.setEnabled(false);
        }
        
        if(jComboBox1.getSelectedIndex() == 1){
            btChinhSua.setEnabled(false);
            btThem.setEnabled(true);
            btXoa.setEnabled(false);
        }
        
        if(jComboBox1.getSelectedIndex() == 2){
            btChinhSua.setEnabled(true);
            btThem.setEnabled(false);
            btXoa.setEnabled(false);
        }
        
        if(jComboBox1.getSelectedIndex() == 3){
            btChinhSua.setEnabled(false);
            btThem.setEnabled(false);
            btXoa.setEnabled(true);
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void btThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemActionPerformed
        // TODO add your handling code here:
        String maHang = etMaHang.getText();
        String tenHang = etTenHang.getText();
        String donGia = etDonGia.getText();
        
        if (maHang.isEmpty() || tenHang.isEmpty() || donGia.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Không được để trống!");

            
        } else {
            HangHoa hangHoa = new HangHoa(maHang, tenHang, donGia);
            
            danhSachHangHoa.add(hangHoa);
            
            model.addRow(new Object[]{
                 hangHoa.getMaHang(),
                 hangHoa.getTenHang(),
                 hangHoa.getDonGia()
            });
            
            JOptionPane.showMessageDialog(this, "Thêm thành công!");

            
        }
    }//GEN-LAST:event_btThemActionPerformed

    private void btXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoaActionPerformed
        // TODO add your handling code here:
         String maHang = etMaHang.getText();
        String tenHang = etTenHang.getText();
        String donGia = etDonGia.getText();
        
         model = (DefaultTableModel) jTable1.getModel();
        if(jTable1.getSelectedRowCount() == 0){
            JOptionPane.showMessageDialog(null, "Hãy chọn một tài khoản!");
        }
        else if(jTable1.getSelectedRowCount() > 1){
            JOptionPane.showMessageDialog(null, "Chỉ được chọn một tài khoản!");
        }
        else if (maHang.isEmpty() || tenHang.isEmpty() || donGia.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Không được để trống!");
        } else {
            HangHoa hangHoa = new HangHoa(maHang, tenHang, donGia);
            
            danhSachHangHoa.remove(hangHoa);
            
            model.removeRow(jTable1.getSelectedRow());
            
            JOptionPane.showMessageDialog(this, "Xoá thành công!");

            
        }
    }//GEN-LAST:event_btXoaActionPerformed

    private void btChinhSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btChinhSuaActionPerformed
        // TODO add your handling code here:
        String maHang = etMaHang.getText();
        String tenHang = etTenHang.getText();
        String donGia = etDonGia.getText();
        
         model = (DefaultTableModel) jTable1.getModel();
        if(jTable1.getSelectedRowCount() == 0){
            JOptionPane.showMessageDialog(null, "Hãy chọn một nhân viên!");
        }
        else if(jTable1.getSelectedRowCount() > 1){
            JOptionPane.showMessageDialog(null, "Chỉ được chọn một nhân viên!");
        }
        else if (maHang.isEmpty() || tenHang.isEmpty() || donGia.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Không được để trống!");

        } else {
            HangHoa hangHoa = new HangHoa(maHang, tenHang, donGia);
            
            jTable1.setValueAt(hangHoa.getMaHang(), jTable1.getSelectedRow(), 0);
            jTable1.setValueAt(hangHoa.getTenHang(), jTable1.getSelectedRow(), 1);
            jTable1.setValueAt(hangHoa.getDonGia(), jTable1.getSelectedRow(), 2);
          
            JOptionPane.showMessageDialog(this, "Chỉnh sửa thành công!");
            

            
        }
    }//GEN-LAST:event_btChinhSuaActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
         if(jTable1.getSelectedRowCount() == 1){
            etMaHang.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
            etTenHang.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
            etDonGia.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString());
        }

    }//GEN-LAST:event_jTable1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton btChinhSua;
    private com.k33ptoo.components.KButton btThem;
    private com.k33ptoo.components.KButton btXoa;
    private javax.swing.JTextField etDonGia;
    private javax.swing.JTextField etMaHang;
    private javax.swing.JTextField etTenHang;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_TenHang;
    private javax.swing.JLabel jLabel_TenHang1;
    private javax.swing.JLabel jLabel_maHang;
    private javax.swing.JLabel jLabel_ten;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

  
}
