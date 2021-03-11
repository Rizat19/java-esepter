import java.util.Scanner;
public class Days {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a seconds: ");
        int second= input.nextInt();
        int days=second/86400;
        int hours=second/3600;
        int minutes=second/60;
        int lastMinutes=(second-hours*3600)/60;
        System.out.println("second:"+second);
        System.out.println("days:"+days);
        System.out.println("hours:"+hours);
        System.out.println("minutes:"+minutes);
        System.out.println("lastMinutes:"+lastMinutes);
    }
}
