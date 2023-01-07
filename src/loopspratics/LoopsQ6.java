package loopspratics;

import java.util.Scanner;

public class LoopsQ6 {
    public static void main(String[] args) {

        //kullanıcıdan rakam girmesini isteyin. girdiği rakamın faktoriyelini bulun.


        Scanner input = new Scanner(System.in);
        System.out.println("lütfen  sayiyi gir");
        int s1 = input.nextInt();
         int bos= 1;

         for (int i=s1; i>=1;i--){
             bos = bos*i;
         }
        System.out.println(bos);
    }
}
