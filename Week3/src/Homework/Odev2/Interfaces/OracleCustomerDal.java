package Homework.Odev2.Interfaces;

public class OracleCustomerDal implements ICustomerDal, IRepository {
    @Override
    public void add() {
        System.out.println("Oracle veritabanına eklendi.");
    }
}
