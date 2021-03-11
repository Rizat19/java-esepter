package Array;

import java.util.Scanner;

public class Array16 {
    public static void main(String[] args) {
        //Дан массив A размера N. Вывести его элементы в следующем порядке: A1, AN, A2, AN-1, A3, AN-2, … .
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
            //Делим размер массива на 2, и рассмотрим элементы из начало/конца
            for (int i = 0; i < array.length/2; i++){
                System.out.print(array[i]+" "+array[array.length-i-1]+" ");
            }
            // когда N - нечетное
            if (array.length%2!=0){
                System.out.print(array[array.length/2]);
            }
        }else{
            System.out.println("Пожалуйста, Введите целое число(N > 0)!!!");
        }
    }
}
