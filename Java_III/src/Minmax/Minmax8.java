package Minmax;

import java.util.Arrays;
import java.util.Scanner;

public class Minmax8 {
    public static void main(String[] args) {
        //Дано целое число N и набор из N целых чисел.
        // Найти номера первого и последнего минимального элемента из данного набора и вывести их в указанном порядке.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целое число: ");
        int N = scanner.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < array.length; i++){
            if (i%2==0){
                array[i]=i*2;
            }else {
                array[i]=i*3;
            }
        }
        System.out.println(Arrays.toString(array));
        int min = array[0];
        int minLast = array[array.length-1];
        int minIndex=0;
        int minLastIndex=array.length-1;
        for (int i = 1; i < array.length; i++){
            if (array[i]<min && i==1){
                min = array[i];
                minIndex=i;
            }
            if (array[i]<minLast && i==array.length-2){
                minLast = array[i];
                minLastIndex=i;
            }
        }
        System.out.println("Минимальный/первый/ элемент из данного набора : "+min+",номер: "+minIndex);
        System.out.println("Минимальный/последний/ элемент из данного набора : "+minLast+",номер: "+minLastIndex);
    }
}
