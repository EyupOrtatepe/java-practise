package test.day03;

import java.util.Scanner;

public class q2_BolmeOpKullanmadanBolme {

    public static void main(String[] args) {

        // Kullanicidan bolunen ve bolen seklinde 2 sayi alalim ve bolme operatoru
        // kullanmadan bolme islemini gerceklestirip bolumu hesaplayan method create ediniz.

        Scanner scan = new Scanner(System.in);
        System.out.println("bolmek istediginiz sayiyi girin : ");
        int a= scan.nextInt();

        System.out.println("bolen sayiyi girin : ");
        int b= scan.nextInt();


        System.out.println("islem sonucu : "+ bol(a, b));


    }

    private static int bol(int bolunen, int bolen) {

        int bolum =0;

        while (bolunen>=bolen){

            bolunen-=bolen;

            bolum++;


        }

        return bolum ;
    }


}
