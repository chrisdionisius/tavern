package backend;

import java.util.ArrayList;
import java.sql.*;

public class Menu {

    private int id, rcost, scost, idkategori;
    private String nama;
    private Kategori kategori = new Kategori();

    public Menu() {
    }

    public Menu(int id, int rcost, int scost, int idkategori, String nama) {
        this.id = id;
        this.rcost = rcost;
        this.scost = scost;
        this.idkategori = idkategori;
        this.nama = nama;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRcost() {
        return rcost;
    }

    public void setRcost(int rcost) {
        this.rcost = rcost;
    }

    public int getScost() {
        return scost;
    }

    public void setScost(int scost) {
        this.scost = scost;
    }

    public int getIdkategori() {
        return idkategori;
    }

    public void setIdkategori(int idkategori) {
        this.idkategori = idkategori;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Kategori getKategori() {
        return kategori;
    }

    public void setKategori(Kategori kategori) {
        this.kategori = kategori;
    }

    

    public Menu getById(int id) {
        Menu menu = new Menu();
        ResultSet rs = DBHelper.selectQuery("SELECT menu.*,kategori.* FROM Menu"
                + " left join kategori on id_kategori = idkategori_menu"
                + " WHERE id_menu = '" + id + "'");
        try {
            while (rs.next()) {
                menu = new Menu();
                menu.setId(rs.getInt("id_menu"));
                menu.setNama(rs.getString("nama_menu"));
                menu.setIdkategori(rs.getInt("idkategori_menu"));
                menu.getKategori().setId(rs.getInt("idkategori_menu"));
                menu.getKategori().setNama(rs.getString("nama_kategori"));
                menu.setRcost(rs.getInt("rc_menu"));
                menu.setScost(rs.getInt("sc_menu"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return menu;
    }

    public ArrayList<Menu> getAll() {
        ArrayList<Menu> ListMenu = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("SELECT menu.*,kategori.* FROM Menu join kategori on id_kategori = idkategori_menu");
        try {
            while (rs.next()) {
                Menu menu = new Menu();
                menu.setId(rs.getInt("id_menu"));
                menu.setNama(rs.getString("nama_menu"));
                menu.setIdkategori(rs.getInt("idkategori_menu"));
                menu.getKategori().setId(rs.getInt("idkategori_menu"));
                menu.getKategori().setNama(rs.getString("nama_kategori"));
                menu.setRcost(rs.getInt("rc_menu"));
                menu.setScost(rs.getInt("sc_menu"));
                ListMenu.add(menu);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListMenu;
    }

    public ArrayList<Menu> search(String keyword) {
        ArrayList<Menu> ListMenu = new ArrayList();
        String sql = "SELECT menu.*,kategori.* FROM Menu "
                + " join kategori on id_kategori = idkategori_menu"
                + " WHERE nama_menu LIKE '%" + keyword + "%' "
                + " OR nama_kategori LIKE '%" + keyword + "%' ";
        ResultSet rs = DBHelper.selectQuery(sql);
        try {
            while (rs.next()) {
                Menu menu = new Menu();
                menu.setId(rs.getInt("id_menu"));
                menu.setNama(rs.getString("nama_menu"));
                menu.setIdkategori(rs.getInt("idkategori_menu"));
                menu.getKategori().setId(rs.getInt("idkategori_menu"));
                menu.getKategori().setNama(rs.getString("nama_kategori"));
                menu.setRcost(rs.getInt("rc_menu"));
                menu.setScost(rs.getInt("sc_menu"));
                ListMenu.add(menu);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListMenu;
    }

    public void save() {
        if (getById(id).getId() == 0) {
            String SQL = "INSERT INTO Menu ("
                    + "nama_menu,"
                    + "idkategori_menu,"
                    + "rc_menu,"
                    + "sc_menu)"
                    + "VALUES("
                    + " '" + this.nama + "', "
                    + " '" + this.getKategori().getId() + "', "
                    + " '" + this.rcost + "', "
                    + " '" + this.scost + "') ";
            this.id = DBHelper.insertQueryGetId(SQL);
        } else {
            String SQL = "UPDATE Menu SET "
                    + "nama_menu = '" + this.nama + "',"
                    + "idkategori_menu = '" + this.getKategori().getId() + "',"
                    + "rc_menu = '" + this.rcost + "',"
                    + "sc_menu = '" + this.scost + "'"
                    + "WHERE id_menu = '" + this.id + "'";
            DBHelper.executeQuery(SQL);
        }
    }

    public void delete() {
        String SQL = "DELETE FROM Menu WHERE id_menu = '" + this.id + "'";
        DBHelper.executeQuery(SQL);
    }
}
