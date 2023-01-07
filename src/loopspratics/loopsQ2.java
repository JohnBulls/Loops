package loopspratics;

import java.util.Scanner;

public class loopsQ2 {
    public static void main(String[] args) {


        // EXP: kullanıcıdan 100 den kücük tam sayi isteyin. 1 den baslayarak 1 den sayıya kadar 3 ve 5 ün katı olan sayıları yazdırın.


        Scanner input = new Scanner(System.in);
        System.out.println("lütfen sayi gir");
        int sayi = input.nextInt();

        if (sayi<101 && sayi>0){
            for (int i=0; i<=sayi; i++){
                if (i%3==0 || i%5==0) {
                System.out.println(i);
                }
    }
}
    }

}