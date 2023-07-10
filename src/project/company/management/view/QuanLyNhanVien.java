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
import project.company.management.model.TaiKhoan;

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
        btXoa.setEnabled(false);
            
        showData();

    }
    public void showData() {
   
   
        String date = null;
       String date2= null;
       
        for (NhanVien nhanVien : danhSachNhanVien) {
            date = simpleDateFormat.format(nhanVien.getTuoi());
            date2 = simpleDateFormat.format(nhanVien.getNgayKyHopDong());
             model.addRow(new Object[]{
                 nhanVien.getMaNV(), 
                 nhanVien.getTaiKhoan().getTenTK(), 
                 nhanVien.getTaiKhoan().getMatKhauTK(), 
                 nhanVien.getTen(), date, 
                 nhanVien.getDiaChi(), 
                 nhanVien.getGioiTinh(),
                 nhanVien.getSoDienThoai(), 
                 date2
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
        etGioiTinh = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btThem = new com.k33ptoo.components.KButton();
        btXoa = new com.k33ptoo.components.KButton();
        btSua = new com.k33ptoo.components.KButton();
        jLabel8 = new javax.swing.JLabel();
        etTenNhanVien = new javax.swing.JTextField();
        jDatePicker = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        etMatKhau = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        etSDT = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        etMaNV = new javax.swing.JTextField();
        jDateKyHD = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(102, 255, 255));
        setPreferredSize(new java.awt.Dimension(1215, 819));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã nhân viên", "Tài khoản", "Mât khẩu", "Tên nhân viên", "Ngày sinh", "Địa chỉ", "Giới tính", "Số ĐT", "Ngày ký HĐ"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
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
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(30);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(120);
        }

        jComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mời chọn chức năng", "Thêm nhân viên", "Xóa nhân viên", "Chỉnh sửa nhân viên" }));
        jComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxActionPerformed(evt);
            }
        });

        etTaiKhoan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etTaiKhoan.setPreferredSize(new java.awt.Dimension(140, 30));

        etDiaChi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etDiaChi.setPreferredSize(new java.awt.Dimension(140, 30));

        etGioiTinh.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etGioiTinh.setPreferredSize(new java.awt.Dimension(140, 30));

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
        jLabel6.setText("Giới tính");

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

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Ngày ký HĐ");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Số điện thoại");

        etSDT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etSDT.setPreferredSize(new java.awt.Dimension(140, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Mã nhân viên");

        etMaNV.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etMaNV.setPreferredSize(new java.awt.Dimension(140, 30));

        jDateKyHD.setDateFormatString("dd-MM-yyyy");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(etMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etTenNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(102, 102, 102)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel9))
                                .addGap(8, 8, 8))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(etMatKhau)
                            .addComponent(etGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateKyHD, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(158, 158, 158)
                        .addComponent(btXoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(113, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(454, 454, 454))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 985, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etTenNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(etGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDateKyHD, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(47, 47, 47)
                .addComponent(jLabel7)
                .addGap(6, 6, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btXoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemActionPerformed
        // TODO add your handling code here:
        String maNV = etMaNV.getText().trim();
        String taiKhoan = etTaiKhoan.getText();
        String matKhau = String.valueOf(etMatKhau.getPassword());
        String ten = etTenNhanVien.getText();
        String gioiTinh = etGioiTinh.getText();
        String diaChi = etDiaChi.getText();
        String soDT = etSDT.getText();
        Date ngaySinh = (Date) jDatePicker.getDate();
        Date ngayKyHD = jDateKyHD.getDate();
        
        if(taiKhoan.isEmpty() || matKhau.isEmpty() || ten.isEmpty() || gioiTinh.isEmpty() || diaChi.isEmpty() || ngaySinh == null ) {
            JOptionPane.showMessageDialog(null, "Không được để trống!");
        } else {
            System.out.println("matkhau: " + matKhau);
            TaiKhoan taiKhoan2 = new TaiKhoan(taiKhoan, matKhau);
            NhanVien nhanVien = new NhanVien(maNV, taiKhoan2, ten, ngaySinh, gioiTinh, soDT, diaChi, ngayKyHD);
            danhSachNhanVien.add(nhanVien);
            model.addRow(new Object[]{
                nhanVien.getTaiKhoan().getTenTK(), nhanVien.getTaiKhoan().getMatKhauTK(), nhanVien.getTen(), ngaySinh, nhanVien.getDiaChi(), nhanVien.getGioiTinh()
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
            etGioiTinh.setText("");
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
                
                String soCCCD = etMaNV.getText();
                if (!soCCCD.isEmpty()) {
                    for (int i = 0; i < danhSachNhanVien.size(); i++) {
                        if (danhSachNhanVien.get(i).getMaNV().equals(soCCCD)) {
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
            JOptionPane.showMessageDialog(null, "Hãy chọn một nhân viên!");
        }
        else if(jTable1.getSelectedRowCount() > 1){
            JOptionPane.showMessageDialog(null, "Chỉ được chọn một nhân viên!");
        }
        else{
            jTable1.setValueAt(etMaNV.getText(), jTable1.getSelectedRow(), 0);
            jTable1.setValueAt(etTaiKhoan.getText(), jTable1.getSelectedRow(), 1);
            jTable1.setValueAt(etMatKhau.getText(), jTable1.getSelectedRow(), 2);
            jTable1.setValueAt(etTenNhanVien.getText(), jTable1.getSelectedRow(), 3);
            jTable1.setValueAt(jDatePicker.getDate().toString(), jTable1.getSelectedRow(), 4);
            jTable1.setValueAt(etDiaChi.getText(), jTable1.getSelectedRow(), 5);
            jTable1.setValueAt(etGioiTinh.getText(), jTable1.getSelectedRow(), 6);
            jTable1.setValueAt(jDateKyHD.getDate().toString(), jTable1.getSelectedRow(), 7);
            JOptionPane.showMessageDialog(this, "Chỉnh sửa thành công!");
        }
    }//GEN-LAST:event_btSuaActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        if(jTable1.getSelectedRowCount() == 1){
            try {
                etMaNV.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
                etTaiKhoan.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
                etMatKhau.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString());
                etTenNhanVien.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString());
                Date date = simpleDateFormat.parse(jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString());
                jDatePicker.setDate(date);
                etDiaChi.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 5).toString());
                etGioiTinh.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 6).toString());
                etSDT.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 7).toString());
                
                Date date2 = simpleDateFormat.parse(jTable1.getValueAt(jTable1.getSelectedRow(), 8).toString());
                jDateKyHD.setDate(date2);
            } catch (ParseException ex) {
                Logger.getLogger(QuanLyNhanVien.class.getName()).log(Level.SEVERE, null, ex);
            }


        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxActionPerformed
        // TODO add your handling code here:
        if(jComboBox.getSelectedIndex() == 0){
            btSua.setEnabled(false);
            btThem.setEnabled(false);
            btXoa.setEnabled(false);
        }
        
        if(jComboBox.getSelectedIndex() == 1){
            btSua.setEnabled(false);
            btThem.setEnabled(true);
            btXoa.setEnabled(false);
        }
        
        if(jComboBox.getSelectedIndex() == 2){
            btSua.setEnabled(false);
            btThem.setEnabled(false);
            btXoa.setEnabled(true);
        }
        
        if(jComboBox.getSelectedIndex() == 3){
            btSua.setEnabled(true);
            btThem.setEnabled(false);
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
    private com.k33ptoo.components.KButton btXoa;
    private javax.swing.JTextField etDiaChi;
    private javax.swing.JTextField etGioiTinh;
    private javax.swing.JTextField etMaNV;
    private javax.swing.JPasswordField etMatKhau;
    private javax.swing.JTextField etSDT;
    private javax.swing.JTextField etTaiKhoan;
    private javax.swing.JTextField etTenNhanVien;
    private javax.swing.JComboBox<String> jComboBox;
    private com.toedter.calendar.JDateChooser jDateKyHD;
    private com.toedter.calendar.JDateChooser jDatePicker;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
