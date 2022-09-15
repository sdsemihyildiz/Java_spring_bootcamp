package SayiBulma;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int search = 5;
        boolean isContain = false;
        for (int number : numbers) {
            if (number == search) {
                isContain = true;
                break;
            }
        }
        if (isContain) {
            System.out.println("Sayı mevcuttur");
        } else {
            System.out.println("Sayı mevcut değildir.");
        }
    }


}
