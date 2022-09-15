package loopDemo;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("Loop is over.");

        //while
        int i = 2;
        while (i < 10) {
            System.out.println(i);
            i += 2;
            //i++;
        }
        System.out.println("While loop is over.");

        //do-while
        int j=20;
        do {
            System.out.println(j);
            j += 2;
        } while (j < 10);
        System.out.println("Do-While loop is over.");

    }
}
