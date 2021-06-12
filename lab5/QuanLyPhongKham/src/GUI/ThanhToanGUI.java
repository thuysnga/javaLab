package GUI;

import BUS.BenhNhanBUS;
import BUS.ThuPhiBUS;
import DTO.DichVuDTO;
import DTO.KhamBenhDTO;
import DTO.ThuPhiDTO;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author THUYNGA
 */
public class ThanhToanGUI extends javax.swing.JFrame {
    ArrayList<DichVuDTO> arrDV = null;
    ArrayList<ThuPhiDTO> arrTP = null;
    String mabn = "";
    public ThanhToanGUI() {
        initComponents();
        setTitle("Thanh Toán");
        setSize(600,430);
        txtMaBN.setText("");
        txtTenBN.setEditable(false);
        txtYeuCauKham.setEditable(false);
        txtKetLuan.setEditable(false);
        txtTongTien.setEditable(false);
        tblDichVu.setEnabled(false);
        btnThanhToan.setEnabled(false);
        loadTableDichVu();
        setVisible(true);
    }
    DefaultTableModel tblModelDV;
    public void loadTableDichVu(){
        tblModelDV = new DefaultTableModel();
        String[] tit = {"Mã dịch vụ","Tên dịch vụ","Số lượng","Thành tiền"};
        tblModelDV.setColumnIdentifiers(tit);
        tblDichVu.setModel(tblModelDV);
        setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTit = new javax.swing.JLabel();
        lblMaBN = new javax.swing.JLabel();
        lblTenBN = new javax.swing.JLabel();
        lblNgaySinh = new javax.swing.JLabel();
        lblYeuCauKham = new javax.swing.JLabel();
        lblKetLuan = new javax.swing.JLabel();
        lblTongTien = new javax.swing.JLabel();
        lblDSDV = new javax.swing.JLabel();
        txtMaBN = new javax.swing.JTextField();
        txtTenBN = new javax.swing.JTextField();
        txtYeuCauKham = new javax.swing.JTextField();
        txtKetLuan = new javax.swing.JTextField();
        txtTongTien = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblDichVu = new javax.swing.JTable();
        ckbThanhToan = new javax.swing.JCheckBox();
        btnThanhToan = new javax.swing.JButton();
        datNgayKham = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTit.setForeground(new java.awt.Color(0, 51, 204));
        lblTit.setText("THÔNG TIN THANH TOÁN");

        lblMaBN.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblMaBN.setText("Mã bệnh nhân");

        lblTenBN.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTenBN.setText("Tên bệnh nhân");

        lblNgaySinh.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNgaySinh.setText("Ngày khám");

        lblYeuCauKham.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblYeuCauKham.setText("Yêu cầu khám");

        lblKetLuan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblKetLuan.setText("Kết luận");

        lblTongTien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTongTien.setText("Tổng tiền");

        lblDSDV.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDSDV.setText("Danh sách dịch vụ đã khám");

        txtMaBN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMaBNKeyReleased(evt);
            }
        });

        tblDichVu.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        tblDichVu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(tblDichVu);

        ckbThanhToan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ckbThanhToan.setText("Đã thanh toán");

        btnThanhToan.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnThanhToan.setText("Thanh toán");

        datNgayKham.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                datNgayKhamPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblDSDV, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblMaBN)
                            .addComponent(lblTenBN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblKetLuan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMaBN)
                            .addComponent(txtTenBN)
                            .addComponent(txtKetLuan))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblNgaySinh, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblYeuCauKham, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtYeuCauKham)
                            .addComponent(txtTongTien)
                            .addComponent(datNgayKham, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                        .addGap(19, 19, 19))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(ckbThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(btnThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblTit)
                .addGap(207, 207, 207))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lblTit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblMaBN)
                        .addComponent(lblNgaySinh)
                        .addComponent(txtMaBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(datNgayKham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTenBN)
                    .addComponent(lblYeuCauKham)
                    .addComponent(txtTenBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtYeuCauKham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKetLuan)
                    .addComponent(lblTongTien)
                    .addComponent(txtKetLuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblDSDV)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(ckbThanhToan)))
                .addGap(18, 18, 18)
                .addComponent(btnThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
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

    private void txtMaBNKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMaBNKeyReleased
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            if (txtMaBN.getText().equals(""))
                JOptionPane.showMessageDialog(null,"Vui lòng nhập mã bệnh nhân.","Thông báo",JOptionPane.INFORMATION_MESSAGE);
            else {
                BenhNhanBUS benhnhanBUS = new BenhNhanBUS();
                if (benhnhanBUS.isExist(txtMaBN.getText()) == false)
                    JOptionPane.showMessageDialog(null,"Không tìm thấy bệnh nhân","Thông báo",JOptionPane.INFORMATION_MESSAGE);
                else {
                    txtTenBN.setText(benhnhanBUS.getTenBN(txtMaBN.getText()));
                    mabn = txtMaBN.getText();
                }
            }
        }

    }//GEN-LAST:event_txtMaBNKeyReleased
    public void loadData() {
        txtYeuCauKham.setText("");
        txtKetLuan.setText("");
        txtTongTien.setText("");
        ckbThanhToan.setEnabled(true);
        ckbThanhToan.setSelected(false);
        btnThanhToan.setEnabled(false);
        
        ThuPhiBUS thuphiBUS = new ThuPhiBUS();
        KhamBenhDTO khambenhDTO = new KhamBenhDTO();
        String mabn = txtMaBN.getText();
        java.sql.Date ngaykham = new java.sql.Date(datNgayKham.getDate().getTime());
        khambenhDTO = thuphiBUS.getThongTinKhamBenh(mabn, ngaykham);
        if (khambenhDTO == null) {
            JOptionPane.showMessageDialog(null,"Lỗi", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        txtYeuCauKham.setText(khambenhDTO.getYeuCauKham());
        txtKetLuan.setText(khambenhDTO.getKetLuan());
        if (khambenhDTO.isTHANHTOAN() == true) {
            ckbThanhToan.setEnabled(false);
            btnThanhToan.setEnabled(false);
        }
        else
            btnThanhToan.setEnabled(true);

        arrDV = new ArrayList<DichVuDTO>();
        arrTP = new ArrayList<ThuPhiDTO>();
        long sum = 0;
        thuphiBUS.getThongTinThuPhi(arrDV, arrTP, khambenhDTO.getMaKB(),sum);
        for (int i = 0; i < arrDV.size(); i++) {
            DichVuDTO dichvuDTO = arrDV.get(i);
            ThuPhiDTO thuphiDTO = arrTP.get(i);

            String maDV = dichvuDTO.getMaDV();
            String tenDV = dichvuDTO.getTenDV();
            int sl = thuphiDTO.getSoLuong();
            long thanhtien = thuphiDTO.getThanhTien();
            Object row[] = {maDV,tenDV,sl,thanhtien};
            tblModelDV.addRow(row);
        }
        txtTongTien.setText(String.valueOf(sum));
    }

    private void datNgayKhamPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_datNgayKhamPropertyChange
        if (mabn.equals("") == false)
            loadData();
    }//GEN-LAST:event_datNgayKhamPropertyChange

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThanhToan;
    private javax.swing.JCheckBox ckbThanhToan;
    private com.toedter.calendar.JDateChooser datNgayKham;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblDSDV;
    private javax.swing.JLabel lblKetLuan;
    private javax.swing.JLabel lblMaBN;
    private javax.swing.JLabel lblNgaySinh;
    private javax.swing.JLabel lblTenBN;
    private javax.swing.JLabel lblTit;
    private javax.swing.JLabel lblTongTien;
    private javax.swing.JLabel lblYeuCauKham;
    private javax.swing.JTable tblDichVu;
    private javax.swing.JTextField txtKetLuan;
    private javax.swing.JTextField txtMaBN;
    private javax.swing.JTextField txtTenBN;
    private javax.swing.JTextField txtTongTien;
    private javax.swing.JTextField txtYeuCauKham;
    // End of variables declaration//GEN-END:variables
}
