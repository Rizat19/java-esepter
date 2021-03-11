package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        //Дано целое число N > 0. Сформировать и вывести 
        // целочисленный массив размера N, содержащий 
        // N первых положительных нечетных чисел: 1, 3, 5, … .
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число(N > 0): ");
        int N = scanner.nextInt();
        if (N>0){
            int[] array = new int[N];
            for (int i = 0; i < array.length; i++){
                array[i] = 1+i*2;
            }
            System.out.println(Arrays.toString(array));
        }else{
            System.out.println("Пожалуйста, Введите целое число(N > 0)!!!");
        }
    }
}
