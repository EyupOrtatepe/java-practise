package test.day09;

import java.util.Scanner;

public class hesapMakinasi {
    public static void main(String[] args) {
//        Basit 4 işlem yapan bir hesap makinesi kodlayınız.
//
//        Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayinız.
//        Kullanicidan iki sayi girmesini isteyiniz.
//                Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirınız.

        Scanner scan= new Scanner(System.in);
        System.out.println("hangi islem : ");
        String sembol= scan.next();

        System.out.println("iki sayi girinizi : ");
        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();
        double sonuc=0;

        switch (sembol){
            case "+" :
                System.out.println("Sayilarin toplami : " + (sayi1+sayi2));
                break;
            case "-" :
                System.out.println("Sayilarin farki : " + (sayi1-sayi2));
                break;
            case "*":
                System.out.println("Sayilarin carpimi :" + sayi1*sayi2);
                break;
            case "/" :
                System.out.println("Sayilarin bolumu : " + sayi1/sayi2);
                break;
            default:
                System.out.println("yanlis islem tercihi");
        }

    }
}
