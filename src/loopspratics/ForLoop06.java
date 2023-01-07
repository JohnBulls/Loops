package loopspratics;

import java.util.Scanner;

public class ForLoop06 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("lütefen sayı giriniz");
        int s = input.nextInt();


        int i=0;
        while (s>0){
            i=i + (s%10);
            s = s/10;
    }
        System.out.println(i);
        System.out.println("merhaba");

}
}