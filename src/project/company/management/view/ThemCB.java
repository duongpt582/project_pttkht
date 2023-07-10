
package project.company.management.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.ButtonGroup;
import javax.swing.DefaultButtonModel;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;
import project.company.management.database.DatabaseCanBo;
import project.company.management.model.Customer;

public class ThemCB extends javax.swing.JPanel {

    private ArrayList<Customer> list;
    DefaultTableModel model;
    ButtonGroup btgGroup;

    DatabaseCanBo db = new DatabaseCanBo();
    
    private String chucVu;
    String ten;
    String ma;
    String diaChi;
    String ngaySinh;
    int soNgayLamViec;
    double tienThuong;
    double luong;
    double thuong ;
    String gioiTinh = "";
    java.sql.Date sDate;
    Customer customer = new Customer();

    public ThemCB() {
        initComponents();
        jlbChange.setVisible(false);
        txtChange.setVisible(false);
        list = new ArrayList<>();
        model = (DefaultTableModel) jTable1.getModel();
        btgGroup = new ButtonGroup();
        btgGroup.add(jRBNu);
        btgGroup.add(jRBNam);
        
        UtilDateModel model1 = new UtilDateModel();
        model1.setDate(2002, 8, 24);
        model1.setSelected(true);
        JDatePanelImpl datePanel = new JDatePanelImpl(model1, System.getProperties());
        JDatePickerImpl datePicker = new JDatePickerImpl(datePanel, new DateLabelFormatter());
        add_date_panel.add(datePicker);
        
        // nếu để mặc định thì biến sDate sẽ nhận giá trị mặc định trên màn hình.
        Date selectedDate = (Date) datePicker.getModel().getValue();
        sDate = convertUtilToSql(selectedDate);
          
        datePicker.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date selectedDate = (Date) datePicker.getModel().getValue();
                sDate = convertUtilToSql(selectedDate);
              
                System.out.println(sDate);
            }
        });
        
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jlbName = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jlbID1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jlbDob = new javax.swing.JLabel();
        jlbDay = new javax.swing.JLabel();
        txtDay = new javax.swing.JTextField();
        jlbGender = new javax.swing.JLabel();
        jRBNam = new javax.swing.JRadioButton();
        jRBNu = new javax.swing.JRadioButton();
        jlbChucVu = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jlbAddress = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jlbChange = new javax.swing.JLabel();
        txtChange = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        addButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        add_date_panel = new javax.swing.JPanel();

        kGradientPanel1.setkEndColor(new java.awt.Color(102, 255, 255));
        kGradientPanel1.setkStartColor(new java.awt.Color(204, 51, 255));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/company/management/icon/management-64.png"))); // NOI18N
        jLabel1.setText("Thông Tin Cán Bộ");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 51, 51)));
        jLabel1.setIconTextGap(5);

        jlbName.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jlbName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbName.setText("Họ tên:");

        jlbID1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jlbID1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbID1.setText("ID:");

        jlbDob.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jlbDob.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbDob.setText("Ngày sinh:");

        jlbDay.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jlbDay.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbDay.setText("Số ngày làm việc:");

        jlbGender.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jlbGender.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbGender.setText("Giới tính:");

        jRBNam.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jRBNam.setText("Nam");
        jRBNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBNamActionPerformed(evt);
            }
        });

        jRBNu.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jRBNu.setText("Nữ");
        jRBNu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBNuActionPerformed(evt);
            }
        });

        jlbChucVu.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jlbChucVu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbChucVu.setText("Chức vụ:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mời bạn chọn chức vụ !", "Giám Đốc", "Trưởng Phòng", "Nhân Viên"}));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jlbAddress.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jlbAddress.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbAddress.setText("Địa chỉ:");

        jlbChange.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jlbChange.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbChange.setText("Thay đổi:");

        txtChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtChangeActionPerformed(evt);
            }
        });

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane1.setViewportBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTable1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "ID", "Họ tên", "Ngày sinh", "Giới tính", "Địa chỉ", "Chức vụ", "Ngày làm việc", "Lương"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        addButton.setFont(new java.awt.Font("Lucida Grande", 1, 15)); // NOI18N
        addButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/company/management/icon/add.png"))); // NOI18N
        addButton.setText("Thêm");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        resetButton.setFont(new java.awt.Font("Lucida Grande", 1, 15)); // NOI18N
        resetButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/company/management/icon/restart.png"))); // NOI18N
        resetButton.setText("Làm mới");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        add_date_panel.setAutoscrolls(true);
        add_date_panel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add_date_panel.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbID1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbName, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbDob, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlbGender, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(jRBNam)
                        .addGap(36, 36, 36)
                        .addComponent(jRBNu)
                        .addGap(70, 70, 70))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(add_date_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addComponent(jlbDay, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDay, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                                .addComponent(jlbChange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(txtChange, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(txtAddress)
                    .addComponent(txtName))
                .addGap(64, 64, 64)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(179, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbID1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlbGender, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRBNam)
                    .addComponent(jRBNu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlbDob, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbDay, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDay, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(add_date_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlbChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbChange, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtChange, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlbAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    private void jRBNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBNamActionPerformed
        // TODO add your handling code here:
        gioiTinh = "Nam";
    }//GEN-LAST:event_jRBNamActionPerformed

    private void jRBNuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBNuActionPerformed
        // TODO add your handling code here:
        gioiTinh = "Nữ";
    
    }//GEN-LAST:event_jRBNuActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        int index = jComboBox1.getSelectedIndex();

        if (index == 0) {
            jlbChange.setText("Hãy chọn chức vụ");
            jlbChange.setVisible(true);
            txtChange.setVisible(false);
            txtChange.setEditable(false);
        }
        if (index == 1) {
            jlbChange.setVisible(false);
            txtChange.setVisible(false);
        }
        if (index == 2) {
            jlbChange.setText("Tiền phụ cấp quản lý:");
            jlbChange.setVisible(true);

            txtChange.setVisible(true);
            txtChange.setEditable(true);

        }
        if (index == 3) {
            jlbChange.setText("Số tiền thưởng:");
            jlbChange.setVisible(true);

            txtChange.setVisible(true);
            txtChange.setEditable(true);

        }

    }//GEN-LAST:event_jComboBox1ActionPerformed

     
    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        int index = jComboBox1.getSelectedIndex();
        ten = String.valueOf(txtName.getText());
        ma = String.valueOf(txtID.getText());
        diaChi = String.valueOf(txtAddress.getText());
        ngaySinh = String.valueOf(sDate);
        
        if (txtDay.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Mời bạn nhập số ngày làm việc bằng số!!");
        } else if ((index == 2 || index == 3) && txtChange.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Mời bạn nhập thưởng làm việc bằng số!!");
        } else {
            if (index == 1) {       
                chucVu = (String) jComboBox1.getItemAt(index);
                soNgayLamViec = Integer.parseInt(txtDay.getText());          
                luong = soNgayLamViec * 1000000;
            }
            if (index == 2) {
                chucVu = (String) jComboBox1.getItemAt(index);
                soNgayLamViec = Integer.parseInt(txtDay.getText());
                thuong = Double.parseDouble(txtChange.getText());
                luong = soNgayLamViec * 500000 + thuong;
            }
            if (index == 3) {
                chucVu = (String) jComboBox1.getItemAt(index);
                soNgayLamViec = Integer.parseInt(txtDay.getText());
                thuong = Double.parseDouble(txtChange.getText());
                luong = soNgayLamViec * 200000 + thuong;
            }
        }

        if (ten.equals("") ||
                ma.equals("") ||
                diaChi.equals("") || gioiTinh.equals("")) {
            JOptionPane.showMessageDialog(null, "Mời bạn nhập đầy đủ các trường!!!");
        } else {
            customer.setChuc_vu(chucVu);
            customer.setTen(ten);
            customer.setID(ma);
            customer.setNgaySinh(ngaySinh);
            customer.setDiaChi(diaChi);
            customer.setSoNgayLamViec(soNgayLamViec);
            customer.setLuong(luong);
            customer.setGioiTinh(gioiTinh);

            list.add(customer); // them vao danh sach canBo
            showResult();

            db.insertData1(ma, ten, ngaySinh, gioiTinh, diaChi, chucVu, soNgayLamViec, luong);
        }
        
    }//GEN-LAST:event_addButtonActionPerformed

    int i=1;
    public void showResult() {
        Customer customer = list.get(list.size() - 1);
        model.addRow(new Object[]{
            i++, customer.getID(), customer.getTen(), customer.getNgaySinh(), customer.getGioiTinh(), customer.getDiaChi()
                , customer.getChuc_vu(),customer.getSoNgayLamViec() , customer.getLuong()
        });
    }
  
    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        // TODO add your handling code here:
        jComboBox1.setSelectedIndex(0);
        txtName.setText("");
        txtDay.setText("");
        
        txtID.setText("");
        txtAddress.setText("");
        txtChange.setVisible(false);
        jlbChange.setVisible(false);
    }//GEN-LAST:event_resetButtonActionPerformed

    private void txtChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtChangeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtChangeActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JPanel add_date_panel;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRBNam;
    private javax.swing.JRadioButton jRBNu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel jlbAddress;
    private javax.swing.JLabel jlbChange;
    private javax.swing.JLabel jlbChucVu;
    private javax.swing.JLabel jlbDay;
    private javax.swing.JLabel jlbDob;
    private javax.swing.JLabel jlbGender;
    private javax.swing.JLabel jlbID1;
    private javax.swing.JLabel jlbName;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private javax.swing.JButton resetButton;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtChange;
    private javax.swing.JTextField txtDay;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables

    
    private static java.sql.Date convertUtilToSql(java.util.Date uDate) {
        java.sql.Date sDate = new java.sql.Date(uDate.getTime());
        return sDate;
    }
    
    public class DateLabelFormatter extends JFormattedTextField.AbstractFormatter {

        private String datePattern = "yyyy-MM-dd";
        private SimpleDateFormat dateFormatter = new SimpleDateFormat(datePattern);

        @Override
        public Object stringToValue(String text) throws ParseException {
            return dateFormatter.parseObject(text);
        }

        @Override
        public String valueToString(Object value) throws ParseException {
            if (value != null) {
                Calendar cal = (Calendar) value;
                return dateFormatter.format(cal.getTime());
            }

            return "";
        }

    }
}
