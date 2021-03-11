package OOPuniver;

import java.util.Scanner;

public class LabOneTasks {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        boolean isRunning=true;
        while(isRunning){
            System.out.print("Введите первое число: ");
            double firstNumber=scanner.nextDouble();
            System.out.print("Введите второе число: ");
            double secondNumber=scanner.nextDouble();
            System.out.println();
            if(firstNumber>=0 && secondNumber>=0){
                Mean(firstNumber, secondNumber);
                System.out.println("Хотите продолжить программу, 1-да / 0-нет:");
                int process=scanner.nextInt();
                if (process==0){
                    isRunning=false;
                }
            }else{
                System.out.println("Пожалуйста, введите положительные числа!!!");
            }
        }
    }

    public static void Mean(double x, double y){
        double AMean = (x + y) / 2;
        double GMean = Math.sqrt(x * y);
        System.out.println("Среднее арифметическое значение " + x + " и " + y + " равно: " + AMean);
        System.out.println("Среднее геометрическое значение " + x + " и " + y + " равно: " + GMean);
    }
}