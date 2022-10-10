package Homework.Odev2.Interfaces;

public class MySQLCustomerDal implements ICustomerDal, IRepository {
    @Override
    public void add() {
        System.out.println("MySQL veritabanına eklendi.");
    }
}
