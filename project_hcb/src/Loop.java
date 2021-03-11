import java.util.Scanner;
public class Loop {
    public static void main(String[] args) {
        //while, do while, for
        Scanner input=new Scanner(System.in);
//        int n=0;
//        double sum=0;
//        while (n<=100){
//            sum+=n;
//            if (n==100){
//                sum/=n;
//                System.out.println("Среднее арифметическое от 0 до 100 равно: "+sum);
//            }
//            n++;
//        }


        for (int i=1000;i>=0;i--){
            if (i%3==0) {System.out.println(i);}
        }



    }
}
