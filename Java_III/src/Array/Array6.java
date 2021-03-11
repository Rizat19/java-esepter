package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array6 {
    public static void main(String[] args) {
        //Даны целые числа N > 2, A и B. Сформировать и вывести
        // целочисленный массив размера N, первый элемент которого равен A,
        // второй равен B, а каждый последующий элемент равен сумме всех предыдущих.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число(N > 2: ");
        int N = scanner.nextInt();
        System.out.println("Первый элемент массива(A): ");
        int A = scanner.nextInt();
        System.out.println("Второй элемент массива(В): ");
        int B = scanner.nextInt();
        if (N>2){
            int[] array = new int[N];
            array[0]=A;
            array[1]=B;
            for (int i = 2; i < array.length; i++){
                array[i]=0;
                for (int j=0; j<i;j++){
                    array[i]+=array[j];
                }
            }
            System.out.println(Arrays.toString(array));
        }else{
            System.out.println("Пожалуйста, Введите целое число(N > 2)!!!");
        }
    }
}
