package Homework.Odev3.Core.Logging;

public class FileLogger implements BaseLogger {

    @Override
    public void log(String data) {
        System.out.println("Dosyaya loglandı : " + data);
    }
}
