package backend;

import java.util.ArrayList;
import java.sql.*;

public class DetailPenjualan {
    private String id,tgl_penjualan,nama;
    private int qty,harga,ids;

    public int getIds() {
        return ids;
    }

    public void setIds(int ids) {
        this.ids = ids;
    }
    private Menu menu = new Menu();

    public DetailPenjualan() {
    }

    public DetailPenjualan(String id, String tgl_penjualan, Menu menu, int qty, int harga) {
        this.id = id;
        this.tgl_penjualan = tgl_penjualan;
        this.menu = menu;
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

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public void save() {
            String SQL = "INSERT INTO detailpenjualan ("
                    + "id_detailpenjualan,"
                    + "tgl_detailpenjualan,"
                    + "idmenu_detailpenjualan,"
                    + "qty_detailpenjualan,"
                    + "harga_detailpenjualan)"
                    + "VALUES("
                    + " '" + this.id + "', "
                    + " '" + this.tgl_penjualan + "', "
                    + " '" + this.getMenu().getId() + "', "
                    + " '" + this.qty + "', "
                    + " '" + this.harga + "') ";
            DBHelper.executeQuery(SQL);
    }
    
    public DetailPenjualan getById(String id) {
        DetailPenjualan detail = new DetailPenjualan();
        ResultSet rs = DBHelper.selectQuery("SELECT menu.*,detailpenjualan.* "
                + " FROM detailpenjualan join menu "
                + " ON idmenu_detailpenjualan = id_menu"
                + " WHERE id = '" + id + "'");
        try {
            while (rs.next()) {
                detail = new DetailPenjualan();
                detail.setIds(rs.getInt("id"));
                detail.setId(rs.getString("id_detailpenjualan"));
                detail.setTgl_penjualan(rs.getString("tgl_detailpenjualan"));
                detail.getMenu().setId(rs.getInt("id_menu"));
                detail.getMenu().setNama(rs.getString("nama_menu"));
                detail.setQty(rs.getInt("qty_detailpenjualan"));
                detail.setHarga(rs.getInt("harga_detailpenjualan"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return detail;
    }
    
    public DetailPenjualan getByName(String name) {
        DetailPenjualan detail = new DetailPenjualan();
        ResultSet rs = DBHelper.selectQuery("SELECT menu.*,detailpenjualan.* "
                + " FROM detailpenjualan join menu "
                + " ON idmenu_detailpenjualan = id_menu"
                + " WHERE nama_menu = '" + name + "'");
        try {
            while (rs.next()) {
                detail = new DetailPenjualan();
                detail.setId(rs.getString("id_detailpenjualan"));
                detail.setTgl_penjualan(rs.getString("tgl_detailpenjualan"));
                detail.getMenu().setId(rs.getInt("id_menu"));
                detail.getMenu().setNama(rs.getString("nama_menu"));
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
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM detailpenjualan "
                + " join menu ON idmenu_detailpenjualan = id_menu");
        try {
            while (rs.next()) {
                DetailPenjualan detail = new DetailPenjualan();
                detail.setIds(rs.getInt("id"));
                detail.setId(rs.getString("id_detailpenjualan"));
                detail.setTgl_penjualan(rs.getString("tgl_detailpenjualan"));
                detail.getMenu().setId(rs.getInt("id_menu"));
                detail.getMenu().setNama(rs.getString("nama_menu"));
                detail.setQty(rs.getInt("qty_detailpenjualan"));
                detail.setHarga(rs.getInt("harga_detailpenjualan"));
                ListDetail.add(detail);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListDetail;
    }
    
    public ArrayList<DetailPenjualan> getAllby(String id) {
        ArrayList<DetailPenjualan> ListDetail = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM detailpenjualan "
                + " join menu ON idmenu_detailpenjualan = id_menu "
                + " where id_detailpenjualan = '"+id+"'");
        try {
            while (rs.next()) {
                DetailPenjualan detail = new DetailPenjualan();
                detail.setIds(rs.getInt("id"));
                detail.setId(rs.getString("id_detailpenjualan"));
                detail.setTgl_penjualan(rs.getString("tgl_detailpenjualan"));
                detail.getMenu().setId(rs.getInt("id_menu"));
                detail.getMenu().setNama(rs.getString("nama_menu"));
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
        String sql = "SELECT * FROM detailpenjualan join menu"
                + " ON idmenu_detailpenjualan = id_menu"
                + " WHERE tgl_penjualan LIKE '%" + keyword + "%' "
                + " OR id_penjualan LIKE '%" + keyword + "%' ";
        ResultSet rs = DBHelper.selectQuery(sql);
        try {
            while (rs.next()) {
                DetailPenjualan detail = new DetailPenjualan();
                detail.setId(rs.getString("id_detailpenjualan"));
                detail.setTgl_penjualan(rs.getString("tgl_detailpenjualan"));
                detail.getMenu().setId(rs.getInt("id_menu"));
                detail.getMenu().setNama(rs.getString("nama_menu"));
                detail.setQty(rs.getInt("qty_detailpenjualan"));
                detail.setHarga(rs.getInt("harga_detailpenjualan"));
                ListDetail.add(detail);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListDetail;
    }
    
    public void delete() {
        String SQL = "DELETE FROM detailpenjualan WHERE id = '" + this.ids + "'";
        DBHelper.executeQuery(SQL);
    }
}
