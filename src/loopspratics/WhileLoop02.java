package loopspratics;

import java.util.Scanner;

public class WhileLoop02 {
    public static void main(String[] args) {
        /*


        Kullanıcıdan bir rakam alın ve bu rakam için çarpım tablosu yapın
        kullanıcı 3 girerse
        3X1=3   3X2=6   3X3=6 ...................... 3X10=30

        */

        Scanner input = new Scanner(System.in);
        System.out.println("lütefen rakam giriniz");
        int s = input.nextInt();

        for (int i=1; i<=10;i++){
                System.out.println( s+ "*" +i + "="+ (s*i));
            }










    }
}
