package Array;

import java.util.Scanner;

public class Array9 {
    public static void main(String[] args) {
        //Дан целочисленный массив размера N. Вывести все содержащиеся
        // в данном массиве четные числа в порядке убывания их индексов, а также их количество K.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число(N > 0): ");
        int N = scanner.nextInt();
        int k=0;
        if (N>0){
            int[] array = new int[N];
            System.out.println("Массив: ");
            //инициализация
            for (int i = 0; i < array.length; i++){
                array[i]=i+1;
                System.out.print(array[i]+" ");
            }
            System.out.println("\nЧетные числа в порядке убывания их индексов: ");
            for (int i = array.length; i > 0; i--) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                    k++;
                }
            }
            System.out.println("\nКоличество четных чисел: "+k);

        }else{
            System.out.println("Пожалуйста, Введите целое число(N > 0)!!!");
        }
    }
}
