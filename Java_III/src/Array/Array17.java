package Array;

import java.util.Scanner;

public class Array17 {
    public static void main(String[] args) {
        //Дан массив A размера N. Вывести его элементы в следующем порядке: A1, A2, AN, AN-1, A3, A4, AN-2, AN-3, … .
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число(N > 0): ");
        int N = scanner.nextInt();
        if (N>0){
            int[] array = new int[N];
            System.out.println("Массив: ");
            //инициализация
            for (int i = 0; i < array.length; i++){
                array[i]=i+1;
                System.out.println("array["+i+"]: "+array[i]);
            }
            System.out.println();
            for (int i = 0; i < array.length/2+1; i+=2){
                System.out.print(array[i]+" ");
                if (i < array.length/2){
                    System.out.print(array[i+1]+" ");
                }
                if (array.length-i-1 > array.length/2){
                    System.out.print(array[array.length-i-1]+" ");
                }
                if (array.length-i-2 > array.length/2){
                    System.out.print(array[array.length-i-2]+" ");
                }
            }
        }else{
            System.out.println("Пожалуйста, Введите целое число(N > 0)!!!");
        }
    }
}
