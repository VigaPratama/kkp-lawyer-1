/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Lawyer;

import java.awt.Color;
import java.io.FileInputStream;
import javax.swing.JFileChooser;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

import koneksi.Konfig;

/**
 *
 * @author Me
 */
public class BerkasSuratMasuk extends javax.swing.JInternalFrame {
    private String filePath;
    /**
     * Creates new form DataPesertaPKH
     */
    public BerkasSuratMasuk() {
        initComponents();
        
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui=(BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
    }

   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fileNameTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fileTypeTextField = new javax.swing.JTextField();
        Choose = new javax.swing.JButton();
        upload = new javax.swing.JButton();
        back = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Berkas Surat Masuk");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 250, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nama File :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 70, 30));
        jPanel1.add(fileNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 360, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Tipe File  :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 70, 30));
        jPanel1.add(fileTypeTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 360, 30));

        Choose.setText("Choose");
        Choose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChooseActionPerformed(evt);
            }
        });
        jPanel1.add(Choose, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, 80, 30));

        upload.setText("upload");
        upload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadActionPerformed(evt);
            }
        });
        jPanel1.add(upload, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 80, 30));

        back.setText("Kembali Ke Menu");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 130, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ChooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChooseActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            filePath = selectedFile.getAbsolutePath();
            fileNameTextField.setText(selectedFile.getName());
        }
    }//GEN-LAST:event_ChooseActionPerformed

    private void uploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadActionPerformed
        // TODO add your handling code here:
        if (filePath == null) {
            JOptionPane.showMessageDialog(null, "Please choose a file to upload.");
            return;
        }
        
        String fileName = fileNameTextField.getText();
        String fileType = fileTypeTextField.getText();
        
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/lawyer", "root", "");
            
            String insertSql = "INSERT INTO berkas_surat (Nama_File, Tipe_File, File_Content) VALUES (?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(insertSql);
            
            File file = new File(filePath);
            FileInputStream inputStream = new FileInputStream(file);
            
            stmt.setString(1, fileName);
            stmt.setString(2, fileType);
            stmt.setBinaryStream(3, inputStream, (int) file.length());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "File uploaded successfully.");
            
            conn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error uploading file: " + e.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error uploading file: " + e.getMessage());
        }
    }//GEN-LAST:event_uploadActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        MenuBerkasSurat Menu = new MenuBerkasSurat();
        Menu.setVisible(true);
        this.getDesktopPane().add(Menu);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Choose;
    private javax.swing.JButton back;
    private javax.swing.JTextField fileNameTextField;
    private javax.swing.JTextField fileTypeTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton upload;
    // End of variables declaration//GEN-END:variables
}