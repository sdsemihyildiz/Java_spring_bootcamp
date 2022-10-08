package Homework.Odev2.abstractDemo;

public class SqlServerDatabaseManager extends BaseDatabaseManager{

    @Override
    public void getData() {
        System.out.println("Veri getirildi : SqlServer");
    }
}
