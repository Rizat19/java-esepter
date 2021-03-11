package Minmax;

import java.util.Arrays;
import java.util.Scanner;

public class Minmax5 {
    public static void main(String[] args) {
        //Дано целое число N и набор из N пар чисел (m, v) — данные о массе m и объеме v деталей,
        // изготовленных из различных материалов. Вывести номер детали, изготовленной из материала
        // максимальной плотности, а также величину этой максимальной плотности. Плотность P вычисляется по формуле P = m/v.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целое число: ");
        int N = scanner.nextInt();
        double[] myArray = new double[N];
        for (int i = 0; i < N; i++){
            System.out.println("Введите массу: ");
            int m=scanner.nextInt();
            System.out.println("Введите объем: ");
            int v=scanner.nextInt();
            double p=P(m,v);
            System.out.println("  плотность ("+m+","+v+"): "+p);
            myArray[i]=p;
        }
        System.out.println(Arrays.toString(myArray));

        double max=myArray[0];
        System.out.println(" Максимальная плотность:" + maxP(myArray,max));


    }
    public static double P(int m, int v) {
        return (double) m/v;
    }

    public static double maxP(double[] myArray,double max){
        for (double j : myArray) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }
}
