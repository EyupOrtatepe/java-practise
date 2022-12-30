package test.day4_forloop;

        public class q7 {
                public static void main(String[] args) {


                        System.out.println(mukemmel(1,10000));


                }

        //1-100 e kadar olan sayıların içinde mükemmel olanları yazdıran metodu yazınız

        public static boolean mukemmel(int bas, int son){



                for (int i = 1; i <10000 ; i++) {
                        int toplam=0;
                        for (int j = 1; j <i ; j++) {

                                if (i%j==0){
                                        toplam +=j;
                                }

                        }
                        if (toplam==i){
                                System.out.println(i+ "  muk ");

                        }

                }


                return false;
        }

}
