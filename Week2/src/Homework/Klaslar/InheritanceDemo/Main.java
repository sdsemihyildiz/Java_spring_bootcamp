package Homework.Klaslar.InheritanceDemo;

public class Main {
    public static void main(String[] args) {
//        OgretmenKrediManager okm = new OgretmenKrediManager();
//        okm.hesapla();
//        TarimKrediManager tkm = new TarimKrediManager();
//        tkm.hesapla();


        KrediUI krediUI = new KrediUI();
//        krediUI.KrediHesapla(new OgretmenKrediManager());
//        krediUI.KrediHesapla(new BaseKrediManager());
        krediUI.KrediHesapla(new AskerKrediManager());



    }
}
