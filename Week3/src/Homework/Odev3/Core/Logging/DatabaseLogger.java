package Homework.Odev3.Core.Logging;

public class DatabaseLogger implements BaseLogger {

    @Override
    public void log(String data) {
        System.out.println("Veritabanına loglandı : " + data);
    }
}
