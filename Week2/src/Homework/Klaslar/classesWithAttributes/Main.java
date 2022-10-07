package Homework.Klaslar.classesWithAttributes;

public class Main {
    public static void main(String[] args) {
        Product product = new Product(1, "Laptop", "Asus_Laptop", 16500, 2, "Black");
        /*
        product.setName("Laptop");
        product.setDescription("Asus_laptop");
        product.setId(1);
        product.setPrice(5000);
        product.setStock(21);
        product.setColour("red");
         */
        // System.out.println("Ürünün adı:" + product.name + "\nÜrün Markası: " + product.description + "\nÜrün ID: " + product.id + "\nStok: " + product.stock + "\nFiyat: " + product.price);

        System.out.println(product.getKod());
        ProductManager pm = new ProductManager();
        pm.add(product);
        pm.add2(1, "", "", 2, 20);



    }

}
