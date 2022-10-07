package OOP1;

public class Main {

    public static void main(String[] args) {

        Product product1 = new Product();
        product1.setName("Delonghi Kahve Makinesi");
        product1.setUnitPrice(7500);
        product1.setDiscount(7);
        product1.setUnitInStock(3);
        product1.setImageUrl("image1.jpg");


        Product product2 = new Product();

        product2.setName("Smeg Kahve Makinesi");
        product2.setUnitPrice(6500);
        product2.setDiscount(8);
        product2.setUnitInStock(4);
        product2.setImageUrl("image2.jpg");

        Product product3 = new Product();

        product3.setName("Kitchen Aid Kahve Makinesi");
        product3.setUnitPrice(9500);
        product3.setDiscount(9);
        product3.setUnitInStock(2);
        product3.setImageUrl("image3.jpg");

        Product[] products = {product1, product2, product3};


        System.out.println("<ul>");
        for (Product product : products) {
            System.out.println("<li>" + product.getName() + "</li>");
        }
        System.out.println("</ul>");

        IndividualCustomer individualCustomer = new IndividualCustomer();

        individualCustomer.setId(1);
        individualCustomer.setPhone("05068281580");
        individualCustomer.setCustomerNumber("12345");
        individualCustomer.setFirstName("Semih");
        individualCustomer.setLastName("Yildiz");


        CorperateCustomer corperateCustomer = new CorperateCustomer();

        corperateCustomer.setId(2);
        corperateCustomer.setCompanyName("Anadolu Diyabet");
        corperateCustomer.setPhone("05373573836");
        corperateCustomer.setTaxNumber("31256788");
        corperateCustomer.setCustomerNumber("54321");


        Customer[] customers = {individualCustomer, corperateCustomer};
        

    }
}
