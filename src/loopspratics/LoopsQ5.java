package loopspratics;

import java.util.Scanner;

public class LoopsQ5 {
    public static void main(String[] args) {


        // EXP : kullanıcıdan iki sayi isteyin iki sayı arasındaki tüm sayıları toplayan program yazın


        Scanner input = new Scanner(System.in);
        System.out.println("lütfen ilk sayiyi gir");
        int s1 = input.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.println("lütfen ikinci sayiyi gir");
        int s2 = input2.nextInt();

        int bos = 0;
        if (s1<s2){

        for(int i =s1; i<=s2; i++){
            bos = bos+i;
            }
            System.out.println(bos);
        }else{
            System.out.println("birinci sayi, ikinci sayidan kucuk olmalıdır");

        }







}
}