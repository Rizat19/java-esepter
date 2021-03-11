package Minmax;

import java.util.Arrays;
import java.util.Scanner;

public class Minmax10 {
    public static void main(String[] args) {
        //Дано целое число N и набор из N целых чисел.
        // Найти номер первого экстремального (то есть минимального или максимального) элемента из данного набора.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целое число: ");
        int N = scanner.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < array.length; i++){
            if (i%2==0){
                array[i]=(i+1)*3;
            }else {
                array[i]=i*2;
            }
        }
        System.out.println(Arrays.toString(array));
        int max = array[0];
        int maxIndex=0;
        int min = array[0];
        int minIndex=0;
        for (int i = 1; i < array.length; i++){
            if (array[i]>max && i==1){
                max = array[i];
                maxIndex=i;
            }
            else if (array[i]<min && i==1){
                min = array[i];
                minIndex=i;
            }
        }
        if (maxIndex>minIndex){
            System.out.println("Максимальный/первый/ элемент из данного набора : "+max+",номер: "+maxIndex);
        }else{
            System.out.println("Минимальный/первый/ элемент из данного набора : "+min+",номер: "+minIndex);
        }

    }
}
