package frontend;

import backend.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class FrmKategori extends javax.swing.JFrame {

    public FrmKategori() {
        initComponents();
        kosongkanForm();
        tampilkanData();
        Toolkit tk = getToolkit();
        Dimension size = tk.getScreenSize();
        setLocation(size.width/2-getWidth()/2, size.width/5-getHeight()/5);
        this.setBackground(new Color(0,0,0,0));
        txtCari.setBackground(new Color(0,0,0,0));
        txtIdKategori.setBackground(new Color(0,0,0,0));
        txtNama.setBackground(new Color(0,0,0,0));
        jPanel1.setBackground(new Color(0,0,0,0));
//        this.getContentPane().setBackground(new Color(255,255,255));
    }

    public void kosongkanForm() {
        txtIdKategori.setText("0");
        txtNama.setText("Nama kategori");
        txtCari.setText("Cari");
        
    }
    
    public void tampilkanData(){
        String []kolom={"ID","Nama"};
        ArrayList<Kategori> list =new Kategori().getAll();
        Object rowData[] = new Object[2];
        
        tblKategori.setModel(new DefaultTableModel(new Object[][]{}, kolom));
        
        for (Kategori kat:list) {
            rowData[0]=kat.getId();
            rowData[1]=kat.getNama();
            
            ((DefaultTableModel)tblKategori.getModel()).addRow(rowData);
        }
    }
    
     public void cari(String keyword){
        String []kolom={"ID","Nama"};
        ArrayList<Kategori> list =new Kategori().search(keyword);
        Object rowData[] = new Object[2];
        
        tblKategori.setModel(new DefaultTableModel(new Object[][]{}, kolom));
        
        for (Kategori kat:list) {
            rowData[0]=kat.getId();
            rowData[1]=kat.getNama();
            
            ((DefaultTableModel)tblKategori.getModel()).addRow(rowData);
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

        jTextField2 = new javax.swing.JTextField();
        btnSimpanKategori1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKategori = new javax.swing.JTable();
        btnCari = new javax.swing.JLabel();
        btnHapus = new javax.swing.JLabel();
        btnSimpan = new javax.swing.JLabel();
        btnTambah = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnMenu = new javax.swing.JLabel();
        btnPenjualan = new javax.swing.JLabel();
        txtCari = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        txtNama = new javax.swing.JTextField();
        txtIdKategori = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();

        jTextField2.setText("jTextField1");

        btnSimpanKategori1.setText("Simpan");
        btnSimpanKategori1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanKategori1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblKategori.setModel(new javax.swing.table.DefaultTableModel(
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
        tblKategori.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblKategori.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKategoriMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblKategori);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, 360, 220));

        btnCari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/btnCari.png"))); // NOI18N
        btnCari.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCariMouseClicked(evt);
            }
        });
        jPanel1.add(btnCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 130, -1, -1));

        btnHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/btnHapus.png"))); // NOI18N
        btnHapus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHapusMouseClicked(evt);
            }
        });
        jPanel1.add(btnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, -1, -1));

        btnSimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/btnSimpan.png"))); // NOI18N
        btnSimpan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSimpan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSimpanMouseClicked(evt);
            }
        });
        jPanel1.add(btnSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, -1, -1));

        btnTambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/btnTambah.png"))); // NOI18N
        btnTambah.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTambah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTambahMouseClicked(evt);
            }
        });
        jPanel1.add(btnTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/btnKategori.png"))); // NOI18N
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/close.png"))); // NOI18N
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 40, -1, -1));

        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/btnMenu.png"))); // NOI18N
        btnMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMenuMouseClicked(evt);
            }
        });
        jPanel1.add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        btnPenjualan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/btnPenjualan.png"))); // NOI18N
        btnPenjualan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPenjualan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPenjualanMouseClicked(evt);
            }
        });
        jPanel1.add(btnPenjualan, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, -1, -1));

        txtCari.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txtCari.setForeground(new java.awt.Color(255, 255, 255));
        txtCari.setText("Cari");
        txtCari.setBorder(null);
        txtCari.setName(""); // NOI18N
        txtCari.setOpaque(false);
        jPanel1.add(txtCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, 210, -1));
        txtCari.getAccessibleContext().setAccessibleName("txtCariKategori");

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 120, 10));

        txtNama.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txtNama.setForeground(new java.awt.Color(255, 255, 255));
        txtNama.setText("Nama kategori");
        txtNama.setBorder(null);
        txtNama.setOpaque(false);
        jPanel1.add(txtNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 280, -1));
        txtNama.getAccessibleContext().setAccessibleName("txtNamaKategori");

        txtIdKategori.setEditable(false);
        txtIdKategori.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        txtIdKategori.setBorder(null);
        txtIdKategori.setEnabled(false);
        txtIdKategori.setOpaque(false);
        jPanel1.add(txtIdKategori, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 104, -1));
        txtIdKategori.getAccessibleContext().setAccessibleName("txtIdKategori");

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("#");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 20, -1));

        jSeparator4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 210, 10));

        jSeparator5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 280, 10));

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/backBig.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 610));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanKategori1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanKategori1ActionPerformed
        
    }//GEN-LAST:event_btnSimpanKategori1ActionPerformed

    private void btnPenjualanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPenjualanMouseClicked
        FrmPenjualan penjualan = new FrmPenjualan();
        penjualan.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnPenjualanMouseClicked

    private void btnMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuMouseClicked
        FrmMenu menu = new FrmMenu();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnMenuMouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel13MouseClicked

    private void tblKategoriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKategoriMouseClicked
        DefaultTableModel model = (DefaultTableModel)tblKategori.getModel();
        int row = tblKategori.getSelectedRow();

        txtIdKategori.setText(model.getValueAt(row, 0).toString());
        txtNama.setText(model.getValueAt(row, 1).toString());
    }//GEN-LAST:event_tblKategoriMouseClicked

    private void btnCariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCariMouseClicked
        cari(txtCari.getText());
    }//GEN-LAST:event_btnCariMouseClicked

    private void btnTambahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTambahMouseClicked
        kosongkanForm();
    }//GEN-LAST:event_btnTambahMouseClicked

    private void btnSimpanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSimpanMouseClicked
        Kategori kat = new Kategori();
        kat.setId(Integer.parseInt(txtIdKategori.getText()));
        kat.setNama(txtNama.getText());
        kat.save();
        txtIdKategori.setText(Integer.toString(kat.getId()));
        tampilkanData();
    }//GEN-LAST:event_btnSimpanMouseClicked

    private void btnHapusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapusMouseClicked
        DefaultTableModel model = (DefaultTableModel)tblKategori.getModel();
        int row = tblKategori.getSelectedRow();
        
        Kategori kat = new Kategori().getById(Integer.parseInt(model.getValueAt(row, 0).toString()));
        kat.delete();
        kosongkanForm();
        tampilkanData();
    }//GEN-LAST:event_btnHapusMouseClicked

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
            java.util.logging.Logger.getLogger(FrmKategori.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmKategori.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmKategori.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmKategori.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmKategori().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCari;
    private javax.swing.JLabel btnHapus;
    private javax.swing.JLabel btnMenu;
    private javax.swing.JLabel btnPenjualan;
    private javax.swing.JLabel btnSimpan;
    private javax.swing.JButton btnSimpanKategori1;
    private javax.swing.JLabel btnTambah;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTable tblKategori;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtIdKategori;
    private javax.swing.JTextField txtNama;
    // End of variables declaration//GEN-END:variables
}
