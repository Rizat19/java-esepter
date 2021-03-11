import java.util.Scanner;
public class CheckPassFail {
    public static void main(String[] args) {
        //Напишите программу с именем, CheckPassFail которая печатает " PASS", если int переменная
        //" mark" больше или равна 50; иначе выводит " FAIL". Программа всегда должна печатать « DONE»
        //перед выходом.
        Scanner input=new Scanner(System.in);
        System.out.print("Enter mark:");
        int mark= input.nextInt();
        System.out.println("Mark is:"+mark);

        if (mark>=50){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }
        System.out.println("DONE");

    }
}
