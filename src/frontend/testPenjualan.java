package frontend;

import backend.*;
import java.util.ArrayList;

public class testPenjualan {
    public static void main(String[] args) {
        Menu menu = new Menu().getById(5);
        DetailPenjualan dp = new DetailPenjualan("TVN", "2020/12/27", menu, 2, ((menu.getRcost()+menu.getScost())));
        dp.save();
        System.out.println(dp.getMenu().getNama());
        System.out.println(dp.getHarga());
    }
}
