package loopspratics;

import java.util.Scanner;

public class WhileLoops01 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("baslangıc degeri");
        int a = input.nextInt();

        System.out.println("bitiş degeri");
        int b = input.nextInt();


        int i=a;
        while (i<=b){
            if(i%2==0){
                System.out.println(i);
            }
            i++;

        }


    }
    }

