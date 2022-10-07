package Homework.Odev1;

public abstract class BaseCreditManager implements ICreditManager{
    public abstract void calculate();
    public void save(){
        System.out.println("Register done.");
    }
}
