package Homework.Odev2.Interfaces;

public class Main {
    public static void main(String[] args) {
//        ICustomerDal customerDal = new MySQLCustomerDal();
//        customerDal.add();
            CustomerManager customerManager = new CustomerManager(new MySQLCustomerDal());
            customerManager.add();

    }
}
