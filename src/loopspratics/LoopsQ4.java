package loopspratics;

import java.util.Scanner;

public class LoopsQ4 {
    public static void main(String[] args) {

        // kullanıcıdan string isteyin stringi tersten yazdırın.


        Scanner input = new Scanner(System.in);
        System.out.println("lütfen isim gir");
        String isim = input.nextLine();

        for(int i=isim.length()-1;i>=0;i--){
            System.out.print(isim.charAt(i));
        }





    }
}
