/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

package project.company.management.view;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import project.company.management.model.HangHoa;
import project.company.management.model.NhaCungCap;
import project.company.management.model.NhanVien;

/**
 *
 * @author ASUS
 */
public class QuanLyNhaCungCap extends javax.swing.JPanel {

    ArrayList<NhaCungCap> danhSachNhaCungCaps;
    DefaultTableModel model;
    public QuanLyNhaCungCap() {
        initComponents();
          
        danhSachNhaCungCaps = MainFrame.danhSachNhaCungCaps;
        
        model = (DefaultTableModel) jTable1.getModel();

        btChinhSua.setEnabled(false);
        btThem.setEnabled(false);
        btXoa.setEnabled(false);
        
        model.setRowCount(0);

        showData();

    }
    public void showData() {
       
        for (NhaCungCap nhaCungCap : danhSachNhaCungCaps) {
       
             model.addRow(new Object[]{
                 nhaCungCap.getMaNhaCungCap(),
                 nhaCungCap.getTenNhaCungCap()
            });
        
        }
    }
 
   

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btXoa = new com.k33ptoo.components.KButton();
        btChinhSua = new com.k33ptoo.components.KButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel_ten = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel_TenHang = new javax.swing.JLabel();
        jLabel_maHang = new javax.swing.JLabel();
        etTenNhaCungCap = new javax.swing.JTextField();
        etMaNhaCungCap = new javax.swing.JTextField();
        btThem = new com.k33ptoo.components.KButton();

        setBackground(new java.awt.Color(102, 204, 255));
        setPreferredSize(new java.awt.Dimension(1215, 819));

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

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Mã nhà cung cấp", "Tên nhà cung cấp"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jLabel_ten.setFont(new java.awt.Font("STIXVariants", 1, 36)); // NOI18N
        jLabel_ten.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_ten.setText("Quản Lý Nhà Cung Cấp");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mời bạn chọn chức năng", "Thêm mới nhà cung cấp", "Thay đổi thông tin nhà cung cấp", "Xoá nhà cung cấp", "" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel_TenHang.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel_TenHang.setText("Tên nhà cung cấp:");

        jLabel_maHang.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel_maHang.setText("Mã nhà cung cấp:");

        etTenNhaCungCap.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N

        etMaNhaCungCap.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N

        btThem.setText("Thêm nhà cung cấp");
        btThem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btThem.setkEndColor(new java.awt.Color(255, 255, 51));
        btThem.setPreferredSize(new java.awt.Dimension(130, 40));
        btThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel_maHang)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etMaNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(134, 134, 134)
                .addComponent(jLabel_TenHang, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etTenNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(198, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_ten, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btThem, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(btChinhSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(btXoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(185, 185, 185))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(446, 446, 446))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel_ten, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_maHang, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_TenHang, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etTenNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etMaNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(119, 119, 119)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btXoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btChinhSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoaActionPerformed
        // TODO add your handling code here:
         String maNhaCungCapString = etMaNhaCungCap.getText();
        String tenNhaCungCapString = etTenNhaCungCap.getText();
        
         model = (DefaultTableModel) jTable1.getModel();
        if(jTable1.getSelectedRowCount() == 0){
            JOptionPane.showMessageDialog(null, "Hãy chọn một tài khoản!");
        }
        else if(jTable1.getSelectedRowCount() > 1){
            JOptionPane.showMessageDialog(null, "Chỉ được chọn một tài khoản!");
        }
        else if (maNhaCungCapString.isEmpty() || tenNhaCungCapString.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Không được để trống!");
        } else {
            NhaCungCap hangHoa = new NhaCungCap(maNhaCungCapString, tenNhaCungCapString);
            
            danhSachNhaCungCaps.remove(hangHoa);
            
            model.removeRow(jTable1.getSelectedRow());
            
            JOptionPane.showMessageDialog(this, "Xoá thành công!");

            
        }
    }//GEN-LAST:event_btXoaActionPerformed

    private void btChinhSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btChinhSuaActionPerformed
        // TODO add your handling code here:
          String maNhaCungCapString = etMaNhaCungCap.getText();
        String tenNhaCungCapString = etTenNhaCungCap.getText();
        
         model = (DefaultTableModel) jTable1.getModel();
        if(jTable1.getSelectedRowCount() == 0){
            JOptionPane.showMessageDialog(null, "Hãy chọn một nhân viên!");
        }
        else if(jTable1.getSelectedRowCount() > 1){
            JOptionPane.showMessageDialog(null, "Chỉ được chọn một nhân viên!");
        }
        else if (maNhaCungCapString.isEmpty() || tenNhaCungCapString.isEmpty() ) {
            JOptionPane.showMessageDialog(this, "Không được để trống!");

        } else {
            NhaCungCap hangHoa = new NhaCungCap(maNhaCungCapString, tenNhaCungCapString);
            
            jTable1.setValueAt(hangHoa.getMaNhaCungCap(), jTable1.getSelectedRow(), 0);
            jTable1.setValueAt(hangHoa.getTenNhaCungCap(), jTable1.getSelectedRow(), 1);
          
            JOptionPane.showMessageDialog(this, "Chỉnh sửa thành công!");
            

            
        }
    }//GEN-LAST:event_btChinhSuaActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
         if(jTable1.getSelectedRowCount() == 1){
            etMaNhaCungCap.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
            etTenNhaCungCap.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
        }
        
    }//GEN-LAST:event_jTable1MouseClicked

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
            btChinhSua.setEnabled(false);
            btThem.setEnabled(true);
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
        String maNhaCungCap = etMaNhaCungCap.getText();
        String tenNhaCungCap = etTenNhaCungCap.getText();
        
        if (maNhaCungCap.isEmpty() || tenNhaCungCap.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Không được để trống!");

            
        } else {
            NhaCungCap hangHoa = new NhaCungCap(maNhaCungCap, tenNhaCungCap);
            
            danhSachNhaCungCaps.add(hangHoa);
            
            model.addRow(new Object[]{
                 hangHoa.getMaNhaCungCap(),
                 hangHoa.getTenNhaCungCap()
               
            });
            
            JOptionPane.showMessageDialog(this, "Thêm thành công!");

            
        }
    }//GEN-LAST:event_btThemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton btChinhSua;
    private com.k33ptoo.components.KButton btThem;
    private com.k33ptoo.components.KButton btXoa;
    private javax.swing.JTextField etMaNhaCungCap;
    private javax.swing.JTextField etTenNhaCungCap;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel_TenHang;
    private javax.swing.JLabel jLabel_maHang;
    private javax.swing.JLabel jLabel_ten;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}
