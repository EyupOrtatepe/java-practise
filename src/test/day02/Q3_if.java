package test.day02;

import java.util.Scanner;

public class Q3_if {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");

         try {
             double sayi = scan.nextDouble();
             if (sayi >= 0) {
                 if (sayi < 10) {
                     System.out.println("Rakam");
                 }else {System.out.println("iki basamaklı veya daha buyuk bir sayi");}

             } else if (sayi < 0) {
                 System.out.println("Negatif Sayi");

         }


        }catch (Exception e) {
            System.out.println("yanliş giriş yaptınız lutfen bir sayi giriniz");
        }


    }
}
