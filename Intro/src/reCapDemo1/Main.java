package reCapDemo1;

public class Main {
    public static void main(String[] args) {
        int number1 = 20, number2 = 25, number3 = 2;
        int highest = number1;
        if (highest < number2) {
            highest = number3;
            System.out.println("Highest number is: " + highest);

        } else if (highest < number3) {
            highest = number3;
            System.out.println("Highest number is: " + highest);

        } else {
            highest = number1;
            System.out.println("Highest number is: " + highest);
        }

    }
}
