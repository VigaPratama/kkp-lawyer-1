/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Lawyer;
import java.awt.Color;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Me
 */

public class MainPage extends javax.swing.JFrame {

    /**
     * Creates new form MainPage
     */
    static String a,b,c;
    Color DefaultColor,ClickedColor,Defaultlabelcolor,Clickedlabelcolor;
    
    public MainPage() {
        initComponents();
        connect();
        dataklien();
        datakasus();
        alldata();
        DefaultColor = new Color(51,51,51); 
        ClickedColor = new Color (255,255,255);
        Defaultlabelcolor = new Color(255,255,255);
        Clickedlabelcolor = new Color(0,0,0);
        mainpagebtn.setBackground(DefaultColor);
        pesertabtn.setBackground(DefaultColor);
        pendampingbtn.setBackground(DefaultColor);
        
        Menu1.setBackground(DefaultColor);
        Menu2.setBackground(DefaultColor);
        
         
         logout.setBackground(DefaultColor);
         label1.setForeground(Defaultlabelcolor);
         label2.setForeground(Defaultlabelcolor);
         label3.setForeground(Defaultlabelcolor);
         
         label_menu_1.setForeground(Defaultlabelcolor);
         label_menu_2.setForeground(Defaultlabelcolor);
         
         label6.setForeground(Defaultlabelcolor);
        ActionListener ac1=new ActionListener(){
           @Override public void actionPerformed(ActionEvent e){
             a=lb1MovingText.getText();
             b=a.substring(0, 1);
             c=a.substring(1, a.length());
             lb1MovingText.setText(c+b);
           }
        }; new javax.swing.Timer(400, ac1).start();
    }

    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    
    public void dataklien()
    {
        try
        {  
             pst = con.prepareStatement("SELECT COUNT(*) AS data_klienCount FROM data_klien");
             ResultSet rs = pst.executeQuery();
             while(rs.next())
             {
              int count = rs.getInt("data_klienCount");
              //  int count = rs.getInt(1);
 
                
                txtjumlahklienumum.setText(String.valueOf(count));
             }
        }
           catch (SQLException ex)
          {
            ex.printStackTrace();
           }
    }
    
    public void datakasus()
    {
        try
        {  
             pst = con.prepareStatement("SELECT COUNT(*) AS data_klien_retainerCount FROM data_klien_retainer");
             ResultSet rs = pst.executeQuery();
             while(rs.next())
             {
              int count = rs.getInt("data_klien_retainerCount");
              //  int count = rs.getInt(1);
 
                
                txtjumlahklienretainer.setText(String.valueOf(count));
             }
        }
           catch (SQLException ex)
          {
            ex.printStackTrace();
           }
    }
    
    public void alldata()
    {
        try
        {  
             pst = con.prepareStatement("SELECT (SELECT COUNT(*) FROM data_klien) + (SELECT COUNT(*) FROM data_klien_retainer) AS total_count;");
             ResultSet rs = pst.executeQuery();
             while(rs.next())
             {
              int count = rs.getInt("total_count");
              //  int count = rs.getInt(1);
 
                
                txtallklien.setText(String.valueOf(count));
             }
        }
           catch (SQLException ex)
          {
            ex.printStackTrace();
           }
    }
    
             public void connect(){
             
                 try{
                    Class.forName("com.mysql.jdbc.Driver");
                    con = DriverManager.getConnection("jdbc:mysql://localhost/lawyer", "root","");
                    
                 }catch(ClassNotFoundException ex){
                    ex.printStackTrace();
                 }catch(SQLException ex){
                    ex.printStackTrace();
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

        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lb1MovingText = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        mainpagebtn = new javax.swing.JPanel();
        label1 = new javax.swing.JLabel();
        pesertabtn = new javax.swing.JPanel();
        label2 = new javax.swing.JLabel();
        pendampingbtn = new javax.swing.JPanel();
        label3 = new javax.swing.JLabel();
        logout = new javax.swing.JPanel();
        label6 = new javax.swing.JLabel();
        Menu1 = new javax.swing.JPanel();
        label_menu_1 = new javax.swing.JLabel();
        Menu2 = new javax.swing.JPanel();
        label_menu_2 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtallklien = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtjumlahklienumum = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtjumlahklienretainer = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                WindowOpen(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 37, -1, 505));

        lb1MovingText.setBackground(new java.awt.Color(204, 204, 204));
        lb1MovingText.setFont(new java.awt.Font("BIZ UDMincho Medium", 1, 18)); // NOI18N
        lb1MovingText.setForeground(new java.awt.Color(255, 255, 255));
        lb1MovingText.setText("                                                                                            Selamat Datang Di Sistem Informasi Perkara Hukum Perdata Pada Kantor Hukum AZP dan Associate");
        jPanel1.add(lb1MovingText, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 5, 1350, 30));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setPreferredSize(new java.awt.Dimension(500, 513));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 365, 125, -1));

        mainpagebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mainpagebtnMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mainpagebtnMousePressed(evt);
            }
        });
        mainpagebtn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mainpagebtnKeyPressed(evt);
            }
        });
        mainpagebtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Mainpagelogo3.jpg"))); // NOI18N
        label1.setText("  Dashboard");
        mainpagebtn.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 210, 50));

        jPanel3.add(mainpagebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, -1));

        pesertabtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pesertabtnMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pesertabtnMousePressed(evt);
            }
        });

        label2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/data-icon4.png"))); // NOI18N
        label2.setText("  Data Klien");

        javax.swing.GroupLayout pesertabtnLayout = new javax.swing.GroupLayout(pesertabtn);
        pesertabtn.setLayout(pesertabtnLayout);
        pesertabtnLayout.setHorizontalGroup(
            pesertabtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pesertabtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))
        );
        pesertabtnLayout.setVerticalGroup(
            pesertabtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel3.add(pesertabtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 230, 50));

        pendampingbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pendampingbtnMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pendampingbtnMousePressed(evt);
            }
        });

        label3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/asdf-removebg-preview2.png"))); // NOI18N
        label3.setText("  Data Kasus");

        javax.swing.GroupLayout pendampingbtnLayout = new javax.swing.GroupLayout(pendampingbtn);
        pendampingbtn.setLayout(pendampingbtnLayout);
        pendampingbtnLayout.setHorizontalGroup(
            pendampingbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pendampingbtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        pendampingbtnLayout.setVerticalGroup(
            pendampingbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label3, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel3.add(pendampingbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 230, 50));

        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                logoutMousePressed(evt);
            }
        });

        label6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logoutlogo.png"))); // NOI18N
        label6.setText("  Log Out");

        javax.swing.GroupLayout logoutLayout = new javax.swing.GroupLayout(logout);
        logout.setLayout(logoutLayout);
        logoutLayout.setHorizontalGroup(
            logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        logoutLayout.setVerticalGroup(
            logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 240, 50));

        Menu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Menu1MousePressed(evt);
            }
        });

        label_menu_1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label_menu_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Untitled-removebg-white5.png"))); // NOI18N
        label_menu_1.setText("   Berkas Surat ");

        javax.swing.GroupLayout Menu1Layout = new javax.swing.GroupLayout(Menu1);
        Menu1.setLayout(Menu1Layout);
        Menu1Layout.setHorizontalGroup(
            Menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Menu1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_menu_1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        Menu1Layout.setVerticalGroup(
            Menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_menu_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.add(Menu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 240, 50));

        Menu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu2MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Menu2MousePressed(evt);
            }
        });

        label_menu_2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label_menu_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/data-icon4.png"))); // NOI18N
        label_menu_2.setText("  Data Lawyer & Partner");

        javax.swing.GroupLayout Menu2Layout = new javax.swing.GroupLayout(Menu2);
        Menu2.setLayout(Menu2Layout);
        Menu2Layout.setHorizontalGroup(
            Menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Menu2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_menu_2, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                .addContainerGap())
        );
        Menu2Layout.setVerticalGroup(
            Menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_menu_2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel3.add(Menu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 240, 50));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 230, 560));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(51, 102, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Viga Pratama\\Downloads\\group_FILL0_wght400_GRAD0_opsz48.png")); // NOI18N
        jLabel3.setText("Jumlah Klien");
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 180, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Mengolah Data Kasus Perdata");
        jPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 200, 30));

        txtallklien.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        txtallklien.setForeground(new java.awt.Color(255, 255, 255));
        jPanel6.add(txtallklien, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 70, 70));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Jumlah Klien Umum");
        jPanel8.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 170, 30));

        txtjumlahklienumum.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jPanel8.add(txtjumlahklienumum, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 70, 70));

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel7MouseClicked(evt);
            }
        });
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Info Lebih Lanjut");
        jPanel7.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 30));

        jPanel8.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 360, 30));

        jPanel6.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, 120));

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel15.setBackground(new java.awt.Color(204, 204, 204));
        jPanel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel15MouseClicked(evt);
            }
        });
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Info Lebih Lanjut");
        jPanel15.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 30));

        jPanel14.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 360, 30));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setText("Jumlah Klien Retainer");
        jPanel14.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 170, 30));

        txtjumlahklienretainer.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jPanel14.add(txtjumlahklienretainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 70, 70));

        jPanel6.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, -1, -1));

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 1080, 310));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Dashboard");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 170, 30));

        jDesktopPane1.setLayer(jPanel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 1140, 560));

        jPanel5.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1370, 600));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo advokat 2.png"))); // NOI18N
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 170, 100));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void WindowOpen(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_WindowOpen
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_WindowOpen

    private void mainpagebtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainpagebtnMousePressed
        // TODO add your handling code here:
         mainpagebtn.setBackground(ClickedColor);
         pesertabtn.setBackground(DefaultColor);
         pendampingbtn.setBackground(DefaultColor);
         
         logout.setBackground(DefaultColor);
         Menu1.setBackground(DefaultColor);
         Menu2.setBackground(DefaultColor);
         
         label1.setForeground(Clickedlabelcolor);
         label2.setForeground(Defaultlabelcolor);
         label3.setForeground(Defaultlabelcolor);
        
         label_menu_1.setForeground(Defaultlabelcolor);
         label_menu_2.setForeground(Defaultlabelcolor);
         
         label6.setForeground(Defaultlabelcolor);
    }//GEN-LAST:event_mainpagebtnMousePressed

    private void pesertabtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pesertabtnMousePressed
        // TODO add your handling code here:
         mainpagebtn.setBackground(DefaultColor);
         pesertabtn.setBackground(ClickedColor);
         pendampingbtn.setBackground(DefaultColor);
         
         Menu1.setBackground(DefaultColor);
         Menu2.setBackground(DefaultColor);
         
         logout.setBackground(DefaultColor);
         label1.setForeground(Defaultlabelcolor);
         label2.setForeground(Clickedlabelcolor);
         label3.setForeground(Defaultlabelcolor);
         
         label_menu_1.setForeground(Defaultlabelcolor);
         label_menu_2.setForeground(Defaultlabelcolor);
         
         label6.setForeground(Defaultlabelcolor);
    }//GEN-LAST:event_pesertabtnMousePressed

    private void pendampingbtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pendampingbtnMousePressed
        // TODO add your handling code here:
         mainpagebtn.setBackground(DefaultColor);
         pesertabtn.setBackground(DefaultColor);
         pendampingbtn.setBackground(ClickedColor);
         
         Menu1.setBackground(DefaultColor);
         Menu2.setBackground(DefaultColor);
         
         logout.setBackground(DefaultColor);
         label1.setForeground(Defaultlabelcolor);
         label2.setForeground(Defaultlabelcolor);
         label3.setForeground(Clickedlabelcolor);
         
         label_menu_1.setForeground(Defaultlabelcolor);
         label_menu_2.setForeground(Defaultlabelcolor);
         
         label6.setForeground(Defaultlabelcolor);
    }//GEN-LAST:event_pendampingbtnMousePressed

    private void logoutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMousePressed
        // TODO add your handling code here:
         mainpagebtn.setBackground(DefaultColor);
         pesertabtn.setBackground(DefaultColor);
         pendampingbtn.setBackground(DefaultColor);
         
         Menu1.setBackground(DefaultColor);
         Menu2.setBackground(DefaultColor);
         
         logout.setBackground(ClickedColor);
         label1.setForeground(Defaultlabelcolor);
         label2.setForeground(Defaultlabelcolor);
         label3.setForeground(Defaultlabelcolor);
        
         label_menu_1.setForeground(Defaultlabelcolor);
         label_menu_2.setForeground(Defaultlabelcolor);
         
         label6.setForeground(Clickedlabelcolor);
    }//GEN-LAST:event_logoutMousePressed

    private void mainpagebtnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mainpagebtnKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_mainpagebtnKeyPressed

    private void mainpagebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainpagebtnMouseClicked
        // TODO add your handling code here:
        Dashboard Menu = new Dashboard();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(Menu).setVisible(true);
    }//GEN-LAST:event_mainpagebtnMouseClicked

    private void pesertabtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pesertabtnMouseClicked
        // TODO add your handling code here:
        MenuDataKlien Menu = new MenuDataKlien();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(Menu).setVisible(true);
    }//GEN-LAST:event_pesertabtnMouseClicked

    private void pendampingbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pendampingbtnMouseClicked
        // TODO add your handling code here:
          MenuDataKasus Menu = new MenuDataKasus();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(Menu).setVisible(true);
    }//GEN-LAST:event_pendampingbtnMouseClicked

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new LoginForm(null,true).setVisible(true);
    }//GEN-LAST:event_logoutMouseClicked

    private void Menu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu1MouseClicked
        // TODO add your handling code here:
        MenuBerkasSurat Menu = new MenuBerkasSurat();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(Menu).setVisible(true);
    }//GEN-LAST:event_Menu1MouseClicked

    private void Menu1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu1MousePressed
        // TODO add your handling code here:
        mainpagebtn.setBackground(DefaultColor);
         pesertabtn.setBackground(DefaultColor);
         pendampingbtn.setBackground(DefaultColor);
         
         Menu1.setBackground(ClickedColor);
         Menu2.setBackground(DefaultColor);
         
         logout.setBackground(DefaultColor);
         label1.setForeground(Defaultlabelcolor);
         label2.setForeground(Defaultlabelcolor);
         label3.setForeground(Defaultlabelcolor);
         
         label_menu_1.setForeground(Clickedlabelcolor);
         label_menu_2.setForeground(Defaultlabelcolor);
         
         label6.setForeground(Defaultlabelcolor);
    }//GEN-LAST:event_Menu1MousePressed

    private void Menu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu2MouseClicked
        // TODO add your handling code here:
        Data_Lawyer_Dan_Partner Menu = new Data_Lawyer_Dan_Partner();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(Menu).setVisible(true);
    }//GEN-LAST:event_Menu2MouseClicked

    private void Menu2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu2MousePressed
        // TODO add your handling code here:
         mainpagebtn.setBackground(DefaultColor);
         pesertabtn.setBackground(DefaultColor);
         pendampingbtn.setBackground(DefaultColor);
        
         Menu1.setBackground(DefaultColor);
         Menu2.setBackground(ClickedColor);
         
         logout.setBackground(DefaultColor);
         label1.setForeground(Defaultlabelcolor);
         label2.setForeground(Defaultlabelcolor);
         label3.setForeground(Defaultlabelcolor);
         
         label_menu_1.setForeground(Defaultlabelcolor);
         label_menu_2.setForeground(Clickedlabelcolor);
         
         label6.setForeground(Defaultlabelcolor);
    }//GEN-LAST:event_Menu2MousePressed

    private void jPanel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel15MouseClicked
        // TODO add your handling code here:
        DataKlienRetainer Menu = new DataKlienRetainer();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(Menu).setVisible(true);
    }//GEN-LAST:event_jPanel15MouseClicked

    private void jPanel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseClicked
        // TODO add your handling code here:
        DataKlienUmum Menu = new DataKlienUmum();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(Menu).setVisible(true);
    }//GEN-LAST:event_jPanel7MouseClicked

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
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
       
java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Menu1;
    private javax.swing.JPanel Menu2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label6;
    private javax.swing.JLabel label_menu_1;
    private javax.swing.JLabel label_menu_2;
    private javax.swing.JLabel lb1MovingText;
    private javax.swing.JPanel logout;
    private javax.swing.JPanel mainpagebtn;
    private javax.swing.JPanel pendampingbtn;
    private javax.swing.JPanel pesertabtn;
    private javax.swing.JLabel txtallklien;
    private javax.swing.JLabel txtjumlahklienretainer;
    private javax.swing.JLabel txtjumlahklienumum;
    // End of variables declaration//GEN-END:variables
}