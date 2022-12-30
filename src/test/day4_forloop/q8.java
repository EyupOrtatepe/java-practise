package test.day4_forloop;

public class q8 {
    public static void main(String[] args) {


       String s="arabalar cam";
       int a=0;

        for (int i = 0; i <s.length()-1 ; i++) {

            if (s.charAt(i)=='a'){

                a++;
            } else if (s.charAt(i)=='c') {
                break;

            }
        }
        System.out.println("cumlede a  :"+a);

    }
}
