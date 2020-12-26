package backend;

import java.util.ArrayList;
import java.sql.*;

public class Kategori {

    private String nama;
    private int id;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
        
    public String toString(){
        return nama;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Kategori(String nama, int id) {
        this.nama = nama;
        this.id = id;
    }

    public Kategori() {
    }

    
    public Kategori getById(int id) {
        Kategori kat = new Kategori();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM Kategori"
                + " WHERE id_kategori = '" + id + "'");
        try {
            while (rs.next()) {
                kat = new Kategori();
                kat.setId(rs.getInt("id_kategori"));
                kat.setNama(rs.getString("nama_kategori"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return kat;
    }

    public ArrayList<Kategori> getAll() {
        ArrayList<Kategori> ListKategori = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM Kategori");
        try {
            while (rs.next()) {
                Kategori kat = new Kategori();
                kat.setId(rs.getInt("id_kategori"));
                kat.setNama(rs.getString("nama_kategori"));
                ListKategori.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListKategori;
    }

    public ArrayList<Kategori> search(String keyword) {
        ArrayList<Kategori> ListKategori = new ArrayList();
        String sql = "SELECT * FROM Kategori WHERE "
                + " nama_kategori LIKE '%" + keyword + "%' ";
        ResultSet rs = DBHelper.selectQuery(sql);
        try {
            while (rs.next()) {
                Kategori kat = new Kategori();
                kat.setId(rs.getInt("id_kategori"));
                kat.setNama(rs.getString("nama_kategori"));
                ListKategori.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListKategori;
    }

    public void save() {
        if (getById(id).getId() == 0) {
            String SQL = "INSERT INTO Kategori (nama_kategori) VALUES("+" '"+this.nama+"') ";
            this.id = DBHelper.insertQueryGetId(SQL);
        } else {
            String SQL = "UPDATE Kategori SET "+"nama_kategori = '"+this.nama+"'"
                    + "WHERE id_kategori = '" + this.id + "'";
            DBHelper.executeQuery(SQL);
        }
    }

    public void delete() {
        String SQL = "DELETE FROM Kategori WHERE id_kategori = '" + this.id + "'";
        DBHelper.executeQuery(SQL);
    }

}
