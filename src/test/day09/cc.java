package test.day09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class cc {
    public static void main(String[] args) {
        List<String> weekDays = Arrays.asList("Pazartesi", "Sali", "Carsamba", "Persembe", "Cuma", "Cumartesi", "Pazar");
        Scanner sc = new Scanner(System.in);
        System.out.println("Lutfen pazartesinden baslayarak gunluk kazancinizi listeye ekleyin");
        double kazanc = 0;
        List<Double> gunlukKazanc = new ArrayList<>();

        for (int i = 0; i < weekDays.size(); i++) {

            for (String each : weekDays) {
                System.out.print(each + "= ");
                gunlukKazanc.add(sc.nextDouble());
            }
            break;
        }
        System.out.println("gunluk kazanc " +gunlukKazanc);
        double ortalamaKazanc = getOrtalamaKazanc(gunlukKazanc);
        System.out.println("ortalama gunluk kazanciniz= " + ortalamaKazanc);
        System.out.println("ortalamanin ustunde kazandigin gunler= " + getOrtalamaninUstundeKazancGünleri(gunlukKazanc, weekDays, ortalamaKazanc));
        System.out.println("ortalamanin altinda kazandigin gunler= " + getOrtalamaninAltindaKazancGünleri(gunlukKazanc, weekDays, ortalamaKazanc));
    }

    public static double getOrtalamaKazanc(List<Double> gunlukKazanc) {
        double toplam = 0;
        double ortKazanc = 0;
        for (Double each : gunlukKazanc) {
            toplam += each;
            ortKazanc = toplam / gunlukKazanc.size();
        }
        return ortKazanc;
    }

    public static List<String> getOrtalamaninUstundeKazancGünleri(List<Double> gunlukKazanc, List<String> weekDays, double ortalamaKazanc) {
        List<Double> ortUstKazancGunList = new ArrayList<>();
        List<String> gun = new ArrayList<>();
        for (int i = 0; i < weekDays.size(); i++) {
            if (gunlukKazanc.get(i) > ortalamaKazanc) {
                gun.add(weekDays.get(i));
            }
        }
        return gun;
    }

    public static List<String> getOrtalamaninAltindaKazancGünleri(List<Double> gunlukKazanc, List<String> weekDays, double ortalamaKazanc) {
        List<String> gun = new ArrayList<>();
        for (int i = 0; i < weekDays.size(); i++) {
            if (gunlukKazanc.get(i) < ortalamaKazanc) {
                gun.add(weekDays.get(i));
            }
        }
        return gun;
    }

}
