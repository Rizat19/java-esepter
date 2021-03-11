package Minmax;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

public class Minmax4 {
    public static void main(String[] args) {
        //Дано целое число N и набор из N чисел. Найти номер минимального элемента из данного набора.
        Scanner scanner = new Scanner(System.in);
        SecureRandom random = new SecureRandom();

        System.out.println("Введите целое число: ");
        int N = scanner.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(15);
        }
        System.out.println(Arrays.toString(array));
        int min = array[0];
        int minIndex = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i]<min){
                min = array[i];
                minIndex=i;
            }
        }
        System.out.println("Номер минимального элемента из данного набора : "+minIndex);
    }
}
