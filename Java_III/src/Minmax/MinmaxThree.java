package Minmax;
/*Дано целое число N и набор из N прямоугольников,
заданных своими сторонами — парами чисел (a, b). Найти максимальный периметр прямоугольника из данного набора.*/

import java.util.Arrays;
import java.util.Scanner;

public class MinmaxThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целое число: ");
        int N = scanner.nextInt();
        int[] myArray = new int[N];
        for (int i = 0; i < N; i++){
            System.out.println("Введите число а: ");
            int a=scanner.nextInt();
            System.out.println("Введите число b: ");
            int b=scanner.nextInt();
            int s=perimetrRectangle(a,b);
            System.out.println("Периметр прямоугольника, со сторонами ("+a+","+b+"): "+s);
            myArray[i]=s;
        }
        System.out.println(Arrays.toString(myArray));

        int max=myArray[0];
        System.out.println("Максимальный периметр прямоугольника из данного набора: "+maxPerimetrRectangle(myArray, max));
    }

    public static int perimetrRectangle(int a, int b) {
        return 2*(a+b);
    }

    public static int maxPerimetrRectangle(int[] myArray,int maxPerimetr){
        for (int j : myArray) {
            if (j > maxPerimetr) {
                maxPerimetr = j;
            }
        }
        return maxPerimetr;
    }
}
