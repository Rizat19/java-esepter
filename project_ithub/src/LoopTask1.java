import java.util.Scanner;

public class LoopTask1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the number of iterations:");
        int numberOfIterations=input.nextInt();
        for (int i=0;i<numberOfIterations;i++)
        {
            System.out.println("Enter the group of 3 numbers:");
            int a=input.nextInt();
            int b= input.nextInt();
            int n= input.nextInt();
            int result=a;
            for (int j=0;j<n;j++){
                result+=Math.pow(2,j)*b;
                System.out.print(result+" ");
            }
            System.out.println();
        }
    }
}
