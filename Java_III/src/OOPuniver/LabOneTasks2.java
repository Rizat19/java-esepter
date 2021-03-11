package OOPuniver;

import java.util.Scanner;

public class LabOneTasks2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        boolean isRunning=true;
        while(isRunning){
            System.out.print("Введите сторону равностороннего треугольника: ");
            double a=scanner.nextDouble();
            if(a>0){
                System.out.println("Периметр : "+TriangleP(a));
                System.out.println("Площадь: "+TriangleS(a));
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

    public static double TriangleP(double a){
        return 3*a;
    }

    public static double TriangleS(double a){
        return a*a*Math.sqrt(3)/4;
    }
}
