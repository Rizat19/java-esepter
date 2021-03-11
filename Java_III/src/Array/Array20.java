package Array;

import java.util.Scanner;

public class Array20 {
    public static void main(String[] args) {
        //Дан массив размера N и целые числа K и L (1 ≤ K ≤ L ≤ N).
        // Найти сумму элементов массива с номерами от K до L включительно.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число(1 ≤ K ): ");
        int K = scanner.nextInt();
        System.out.println("Введите целое число(K ≤ L ): ");
        int L = scanner.nextInt();
        System.out.println("Введите целое число( L ≤ N): ");
        int N = scanner.nextInt();
        if (1 <= K && K <= L && L <= N){
            int[] array = new int[N];
            System.out.println("Массив: ");
            //инициализация
            for (int i = 0; i < array.length; i++){
                array[i]=i+1;
                System.out.println("array["+i+"]: "+array[i]);
            }
            System.out.println();
            int sum=0;
            System.out.println("Элементы массива с номерами от K:"+K+", до L:"+L+" включительно");
            for (int i = K; i < L+1; i++){
                System.out.print(array[i]+" ");
                sum+=array[i];
            }
            System.out.println("\nСумма элементов массива с номерами от K до L включительно:"+sum);

        }else{
            System.out.println("Пожалуйста, Введите целое число(1 ≤ K ≤ L ≤ N)!!!");
        }
    }
}
