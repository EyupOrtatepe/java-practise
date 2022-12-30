package test.day02;

import java.util.Scanner;

public class Q02_SwithcCase_HesapMakinesi {
    public static void main(String[] args) {

        /*
         * Kullanicidan iki tamsayi sayi ve islem cinsini alin
         * ve sayilari kullanicinin belirledigi isleme tabii tutup sonucu yazdirin.
         *
         * islem cinsi icin 1:toplama 2:cikarma 3:carpma 4: bolme
         *
         * Ornek : Inputs : sayilar : 18 , 10  islem : 3
         *         Output : 18 X 10 = 180

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("iki tam sayi giriniz");

        int a = scan.nextInt();
        int b= scan.nextInt();

        System.out.println("islem turunu seciniz : \n1 : Toplama\n2 : Cikarma\n3: Carpma\n4: Bolme");

        int islem= scan.nextInt();

        /*

        if (islem==1) System.out.println(a+b);
        else if (islem==2) System.out.println(a-b);
        else if (islem==3) System.out.println(a*b);
        else if (islem==4) System.out.println(a/b);
        else System.out.println("hatali giris");
        */



        System.out.println("switchcase cozumu");

        switch (islem){
            case 1 : System.out.println(a+b); break;
            case 2 : System.out.println(a-b);break;
            case 3 : System.out.println(a*b);break;
            case 4 : System.out.println(a/b);break;
            default:
                System.out.println("hatali giris");






        }



    }
}
