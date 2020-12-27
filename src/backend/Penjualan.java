package backend;

import java.util.ArrayList;
import java.sql.*;

public class Penjualan {

    private int totalQty, totalHarga;
    private String tglPenjualan, id;

    public Penjualan() {
    }

    public Penjualan(String id, int totalQty, int totalHarga, String tglPenjualan) {
        this.totalQty = totalQty;
        this.totalHarga = totalHarga;
        this.tglPenjualan = tglPenjualan;
        this.id = id;
    }

    public int getTotalQty() {
        return totalQty;
    }

    public void setTotalQty(int totalQty) {
        this.totalQty=totalQty;
//        String SQL = "Select sum(qtydetailpenjualan) as qty"
//                + "from detailpenjualan "
//                + "where id_detailpenjualan ='" + this.id + "'";
//        ResultSet res = DBHelper.selectQuery(SQL);
//        try {
//            while (res.next()) {
//                this.totalQty = res.getInt("qty");
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }

    public int getTotalHarga() {
        return totalHarga;
    }

    public void setTotalHarga(int totalHarga) {
        this.totalHarga = totalHarga;
    }

    public String getTglPenjualan() {
        return tglPenjualan;
    }

    public void setTglPenjualan(String tglPenjualan) {
        this.tglPenjualan = tglPenjualan;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Penjualan getById(String id) {
        Penjualan penjualan = new Penjualan();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM Penjualan"
                + " WHERE id_penjualan = '" + id + "'");
        try {
            while (rs.next()) {
                penjualan = new Penjualan();
                penjualan.setId(rs.getString("id_penjualan"));
                penjualan.setTglPenjualan(rs.getString("tgl_penjualan"));
                penjualan.setTotalQty(rs.getInt("totalqty_penjualan"));
                penjualan.setTotalHarga(rs.getInt("totalharga_penjualan"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return penjualan;
    }

    public ArrayList<Penjualan> getAll() {
        ArrayList<Penjualan> ListPenjualan = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM Penjualan");
        try {
            while (rs.next()) {
                Penjualan penjualan = new Penjualan();
                penjualan.setId(rs.getString("id_penjualan"));
                penjualan.setTglPenjualan(rs.getString("tgl_penjualan"));
                penjualan.setTotalQty(rs.getInt("totalqty_penjualan"));
                penjualan.setTotalHarga(rs.getInt("totalharga_penjualan"));
                ListPenjualan.add(penjualan);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListPenjualan;
    }

    public ArrayList<Penjualan> search(String keyword) {
        ArrayList<Penjualan> ListPenjualan = new ArrayList();
        String sql = "SELECT * FROM Penjualan "
                + " WHERE tgl_penjualan LIKE '%" + keyword + "%' "
                + " OR id_penjualan LIKE '%" + keyword + "%' ";
        ResultSet rs = DBHelper.selectQuery(sql);
        try {
            while (rs.next()) {
                Penjualan penjualan = new Penjualan();
                penjualan.setId(rs.getString("id_penjualan"));
                penjualan.setTglPenjualan(rs.getString("tgl_penjualan"));
                penjualan.setTotalQty(rs.getInt("totalqty_penjualan"));
                penjualan.setTotalHarga(rs.getInt("totalharga_penjualan"));
                ListPenjualan.add(penjualan);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListPenjualan;
    }

    public void save() {
        if (getById(id).getId() == null || getById(id).getId().isEmpty()) {
            String SQL = "INSERT INTO Penjualan ("
                    + "id_penjualan,"
                    + "tgl_penjualan,"
                    + "totalqty_penjualan,"
                    + "totalharga_penjualan)"
                    + "VALUES("
                    + " '" + this.id + "', "
                    + " '" + this.tglPenjualan + "', "
                    + " '" + this.totalQty + "', "
                    + " '" + this.totalHarga + "') ";
            DBHelper.executeQuery(SQL);
        } else {
            String SQL = "UPDATE Penjualan SET "
                    + "tgl_penjualan = '" + this.tglPenjualan + "',"
                    + "totalqty_penjualan = '" + this.totalQty + "',"
                    + "totalharga_penjualan = '" + this.totalHarga + "'"
                    + "WHERE id_penjualan = '" + this.id + "'";
            DBHelper.executeQuery(SQL);
        }
    }

    public void update() {
        String SQL = "UPDATE Penjualan SET "
                + "tgl_penjualan = '" + this.tglPenjualan + "',"
                + "totalqty_penjualan = '" + this.totalQty + "',"
                + "totalharga_penjualan = '" + this.totalHarga + "'"
                + "WHERE id_penjualan = '" + this.id + "'";
        DBHelper.executeQuery(SQL);
    }

    public void delete() {
        String SQL = "DELETE FROM Penjualan WHERE id_penjualan = '" + this.id + "'";
        DBHelper.executeQuery(SQL);
    }
}
