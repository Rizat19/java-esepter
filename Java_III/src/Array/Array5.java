package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array5 {
    public static void main(String[] args) {
        //Дано целое число N > 2. Сформировать и вывести целочисленный
        // массив размера N, содержащий N первых элементов
        // последовательности чисел Фибоначчи Fk: F1=1, F2=1, Fk=Fk-2 + Fk-1,  k=3,4...
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число(N > 2: ");
        int N = scanner.nextInt();
        if (N>2){
            int[] array = new int[N];
            array[0]= 1;
            array[1]= 1;
            for (int i = 2; i < array.length; i++){
                array[i] = array[i-2]+array[i-1];
            }
            System.out.println(Arrays.toString(array));
        }else{
            System.out.println("Пожалуйста, Введите целое число(N > 2)!!!");
        }
    }
}
