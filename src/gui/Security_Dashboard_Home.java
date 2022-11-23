/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import tubespbo_autogatesystem.database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import java.time.LocalDateTime; 
import java.time.format.DateTimeFormatter; 
import java.text.SimpleDateFormat;  
import javax.swing.JOptionPane;


/**
 *
 * @author maula
 */
public class Security_Dashboard_Home extends javax.swing.JFrame {

    /**
     * Creates new form Security_Dashboard_Home
     */
    public Security_Dashboard_Home() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        panel_menu = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        panel_bydate = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panel_peoplewithmash = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        panel_logout = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        TabbedPane_Dashboard = new javax.swing.JTabbedPane();
        panel_homepage = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_data = new javax.swing.JTable();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        jLabel7 = new javax.swing.JLabel();
        kGradientPanel7 = new keeptoo.KGradientPanel();
        jLabel20 = new javax.swing.JLabel();
        panel_nomaskbydate = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabel_databydate = new javax.swing.JTable();
        kGradientPanel3 = new keeptoo.KGradientPanel();
        jLabel9 = new javax.swing.JLabel();
        datechooser = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        kGradientPanel4 = new keeptoo.KGradientPanel();
        jLabel15 = new javax.swing.JLabel();
        panel_withmask = new javax.swing.JPanel();
        tabel_data2 = new javax.swing.JScrollPane();
        tabel_datamask = new javax.swing.JTable();
        kGradientPanel5 = new keeptoo.KGradientPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        kGradientPanel6 = new keeptoo.KGradientPanel();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 255, 255));
        kGradientPanel1.setkGradientFocus(300);
        kGradientPanel1.setkStartColor(new java.awt.Color(255, 102, 204));

        panel_menu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_menu.setOpaque(false);
        panel_menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_menuMouseClicked(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/homepage.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NO MASK");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homepage(evt);
            }
        });

        javax.swing.GroupLayout panel_menuLayout = new javax.swing.GroupLayout(panel_menu);
        panel_menu.setLayout(panel_menuLayout);
        panel_menuLayout.setHorizontalGroup(
            panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_menuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_menuLayout.setVerticalGroup(
            panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_menuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        panel_bydate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_bydate.setOpaque(false);
        panel_bydate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_bydateMouseClicked(evt);
            }
        });

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/calendar.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("BY DATE");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2homepage(evt);
            }
        });

        javax.swing.GroupLayout panel_bydateLayout = new javax.swing.GroupLayout(panel_bydate);
        panel_bydate.setLayout(panel_bydateLayout);
        panel_bydateLayout.setHorizontalGroup(
            panel_bydateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_bydateLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_bydateLayout.setVerticalGroup(
            panel_bydateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_bydateLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_bydateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel10))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        panel_peoplewithmash.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_peoplewithmash.setOpaque(false);
        panel_peoplewithmash.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_peoplewithmashMouseClicked(evt);
            }
        });

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/data-user.png"))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("WITH MASK");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12homepage(evt);
            }
        });

        javax.swing.GroupLayout panel_peoplewithmashLayout = new javax.swing.GroupLayout(panel_peoplewithmash);
        panel_peoplewithmash.setLayout(panel_peoplewithmashLayout);
        panel_peoplewithmashLayout.setHorizontalGroup(
            panel_peoplewithmashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_peoplewithmashLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_peoplewithmashLayout.setVerticalGroup(
            panel_peoplewithmashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_peoplewithmashLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_peoplewithmashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        panel_logout.setOpaque(false);

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/logout.png"))); // NOI18N

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("LOG OUT");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14homepage(evt);
            }
        });

        javax.swing.GroupLayout panel_logoutLayout = new javax.swing.GroupLayout(panel_logout);
        panel_logout.setLayout(panel_logoutLayout);
        panel_logoutLayout.setHorizontalGroup(
            panel_logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_logoutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_logoutLayout.setVerticalGroup(
            panel_logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_logoutLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_bydate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel_menu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel_peoplewithmash, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel_logout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(167, Short.MAX_VALUE)
                .addComponent(panel_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_bydate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_peoplewithmash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95)
                .addComponent(panel_logout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 440));

        TabbedPane_Dashboard.setBackground(new java.awt.Color(255, 255, 255));

        panel_homepage.setBackground(new java.awt.Color(255, 255, 255));
        panel_homepage.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("MENU GET PEOPLE WITH NO MASK");
        panel_homepage.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, -1, 35));

        tabel_data.setBackground(new java.awt.Color(255, 204, 255));
        tabel_data.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tabel_data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "user_id", "namadepan", "namabelakang", "scan_id", "masker"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabel_data);

        panel_homepage.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 620, 310));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("GENERATE");
        jLabel7.setVerifyInputWhenFocusTarget(false);
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        panel_homepage.add(kGradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, 120, 30));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("CLEAR");
        jLabel20.setVerifyInputWhenFocusTarget(false);
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel7Layout = new javax.swing.GroupLayout(kGradientPanel7);
        kGradientPanel7.setLayout(kGradientPanel7Layout);
        kGradientPanel7Layout.setHorizontalGroup(
            kGradientPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel7Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel20)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        kGradientPanel7Layout.setVerticalGroup(
            kGradientPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        panel_homepage.add(kGradientPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, -1, -1));

        TabbedPane_Dashboard.addTab("tab1", panel_homepage);

        panel_nomaskbydate.setBackground(new java.awt.Color(255, 255, 255));
        panel_nomaskbydate.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("choose date ");
        panel_nomaskbydate.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, 35));

        tabel_databydate.setBackground(new java.awt.Color(255, 204, 255));
        tabel_databydate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tabel_databydate.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "user_id", "namadepan", "namabelakang", "scan_id", "masker", "login_at"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabel_databydate);

        panel_nomaskbydate.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 620, 310));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("GENERATE");
        jLabel9.setVerifyInputWhenFocusTarget(false);
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel3Layout = new javax.swing.GroupLayout(kGradientPanel3);
        kGradientPanel3.setLayout(kGradientPanel3Layout);
        kGradientPanel3Layout.setHorizontalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        kGradientPanel3Layout.setVerticalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        panel_nomaskbydate.add(kGradientPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, 120, 30));

        datechooser.setOpaque(false);
        panel_nomaskbydate.add(datechooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 190, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("MENU NOMASKBYDATE");
        panel_nomaskbydate.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 243, 35));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("CLEAR");
        jLabel15.setVerifyInputWhenFocusTarget(false);
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel4Layout = new javax.swing.GroupLayout(kGradientPanel4);
        kGradientPanel4.setLayout(kGradientPanel4Layout);
        kGradientPanel4Layout.setHorizontalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel15)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        kGradientPanel4Layout.setVerticalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        panel_nomaskbydate.add(kGradientPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, -1, -1));

        TabbedPane_Dashboard.addTab("tab2", panel_nomaskbydate);

        panel_withmask.setBackground(new java.awt.Color(255, 255, 255));
        panel_withmask.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabel_datamask.setBackground(new java.awt.Color(255, 204, 255));
        tabel_datamask.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tabel_datamask.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "user_id", "namadepan", "namabelakang", "scan_id", "masker", "login_at"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabel_data2.setViewportView(tabel_datamask);

        panel_withmask.add(tabel_data2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 620, 310));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("GENERATE");
        jLabel17.setVerifyInputWhenFocusTarget(false);
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel5Layout = new javax.swing.GroupLayout(kGradientPanel5);
        kGradientPanel5.setLayout(kGradientPanel5Layout);
        kGradientPanel5Layout.setHorizontalGroup(
            kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel5Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        kGradientPanel5Layout.setVerticalGroup(
            kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        panel_withmask.add(kGradientPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, 120, 30));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setText("MENU GET PEOPLE WITH MASK");
        panel_withmask.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 290, 35));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("CLEAR");
        jLabel19.setVerifyInputWhenFocusTarget(false);
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel6Layout = new javax.swing.GroupLayout(kGradientPanel6);
        kGradientPanel6.setLayout(kGradientPanel6Layout);
        kGradientPanel6Layout.setHorizontalGroup(
            kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel6Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel19)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        kGradientPanel6Layout.setVerticalGroup(
            kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        panel_withmask.add(kGradientPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, -1, -1));

        TabbedPane_Dashboard.addTab("tab3", panel_withmask);

        getContentPane().add(TabbedPane_Dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, -50, 660, 490));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void homepage(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homepage
        // TODO add your handling code here:
        TabbedPane_Dashboard.setSelectedIndex(0);
    }//GEN-LAST:event_homepage

    private void jLabel2homepage(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2homepage
        // TODO add your handling code here:
        TabbedPane_Dashboard.setSelectedIndex(1);
    }//GEN-LAST:event_jLabel2homepage

    private void jLabel12homepage(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12homepage
        // TODO add your handling code here:
        TabbedPane_Dashboard.setSelectedIndex(2);
    }//GEN-LAST:event_jLabel12homepage

    private void jLabel14homepage(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14homepage
        // TODO add your handling code here:
        String[] options = {"NO", "YES" };
        int x = JOptionPane.showOptionDialog(null, "Apakah anda yakin untuk keluar?", "Verifikasi Masker", JOptionPane.DEFAULT_OPTION,JOptionPane.WARNING_MESSAGE, null, options, options[0]);
        if ( x == 1){
            Login loginpage = new Login();
            loginpage.show();
            dispose();
        }    
    }//GEN-LAST:event_jLabel14homepage

    private void panel_menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_menuMouseClicked
        // TODO add your handling code here:
        TabbedPane_Dashboard.setSelectedIndex(0);
    }//GEN-LAST:event_panel_menuMouseClicked

    private void panel_bydateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_bydateMouseClicked
        // TODO add your handling code here:
        TabbedPane_Dashboard.setSelectedIndex(1);
    }//GEN-LAST:event_panel_bydateMouseClicked

    private void panel_peoplewithmashMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_peoplewithmashMouseClicked
        // TODO add your handling code here:
        TabbedPane_Dashboard.setSelectedIndex(2 );
    }//GEN-LAST:event_panel_peoplewithmashMouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        try {
            String querry_data = String.format("SELECT user.user_id, user.nama_depan, user.nama_belakang, alatverified.scan_id, alatverified.masker FROM user INNER JOIN alatverified ON user.user_id = alatverified.user_id WHERE masker = 0");
            Connection conn = database.getConnect();
            PreparedStatement get_data = conn.prepareStatement(querry_data);
            ResultSet hasil = get_data.executeQuery();
		            
            while(hasil.next()) {
                String user_id = String.valueOf(hasil.getInt("user_id"));
                String namadepan = hasil.getString("nama_depan");
                String namabelakang = hasil.getString("nama_belakang");
                String scan_id = String.valueOf(hasil.getInt("scan_id"));
                String masker = String.valueOf(hasil.getBoolean("masker"));
		            	
                String tbData[] = {user_id, namadepan, namabelakang, scan_id, masker};
                DefaultTableModel tblModel = (DefaultTableModel)tabel_data.getModel();
		            	
                tblModel.addRow(tbData);
            }
            JOptionPane.showMessageDialog(null, "Berhasil mengambil data!");
		    
	} catch (Exception es) {
	System.out.println(es);
	}
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String tanggal = sdf.format(datechooser.getDate());
        try {
            String querry_data = String.format("SELECT user.user_id, user.nama_depan, user.nama_belakang, alatverified.scan_id, alatverified.masker, alatverified.login_at FROM user INNER JOIN alatverified ON user.user_id = alatverified.user_id WHERE masker = 0 and login_at > '%s' and login_at < '%s 23:59:59' ", tanggal, tanggal);
            Connection conn = database.getConnect();
            PreparedStatement get_data = conn.prepareStatement(querry_data);
            ResultSet hasil = get_data.executeQuery();

            while(hasil.next()){
                String user_id = String.valueOf(hasil.getInt("user_id"));
                String namadepan = hasil.getString("nama_depan");
                String namabelakang = hasil.getString("nama_belakang");
                String scan_id = String.valueOf(hasil.getInt("scan_id"));
                String masker = String.valueOf(hasil.getBoolean("masker"));
//		String login_at = String.valueOf(hasil.getDate("login_at"));
                String login_at = hasil.getString("login_at");
                
                String tbData[] = {user_id, namadepan, namabelakang, scan_id, masker, login_at};
                DefaultTableModel tblModel = (DefaultTableModel)tabel_databydate.getModel();
		            	
                tblModel.addRow(tbData);
            }
            JOptionPane.showMessageDialog(null, "Berhasil mengambil data!");


        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        // TODO add your handling code here:
        DefaultTableModel tblModel = (DefaultTableModel)tabel_databydate.getModel();
        while(tblModel.getRowCount() > 0){
            tblModel.removeRow(0);
        }
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        // TODO add your handling code here:
        try {
            String querry_data = "SELECT user.user_id, user.nama_depan, user.nama_belakang, alatverified.scan_id, alatverified.masker, alatverified.login_at FROM user INNER JOIN alatverified ON user.user_id = alatverified.user_id WHERE masker = 1";
            Connection conn = database.getConnect();
            PreparedStatement get_data = conn.prepareStatement(querry_data);
            ResultSet hasil = get_data.executeQuery();

            while(hasil.next()){
                String user_id = String.valueOf(hasil.getInt("user_id"));
                String namadepan = hasil.getString("nama_depan");
                String namabelakang = hasil.getString("nama_belakang");
                String scan_id = String.valueOf(hasil.getInt("scan_id"));
                String masker = String.valueOf(hasil.getBoolean("masker"));
//		String login_at = String.valueOf(hasil.getDate("login_at"));
                String login_at = hasil.getString("login_at");
                
                String tbData[] = {user_id, namadepan, namabelakang, scan_id, masker, login_at};
                DefaultTableModel tblModel = (DefaultTableModel)tabel_datamask.getModel();
		            	
                tblModel.addRow(tbData);
            }
            JOptionPane.showMessageDialog(null, "Berhasil mengambil data!");


        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        // TODO add your handling code here:
        DefaultTableModel tblModel = (DefaultTableModel)tabel_datamask.getModel();
        while(tblModel.getRowCount() > 0){
            tblModel.removeRow(0);
        }
        JOptionPane.showMessageDialog(null, "Berhasil hapus tabel!");

    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        // TODO add your handling code here:
        DefaultTableModel tblModel = (DefaultTableModel)tabel_data.getModel();
        while(tblModel.getRowCount() > 0){
            tblModel.removeRow(0);
        }
        JOptionPane.showMessageDialog(null, "Berhasil hapus tabel!");
    }//GEN-LAST:event_jLabel20MouseClicked

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
            java.util.logging.Logger.getLogger(Security_Dashboard_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Security_Dashboard_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Security_Dashboard_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Security_Dashboard_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Security_Dashboard_Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane TabbedPane_Dashboard;
    private com.toedter.calendar.JDateChooser datechooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private keeptoo.KGradientPanel kGradientPanel3;
    private keeptoo.KGradientPanel kGradientPanel4;
    private keeptoo.KGradientPanel kGradientPanel5;
    private keeptoo.KGradientPanel kGradientPanel6;
    private keeptoo.KGradientPanel kGradientPanel7;
    private javax.swing.JPanel panel_bydate;
    private javax.swing.JPanel panel_homepage;
    private javax.swing.JPanel panel_logout;
    private javax.swing.JPanel panel_menu;
    private javax.swing.JPanel panel_nomaskbydate;
    private javax.swing.JPanel panel_peoplewithmash;
    private javax.swing.JPanel panel_withmask;
    private javax.swing.JTable tabel_data;
    private javax.swing.JScrollPane tabel_data2;
    private javax.swing.JTable tabel_databydate;
    private javax.swing.JTable tabel_datamask;
    // End of variables declaration//GEN-END:variables
}
