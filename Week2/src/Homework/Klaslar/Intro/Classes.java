package Homework.Klaslar.Intro;

public class Classes {
    public static void main(String[] args) {
        //reference type
        CustomerManager cm = new CustomerManager();
        CustomerManager cm2 = new CustomerManager();
        cm = cm2;
        cm.Add();
        cm.Remove();
        cm.Update();

        //value type
        int number1 = 10;
        int number2 = 20;
        number2 = number1;
        number1 = 30;
        System.out.println(number2);

        //reference type
        int [] numbers1 = new int[]{1,2,3};
        int [] numbers2 = new int[]{4,5,6};
        numbers2=numbers1;
        numbers1[0]=10;
        System.out.println(numbers2[0]);




    }

}
