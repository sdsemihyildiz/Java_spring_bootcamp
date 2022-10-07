package oopWithNLayeredApp.core.logging;

import oopWithNLayeredApp.core.logging.Logger;

public class DatabaseLogger implements Logger {
    @Override
    public void log(String data) {
        System.out.println("Veritabanına logladı: " + data);
    }
}
