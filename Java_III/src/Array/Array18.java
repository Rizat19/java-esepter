package Array;


import java.util.Arrays;
import java.util.Scanner;

public class Array18 {
    public static void main(String[] args) {
        //Дан массив A ненулевых целых чисел размера 10.
        // Вывести значение первого из тех его элементов AK,
        // которые удовлетворяют неравенству AK < A10. Если таких элементов нет, то вывести 0.
        Scanner scanner = new Scanner(System.in);
        int N = 10;
        int[] array = new int[N];
        System.out.println("Массив: ");
        //инициализация
        for (int i = 0; i < array.length; i++){
            System.out.print(i+"-элемент: ");
            array[i]= scanner.nextInt();
        }
        System.out.println();
        System.out.println(Arrays.toString(array));

        int k= 0;
        while (k<10){
            if (array[k] < array[array.length-1]){
                System.out.print(array[k]);
                break;
            }
            k++;
        }
        if (k==10){
            System.out.print(0);
        }


    }
}
