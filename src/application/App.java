package application;

import modeldao.DaoFactory;
import modeldao.SellerDao;
import modelentities.Seller;

public class App {
    public static void main(String[] args) {
        
        System.out.println("=== TEST 1: Seller findById ===");
        SellerDao sellerDao = DaoFactory.createSellerDao();
        Seller seller = sellerDao.findById(3);

        System.out.println(seller);
    }
}
