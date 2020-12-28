package frontend;

import backend.*;
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
    }

    public void kosongkanForm() {
        txtIdKategori.setText("0");
        txtNama.setText("");
        txtCari.setText("");
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKategori = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtIdKategori = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        btnSimpan = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtCari = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();
        btnTambah = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        Menu = new javax.swing.JButton();
        Penjualan = new javax.swing.JButton();

        jTextField2.setText("jTextField1");

        btnSimpanKategori1.setText("Simpan");
        btnSimpanKategori1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanKategori1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
        tblKategori.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKategoriMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblKategori);

        jLabel1.setText("ID");

        txtIdKategori.setEditable(false);
        txtIdKategori.setEnabled(false);

        jLabel2.setText("Nama");

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        jLabel3.setText("Cari");

        txtCari.setName(""); // NOI18N

        btnCari.setText("cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        jLabel8.setText("Form Kategori");

        Menu.setText("Form Menu");
        Menu.setPreferredSize(new java.awt.Dimension(110, 40));
        Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuActionPerformed(evt);
            }
        });

        Penjualan.setText("Form Penjualan");
        Penjualan.setPreferredSize(new java.awt.Dimension(110, 40));
        Penjualan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PenjualanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNama)
                                    .addComponent(txtIdKategori, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                        .addComponent(btnSimpan)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnHapus)
                                        .addGap(4, 4, 4))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCari))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(jLabel8)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCari, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnTambah))
                                .addGap(34, 34, 34))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Penjualan, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Penjualan, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCari))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btnSimpan)
                    .addComponent(btnHapus)
                    .addComponent(btnTambah))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        txtIdKategori.getAccessibleContext().setAccessibleName("txtIdKategori");
        txtNama.getAccessibleContext().setAccessibleName("txtNamaKategori");
        btnSimpan.getAccessibleContext().setAccessibleName("btnSimpan");
        txtCari.getAccessibleContext().setAccessibleName("txtCariKategori");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        cari(txtCari.getText());
    }//GEN-LAST:event_btnCariActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        Kategori kat = new Kategori();
        kat.setId(Integer.parseInt(txtIdKategori.getText()));
        kat.setNama(txtNama.getText());
        kat.save();
        txtIdKategori.setText(Integer.toString(kat.getId()));
        tampilkanData();
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnSimpanKategori1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanKategori1ActionPerformed
        
    }//GEN-LAST:event_btnSimpanKategori1ActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        kosongkanForm();
    }//GEN-LAST:event_btnTambahActionPerformed

    private void tblKategoriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKategoriMouseClicked
        DefaultTableModel model = (DefaultTableModel)tblKategori.getModel();
        int row = tblKategori.getSelectedRow();
        
        txtIdKategori.setText(model.getValueAt(row, 0).toString());
        txtNama.setText(model.getValueAt(row, 1).toString());
    }//GEN-LAST:event_tblKategoriMouseClicked

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        DefaultTableModel model = (DefaultTableModel)tblKategori.getModel();
        int row = tblKategori.getSelectedRow();
        
        Kategori kat = new Kategori().getById(Integer.parseInt(model.getValueAt(row, 0).toString()));
        kat.delete();
        kosongkanForm();
        tampilkanData();
    }//GEN-LAST:event_btnHapusActionPerformed

    private void MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuActionPerformed
        FrmMenu menu = new FrmMenu();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_MenuActionPerformed

    private void PenjualanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PenjualanActionPerformed
        FrmPenjualan penjualan = new FrmPenjualan();
        penjualan.setVisible(true);
        dispose();
    }//GEN-LAST:event_PenjualanActionPerformed

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
    private javax.swing.JButton Menu;
    private javax.swing.JButton Penjualan;
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnSimpanKategori1;
    private javax.swing.JButton btnTambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTable tblKategori;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtIdKategori;
    private javax.swing.JTextField txtNama;
    // End of variables declaration//GEN-END:variables
}
