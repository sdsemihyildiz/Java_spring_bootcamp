package Homework.Methods.Intro;


import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        //Scanner classı ile kullanıcıdan input alıyoruz
        Scanner in = new Scanner(System.in);
        System.out.println("Birinci sayi: ");
        int num1 = in.nextInt();
        System.out.println("Ikinci sayi: ");
        int num2 = in.nextInt();
        in.close();
        System.out.println("Sayilarin toplamlari: " + topla(num1, num2));
        System.out.println(sehirVer());
        int toplam = topla2(1, 2, 3, 4, 5, 6, 7);
        System.out.println(toplam);


    }

    public static void ekle() {
        System.out.println("Eklendi.");
    }

    public static void sil() {
        System.out.println("Silindi.");
    }

    public static void guncelle() {
        System.out.println("Guncellendi.");
    }

    public static int topla(int number1, int number2) {

        return number1 + number2;
    }

    public static int topla2(int... numbers) { //variable arguments
        int toplam = 0;
        for (int sayi : numbers) {
            toplam += sayi;
        }
        return toplam;
    }

    public static String sehirVer() {

        return "Istanbul";
    }
}
