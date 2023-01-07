package loopspratics;

import java.util.Scanner;

public class LoopsQ3 {
    public static void main(String[] args) {

        // EXP: kullanıcıdan 100 den kücük tam sayi isteyin. 1 den baslayarak 1 den sayıya kadar 3 ve 5 ün
        // katı olan sayıları yazdırın.
        // sayi 3 ün katıysa java yazdir.
        // sayi 5 in katıysa güzeldir yazdir.
        // sayi hem 3 ün hem 5 n katıysa java güzeldir yazdır.


        Scanner input = new Scanner(System.in);
        System.out.println("lütfen sayi gir");
        int sayi = input.nextInt();

        if (sayi<101 && sayi>0){
            for (int i=1; i<=sayi; i++){
                if (i%3==0) {
                    System.out.println("java");
                } else if (i%5==0) {
                    System.out.println("güzeldir");
                } else if (i%5==0 && i%3==0) {
                    System.out.println("java güzeldir");
                }
            }
    }else{
            System.out.println("hatali giris");
        }

}
}