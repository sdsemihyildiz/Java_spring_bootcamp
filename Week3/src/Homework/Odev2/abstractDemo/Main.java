package Homework.Odev2.abstractDemo;

public class Main {
    public static void main(String[] args) {

        CustomerManager customerManager = new CustomerManager();
        customerManager.databaseManager = new OracleDatabaseManager();

      //  customerManager.databaseManager = new SqlServerDatabaseManager();
        customerManager.getCustomer();
    }
}
