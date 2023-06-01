/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Lawyer;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksi.Konfig;
import koneksi.koneksi;

import static Lawyer.MainPage.a;
import static Lawyer.MainPage.b;
import static Lawyer.MainPage.c;
/**
 *
 * @author Me
 */
public class FormDataKlienUmum extends javax.swing.JFrame {
    
    
    /**
     * Creates new form DataPKH
     */
    public FormDataKlienUmum() {
        initComponents();
        id_data();
        ActionListener ac1=new ActionListener(){
           @Override public void actionPerformed(ActionEvent e){
             a=lb1MovingText.getText();
             b=a.substring(0, 1);
             c=a.substring(1, a.length());
             lb1MovingText.setText(c+b);
           }
        }; new javax.swing.Timer(400, ac1).start();
    }
    
        private void id_data(){
        try{
        Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost:3306/lawyer","root","");
        Statement stat = koneksi.createStatement();
        ResultSet rs = stat.executeQuery("select * from data_klien order by ID_Klien desc");
        if(rs.next()){
            String idd = rs.getString("ID_Klien").substring(1);
            String AN = "" + (Integer.parseInt(idd)+1);
            String Nol = "";
            
            if (AN.length()==1){Nol = "000";}
            else if (AN.length()==2){Nol = "00";}
            else if (AN.length()==3){Nol = "0";}
            else if (AN.length()==4){Nol = "";}
            
            txt_id_klien.setText("A" + Nol + AN);
        
        }else{
            txt_id_klien.setText("A0001");
        }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    protected void kosong(){
        txt_nama_klien.setText(null);
        Tempat_L.setText(null);
        Tanggal_L.setDate(null);
        jk.setSelectedIndex(0);
        pekerjaan.setText(null);
        Alamat.setText(null);
        Tanggal_D.setDate(null);
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
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        txt_nama_klien = new javax.swing.JTextField();
        Tempat_L = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pekerjaan = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        bdelete = new javax.swing.JButton();
        bsave = new javax.swing.JButton();
        bcancel = new javax.swing.JButton();
        bedit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_id_klien = new javax.swing.JTextField();
        Alamat = new javax.swing.JTextField();
        Tanggal_L = new com.toedter.calendar.JDateChooser();
        Tanggal_D = new com.toedter.calendar.JDateChooser();
        jk = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        lb1MovingText = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                jPanel1MouseWheelMoved(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(153, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_nama_klien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nama_klienActionPerformed(evt);
            }
        });
        jPanel4.add(txt_nama_klien, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 193, -1));

        Tempat_L.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tempat_LActionPerformed(evt);
            }
        });
        jPanel4.add(Tempat_L, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 193, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nama Klien");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tempat Lahir");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tanggal Lahir");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, -1, -1));
        jPanel4.add(pekerjaan, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 190, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Alamat");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Pekerjaan");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Jenis Kelamin");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, -1, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Tanggal Daftar");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, -1, -1));

        bdelete.setBackground(new java.awt.Color(255, 0, 0));
        bdelete.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bdelete.setForeground(new java.awt.Color(255, 255, 255));
        bdelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete.PNG"))); // NOI18N
        bdelete.setText("DELETE");
        bdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdeleteActionPerformed(evt);
            }
        });
        jPanel4.add(bdelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 230, 120, 40));

        bsave.setBackground(new java.awt.Color(0, 0, 255));
        bsave.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bsave.setForeground(new java.awt.Color(255, 255, 255));
        bsave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/save.PNG"))); // NOI18N
        bsave.setText("SAVE");
        bsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsaveActionPerformed(evt);
            }
        });
        jPanel4.add(bsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, 120, -1));

        bcancel.setBackground(new java.awt.Color(0, 153, 0));
        bcancel.setForeground(new java.awt.Color(255, 255, 255));
        bcancel.setText("Kembali ke Halaman Sebelumnya");
        bcancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcancelActionPerformed(evt);
            }
        });
        jPanel4.add(bcancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 300, 220, -1));

        bedit.setBackground(new java.awt.Color(255, 153, 0));
        bedit.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bedit.setForeground(new java.awt.Color(255, 255, 255));
        bedit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/edit.PNG"))); // NOI18N
        bedit.setText("EDIT");
        bedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beditActionPerformed(evt);
            }
        });
        jPanel4.add(bedit, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 170, 120, -1));

        jLabel1.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Masukkan Data Klien Umum");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 320, -1));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("ID Klien");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));

        txt_id_klien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_id_klienActionPerformed(evt);
            }
        });
        jPanel4.add(txt_id_klien, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 190, -1));

        Alamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlamatActionPerformed(evt);
            }
        });
        jPanel4.add(Alamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 190, -1));
        jPanel4.add(Tanggal_L, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 190, -1));
        jPanel4.add(Tanggal_D, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, 190, -1));

        jk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- SELECT --", "Laki-Laki", "Perempuan" }));
        jPanel4.add(jk, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 170, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Hukum-1.jpg"))); // NOI18N
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 460));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 460));

        lb1MovingText.setBackground(new java.awt.Color(0, 0, 0));
        lb1MovingText.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        lb1MovingText.setForeground(new java.awt.Color(255, 255, 255));
        lb1MovingText.setText("                                                                                                                             Form Data Klien Umum");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb1MovingText, javax.swing.GroupLayout.PREFERRED_SIZE, 826, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lb1MovingText, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, -1, 890, 520));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 99));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 520));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jPanel1MouseWheelMoved
        // TODO add your handling code here

    }//GEN-LAST:event_jPanel1MouseWheelMoved

    private void AlamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AlamatActionPerformed

    private void txt_id_klienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_id_klienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_id_klienActionPerformed

    private void beditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beditActionPerformed
        // TODO add your handling code here:
        String tampilan ="yyyy-MM-dd";
        SimpleDateFormat fm = new SimpleDateFormat(tampilan);
        String tanggal_l = String.valueOf(fm.format(Tanggal_L.getDate()));
        String tanggal_d = String.valueOf(fm.format(Tanggal_D.getDate()));
        
        try{
            String sql = "update data_klien set Nama_Klien='"+txt_nama_klien.getText()+"', Tempat_Lahir='"+Tempat_L.getText()+"', Tanggal_Lahir='"+tanggal_l+"', Jenis_Kelamin='"+jk.getSelectedItem()+"', Pekerjaan='"+pekerjaan.getText()+"', Alamat='"+Alamat.getText()+"', Tanggal_Daftar='"+tanggal_d+"' where ID_Klien='"+txt_id_klien.getText()+"'";   
            java.sql.Connection con = (Connection)Konfig.configDB();
            java.sql.PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Edit Data Berhasil");
            kosong();
            id_data();
            
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, "Edit Data Gagal");
            
        }
                
    }//GEN-LAST:event_beditActionPerformed

    private void bcancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcancelActionPerformed
        // TODO add your handling code here:
        DataKlienUmum dppkh = new DataKlienUmum();
        dppkh.show();

        dispose();
    }//GEN-LAST:event_bcancelActionPerformed

    private void bsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsaveActionPerformed
        // TODO add your handling code here:
        String tampilan ="yyyy-MM-dd";
        SimpleDateFormat fm = new SimpleDateFormat(tampilan);
        String tanggal_l = String.valueOf(fm.format(Tanggal_L.getDate()));
        String tanggal_d = String.valueOf(fm.format(Tanggal_D.getDate()));
        
        try{
            String sql = "INSERT INTO data_klien VALUES ('"+txt_id_klien.getText()+"','"+txt_nama_klien.getText()+"','"+Tempat_L.getText()+"','"+tanggal_l+"','"+jk.getSelectedItem()+"', '"+pekerjaan.getText()+"','"+Alamat.getText()+"','"+tanggal_d+"')";
            java.sql.Connection con = (Connection)Konfig.configDB();
            java.sql.PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Simpan Data Berhasil");
            kosong();
            id_data();
            
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, "Simpan Data Gagal");
            
        }
       

    }//GEN-LAST:event_bsaveActionPerformed

    private void bdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdeleteActionPerformed
        // TODO add your handling code here:
        
        try{
            String sql = "DELETE FROM data_klien WHERE ID_Klien ='"+txt_id_klien.getText()+"'";
            java.sql.Connection conn = (Connection)Konfig.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Hapus Data Berhasil");
            kosong();
            id_data();
            
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
            
        }
        
    }//GEN-LAST:event_bdeleteActionPerformed

    private void Tempat_LActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tempat_LActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tempat_LActionPerformed

    private void txt_nama_klienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nama_klienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nama_klienActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormDataKlienUmum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormDataKlienUmum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormDataKlienUmum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormDataKlienUmum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormDataKlienUmum().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Alamat;
    private com.toedter.calendar.JDateChooser Tanggal_D;
    private com.toedter.calendar.JDateChooser Tanggal_L;
    private javax.swing.JTextField Tempat_L;
    private javax.swing.JButton bcancel;
    private javax.swing.JButton bdelete;
    private javax.swing.JButton bedit;
    private javax.swing.JButton bsave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JComboBox<String> jk;
    private javax.swing.JLabel lb1MovingText;
    private javax.swing.JTextField pekerjaan;
    private javax.swing.JTextField txt_id_klien;
    private javax.swing.JTextField txt_nama_klien;
    // End of variables declaration//GEN-END:variables
}
