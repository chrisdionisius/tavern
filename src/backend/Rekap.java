package backend;

import java.sql.*;

public class Rekap {

    private String nama;
    private int qty,total;
    
    public Rekap() {
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
    public Rekap laris() {
        Rekap rekap = new Rekap();
        ResultSet rs = DBHelper.selectQuery("SELECT m.nama_menu, "
                + "sum(d.qty_detailpenjualan) AS qty, "
                + "sum(d.harga_detailpenjualan) as total "
                + "FROM menu m "
                + "JOIN detailpenjualan d "
                + "ON m.id_menu=d.idmenu_detailpenjualan "
                + "GROUP BY m.nama_menu "
                + "ORDER BY sum(d.qty_detailpenjualan) "
                + "DESC LIMIT 1");
        try {
            while (rs.next()) {
                rekap = new Rekap();
                rekap.setNama(rs.getString("m.nama_menu"));
                rekap.setQty(rs.getInt("qty"));
                rekap.setTotal(rs.getInt("total"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rekap;
    }
    
    public Rekap penjualan(){
        Rekap rekap = new Rekap();
        ResultSet rs = DBHelper.selectQuery("SELECT sum(d.qty_detailpenjualan) AS qty, "
                + "sum(d.harga_detailpenjualan) as total "
                + "FROM menu m  "
                + "JOIN detailpenjualan d  "
                + "ON m.id_menu=d.idmenu_detailpenjualan ");
        try {
            while (rs.next()) {
                rekap = new Rekap();
                rekap.setQty(rs.getInt("qty"));
                rekap.setTotal(rs.getInt("total"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rekap;
    }
}
