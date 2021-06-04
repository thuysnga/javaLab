package GUI;

import BUS.BenhNhanBUS;
import DTO.BenhNhanDTO;
import javax.swing.JOptionPane;

/**
 *
 * @author THUYNGA
 */
public class themThongTinBenhNhan extends javax.swing.JFrame {

    public themThongTinBenhNhan() {
        initComponents();
        setSize(430,360);
        setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblmaBN = new javax.swing.JLabel();
        lbltenBN = new javax.swing.JLabel();
        lblNgaySinh = new javax.swing.JLabel();
        lblDiaChi = new javax.swing.JLabel();
        lblSDT = new javax.swing.JLabel();
        lblGioiTinh = new javax.swing.JLabel();
        txtMaBN = new javax.swing.JTextField();
        txtTenBN = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        dtcNgaySinh = new com.toedter.calendar.JDateChooser();
        cbbGioitinh = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Thông tin bệnh nhân");

        lblmaBN.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblmaBN.setForeground(new java.awt.Color(0, 102, 204));
        lblmaBN.setText("Mã bệnh nhân");

        lbltenBN.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbltenBN.setForeground(new java.awt.Color(0, 102, 204));
        lbltenBN.setText("Tên bệnh nhân");

        lblNgaySinh.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNgaySinh.setForeground(new java.awt.Color(0, 102, 204));
        lblNgaySinh.setText("Ngày sinh");

        lblDiaChi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDiaChi.setForeground(new java.awt.Color(0, 102, 204));
        lblDiaChi.setText("Địa chỉ");

        lblSDT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSDT.setForeground(new java.awt.Color(0, 102, 204));
        lblSDT.setText("Số điện thọai");

        lblGioiTinh.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblGioiTinh.setForeground(new java.awt.Color(0, 102, 204));
        lblGioiTinh.setText("Giới tính");

        txtMaBN.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        txtTenBN.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        txtDiaChi.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        txtSDT.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        dtcNgaySinh.setDateFormatString("yyyy/m/d");
        dtcNgaySinh.setMinSelectableDate(new java.util.Date(-62135791133000L));

        cbbGioitinh.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        cbbGioitinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("THÊM");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblmaBN, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbltenBN, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtSDT)
                                .addComponent(txtDiaChi)
                                .addComponent(txtTenBN)
                                .addComponent(txtMaBN)
                                .addComponent(dtcNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cbbGioitinh, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(121, 121, 121)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblmaBN)
                    .addComponent(txtMaBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbltenBN)
                    .addComponent(txtTenBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNgaySinh)
                    .addComponent(dtcNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDiaChi)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSDT)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGioiTinh)
                    .addComponent(cbbGioitinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jButton1)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        BenhNhanDTO benhNhanDTO = new BenhNhanDTO();
        
        benhNhanDTO.setMabn(txtMaBN.getText());
        benhNhanDTO.setTenbn(txtTenBN.getText());
        benhNhanDTO.setNgaysinh(dtcNgaySinh.getDate());
        benhNhanDTO.setDiachi(txtDiaChi.getText());
        boolean gt = false;
        if (cbbGioitinh.getSelectedItem().toString() == "Nam") gt = true;
        benhNhanDTO.setGioitinh(gt);
        BenhNhanBUS benhnhanBUS = new BenhNhanBUS();
        try {
            int result = benhnhanBUS.themBN(benhNhanDTO);
            if (result != 0)
                JOptionPane.showMessageDialog(null, "Thêm bệnh nhân thành công!","Thông bao", JOptionPane.INFORMATION_MESSAGE);
            else 
                JOptionPane.showMessageDialog(null, "Thêm bệnh nhân không thành công!","Thông bao", JOptionPane.INFORMATION_MESSAGE);                
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbbGioitinh;
    private com.toedter.calendar.JDateChooser dtcNgaySinh;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDiaChi;
    private javax.swing.JLabel lblGioiTinh;
    private javax.swing.JLabel lblNgaySinh;
    private javax.swing.JLabel lblSDT;
    private javax.swing.JLabel lblmaBN;
    private javax.swing.JLabel lbltenBN;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtMaBN;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTenBN;
    // End of variables declaration//GEN-END:variables
}
