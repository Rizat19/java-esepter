package Array;

import java.util.Scanner;

public class Array14 {
    public static void main(String[] args) {
        //Дан массив A размера N. Вывести вначале его элементы с четными номерами
        // (в порядке возрастания номеров), а затем − элементы с нечетными номерами
        // (также в порядке возрастания номеров): A2, A4, A6, …, A1, A3, A5, … . Условный оператор не использовать.

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
            //элементы с четными номерами(в порядке возрастания номеров)
            for (int i = 2; i < array.length; i+=2){
                System.out.print(array[i]+" ");
            }
            //элементы с нечетными номерами (также в порядке возрастания номеров)
            for (int i = 1; i < array.length; i+=2){
                System.out.print(array[i]+" ");
            }
        }else{
            System.out.println("Пожалуйста, Введите целое число(N > 0)!!!");
        }
    }
}
