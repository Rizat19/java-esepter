package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array4 {
    public static void main(String[] args) {
        //Дано целое число N> 1, а также первый член A и знаменатель
        // D геометрической прогрессии. Сформировать и вывести массив размера N,
        // содержащий N первых членов данной прогрессии: A, A*D, A*D^2, A*D^3
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число(N > 1): ");
        int N = scanner.nextInt();
        System.out.println("Первый член геометрической прогрессии(A): ");
        int A = scanner.nextInt();
        System.out.println("Разность геометрической прогрессии(D): ");
        int D = scanner.nextInt();
        if (N>1){
            int[] array = new int[N];
            for (int i = 0; i < array.length; i++){
                array[i] = A* (int) Math.pow(D,i);
            }
            System.out.println(Arrays.toString(array));
        }else{
            System.out.println("Пожалуйста, Введите целое число(N > 1)!!!");
        }
    }
}
