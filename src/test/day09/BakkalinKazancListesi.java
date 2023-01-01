package test.day09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BakkalinKazancListesi {
    public static void main(String[] args) {


        List<String> gunler= Arrays.asList("Pazartesi", "Sali", "Carsamba", "Persembe", "Cuma", "Cumartesi", "Pazar");


        List<Double> gunlukKazanclar= new ArrayList<>();
        int gunsayisi=0;


        while (gunsayisi<gunler.size()){
            Scanner scan= new Scanner(System.in);
            System.out.println("Kazanclariniz pazartesi den baslayarak gun gun giriniz : ");
            gunlukKazanclar.add(scan.nextDouble());
            gunsayisi++;

        }
        System.out.println(gunlukKazanclar);
        double orta = getOrtalamaKazanc(gunlukKazanclar);
        System.out.println("ortalama : "+getOrtalamaKazanc(gunlukKazanclar));
        System.out.println(getOrtalamaninUstundeKazancGünleri(gunler, gunlukKazanclar, orta));
        System.out.println(getOrtalamaninAltindaKazancGünleri(gunler, gunlukKazanclar, orta));

    }

    private static List<String> getOrtalamaninAltindaKazancGünleri(List<String> days, List<Double> gelirler, double ortlama) {
        List<String> gunler= new ArrayList<>();
        for (int i = 0; i < days.size(); i++) {
            if (gelirler.get(i)<ortlama){
                gunler.add(days.get(i));
            }
        }

        return gunler;

    }

    private static List<String> getOrtalamaninUstundeKazancGünleri(List<String> days, List<Double> gelirler, double ortlama) {

        List<String> gunler= new ArrayList<>();
        for (int i = 0; i < days.size(); i++) {
            if (gelirler.get(i)>ortlama){
                gunler.add(days.get(i));
            }
        }

        return gunler;
    }

    private static double getOrtalamaKazanc(List<Double> gunlukKarlar) {
        double ortalama=0;
        double toplam=0;
        for (int i = 0; i < gunlukKarlar.size(); i++) {
            toplam = toplam+ gunlukKarlar.get(i);
            ortalama= toplam/ gunlukKarlar.size();
        }

        return ortalama;
    }
}
