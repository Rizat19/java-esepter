import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please, enter 3 integer numbers:");
        int a= input.nextInt();
        int b= input.nextInt();
        int c=input.nextInt();

        int biggest;
        if (a>=b){
            biggest=a;
        }else{
            biggest=b;
        }
        if (biggest<c){
            biggest=c;
        }

        if (biggest == a) {
            if (a >= b + c) {
                System.out.println("You cannot create a triangle with sides " + a + " " + b + " " + c);
            } else {
                System.out.println("You can create a triangle with sides " + a + " " + b + " " + c);
            }
        } else if (biggest == b) {
            if (b >= a + c) {
                System.out.println("You cannot create a triangle with sides " + a + " " + b + " " + c);
            } else {
                System.out.println("You can create a triangle with sides " + a + " " + b + " " + c);
            }
        } else {
            if (c >= a + b) {
                System.out.println("You cannot create a triangle with sides " + a + " " + b + " " + c);
            } else {
                System.out.println("You can create a triangle with sides " + a + " " + b + " " + c);
            }
        }
    }
}
