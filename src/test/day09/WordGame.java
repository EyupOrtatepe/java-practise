package test.day09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class WordGame {
//    * Basit bir 5 ürünlü manav alisveris programi yaziniz.
//
//   1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
//   2. Adim : Baska bir urun almak isteyip istemedigini sor. istemiyorsa toplam miktari goster,
//   istiyorsa tekrar urun sectir. Bu islemi alisverisi
//    bitirmek isteyene kadar tekrarla.
//   3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
//   4. Adim : Alisveris bitince toplam odemesi gereken tutari goster
public static void main(String[] args) {

    List<String>urunler=new ArrayList<>();
    List<Double>fiyatListesi=new ArrayList<>();
    double toplam=0;
    double kilo=0;
    double fiyat=0;
    int kacKilo=0;
    int secim=0;


    urunler= Arrays.asList("muz","elma","armut","kivi","cilek");
    fiyatListesi= Arrays.asList(10.0,20.0,5.0,6.5,4.0);
    Scanner scanner=new Scanner(System.in);
    char isterMi;
do {
    System.out.println("hangi urunu isterseniz numarasini giriniz : \n1- muz\n2- elma\n3- armut\n4- kivi\n5- cilek");
    secim= scanner.nextInt();
    System.out.println("kac kilo ?");
    kacKilo= scanner.nextInt();
    System.out.println("baska urun ister misiniz? e/h?");
    isterMi= scanner.next().charAt(0);

    toplam+= kacKilo* (fiyatListesi.get(secim-1));


}  while (isterMi!='h');
        System.out.println("borcunuz : "+toplam);


}
}
