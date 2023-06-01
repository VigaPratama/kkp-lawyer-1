/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Lawyer;

import java.awt.Color;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import koneksi.Konfig;

/**
 *
 * @author Me
 */
public class DataKasusPHI extends javax.swing.JInternalFrame {
   
    /**
     * Creates new form DataPesertaPKH
     */
    public DataKasusPHI() {
        initComponents();
        tampilkan_data();
        jTable_Display_Users.getTableHeader().setOpaque(true);
        jTable_Display_Users.setRowHeight(25);
        jTable_Display_Users.getTableHeader().setBackground(Color.blue);
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui=(BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
    }

    public void tampilkan_data(){
     DefaultTableModel model = new DefaultTableModel();
       
       model.addColumn("No.");
       model.addColumn("ID Klien");
       model.addColumn("Nama Kasus");
       model.addColumn("Tanggal Kasus");
       model.addColumn("Status Kasus");
    
       try{
           int no = 1;
           String sql = "Select * From data_kasus_phi";
           java.sql.Connection conn=(Connection)Konfig.configDB();
           java.sql.Statement stm = conn.createStatement();
           java.sql.ResultSet res = stm.executeQuery(sql);
           
           while (res.next()){
               model.addRow(new Object[]{no++,res.getString(1),res.getString(2),res.getString(3),res.getString(4)});
               
               jTable_Display_Users.setModel(model);
               
           }
       }catch(SQLException e){
           System.out.println("ERROR :" +e.getMessage());
           
       }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Display_Users = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        print1 = new javax.swing.JButton();
        back = new javax.swing.JButton();
        Reload1 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable_Display_Users.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable_Display_Users.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTable_Display_UsersFocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Display_Users);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 969, 335));

        jButton1.setBackground(new java.awt.Color(0, 0, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/plus.PNG"))); // NOI18N
        jButton1.setText("Tambahkan Data Kasus");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 100, 210, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Data Kasus PHI");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 250, 40));

        print1.setBackground(new java.awt.Color(0, 0, 255));
        print1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        print1.setForeground(new java.awt.Color(255, 255, 255));
        print1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/print4.PNG"))); // NOI18N
        print1.setText("Print");
        print1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                print1ActionPerformed(evt);
            }
        });
        jPanel1.add(print1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 100, 40));

        back.setBackground(new java.awt.Color(0, 0, 255));
        back.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.PNG"))); // NOI18N
        back.setText("Back To Menu");
        back.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 170, 40));

        Reload1.setBackground(new java.awt.Color(0, 0, 255));
        Reload1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Reload1.setForeground(new java.awt.Color(255, 255, 255));
        Reload1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/reload.PNG"))); // NOI18N
        Reload1.setText("Reload");
        Reload1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reload1ActionPerformed(evt);
            }
        });
        jPanel1.add(Reload1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 100, 40));

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        FormDataKasusPHI backpage = new FormDataKasusPHI();
        backpage.show();
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void print1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_print1ActionPerformed
        // TODO add your handling code here:
         try {
              File namafile = new File("src/report/report_data_kasus_phi.jasper");
        JasperPrint jp = JasperFillManager.fillReport(namafile.getPath(), null, koneksiprint.getConnection());
        JasperViewer.viewReport(jp, false);
        } catch(Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_print1ActionPerformed

    private void jTable_Display_UsersFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTable_Display_UsersFocusGained
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTable_Display_UsersFocusGained

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        MenuDataKasus Menu = new MenuDataKasus();
        Menu.setVisible(true);
        this.getDesktopPane().add(Menu);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void Reload1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reload1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)jTable_Display_Users.getModel();
        model.setRowCount(0);
        tampilkan_data();
    }//GEN-LAST:event_Reload1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Reload1;
    private javax.swing.JButton back;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Display_Users;
    private javax.swing.JButton print1;
    // End of variables declaration//GEN-END:variables
}
