package project.company.management.view;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.html.HTML;
import project.company.management.model.DanhMucBean;
import project.company.management.controller.ChuyenManHinhController;
import project.company.management.model.NhanVien;

public class MainFrame extends javax.swing.JFrame {

    
    private Graphics g;
    public static ArrayList<NhanVien> danhSachNhanViens;

    public MainFrame() throws SQLException{
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Quan Ly Kho Hang");

        setLocationRelativeTo(null);

        panelMenu.paintComponents(g);
        
        taoDanhSachNhanVien();
        

        ChuyenManHinhController controller = new ChuyenManHinhController(panelView);
        controller.setView(panelHome, labelHome);
        controller.setView(panelQuanLyHeThong, tvQLHeThong);
        controller.setView(panelNhapKho, tvNhapKho);
        controller.setView(panelQLNhanVien, tvQLNhanVien);
        controller.setView(panelQLHangHoa, tvQLHangHoa);
        controller.setView(panelQLNhaCungCap, tvQLNhacungCap);
        controller.setView(panelXuatKho, tvXuatKho);
        
        
        List<DanhMucBean> listItem = new ArrayList<>();
        listItem.add(new DanhMucBean("Home", panelHome, labelHome));
        listItem.add(new DanhMucBean("QuanLyHeThong", panelQuanLyHeThong, tvQLHeThong));
        listItem.add(new DanhMucBean("QuanLyNhanVien", panelQLNhanVien, tvQLNhanVien));
        listItem.add(new DanhMucBean("QuanLyHangHoa", panelQLHangHoa, tvQLHangHoa));
        listItem.add(new DanhMucBean("QuanLyNhaCungCap", panelQLNhaCungCap, tvQLNhacungCap));
        listItem.add(new DanhMucBean("XuatKho", panelXuatKho, tvXuatKho));
        listItem.add(new DanhMucBean("NhapKho", panelNhapKho, tvNhapKho));

        controller.setEvent(listItem);
        
        this.pack();
        
    }

    private void taoDanhSachNhanVien() {
        danhSachNhanViens = new ArrayList<>();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date date = null;
        try {
            date = (Date) simpleDateFormat.parse("05-08-2002");
        } catch (ParseException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        danhSachNhanViens.add(new NhanVien("duongpt", "123456" ,"Phạm Thái Dương", date, "Thường Tín, Hà Nội", "123455566"));
        danhSachNhanViens.add(new NhanVien("nguyenhv", "789012", "Hoàng Văn Nguyên", date, "Cầu Giấy, Hà Nội", "789012345"));
        danhSachNhanViens.add(new NhanVien("tranth", "345678", "Nguyễn Thanh Trân", date, "Hoàn Kiếm, Hà Nội", "345678901"));
        danhSachNhanViens.add(new NhanVien("lemt", "901234", "Trần Mạnh Lễ", date, "Long Biên, Hà Nội", "901234567"));
        danhSachNhanViens.add(new NhanVien("phamlh", "567890", "Lê Hồng Phát", date, "Đống Đa, Hà Nội", "567890123"));
        danhSachNhanViens.add(new NhanVien("vuvt", "234567", "Trần Văn Vũ", date, "Ba Đình, Hà Nội", "234567890"));
        danhSachNhanViens.add(new NhanVien("nguyenhx", "890123", "Hà Xuân Nguyên", date, "Tây Hồ, Hà Nội", "890123456"));
        danhSachNhanViens.add(new NhanVien("dangt", "456789", "Trần Thị Đặng", date, "Hai Bà Trưng, Hà Nội", "456789012"));
        danhSachNhanViens.add(new NhanVien("buihn", "012345", "Hoàng Nam Bửu", date, "Hà Đông, Hà Nội", "012345678"));
        danhSachNhanViens.add(new NhanVien("lytd", "678901", "Đặng Thị Ly", date, "Gia Lâm, Hà Nội", "678901234"));

        

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        panelMenu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        panelHome = new javax.swing.JPanel();
        labelHome = new javax.swing.JLabel();
        panelQuanLyHeThong = new javax.swing.JPanel();
        tvQLHeThong = new javax.swing.JLabel();
        panelNhapKho = new javax.swing.JPanel();
        tvNhapKho = new javax.swing.JLabel();
        panelQLNhanVien = new javax.swing.JPanel();
        tvQLNhanVien = new javax.swing.JLabel();
        panelQLHangHoa = new javax.swing.JPanel();
        tvQLHangHoa = new javax.swing.JLabel();
        panelQLNhaCungCap = new javax.swing.JPanel();
        tvQLNhacungCap = new javax.swing.JLabel();
        panelXuatKho = new javax.swing.JPanel();
        tvXuatKho = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        panelView = new javax.swing.JPanel();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(0, 255, 255));
        setResizable(false);

        panelMenu.setBackground(new java.awt.Color(0, 51, 102));
        panelMenu.paintComponents(g);

        jLabel1.setFont(new java.awt.Font("Arial", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(238, 238, 238));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MENU");

        jPanel3.setBackground(new java.awt.Color(0, 66, 128));

        panelHome.setBackground(new java.awt.Color(0, 66, 128));
        panelHome.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, null));
        panelHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        labelHome.setBackground(new java.awt.Color(0, 66, 128));
        labelHome.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        labelHome.setForeground(new java.awt.Color(255, 255, 255));
        labelHome.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/company/management/icon/homeIcon.png"))); // NOI18N
        labelHome.setText("Trang chủ");

        javax.swing.GroupLayout panelHomeLayout = new javax.swing.GroupLayout(panelHome);
        panelHome.setLayout(panelHomeLayout);
        panelHomeLayout.setHorizontalGroup(
            panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelHomeLayout.setVerticalGroup(
            panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelHome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        panelQuanLyHeThong.setBackground(new java.awt.Color(0, 66, 128));
        panelQuanLyHeThong.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, null));

        tvQLHeThong.setBackground(new java.awt.Color(0, 66, 128));
        tvQLHeThong.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        tvQLHeThong.setForeground(new java.awt.Color(255, 255, 255));
        tvQLHeThong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/company/management/view/dollar (2).png"))); // NOI18N
        tvQLHeThong.setText("Quản lý hệ thống");

        javax.swing.GroupLayout panelQuanLyHeThongLayout = new javax.swing.GroupLayout(panelQuanLyHeThong);
        panelQuanLyHeThong.setLayout(panelQuanLyHeThongLayout);
        panelQuanLyHeThongLayout.setHorizontalGroup(
            panelQuanLyHeThongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelQuanLyHeThongLayout.createSequentialGroup()
                .addComponent(tvQLHeThong, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelQuanLyHeThongLayout.setVerticalGroup(
            panelQuanLyHeThongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelQuanLyHeThongLayout.createSequentialGroup()
                .addComponent(tvQLHeThong, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );

        panelNhapKho.setBackground(new java.awt.Color(0, 66, 128));
        panelNhapKho.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, null));

        tvNhapKho.setBackground(new java.awt.Color(0, 66, 128));
        tvNhapKho.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        tvNhapKho.setForeground(new java.awt.Color(255, 255, 255));
        tvNhapKho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/company/management/icon/protection.png"))); // NOI18N
        tvNhapKho.setText("Nhập kho");

        javax.swing.GroupLayout panelNhapKhoLayout = new javax.swing.GroupLayout(panelNhapKho);
        panelNhapKho.setLayout(panelNhapKhoLayout);
        panelNhapKhoLayout.setHorizontalGroup(
            panelNhapKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tvNhapKho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelNhapKhoLayout.setVerticalGroup(
            panelNhapKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tvNhapKho, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        panelQLNhanVien.setBackground(new java.awt.Color(0, 66, 128));
        panelQLNhanVien.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, null));

        tvQLNhanVien.setBackground(new java.awt.Color(0, 66, 128));
        tvQLNhanVien.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        tvQLNhanVien.setForeground(new java.awt.Color(255, 255, 255));
        tvQLNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/company/management/icon/printer.png"))); // NOI18N
        tvQLNhanVien.setText("Quản lý nhân viên");

        javax.swing.GroupLayout panelQLNhanVienLayout = new javax.swing.GroupLayout(panelQLNhanVien);
        panelQLNhanVien.setLayout(panelQLNhanVienLayout);
        panelQLNhanVienLayout.setHorizontalGroup(
            panelQLNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelQLNhanVienLayout.createSequentialGroup()
                .addComponent(tvQLNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelQLNhanVienLayout.setVerticalGroup(
            panelQLNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tvQLNhanVien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        panelQLHangHoa.setBackground(new java.awt.Color(0, 66, 128));
        panelQLHangHoa.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, null));

        tvQLHangHoa.setBackground(new java.awt.Color(0, 66, 128));
        tvQLHangHoa.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        tvQLHangHoa.setForeground(new java.awt.Color(255, 255, 255));
        tvQLHangHoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/company/management/icon/printer.png"))); // NOI18N
        tvQLHangHoa.setText("Quản lý hàng hoá");

        javax.swing.GroupLayout panelQLHangHoaLayout = new javax.swing.GroupLayout(panelQLHangHoa);
        panelQLHangHoa.setLayout(panelQLHangHoaLayout);
        panelQLHangHoaLayout.setHorizontalGroup(
            panelQLHangHoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelQLHangHoaLayout.createSequentialGroup()
                .addComponent(tvQLHangHoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelQLHangHoaLayout.setVerticalGroup(
            panelQLHangHoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tvQLHangHoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelQLNhaCungCap.setBackground(new java.awt.Color(0, 66, 128));
        panelQLNhaCungCap.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, null));

        tvQLNhacungCap.setBackground(new java.awt.Color(0, 66, 128));
        tvQLNhacungCap.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        tvQLNhacungCap.setForeground(new java.awt.Color(255, 255, 255));
        tvQLNhacungCap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/company/management/icon/printer.png"))); // NOI18N
        tvQLNhacungCap.setText("Quản lý nhà cung cấp");

        javax.swing.GroupLayout panelQLNhaCungCapLayout = new javax.swing.GroupLayout(panelQLNhaCungCap);
        panelQLNhaCungCap.setLayout(panelQLNhaCungCapLayout);
        panelQLNhaCungCapLayout.setHorizontalGroup(
            panelQLNhaCungCapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelQLNhaCungCapLayout.createSequentialGroup()
                .addComponent(tvQLNhacungCap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelQLNhaCungCapLayout.setVerticalGroup(
            panelQLNhaCungCapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tvQLNhacungCap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelXuatKho.setBackground(new java.awt.Color(0, 66, 128));
        panelXuatKho.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, null));

        tvXuatKho.setBackground(new java.awt.Color(0, 66, 128));
        tvXuatKho.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        tvXuatKho.setForeground(new java.awt.Color(255, 255, 255));
        tvXuatKho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/company/management/icon/protection.png"))); // NOI18N
        tvXuatKho.setText("Xuất kho");

        javax.swing.GroupLayout panelXuatKhoLayout = new javax.swing.GroupLayout(panelXuatKho);
        panelXuatKho.setLayout(panelXuatKhoLayout);
        panelXuatKhoLayout.setHorizontalGroup(
            panelXuatKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelXuatKhoLayout.createSequentialGroup()
                .addComponent(tvXuatKho)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelXuatKhoLayout.setVerticalGroup(
            panelXuatKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelXuatKhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tvXuatKho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelQLHangHoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelQLNhaCungCap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelNhapKho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelXuatKho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelQuanLyHeThong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(panelQLNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(panelHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelQuanLyHeThong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelQLHangHoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelQLNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelQLNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelNhapKho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelXuatKho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(233, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBackground(new java.awt.Color(235, 235, 235));

        panelView.setBackground(new java.awt.Color(235, 235, 235));
        panelView.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, null));
        panelView.setDoubleBuffered(false);

        javax.swing.GroupLayout panelViewLayout = new javax.swing.GroupLayout(panelView);
        panelView.setLayout(panelViewLayout);
        panelViewLayout.setHorizontalGroup(
            panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1103, Short.MAX_VALUE)
        );
        panelViewLayout.setVerticalGroup(
            panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 893, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelView, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new MainFrame().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelHome;
    private javax.swing.JPanel panelHome;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelNhapKho;
    private javax.swing.JPanel panelQLHangHoa;
    private javax.swing.JPanel panelQLNhaCungCap;
    private javax.swing.JPanel panelQLNhanVien;
    private javax.swing.JPanel panelQuanLyHeThong;
    private javax.swing.JPanel panelView;
    private javax.swing.JPanel panelXuatKho;
    private javax.swing.JLabel tvNhapKho;
    private javax.swing.JLabel tvQLHangHoa;
    private javax.swing.JLabel tvQLHeThong;
    private javax.swing.JLabel tvQLNhacungCap;
    private javax.swing.JLabel tvQLNhanVien;
    private javax.swing.JLabel tvXuatKho;
    // End of variables declaration//GEN-END:variables

  
}
