import java.util.Scanner;

public class CheckOddNumber {
    public static void main(String[] args) {
        //Напишите программу с именем, CheckOddEven которая печатает « Odd Number», если int
        //переменная « number» нечетная, или « Even Number» в если значение четное.
        //Программа всегда должна печатать « bye!» перед выходом.

        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter number: ");
        int number= scanner.nextInt();

        if (number%2==0){
            System.out.println("Even number");
        }else{
            System.out.println("Odd number");
        }
        System.out.println("bye!");
    }
}
