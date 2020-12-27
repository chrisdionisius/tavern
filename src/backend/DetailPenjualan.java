package backend;

import java.util.ArrayList;
import java.sql.*;

public class DetailPenjualan {
    private String id,tgl_penjualan,id_menu,nama;
    private int qty,harga;

    public DetailPenjualan() {
    }

    public DetailPenjualan(String id, String tgl_penjualan, String id_menu, int qty, int harga) {
        this.id = id;
        this.tgl_penjualan = tgl_penjualan;
        this.id_menu = id_menu;
        this.qty = qty;
        this.harga = harga;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTgl_penjualan() {
        return tgl_penjualan;
    }

    public void setTgl_penjualan(String tgl_penjualan) {
        this.tgl_penjualan = tgl_penjualan;
    }

    public String getId_menu() {
        return id_menu;
    }

    public void setId_menu(String id_menu) {
        this.id_menu = id_menu;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    
    public DetailPenjualan getById(String id) {
        DetailPenjualan detail = new DetailPenjualan();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM detailpenjualan"
                + "join menu on idmenu_detailpenjualan = id_menu"
                + " WHERE id_detailpenjualan = '" + id + "'");
        try {
            while (rs.next()) {
                detail = new DetailPenjualan();
                detail.setId(rs.getString("id_penjualan"));
                detail.setTgl_penjualan(rs.getString("tgl_detailpenjualan"));
                detail.setId_menu(rs.getString("idmenu_detailpenjualan"));
                detail.setQty(rs.getInt("qty_detailpenjualan"));
                detail.setHarga(rs.getInt("harga_detailpenjualan"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return detail;
    }
    public ArrayList<DetailPenjualan> getAll() {
        ArrayList<DetailPenjualan> ListDetail = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM detailpenjualan");
        try {
            while (rs.next()) {
                DetailPenjualan detail = new DetailPenjualan();
                detail.setId(rs.getString("id_penjualan"));
                detail.setTgl_penjualan(rs.getString("tgl_detailpenjualan"));
                detail.setId_menu(rs.getString("idmenu_detailpenjualan"));
                detail.setQty(rs.getInt("qty_detailpenjualan"));
                detail.setHarga(rs.getInt("harga_detailpenjualan"));
                ListDetail.add(detail);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListDetail;
    }
    
    public ArrayList<DetailPenjualan> search(String keyword) {
        ArrayList<DetailPenjualan> ListDetail = new ArrayList();
        String sql = "SELECT * FROM detailpenjualan "
                + " WHERE tgl_penjualan LIKE '%" + keyword + "%' "
                + " OR id_penjualan LIKE '%" + keyword + "%' ";
        ResultSet rs = DBHelper.selectQuery(sql);
        try {
            while (rs.next()) {
                DetailPenjualan detail = new DetailPenjualan();
                detail.setId(rs.getString("id_penjualan"));
                detail.setTgl_penjualan(rs.getString("tgl_detailpenjualan"));
                detail.setId_menu(rs.getString("idmenu_detailpenjualan"));
                detail.setQty(rs.getInt("qty_detailpenjualan"));
                detail.setHarga(rs.getInt("harga_detailpenjualan"));
                ListDetail.add(detail);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListDetail;
    }
}
