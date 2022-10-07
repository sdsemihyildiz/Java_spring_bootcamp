package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao {
    // ürün ile ilgili işlemleri burada yapıyoruz
    // sadece database erişim kodları buraya yazılacak

    public void add(Product product) {
        System.out.println("JDBC ile veritabanına eklendi.");
        //System.out.println("Hibernate ile veritanına eklendi");
    }

}
