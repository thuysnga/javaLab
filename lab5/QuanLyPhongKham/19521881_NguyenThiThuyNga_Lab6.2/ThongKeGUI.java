package GUI;
import java.io.*;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.image.BufferedImage;
import java.sql.*;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.labels.PieSectionLabelGenerator;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.chart.renderer.category.BarPainter;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.chart.renderer.category.StandardBarPainter;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.chart.renderer.AbstractRenderer;
import org.jfree.chart.renderer.xy.AbstractXYItemRenderer;
import org.jfree.chart.labels.XYItemLabelGenerator;
import org.jfree.chart.labels.XYLabelGenerator;

/**
 *
 * @author THUYNGA
 */
public class ThongKeGUI extends javax.swing.JFrame {
    public ThongKeGUI() {
        initComponents();
        createConn();
        
        setTitle("Thống kê báo cáo");
        setSize(400,330);
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
    public String DinhDangNgayDMY(String ngay) {
        String[] arrNgay = ngay.split("-");
        String d = arrNgay[2];
        String m = arrNgay[1];
        String y = arrNgay[0];
        return d + "/" + m + "/" + y;
    }
    public String DinhDangTienTe(int SoTien) {
        Locale localeEN = new Locale("en","EN");
        NumberFormat en = NumberFormat.getInstance(localeEN);
        String str = en.format(SoTien);
        return str;
    }
    public BufferedImage createPieChart (DefaultPieDataset dataset) {
        BufferedImage bufferedImage = null;
        try {
            JFreeChart chart = ChartFactory.createPieChart("Doanh thu các dịch vụ", dataset,false, true, false);
            chart.getTitle().setFont(new java.awt.Font("Tahoma",java.awt.Font.BOLD, 120));
            
            PiePlot piePlot = (PiePlot) chart.getPlot();
            piePlot.setShadowPaint(null);
            piePlot.setBackgroundPaint(Color.white);
            piePlot.setOutlinePaint(null);
            piePlot.setLabelShadowPaint(null);
            piePlot.setLabelBackgroundPaint(Color.white);
            piePlot.setLabelOutlinePaint(Color.white);
            
            piePlot.setLabelFont(new java.awt.Font("Tahoma", java.awt.Font.ITALIC, 80));
            piePlot.setLabelLinkStroke(new BasicStroke(10.0f));
            
            PieSectionLabelGenerator labelGenerator = new StandardPieSectionLabelGenerator("{0} - {2}");
            piePlot.setLabelGenerator(labelGenerator);
            bufferedImage = chart.createBufferedImage(4000,4000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bufferedImage;
    }
    public BufferedImage createBarChart(DefaultCategoryDataset dataset, String tuNgay, String denNgay) {
        BufferedImage bufferedImage = null;
        try {
            JFreeChart chart = ChartFactory.createBarChart("Doanh thu từ " + tuNgay + " đến " + denNgay, "Ngày", "Doanh thu", dataset, PlotOrientation.VERTICAL, false, false, false);
            java.awt.Font fontTieuDe = new java.awt.Font ("Tahoma", java.awt.Font.BOLD, 80);
            java.awt.Font fontNoiDung1 = new java.awt.Font ("Tahoma", java.awt.Font.PLAIN, 80);
            java.awt.Font fontNoiDung2 = new java.awt.Font ("Tahoma", java.awt.Font.ITALIC, 80);
            chart.getTitle().setFont(fontTieuDe);
            
            CategoryPlot Plot = (CategoryPlot) chart.getPlot();
//            ((BarRenderer) Plot.getRenderer()).setBarPainter(new StandardBarPainter());

            Plot.setBackgroundPaint(Color.white);
            Plot.setOutlinePaint(null);

            CategoryItemRenderer renderer = ((CategoryPlot) chart.getPlot()).getRenderer();
            renderer.setDefaultItemLabelGenerator(new StandardCategoryItemLabelGenerator());
            renderer.setDefaultItemLabelsVisible(true);
            ItemLabelPosition position = new (ItemLabelPosition(itemLabelAnchor.OUTSIDE12, TextAnchor.TOP_CENTER));
            renderer.setDefaultPositiveItemLabelPosition(position);
            renderer.setDefaultItemLabelsVisible(fontNoiDung1);

            CategoryAxis DomainAxis = Plot.getDomainAxis();
            DomainAxis.setTickLabelFont(fontNoiDung1);
            DomainAxis.setLabelFont(fontNoiDung2);

            ValueAxis RangeAxis = Plot.getRangeAxis();
            RangeAxis.setTickLabelFont(fontNoiDung1);
            RangeAxis.setLabelFont(fontNoiDung2);
            bufferedImage = chart.createBufferedImage(5000,3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bufferedImage;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblLoaiBC = new javax.swing.JLabel();
        lblTit = new javax.swing.JLabel();
        lblTuNgay = new javax.swing.JLabel();
        lblDenNgay = new javax.swing.JLabel();
        datTuNgay = new com.toedter.calendar.JDateChooser();
        datDenNgay = new com.toedter.calendar.JDateChooser();
        cbbLoaiBaoCao = new javax.swing.JComboBox<>();
        btnXuatFile = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblLoaiBC.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblLoaiBC.setText("Loại báo cáo");

        lblTit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTit.setForeground(new java.awt.Color(0, 51, 204));
        lblTit.setText("BÁO CÁO THỐNG KÊ");

        lblTuNgay.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTuNgay.setText("Từ ngày");

        lblDenNgay.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDenNgay.setText("Đến ngày");

        datTuNgay.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                datTuNgayPropertyChange(evt);
            }
        });

        datDenNgay.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                datDenNgayPropertyChange(evt);
            }
        });

        cbbLoaiBaoCao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbbLoaiBaoCao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chọn loại báo cáo", "BC Doanh thu dịch vụ", "BC Doanh thu từng ngày" }));

        btnXuatFile.setBackground(new java.awt.Color(0, 153, 255));
        btnXuatFile.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnXuatFile.setForeground(new java.awt.Color(255, 255, 255));
        btnXuatFile.setText("Xuất file");
        btnXuatFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuatFileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTuNgay)
                            .addComponent(lblDenNgay)
                            .addComponent(lblLoaiBC))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(datDenNgay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(datTuNgay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbbLoaiBaoCao, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(lblTit))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(btnXuatFile, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblTit)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLoaiBC)
                    .addComponent(cbbLoaiBaoCao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTuNgay)
                    .addComponent(datTuNgay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDenNgay)
                    .addComponent(datDenNgay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(btnXuatFile)
                .addContainerGap(70, Short.MAX_VALUE))
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

    private void btnXuatFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatFileActionPerformed
        Document document = new Document(PageSize.A4);
        int index = cbbLoaiBaoCao.getSelectedIndex();
        if (index == 0) {
            JOptionPane.showMessageDialog(null,"Vui lòng chọn loại báo cáo!","Thông báo",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (datTuNgay.getDate() == null || datDenNgay.getDate() == null) {
            JOptionPane.showMessageDialog(null,"Vui lòng chọn ngày bắt đầu và ngày kết thúc!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        String filename ="";
        String loaiBC = "";
        java.sql.Date fromdate = new java.sql.Date(datTuNgay.getDate().getTime());
        java.sql.Date todate = new java.sql.Date(datDenNgay.getDate().getTime());
        if (index == 1) {
            loaiBC = "BÁO CÁO DOANH THU DỊCH VỤ";
            filename = "BCDTDichVuTungay" + fromdate.toString() + "Denngay" + todate.toString();
        }
        else {
            loaiBC = "BÁO CÁO DOANH THU THEO NGÀY";
            filename = "BCDTTungay" + fromdate.toString() + "Denngay" + todate.toString();
        }
        try {
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("reports/" + filename + ".pdf"));
            document.open();
            document.addAuthor("Nguyễn Thị Thúy Nga");
            document.addCreationDate();
            document.addCreator("QLKB");
            document.addTitle(loaiBC);
            document.addSubject(loaiBC);
            
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
            
            Paragraph prgTieuDe = new Paragraph(loaiBC.toUpperCase(),fontTieuDe1);
            prgTieuDe.setAlignment(Element.ALIGN_CENTER);
            prgTieuDe.setSpacingBefore(10);
            prgTieuDe.setSpacingAfter(10);
            document.add(prgTieuDe);

            Paragraph prgNgKham = new Paragraph(" Từ ngày " + DinhDangNgayDMY(fromdate.toString()) + " đến ngày " + DinhDangNgayDMY(todate.toString()), fontTieuDe3);
            prgNgKham.setAlignment(Element.ALIGN_CENTER);
            prgNgKham.setSpacingAfter(20);
            document.add(prgNgKham);
            if (index == 1) {
                DefaultPieDataset dataset = new DefaultPieDataset();

                Paragraph prgDichVu = new Paragraph("I. Doanh thu của các dịch vụ : ",fontTieuDe2);
                prgDichVu.setSpacingAfter(10);
                prgDichVu.setSpacingAfter(10);
                document.add(prgDichVu); 

                PdfPTable tableDV = new PdfPTable(5);
                tableDV.setWidthPercentage(80);
                tableDV.setSpacingBefore(10);
                tableDV.setSpacingAfter(10);
                
                float [] table_columnWidths = {50,120,150,150,120};
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

                PdfPCell cellTDSoTien = new PdfPCell(new Paragraph("Số tiền",fontTieuDe4));
                cellTDSoTien.setBorderColor(BaseColor.BLACK);
                cellTDSoTien.setHorizontalAlignment(Element.ALIGN_CENTER);
                cellTDSoTien.setVerticalAlignment(Element.ALIGN_MIDDLE);
                tableDV.addCell(cellTDSoTien);
                
                PdfPCell cellTDGhiChu = new PdfPCell(new Paragraph("Ghi chú",fontTieuDe4));
                cellTDGhiChu.setBorderColor(BaseColor.BLACK);
                cellTDGhiChu.setHorizontalAlignment(Element.ALIGN_CENTER);
                cellTDGhiChu.setVerticalAlignment(Element.ALIGN_MIDDLE);
                tableDV.addCell(cellTDGhiChu);

                try {
                    Connection conn = createConn();
                    String sql = "select dichvu.madv, tendv, thanhtien "
                            + "from dichvu, khambenh, thuphi "
                            + "where dichvu.madv = thuphi.madv "
                            + "and khambenh.makb = thuphi.makb "
                            + "and thanhtoan = 1 "
                            + "and (ngaykham between ? and ? ) "
                            + "group by madv";
                    PreparedStatement pres = conn.prepareStatement(sql);
                    pres.setDate(1,fromdate);
                    pres.setDate(2,todate);
                    ResultSet rs = pres.executeQuery();
                    int tt = 1;
                    int tongTien = 0;
                    while (rs.next()) {
                        PdfPCell cellTT = new PdfPCell(new Paragraph(String.valueOf(tt),fontNoiDung3));
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

                        PdfPCell cellThanhTien = new PdfPCell(new Paragraph(DinhDangTienTe(rs.getInt("THANHTIEN")),fontNoiDung3));
                        cellThanhTien.setPaddingLeft(10);
                        cellThanhTien.setHorizontalAlignment(Element.ALIGN_RIGHT);
                        cellThanhTien.setVerticalAlignment(Element.ALIGN_MIDDLE);
                        tableDV.addCell(cellThanhTien);

                        PdfPCell cellGhiChu = new PdfPCell(new Paragraph("",fontNoiDung3));
                        cellGhiChu.setHorizontalAlignment(Element.ALIGN_CENTER);
                        cellGhiChu.setVerticalAlignment(Element.ALIGN_MIDDLE);
                        tableDV.addCell(cellGhiChu);

                        tt++;
                        tongTien += rs.getInt("THANHTIEN");
                        
                        dataset.setValue(rs.getString("TENDV"), rs.getInt("THANHTIEN"));
                    }
                    PdfPCell cellTongCong = new PdfPCell(new Paragraph("TỔNG CỘNG : ",fontTieuDe4));
                    cellTongCong.setColspan(3);
                    cellTongCong.setHorizontalAlignment(Element.ALIGN_CENTER);
                    cellTongCong.setVerticalAlignment(Element.ALIGN_MIDDLE);
                    cellTongCong.setMinimumHeight(20);
                    tableDV.addCell(cellTongCong);
                        
                    PdfPCell cellTongTien = new PdfPCell(new Paragraph(DinhDangTienTe(tongTien),fontTieuDe4));
                    cellTongTien.setHorizontalAlignment(Element.ALIGN_RIGHT);
                    cellTongTien.setVerticalAlignment(Element.ALIGN_MIDDLE);
                    tableDV.addCell(cellTongTien);

                    PdfPCell cellGhiChuTT = new PdfPCell(new Paragraph("",fontTieuDe4));
                    cellGhiChuTT.setHorizontalAlignment(Element.ALIGN_CENTER);
                    cellGhiChuTT.setVerticalAlignment(Element.ALIGN_MIDDLE);
                    tableDV.addCell(cellGhiChuTT);

                } catch (SQLException e) {
                    e.printStackTrace();
                }
                document.add(tableDV);

                Paragraph prgTTBieuDo = new Paragraph("II. Biểu đồ phần trăm Doanh thu của các dịch vụ ",fontTieuDe2);
                prgTTBieuDo.setSpacingAfter(10);
                prgTTBieuDo.setSpacingAfter(10);
                document.add(prgTTBieuDo); 

                BufferedImage bufferedImage = createPieChart(dataset);
                Image image = Image.getInstance(writer, bufferedImage, 1.0f);
                image.setAlignment(Element.ALIGN_CENTER);
                image.scaleAbsolute(400,400);
                document.add(image);
            }
            else if (index == 2) {
                DefaultCategoryDataset dataset = new DefaultCategoryDataset();

                Paragraph prgDichVu = new Paragraph("I. Doanh thu từng ngày : ",fontTieuDe2);
                prgDichVu.setSpacingAfter(10);
                prgDichVu.setSpacingAfter(10);
                document.add(prgDichVu); 

                PdfPTable tableDTTN = new PdfPTable(4);
                tableDTTN.setWidthPercentage(80);
                tableDTTN.setSpacingBefore(10);
                tableDTTN.setSpacingAfter(10);
                
                float [] table_columnWidths = {50,150,150,80};
                tableDTTN.setWidths(table_columnWidths);

                PdfPCell cellTDTT = new PdfPCell(new Paragraph("STT",fontTieuDe4));
                cellTDTT.setBorderColor(BaseColor.BLACK);
                cellTDTT.setHorizontalAlignment(Element.ALIGN_CENTER);
                cellTDTT.setVerticalAlignment(Element.ALIGN_MIDDLE);
                cellTDTT.setMinimumHeight(30);
                tableDTTN.addCell(cellTDTT);
                
                PdfPCell cellTDNgay = new PdfPCell(new Paragraph("Ngày",fontTieuDe4));
                cellTDNgay.setBorderColor(BaseColor.BLACK);
                cellTDNgay.setHorizontalAlignment(Element.ALIGN_CENTER);
                cellTDNgay.setVerticalAlignment(Element.ALIGN_MIDDLE);
                tableDTTN.addCell(cellTDNgay);
    
                PdfPCell cellTDSoTien = new PdfPCell(new Paragraph("Số tiền",fontTieuDe4));
                cellTDSoTien.setBorderColor(BaseColor.BLACK);
                cellTDSoTien.setHorizontalAlignment(Element.ALIGN_CENTER);
                cellTDSoTien.setVerticalAlignment(Element.ALIGN_MIDDLE);
                tableDTTN.addCell(cellTDSoTien);
                
                PdfPCell cellTDGhiChu = new PdfPCell(new Paragraph("Ghi chú",fontTieuDe4));
                cellTDGhiChu.setBorderColor(BaseColor.BLACK);
                cellTDGhiChu.setHorizontalAlignment(Element.ALIGN_CENTER);
                cellTDGhiChu.setVerticalAlignment(Element.ALIGN_MIDDLE);
                tableDTTN.addCell(cellTDGhiChu);
                try {
                    Connection conn = createConn();
                    String sql = "select khambenh.makb, ngaykham, thanhtien "
                            + "from khambenh, thuphi "
                            + "where khambenh.makb = thuphi.makb "
                            + "and thanhtoan = 1 "
                            + "and (ngaykham between ? and ? ) "
                            + "order by ngaykham";
                    PreparedStatement pres = conn.prepareStatement(sql);
                    pres.setDate(1,fromdate);
                    pres.setDate(2,todate);
                    ResultSet rs = pres.executeQuery();
                    int tt = 1;
                    int tongTien = 0;
                    int tongCong = 0;
                    String ngay = "";
                    if (rs.first())
                        ngay = DinhDangNgayDMY(new java.sql.Date(rs.getDate("ngaykham").getTime()).toString());
                    while (rs.next()) {
                        if (ngay.equalsIgnoreCase(DinhDangNgayDMY(new java.sql.Date(rs.getDate("ngaykham").getTime()).toString()))) {
                            tongTien += rs.getInt("thanhtien");
                        }
                        else {
                            PdfPCell cellTT = new PdfPCell(new Paragraph(String.valueOf(tt),fontNoiDung3));
                            cellTT.setHorizontalAlignment(Element.ALIGN_CENTER);
                            cellTT.setVerticalAlignment(Element.ALIGN_MIDDLE);
                            cellTT.setMinimumHeight(20);
                            tableDTTN.addCell(cellTT);
                            
                            PdfPCell cellNgayKham = new PdfPCell(new Paragraph(ngay,fontNoiDung3));
                            cellNgayKham.setHorizontalAlignment(Element.ALIGN_CENTER);
                            cellNgayKham.setVerticalAlignment(Element.ALIGN_MIDDLE);
                            tableDTTN.addCell(cellNgayKham);

                            PdfPCell cellTongTien = new PdfPCell(new Paragraph(DinhDangTienTe(tongTien),fontNoiDung3));
                            cellTongTien.setPaddingLeft(10);
                            cellTongTien.setHorizontalAlignment(Element.ALIGN_RIGHT);
                            cellTongTien.setVerticalAlignment(Element.ALIGN_MIDDLE);
                            tableDTTN.addCell(cellTongTien);

                            PdfPCell cellGhiChu = new PdfPCell(new Paragraph("",fontNoiDung3));
                            cellGhiChu.setHorizontalAlignment(Element.ALIGN_CENTER);
                            cellGhiChu.setVerticalAlignment(Element.ALIGN_MIDDLE);
                            tableDTTN.addCell(cellGhiChu);

                            ngay = DinhDangNgayDMY(new java.sql.Date(rs.getDate("ngaykham").getTime()).toString());
                            tongCong += tongTien;
                            dataset.setValue(tongTien, "Doanh thu", ngay);
                            tongTien = rs.getInt("thanhtien");
                            tt++;
                        }
                    }
                    dataset.setValue(tongTien, "Doanh thu", ngay);
                    PdfPCell cellTT = new PdfPCell(new Paragraph(String.valueOf(tt),fontNoiDung3));
                    cellTT.setHorizontalAlignment(Element.ALIGN_CENTER);
                    cellTT.setVerticalAlignment(Element.ALIGN_MIDDLE);
                    cellTT.setMinimumHeight(20);
                    tableDTTN.addCell(cellTT);
                            
                    PdfPCell cellNgayKham = new PdfPCell(new Paragraph(ngay,fontNoiDung3));
                    cellNgayKham.setHorizontalAlignment(Element.ALIGN_CENTER);
                    cellNgayKham.setVerticalAlignment(Element.ALIGN_MIDDLE);
                    tableDTTN.addCell(cellNgayKham);

                    PdfPCell cellTongTien = new PdfPCell(new Paragraph(DinhDangTienTe(tongTien),fontNoiDung3));
                    cellTongTien.setPaddingLeft(10);
                    cellTongTien.setHorizontalAlignment(Element.ALIGN_RIGHT);
                    cellTongTien.setVerticalAlignment(Element.ALIGN_MIDDLE);
                    tableDTTN.addCell(cellTongTien);

                    PdfPCell cellGhiChu = new PdfPCell(new Paragraph("",fontNoiDung3));
                    cellGhiChu.setHorizontalAlignment(Element.ALIGN_CENTER);
                    cellGhiChu.setVerticalAlignment(Element.ALIGN_MIDDLE);
                    tableDTTN.addCell(cellGhiChu);
    
                    PdfPCell cellTongCong = new PdfPCell(new Paragraph("TỔNG CỘNG : ",fontTieuDe4));
                    cellTongCong.setColspan(2);
                    cellTongCong.setHorizontalAlignment(Element.ALIGN_CENTER);
                    cellTongCong.setVerticalAlignment(Element.ALIGN_MIDDLE);
                    cellTongCong.setMinimumHeight(20);
                    tableDTTN.addCell(cellTongCong);
                        
                    tongCong += tongTien;
                    PdfPCell cellTongDT = new PdfPCell(new Paragraph(DinhDangTienTe(tongCong),fontTieuDe4));
                    cellTongDT.setHorizontalAlignment(Element.ALIGN_RIGHT);
                    cellTongDT.setVerticalAlignment(Element.ALIGN_MIDDLE);
                    tableDTTN.addCell(cellTongDT);

                    PdfPCell cellGhiChuTT = new PdfPCell(new Paragraph("",fontTieuDe4));
                    cellGhiChuTT.setHorizontalAlignment(Element.ALIGN_CENTER);
                    cellGhiChuTT.setVerticalAlignment(Element.ALIGN_MIDDLE);
                    tableDTTN.addCell(cellGhiChuTT);                    

                } catch (SQLException e) {
                    e.printStackTrace();
                }
                document.add(tableDTTN);

                Paragraph prgTTBieuDo = new Paragraph("II. Biểu đồ Doanh thu theo ngày",fontTieuDe2);
                prgTTBieuDo.setSpacingAfter(10);
                prgTTBieuDo.setSpacingAfter(10);
                document.add(prgTTBieuDo); 
                
//                BufferedImage bufferedImage = createBarChart(dataset, DinhDangNgayDMY(fromdate.toString()), DinhDangNgayDMY(todate.toString()));
//                Image image = Image.getInstance(writer, bufferedImage, 1.0f);
//                image.setAlignment(Element.ALIGN_CENTER);
//                image.scaleAbsolute(500,300);
//                document.add(image);
            }

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
    }//GEN-LAST:event_btnXuatFileActionPerformed

    private void datDenNgayPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_datDenNgayPropertyChange
        if (datDenNgay.getDate() != null) {
            if (datTuNgay.getDate() == null) {
                JOptionPane.showMessageDialog(null,"Chọn ngày bắt đầu","Thông báo", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            java.sql.Date fromdate = new java.sql.Date(datTuNgay.getDate().getTime());
            java.sql.Date todate = new java.sql.Date(datDenNgay.getDate().getTime());
            if (fromdate.toString().compareTo(todate.toString()) > 0) {
                JOptionPane.showMessageDialog(null,"Ngày bắt đầu phải nhỏ hơn ngày kết thúc", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                datDenNgay.setDate(null);
            }
        }
    }//GEN-LAST:event_datDenNgayPropertyChange

    private void datTuNgayPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_datTuNgayPropertyChange
        if ((datDenNgay.getDate() != null) && (datTuNgay.getDate() != null)) {
            java.sql.Date fromdate = new java.sql.Date(datTuNgay.getDate().getTime());
            java.sql.Date todate = new java.sql.Date(datDenNgay.getDate().getTime());
            if (fromdate.toString().compareTo(todate.toString()) > 0) {
                JOptionPane.showMessageDialog(null,"Ngày bắt đầu phải nhỏ hơn ngày kết thúc", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                datTuNgay.setDate(null);
            }
        }
    }//GEN-LAST:event_datTuNgayPropertyChange

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnXuatFile;
    private javax.swing.JComboBox<String> cbbLoaiBaoCao;
    private com.toedter.calendar.JDateChooser datDenNgay;
    private com.toedter.calendar.JDateChooser datTuNgay;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDenNgay;
    private javax.swing.JLabel lblLoaiBC;
    private javax.swing.JLabel lblTit;
    private javax.swing.JLabel lblTuNgay;
    // End of variables declaration//GEN-END:variables
}
