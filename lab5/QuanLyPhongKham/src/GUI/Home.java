package GUI;

/**
 *
 * @author THUYNGA
 */
public class Home extends javax.swing.JFrame {

    public Home() {
        initComponents();
        setTitle("Menu");
        setSize(400,360);
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnThemBN = new javax.swing.JButton();
        btnDatLich = new javax.swing.JButton();
        btnChiTietKham = new javax.swing.JButton();
        btnThanhToanDV = new javax.swing.JButton();
        lblLuaChon = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnThemBN.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnThemBN.setText("Thêm thông tin bệnh nhân");
        btnThemBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemBNActionPerformed(evt);
            }
        });

        btnDatLich.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnDatLich.setText("Đặt lịch khám ");
        btnDatLich.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatLichActionPerformed(evt);
            }
        });

        btnChiTietKham.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnChiTietKham.setText("Xem chi tiết khám bệnh");
        btnChiTietKham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChiTietKhamActionPerformed(evt);
            }
        });

        btnThanhToanDV.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnThanhToanDV.setText("Thanh toán");
        btnThanhToanDV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThanhToanDVActionPerformed(evt);
            }
        });

        lblLuaChon.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblLuaChon.setText("Lựa chọn thao tác");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnThanhToanDV, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnChiTietKham, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnThemBN, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDatLich, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(lblLuaChon, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblLuaChon, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnThemBN, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDatLich, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnChiTietKham, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnThanhToanDV, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemBNActionPerformed
        new ThemThongTinBenhNhanGUI();
        setVisible(false);
    }//GEN-LAST:event_btnThemBNActionPerformed

    private void btnDatLichActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatLichActionPerformed
        new DatLichKhamGUI();
        setVisible(false);
    }//GEN-LAST:event_btnDatLichActionPerformed

    private void btnChiTietKhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChiTietKhamActionPerformed
        new ChiTietKhamGUI();
        setVisible(false);
    }//GEN-LAST:event_btnChiTietKhamActionPerformed

    private void btnThanhToanDVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThanhToanDVActionPerformed
        new ThanhToanGUI();
        setVisible(false);
    }//GEN-LAST:event_btnThanhToanDVActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChiTietKham;
    private javax.swing.JButton btnDatLich;
    private javax.swing.JButton btnThanhToan;
    private javax.swing.JButton btnThanhToan1;
    private javax.swing.JButton btnThanhToanDV;
    private javax.swing.JButton btnThemBN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblLuaChon;
    // End of variables declaration//GEN-END:variables
}
