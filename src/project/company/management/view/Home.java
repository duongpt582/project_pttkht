package project.company.management.view;

import javax.swing.table.DefaultTableModel;
import project.company.management.database.DatabaseCanBo;
import java.sql.*;
import java.sql.SQLException;
import java.util.logging.*;

public final class Home extends javax.swing.JPanel {

    DefaultTableModel model;
    DatabaseCanBo db;
   
    public Home() throws SQLException {
        initComponents();
        
        model = (DefaultTableModel) tableInfomation.getModel();
        
        //Tạo ra các cột với các tiêu đề
        model.setColumnIdentifiers(new Object[]{
                "ID Hộ khẩu", "Tên chủ hộ", "CCCD chủ hộ", "Số nhân khẩu", "SĐT", "Địa chỉ",
        });
        showData();
        
    }
    public void showData() {
    String id,  hoTen, diaChi, gioiTinh, ngaySinh;
    int soNgayLam;

    model.addRow(new Object[]{
        "000001AAA", "Nguyễn Minh Đức", "026202003831", "5", "0888864666", "Số 1 Trần Đại Nghĩa, HBT, HN"
    });
    
    model.addRow(new Object[]{
        "000002AAB", "Đỗ Văn Hải", "024019573959", "4", "0912435829", "Số 1 Tạ Quang Bửu, HBT, HN"
    });

    model.addRow(new Object[]{
        "000003ABC", "Hoàng Hà My", "032859305567", "4", "0943768492", "Số 2 Tạ Quang Bửu, HBT, HN"
    });
    
//    model.addRow(new Object[]{
//        "000004CFG", "Nguyễn Quang Huy Hoàng", "028493241130", "3", "0856295433", "Số 3 Đại Cồ Việt, HBT, HN"
//    });
    
    model.addRow(new Object[]{
        "000005ZXC", "Phạm Trang Nhung", "035486539213", "5", "0914792237", "Số 6 Lê Thanh Nghị, HBT, HN"
    });
    
    model.addRow(new Object[]{
        "000006EGB", "Võ Quang Nhật", "030449204930", "4", "0986378432", "Số 1 Lê Thanh Nghị, HBT, HN"
    });
    }


   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableInfomation = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        kGradientPanel1.setkEndColor(new java.awt.Color(51, 204, 255));
        kGradientPanel1.setkStartColor(new java.awt.Color(204, 255, 102));

        tableInfomation.setModel(new javax.swing.table.DefaultTableModel(
        ));
        tableInfomation.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(tableInfomation);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Danh sách hộ khẩu trong khu vực");

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(400, 400, 400)
                        .addComponent(jLabel2))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1070, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private javax.swing.JTable tableInfomation;
    // End of variables declaration//GEN-END:variables
}
