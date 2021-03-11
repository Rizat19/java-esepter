package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        //Дано целое число N > 1, а также первый член A и разность
        // D арифметической прогрессии. Сформировать и вывести
        // массив размера N, содержащий N первых членов данной прогрессии: A, A+D, A+2D, A+3D
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число(N > 1): ");
        int N = scanner.nextInt();
        System.out.println("Первый член арифметической прогрессии(A): ");
        int A = scanner.nextInt();
        System.out.println("Разность арифметической прогрессии(D): ");
        int D = scanner.nextInt();
        if (N>1){
            int[] array = new int[N];
            for (int i = 0; i < array.length; i++){
                array[i] = A+i*D;
            }
            System.out.println(Arrays.toString(array));
        }else{
            System.out.println("Пожалуйста, Введите целое число(N > 1)!!!");
        }
    }
}
