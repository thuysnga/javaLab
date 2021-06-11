package GUI;

import java.io.*;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import java.awt.Desktop;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import java.text.NumberFormat;
import java.util.Locale;
/**
 *
 * @author THUYNGA
 */
public class Lab6_report extends javax.swing.JFrame {
    public Lab6_report() {
        initComponents();
        tblModelDV = new DefaultTableModel();
        loadTableDichVu();
        setVisible(true);
    }
    public Connection createConn () {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String URL = "jdbc:mysql://localhost:3306/qlkb";
            String USER = "root";
            String PASS = "NGA.kiu47";
            conn = DriverManager.getConnection(URL, USER, PASS);
            if (conn == null)
                System.out.println("Ket noi khong thanh cong.");
            else
                System.out.println("Ket noi thanh cong.");     
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblMaKB = new javax.swing.JLabel();
        lblMaBN = new javax.swing.JLabel();
        lblMaBS = new javax.swing.JLabel();
        lblNgayKham = new javax.swing.JLabel();
        lblYeuCauKham = new javax.swing.JLabel();
        lblKetLuan = new javax.swing.JLabel();
        lblTongTien = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDichVu = new javax.swing.JTable();
        ckbThanhToan = new javax.swing.JCheckBox();
        txtMaKB = new javax.swing.JTextField();
        txtMaBN = new javax.swing.JTextField();
        txtMaBS = new javax.swing.JTextField();
        txtNgayKham = new javax.swing.JTextField();
        txtYeuCauKham = new javax.swing.JTextField();
        txtKetLuan = new javax.swing.JTextField();
        txtTongTien = new javax.swing.JTextField();
        btnInHoaDon = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Thanh toán khám bệnh");

        lblMaKB.setText("Mã khám bệnh");

        lblMaBN.setText("Mã bệnh nhân");

        lblMaBS.setText("Mã bác sĩ");

        lblNgayKham.setText("Ngày khám");

        lblYeuCauKham.setText("Yêu cầu khám");

        lblKetLuan.setText("Kết luận");

        lblTongTien.setText("Tổng tiền");

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
        jScrollPane1.setViewportView(tblDichVu);

        ckbThanhToan.setText("Đã thanh toán");

        txtMaKB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMaKBKeyReleased(evt);
            }
        });

        txtMaBN.setPreferredSize(new java.awt.Dimension(120, 22));

        txtNgayKham.setPreferredSize(new java.awt.Dimension(120, 22));

        txtYeuCauKham.setPreferredSize(new java.awt.Dimension(120, 22));

        txtKetLuan.setPreferredSize(new java.awt.Dimension(120, 22));

        txtTongTien.setPreferredSize(new java.awt.Dimension(120, 22));

        btnInHoaDon.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnInHoaDon.setText("In hóa đơn");
        btnInHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInHoaDonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ckbThanhToan))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblMaKB)
                                .addGap(18, 18, 18)
                                .addComponent(txtMaKB))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblKetLuan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtKetLuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblMaBN)
                                    .addComponent(lblNgayKham))
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtMaBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNgayKham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblTongTien)
                                .addGap(47, 47, 47)
                                .addComponent(txtTongTien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblMaBS)
                                    .addComponent(lblYeuCauKham))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtMaBS)
                                    .addComponent(txtYeuCauKham, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE))))))
                .addContainerGap(55, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnInHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(237, 237, 237))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaKB)
                    .addComponent(txtMaKB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaBN)
                    .addComponent(lblMaBS)
                    .addComponent(txtMaBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaBS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNgayKham)
                    .addComponent(lblYeuCauKham)
                    .addComponent(txtNgayKham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtYeuCauKham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblKetLuan)
                        .addComponent(lblTongTien)
                        .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtKetLuan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ckbThanhToan)
                        .addGap(162, 162, 162))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnInHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(29, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnInHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInHoaDonActionPerformed
        Document document = new Document(PageSize.A4);
        String filename = "HD_" + txtMaKB.getText();
        try {
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("reports/" + filename + ".pdf"));
            document.open();
            document.addAuthor("Nguyễn Thị Thúy Nga");
            document.addCreationDate();
            document.addCreator("QLKB");
            document.addTitle("Hóa đơn khám bệnh");
            document.addSubject("Hóa đơn khám bệnh");
            
            //Dinh nghia cac font chu duoc su dung
            
            File filefontTieuDe = new File ("fonts/vuArialBold.ttf");
            BaseFont bfTieuDe = BaseFont.createFont(filefontTieuDe.getAbsolutePath(),BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
            Font fontTieuDe1 = new Font(bfTieuDe,16);
            fontTieuDe1.setColor(BaseColor.BLUE);
            Font fontTieuDe2 = new Font(bfTieuDe,13);
            fontTieuDe2.setColor(BaseColor.BLUE);
            Font fontTieuDe3 = new Font(bfTieuDe,13);
            Font fontTieuDe4 = new Font(bfTieuDe,12);
            
            File filefontNoiDung = new File ("fonts/vuArial.ttf");
            BaseFont bfNoiDung = BaseFont.createFont(filefontNoiDung.getAbsolutePath(),BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
            Font fontNoiDung1 = new Font(bfNoiDung,13);
            Font fontNoiDung2 = new Font(bfNoiDung,12);
            Font fontNoiDung3 = new Font(bfNoiDung,11);            
            // chen logo
            Image logo = Image.getInstance("images/hospital.png");
            logo.setAbsolutePosition(80, 750);
            logo.scaleAbsolute(50, 50);
            document.add(logo);
            
            Paragraph prgTenPK = new Paragraph("PHÒNG KHÁM ĐA KHOA HẠNH PHÚC",fontTieuDe2);
            prgTenPK.setIndentationLeft(100);
            document.add(prgTenPK);
            
            Paragraph prgDiaChi = new Paragraph("15 Mai Hắc Đế, phường Tân An, thành phố Buôn Ma Thuột",fontNoiDung2);
            prgDiaChi.setIndentationLeft(100);
            document.add(prgDiaChi);
            
            Paragraph prgSDT = new Paragraph("0888. 87. 88. 87",fontNoiDung2);
            prgSDT.setIndentationLeft(100);
            document.add(prgSDT);
            
            Paragraph prgTieuDe = new Paragraph("HÓA ĐƠN DỊCH VỤ",fontTieuDe1);
            prgTieuDe.setAlignment(Element.ALIGN_CENTER);
            prgTieuDe.setSpacingAfter(10);
            prgTieuDe.setSpacingAfter(10);
            document.add(prgTieuDe);
            
            String NgKham = "";
            String TenBS = "";
            
            try {
                Connection conn = createConn();
                String strSQL = "select * from BENHNHAN, KHAMBENH, BACSI WHERE BENHNHAN.MABN = KHAMBENH.MABN AND KHAMBENH.MABS = BACSI.MABS AND MAKB = ? ";
                PreparedStatement pres = conn.prepareStatement(strSQL);
                pres.setString(1, txtMaKB.getText());
                ResultSet rs = pres.executeQuery();
                if (rs.first()) {
                    List listTTKH = new List(List.UNORDERED);
                    listTTKH.add(new ListItem("Họ và tên bệnh nhân : " + rs.getString("tenBN").toUpperCase(),fontTieuDe3));
                    listTTKH.add(new ListItem("Mã bệnh nhân : " + rs.getString("BENHNHAN.maBN"),fontNoiDung1));
                    if (rs.getBoolean("gioitinh") == true) 
                        listTTKH.add(new ListItem("Giới tính : Nam ", fontNoiDung1));
                    else
                        listTTKH.add(new ListItem("Giới tính : Nữ ", fontNoiDung1));
                    
                    String[] arrayNgSinh = rs.getString("NgSinh").split("-");
                    String ngay = arrayNgSinh[2];
                    String thang = arrayNgSinh[1];
                    String nam = arrayNgSinh[0];
                    listTTKH.add(new ListItem("Ngày sinh : " + ngay + "/" + thang + "/" + nam, fontNoiDung1));
                    listTTKH.add(new ListItem("Địa chỉ : " + rs.getString("DChi"), fontNoiDung1));
                    listTTKH.add(new ListItem("Số điện thoại : " + rs.getString("Dthoai"), fontNoiDung1));
                    listTTKH.add(new ListItem("Yêu cầu khám : " + rs.getString("YeuCauKham"), fontNoiDung1));
                    listTTKH.add(new ListItem("Kết luận : " + rs.getString("KetLuan"), fontTieuDe3));
                    document.add(listTTKH);
                    NgKham = rs.getString("NgayKham");
                    TenBS = rs.getString("TenBS");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
                    
            Paragraph prgDichVu = new Paragraph("Các dịch vụ đã sử dụng : ",fontTieuDe3);
            prgDichVu.setSpacingAfter(10);
            prgDichVu.setSpacingAfter(10);
            document.add(prgDichVu); 
            PdfPTable tableDV = new PdfPTable(6);
            tableDV.setWidthPercentage(80);
            tableDV.setSpacingBefore(10);
            tableDV.setSpacingAfter(10);
            float [] table_columnWidths = {50,120,150,100,80,100};
            tableDV.setWidths(table_columnWidths);
            PdfPCell cellTDTT = new PdfPCell(new Paragraph("STT",fontTieuDe4));
            cellTDTT.setBorderColor(BaseColor.BLACK);
            cellTDTT.setHorizontalAlignment(Element.ALIGN_CENTER);
            cellTDTT.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cellTDTT.setMinimumHeight(30);
            tableDV.addCell(cellTDTT);
            PdfPCell cellTDMaDV = new PdfPCell(new Paragraph("Mã dịch vụ",fontTieuDe4));
            cellTDMaDV.setBorderColor(BaseColor.BLACK);
            cellTDMaDV.setHorizontalAlignment(Element.ALIGN_CENTER);
            cellTDMaDV.setVerticalAlignment(Element.ALIGN_MIDDLE);
            tableDV.addCell(cellTDMaDV);
            PdfPCell cellTDTenDV = new PdfPCell(new Paragraph("Tên dịch vụ",fontTieuDe4));
            cellTDTenDV.setBorderColor(BaseColor.BLACK);
            cellTDTenDV.setHorizontalAlignment(Element.ALIGN_CENTER);
            cellTDTenDV.setVerticalAlignment(Element.ALIGN_MIDDLE);
            tableDV.addCell(cellTDTenDV);
            PdfPCell cellTDDonGia = new PdfPCell(new Paragraph("Đơn giá",fontTieuDe4));
            cellTDDonGia.setBorderColor(BaseColor.BLACK);
            cellTDDonGia.setHorizontalAlignment(Element.ALIGN_CENTER);
            cellTDDonGia.setVerticalAlignment(Element.ALIGN_MIDDLE);
            tableDV.addCell(cellTDDonGia);
            PdfPCell cellTDSL = new PdfPCell(new Paragraph("Số lượng",fontTieuDe4));
            cellTDSL.setBorderColor(BaseColor.BLACK);
            cellTDSL.setHorizontalAlignment(Element.ALIGN_CENTER);
            cellTDSL.setVerticalAlignment(Element.ALIGN_MIDDLE);
            tableDV.addCell(cellTDSL);
            PdfPCell cellTDThanhTien = new PdfPCell(new Paragraph("Thành Tiền",fontTieuDe4));
            cellTDThanhTien.setBorderColor(BaseColor.BLACK);
            cellTDThanhTien.setHorizontalAlignment(Element.ALIGN_CENTER);
            cellTDThanhTien.setVerticalAlignment(Element.ALIGN_MIDDLE);
            tableDV.addCell(cellTDThanhTien);
            Connection conn = createConn();
            try {
                String sql = "select * from DICHVU, THUPHI where MAKB = ? AND DICHVU.MADV = THUPHI.MADV;";
                PreparedStatement pres = conn.prepareStatement(sql);
                pres.setString(1, txtMaKB.getText());
                ResultSet rs = pres.executeQuery();
                int TongTien = 0;
                int TT = 1;
                while (rs.next()) {
                    PdfPCell cellTT = new PdfPCell(new Paragraph(String.valueOf(TT),fontNoiDung3));
                    cellTT.setHorizontalAlignment(Element.ALIGN_CENTER);
                    cellTT.setVerticalAlignment(Element.ALIGN_MIDDLE);
                    cellTT.setMinimumHeight(20);
                    tableDV.addCell(cellTT);
                    
                    PdfPCell cellMaDV = new PdfPCell(new Paragraph(rs.getString("DICHVU.MADV"),fontNoiDung3));
                    cellMaDV.setHorizontalAlignment(Element.ALIGN_CENTER);
                    cellMaDV.setVerticalAlignment(Element.ALIGN_MIDDLE);
                    tableDV.addCell(cellMaDV);
                    
                    PdfPCell cellTenDV = new PdfPCell(new Paragraph(rs.getString("TENDV"),fontNoiDung3));
                    cellTenDV.setHorizontalAlignment(Element.ALIGN_JUSTIFIED);
                    cellTenDV.setVerticalAlignment(Element.ALIGN_MIDDLE);
                    tableDV.addCell(cellTenDV);
                    
                    PdfPCell cellDonGia = new PdfPCell(new Paragraph(DinhDangTienTe(rs.getInt("DICHVU.DONGIA")),fontNoiDung3));
                    cellDonGia.setHorizontalAlignment(Element.ALIGN_CENTER);
                    cellDonGia.setVerticalAlignment(Element.ALIGN_MIDDLE);
                    tableDV.addCell(cellDonGia);
                    
                    PdfPCell cellSoLuong = new PdfPCell(new Paragraph(rs.getString("SOLUONG"),fontNoiDung3));
                    cellSoLuong.setHorizontalAlignment(Element.ALIGN_CENTER);
                    cellSoLuong.setVerticalAlignment(Element.ALIGN_MIDDLE);
                    tableDV.addCell(cellSoLuong);
                    
                    PdfPCell cellThanhTien = new PdfPCell(new Paragraph(DinhDangTienTe(rs.getInt("THANHTIEN")),fontNoiDung3));
                    cellThanhTien.setPaddingLeft(10);
                    cellThanhTien.setHorizontalAlignment(Element.ALIGN_CENTER);
                    cellThanhTien.setVerticalAlignment(Element.ALIGN_MIDDLE);
                    tableDV.addCell(cellThanhTien);

                    TongTien += rs.getInt("THANHTIEN");
                    TT++;
                }
                
                PdfPCell cellTongCong = new PdfPCell(new Paragraph("TỔNG CỘNG : ",fontTieuDe4));
                cellTongCong.setColspan(5);
                cellTongCong.setHorizontalAlignment(Element.ALIGN_CENTER);
                cellTongCong.setVerticalAlignment(Element.ALIGN_MIDDLE);
                cellTongCong.setMinimumHeight(20);
                tableDV.addCell(cellTongCong);
                    
                PdfPCell cellTongTien = new PdfPCell(new Paragraph(DinhDangTienTe(TongTien),fontTieuDe4));
                cellTongTien.setHorizontalAlignment(Element.ALIGN_JUSTIFIED);
                cellTongTien.setVerticalAlignment(Element.ALIGN_MIDDLE);
                tableDV.addCell(cellTongTien);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            document.add(tableDV);
            
            PdfPTable tableTTBS = new PdfPTable(2);
            tableTTBS.setWidthPercentage(90);
            tableTTBS.setSpacingBefore(10);
            tableTTBS.setSpacingAfter(10);
            float [] tableTTBS_columnWidths = {300,200};
            tableTTBS.setWidths(tableTTBS_columnWidths);
            PdfPCell cellGhiChu = new PdfPCell(new Paragraph("Ghi chú : ", fontNoiDung3));
            cellGhiChu.setBorder(0);
            cellGhiChu.setRowspan(3);
            cellGhiChu.setHorizontalAlignment(Element.ALIGN_LEFT);
            cellGhiChu.setVerticalAlignment(Element.ALIGN_TOP);
            tableTTBS.addCell(cellGhiChu);
            String[] arrayNgKham = NgKham.split("-");
            String ngay = arrayNgKham[2];
            String thang = arrayNgKham[1];
            String nam = arrayNgKham[0];
            
            Paragraph prgNgKham = new Paragraph("Ngày " + ngay + " tháng " + thang + " năm " + nam +".",  fontNoiDung1);
            PdfPCell cellNgKham = new PdfPCell(prgNgKham);
            cellNgKham.setBorder(0);
            cellNgKham.setHorizontalAlignment(Element.ALIGN_CENTER);
            cellNgKham.setVerticalAlignment(Element.ALIGN_MIDDLE);
            tableTTBS.addCell(cellNgKham);
            
            PdfPCell cellBS = new PdfPCell(new Paragraph("Bác sĩ chuẩn đoán \n \n \n \n \n", fontTieuDe4));
            cellBS.setBorder(0);
            cellBS.setHorizontalAlignment(Element.ALIGN_CENTER);
            cellBS.setVerticalAlignment(Element.ALIGN_MIDDLE);
            tableTTBS.addCell(cellBS);
            
            PdfPCell cellTenBS = new PdfPCell(new Paragraph(TenBS, fontTieuDe4));
            cellTenBS.setBorder(0);
            cellTenBS.setHorizontalAlignment(Element.ALIGN_CENTER);
            cellTenBS.setVerticalAlignment(Element.ALIGN_MIDDLE);
            tableTTBS.addCell(cellTenBS);
            document.add(tableTTBS);    

            document.close();
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            File file = new File("reports/" + filename + ".pdf");
            if (!Desktop.isDesktopSupported()) {
                System.out.println("Not supported.");
                return;
            }
            Desktop desktop = Desktop.getDesktop();
            if (file.exists())
                desktop.open(file);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_btnInHoaDonActionPerformed

    DefaultTableModel tblModelDV;
    public void loadTableDichVu () {
        String tit[] = {"Mã dịch vụ", "Tên dịch vụ", "Số lượng","Thành tiền"};
        tblModelDV.setColumnIdentifiers(tit);
        tblDichVu.setModel(tblModelDV);
        setVisible(true);
    }

    public void loadData() {
        Connection conn = createConn();
        try {
            String sql = "select * from DICHVU, THUPHI where MAKB = ? AND DICHVU.MADV = THUPHI.MADV;";
            PreparedStatement pres = conn.prepareStatement(sql);
            pres.setString(1, txtMaKB.getText());
            ResultSet rs = pres.executeQuery();
            int TongTien = 0;
            while (rs.next()) {
                String [] rows =  new String[4];
                rows[0] = rs.getString("DICHVU.MADV");
                rows[1] = rs.getString("TENDV");
                rows[2] = rs.getString("SOLUONG");
                rows[3] = rs.getString("THANHTIEN");
                tblModelDV.addRow(rows);
                tblDichVu.setModel(tblModelDV);
                TongTien += rs.getInt("THANHTIEN");
            }
            txtTongTien.setText(String.valueOf(TongTien));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public String DinhDangTienTe(int SoTien) {
        Locale localeEN = new Locale("en","EN");
        NumberFormat en = NumberFormat.getInstance(localeEN);
        String str = en.format(SoTien);
        return str;
    }
    
    private void txtMaKBKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMaKBKeyReleased
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            int size = tblModelDV.getRowCount();
            while (size > 0) {
                tblModelDV.removeRow(0);
                size--;
            }
            Connection conn = createConn();
            try {
                String strSQL = "select * from KHAMBENH where MAKB = ? ;";
                PreparedStatement pres = conn.prepareStatement(strSQL);
                pres.setString(1, txtMaKB.getText());
                ResultSet rs = pres.executeQuery();
                if (rs.first()) {
                    txtMaBN.setText(rs.getString("MABN"));
                    txtMaBS.setText(rs.getString("MABS"));
                    txtNgayKham.setText(rs.getDate("NGAYKHAM").toString());
                    txtYeuCauKham.setText(rs.getString("YEUCAUKHAM"));
                    txtKetLuan.setText(rs.getString("KetLuan"));
                    if (rs.getBoolean("THANHTOAN") == true)
                        ckbThanhToan.setSelected(true);
                }
                conn.close();
                pres.close();
                if (rs!=null) rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            loadData();
        }
    }//GEN-LAST:event_txtMaKBKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInHoaDon;
    private javax.swing.JCheckBox ckbThanhToan;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblKetLuan;
    private javax.swing.JLabel lblMaBN;
    private javax.swing.JLabel lblMaBS;
    private javax.swing.JLabel lblMaKB;
    private javax.swing.JLabel lblNgayKham;
    private javax.swing.JLabel lblTongTien;
    private javax.swing.JLabel lblYeuCauKham;
    private javax.swing.JTable tblDichVu;
    private javax.swing.JTextField txtKetLuan;
    private javax.swing.JTextField txtMaBN;
    private javax.swing.JTextField txtMaBS;
    private javax.swing.JTextField txtMaKB;
    private javax.swing.JTextField txtNgayKham;
    private javax.swing.JTextField txtTongTien;
    private javax.swing.JTextField txtYeuCauKham;
    // End of variables declaration//GEN-END:variables
}
