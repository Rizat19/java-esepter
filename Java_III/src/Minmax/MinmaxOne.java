package Minmax;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

/*Дано целое число N и набор из N чисел.
 Найти минимальный и максимальный из элементов данного набора и вывести их в указанном порядке.
 */
public class MinmaxOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SecureRandom random = new SecureRandom();

        System.out.println("Введите целое число: ");
        int N = scanner.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(15);
        }
        System.out.println(Arrays.toString(array));
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++){
            if (array[i]<min){
                min = array[i];
            }
            if (array[i]>max){
                max = array[i];
            }
        }
        System.out.println("Минимальный элемент из данного набора : "+min);
        System.out.println("Максимальный элемент из данного набора : "+max);
    }
}
