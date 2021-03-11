package Minmax;
import java.util.Arrays;
import java.util.Scanner;

public class Minmax6 {
    public static void main(String[] args) {
        //Дано целое число N и набор из N целых чисел. Найти номера первого минимального
        // и последнего максимального элемента из данного набора и вывести их в указанном порядке.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целое число: ");
        int N = scanner.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < array.length; i++){
            array[i] = i+1;
        }
        System.out.println(Arrays.toString(array));
        int max = array[0];
        int min = array[0];
        int minIndex=0;
        int maxIndex=0;
        for (int i = 1; i < array.length; i++){
            if (array[i]<min && minIndex==0){
                min = array[i];
                minIndex=i;
            }
            if (array[i]>=max && i== array.length-1){
                max = array[i];
                maxIndex=i;
            }
        }
        System.out.println("Минимальный/первый/ элемент из данного набора : "+min+",номер: "+minIndex);
        System.out.println("Максимальный/последний/ элемент из данного набора : "+max+",номер: "+maxIndex);
    }
}
