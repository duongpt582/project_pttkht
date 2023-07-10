
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

        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        showDataTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        kButton1 = new com.k33ptoo.components.KButton();

        kGradientPanel1.setkEndColor(new java.awt.Color(102, 255, 102));
        kGradientPanel1.setkGradientFocus(90);
        kGradientPanel1.setkStartColor(new java.awt.Color(255, 102, 102));

        jScrollPane1.setBackground(new java.awt.Color(165, 240, 175));

        showDataTable.setBackground(new java.awt.Color(255, 102, 102));
        showDataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(showDataTable);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/company/management/icon/icons8-microsoft-excel-128.png"))); // NOI18N
        jLabel1.setText("Xuất dữ liệu ra Excel");

        kButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/company/management/icon/icons8-export-excel-24.png"))); // NOI18N
        kButton1.setText("Export Excel");
        kButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        kButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        kButton1.setIconTextGap(5);
        kButton1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        kButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1068, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(424, 424, 424)
                .addComponent(kButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(kButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        try {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.showSaveDialog(this);
            File saveFile = fileChooser.getSelectedFile();
            
            if (saveFile != null) {
                saveFile = new File(saveFile.toString() + ".xlsx");
                FileOutputStream output;
                
                try (Workbook wb = new XSSFWorkbook()) {
                    Sheet sheet = wb.createSheet("Customer");
                    
                    CellStyle cellStyle = createStyleForText(sheet);
                    
                    // set dữ liệu tên các cột
                    writeHeader(sheet, 0);
                    
                    // bắt đầu set dữ liệu từ dòng thứ 2
                    for (int i = 1; i < showDataTable.getRowCount(); i++) {
                        Row row = sheet.createRow(i);
                        
                        for (int j = 0; j < showDataTable.getColumnCount(); j++) {
                            Cell cell = row.createCell(j);
                            
                            if (showDataTable.getValueAt(i, j) != null) {
                                cell.setCellValue(showDataTable.getValueAt(i, j).toString());
                                cell.setCellStyle(cellStyle);
                            }
                        }
                    }   output = new FileOutputStream(new File(saveFile.toString()));
                    
                    // Auto resize column witdth
                    int numberOfColumn = sheet.getRow(0).getPhysicalNumberOfCells();
                    autosizeColumn(sheet, numberOfColumn);
            
                    wb.write(output);
                }
                output.close();
                
                // tự động mở file sau khi lưu
                openFile(saveFile.toString());
                
            } else {
                JOptionPane.showMessageDialog(null, "Lỗi tạo file!!!");
            }
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, e);
        } catch (IOException ex) {
            Logger.getLogger(XuatKho.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_kButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.k33ptoo.components.KButton kButton1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private javax.swing.JTable showDataTable;
    // End of variables declaration//GEN-END:variables
}
