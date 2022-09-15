package arraysDemo;

public class Main {
    public static void main(String[] args) {
        String student1 = "Semih";
        String student2 = "Hilal";
        String student3 = "Enes";
        String student4 = "Beyza";

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);

        System.out.println("*************");

        String[] students = new String[4];
        students[0] = "Semih";
        students[1] = "Hilal";
        students[2] = "Enes";
        students[3] = "Beyza";
        //students[4] = "Ali";
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);

        }
        System.out.println("***********");
        for (String student: students){
            System.out.println(student);
        }


    }
}
