package application;

import java.time.Instant;

import modeldao.DaoFactory;
import modeldao.SellerDao;
import modelentities.Department;
import modelentities.Seller;

public class App {
    public static void main(String[] args) {
        
        Department d1 = new Department(1, "Books");
        
        Seller seller = new Seller(21, "Bob", "bob@gmail.com", Instant.now(), 3000.0, d1);

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println(seller);
    }
}
