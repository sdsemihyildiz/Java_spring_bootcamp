package Homework.Odev1;

public class Customer {
    private int id;

    public Customer() {
        System.out.println("Customer object started.");
    }

    public Customer(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
