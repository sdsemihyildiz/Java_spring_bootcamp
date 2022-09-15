package StringsDemo;

public class Main {
    public static void main(String[] args) {

        String message = "Today weather is so good.";
        System.out.println(message);

   /*
        System.out.println("Element number: " + message.length());

        System.out.println("5. element: " + message.charAt(4));
        System.out.println(message.concat(" Yeey!"));
        System.out.println(message.startsWith("T"));
        System.out.println(message.endsWith("."));
        char [] c = new char[5];
        message.getChars(0,5,c,0);
        System.out.println(c);
        System.out.println(message.indexOf('a'));
        System.out.println(message.indexOf("we"));
        System.out.println(message.lastIndexOf("we"));

    */
        System.out.println(message.replace(' ','-'));




    }
}
