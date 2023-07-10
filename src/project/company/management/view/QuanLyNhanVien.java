/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package project.company.management.view;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.mysql.cj.x.protobuf.MysqlxCrud;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.management.Query;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import project.company.management.database.DatabaseCanBo;
import java.io.FileNotFoundException;
import com.itextpdf.text.DocumentException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFileChooser;
import org.jdatepicker.JDatePicker;
import project.company.management.model.NhanVien;

/**
 *
 * @author thinkpro
 */
public class QuanLyNhanVien extends javax.swing.JPanel {

    DefaultTableModel model;
    DatabaseCanBo db; 
    ArrayList<NhanVien> danhSachNhanVien;
    SimpleDateFormat simpleDateFormat;
    
    public QuanLyNhanVien() throws ParseException {
        initComponents();
        danhSachNhanVien = MainFrame.danhSachNhanViens;
        
        
        model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        //Tạo ra các cột với các tiêu đề
        simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");

        Date date = new Date();
        jDatePicker.setDate(date);
        
        btSua.setEnabled(false);
        btThem.setEnabled(false);
        btTim.setEnabled(false);
        btXoa.setEnabled(false);
            
        showData();

    }
    public void showData() {
   
   
        String date = null;
       
       
        for (NhanVien nhanVien : danhSachNhanVien) {
            date = simpleDateFormat.format(nhanVien.getTuoi());
             model.addRow(new Object[]{
                        nhanVien.getTaiKhoan(), nhanVien.getMatKhau(), nhanVien.getTen(), date, nhanVien.getDiaChi(), nhanVien.getSoCCCD()
            });
        
        }
    }
    
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBox = new javax.swing.JComboBox<>();
        etTaiKhoan = new javax.swing.JTextField();
        etDiaChi = new javax.swing.JTextField();
        etSoCCCD = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btThem = new com.k33ptoo.components.KButton();
        btXoa = new com.k33ptoo.components.KButton();
        btSua = new com.k33ptoo.components.KButton();
        btTim = new com.k33ptoo.components.KButton();
        jLabel8 = new javax.swing.JLabel();
        etTenNhanVien = new javax.swing.JTextField();
        jDatePicker = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        etMatKhau = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(102, 255, 255));
        setPreferredSize(new java.awt.Dimension(1215, 819));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Tài khoản", "Mât khẩu", "Tên nhân viên", "Ngày sinh", "Địa chỉ", "Số CCCD"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(120);
        }

        jComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mời chọn chức năng", "Thêm nhân viên", "Xóa nhân viên", "Chỉnh sửa nhân viên", "Tìm kiếm nhân viên" }));
        jComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxActionPerformed(evt);
            }
        });

        etTaiKhoan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etTaiKhoan.setPreferredSize(new java.awt.Dimension(140, 30));

        etDiaChi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etDiaChi.setPreferredSize(new java.awt.Dimension(140, 30));

        etSoCCCD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etSoCCCD.setPreferredSize(new java.awt.Dimension(140, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Quản Lý Nhân Viên");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Mật khẩu");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Ngày sinh");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Địa chỉ");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Số CCCD");

        jLabel7.setText(".");

        btThem.setText("Thêm nhân viên");
        btThem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btThem.setkEndColor(new java.awt.Color(255, 255, 51));
        btThem.setPreferredSize(new java.awt.Dimension(130, 40));
        btThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThemActionPerformed(evt);
            }
        });

        btXoa.setText("Xóa");
        btXoa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btXoa.setPreferredSize(new java.awt.Dimension(130, 40));
        btXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXoaActionPerformed(evt);
            }
        });

        btSua.setText("Chỉnh sửa");
        btSua.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btSua.setPreferredSize(new java.awt.Dimension(130, 40));
        btSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSuaActionPerformed(evt);
            }
        });

        btTim.setText("Tìm kiếm");
        btTim.setFocusable(false);
        btTim.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btTim.setPreferredSize(new java.awt.Dimension(130, 40));
        btTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTimActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Họ và Tên");

        etTenNhanVien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etTenNhanVien.setPreferredSize(new java.awt.Dimension(140, 30));
        etTenNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etTenNhanVienActionPerformed(evt);
            }
        });

        jDatePicker.setDateFormatString("dd-MM-yyyy");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Tài khoản");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(452, 452, 452))
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel4))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(114, 114, 114)
                                .addComponent(btSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(618, 618, 618)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btTim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(etTenNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                                        .addComponent(etTaiKhoan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(etDiaChi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(158, 158, 158)
                                                .addComponent(btXoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(etMatKhau)
                                        .addComponent(jDatePicker, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(etSoCCCD, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)))))))
                .addGap(0, 58, Short.MAX_VALUE))
            .addComponent(jScrollPane2)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(193, 193, 193)
                    .addComponent(jLabel5)
                    .addContainerGap(909, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(46, 46, 46)
                .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(etMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(etTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(etTenNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jDatePicker, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(etSoCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(etDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(41, 41, 41)
                .addComponent(jLabel7)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btXoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btTim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(201, 201, 201)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(584, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemActionPerformed
        // TODO add your handling code here:
        String taiKhoan = etTaiKhoan.getText();
        String matKhau = String.valueOf(etMatKhau.getPassword());
        String ten = etTenNhanVien.getText();
        String soCCCD = etSoCCCD.getText();
        String diaChi = etDiaChi.getText();
        Date ngaySinh = (Date) jDatePicker.getDate();
        
        if(taiKhoan.isEmpty() || matKhau.isEmpty() || ten.isEmpty() || soCCCD.isEmpty() || diaChi.isEmpty() || ngaySinh == null ) {
            JOptionPane.showMessageDialog(null, "Không được để trống!");
        } else {
            System.out.println("matkhau: " + matKhau);
            NhanVien nhanVien = new NhanVien(taiKhoan, matKhau, ten, ngaySinh, diaChi, soCCCD);
            danhSachNhanVien.add(nhanVien);
            model.addRow(new Object[]{
                nhanVien.getTaiKhoan(), nhanVien.getMatKhau(), nhanVien.getTen(), nhanVien.getTuoi(), nhanVien.getDiaChi(), nhanVien.getSoCCCD()
            });
            etTaiKhoan.setText("");
            etMatKhau.setText("");
            etDiaChi.setText("");
            try {
                jDatePicker.setDate(convertStringToDate("2-2-2020"));
                System.out.println("date: " + ngaySinh);
            } catch (ParseException ex) {
                Logger.getLogger(QuanLyNhanVien.class.getName()).log(Level.SEVERE, null, ex);
            }
            etSoCCCD.setText("");
            JOptionPane.showMessageDialog(null, "Thêm nhân viên thành công!");
        }
    }//GEN-LAST:event_btThemActionPerformed

    private void btXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoaActionPerformed
        // TODO add your handling code here:
        model = (DefaultTableModel) jTable1.getModel();
        if(jTable1.getSelectedRowCount() == 0){
            JOptionPane.showMessageDialog(null, "Hãy chọn một tài khoản!");
        }
        else if(jTable1.getSelectedRowCount() > 1){
            JOptionPane.showMessageDialog(null, "Chỉ được chọn một tài khoản!");
        }
        else {
            model.removeRow(jTable1.getSelectedRow());
            try {
                
                String soCCCD = etSoCCCD.getText();
                if (!soCCCD.isEmpty()) {
                    for (int i = 0; i < danhSachNhanVien.size(); i++) {
                        if (danhSachNhanVien.get(i).getSoCCCD().equals(soCCCD)) {
                            danhSachNhanVien.remove(i);
                            JOptionPane.showMessageDialog(null, "Xóa thành công!" );

                        }
                    }
 {
                        
                    }
                }
            } catch (IndexOutOfBoundsException exception) {
                JOptionPane.showMessageDialog(null, "Xóa thất bại! \n" + exception.getMessage());

            }
        }
    }//GEN-LAST:event_btXoaActionPerformed

    private void btSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuaActionPerformed
        // TODO add your handling code here:
        model = (DefaultTableModel) jTable1.getModel();
        if(jTable1.getSelectedRowCount() == 0){
            JOptionPane.showMessageDialog(null, "Hãy chọn một trường hợp cách ly!");
        }
        else if(jTable1.getSelectedRowCount() > 1){
            JOptionPane.showMessageDialog(null, "Chỉ được chọn một trường hợp cách ly!");
        }
        else{
            jTable1.setValueAt(etTaiKhoan.getText(), jTable1.getSelectedRow(), 0);
            jTable1.setValueAt(etMatKhau.getText(), jTable1.getSelectedRow(), 1);
            jTable1.setValueAt(etDiaChi.getText(), jTable1.getSelectedRow(), 3);
            jTable1.setValueAt(formatDate(jDatePicker.getDate()), jTable1.getSelectedRow(), 4);
            jTable1.setValueAt(etSoCCCD.getText(), jTable1.getSelectedRow(), 5);
            JOptionPane.showMessageDialog(this, "Chỉnh sửa thành công!");
        }
    }//GEN-LAST:event_btSuaActionPerformed

    private void btTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTimActionPerformed
        // TODO add your handling code here:
        model.setRowCount(0);
        model.addRow(new Object[]{
            "3", "Lê Ngọc Phương Linh", "032494210411", "000001AAA" , "2-4-2021", "F2"
        });
    }//GEN-LAST:event_btTimActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        if(jTable1.getSelectedRowCount() == 1){
            etTaiKhoan.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
            etMatKhau.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
            etTenNhanVien.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString());
            try {
                jDatePicker.setDate(convertStringToDate(jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString()));
            } catch (ParseException ex) {
                Logger.getLogger(QuanLyNhanVien.class.getName()).log(Level.SEVERE, null, ex);
            }
            etDiaChi.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString());
            etSoCCCD.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 5).toString());
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxActionPerformed
        // TODO add your handling code here:
        if(jComboBox.getSelectedIndex() == 0){
            btSua.setEnabled(false);
            btThem.setEnabled(false);
            btTim.setEnabled(false);
            btXoa.setEnabled(false);
        }
        
        if(jComboBox.getSelectedIndex() == 1){
            btSua.setEnabled(false);
            btThem.setEnabled(true);
            btTim.setEnabled(false);
            btXoa.setEnabled(false);
        }
        
        if(jComboBox.getSelectedIndex() == 2){
            btSua.setEnabled(false);
            btThem.setEnabled(false);
            btTim.setEnabled(false);
            btXoa.setEnabled(true);
        }
        
        if(jComboBox.getSelectedIndex() == 3){
            btSua.setEnabled(true);
            btThem.setEnabled(false);
            btTim.setEnabled(false);
            btXoa.setEnabled(false);
        }
        
        if(jComboBox.getSelectedIndex() == 4){
            btSua.setEnabled(false);
            btThem.setEnabled(false);
            btTim.setEnabled(true);
            btXoa.setEnabled(false);
        }
    }//GEN-LAST:event_jComboBoxActionPerformed

    private void etTenNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etTenNhanVienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etTenNhanVienActionPerformed

    public Date convertStringToDate(String s) throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date date = sdf.parse(s);
        return date;
    }
    
    public String formatDate(Date date){
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String date1 = sdf.format(date);
        return date1;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton btSua;
    private com.k33ptoo.components.KButton btThem;
    private com.k33ptoo.components.KButton btTim;
    private com.k33ptoo.components.KButton btXoa;
    private javax.swing.JTextField etDiaChi;
    private javax.swing.JPasswordField etMatKhau;
    private javax.swing.JTextField etSoCCCD;
    private javax.swing.JTextField etTaiKhoan;
    private javax.swing.JTextField etTenNhanVien;
    private javax.swing.JComboBox<String> jComboBox;
    private com.toedter.calendar.JDateChooser jDatePicker;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
