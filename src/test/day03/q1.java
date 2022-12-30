package day03;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        /*
   Kullanicidan uc adet sayi alarak bu sayilarin
   bir dik ucgenin kenar uzunluklari olup olmadigini hesaplatan bir kod yaziniz
   NOT:
   Bir ucgenin dik oldugunu anlamak icin a2+b2=c2 pisagor
   denkleminden yararlanabilirsiniz.
   -----Ornek Ekran Ciktisi-----
   ilk kenari giriniz: 2
   ikinci kenari giriniz 15
   üçüncü kenari giriniz: 7
   Bu bir dik ucgen degildir.
   Bu bir dik ucgendir.
*/
        Scanner scan = new Scanner(System.in);
        System.out.println("3 kenar giriniz :");
        System.out.println("kenar a :");
        int a= scan.nextInt();

        System.out.println("kenar b :");
        int b= scan.nextInt();

        System.out.println("kenar c :");
        int c= scan.nextInt();

        if ((a*a) +(b*b)==(c*c)) System.out.println("dik ucgendir ");
        else if ((b*b) +(c*c)==(a*a)) System.out.println("dik ucgendir ");
        else if ((a*a) +(c*c)==(b*b)) System.out.println("dik ucgendir ") ;
        else System.out.println("dik ucgen degil");


        System.out.println("=========2. cozum======== ");

        if ((a*a) +(b*b)==(c*c) ||(b*b) +(c*c)==(a*a) ||(a*a) +(c*c)==(b*b) )System.out.println("dik ucgendir ");
        else System.out.println("dik ucgen degil");


    }
}
