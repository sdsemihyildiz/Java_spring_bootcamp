package Homework.Odev1.demo2;

public class Main {
    public static void main(String[] args) {
        //Reference Type
        int[] numbers1 = {1, 2, 3};
        int[] numbers2 = {10, 20, 30};
        numbers1 = numbers2;
        numbers2[0] = 1000;
        System.out.println(numbers1[0]);
    }
}
