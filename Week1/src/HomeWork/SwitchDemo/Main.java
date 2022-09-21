package HomeWork.SwitchDemo;

public class Main {
    public static void main(String[] args) {
        char grade = 'A';
        switch (grade){
            case 'A':
                System.out.println("Perfect: passed");
                break;
            case 'B':
                System.out.println("Very good: passed");
                break;
            case 'C':
                System.out.println("Good: passed");
                break;
            case 'D':
                System.out.println("Slightly good: passed");
                break;
            case 'F':
                System.out.println("Failed");
                break;
            default:
                System.out.println("Incorrect input.");

        }
    }
}
