package GUI;

import BLL.UserBLL;
import DTO.UserDTO;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.*;

/**
 *
 * @author THUYNGA
 */
public class UserGUI extends javax.swing.JFrame {
    public UserGUI() {
        initComponents();
        setSize(600,400);
        setTitle("Quanlytaikhoan");
        loadTable();
        loadCbbRole();
        setVisible(true);
    }
    
    DefaultTableModel tblModelUser;
    public void loadTable () {
        tblModelUser = new DefaultTableModel();
        String title[] = {"Mã nhân viên","Tên đăng nhập","Mật khẩu","Phân quyền"};
        tblModelUser.setColumnIdentifiers(title);
        
        ArrayList<UserDTO> arr = new ArrayList<UserDTO>();
        UserBLL userBLL = new UserBLL();
        arr = userBLL.getAllUser();
        
        UserDTO userDTO = new UserDTO();
        for (int i = 0; i < arr.size(); i++) {
            userDTO = arr.get(i);
            int id = userDTO.getUserid();
            String username = userDTO.getUsername();
            String pass = userDTO.getPassword();
            String userrole = userDTO.getUserrole();
            Object [] row = {id, username, pass, userrole};
            tblModelUser.addRow(row);
         }
        tblUser.setModel(tblModelUser);
        setVisible(true);
    }
    
    public void loadCbbRole() {
        cbbUserrole.setModel(new DefaultComboBoxModel <> (new String [] 
            {"Quan tri","Lap trinh vien","Kiem thu phan mem","Giam doc"}));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbltit = new javax.swing.JLabel();
        lblUserid = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblUserpassword = new javax.swing.JLabel();
        lblUserrole = new javax.swing.JLabel();
        txtUserid = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        txtUserpassword = new javax.swing.JTextField();
        cbbUserrole = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUser = new javax.swing.JTable();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(600, 400));
        setSize(new java.awt.Dimension(600, 400));

        lbltit.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lbltit.setText("QUẢN LÝ TÀI KHOẢN");

        lblUserid.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblUserid.setText("Mã nhân viên");

        lblUsername.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblUsername.setText("Tên đăng nhập");

        lblUserpassword.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblUserpassword.setText("Mật khẩu");

        lblUserrole.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblUserrole.setText("Phân quyền");

        txtUserid.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N

        txtUsername.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N

        txtUserpassword.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N

        cbbUserrole.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        cbbUserrole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        tblUser.setModel(new javax.swing.table.DefaultTableModel(
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
        tblUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUserMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblUser);

        btnInsert.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btnInsert.setText("Thêm");
        btnInsert.setMaximumSize(new java.awt.Dimension(100, 25));
        btnInsert.setMinimumSize(new java.awt.Dimension(100, 25));
        btnInsert.setPreferredSize(new java.awt.Dimension(100, 25));
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btnUpdate.setText("Cập nhật");
        btnUpdate.setPreferredSize(new java.awt.Dimension(100, 25));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btnDelete.setText("Xóa");
        btnDelete.setMaximumSize(new java.awt.Dimension(100, 25));
        btnDelete.setMinimumSize(new java.awt.Dimension(100, 25));
        btnDelete.setPreferredSize(new java.awt.Dimension(100, 25));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUserid)
                            .addComponent(lblUsername))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(lbltit))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtUserid, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblUserpassword)
                                    .addComponent(lblUserrole))
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtUserpassword)
                                    .addComponent(cbbUserrole, 0, 130, Short.MAX_VALUE))))))
                .addGap(46, 46, 46))
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(lbltit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUserid)
                            .addComponent(txtUserid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUsername)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUserpassword)
                            .addComponent(txtUserpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUserrole)
                            .addComponent(cbbUserrole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        UserDTO userDTO = new UserDTO();
        userDTO.setUserid(Integer.parseInt(txtUserid.getText()));
        userDTO.setUsername(txtUsername.getText());
        userDTO.setPassword(txtUserpassword.getText());
        userDTO.setUserrole(cbbUserrole.getSelectedItem().toString());
        
        UserBLL userBLL = new UserBLL();
        try {
            int result = userBLL.updateUser(userDTO);
            if (result != 0) {
                JOptionPane.showMessageDialog(null, "Cap nhat du lieu thanh cong!","Thong bao", JOptionPane.INFORMATION_MESSAGE);
                loadTable();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void tblUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUserMouseClicked
        int indexTB = tblUser.getSelectedRow();
        if (indexTB < tblModelUser.getRowCount() && indexTB >=0 ) {
            txtUserid.setText(tblModelUser.getValueAt(indexTB, 0).toString());
            txtUsername.setText(tblModelUser.getValueAt(indexTB, 1).toString());
            txtUserpassword.setText(tblModelUser.getValueAt(indexTB, 2).toString());
            cbbUserrole.setSelectedItem(tblModelUser.getValueAt(indexTB, 3).toString());
        }
    }//GEN-LAST:event_tblUserMouseClicked

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        UserDTO userDTO = new UserDTO();
        userDTO.setUserid(Integer.parseInt(txtUserid.getText()));
        userDTO.setUsername(txtUsername.getText());
        userDTO.setPassword(txtUserpassword.getText());
        userDTO.setUserrole(cbbUserrole.getSelectedItem().toString());
        
        UserBLL userBLL = new UserBLL();
        try {
            int result = userBLL.insertUser(userDTO);
            if (result != 0) {
                JOptionPane.showMessageDialog(null, "Them du lieu thanh cong!","Thong bao", JOptionPane.INFORMATION_MESSAGE);
                loadTable();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        UserDTO userDTO = new UserDTO();
        userDTO.setUserid(Integer.parseInt(txtUserid.getText()));
        
        UserBLL userBLL = new UserBLL();
        int choice = JOptionPane.showConfirmDialog(null, "Ban co chac muon xoa du lieu?", "Xac nhan", JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.YES_OPTION) {
            try {
                int result = userBLL.deleteUser(userDTO);
                if (result != 0) {
                    JOptionPane.showMessageDialog(null, "Xoa du lieu thanh cong!","Thong bao", JOptionPane.INFORMATION_MESSAGE);
                    loadTable();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbbUserrole;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblUserid;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblUserpassword;
    private javax.swing.JLabel lblUserrole;
    private javax.swing.JLabel lbltit;
    private javax.swing.JTable tblUser;
    private javax.swing.JTextField txtUserid;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JTextField txtUserpassword;
    // End of variables declaration//GEN-END:variables
}
