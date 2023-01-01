package test.day09;

import java.util.Scanner;

public class ConstructorSorusu {
    public static void main(String[] args) {
//        Constructor Sorusu-
//                1. Aşama: Başlangıçta İlk Oyuncuya oyunu başlatmak için bir kelime girmesini iste.
//        2. Aşama: Sonra oyuncuyu degiştir ve ikinci oyuncuya geç. Yeni oyuncuya verilen kelimenin geçerli olup olmadıgını sor
//        2.1) Eğer yeni oyuncu verilen kelimeyi kabul ederse : kelimeyi yazan oyuncuya puan olarak kelimedeki harf sayısını ekleyin ve 3. adıma gidin
//        2.2) Eğer yeni oyuncu verilen kelimeyi	geçerli olarak kabul etmesse "Geçersiz kelime, oyuncu X(Mevcut oyuncu) oyunu kazandı" yazıp oyunu bitirin.
//        3. Aşama: Kullanıcılara oyuna devam etmek isteyip istemediklerini sor: Eğer devam etmek isterlerse:
//        3.1) Kullanıcıdan kelimeye eklemek için bir harf isteyin
//        3.2) Ve kullanıcıya hangi tarafa eklemek istedigini sorun (Başa veya Sona)
//        3.3) Daha sonra harfi kelimeye ekleyin ve 2.Aşamaya geçin Eğer devam etmek istemezlerse: "Game Finished" yazdırın.
////                Puanları ve kazananı ekrana yazdırın


        Scanner scan=new Scanner(System.in);
        System.out.println("kelime girin : ");
        String kelime1= scan.next();
        System.out.println(" kelime gecerli mi? e veya h ?");
        char secim= scan.next().charAt(0);
        int p1=0;
        int p2=0;

        if (secim=='e'){
                        p1+= kelime1.length();
            System.out.println("p1 in puani : "+ p1);

            } else {
            System.out.println("Geçersiz kelime, oyuncu X(Mevcut oyuncu) oyunu kazandı");
            return;
            }

        System.out.println(" devam etmek icin e yziniz : ");
        char devam= scan.next().charAt(0);

        if (devam=='e'){
            System.out.println("kelimeye ek harf giriniz : ");
            char harf= scan.next().charAt(0);
            System.out.println("harfi kelimenin basina mi sonuna mi eklemek istersiniz? bas/son?");
            String tercih= scan.next();

            if (tercih.equals("bas")) {
                System.out.println(harf+kelime1);
            } else System.out.println(kelime1+harf);
            return;

        }System.out.println("game finished");










    }
}
