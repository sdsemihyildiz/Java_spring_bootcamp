package Homework.Odev2.staticDemo;

public class ProductManager {

    // ürünü veritabanına ekleyen class
    // Manager gibi sınıflar statik yapılmaz fakat validator gibi yardımcı araçlar static yapılabilir
    // Bir metod statik yapılırsa class ismi ile direkt çağırılabilir


    public void add(Product product) {

        if (ProductValidator.isValid(product)) {
            System.out.println("Eklendi");
        } else System.out.println("Ürün bilgileri geçersiz. Ürün eklenemedi.");
    }

}
