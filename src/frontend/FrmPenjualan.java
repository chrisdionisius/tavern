/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

import javax.swing.JOptionPane;
import backend.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.JTableHeader;

public class FrmPenjualan extends javax.swing.JFrame {
    /**
     * Creates new form FrmPenjualan
     */
    Date date = new Date();
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
    SimpleDateFormat waktu = new SimpleDateFormat("yyMMddHHmmss");
            
    public FrmPenjualan() {
        initComponents();
        inisialisasi();
        tampilCmbKategori();
        Toolkit tk = getToolkit();
        Dimension size = tk.getScreenSize();
        setLocation(size.width/2-getWidth()/2, size.width/5-getHeight()/5);
        
        //Color c = new Color(255, 255, 255);
        this.setBackground(new Color(0,0,0,0));
        jPanel1.setBackground(new Color(0,0,0,0));
        txtCari.setBackground(new Color(0,0,0,0));
        
        jScrollPane1.getViewport().setBackground(new Color(0,0,0,0));
        tblMenu.setBackground(new Color(0,0,0,0));
        jScrollPane1.setViewportBorder(null);
        JTableHeader header = tblMenu.getTableHeader();
        header.setBackground(new Color(0,0,0,0));
        header.setForeground(new Color(255,255,255));
        header.setFont(new Font("Berlin Sans FB", Font.PLAIN, 18));
        tblMenu.setShowHorizontalLines(true);
        tblMenu.setGridColor(new Color(255,255,255));
        
        jScrollPane2.getViewport().setBackground(new Color(0,0,0,0));
        tblPenjualan.setBackground(new Color(0,0,0,0));
        jScrollPane2.setViewportBorder(null);
        JTableHeader header2 = tblPenjualan.getTableHeader();
        header2.setBackground(new Color(0,0,0,0));
        header2.setForeground(new Color(255,255,255));
        header2.setFont(new Font("Berlin Sans FB", Font.PLAIN, 18));
        tblPenjualan.setShowHorizontalLines(true);
        tblPenjualan.setGridColor(new Color(255,255,255));
        
        cmbKategori.setBackground(new Color(255,255,255));
        cmbKategori.setForeground(new Color(255,255,255));
//        this.getContentPane().setBackground(new Color(51, 51, 44));
    }
    
    public void inisialisasi(){
        Date dt = new Date();    
        System.out.println("tes");
        labelId.setText("TVN"+waktu.format(dt));
        tampilkanData();
        tampilkanPesanan();
        labelTotal.setText("0");
        labelQty.setText("0");
        Penjualan penjualan = new Penjualan();
        penjualan.setId(labelId.getText());
        penjualan.setTglPenjualan(formatter.format(date));
        penjualan.setTotalHarga(Integer.parseInt(labelTotal.getText()));
        penjualan.setTotalQty(Integer.parseInt(labelQty.getText()));
        penjualan.save();
        
    }
    public void tampilkanPesanan(){
        String[] kolom = {"ID","Menu", "QTY", "Harga"};
        ArrayList<DetailPenjualan> list = new DetailPenjualan().getAllby(labelId.getText());
        Object rowData[] = new Object[4];

        tblPenjualan.setModel(new DefaultTableModel(new Object[][]{}, kolom));

        for (DetailPenjualan detail : list) {
            rowData[0] = detail.getIds();
            rowData[1] = detail.getMenu().getNama();
            rowData[2] = detail.getQty();
            rowData[3] = detail.getHarga();

            ((DefaultTableModel) tblPenjualan.getModel()).addRow(rowData);
        }
    }
    
    public void tampilkanData() {
        String[] kolom = {"ID", "Nama Menu", "Jenis", "Harga"};
        ArrayList<Menu> list = new Menu().getAll();
        Object rowData[] = new Object[5];

        tblMenu.setModel(new DefaultTableModel(new Object[][]{}, kolom));

        for (Menu menu : list) {
            rowData[0] = menu.getId();
            rowData[1] = menu.getNama();
            rowData[2] = menu.getKategori().getNama();
            rowData[3] = (menu.getRcost()+menu.getScost());

            ((DefaultTableModel) tblMenu.getModel()).addRow(rowData);
        }
    }
    
    public void tampilCmbKategori() {
        cmbKategori.setModel(new DefaultComboBoxModel(new Kategori().getAll().toArray()));
    }
    
    public void cari(String keyword) {
        String[] kolom = {"ID", "Nama Menu", "Jenis", "Harga"};
        ArrayList<Menu> list = new Menu().search(keyword);
        Object rowData[] = new Object[5];

        tblMenu.setModel(new DefaultTableModel(new Object[][]{}, kolom));

        for (Menu menu : list) {
            rowData[0] = menu.getId();
            rowData[1] = menu.getNama();
            rowData[2] = menu.getKategori().getNama();
            rowData[3] = (menu.getRcost()+menu.getScost());

            ((DefaultTableModel) tblMenu.getModel()).addRow(rowData);
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

        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labelId = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labelTotal = new javax.swing.JLabel();
        labelQty = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmbKategori = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPenjualan = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMenu = new javax.swing.JTable();
        btnMenu = new javax.swing.JLabel();
        btnKategori = new javax.swing.JLabel();
        btnPenjualan = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCari = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        btnCari = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Form Penjualan");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(800, 620));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("No Nota");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 70, -1));

        labelId.setBackground(new java.awt.Color(255, 255, 255));
        labelId.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        labelId.setForeground(new java.awt.Color(255, 255, 255));
        labelId.setText("0");
        jPanel1.add(labelId, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 160, 17));

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Total");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 64, -1));

        labelTotal.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        labelTotal.setForeground(new java.awt.Color(255, 255, 255));
        labelTotal.setText("0");
        jPanel1.add(labelTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 70, -1));

        labelQty.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        labelQty.setForeground(new java.awt.Color(255, 255, 255));
        labelQty.setText("0");
        jPanel1.add(labelQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 70, -1));

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Qty");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 64, -1));

        cmbKategori.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        cmbKategori.setForeground(new java.awt.Color(255, 255, 255));
        cmbKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbKategori.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmbKategori.setOpaque(false);
        cmbKategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbKategoriActionPerformed(evt);
            }
        });
        jPanel1.add(cmbKategori, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 200, -1));

        tblPenjualan.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        tblPenjualan.setForeground(new java.awt.Color(255, 255, 255));
        tblPenjualan.setModel(new javax.swing.table.DefaultTableModel(
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
        tblPenjualan.setOpaque(false);
        tblPenjualan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPenjualanMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblPenjualan);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 325, 110));

        tblMenu.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        tblMenu.setForeground(new java.awt.Color(255, 255, 255));
        tblMenu.setModel(new javax.swing.table.DefaultTableModel(
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
        tblMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblMenu.setOpaque(false);
        tblMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMenuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblMenu);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 690, 230));

        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/btnMenu.png"))); // NOI18N
        btnMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMenuMouseClicked(evt);
            }
        });
        jPanel1.add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        btnKategori.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/btnKategori.png"))); // NOI18N
        btnKategori.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnKategori.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnKategoriMouseClicked(evt);
            }
        });
        jPanel1.add(btnKategori, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        btnPenjualan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/btnPenjualan.png"))); // NOI18N
        btnPenjualan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPenjualan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPenjualanMouseClicked(evt);
            }
        });
        jPanel1.add(btnPenjualan, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/close.png"))); // NOI18N
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 40, -1, -1));

        txtCari.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txtCari.setForeground(new java.awt.Color(255, 255, 255));
        txtCari.setText("Cari");
        txtCari.setBorder(null);
        txtCari.setOpaque(false);
        txtCari.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCariFocusGained(evt);
            }
        });
        txtCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCariActionPerformed(evt);
            }
        });
        jPanel1.add(txtCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, 210, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 210, 10));

        btnCari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/btnCari.png"))); // NOI18N
        btnCari.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCariMouseClicked(evt);
            }
        });
        jPanel1.add(btnCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 260, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/btnBayar.png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 150, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/hapus.png"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 110, -1, -1));

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/backBig.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 610));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMenuMouseClicked
        DefaultTableModel model = (DefaultTableModel)tblMenu.getModel();
        int row = tblMenu.getSelectedRow();
        String qty = "0";
        Menu menu = new Menu();        
        DetailPenjualan detail = new DetailPenjualan();
        menu = menu.getById(Integer.parseInt(model.getValueAt(row, 0).toString()));
        qty = JOptionPane.showInputDialog(this, "Masukkan Jumlah");
        if ( !(qty.isEmpty()) || !(qty.equalsIgnoreCase("0")) ) {
            detail.setId((labelId.getText()));
        detail.setTgl_penjualan(formatter.format(date));
        detail.setMenu(menu);
        detail.setQty(Integer.parseInt(qty));
        detail.setHarga(Integer.parseInt(qty)*(menu.getRcost()+menu.getScost()));
        detail.save();
        
        labelTotal.setText(String.valueOf(Integer.parseInt(labelTotal.getText())+detail.getHarga()));
        labelQty.setText(String.valueOf(Integer.parseInt(labelQty.getText())+detail.getQty()));
        }
        tampilkanPesanan();
        
    }//GEN-LAST:event_tblMenuMouseClicked

    private void tblPenjualanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPenjualanMouseClicked
        DefaultTableModel model = (DefaultTableModel)tblPenjualan.getModel();
        int row = tblPenjualan.getSelectedRow();
        DetailPenjualan detail = new DetailPenjualan();
        detail = detail.getById((model.getValueAt(row, 0).toString()));
    }//GEN-LAST:event_tblPenjualanMouseClicked

    private void cmbKategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbKategoriActionPerformed
        Object selected = cmbKategori.getSelectedItem();
        cari(String.valueOf(selected));
    }//GEN-LAST:event_cmbKategoriActionPerformed

    private void btnMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuMouseClicked
        FrmMenu menu = new FrmMenu();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnMenuMouseClicked

    private void btnKategoriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKategoriMouseClicked
        FrmKategori kategori = new FrmKategori();
        kategori.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnKategoriMouseClicked

    private void btnPenjualanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPenjualanMouseClicked
    }//GEN-LAST:event_btnPenjualanMouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void txtCariFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCariFocusGained
        txtCari.setText("");
    }//GEN-LAST:event_txtCariFocusGained

    private void txtCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCariActionPerformed

    private void btnCariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCariMouseClicked
        cari(txtCari.getText());
    }//GEN-LAST:event_btnCariMouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        Penjualan penjualan = new Penjualan();
        penjualan.setId(labelId.getText());
        penjualan.setTglPenjualan(formatter.format(date));
        penjualan.setTotalHarga(Integer.parseInt(labelTotal.getText()));
        penjualan.setTotalQty(Integer.parseInt(labelQty.getText()));
        penjualan.save();
        JOptionPane.showMessageDialog(this,"Total Pembelian"+penjualan.getTotalHarga());
        inisialisasi();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        DefaultTableModel model = (DefaultTableModel)tblPenjualan.getModel();
        int row = tblPenjualan.getSelectedRow();

        DetailPenjualan detail = new DetailPenjualan().getById(model.getValueAt(row, 0).toString());
        labelTotal.setText(String.valueOf(Integer.parseInt(labelTotal.getText())-detail.getHarga()));
        labelQty.setText(String.valueOf(Integer.parseInt(labelQty.getText())-detail.getQty()));
        detail.delete();
        tampilkanPesanan();
    }//GEN-LAST:event_jLabel5MouseClicked

    
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
            java.util.logging.Logger.getLogger(FrmPenjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPenjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPenjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPenjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPenjualan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCari;
    private javax.swing.JLabel btnKategori;
    private javax.swing.JLabel btnMenu;
    private javax.swing.JLabel btnPenjualan;
    private javax.swing.JComboBox<String> cmbKategori;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel labelId;
    private javax.swing.JLabel labelQty;
    private javax.swing.JLabel labelTotal;
    private javax.swing.JTable tblMenu;
    private javax.swing.JTable tblPenjualan;
    private javax.swing.JTextField txtCari;
    // End of variables declaration//GEN-END:variables
}
