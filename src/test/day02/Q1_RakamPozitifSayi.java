package test.day02;

import java.util.Scanner;

public class Q1_RakamPozitifSayi {
    public static void main(String[] args) {

        //Kullanicidan bir sayi aliniz
        //Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
        //10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
        //Sayi 0 dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.

        Scanner scanner= new Scanner(System.in);
        System.out.println("Bir sayi giriniz :");

        int sayi= scanner.nextInt();



        if (sayi>=0){
            if (sayi<10){
                System.out.println("Rakam");
            }else {
                System.out.println("Pozitif Sayi");
            }
        }else {
            System.out.println("Negatif Sayi");
        }



        System.out.println( (sayi>=0) ? ((sayi<10)? "rakam": "pozitif" ) :("negatif"));





    }
}
