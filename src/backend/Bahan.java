package backend;

import java.util.ArrayList;
import java.sql.*;

public class Bahan {
    private int id,harga,stock_awal,stock_sisa,stock_jual;
    private String nama;

    public Bahan() {
    }

    public Bahan(int id, int harga, String nama) {
        this.id = id;
        this.harga = harga;
        this.nama = nama;
        stock_awal=0;
        stock_jual=0;
        stock_sisa=0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getStock_awal() {
        return stock_awal;
    }

    public void setStock_awal(int stock_awal) {
        this.stock_awal = stock_awal;
    }

    public int getStock_sisa() {
        return stock_sisa;
    }

    public void setStock_sisa(int stock_sisa) {
        this.stock_sisa = stock_sisa;
    }

    public int getStock_jual() {
        return stock_jual;
    }

    public void setStock_jual(int stock_jual) {
        this.stock_jual = stock_jual;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public Bahan getById(int id) {
        Bahan bahan = new Bahan();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM Bahan"
                + " WHERE id_bahan = '" + id + "'");
        try {
            while (rs.next()) {
                bahan = new Bahan();
                bahan.setId(rs.getInt("id_bahan"));
                bahan.setNama(rs.getString("nama_bahan"));
                bahan.setHarga(rs.getInt("harga_bahan"));
                bahan.setStock_awal(rs.getInt("stockawal_bahan"));
                bahan.setStock_sisa(rs.getInt("stocksisa_bahan"));
                bahan.setStock_jual(rs.getInt("stockjual_bahan"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bahan;
    }
    public ArrayList<Bahan> getAll() {
        ArrayList<Bahan> ListBahan = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM Bahan");
        try {
            while (rs.next()) {
                Bahan bahan = new Bahan();
                bahan.setId(rs.getInt("id_bahan"));
                bahan.setNama(rs.getString("nama_bahan"));
                bahan.setHarga(rs.getInt("harga_bahan"));
                bahan.setStock_awal(rs.getInt("stockawal_bahan"));
                bahan.setStock_sisa(rs.getInt("stocksisa_bahan"));
                bahan.setStock_jual(rs.getInt("stockjual_bahan"));
                ListBahan.add(bahan);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListBahan;
    }
    public ArrayList<Bahan> search(String keyword) {
        ArrayList<Bahan> ListBahan = new ArrayList();
        String sql = "SELECT * FROM Bahan WHERE "
                + " nama_bahan LIKE '%" + keyword + "%' ";
        ResultSet rs = DBHelper.selectQuery(sql);
        try {
            while (rs.next()) {
                Bahan bahan = new Bahan();
                bahan.setId(rs.getInt("id_bahan"));
                bahan.setNama(rs.getString("nama_bahan"));
                ListBahan.add(bahan);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListBahan;
    }
    
    public void save() {
        if (getById(id).getId() == 0) {
            String SQL = "INSERT INTO Bahan ("
                    + "nama_bahan,"
                    + "harga_bahan,"
                    + "stockawal_bahan,"
                    + "stocksisa_bahan,"
                    + "stockjual_bahan) "
                    + "VALUES("
                    +" '"+this.nama+"', "
                    +" '"+this.harga+"', "
                    +" '"+this.stock_awal+"', "
                    +" '"+this.stock_sisa+"', "
                    +" '"+this.stock_jual+"') ";
            this.id = DBHelper.insertQueryGetId(SQL);
        } else {
            String SQL = "UPDATE Bahan SET "
                    +"nama_bahan = '"+this.nama+"',"
                    +"harga_bahan = '"+this.harga+"',"
                    +"stockawal_bahan = '"+this.stock_awal+"',"
                    +"stocksisa_bahan = '"+this.stock_sisa+"',"
                    +"stockjual_bahan = '"+this.stock_jual+"'"
                    + "WHERE id_bahan = '" + this.id + "'";
            DBHelper.executeQuery(SQL);
        }
    }
    public void delete() {
        String SQL = "DELETE FROM Bahan WHERE id_bahan = '" + this.id + "'";
        DBHelper.executeQuery(SQL);
    }
}
