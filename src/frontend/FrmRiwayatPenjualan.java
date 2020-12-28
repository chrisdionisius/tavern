/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

import backend.DetailPenjualan;
import backend.Kategori;
import backend.Penjualan;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Azyra
 */
public class FrmRiwayatPenjualan extends javax.swing.JFrame {

    /**
     * Creates new form FrmRiwayatPenjualan
     */
    public FrmRiwayatPenjualan() {
        initComponents();
        tampilkanData();
    }
    
    public void tampilkanData(){
        String[] kolom = {"Invoice","Tanggal", "Total qty", "Total Harga"};
        ArrayList<Penjualan> list = new Penjualan().getAll();
        Object rowData[] = new Object[4];

        tblPenjualan.setModel(new DefaultTableModel(new Object[][]{}, kolom));

        for (Penjualan penjualan : list) {
            rowData[0] = penjualan.getId();
            rowData[1] = penjualan.getTglPenjualan();
            rowData[2] = penjualan.getTotalQty();
            rowData[3] = penjualan.getTotalHarga();
            

            ((DefaultTableModel) tblPenjualan.getModel()).addRow(rowData);
        }
    }
    
    public void tampilCmbKategori() {
        //cmbKategori.setModel(new DefaultComboBoxModel(new Kategori().getAll().toArray()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblPenjualan = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
        tblPenjualan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPenjualanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPenjualan);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblPenjualanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPenjualanMouseClicked
        Object[][] rows = {{"Nama Menu", "QTY", "Harga"}};
        Object[] cols = {"Name", "Symbol", "Atomic Number", "Atomic Mass", "# of Valence Electrons"};
        JTable table = new JTable(rows, cols);
        JOptionPane.showMessageDialog(null, new JScrollPane(table));
        
        String[] kolom = {"Invoice","Tanggal", "Total qty", "Total Harga"};
        ArrayList<Penjualan> list = new Penjualan().getAll();
        Object rowData[] = new Object[4];

        tblPenjualan.setModel(new DefaultTableModel(new Object[][]{}, kolom));

        for (Penjualan penjualan : list) {
            rowData[0] = penjualan.getId();
            rowData[1] = penjualan.getTglPenjualan();
            rowData[2] = penjualan.getTotalQty();
            rowData[3] = penjualan.getTotalHarga();
            

            ((DefaultTableModel) tblPenjualan.getModel()).addRow(rowData);
        }
    }//GEN-LAST:event_tblPenjualanMouseClicked

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
            java.util.logging.Logger.getLogger(FrmRiwayatPenjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRiwayatPenjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRiwayatPenjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRiwayatPenjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRiwayatPenjualan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPenjualan;
    // End of variables declaration//GEN-END:variables
}