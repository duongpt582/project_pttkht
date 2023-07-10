
package project.company.management.view;

import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.BorderStyle;
import project.company.management.database.DatabaseCanBo;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class XuatKho extends javax.swing.JPanel {
   
    Connection connection;
    DatabaseCanBo dbCanBo = new DatabaseCanBo();
    DefaultTableModel model;

    public XuatKho() throws SQLException {
        initComponents();
        
        showDataToTable();
    }
    
    public void showDataToTable() throws SQLException {
        String id, hoTen, ngaySinh, gioiTinh, diaChi;
        
        model = (DefaultTableModel) showDataTable.getModel();
        
        //Tạo ra các cột với các tiêu đề
        model.setColumnIdentifiers(new Object[]{
                "STT", "ID","Chức Vụ", "Họ và tên", "Ngày sinh", "Địa chỉ", "Giới Tính" ,"Số Ngày Làm Việc", "Lương"
        });
        
        System.out.println("" + model.getColumnName(1));
        
        // lấy biến connection từ dbCanbo
        connection = dbCanBo.createConnect2();
        
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("SELECT * FROM can_bo");

        int i = 1;
        while (rs.next()) {
            id = rs.getString(2);
            hoTen = rs.getString("ho_ten");
            ngaySinh = rs.getString("ngay_sinh");
            gioiTinh = rs.getString(5);
            diaChi = rs.getString(6);
            String chucVu = rs.getString(7);
            String soNgayLamViec = rs.getString(8);
            double luong = rs.getDouble(9);

            model.addRow(new Object[]{
                    i++, id, chucVu, hoTen, ngaySinh, diaChi, gioiTinh, soNgayLamViec, String.format("%,.2f", luong)
            });
        }
    }
    
    public void openFile(String file) {
        try {
            File path = new File(file);
            Desktop.getDesktop().open(path);
        }catch(IOException error) {
            JOptionPane.showMessageDialog(kGradientPanel1, error);
        } 
    }
    
    // Tự động điều chỉnh kích thước các cột
    private static void autosizeColumn(Sheet sheet, int lastColumn) {
        for (int columnIndex = 0; columnIndex < lastColumn; columnIndex++) {
            sheet.autoSizeColumn(columnIndex);
        }
    }
    
    // Create CellStyle for header
    private static CellStyle createStyleForHeader(Sheet sheet) {
        // Create font
        Font font = sheet.getWorkbook().createFont();
        font.setFontName("Calibri"); 
        font.setBold(true);
        font.setFontHeightInPoints((short) 14); // font size
        font.setColor(IndexedColors.BLACK.getIndex()); // text color
 
        // Create CellStyle
        CellStyle cellStyle = sheet.getWorkbook().createCellStyle();
        cellStyle.setFont(font);
        cellStyle.setFillForegroundColor(IndexedColors.LIGHT_TURQUOISE.getIndex());
        cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        cellStyle.setBorderBottom(BorderStyle.THIN);
        cellStyle.setAlignment(HorizontalAlignment.CENTER);
        return cellStyle;
    }
    
    // Tạo CellStyle cho chữ
    private CellStyle createStyleForText(Sheet sheet) {
        // Create font
        Font font = sheet.getWorkbook().createFont();
        font.setFontName("Calibri"); 
        font.setFontHeightInPoints((short) 11); // font size
        font.setColor(IndexedColors.BLACK.getIndex()); // text color
 
        // Create CellStyle
        CellStyle cellStyle = sheet.getWorkbook().createCellStyle();
        cellStyle.setFont(font);
        
        cellStyle.setAlignment(HorizontalAlignment.CENTER);
        return cellStyle;
    }
    
    // Tạo header bằng các tên cột
    private void writeHeader(Sheet sheet, int rowIndex) {
        // tạo CellStyle
        CellStyle cellStyle = createStyleForHeader(sheet);
         
        // tạo hàng
        Row row = sheet.createRow(rowIndex);
         
        // gán dữ liệu các cell
        for (int i = 0; i < model.getColumnCount(); i++) {
            Cell cell = row.createCell(i);
            cell.setCellStyle(cellStyle);
            cell.setCellValue(model.getColumnName(i));
        }
    }
    
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
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
        jLabel8 = new javax.swing.JLabel();
        etTenNhanVien = new javax.swing.JTextField();
        jDatePicker = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        etMatKhau = new javax.swing.JPasswordField();
        etDiaChi1 = new javax.swing.JTextField();
        etTaiKhoan2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1215, 819));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã phiếu xuất", "Mã hàng", "Số lượng", "Mã nhà cung cấp", "Ngày nhập", "Tổng tiền", "Mã nhân viên"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
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

        etTaiKhoan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etTaiKhoan.setPreferredSize(new java.awt.Dimension(140, 30));

        etDiaChi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etDiaChi.setPreferredSize(new java.awt.Dimension(140, 30));

        etSoCCCD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etSoCCCD.setPreferredSize(new java.awt.Dimension(140, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Xuất Kho");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Mã nhà cung cấp:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Ngày nhập:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Số lượng:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Thành tiền:");

        jLabel7.setText(".");

        btThem.setText("Tạo phiếu");
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
        jLabel8.setText("Mã hàng:");

        etTenNhanVien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etTenNhanVien.setPreferredSize(new java.awt.Dimension(140, 30));
        etTenNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etTenNhanVienActionPerformed(evt);
            }
        });

        jDatePicker.setDateFormatString("dd-MM-yyyy");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Mã nhân viên:");

        etDiaChi1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etDiaChi1.setPreferredSize(new java.awt.Dimension(140, 30));

        etTaiKhoan2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etTaiKhoan2.setPreferredSize(new java.awt.Dimension(140, 30));
        etTaiKhoan2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etTaiKhoan2ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Mã phiếu xuất:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(etTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(480, 480, 480))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(etDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 649, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(213, 213, 213)
                                .addComponent(btSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btXoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(193, 193, 193)))
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(86, 86, 86)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etDiaChi1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(etTaiKhoan2, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(209, 209, 209)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(34, 34, 34)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(etSoCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(47, 47, 47)
                                        .addComponent(etMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(etTenNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etTaiKhoan2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etTenNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jDatePicker, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etSoCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etDiaChi1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(btSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btXoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(84, 84, 84)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(etDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1285, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1279, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 853, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 847, Short.MAX_VALUE)
                    .addContainerGap()))
        );
    }// </editor-fold>//GEN-END:initComponents

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

    private void etTenNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etTenNhanVienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etTenNhanVienActionPerformed

    private void etTaiKhoan2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etTaiKhoan2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etTaiKhoan2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton btSua;
    private com.k33ptoo.components.KButton btThem;
    private com.k33ptoo.components.KButton btXoa;
    private javax.swing.JTextField etDiaChi;
    private javax.swing.JTextField etDiaChi1;
    private javax.swing.JPasswordField etMatKhau;
    private javax.swing.JTextField etSoCCCD;
    private javax.swing.JTextField etTaiKhoan;
    private javax.swing.JTextField etTaiKhoan2;
    private javax.swing.JTextField etTenNhanVien;
    private com.toedter.calendar.JDateChooser jDatePicker;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
