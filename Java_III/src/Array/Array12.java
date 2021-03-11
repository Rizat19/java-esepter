package Array;

import java.util.Scanner;

public class Array12 {
    public static void main(String[] args) {
        //Дан массив A размера N (N − четное число). Вывести его элементы
        // с четными номерами в порядке возрастания номеров: A2, A4, A6, …, AN. Условный оператор не использовать.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число(N − четное число): ");
        int N = scanner.nextInt();
        if (N>0 & N%2==0){
            int[] array = new int[N];
            System.out.println("Массив: ");
            //инициализация
            for (int i = 0; i < array.length; i++){
                array[i]=i;
                System.out.print(array[i]+" ");
            }
            System.out.println("\nЭлементы массива с четными номерами в порядке возрастания номеров(нумерация начинается с 0!): ");
            for (int i = 2; i < array.length; i+=2){
                System.out.print(array[i]+" ");
            }
        }else{
            System.out.println("Пожалуйста, Введите целое число(N − четное число)!!!");
        }
    }
}
