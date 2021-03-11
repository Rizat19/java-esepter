package Array;


public class Array19 {
    public static void main(String[] args) {
        //Дан целочисленный массив A размера 10. Вывести порядковый номер
        // последнего из тех его элементов AK, которые удовлетворяют двойному неравенству A1 < AK < A10.
        // Если таких элементов нет, то вывести 0.

        int N=10;

        int[] array = new int[N];
        System.out.println("Массив: ");
        //инициализация
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            System.out.println("array[" + i + "]: " + array[i]);
        }
        System.out.println();

        int k=9;
        while((array[0]>=array[k]) || (array[k]>=array[9]) && (k>0)){
            k--;
        }
        if (k==0){
            System.out.println(0);
        }else {
            System.out.println("Порядковый номер последнего из тех его элементов AK, которые удовлетворяют двойному неравенству A1 < AK < A10: "+k);
        }

    }
}
