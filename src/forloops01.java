import java.util.Scanner;

public class forloops01 {
    public static void main(String[] args) {

/*


        // EXP 1 : 10 adet java güzeldir yazdırın.

        for (int i=0; i<11;i++){
            System.out.println("java güzeldir");
        }

        // EXP 1 : 10 ve 30 dahil olmak üzere aralarında virgül olarak yanyana yazdırın.
        for (int i=9; i<32;i++){
            System.out.print(i + ",");
        }

        // EXP 1 : 100 ve 50 dahil olmak üzere aralarında virgül olarak yanyana yazdırın.

        for (int i=100; i>49; i--){
            System.out.print(i + ",");
*/
// EXP 1 : kullanıcıdan 100 den kücük tam sayi isteyin. 1 den baslayarak 1 den sayıya kadar 3 ün katı olan sayıları yazdırın.


            Scanner input = new Scanner(System.in);
            System.out.println("lütfen sayi gir");
            int sayi = input.nextInt();

            if (sayi<101 && sayi>0){
                for (int i=0; i<=sayi; i++){
                    if (i%3==0){
                        System.out.println(i);
                    }


            }






    }
}
}