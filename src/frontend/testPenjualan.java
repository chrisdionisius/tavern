package frontend;

import backend.*;
import java.util.ArrayList;

public class testPenjualan {
    public static void main(String[] args) {
        Penjualan p = new Penjualan("SEKAI", 6, 22000, "2020/12/27");
        p.save();
        System.out.println(p.getById("SEKAI").getTotalHarga());
        p.setTotalHarga(30000);
        p.save();
        System.out.println(p.getById("SEKAI").getTotalHarga());
    }
}
