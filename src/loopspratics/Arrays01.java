package loopspratics;

public class Arrays01 {
    public static void main(String[] args) {


        int i =100;
        while (i<1000){
            if (i%15==0 && i%20==0 && i%90==0){
                System.out.println(i);
            }
            i++;
        }



    }
}
