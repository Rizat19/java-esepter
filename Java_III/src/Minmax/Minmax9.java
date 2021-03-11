package Minmax;

import java.util.Arrays;
import java.util.Scanner;

public class Minmax9 {
    public static void main(String[] args) {
        //Дано целое число N и набор из N целых чисел.
        // Найти номера первого и последнего максимального элемента из данного набора и вывести их в указанном порядке.
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
        int max = array[0];
        int maxLast = array[array.length-1];
        int maxIndex=0;
        int maxLastIndex=array.length-1;
        for (int i = 1; i < array.length; i++){
            if (array[i]>max && i==1){
                max = array[i];
                maxIndex=i;
            }
            if (array[i]>maxLast && i==array.length-2){
                maxLast = array[i];
                maxLastIndex=i;
            }
        }
        System.out.println("Минимальный/первый/ элемент из данного набора : "+max+",номер: "+maxIndex);
        System.out.println("Минимальный/последний/ элемент из данного набора : "+maxLast+",номер: "+maxLastIndex);
    }
}
