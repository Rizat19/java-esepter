import java.util.Scanner;
public class Exersices {
    public static void main(String[] args) {

        //gradeCalculator
        Scanner input=new Scanner(System.in);
        int sum=0;
        int count=0;
        while (true) {
            System.out.print("Please enter grade or negative number to quit:");
            int mark= input.nextInt();
            if (mark>0) {
                sum += mark;
                count++;
            }
            if (mark<0)
            {
                System.out.println("Bye!");
                break;
            }
        }

        if (sum!=0) {
            double average=(double) sum/count;
            System.out.printf("%nTotal of the %d grades entered is %d%n",count, sum);
            System.out.printf("Average: %.2f",average);
        }else{
            System.out.println("No grades were entered!!!");
        }


    }
}
