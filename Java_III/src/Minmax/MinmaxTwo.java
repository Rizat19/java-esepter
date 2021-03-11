package Minmax;

import java.util.Arrays;
import java.util.Scanner;

/*Дано целое число N и набор из N прямоугольников,
заданных своими сторонами — парами чисел (a, b). Найти минимальную площадь прямоугольника из данного набора.*/
public class MinmaxTwo {
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
            int s=areaRectangle(a,b);
            System.out.println("Площадь прямоугольника, со сторонами ("+a+","+b+"): "+s);
            myArray[i]=s;
        }
        System.out.println(Arrays.toString(myArray));

        int min=myArray[0];
        System.out.println("минимальная площадь прямоугольника из данного набора: "+minAreaRectangle(myArray, min));
    }

    public static int areaRectangle(int a, int b) {
        return a * b;
    }

    public static int minAreaRectangle(int[] myArray,int minAreaRect){
        for (int j : myArray) {
            if (j < minAreaRect) {
                minAreaRect = j;
            }
        }
        return minAreaRect;
    }
}


