package Homework.Odev2.PolimorphismDemo;

public class ConsoleLogger extends BaseLogger {
    public void log(String message) {
        System.out.println("Logged to console : " + message);
    }
}
