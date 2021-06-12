package GUI;

import BUS.BacSiBUS;
import BUS.BenhNhanBUS;
import BUS.DichVuBUS;
import DTO.DichVuDTO;
import DTO.KhamBenhDTO;
import BUS.KhamBenhBUS;
import BUS.ThuPhiBUS;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author THUYNGA
 */
public class ChiTietKhamGUI extends javax.swing.JFrame {
    ArrayList<String> dsTenBS = new ArrayList<String>();        
    ArrayList<String> dsMaBS = new ArrayList<String>();        
    ArrayList<String> dsTenBN = new ArrayList<String>();        
    ArrayList<String> dsMaBN = new ArrayList<String>();        
    String makb = null;
    public ChiTietKhamGUI() {
        initComponents();
        setSize(650,430);
        setTitle("Khám bệnh");
        txtYeuCauKham.setEditable(false);
        Date date = new Date();
        datNgayKham.setDate(date);
        loadCbbTenBS();
        loadtblDichVu();
        loadtblDVDuocChon();
        setVisible(true);
    }
    public void loadCbbTenBS() {
        makb = null;
        dsTenBS.removeAll(dsTenBS);
        dsMaBS.removeAll(dsMaBS);
        txtYeuCauKham.setText("");
        BacSiBUS bacsiBUS = new BacSiBUS();
        dsTenBS = bacsiBUS.getTenBS();
        dsMaBS = bacsiBUS.getMaBS();
        cbbBacSiKham.setModel(new DefaultComboBoxModel <> (dsTenBS.toArray(new String[0])));
    }
    public void loadCbbTenBN() {
        dsTenBN.removeAll(dsTenBN);
        dsMaBN.removeAll(dsMaBN);
        txtYeuCauKham.setText("");
        KhamBenhDTO kbDTO = new KhamBenhDTO();
        kbDTO.setMaBS(dsMaBS.get(cbbBacSiKham.getSelectedIndex()));
        kbDTO.setNgayKham(datNgayKham.getDate());
        BenhNhanBUS bnBUS = new BenhNhanBUS();
        bnBUS.getMaVaTen(kbDTO, dsMaBN, dsTenBN);
        cbbBenhNhan.setModel(new DefaultComboBoxModel<String> (dsTenBN.toArray(new String[0])));
    }
    DefaultTableModel tblModelDV;
    public void loadtblDichVu () {
        tblModelDV = new DefaultTableModel();
        String tit[] = {"Mã dịch vụ", "Tên dịch vụ", "Giá"};
        tblModelDV.setColumnIdentifiers(tit);

        ArrayList<DichVuDTO> arr = new ArrayList<DichVuDTO>();
        DichVuBUS dichvuBUS = new DichVuBUS();
        arr = dichvuBUS.getAllDichVu();

        DichVuDTO dichvuDTO = new DichVuDTO();
        for (int i = 0; i < arr.size(); i++) {
            dichvuDTO = arr.get(i);
            String maDV = dichvuDTO.getMaDV();
            String tenDV = dichvuDTO.getTenDV();
            long donGia = dichvuDTO.getDonGia();
            Object row[] = {maDV,tenDV,donGia};
            tblModelDV.addRow(row);
        }
        tblDichVu.setModel(tblModelDV);
        setVisible(true);
    }
    DefaultTableModel tblModelDVDuocChon;
    public void loadtblDVDuocChon() {
        tblModelDVDuocChon = new DefaultTableModel();
        String tit[] = {"Mã dịch vụ","Tên dịch vụ","Đơn giá","Số lượng"};
        tblModelDVDuocChon.setColumnIdentifiers(tit);
        tblDichVuDuocChon.setModel(tblModelDVDuocChon);
        setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        lblTenBS = new javax.swing.JLabel();
        lblNgayKham = new javax.swing.JLabel();
        lblTenBN = new javax.swing.JLabel();
        lblYeuCauKham = new javax.swing.JLabel();
        lblKetLuan = new javax.swing.JLabel();
        lblDSDichVu = new javax.swing.JLabel();
        lblDSDichVuDuocChon = new javax.swing.JLabel();
        cbbBacSiKham = new javax.swing.JComboBox<>();
        cbbBenhNhan = new javax.swing.JComboBox<>();
        datNgayKham = new com.toedter.calendar.JDateChooser();
        txtYeuCauKham = new javax.swing.JTextField();
        txtKetLuan = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblDichVu = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblDichVuDuocChon = new javax.swing.JTable();
        btnThem = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTenBS.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTenBS.setForeground(new java.awt.Color(0, 102, 204));
        lblTenBS.setText("Bác sĩ khám");

        lblNgayKham.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNgayKham.setForeground(new java.awt.Color(0, 102, 204));
        lblNgayKham.setText("Ngày khám");

        lblTenBN.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTenBN.setForeground(new java.awt.Color(0, 102, 204));
        lblTenBN.setText("Tên bệnh nhân");

        lblYeuCauKham.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblYeuCauKham.setForeground(new java.awt.Color(0, 102, 204));
        lblYeuCauKham.setText("Yêu cầu khám");

        lblKetLuan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblKetLuan.setForeground(new java.awt.Color(0, 102, 204));
        lblKetLuan.setText("Kết luận");

        lblDSDichVu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDSDichVu.setForeground(new java.awt.Color(0, 102, 204));
        lblDSDichVu.setText("Danh sách dịch vụ");

        lblDSDichVuDuocChon.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDSDichVuDuocChon.setForeground(new java.awt.Color(0, 102, 204));
        lblDSDichVuDuocChon.setText("Danh sách dịch vụ được bác sĩ chọn");

        cbbBacSiKham.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tên bác sĩ" }));
        cbbBacSiKham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbBacSiKhamActionPerformed(evt);
            }
        });

        cbbBenhNhan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tên bệnh nhân" }));
        cbbBenhNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbBenhNhanActionPerformed(evt);
            }
        });

        datNgayKham.setMinSelectableDate(new java.util.Date(-62135791133000L));
        datNgayKham.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                datNgayKhamPropertyChange(evt);
            }
        });

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
        tblDichVu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDichVuMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblDichVu);

        tblDichVuDuocChon.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tblDichVuDuocChon);

        btnThem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDSDichVu, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblDSDichVuDuocChon)
                                .addGap(9, 9, 9))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lblKetLuan, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtKetLuan))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblTenBS, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cbbBacSiKham, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblTenBN, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cbbBenhNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblYeuCauKham, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtYeuCauKham))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblNgayKham, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(datNgayKham, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTenBS)
                            .addComponent(cbbBacSiKham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTenBN)
                            .addComponent(cbbBenhNhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNgayKham)
                            .addComponent(datNgayKham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblYeuCauKham)
                            .addComponent(txtYeuCauKham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKetLuan)
                    .addComponent(txtKetLuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDSDichVu)
                    .addComponent(lblDSDichVuDuocChon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addComponent(btnThem)
                .addContainerGap(73, Short.MAX_VALUE))
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

    private void cbbBacSiKhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbBacSiKhamActionPerformed
        loadCbbTenBN();
    }//GEN-LAST:event_cbbBacSiKhamActionPerformed

    private void datNgayKhamPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_datNgayKhamPropertyChange
        if (dsTenBS.size() > 0){
            loadCbbTenBN();
            makb = null;
        }
    }//GEN-LAST:event_datNgayKhamPropertyChange

    private void tblDichVuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDichVuMouseClicked
        int index = tblDichVu.getSelectedRow();
        if (index >= 0 && index <= tblModelDV.getRowCount()) {
            String row [] = new String[4];
            row[0] = tblModelDV.getValueAt(index,0).toString();
            row[1] = tblModelDV.getValueAt(index,1).toString();
            row[2] = tblModelDV.getValueAt(index,2).toString();
            row[3] = "1";
            tblModelDVDuocChon.addRow(row);
            tblModelDV.removeRow(index);
        }
    }//GEN-LAST:event_tblDichVuMouseClicked

    private void cbbBenhNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbBenhNhanActionPerformed
        txtYeuCauKham.setText("");
        KhamBenhDTO khambenhDTO = new KhamBenhDTO();
        KhamBenhBUS khambenhBUS = new KhamBenhBUS();
        String mabs = dsMaBS.get(cbbBacSiKham.getSelectedIndex());
        String mabn = dsMaBN.get(cbbBenhNhan.getSelectedIndex());
        java.sql.Date ngkham = new java.sql.Date(datNgayKham.getDate().getTime());
        makb = khambenhBUS.getMaKB(mabs,mabn,ngkham);
        khambenhDTO = khambenhBUS.getThongTin(makb);
        txtYeuCauKham.setText(khambenhDTO.getYeuCauKham());
    }//GEN-LAST:event_cbbBenhNhanActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        if (makb == null || txtKetLuan.getText().equals(""))
           JOptionPane.showMessageDialog(null,"Vui lòng chọn bệnh nhân/ nhập kết luận.","Thông báo",JOptionPane.INFORMATION_MESSAGE);
        else {
            if (tblModelDVDuocChon.getRowCount() == 0)
                JOptionPane.showMessageDialog(null,"Vui lòng chọn dịch vụ!","Thông báo",JOptionPane.INFORMATION_MESSAGE);
            else {
                for (int i = 0; i < tblModelDVDuocChon.getRowCount(); i++ ) {
                    ThuPhiBUS thuphiBUS = new ThuPhiBUS();
                    String madv = tblModelDVDuocChon.getValueAt(i,0).toString();
                    String dongia = tblModelDVDuocChon.getValueAt(i,2).toString();
                    String soluong = tblModelDVDuocChon.getValueAt(i,3).toString();
                    int ThanhTien = Integer.parseInt(soluong) * Integer.parseInt(dongia);
                    String thanhtien = String.valueOf(ThanhTien);
                    thuphiBUS.themThuPhi(makb, madv, soluong, thanhtien);
                    KhamBenhBUS khambenhBUS = new KhamBenhBUS();
                    khambenhBUS.capNhatKetLuan(txtKetLuan.getText(), makb);
                }
                JOptionPane.showMessageDialog(null,"Thành công!","Thông báo",JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnThemActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThem;
    private javax.swing.JComboBox<String> cbbBacSiKham;
    private javax.swing.JComboBox<String> cbbBenhNhan;
    private com.toedter.calendar.JDateChooser datNgayKham;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lblDSDichVu;
    private javax.swing.JLabel lblDSDichVuDuocChon;
    private javax.swing.JLabel lblKetLuan;
    private javax.swing.JLabel lblNgayKham;
    private javax.swing.JLabel lblTenBN;
    private javax.swing.JLabel lblTenBS;
    private javax.swing.JLabel lblYeuCauKham;
    private javax.swing.JTable tblDichVu;
    private javax.swing.JTable tblDichVuDuocChon;
    private javax.swing.JTextField txtKetLuan;
    private javax.swing.JTextField txtYeuCauKham;
    // End of variables declaration//GEN-END:variables
}
