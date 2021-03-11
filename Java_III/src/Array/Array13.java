package Array;

import java.util.Scanner;

public class Array13 {
    public static void main(String[] args) {
        //Дан массив A размера N (N − нечетное число). Вывести его элементы с нечетными номерами
        // в порядке убывания номеров: AN, AN-2, AN-4, …, A1. Условный оператор не использовать.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число(N − нечетное число): ");
        int N = scanner.nextInt();
        if (N>0 & N%2!=0){
            int[] array = new int[N];
            System.out.println("Массив: ");
            //инициализация
            for (int i = 0; i < array.length; i++){
                array[i]=i+1;
                System.out.println("array["+i+"]: "+array[i]);
            }
            System.out.println("\nЭлементы массива с нечетными номерами в порядке убывания номеров(нумерация начинается с 0!): ");
            for (int i = array.length-2; i > 0; i-=2){
                System.out.print(array[i]+" ");
            }
        }else{
            System.out.println("Пожалуйста, Введите целое число(N − нечетное число)!!!");
        }
    }
}
