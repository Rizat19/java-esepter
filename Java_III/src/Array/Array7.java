package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array7 {
    public static void main(String[] args) {
        //Дан массив размера N. Вывести его элементы в обратном порядке.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число(N > 0: ");
        int N = scanner.nextInt();
        if (N>0){
            int[] array = new int[N];
            System.out.println("Массив: ");
            //инициализация
            for (int i = 0; i < array.length; i++){
                array[i]=i;
                System.out.print(array[i]+" ");
            }
            //Вывести его элементы в обратном порядке.

            System.out.println("\nМассив в обратном порядке: ");
            for (int i = array.length-1; i >= 0; i--){
                System.out.print(array[i]+" ");
            }
        }else{
            System.out.println("Пожалуйста, Введите целое число(N > 0)!!!");
        }
    }
}
