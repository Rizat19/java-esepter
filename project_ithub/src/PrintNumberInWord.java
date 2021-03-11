import java.util.Scanner;

public class PrintNumberInWord {
    public static void main(String[] args) {
        //Написать программу под названием PrintNumberInWordкоторой печатает « ONE», « TWO», ..., « NINE»,
        //« OTHER» , если int переменная « number» есть 1, 2..., 9 или другой, соответственно.
        //Используйте (а) оператор «вложенный- if»;
        //(б) switch-case-default заявление " ".
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter number (1-9): ");
        int number= scanner.nextInt();

        //a
//        if (number==1){
//            System.out.println("ONE");
//        }else if(number==2){
//            System.out.println("TWO");
//        }else if(number==3){
//            System.out.println("THREE");
//        }else if(number==4){
//            System.out.println("FOUR");
//        }else if(number==5){
//            System.out.println("FIVE");
//        }else if(number==6){
//            System.out.println("SIX");
//        }else if(number==7){
//            System.out.println("SEVEN");
//        }else if(number==8){
//            System.out.println("EIGHT");
//        }else if(number==9){
//            System.out.println("NINE");
//        }else{
//            System.out.println("ERROR");
//        }

        //b
        switch (number) {
            case 1 -> System.out.println("ONE");
            case 2 -> System.out.println("TWO");
            case 3 -> System.out.println("THREE");
            case 4 -> System.out.println("FOUR");
            case 5 -> System.out.println("FIVE");
            case 6 -> System.out.println("SIX");
            case 7 -> System.out.println("SEVEN");
            case 8 -> System.out.println("EIGHT");
            case 9 -> System.out.println("NINE");
            default -> System.out.println("ERROR!");
        }
    }
}
