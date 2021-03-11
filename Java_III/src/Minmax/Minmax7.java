package Minmax;

import java.util.Arrays;
import java.util.Scanner;

public class Minmax7 {
    public static void main(String[] args) {
        //Дано целое число N и набор из N целых чисел.
        // Найти номера первого максимального и последнего минимального элемента
        // из данного набора и вывести их в указанном порядке.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целое число: ");
        int N = scanner.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < array.length; i++){
            array[i] = array.length-i;
        }
        System.out.println(Arrays.toString(array));
        int max = array[0];
        int min = array[0];
        int minIndex=0;
        int maxIndex=0;
        for (int i = 1; i < array.length; i++){
            if (array[i]<min && i==array.length-1){
                min = array[i];
                minIndex=i;
            }
            if (array[i]>max && maxIndex==0){
                max = array[i];
                maxIndex=i;
            }
        }
        System.out.println("Максимальный/первый/ элемент из данного набора : "+max+",номер: "+maxIndex);
        System.out.println("Минимальный/последний/ элемент из данного набора : "+min+",номер: "+minIndex);
    }
}
