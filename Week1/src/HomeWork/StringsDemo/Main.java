package HomeWork.StringsDemo;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        String message = "Today weather is so good.";
        System.out.println(message);

   /*
        System.out.println("Element number: " + message.length());

        System.out.println("5. element: " + message.charAt(4)); // istediğimiz indexteki elemanı getirme
        System.out.println(message.concat(" Yeey!")); // mesajı başka bir mesaj ile birleştirme
        System.out.println(message.startsWith("T"));
        System.out.println(message.endsWith("."));
        char [] c = new char[5];
        message.getChars(0,5,c,0);
        System.out.println(c);
        System.out.println(message.indexOf('a'));
        System.out.println(message.indexOf("we"));
        System.out.println(message.lastIndexOf("we"));

    */
        String newMessage = message.replace(' ', '-'); //Boşlukları - işareti ile değiştiriyor
        System.out.println("New Message is: " + newMessage);
        System.out.println(message.substring(2)); // 2. index'den itibaren yazıyor
        System.out.println(message.substring(2,7)); // 2. index ile 7. index arasında

        System.out.println("---------");

        for (String wrd: message.split(" ")){  // her bir bolukta satır atlıyor ve ayırıyor
            System.out.println(wrd);
        }

        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());





    }
}
