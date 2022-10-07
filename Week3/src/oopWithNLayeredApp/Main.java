package oopWithNLayeredApp;

import oopWithNLayeredApp.Business.ProductManager;
import oopWithNLayeredApp.core.logging.DatabaseLogger;
import oopWithNLayeredApp.core.logging.FileLogger;
import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.core.logging.MailLogger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.entities.Product;

public class Main {
    public static void main(String[] args) throws Exception {
        Product product1 = new Product(1, "iPhone 11", 16500);
        //Product product1 = new Product(1, "iPhone 11", 9); 10 dan küçük bir fiyat
        Logger [] loggers = {new DatabaseLogger(),new FileLogger(), new MailLogger()};

        ProductManager productManager = new ProductManager(new JdbcProductDao(),loggers);
//        ProductManager productManager2 = new ProductManager(new HibernateProductDao());
        productManager.add(product1);
//        productManager2.add(product1);

    }
}
