package GUI;

import BUS.BacSiBUS;
import BUS.BenhNhanBUS;
import BUS.KhamBenhBUS;
import DTO.KhamBenhDTO;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author THUYNGA
 */
public class DatLichKhamGUI extends javax.swing.JFrame {
    public DatLichKhamGUI() {
        initComponents();
        setSize(430,330);
        setTitle("Đặt lịch khám");
        txtTenBN.setEnabled(false);
        loadCbbTenBS();
        setVisible(true);
    }
    public void loadCbbTenBS() {
        BacSiBUS bacsiBUS = new BacSiBUS();
        ArrayList<String> dsBS = bacsiBUS.getTenBS();
        cbbBacSiKham.setModel(new DefaultComboBoxModel <> (dsBS.toArray(new String[0])));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblMaBN = new javax.swing.JLabel();
        lblTenBN = new javax.swing.JLabel();
        lblNgayKham = new javax.swing.JLabel();
        lblYeuCauKham = new javax.swing.JLabel();
        lblBacSiKham = new javax.swing.JLabel();
        txtMaBN = new javax.swing.JTextField();
        txtTenBN = new javax.swing.JTextField();
        dtcNgayKham = new com.toedter.calendar.JDateChooser();
        txtYeuCauKham = new javax.swing.JTextField();
        cbbBacSiKham = new javax.swing.JComboBox<>();
        btnDatLichKham = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblMaBN.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMaBN.setForeground(new java.awt.Color(0, 102, 204));
        lblMaBN.setText("Mã bệnh nhân");

        lblTenBN.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTenBN.setForeground(new java.awt.Color(0, 102, 204));
        lblTenBN.setText("Tên bệnh nhân");

        lblNgayKham.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNgayKham.setForeground(new java.awt.Color(0, 102, 204));
        lblNgayKham.setText("Ngày khám");

        lblYeuCauKham.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblYeuCauKham.setForeground(new java.awt.Color(0, 102, 204));
        lblYeuCauKham.setText("Yêu cầu khám");

        lblBacSiKham.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblBacSiKham.setForeground(new java.awt.Color(0, 102, 204));
        lblBacSiKham.setText("Bác sĩ khám");

        txtMaBN.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtMaBN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMaBNKeyPressed(evt);
            }
        });

        txtTenBN.setEditable(false);
        txtTenBN.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        dtcNgayKham.setMinSelectableDate(new java.util.Date(-62135791133000L));

        txtYeuCauKham.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        cbbBacSiKham.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        cbbBacSiKham.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chọn bác sĩ" }));

        btnDatLichKham.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDatLichKham.setText("Đặt lịch khám");
        btnDatLichKham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatLichKhamActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblYeuCauKham, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBacSiKham, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMaBN, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTenBN, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNgayKham, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dtcNgayKham, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTenBN, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbbBacSiKham, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtYeuCauKham, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(52, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(txtMaBN, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(btnDatLichKham, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaBN)
                    .addComponent(txtMaBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTenBN)
                    .addComponent(txtTenBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNgayKham)
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblYeuCauKham)
                            .addComponent(txtYeuCauKham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(dtcNgayKham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBacSiKham)
                    .addComponent(cbbBacSiKham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(btnDatLichKham)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtMaBNKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMaBNKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            if (txtMaBN.getText().equals("")) 
                JOptionPane.showMessageDialog(null,"Vui lòng nhập mã bệnh nhân.","Thông báo",JOptionPane.INFORMATION_MESSAGE);
            else {
                BenhNhanBUS benhnhanBUS = new BenhNhanBUS();
                if (benhnhanBUS.isExist(txtMaBN.getText()) == false)
                    JOptionPane.showMessageDialog(null,"Không tìm thấy bệnh nhân","Thông báo",JOptionPane.INFORMATION_MESSAGE);
                else {
                    txtTenBN.setText(benhnhanBUS.getTenBN(txtMaBN.getText()));
                }
            }
        }
    }//GEN-LAST:event_txtMaBNKeyPressed

    private void btnDatLichKhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatLichKhamActionPerformed
        if (txtMaBN.getText().equals("") || txtYeuCauKham.getText().equals("") || dtcNgayKham.getDate() == null)
            JOptionPane.showMessageDialog(null,"Vui lòng nhập đủ thông tin!","Thông báo",JOptionPane.INFORMATION_MESSAGE);
        else {
            KhamBenhDTO khambenhDTO = new KhamBenhDTO();
            KhamBenhBUS khambenhBUS = new KhamBenhBUS();
            khambenhDTO.setMaKB(khambenhBUS.layMaKB());
            khambenhDTO.setMaBN(txtMaBN.getText());
        
            BacSiBUS bacsiBUS = new BacSiBUS();
            ArrayList<String> dsBS = bacsiBUS.getMaBS();
            khambenhDTO.setMaBS(dsBS.get(cbbBacSiKham.getSelectedIndex()));
            
            khambenhDTO.setNgayKham(dtcNgayKham.getDate());
            khambenhDTO.setYeuCauKham(txtYeuCauKham.getText());
            khambenhDTO.setKetLuan("");
            try {
                int res = khambenhBUS.themKhamBenh(khambenhDTO);
                if (res != 0)
                    JOptionPane.showMessageDialog(null, "Đặt lịch thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                else 
                    JOptionPane.showInternalMessageDialog(null, "Xãy ra lỗi khi đặt lịch", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                e.printStackTrace();
            }            
        }
    }//GEN-LAST:event_btnDatLichKhamActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDatLichKham;
    private javax.swing.JComboBox<String> cbbBacSiKham;
    private com.toedter.calendar.JDateChooser dtcNgayKham;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBacSiKham;
    private javax.swing.JLabel lblMaBN;
    private javax.swing.JLabel lblNgayKham;
    private javax.swing.JLabel lblTenBN;
    private javax.swing.JLabel lblYeuCauKham;
    private javax.swing.JTextField txtMaBN;
    private javax.swing.JTextField txtTenBN;
    private javax.swing.JTextField txtYeuCauKham;
    // End of variables declaration//GEN-END:variables
}
