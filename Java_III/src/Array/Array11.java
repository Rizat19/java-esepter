package Array;

import java.util.Scanner;

public class Array11 {
    public static void main(String[] args) {
        //Дан массив A размера N и целое число K (1 ≤ K ≤ N).
        // Вывести элементы массива с порядковыми номерами, кратными K: A(K), A(2*K), A(3*K), … .
        // Условный оператор не использовать.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число(K >= 1): ");
        int K = scanner.nextInt();
        System.out.println("Введите целое число(1 ≤ K ≤ N): ");
        int N = scanner.nextInt();
        if (1 <= K && K <= N){
            int[] array = new int[N];
            System.out.println("Массив: ");
            //инициализация
            for (int i = 0; i < array.length; i++){
                array[i]=i+1;
                System.out.print(array[i]+" ");
            }
            System.out.println("\nЭлементы массива с порядковыми номерами, кратными K="+K+":");
            // Вывести элементы массива с порядковыми номерами, кратными K: A(K), A(2*K), A(3*K)...
            for (int i = 0; i < array.length; i+=K){
                System.out.println("Индекс: "+i+"\tЭлемент: "+array[i]);
            }
        }else{
            System.out.println("Пожалуйста, Введите целое число(1 ≤ K ≤ N)!!!");
        }
    }
}
