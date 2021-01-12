package frontend;

import backend.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;

public class FrmMenu extends javax.swing.JFrame {

    /**
     * Creates new form FrmMenu
     */
    public FrmMenu() {
        initComponents();
        tampilkanData();
        tampilCmbKategori();
        kosongkanForm();
        Toolkit tk = getToolkit();
        Dimension size = tk.getScreenSize();
        setLocation(size.width/2-getWidth()/2, size.width/5-getHeight()/5);
        this.setBackground(new Color(0,0,0,0));
        txtId.setBackground(new Color(0,0,0,0));
        txtNama.setBackground(new Color(0,0,0,0));
        txtRcMenu.setBackground(new Color(0,0,0,0));
        txtScMenu.setBackground(new Color(0,0,0,0));
        txtCari.setBackground(new Color(0,0,0,0));
        jPanel1.setBackground(new Color(0,0,0,0));
//        this.getContentPane().setBackground(new Color(255,255,255));
    }

    public void kosongkanForm() {
        txtId.setText("0");
        cmbKategori.setSelectedIndex(0);
        txtNama.setText("Nama Menu");
        txtRcMenu.setText("Recipe cost");
        txtScMenu.setText("Serve cost");
        txtCari.setText("Cari");
    }

    public void tampilkanData() {
        String[] kolom = {"ID", "Nama Menu", "Jenis", "Recipe Cost", "Serve Cost"};
        ArrayList<Menu> list = new Menu().getAll();
        Object rowData[] = new Object[5];

        tblMenu.setModel(new DefaultTableModel(new Object[][]{}, kolom));

        for (Menu menu : list) {
            rowData[0] = menu.getId();
            rowData[1] = menu.getNama();
            rowData[2] = menu.getKategori().getNama();
            rowData[3] = menu.getRcost();
            rowData[4] = menu.getScost();

            ((DefaultTableModel) tblMenu.getModel()).addRow(rowData);
        }
    }

    public void cari(String keyword) {
        String[] kolom = {"ID", "Nama Menu", "Jenis", "Recipe Cost", "Serve Cost"};
        ArrayList<Menu> list = new Menu().search(keyword);
        Object rowData[] = new Object[5];

        tblMenu.setModel(new DefaultTableModel(new Object[][]{}, kolom));

        for (Menu menu : list) {
            rowData[0] = menu.getId();
            rowData[1] = menu.getNama();
            rowData[2] = menu.getKategori().getNama();
            rowData[3] = menu.getRcost();
            rowData[4] = menu.getScost();

            ((DefaultTableModel) tblMenu.getModel()).addRow(rowData);
        }
    }

    public void tampilCmbKategori() {
        cmbKategori.setModel(new DefaultComboBoxModel(new Kategori().getAll().toArray()));
//        cmbKategori.setBackground(new Color(0,0,0,0));
//        cmbKategori.setForeground(new Color(255,255,255));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMenu = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        btnPenjualan = new javax.swing.JLabel();
        btnKategori = new javax.swing.JLabel();
        btnMenu = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        cmbKategori = new javax.swing.JComboBox<>();
        txtCari = new javax.swing.JTextField();
        txtScMenu = new javax.swing.JTextField();
        txtRcMenu = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        btnCari = new javax.swing.JLabel();
        btnTambah = new javax.swing.JLabel();
        btnSimpan = new javax.swing.JLabel();
        btnHapus = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        tblMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMenuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblMenu);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 400, 150));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/close.png"))); // NOI18N
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 40, -1, -1));

        btnPenjualan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/btnPenjualan.png"))); // NOI18N
        btnPenjualan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPenjualan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPenjualanMouseClicked(evt);
            }
        });
        jPanel1.add(btnPenjualan, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, -1, -1));

        btnKategori.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/btnKategori.png"))); // NOI18N
        btnKategori.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnKategori.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnKategoriMouseClicked(evt);
            }
        });
        jPanel1.add(btnKategori, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/btnMenu.png"))); // NOI18N
        btnMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMenuMouseClicked(evt);
            }
        });
        jPanel1.add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Rp");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 20, -1));

        txtId.setEditable(false);
        txtId.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        txtId.setForeground(new java.awt.Color(255, 255, 255));
        txtId.setBorder(null);
        txtId.setEnabled(false);
        txtId.setOpaque(false);
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 110, -1));

        txtNama.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txtNama.setForeground(new java.awt.Color(255, 255, 255));
        txtNama.setText("Nama menu");
        txtNama.setBorder(null);
        txtNama.setOpaque(false);
        txtNama.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNamaFocusGained(evt);
            }
        });
        txtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaActionPerformed(evt);
            }
        });
        jPanel1.add(txtNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 280, -1));

        cmbKategori.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        cmbKategori.setForeground(new java.awt.Color(255, 255, 255));
        cmbKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbKategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbKategoriActionPerformed(evt);
            }
        });
        jPanel1.add(cmbKategori, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 280, -1));

        txtCari.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txtCari.setForeground(new java.awt.Color(255, 255, 255));
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
        jPanel1.add(txtCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, 210, -1));

        txtScMenu.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txtScMenu.setForeground(new java.awt.Color(255, 255, 255));
        txtScMenu.setText("Serve Cost");
        txtScMenu.setBorder(null);
        txtScMenu.setOpaque(false);
        txtScMenu.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtScMenuFocusGained(evt);
            }
        });
        jPanel1.add(txtScMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 250, -1));

        txtRcMenu.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txtRcMenu.setForeground(new java.awt.Color(255, 255, 255));
        txtRcMenu.setText("Recipe Cost");
        txtRcMenu.setBorder(null);
        txtRcMenu.setOpaque(false);
        txtRcMenu.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtRcMenuFocusGained(evt);
            }
        });
        jPanel1.add(txtRcMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 250, -1));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 280, 10));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 280, 10));

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 210, 10));

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("#");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 20, -1));

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Rp");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 20, -1));

        jSeparator4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 280, 10));

        btnCari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/btnCari.png"))); // NOI18N
        btnCari.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCariMouseClicked(evt);
            }
        });
        jPanel1.add(btnCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 130, -1, -1));

        btnTambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/btnTambah.png"))); // NOI18N
        btnTambah.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTambah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTambahMouseClicked(evt);
            }
        });
        jPanel1.add(btnTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        btnSimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/btnSimpan.png"))); // NOI18N
        btnSimpan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSimpan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSimpanMouseClicked(evt);
            }
        });
        btnSimpan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnSimpanKeyPressed(evt);
            }
        });
        jPanel1.add(btnSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, -1, -1));

        btnHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/btnHapus.png"))); // NOI18N
        btnHapus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHapusMouseClicked(evt);
            }
        });
        jPanel1.add(btnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, -1, -1));

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/backBig.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 610));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMenuMouseClicked
        DefaultTableModel model = (DefaultTableModel)tblMenu.getModel();
        int row = tblMenu.getSelectedRow();
        Menu menu = new Menu();
        
        menu = menu.getById(Integer.parseInt(model.getValueAt(row, 0).toString()));

        txtId.setText(String.valueOf(menu.getId()));
        cmbKategori.getModel().setSelectedItem(menu.getKategori());
        txtNama.setText(menu.getNama());
        txtRcMenu.setText((String.valueOf(menu.getRcost())));
        txtScMenu.setText((String.valueOf(menu.getScost())));
    }//GEN-LAST:event_tblMenuMouseClicked

    private void cmbKategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbKategoriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbKategoriActionPerformed

    private void txtCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCariActionPerformed

    private void btnMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuMouseClicked
        
    }//GEN-LAST:event_btnMenuMouseClicked

    private void btnKategoriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKategoriMouseClicked
        FrmKategori kategori = new FrmKategori();
        kategori.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnKategoriMouseClicked

    private void btnPenjualanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPenjualanMouseClicked
        FrmPenjualan penjualan = new FrmPenjualan();
        penjualan.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnPenjualanMouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtNamaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNamaFocusGained
        txtNama.setText("");
    }//GEN-LAST:event_txtNamaFocusGained

    private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaActionPerformed

    private void txtRcMenuFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRcMenuFocusGained
        txtRcMenu.setText("");
    }//GEN-LAST:event_txtRcMenuFocusGained

    private void txtScMenuFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtScMenuFocusGained
        txtScMenu.setText("");
    }//GEN-LAST:event_txtScMenuFocusGained

    private void btnCariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCariMouseClicked
        cari(txtCari.getText());
    }//GEN-LAST:event_btnCariMouseClicked

    private void txtCariFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCariFocusGained
        txtCari.setText("");
    }//GEN-LAST:event_txtCariFocusGained

    private void btnTambahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTambahMouseClicked
        kosongkanForm();
    }//GEN-LAST:event_btnTambahMouseClicked

    private void btnSimpanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSimpanKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSimpanKeyPressed

    private void btnSimpanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSimpanMouseClicked
        Menu menu = new Menu();
        menu.setId(Integer.parseInt(txtId.getText()));
        menu.setKategori((Kategori)cmbKategori.getSelectedItem());
        menu.setNama(txtNama.getText());
        menu.setRcost(Integer.parseInt(txtRcMenu.getText()));
        menu.setScost(Integer.parseInt(txtScMenu.getText()));
        menu.save();
        txtId.setText(Integer.toString(menu.getId()));
        tampilkanData();
    }//GEN-LAST:event_btnSimpanMouseClicked

    private void btnHapusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapusMouseClicked
        DefaultTableModel model = (DefaultTableModel)tblMenu.getModel();
        int row = tblMenu.getSelectedRow();

        Menu menu = new Menu().getById(Integer.parseInt(model.getValueAt(row, 0).toString()));
        menu.delete();
        kosongkanForm();
        tampilkanData();
    }//GEN-LAST:event_btnHapusMouseClicked

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
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCari;
    private javax.swing.JLabel btnHapus;
    private javax.swing.JLabel btnKategori;
    private javax.swing.JLabel btnMenu;
    private javax.swing.JLabel btnPenjualan;
    private javax.swing.JLabel btnSimpan;
    private javax.swing.JLabel btnTambah;
    private javax.swing.JComboBox<String> cmbKategori;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable tblMenu;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtRcMenu;
    private javax.swing.JTextField txtScMenu;
    // End of variables declaration//GEN-END:variables
}
